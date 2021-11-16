package com.zhukova.dz6;

public enum Hundreds {
    ZERO (""),
    ONE ("сто"),
    TWO ("двести"),
    THREE ("триста"),
    FOUR ("четыреста"),
    FIFE ("пятьсот");

    String title;
    Hundreds(String title) {
        this.title = title;
    }
}
