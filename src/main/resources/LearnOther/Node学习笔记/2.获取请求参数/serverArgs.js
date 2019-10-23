var http = require("http");// 引入http模块
var url = require("url")//引入URL的模块 帮助解析
var querystring = require("querystring");// 引入 querystring模块，也是帮助解析用的

function service(request,response){
	//获取返回的url对象的query属性值
    var arg = url.parse(request.url).query;

    //将arg参数字符串反序列化为一个对象
    var params = querystring.parse(arg);

    //请求的方式
    console.log("请求方式-" + request.method);

    //请求的url
    console.log("请求的url-" + request.url);

    //获取参数id
    console.log("id- " + params.id);

	response.writeHead(200,{"Content-Type":"text/plain"});
	response.end("success");
}

//3. 基于service函数来创建服务器
var server = http.createServer(service);

//4. 服务器监听于8088端口
server.listen(8088);
