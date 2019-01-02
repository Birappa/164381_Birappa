class ToDoList{
    todoList:string[]=[];
    addTask(task:string){
        length:Number;
        
        this.todoList[this.todoList.length]=task;
        length=this.todoList.length;
        console.log(" =========== NEW TASK ===========\n"+"Task :'"+task+"' inserted in the list\n"+"Number of items:"+length+"\n")
    }
    listAllTask(){
        this.todoList.forEach(element => {
         console.log(element);   
        });
    }
    deleteTask(task:string){
        length=this.todoList.length;
        for( var i = 0; i < length; i++){ 
            if ( this.todoList[i] === task) {
                this.todoList.splice(i, 1); 
                break;
            }
         }
         console.log("=========== TASK REMOVED ===========\nTask "+task+" removed from the list\nNumber of items: "+this.todoList.length);
    }

    
}

var toDoList = new ToDoList();
toDoList.addTask("Buy Egg");
toDoList.addTask("Buy Milk");
toDoList.addTask("Buy Masala");
toDoList.addTask("Buy Bear");
toDoList.listAllTask();
toDoList.deleteTask("Buy Egg");
