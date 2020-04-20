package ru.homework.lesson5;
//Животные
public abstract class Animals extends Object {
    protected String name;
    protected double max_length;
    protected double max_length_swim;
    protected double max_height;

    public Animals(String name, double max_length, double max_length_swim, double max_height) {
        this.name = name;
        this.max_length = max_length;
        this.max_length_swim = max_length_swim;
        this.max_height = max_height;
    }

    protected void running(double distance_run) {

        if (max_length >= distance_run)
            System.out.println(name + ": Пробежал");
        else
            System.out.println(name + ": Не поробежал");
    }


    protected void swimming(double distance_sw) {

        if (max_length_swim >= distance_sw)
            System.out.println(name + ": Проплыл");
        else
            System.out.println(name + ": Не проплыл");
    }

    protected void jumping(double distance_jump) {

        if (max_height >= distance_jump)
            System.out.println(name + ": Прыгнул " );
        else
            System.out.println(name + ": Не прыгнул ");
    }

}

