var Circle = /** @class */ (function () {
    function Circle(radius, color) {
        this.color = color;
        this.radius = radius;
    }
    Circle.prototype.area = function () {
        return 3.14159 * this.radius * this.radius;
    };
    Circle.prototype.toString = function () {
        return "Circle - " + this.area() + " - " + this.color;
    };
    return Circle;
}());
var Rectangle = /** @class */ (function () {
    function Rectangle(width, height, color) {
        this.color = color;
        this.width = width;
        this.height = height;
    }
    Rectangle.prototype.area = function () {
        return this.width * this.height;
    };
    Rectangle.prototype.toString = function () {
        return "Rectangle - " + this.area() + " - " + this.color;
    };
    return Rectangle;
}());
var circle = new Circle(5, "Green");
console.log(circle.toString());
var rectangle = new Rectangle(5, 6, "Black");
console.log(rectangle.toString());
