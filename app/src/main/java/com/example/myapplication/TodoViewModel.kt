package com.example.myapplication

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodoViewModel: ViewModel() {

    private val _todos = MutableLiveData <List<Todo>>()
     val todos : LiveData <List<Todo>> = _todos


    fun getAllTodos() {
    _todos.value = TodoManger.getAllTodos()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(title:String){
        TodoManger.addTodo(title)
        getAllTodos()

    }

    fun deleteTodo(id:Int){
        TodoManger.deleteTodo(id)
        getAllTodos()
    }
}