import spock.lang.*


class FirstTestFile extends Specification {

    def example = new calculatorExample()

    def setupSpec() {
        println ("setupSpec is running now")
    }

    def setup() {
        println("setup is running now")
    }

    def cleanup() {
        println("cleanup is running now")
    }

    def cleanupSpec() {
        println("cleanupSpec is running now")
    }

    def "My test"() {
        given:
        def calculator = new calculatorExample()

        // A specific scenario
        when:
        def SumOfNumbers = calculator.addNumbers(a, b)

        // A specific condition
        then:
        SumOfNumbers == expectedResult
        // A specific result

        where:
        // Run with multiple data
        a | b || expectedResult
        10 | 3 || 13
        7 | 4 || 11
        2 | 0 || 2
    }
}
