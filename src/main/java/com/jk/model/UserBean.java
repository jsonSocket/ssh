package com.jk.model;

public class UserBean {
    private Integer id;

    private String nmae;

    public Integer getId() {
        return id;
    }

    public String getNmae() {
        return nmae;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", nmae='" + nmae + '\'' +
                '}';
    }
}
