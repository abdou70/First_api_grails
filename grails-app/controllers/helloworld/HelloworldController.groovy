package helloworld

import grails.rest.*
import grails.converters.*

class HelloworldController {
    static responseFormats = ['json','xml']
    def index() {
        render "Hello Sun Telecom";
    }
}
