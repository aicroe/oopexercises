package com.jalasoft.oopexercises.practice4;

public class Bicycle extends Land {
    private boolean exerciseBike;

    public Bicycle(String name, int price, boolean hasMotor, boolean exerciseBike) {
        super(name, price, hasMotor);
        this.exerciseBike = exerciseBike;
    }

    @Override
    public String displayData() {
        return super.displayData() + ", exercise = " + exerciseBike;
    }
}
