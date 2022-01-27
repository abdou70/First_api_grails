package helloworld

import grails.testing.gorm.DomainUnitTest
import org.fleetmanager.Option
import spock.lang.Specification

class OptionSpec extends Specification implements DomainUnitTest<Option> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
