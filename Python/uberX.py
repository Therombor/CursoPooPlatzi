from car import Car

class UberX(Car):
    brand = str
    model = str

    def __init__(self,license,driver,brand,model):
<<<<<<< HEAD
        super(UberX,self).__init__(license,driver)
=======
        super.__init__(license,driver)
>>>>>>> 8213453b94c8ee9bfb80b526db16fb1eda759bba
        self.brand = brand
        self.model = model
