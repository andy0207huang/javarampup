package com.ahjavaproject;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String... args) { // ... vs []
        User user1 = new User();
        // Type/Parent User = Implementation/Child User
        // declares heap memory

        Map numbermap = new HashMap();
        // # equals() - mathematical equal
        // ## a equals b, b always equals a
        // ## a equals b, b equals c, then a equals c

        // # hashCode()

        // obj1.equals(obj2), obj1.hashCode() == obj2.hashCode()
        // obj1.hashCode == obj2.hasCode(), DOES NOT MEAN obj1.equals(obj2)

        user1.setUsername("andy_huang"); // puts head memory address into, 4 byte 64 bit, a reference
        user1.setEmail("andy.huang@example.com");
        user1.setAge(25);
        String[] playlist = new String[] { "playlist_1", "playlist_2", "playlist_3" }; // syntax using = new Type
        user1.setPlaylistIds(playlist);

        // default
        System.out.println("Hello World!");

        System.out.println(user1);
    }
}
