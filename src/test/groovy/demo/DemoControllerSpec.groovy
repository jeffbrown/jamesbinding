package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(DemoController)
class DemoControllerSpec extends Specification {

    void "test something"() {
        when:
        request.method = 'POST'
        params.version = '4'
        params.name = 'Jeff'
        def model = controller.generate()

        then:
        model.command.name == 'Jeff'
        model.command.version == '4'
    }
}
