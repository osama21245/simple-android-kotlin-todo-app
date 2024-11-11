package com.example.myapplication

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

object TodoManger {
    private val todos = mutableListOf<Todo>()

    fun getAllTodos() : List<Todo>{
return todos
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(title:String){
todos.add(Todo(System.currentTimeMillis().toInt(),title, Date.from(Instant.now())))

    }

    fun deleteTodo(id:Int){
   todos.removeIf {
       it.id == id
   }
    }
}
