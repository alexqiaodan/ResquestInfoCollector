$(function () {
    var search = $("#search-btn");
    search.click(function () {
        var deviceID = $("#deviceID");
        var user = $("#user");
        var clientIp = $("#clientIp");
        var hostIp = $("#hostIp");
        var host = $("#host");
        var requestUrl = $("#requestUrl");
        var responseCode = $("#naresponseCodeme");
        search.submit();
    })
});
