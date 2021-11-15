package com.example.recruitment_examination_calc

import com.example.recruitment_examination_calc.logic.CalcExecute
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, CalcExecute.twoItemsCalc(2, 2, "+"))
    }

    @Test
    fun subtraction_isCorrect() {
        assertEquals(0, CalcExecute.twoItemsCalc(2, 2, "-"))
    }

    @Test
    fun multiplication_isCorrect() {
        assertEquals(4, CalcExecute.twoItemsCalc(2, 2, "*"))
    }

    @Test
    fun division_isCorrect() {
        assertEquals(1, CalcExecute.twoItemsCalc(2, 2, "/"))
    }
}