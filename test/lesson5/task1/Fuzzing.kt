package lesson5.task1

import edu.berkeley.cs.jqf.fuzz.Fuzz
import edu.berkeley.cs.jqf.fuzz.JQF
import org.junit.runner.RunWith


@RunWith(JQF::class)
class Fuzzing {

    @Fuzz
    fun testFindSumOfTwo(list: List<Int>, number: Int) {
        findSumOfTwo(list, number)
    }

}