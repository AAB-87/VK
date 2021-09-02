package ru.netology.domain;

public class post {
    private String id; // идентификатор поста
    private String nameId; // имя владельца поста
    private String imageId; // аватар владельца поста
    private int date; // врем публикации поста
    private String imageUrl; // картинка поста
    private String text; // текст поста
    private boolean isFavorite; // пост добавлен в закладки пользователя


        // + get/set на все поля

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNameId() { return nameId; }
    public void setNameId(String nameId) { this.nameId = nameId; }

    public String getImageId() { return imageId; }
    public void setImageId(String imageId) { this.imageId = imageId; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
}

public class comment {
    private int count; // кол-во комментариев


}

public class report {
    private int count; // кол-во репостов

}

public class like {
    private int count; // кол-во лайков

}

public class views {
    private int count; // кол-во просмотров

}

public class postType {
    private string type []; // тип поста

}