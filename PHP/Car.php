<?php
class Car  
{
    public $id = 0;
    public $license;
    public $driver;
    public $passenger;

    public function __construct($license,$driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar(){
        echo "Licencia = " . $this->license . " Conductor = " . $this->driver->name;
    }
}