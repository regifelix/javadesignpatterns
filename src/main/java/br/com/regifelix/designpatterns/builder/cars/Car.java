package br.com.regifelix.designpatterns.builder.cars;

import br.com.regifelix.designpatterns.builder.components.CarType;
import br.com.regifelix.designpatterns.builder.components.Color;
import br.com.regifelix.designpatterns.builder.components.Engine;
import br.com.regifelix.designpatterns.builder.components.Transmission;

public class Car {

    private CarType cartype;

    private Engine engine;

    private Transmission transmission;

    private int seats;

    private Color color;

    public Car(CarType type, int seats, Engine engine, Transmission transmission, Color color) {
        this.cartype = type;
        this.seats = seats;
        this.transmission = transmission;
        this.engine = engine;
        this.color = color;
    }

    public CarType getCartype() {
        return cartype;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public int getSeats() {
        return seats;
    }

    public Color getColor() {
        return color;
    }

    public String getResult(){
        String car = "Car with motor: " + engine.getPower() + "\n";
        car += "Transmission: " + transmission + " color: " + color;
        return car;
    }
}
