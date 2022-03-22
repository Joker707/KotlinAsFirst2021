package lesson5.task1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Tests_Fedorov {

    @Test
    @Tag("6")
    fun findSumOfTwo() {
        Assertions.assertEquals(Pair(-1, -1), findSumOfTwo(emptyList(), 1))
        Assertions.assertEquals(Pair(0, 2), findSumOfTwo(listOf(1, 2, 3), 4))
        Assertions.assertEquals(Pair(-1, -1), findSumOfTwo(listOf(1, 2, 3), 6))


        Assertions.assertEquals(Pair(2, 3), findSumOfTwo(listOf(1, 1, 1, 3, 3, 3), 4))
        Assertions.assertEquals(Pair(-1, -1), findSumOfTwo(emptyList(), 0))
        Assertions.assertEquals(Pair(0, 1), findSumOfTwo(listOf(2, 4, 2, 4, 2, 4), 6))

    }
}