//路由的概念 相当于java的控制器 不同的请求进入不同的方法进行执行
//为了达到前面的路由效果，需要多个模块协同配合达到这个效果。 所谓的多个模块，其实就是多个.js文件里的多个函数互相配合。


// 读写添加的 新内容  在 requestHandlers.js 中新增两个函数，分别是读和写 开头要引入 fs.js 表示使用文件模块
var fs = require("fs");

// 首先是业务处理模块 ，即提供 listCategory函数和listProduct()函数
//函数 1  listCategory 
function listCategory() {          
    return "a lot of categorys";
} 
//函数 2  listProduct 
function listProduct() { 
    return "a lot of products";
} 



//读方法是
function readFile(){
	var html = fs.readFileSync('test.html');
	return html;
}

//写方法是
function writeFile(){
	fs.writeFile('test.html', 'write hyd wahahaha',(err) =>{
        if (err) throw err;
    });
	return "write successful";
}


//可以外部进行调用
exports.listCategory = listCategory;
exports.listProduct = listProduct;

//标记这两个函数 读写
exports.readFile = readFile;  
exports.writeFile = writeFile;  

