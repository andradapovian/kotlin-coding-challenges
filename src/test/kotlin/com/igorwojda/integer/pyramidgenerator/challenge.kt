package com.igorwojda.integer.pyramidgenerator

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

fun generatePyramid(n: Int): List<String> {

    val numColumns = (n * 2) - 1

    return (0 until n).map {
        val numHashes = (it * 2) + 1
        val numSpaces = numColumns - numHashes
        " ".repeat(numSpaces / 2) + "#".repeat(numHashes) + " ".repeat(numSpaces / 2)
    }
}

private class Test {

    @Test
    fun `pyramid n = 2`() {
        generatePyramid(2).also {
            it.size shouldBeEqualTo 2
            it[0] shouldBeEqualTo " # "
            it[1] shouldBeEqualTo "###"
        }
    }

    @Test
    fun `pyramid n = 3`() {
        generatePyramid(3).also {
            it.size shouldBeEqualTo 3
            it[0] shouldBeEqualTo "  #  "
            it[1] shouldBeEqualTo " ### "
            it[2] shouldBeEqualTo "#####"
        }
    }

    @Test
    fun `pyramid n = 4`() {
        generatePyramid(4).also {
            it.size shouldBeEqualTo 4
            it[0] shouldBeEqualTo "   #   "
            it[1] shouldBeEqualTo "  ###  "
            it[2] shouldBeEqualTo " ##### "
            it[3] shouldBeEqualTo "#######"
        }
    }

    @Test
    fun `pyramid n = 5`() {
        generatePyramid(5).also {
            it.size shouldBeEqualTo 5
            it[0] shouldBeEqualTo "    #    "
            it[1] shouldBeEqualTo "   ###   "
            it[2] shouldBeEqualTo "  #####  "
            it[3] shouldBeEqualTo " ####### "
            it[4] shouldBeEqualTo "#########"
        }
    }

    @Test
    fun `pyramid n = 6`() {
        generatePyramid(6).also {
            it.size shouldBeEqualTo 6
            it[0] shouldBeEqualTo "     #     "
            it[1] shouldBeEqualTo "    ###    "
            it[2] shouldBeEqualTo "   #####   "
            it[3] shouldBeEqualTo "  #######  "
            it[4] shouldBeEqualTo " ######### "
            it[5] shouldBeEqualTo "###########"
        }
    }
}
