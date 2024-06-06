package com.example.oneclickdriveproject.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.oneclickdriveproject.utils.Calculator
import com.example.oneclickdriveproject.utils.InputParser

class MainViewModel (private val inputParser: InputParser,
                     private val calculator: Calculator) : ViewModel() {

    private val _intersectResult = MutableLiveData<Set<Int>>()
    val intersectResult: LiveData<Set<Int>> = _intersectResult

    private val _unionResult = MutableLiveData<Set<Int>>()
    val unionResult: LiveData<Set<Int>> = _unionResult

    private val _maxNumber = MutableLiveData<Int?>()
    val maxNumber: LiveData<Int?> = _maxNumber

    fun calculate(input1: String, input2: String, input3: String) {
        val list1 = inputParser.parse(input1)
        val list2 = inputParser.parse(input2)
        val list3 = inputParser.parse(input3)

        _intersectResult.value = calculator.intersect(list1, list2, list3)
        _unionResult.value = calculator.union(list1, list2, list3)
        _maxNumber.value = calculator.findMaxNumber(_unionResult.value ?: emptySet())
    }
}