package com.igorwojda.integer.factorial

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

tailrec fun factorialTailRec(n: Int, fact: Int = 1): Int {
    return if (n <= 1) fact
    else
        factorialTailRec(n - 1, fact * n)
}

fun factorialClassicRec(n: Int): Int {
    return if (n < 1)
        1
    else
        n * factorialClassicRec(n - 1)
}

private fun factorial(n: Int): Int {
    return (1..n).fold(1) { fact, elem ->
        fact * elem
    }
}

class RecursiveFactorial {
    @Test
    fun `factorial 0 should equal 1`() {
        factorial(0) shouldBeEqualTo 1
    }

    @Test
    fun `factorial 3 should equal 6`() {
        factorial(3) shouldBeEqualTo 6
    }

    @Test
    fun `factorial 5 should equal 120`() {
        factorial(5) shouldBeEqualTo 120
    }

    @Test
    fun `factorial 10 should equal 3628800`() {
        val time = measureNanoTime {
            factorial(10) shouldBeEqualTo 3628800
        }
        println("factorial: $time nano")

    }

    @Test
    fun `factorial2 10 should equal 3628800`() {
        val time = measureNanoTime {
            factorialTailRec(10) shouldBeEqualTo 3628800
        }
        println("factorialTailRec: $time nano")

    }

    @Test
    fun `factorial3 10 should equal 3628800`() {
        val time = measureNanoTime {
            factorialClassicRec(10) shouldBeEqualTo 3628800
        }
        println("factorialClassicRec: $time nano")
    }
}
