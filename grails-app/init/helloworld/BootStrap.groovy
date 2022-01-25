package helloworld

import org.fleetmanager.Car

class BootStrap {

    def init = { servletContext ->
        new Car(
                manifactured: "BMW",
                model:"A-12",
                color:"black",
                year:2019,
                acquisituionDate: new Date()
        ).save()
        new Car(
                manifactured: "Mercedes",
                model:"Elegance",
                color:"white",
                year:2020,
                acquisituionDate: new Date()
        ).save()
    }
    def destroy = {
    }
}
