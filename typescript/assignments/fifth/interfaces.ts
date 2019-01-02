import { ToDoItem } from "./main";
export interface TodoItemInterface{
    title:string;
    status:boolean;
    updatedAt:Date;
    toggleStatus();
}

export interface TodoListInterface{
    toDoItems:ToDoItem[];
    addTask(string);
    listAllTasks();
    deleteTask(string);

}