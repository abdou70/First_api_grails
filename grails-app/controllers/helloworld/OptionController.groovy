package helloworld

import grails.rest.RestfulController
import org.fleetmanager.Option

class OptionController extends RestfulController<Option> {
    static responseFormats = ['json','xml']
    OptionController() {
        super(Option)
    }

//    def index() { }
}
