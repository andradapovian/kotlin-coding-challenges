package com.igorwojda.string.ispalindrome.permutation

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun isPermutationPalindrome(str: String): Boolean {
    var remember:Boolean=false
    for (index in 0..(str.length/2)){
        if (!str.substring(index+1).contains(str[index])){
            if (!remember)
                remember=true
            else return false
        }
    }
    return true
}

private class Test {
    @Test
    fun `"gikig" is a palindrome`() {
        isPermutationPalindrome("gikig") shouldBeEqualTo true
    }

    @Test
    fun `"ookvk" is a palindrome`() {
        isPermutationPalindrome("ookvk") shouldBeEqualTo true
    }

    @Test
    fun `"sows" is a palindrome`() {
        isPermutationPalindrome("sows") shouldBeEqualTo false
    }

    @Test
    fun `"tami" is a palindrome`() {
        isPermutationPalindrome("tami") shouldBeEqualTo false
    }
}
