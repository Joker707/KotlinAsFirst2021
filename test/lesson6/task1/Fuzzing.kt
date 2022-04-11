package lesson6.task1

import edu.berkeley.cs.jqf.fuzz.Fuzz
import edu.berkeley.cs.jqf.fuzz.JQF
import org.junit.runner.RunWith
import java.lang.IllegalArgumentException


@RunWith(JQF::class)
class Fuzzing {

    @Fuzz
    fun testPlusMinus(string: String) {
        try {
            plusMinus(string)
        } catch (e: IllegalArgumentException) {

        }
    }

}