var http = require("http");// 1.引入http模块

/*
2. 准备处理请求和响应的 service 函数，就像是 servlet 里的 doGet, doPost 方法。 
这个service函数做了两件事：
a. 设置返回代码200，以及返回格式为 text/plain
b. 返回内容是: Hello Node.js
*/
function service(request,response){
	response.writeHead(200,{"Content-Type":"text/plain"});
	response.end("Hello NodeJS");
}

//3. 基于service函数来创建服务器
var server = http.createServer(service);

//4. 服务器监听于8088端口
server.listen(8088);
