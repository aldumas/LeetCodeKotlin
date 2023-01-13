package com.misterinevitable.leetcode.kotlin.romantointeger

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun romanToInt() {
        val oneToTen = arrayOf("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X")
        assertArrayEquals(
            IntArray(10) { it + 1 },
            oneToTen.map { it.romanToInt() }.toIntArray()
        )

        assertEquals(11, "XI".romanToInt())
        assertEquals(14, "XIV".romanToInt())
        assertEquals(15, "XV".romanToInt())
        assertEquals(16, "XVI".romanToInt())
        assertEquals(20, "XX".romanToInt())
        assertEquals(40, "XL".romanToInt())
        assertEquals(50, "L".romanToInt())
        assertEquals(60, "LX".romanToInt())
        assertEquals(99, "XCIX".romanToInt())
        assertEquals(100, "C".romanToInt())
        assertEquals(149, "CXLIX".romanToInt())
        assertEquals(150, "CL".romanToInt())
        assertEquals(499, "CDXCIX".romanToInt())
        assertEquals(500, "D".romanToInt())
        assertEquals(701, "DCCI".romanToInt())
        assertEquals(749, "DCCXLIX".romanToInt())
        assertEquals(750, "DCCL".romanToInt())
        assertEquals(751, "DCCLI".romanToInt())
        assertEquals(999, "CMXCIX".romanToInt())
        assertEquals(1000, "M".romanToInt())
        assertEquals(2023, "MMXXIII".romanToInt())
    }
}