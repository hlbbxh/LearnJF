var http = require("http");// 引入http模块
var serverInit = require('./serverInit');//引入自己定义的 serverInit.js 

serverInit.hi();//调用


//3. 基于serverInit函数来创建服务器
var server = http.createServer(serverInit.service);

//4. 服务器监听于8088端口
server.listen(8088);
