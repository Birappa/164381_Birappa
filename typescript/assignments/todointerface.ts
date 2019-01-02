export interface ToDoInterface{
    todoList:string[];
    addTask(task:string);
    listAllTask();
    deleteTask(task:string);
}