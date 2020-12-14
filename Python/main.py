from car import Car
from account import Account
from uberX import UberX

if __name__ == "__main__":

    car = Car("ASD312",Account('Andres','1325ADC'))
    print(vars(car))
    print(vars(car.driver))

    car2 = UberX("QWER123",Account('Manolo','789DAS'),"Chevrolet","Spark")
    print(vars(car2))
    print(vars(car2.driver))
