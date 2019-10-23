/*
与以往启动使用 server.js不同，带路由功能，一般都会通过 index.js 启动，所以index.js 就是入口模块。
handle 是一个数组，映射了不同的访问路径与 业务处理模块对应函数的一一对应关系。
*/

// 这就表示访问路径 /listCategory的话，就会交给函数 requestHandlers.listCategory 来处理。
var server = require("./server"); 
var router = require("./router"); 
var requestHandlers = require("./requestHandlers"); 
 
var handle = {} 
handle["/listCategory"] = requestHandlers.listCategory; 
handle["/listProduct"] = requestHandlers.listProduct; 
   
server.start(router.route, handle); 


/*
1. 通过如下方式启动服务器 node index.js
2. index.js 调用了 server.start 函数，并且传递了 router.js 里route 函数和handle数组作为参数
3. serverl.js 通过了8088端口启动了服务。 然后用 onRequest 函数来处理业务
3.1 在 onRequest 中，首先获取 访问路径 pathname
3.2 然后调用 router.js 的route 函数，并把pathname 和 handle数组传递进去
4. 在router.js 中，通过pathname为下标获调用真正的业务函数，并把业务函数的返回值返回出去。
4.1 如果找不到，比如访问 /listUser 这个路径就没有在 handle 数组中找到对应，那么就会返回 listUser is not defined.
5. 当访问地址是 /listCategory的时候， 真正的业务函数 requestHandlers.js 中的 listCategory() 就会被调用，并返回业务 Html 代码 : "a lots of categorys".

通过以上的方式，最后就落实在了 requestHandlers.js 的业务代码上面了。
虽然看上去略复杂，但是以后如果要开发新的功能，比如 /listUser, 那么就只需要新增加 listUser 函数，并在 index.js 中对他进行映射即可了。

http://localhost:8088/listCategory
http://localhost:8088/listProduct

*/