package ru.netology.domain;

public class Geo { // информация о местоположении, содержит поля.
    private String type; // тип места.
    private String coordinates; // координаты места.
    private Object place; // описание места (если оно добавлено). Объект места.

    // + get/set на все поля

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public Object getPlace() {
        return place;
    }
    public void setPlace(Object place) {
        this.place = place;
    }
}
