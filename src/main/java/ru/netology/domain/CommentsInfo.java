package ru.netology.domain;

public class CommentsInfo { // информация о комментариях к записи, объект с полями.
    private int count; // количество комментариев.
    private int canPost; // информация о том, может ли текущий пользователь комментировать
    // запись (1 — может, 0 — не может).
    private int groupsCanPost; // информация о том, могут ли сообщества комментировать запись.
    private boolean canClose; // может ли текущий пользователь закрыть комментарии к записи.
    private boolean canOpen; // может ли текущий пользователь открыть комментарии к записи.

    // + get/set на все поля

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public int getCanPost() {
        return canPost;
    }
    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }
    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean IsCanClose() {
        return canClose;
    }
    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean IsCanOpen() {
        return canOpen;
    }
    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
