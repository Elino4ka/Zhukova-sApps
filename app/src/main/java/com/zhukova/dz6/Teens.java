package com.zhukova.dz6;

public enum Teens {
    ZERO(""),
    ELEVEN("один"),
    TWELVE("два"),
    THIRTEEN("три"),
    FOURTEEN("четыре"),
    FIFTEEN("пять"),
    SIXTEEN("шесть"),
    SEVENTEEN("семь"),
    EIGHTEEN("восемь"),
    NINETEEN("девять");

    String title;

    Teens(String title) {
        this.title = title;
    }
}
