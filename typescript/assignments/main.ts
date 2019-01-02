import { ToDoInterface } from "./todointerface";
class Main implements ToDoInterface{
    todoList:string[]=[];
    addTask(task:string){
        this.todoList[this.todoList.length]=task;
        var length=this.todoList.length;
        console.log(" =========== NEW TASK ===========\n"+"Task :'"+task+"' inserted in the list\n"+"Number of items:"+length+"\n");
    }

    listAllTask(){
        this.todoList.forEach(element => {
         console.log(element);   
        });
    }

    deleteTask(task:string){
       var length=this.todoList.length;
        for( var i = 0; i < length; i++){ 
            if ( this.todoList[i] === task) {
                this.todoList.splice(i, 1); 
                break;
            }
         }
         console.log("=========== TASK REMOVED ===========\nTask "+task+" removed from the list\nNumber of items: "+this.todoList.length);
    }

    
}

var main = new Main();
main.addTask("Buy Egg");
main.addTask("Buy Milk");
main.addTask("Buy Masala");
main.addTask("Buy Bear");
main.listAllTask();
main.deleteTask("Buy Egg");
