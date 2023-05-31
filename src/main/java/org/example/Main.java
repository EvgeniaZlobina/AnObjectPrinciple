package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymie = "Иванович";
        post.subsciption = true;
        post.passport = "1234 123456";
        post.phone = "89828982982";
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 02;
        post.birthday.year = 1998;
    }
}