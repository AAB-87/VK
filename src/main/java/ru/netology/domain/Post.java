package ru.netology.domain;

public class Post {
    private int id; // идентификатор поста.
    private int fromId; // идентификатор автора поста
    private int date; // время публикации записи.
    private String text; // текст записи.
    private int ownerId; // идентификатор владельца стены, на которой размещена запись.
    private int createdBy; // идентификатор администратора, который опубликовал запись
    private int replyOwnerId; // идентификатор владельца записи, в ответ на которую была оставлена текущая.
    private int replyPostId; // идентификатор записи, в ответ на которую была оставлена текущая.
    private int friendsOnly; // 1, если запись была создана с опцией «Только для друзей».
    private String postType; // тип записи, может принимать следующие значения: post, copy, reply,
    // postpone, suggest.
    private int signerId; // идентификатор автора, если запись была опубликована от имени сообщества
    // и подписана пользователем.
    private int canPin; // информация о том, может ли текущий пользователь закрепить запись
    // (1 — может, 0 — не может).
    private int canDelete; // информация о том, может ли текущий пользователь удалить запись
    // (1 — может, 0 — не может).
    private int canEdit; // информация о том, может ли текущий пользователь редактировать запись
    // (1 — может, 0 — не может).
    private int isPinned; // информация о том, что запись закреплена.
    private int markedAsAds; // информация о том, содержит ли запись отметку "реклама" (1 — да, 0 — нет).
    private boolean isFavorite; // true, если объект добавлен в закладки у текущего пользователя.
    private int postponedId; // идентификатор отложенной записи. Это поле возвращается тогда,
    // когда запись стояла на таймере.
    private Object commentsInfo; // информация о комментариях к записи, объект с полями.
    private Object copyright; // источник материала, объект с полями.
    private Object donut; // информация о записи VK Donut.
    private Object geo; // информация о местоположении, содержит поля.
    private Object likesInfo; // информация о лайках к записи, объект с полями.
    private Object postSource; // информация о способе размещения записи. Описание объекта находится на
    // отдельной странице.
    private Object reportsInfo; // информация о репостах записи («Рассказать друзьям»), объект с полями.
    private Object viewsInfo; // информация о просмотрах записи. Объект с единственным полем.

    // + get/set на все поля

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getFromId() { return fromId; }
    public void setFromId(int fromId) { this.fromId = fromId; }

    public int getDate() { return date; }
    public void setDate(int date) { this.date = date; }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public int getOwnerId() { return ownerId; }
    public void setOwnerId(int ownerId) { this.ownerId = ownerId; }

    public int getCreatedBy() { return createdBy; }
    public void setCreatedBy(int createdBy) { this.createdBy = createdBy; }

    public int getReplyOwnerId() { return replyOwnerId; }
    public void setReplyOwnerId(int replyOwnerId) { this.replyOwnerId = replyOwnerId; }

    public int getReplyPostId() { return replyPostId; }
    public void setReplyPostId(int replyPostId) { this.replyPostId = replyPostId; }

    public int getFriendsOnly() { return friendsOnly; }
    public void setFriendsOnly(int friendsOnly) { this.friendsOnly = friendsOnly; }

    public String getPostType() { return postType; }
    public void setPostType(String postType) { this.postType = postType; }

    public int getSignerId() { return signerId; }
    public void setSignerId(int signerId) { this.signerId = signerId; }

    public int getCanPin() { return canPin; }
    public void setCanPin(int canPin) { this.canPin = canPin; }

    public int getCanDelete() { return canDelete; }
    public void setCanDelete(int canDelete) { this.canDelete = canDelete; }

    public int getCanEdit() { return canEdit; }
    public void setCanEdit(int canEdit) { this.canEdit = canEdit; }

    public int getIsPinned() { return isPinned; }
    public void setIsPinned(int isPinned) { this.isPinned = isPinned; }

    public int getMarkedAsAds() { return markedAsAds; }
    public void setMarkedAsAds(int markedAsAds) { this.markedAsAds = markedAsAds; }

    public boolean IsIsFavoriteCanClose() { return isFavorite; }
    public void setIsFavorite(boolean isFavorite) { this.isFavorite = isFavorite; }

    public int getPostponedId() { return postponedId; }
    public void setPostponedId(int postponedId) { this.postponedId = postponedId; }

    public Object getCommentsInfo() {
        return commentsInfo;
    }
    public void setCommentsInfo(Object commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public Object getCopyright() {
        return copyright;
    }
    public void setCopyright(Object copyright) {
        this.copyright = copyright;
    }

    public Object getDonut() {
        return donut;
    }
    public void setDonut(Object donut) {
        this.donut = donut;
    }

    public Object getGeo() {
        return geo;
    }
    public void setGeo(Object geo) {
        this.geo = geo;
    }

    public Object getLikesInfo() {
        return likesInfo;
    }
    public void setLikesInfo(Object likesInfo) {
        this.likesInfo = likesInfo;
    }

    public Object getPostSource() {
        return postSource;
    }
    public void setPostSource(Object postSource) { this.postSource = postSource; }

    public Object getReportsInfo() {
        return reportsInfo;
    }
    public void setReportsInfo(Object reportsInfo) {
        this.reportsInfo = reportsInfo;
    }

    public Object getViewsInfo() {
        return viewsInfo;
    }
    public void setViewsInfo(Object viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

}

