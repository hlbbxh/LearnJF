//这个就是启动服务器的模块，同样的。。。还是要结合后面的代码来看
var http = require("http"); 
var url = require("url"); 
   
function start(route, handle) { 
  function onRequest(request, response) { 
    var pathname = url.parse(request.url).pathname; 
    var html = route(handle, pathname); 
    response.writeHead(200, {"Content-Type": "text/plain"}); 
    response.write(html); 
    response.end(); 
  } 
  http.createServer(onRequest).listen(8088); 
} 
   
exports.start = start; 