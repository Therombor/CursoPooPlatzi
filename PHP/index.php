<?php
include_once "Account.php";
include_once "Uberx.php";

$car = new Uberx('32424ASDFA',new Account('Andres','64565AS'),"Chevrolet","Spark");

$car->printDataCar();

?>