var express=require('express');
var app=express();

app.get('/get',function(req,res){
var name=req.query.name;
res.send(name);
});

var server=app.listen(8080,function(){
console.log("server is running");
});