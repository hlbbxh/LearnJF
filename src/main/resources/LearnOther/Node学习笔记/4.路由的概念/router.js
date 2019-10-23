/*
router函数第一个参数 handle 是一个 数组，第二个参数是 路径。
这个模块，乍一看会有点晕，要结合后面的模块来看
*/
function route(handle, pathname) { 
  if (typeof handle[pathname] === 'function') { 
    return handle[pathname](); 
  } else {
    return pathname + ' is not defined';
  } 
} 

exports.route = route;