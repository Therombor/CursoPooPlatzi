<?php
include "Account.php";
include "Car.php";

$car = new Car('32424ASDFA',new Account('Andres','64565AS'));

$car->printDataCar();

?>