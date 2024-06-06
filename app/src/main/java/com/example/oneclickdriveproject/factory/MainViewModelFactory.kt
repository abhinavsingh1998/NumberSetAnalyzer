package com.example.oneclickdriveproject.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.oneclickdriveproject.utils.Calculator
import com.example.oneclickdriveproject.utils.InputParser
import com.example.oneclickdriveproject.viewmodel.MainViewModel

class MainViewModelFactory(
    private val inputParser: InputParser,
    private val calculator: Calculator
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return MainViewModel(inputParser, calculator) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}