"use strict";
exports.__esModule = true;
var Main = /** @class */ (function () {
    function Main() {
        this.todoList = [];
    }
    Main.prototype.addTask = function (task) {
        this.todoList[this.todoList.length] = task;
        var length = this.todoList.length;
        console.log(" =========== NEW TASK ===========\n" + "Task :'" + task + "' inserted in the list\n" + "Number of items:" + length + "\n");
    };
    Main.prototype.listAllTask = function () {
        this.todoList.forEach(function (element) {
            console.log(element);
        });
    };
    Main.prototype.deleteTask = function (task) {
        var length = this.todoList.length;
        for (var i = 0; i < length; i++) {
            if (this.todoList[i] === task) {
                this.todoList.splice(i, 1);
                break;
            }
        }
        console.log("=========== TASK REMOVED ===========\nTask " + task + " removed from the list\nNumber of items: " + this.todoList.length);
    };
    return Main;
}());
var main = new Main();
main.addTask("Buy Egg");
main.addTask("Buy Milk");
main.addTask("Buy Masala");
main.addTask("Buy Bear");
main.listAllTask();
main.deleteTask("Buy Egg");
