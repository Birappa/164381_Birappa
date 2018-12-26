var express = require('express');
var app     = express();
app.get('/myaction', function(req, res) {
  res.send('Hello world from express framework');
});

app.listen(8080, function() {
  console.log('Server running at http://127.0.0.1:8080/');
});