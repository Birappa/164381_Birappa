"use strict";
exports.__esModule = true;
var ToDoItem = /** @class */ (function () {
    function ToDoItem(title) {
        this.title = title;
        this.updatedAt = new Date();
        this.status = false;
    }
    ToDoItem.prototype.toggleStatus = function () {
        if (this.status == false) {
            this.status = true;
        }
        else {
            this.status = false;
        }
    };
    return ToDoItem;
}());
exports.ToDoItem = ToDoItem;
var ToDoList = /** @class */ (function () {
    function ToDoList() {
        this.toDoItems = [];
    }
    ToDoList.prototype.addTask = function (title) {
        var todoitem = new ToDoItem(title);
        this.toDoItems[this.toDoItems.length] = todoitem;
        return " =========== NEW TASK ===========\n" + "Task :'" + title + "' inserted in the list\n" + "Number of items:" + this.toDoItems.length + "\n";
    };
    ToDoList.prototype.listAllTasks = function () {
        this.toDoItems.forEach(function (element) {
            console.log(element.title + "\n" + element.updatedAt + "\n");
        });
    };
    ToDoList.prototype.deleteTask = function (title) {
        var length = this.toDoItems.length;
        for (var i = 0; i < length; i++) {
            if (this.toDoItems[i].title === title) {
                this.toDoItems.splice(i, 1);
                break;
            }
        }
        console.log("=========== TASK REMOVED ===========\nTask " + title + " removed from the list\nNumber of items: " + this.toDoItems.length);
    };
    return ToDoList;
}());
var main = new ToDoList();
console.log(main.addTask("Buy Egg"));
console.log(main.addTask("Buy Milk"));
console.log(main.addTask("Buy Masala"));
console.log(main.addTask("Buy Bear"));
main.listAllTasks();
main.deleteTask("Buy Egg");
