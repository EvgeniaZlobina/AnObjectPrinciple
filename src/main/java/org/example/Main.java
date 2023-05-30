package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        Post.surname = "Иванов";
        post.name = "Иван";
        post.patronymie = "Иванович";
        post.subsciption = true;
        post.passport = "1234 123456";
        post.phone = "89828982982";
        Post.birthday = new FormDate(); // класс даты рождения
        Post.birthday.day = 13;
        Post.birthday.month = 02;
        Post.birthday.year = 1998;
    }
}