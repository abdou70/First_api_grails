package org.fleetmanager

import grails.rest.*

@Resource(uri = '/car' , formats = ['json','xml'])
class Car {

    static constraints = {
        manifactured blank: false
        manifactured blank: false
        color blank: false
        year blank: false
        acquisitionDate blank : false
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
//    Boolean IsElectric
}
