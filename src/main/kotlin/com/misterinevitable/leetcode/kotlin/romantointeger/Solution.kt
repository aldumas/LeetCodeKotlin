package com.misterinevitable.leetcode.kotlin.romantointeger

fun String.romanToInt() =
    map { it.romanToInt() }
        .zipWithNext { first, second ->
            if (first < second) -first else first
        }
        .sum() + last().romanToInt()

fun Char.romanToInt() =
    when (this) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> error("Not a supported Roman character: $this")
    }
