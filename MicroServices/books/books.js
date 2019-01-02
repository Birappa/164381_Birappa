const express=require("express");
var app = express();
const mongoose=require("mongoose");
const bodyParser=require("body-parser");
app.use(bodyParser.json());

mongoose.connect("mongodb://localhost/myservices",()=>{
console.log("database is connected");
});

require("./Book");
const Book=mongoose.model("Book");
app.post("/book",(req, res)=>{

    var newBook={
        title:req.body.title,
        author: req.body.author,
        numberOfPages:req.body.numberOfPages,
        publisher:req.body.publisher
    }

    var book=new Book(newBook);
    book.save().then(()=>{
        console.log("New Book is created");
    }).catch((err)=>{
        if(err){
            throw err;
        }
    });
res.send("new Prathyusha idiot is created");
});

app.get("/books",(req,res)=>{
    Book.find().then((books)=>{
        res.json(books);
    }).catch(err=>{
        if(err){
            throw err;
        }
    })
})

app.get("/book/:id",(req,res)=>{

    Book.findById(req.params.id).then((book)=>{
        if(book){
            res.json(book);
        }else{
            res.statusCode(404);
        }
    })

})

app.delete("/book/:id",(req,res)=>{
    Book.findOneAndRemove(req.params.id).then(()=>{
        res.send("Book removed successfully");
    }).catch(err=>{
        if(err){
            throw err;
        }
    })
})

app.listen(8080,()=>{
console.log("Server is Running!!");
});