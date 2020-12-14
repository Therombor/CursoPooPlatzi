<?php

include "Car.php";

class Uberx extends Car
{

    public $brand;
    public $model;
    
    public __construct($licence,$driver,$brand,$model){

        parent::__construct($licence,$driver);

        $this->brand = $brand;
        $this->model = $model;
    }
}
