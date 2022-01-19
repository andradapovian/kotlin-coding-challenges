package com.igorwojda.integer.reverse

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test
import kotlin.math.absoluteValue
import kotlin.math.sign

//private fun reverseInt(i: Int): Int {
//    var number = i
//    number=number
//    var reversed= 0
//    while(number!=0){
//        var last = i%10
//        number /= 10
//        reversed = reversed*10 +last
//    }
//    return reversed
//}

private fun reverseInt(i: Int): Int{
    var number=i.absoluteValue

    if(number<0) {
        number *= -1

    }
    var reverse = number.toString().reversed()
    return reverse.toInt() * i.sign
}

private class Test {
    @Test
    fun `ReverseInt handles 0 as an input`() {
        reverseInt(0) shouldBeEqualTo 0
    }

    @Test
    fun `ReverseInt flips a positive number`() {
        reverseInt(5) shouldBeEqualTo 5
        reverseInt(15) shouldBeEqualTo 51
        reverseInt(90) shouldBeEqualTo 9
        reverseInt(700) shouldBeEqualTo 7
        reverseInt(2359) shouldBeEqualTo 9532
    }

    @Test
    fun `ReverseInt flips a negative number`() {
        reverseInt(-5) shouldBeEqualTo -5
        reverseInt(-15) shouldBeEqualTo -51
        reverseInt(-90) shouldBeEqualTo -9
        reverseInt(-700) shouldBeEqualTo -7
        reverseInt(-2359) shouldBeEqualTo -9532
    }
}
