package com.example.oneclickdriveproject.utils

interface Calculator {
    fun intersect(set1: Set<Int>, set2: Set<Int>, set3: Set<Int>): Set<Int>
    fun union(set1: Set<Int>, set2: Set<Int>, set3: Set<Int>): Set<Int>
    fun findMaxNumber(set: Set<Int>): Int?
}