var express=require('express');
var app=express();

app.get('/year',function(req,res){
var year=2018-req.query.age;
res.send("You were born in "+year);
});

var server=app.listen(8080,function(){
console.log("server is running");
});