package ru.netology.domain;

public class Donut { // информация о записи VK Donut.
    private boolean isDonut; // запись доступна только платным подписчикам VK Donut.
    private int paidDuration; // время, в течение которого запись будет доступна только платным
    // подписчикам VK Donut.
    private Object placeholder; // заглушка для пользователей, которые не оформили подписку VK Donut.
    // Отображается вместо содержимого записи.
    private boolean canPublishFreeCopy; // можно ли открыть запись для всех пользователей, а не только
    // подписчиков VK Donut.
    private String editMode; // информация о том, какие значения VK Donut можно изменить в записи.

    // + get/set на все поля

    public boolean IsIsDonut() {
        return isDonut;
    }
    public void setIsDonut(boolean isDonut) {
        this.isDonut = isDonut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }
    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public Object getPlaceholder() {
        return placeholder;
    }
    public void setPlaceholder(int placeholder) {
        this.placeholder = placeholder;
    }

    public boolean IsCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }
    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }
    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
