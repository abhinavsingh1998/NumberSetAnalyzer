package com.example.oneclickdriveproject.utils

class CalculatorImpl : Calculator {
    override fun intersect(set1: Set<Int>, set2: Set<Int>, set3: Set<Int>): Set<Int> {
        val result = mutableSetOf<Int>()
        for (item in set1) {
            if (item in set2 && item in set3) {
                result.add(item)
            }
        }
        return result

    }

    override fun union(set1: Set<Int>, set2: Set<Int>, set3: Set<Int>): Set<Int> {
        val result = mutableSetOf<Int>().apply {
            addAll(set1)
            addAll(set2)
            addAll(set3)
        }
        return result
    }

    override fun findMaxNumber(set: Set<Int>): Int? {
        var maxNumber: Int? = null
        for (item in set) {
            if (maxNumber == null || item > maxNumber) {
                maxNumber = item
            }
        }
        return maxNumber
    }
}