package lesson7.task1

import edu.berkeley.cs.jqf.fuzz.Fuzz
import edu.berkeley.cs.jqf.fuzz.JQF
import org.junit.runner.RunWith

@RunWith(JQF::class)
class Fuzzing {

    @Fuzz
    fun testCountSubStrings(inputName: String, substrings: List<String>) {
        countSubstrings(inputName, substrings)
    }

}