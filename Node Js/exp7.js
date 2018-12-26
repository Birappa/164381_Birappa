var express=require('express');
const bodyParser = require("body-parser");
var app=express();
app.use(bodyParser.urlencoded({
    extended: true
}));

app.use(bodyParser.json());
var items=[];

app.get('/shoppingForm', function (req, res) {
   res.sendFile( __dirname + "/" + "shoppingForm.html" );
})

app.post('/items',function(req,res){
var item={id:req.body.id,
	  name:req.body.name,
	  price:req.body.price};
items.push(item);
//res.send(items);

 res.redirect('/shoppingForm');
});

app.get('/items',function(req,res){
res.send(items);
});

app.patch('/items/:id',function(req,res){
//res.send("patch is called");
var obj=items[req.query.id];
obj[name]=req.query.name;
obj[price]=req.query.price;
res.send(items);
});

app.listen(8080,function(){
console.log("server is running");
});