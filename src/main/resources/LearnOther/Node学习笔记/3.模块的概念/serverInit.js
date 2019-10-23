/*
模块的 概念
在server.js 同一个目录下创建 serverInit.js
定义了两个函数
1. 和之前 server.js 里的请求处理函数一模一样的 service 函数
*/

function service(request, response) {
    response.writeHead(200, {'Content-Type': 'text/plain'});
    response.end('Hello serverInit');
}

// 2. 新建一个 sayHello 函数
function sayHello(){
    console.log('hello from serverInit');
}


//到目前为止 how2j.js 有两个函数了。 但是，这两个函数并不能通过外部调用，除非通过 exports 指定如何去调用他们
//3. 允许外部通过 hi() 这个函数名称调用 sayHello() 这个函数
exports.hi = sayHello;

//4. 允许外部通过 service() 同名调用
exports.service = service;


