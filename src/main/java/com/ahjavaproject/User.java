package com.ahjavaproject;

import lombok.Data;

@Data
public class User {
    private String username;
    private String email;
    private int age;
    private String[] playlistIds;
}
