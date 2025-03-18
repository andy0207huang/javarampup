package com.ahjavaproject;

import lombok.Data; // changeable/mutable
import lombok.Value; // non-changeable/immutable

@Data
// creates a constructor, Getter & Setter, ToString etc.
public class User {
    private String username;
    private String email;
    private int age;
    private String[] playlistIds;
}
