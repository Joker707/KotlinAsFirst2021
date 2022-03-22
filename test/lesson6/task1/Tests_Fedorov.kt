package lesson6.task1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Tests_Fedorov {

    @Test
    @Tag("6")
    fun plusMinus() {
        Assertions.assertEquals(0, plusMinus("0"))
        Assertions.assertEquals(4, plusMinus("2 + 2"))
        Assertions.assertEquals(6, plusMinus("2 + 31 - 40 + 13"))
        Assertions.assertEquals(-1, plusMinus("0 - 1"))
        Assertions.assertThrows(IllegalArgumentException::class.java) { plusMinus("+2") }
        Assertions.assertThrows(IllegalArgumentException::class.java) { plusMinus("+ 4") }
        Assertions.assertThrows(IllegalArgumentException::class.java) { plusMinus("4 - -2") }
        Assertions.assertThrows(IllegalArgumentException::class.java) { plusMinus("44 - - 12") }
        Assertions.assertThrows(IllegalArgumentException::class.java) { plusMinus("4 - + 12") }

        Assertions.assertEquals(5, plusMinus("1 + 1 + 1 + 1 + 1"))
        Assertions.assertEquals(-2, plusMinus("1 - 1 - 1 - 1"))
        Assertions.assertEquals(2, plusMinus("1 + 1 - 1 - 1 + 1 + 1"))
        Assertions.assertEquals(2, plusMinus("01 + 01 - 01 - 01 + 01 + 01"))
        Assertions.assertEquals(7, plusMinus("5 - 6 + 7 - 8 + 9"))

        // imho these tests gonna work w/o throwing exceptions, but okay :)
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            plusMinus("  5 -    6    +    7 - 8   + 9")
        }
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            plusMinus("5 - 6 + 7 - 8 + 9 + ")
        }
    }
}