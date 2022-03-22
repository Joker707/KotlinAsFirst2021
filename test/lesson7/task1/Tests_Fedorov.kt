package lesson7.task1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Tests_Fedorov {

    @Test
    @Tag("14")
    fun countSubstrings() {
        Assertions.assertEquals(
            mapOf("РАЗНЫЕ" to 2, "ные" to 2, "Неряшливость" to 1, "е" to 49, "эволюция" to 0),
            countSubstrings("input/substrings_in1.txt", listOf("РАЗНЫЕ", "ные", "Неряшливость", "е", "эволюция"))
        )
        Assertions.assertEquals(
            mapOf("Карминовый" to 2, "Некрасивый" to 2, "белоглазый" to 1),
            countSubstrings("input/substrings_in1.txt", listOf("Карминовый", "Некрасивый", "белоглазый"))
        )
        Assertions.assertEquals(
            mapOf("--" to 4, "ее" to 2, "животное" to 2, "." to 2),
            countSubstrings("input/substrings_in2.txt", listOf("--", "ее", "животное", "."))
        )



        Assertions.assertEquals(
            emptyMap<String, Int>(),
            countSubstrings("input/empty_input.txt", emptyList())
        )
        Assertions.assertEquals(
            mapOf("--" to 0, "1" to 0, "idk" to 0),
            countSubstrings("input/empty_input.txt", listOf("--", "1", "idk"))
        )
    }
}