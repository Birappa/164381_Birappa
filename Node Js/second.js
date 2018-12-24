const http=require('http');
const path=require('path');
const url=require('url');
const fs=require('fs');

const mimeType={
	"html":"text/html",
	"jpeg":"image/jpeg",
	"jpg":"image/jpg",
	"png":"image/png",
	"js":"text/javascript",
	"css":"text/css"
};

	http.createServer(function(req,res){

		var uri=url.parse(req.url).pathname;
		var fileName=path.join(process.cwd(),unescape(uri));
		console.log('Loading'+uri);
		var stats;
		 try{
			stats=fs.lstatSync(fileName);
		}catch(e){
 			res.writeHead(404,{'content-type':'text/plain'});
			res.write('404 Not Found\n');
			res.end();
			return;
		}

	if(stats.isFile()){
		var mimeTpye=mimeType[path.extname(fileName).split(".").reverse()[0]];
		res.writeHead(200,{'content-type':mimeType});

		var fileStream=fs.createReadStream(fileName);
		fileStream.pipe(res);
	}else if(stats.isDirectory()){
		res.writeHead(302,{'Location':'index.html'});
		res.end();
	}else{
		res.writeHead(500,{'Content-type':'text/plain'});
		res.write('500 Internal Error');
	res.end();

	}
}).listen(1337);