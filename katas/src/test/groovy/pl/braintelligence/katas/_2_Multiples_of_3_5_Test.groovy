package pl.braintelligence.katas

import spock.lang.Specification

// Project Euler #1: Multiples of 3 and 5 from HackerRank
class _2_Multiples_of_3_5_Test extends Specification {

    public static final int NATURAL_NUMBER_10 = 10
    public static final int NATURAL_NUMBER_100 = 100

    public static final int SUM_OF_3_5_MULTIPLES_10 = 23
    public static final int SUM_OF_3_5_MULTIPLES_100 = 2318

    def "(java) Should find sum of all multiples for 3, 5"() {
        given:
        def sumOfMultiples = new Java_2_Multiples_of_3_5()

        when: "N=10 we get 3,6,9 and 5"
        def result1 = sumOfMultiples.getSum(NATURAL_NUMBER_10)
        def result2 = sumOfMultiples.getSum(NATURAL_NUMBER_100)

        then: "sum for 3+6+9+5 is 23"
        result1 == SUM_OF_3_5_MULTIPLES_10
        result2 == SUM_OF_3_5_MULTIPLES_100
    }

    def "(kotlin) Should find sum of all multiples for 3, 5"() {
        given:
        def sumOfMultiples = new Kotlin_2_Multiples_of_3_5()

        when: "For NaturalNumber=10 we get 3,6,9 and 5"
        def result1 = sumOfMultiples.findSumOfMultiples_3_5(NATURAL_NUMBER_10)
        def result2 = sumOfMultiples.findSumOfMultiples_3_5(NATURAL_NUMBER_100)

        then: "sum for NaturalNumber=10 is 23 (3+6+9+5)"
        result1 == SUM_OF_3_5_MULTIPLES_10
        result2 == SUM_OF_3_5_MULTIPLES_100
    }
}
