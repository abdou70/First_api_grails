package helloworld

import grails.rest.*
import grails.converters.*
import grails.rest.RestfulController
import org.fleetmanager.Car
import org.fleetmanager.CarController

class HelloworldController  extends RestfulController<Car>{
    static responseFormats = ['json','xml']

    HelloworldController() {
        super(Car)
    }
//    def index() {
//        render "Hello Sun Telecom";
//    }
//    CarController(){
//        super(Car)
//    }

}
