package edu.brainacad;

/**
 * Created by Admin on 13.03.2016.
 */
public enum MyDayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

public String nextDay(){
    int numberEnum = this.ordinal() + 1;
    if (numberEnum > 6) {
        return "is the last day of week !";
    } else {
        return MyDayOfWeek.values()[numberEnum].toString();
    }
}


    }

