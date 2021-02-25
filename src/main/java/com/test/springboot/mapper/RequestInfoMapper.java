package com.test.springboot.mapper;

import com.test.springboot.entity.RequestInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RequestInfoMapper {

    @Insert("INSERT INTO `lofter_qa_backend`.`RequestInfo` " +
            "(`DeviceID`, `User`, `ClientIp`, `HostIp`, `Host`, `RequestUrl`, `ResponseCode`, `TimeCost`, `Curl`, `UploadTime`, `CreateTime`) " +
            " values(#{deviceID},#{user},#{clientIp},#{hostIp},#{host},#{requestUrl},#{responseCode},#{timeCost},#{curl},#{uploadTime},#{createTime});")
    Integer insert(
                   @Param("deviceID") String deviceID,
                   @Param("user") String user,
                   @Param("clientIp") String clientIp,
                   @Param("hostIp") String hostIp,
                   @Param("host") String host,
                   @Param("requestUrl") String requestUrl,
                   @Param("responseCode") String responseCode,
                   @Param("timeCost") Integer timeCost,
                   @Param("curl") String curl,
                   @Param("uploadTime") Long uploadTime,
                   @Param("createTime") Long createTime);

    @Select("<script> " +
            "select * from `lofter_qa_backend`.`RequestInfo`  where 1=1 " +
            "<if test=\"deviceID != 'null' and deviceID != null\">" +
            "   and DeviceID like CONCAT('%',#{deviceID},'%')" +
            "</if>" +
            "<if test=\"user != 'null' and user != null\">" +
            "   and `User` like CONCAT('%',#{user},'%')" +
            "</if>" +
            "<if test=\"clientIp != 'null' and clientIp != null\">" +
            "   and ClientIp like CONCAT('%',#{clientIp},'%')" +
            "</if>" +
            "<if test=\"hostIp != 'null' and hostIp != null\">" +
            "   and HostIp like CONCAT('%',#{hostIp},'%')" +
            "</if>" +
            "<if test=\"host != 'null' and host != null\">" +
            "   and Host like CONCAT('%',#{host},'%')" +
            "</if>" +
            "<if test=\"requestUrl != 'null' and requestUrl != null\">" +
            "   and RequestUrl like CONCAT('%',#{requestUrl},'%')" +
            "</if>" +
            "<if test=\"responseCode != 'null' and responseCode != null\">" +
            "   and ResponseCode like CONCAT('%',#{responseCode},'%')" +
            "</if>" +
            "<if test=\"curl != 'null' and curl != null\">" +
            "   and Curl like CONCAT('%',#{curl},'%')" +
            "</if>" +
            "<if test=\"timeCost != null and timeCost > 0\">" +
            "   and TimeCost &gt; #{timeCost}" +
            "</if>" +
            "<if test=\"uploadTimeStart != null and uploadTimeEnd != null and uploadTimeStart > 0 and uploadTimeEnd > 0\">" +
            "   and UploadTime &gt; #{uploadTimeStart} and UploadTime &lt; #{uploadTimeEnd}" +
            "</if>" +
            " order by ID desc" +
            "<if test=\"limit != 0\">" +
            "   limit #{limit}" +
            "</if>" +
            "<if test=\"offset != 0\">" +
            "   offset #{offset}" +
            "</if>" +


            "</script> ")
    List<RequestInfo> queryByContidions(@Param("deviceID") String deviceID,
                                        @Param("user") String user,
                                        @Param("clientIp") String clientIp,
                                        @Param("hostIp") String hostIp,
                                        @Param("host") String host,
                                        @Param("requestUrl") String requestUrl,
                                        @Param("responseCode") String responseCode,
                                        @Param("timeCost") int timeCost,
                                        @Param("curl") String curl,
                                        @Param("uploadTimeStart") Long uploadTimeStart,
                                        @Param("uploadTimeEnd") Long uploadTimeEnd,
                                        @Param("limit") int limit,
                                        @Param("offset") int offset);


    @Select("<script> " +
            "select count(*) from `lofter_qa_backend`.`RequestInfo`  where 1=1 " +
            "<if test=\"deviceID != 'null' and deviceID != null\">" +
            "   and DeviceID like CONCAT('%',#{deviceID},'%')" +
            "</if>" +
            "<if test=\"user != 'null' and user != null\">" +
            "   and `User` like CONCAT('%',#{user},'%')" +
            "</if>" +
            "<if test=\"clientIp != 'null' and clientIp != null\">" +
            "   and ClientIp like CONCAT('%',#{clientIp},'%')" +
            "</if>" +
            "<if test=\"hostIp != 'null' and hostIp != null\">" +
            "   and HostIp like CONCAT('%',#{hostIp},'%')" +
            "</if>" +
            "<if test=\"host != 'null' and host != null\">" +
            "   and Host like CONCAT('%',#{host},'%')" +
            "</if>" +
            "<if test=\"requestUrl != 'null' and requestUrl != null\">" +
            "   and RequestUrl like CONCAT('%',#{requestUrl},'%')" +
            "</if>" +
            "<if test=\"responseCode != 'null' and responseCode != null\">" +
            "   and ResponseCode like CONCAT('%',#{responseCode},'%')" +
            "</if>" +
            "<if test=\"curl != 'null' and curl != null\">" +
            "   and Curl like CONCAT('%',#{curl},'%')" +
            "</if>" +
            "<if test=\"timeCost != null and timeCost > 0\">" +
            "   and TimeCost &gt; #{timeCost}" +
            "</if>" +
            "<if test=\"uploadTimeStart != null and uploadTimeEnd != null and uploadTimeStart > 0 and uploadTimeEnd > 0\">" +
            "   and UploadTime &gt; #{uploadTimeStart} and UploadTime &lt; #{uploadTimeEnd}" +
            "</if>" +
            "</script> ")
    int selectCount(@Param("deviceID") String deviceID,
                    @Param("user") String user,
                    @Param("clientIp") String clientIp,
                    @Param("hostIp") String hostIp,
                    @Param("host") String host,
                    @Param("requestUrl") String requestUrl,
                    @Param("responseCode") String responseCode,
                    @Param("timeCost") int timeCost,
                    @Param("curl") String curl,
                    @Param("uploadTimeStart") Long uploadTimeStart,
                    @Param("uploadTimeEnd") Long uploadTimeEnd);
}
