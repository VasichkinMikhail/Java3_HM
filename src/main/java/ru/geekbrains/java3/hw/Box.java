package ru.geekbrains.java3.hw;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruits> {
    private ArrayList<T> fruits;

    public Box(T... fruits) {
        this.fruits = new ArrayList<T>(Arrays.asList(fruits));
    }

    public void addInBox(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public void remove(T... fruits) {
        for (T fruit : fruits)
            this.fruits.remove(fruit);
    }

    public void toEmpty() {
        fruits.clear();
    }

    public float getWeight() {
        if (fruits.size() == 0)
            return 0;
        float weight = 0;
        for (T fruit : fruits) weight += fruit.getWeight();
        return weight;
    }

    public  boolean compare(Box box) {
        if (this.getWeight() == box.getWeight()) {
            System.out.println("Коробки равны по весу");
            return true;

        } else if (this.getWeight() < box.getWeight()) {
            System.out.println("Первая коробка легче чем вторая на " + (box.getWeight() - this.getWeight()+" кг."));
            return false;

        } else {
            System.out.println("Первая коробка тяжелее чем вторая на " + (this.getWeight()- box.getWeight())+" кг.");
            return false;

        }


    }


    public void transfer(Box<? super T> box){
        box.fruits.addAll(this.fruits);
        toEmpty();
    }
}
