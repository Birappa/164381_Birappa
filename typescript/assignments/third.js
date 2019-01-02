var ToDoList = /** @class */ (function () {
    function ToDoList() {
        this.todoList = [];
    }
    ToDoList.prototype.addTask = function (task) {
        length: Number;
        this.todoList[this.todoList.length] = task;
        length = this.todoList.length;
        console.log(" =========== NEW TASK ===========\n" + "Task :'" + task + "' inserted in the list\n" + "Number of items:" + length + "\n");
    };
    ToDoList.prototype.listAllTask = function () {
        this.todoList.forEach(function (element) {
            console.log(element);
        });
    };
    ToDoList.prototype.deleteTask = function (task) {
        length = this.todoList.length;
        for (var i = 0; i < length; i++) {
            if (this.todoList[i] === task) {
                this.todoList.splice(i, 1);
                break;
            }
        }
        console.log("=========== TASK REMOVED ===========\nTask " + task + " removed from the list\nNumber of items: " + this.todoList.length);
    };
    return ToDoList;
}());
var toDoList = new ToDoList();
toDoList.addTask("Buy Egg");
toDoList.addTask("Buy Milk");
toDoList.addTask("Buy Masala");
toDoList.addTask("Buy Bear");
toDoList.listAllTask();
toDoList.deleteTask("Buy Egg");
