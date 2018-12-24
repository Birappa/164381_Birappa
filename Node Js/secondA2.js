var fs = require ('fs'); 
var nameFile = process.argv[2] ; 

fs.readFile(nameFile, 'utf8', function(err, contentFile) {   
     if (err) throw err; 
     console.log(contentFile); 
 }); 
