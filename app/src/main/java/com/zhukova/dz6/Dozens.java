package com.zhukova.dz6;

public enum Dozens{
    ZERO (""),
    TEN ("десять"),
    TWENTY ("двадцать"),
    THIRTY ("тридцать"),
    FORTY ("сорок"),
    FIFTY ("пятьдесят"),
    SIXTY ("шестьдесят"),
    SEVENTY("семьдесят"),
    EIGHTY ("восемьдесят"),
    NINETY ("девяносто");

    String title;
    Dozens(String title) {
        this.title = title;
    }
}
