package com.ruvini.taskmanagementapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.ruvini.taskmanagementapp.model.Task
import com.ruvini.taskmanagementapp.repository.TaskRepository
import kotlinx.coroutines.launch

class TaskViewModel (app: Application, private val taskRepository: TaskRepository) : AndroidViewModel(app){
    fun addTask(task: Task) =
        viewModelScope.launch {
            taskRepository.insertTask(task)
        }
    fun updateTask(task: Task) =
        viewModelScope.launch {
            taskRepository.updateTask(task)
        }
    fun deleteTask(task: Task) =
        viewModelScope.launch {
            taskRepository.deleteTask(task)
        }
    fun getAllTasks() =
        taskRepository.getAllTasks()

    fun searchTask(query: String?) =
        taskRepository.searchTask(query)
}