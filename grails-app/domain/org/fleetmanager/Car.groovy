package org.fleetmanager

import grails.rest.*

@Resource(formats = ['json','xml'])
class Car {
    static constraints = {
        manifactured blank: false
        color blank: false
        year blank: false
        acquisitionDate blank : false
        option blank : true
        //IsElectric blank : false
    }
//    static mapping = {
//
//            datasource 'grailsapi'
//    }
    String manifactured
    String model
    String color
    Integer year
    String acquisitionDate

    static belongsTo = [
            option: Option
    ]

}
