package br.com.regifelix.designpatterns.builder.cars;

import br.com.regifelix.designpatterns.builder.components.CarType;
import br.com.regifelix.designpatterns.builder.components.Color;
import br.com.regifelix.designpatterns.builder.components.Engine;
import br.com.regifelix.designpatterns.builder.components.Transmission;

public class Truck {
    private CarType cartype;

    private int seats;

    private Engine engine;

    private Transmission transmission;

    private Color color;


    public Truck(CarType type, int seats, Engine engine, Transmission transmission, Color color) {
        this.cartype = type;
        this.seats = seats;
        this.transmission = transmission;
        this.engine = engine;
        this.color = color;

    }

    public CarType getCartype() {
        return cartype;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public String result(){
        String truck = "Truck with motor: " + engine.getPower() + "\n";
        truck += "Transmission: " + transmission + " color: " + color;
        return truck;

    }

    public Color getColor() {
        return color;
    }
}


