package spock

import spock.lang.Specification

class SpockClass extends Specification{

    int sum

    def setup(){

        sum = 2
        println("suma je inicijalizovana")
    }

    def 'one plue one should equal two'(){

        expect:
        println("provera")
        1 + 1 == sum

    }
}
