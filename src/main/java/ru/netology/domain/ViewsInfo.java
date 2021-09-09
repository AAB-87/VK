package ru.netology.domain;

public class ViewsInfo { // информация о просмотрах записи. Объект с единственным полем.
    private int count; // число просмотров записи.

    // + get/set на все поля

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}
