package spock

import spock.lang.Specification

class SpockClass extends Specification{

    int sum
    int petica
    def setup(){

        sum = 2
        petica = 5
        println("suma je inicijalizovana")
    }

    def 'one plue one should equal two'(){

        expect:
        println("provera")
        1 + 1 == sum

    }

    def 'block in spock'(){

        given: 'set value'
        int a = 2
        int b = 3

        when: ''
        int c = a + b

        then:
        c == petica
        println("$c je jednak $petica")
    }
}
