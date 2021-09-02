package ru.geekbrains.java3.hw;

public class App {
    public static void main(String[] args) {

        Apple apple = new Apple();
        Box<Apple> box1 = new Box<>();
        box1.addInBox(apple);
        box1.addInBox(apple);
        box1.addInBox(apple);
        box1.addInBox(apple);
        System.out.println("В коробке 1: " + box1.getWeight() + " кг.");



        Orange orange = new Orange();
        Box<Orange> box2 = new Box<>();
        box2.addInBox(orange); //Добавление фруктов в коробку
        box2.addInBox(orange);
        box2.addInBox(orange);
        //box2.remove(orange); //Удаление 1 фрукта из коробки
        // box2.toEmpty(); //Опустошение коробки
        System.out.println("В коробке 2: " + box2.getWeight() + " кг.");


        System.out.println(box1.compare(box2)); //Сравнение коробок

        Box<Apple> box3 = new Box<>();
        box1.transfer(box3); //Пересыпаем фрукты из коробки в коробку


    }
}
