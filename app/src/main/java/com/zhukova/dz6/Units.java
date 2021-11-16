package com.zhukova.dz6;

public enum Units {
    ZERO (""),
    ONE ("один"),
    TWO ("два"),
    THREE ("три"),
    FOUR ("четыре"),
    FIFE ("пять"),
    SIX ("шесть"),
    SEVEN ("семь"),
    EIGHT ("восемь"),
    NINE ("девять");

    String title;
    Units(String title) {
        this.title = title;
    }
}
