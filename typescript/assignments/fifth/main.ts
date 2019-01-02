import { TodoItemInterface,TodoListInterface } from "./interfaces";
export class ToDoItem implements TodoItemInterface{
    title:string;
    status:boolean;
    updatedAt:Date;
    constructor(title:string){
        this.title=title;
        this.updatedAt=new Date();
        this.status=false;
    }
    toggleStatus(){
        if(this.status==false){
            this.status=true
        }else{
            this.status=false
        }
    }

}

class ToDoList implements TodoListInterface{

    toDoItems:ToDoItem[]=[];
    addTask(title:string){
        var todoitem=new ToDoItem(title);
        this.toDoItems[this.toDoItems.length]=todoitem;
        return " =========== NEW TASK ===========\n" + "Task :'" + title + "' inserted in the list\n" + "Number of items:" + this.toDoItems.length + "\n";
    }
    listAllTasks(){
        this.toDoItems.forEach(element => {
            console.log(element.title+"\n"+element.updatedAt+"\n");   
           });
    }
    deleteTask(title:string){
        var length=this.toDoItems.length;
        for( var i = 0; i < length; i++){ 
            if ( this.toDoItems[i].title === title) {
                this.toDoItems.splice(i, 1); 
                break;
            }
         }
         console.log("=========== TASK REMOVED ===========\nTask "+title+" removed from the list\nNumber of items: "+this.toDoItems.length);
    }
}

var main = new ToDoList();
console.log(main.addTask("Buy Egg"));
console.log(main.addTask("Buy Milk"));
console.log(main.addTask("Buy Masala"));
console.log(main.addTask("Buy Bear"));
main.listAllTasks();
main.deleteTask("Buy Egg");
