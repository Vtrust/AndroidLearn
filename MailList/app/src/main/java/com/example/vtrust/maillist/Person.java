package com.example.vtrust.maillist;

/**
 * Created by vtrust on 18-4-4.
 */

public class Person {
    private String name;
    private int avatar;
    private String phone;
    private String mail;
    private String address;

    public Person(String name, int avatar, String phone, String mail, String address) {
        this.name = name;
        this.avatar = avatar;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAvatar() {
        return avatar;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    public String getAddress() {
        return address;
    }
}
