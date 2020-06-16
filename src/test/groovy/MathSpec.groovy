import spock.lang.Specification
import spock.lang.Unroll

class MathSpec extends Specification {

    @Unroll
    def "maximum of two numbers"() {
        expect:
        Math.max(a, b) == c

        where:
        a << [1, 7, 0]
        b << [3, 4, 0]
        c << [3, 7, 0]
    }
}