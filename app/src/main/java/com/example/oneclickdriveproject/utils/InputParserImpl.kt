package com.example.oneclickdriveproject.utils

class InputParserImpl: InputParser  {

    override fun parse(input: String): Set<Int> {
        // Split the input string by commas into a list of substrings
        return input.split(",")
            // Map each substring to an integer, trimming whitespace and filtering out invalid numbers
            .mapNotNull {
                it.trim().toIntOrNull() }
            // Convert the list of integers to a set to ensure uniqueness
            .toSet()
    }

}