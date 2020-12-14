from car import Car

class UberVan(Car):
    typeCarAccepted = []
    seatsMaterial = []

    def __init__(self,license,driver,typeCarAccepted,seatsMaterial):
<<<<<<< HEAD
        super(UberVan,self).__init__(license,driver)
=======
        super.__init__(license,driver)
>>>>>>> 8213453b94c8ee9bfb80b526db16fb1eda759bba
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterial = seatsMaterial
