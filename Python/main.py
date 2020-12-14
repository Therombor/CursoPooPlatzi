from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car("ASD312",Account('Andres','1325ADC'))
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("QWER123",Account('Manolo','789DAS'))
    print(vars(car2))
    print(vars(car2.driver))
