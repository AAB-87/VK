package ru.netology.domain;

public class ReportsInfo { // информация о репостах записи («Рассказать друзьям»), объект с полями.
    private int count; // число пользователей, скопировавших запись.
    private int userReposted; // наличие репоста от текущего пользователя (1 — есть, 0 — нет).

    // + get/set на все поля

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public int getUserReposted() {
        return userReposted;
    }
    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }
}
