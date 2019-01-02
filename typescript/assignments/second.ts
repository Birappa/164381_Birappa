interface Shape{
    color:string
   area();
   toString();
}

class Circle implements Shape{

    color:string;
    radius:number;
    constructor(radius:number,color:string){
this.color=color;
this.radius=radius;
    }
    area(){
        return 3.14159*this.radius*this.radius;
    }

    toString(){
        return "Circle - "+this.area()+" - "+this.color;
    }
}

class Rectangle implements Shape{
    color:string
    width:number;
    height:number
    constructor(width:number,height:number,color:string){
        this.color=color;
        this.width=width;
        this.height=height;
    }
    area(){
        return this.width*this.height;
    }

    toString(){
        return "Rectangle - "+this.area()+" - "+this.color;
    }
}

var circle=new Circle(5,"Green");
console.log(circle.toString());
var rectangle=new Rectangle(5,6,"Black");
console.log(rectangle.toString());