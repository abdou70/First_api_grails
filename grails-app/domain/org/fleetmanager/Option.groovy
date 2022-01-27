package org.fleetmanager
import grails.rest.*
import grails.rest.Resource
import org.fleetmanager.Car

@Resource(formats=['json','xml'])
class Option {
    String name

    static hasOne = [
            car: Car
    ]

    static constraints = {
        name blank: false
    }
}
