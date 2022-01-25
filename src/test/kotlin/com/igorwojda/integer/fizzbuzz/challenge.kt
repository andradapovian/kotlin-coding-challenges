package com.igorwojda.integer.fizzbuzz

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

//private fun fizzBuzz(n: Int): List<String> {
//    val list = mutableListOf<String>()
//    (1..n).forEach{nr ->
//        if ((nr%3 == 0) && (nr%5==0))
//            list.add("FizzBuzz")
//        else {
//            if (nr % 3 == 0)
//                list.add("Fizz")
//            if (nr % 5 == 0)
//                list.add("Buzz")
//        }
//        if ((nr%3 != 0) && (nr%5 != 0)){
//            list.add(nr.toString())
//        }
//    }
//    return list
//}

private fun fizzBuzz(n: Int): List<String> {
    val list = mutableListOf<String>()
    (1..n).forEach{nr ->
        when{
            (nr % 3 == 0) && (nr % 5 == 0) -> list.add("FizzBuzz")
            (nr % 3 == 0) -> list.add("Fizz")
            (nr % 5 == 0) -> list.add("Buzz")
            else -> list.add(nr.toString())
        }
    }
    return list
}

private class Test {

    @Test
    fun `Calling fizzbuzz with "5" returns list with 5 items`() {
        fizzBuzz(5) shouldBeEqualTo listOf("1", "2", "Fizz", "4", "Buzz")
    }

    @Test
    fun `Calling fizzbuzz with 15 prints out the correct values`() {

        val list = listOf(
            "1", "2", "Fizz", "4", "Buzz", "Fizz",
            "7", "8", "Fizz", "Buzz", "11", "Fizz",
            "13", "14", "FizzBuzz", "16"
        )

        fizzBuzz(16) shouldBeEqualTo list
    }
}
