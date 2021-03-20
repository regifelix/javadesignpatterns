package br.com.regifelix.designpatterns.builder.builders;

import br.com.regifelix.designpatterns.builder.cars.Car;
import br.com.regifelix.designpatterns.builder.components.CarType;
import br.com.regifelix.designpatterns.builder.components.Color;
import br.com.regifelix.designpatterns.builder.components.Engine;
import br.com.regifelix.designpatterns.builder.components.Transmission;

public class CarBuilder implements IBuilder{

    private CarType carType;

    private int seats;

    private Transmission transmission;

    private Engine engine;

    private Color color;



    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;

    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;

    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;

    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    public Car getResult(){
        return  new Car(carType, seats, engine, transmission, color);
    }
}
