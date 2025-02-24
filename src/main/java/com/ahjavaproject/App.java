package com.ahjavaproject;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        User user1 = new User();

        user1.setUsername("andy_huang");
        user1.setEmail("andy.huang@example.com");
        user1.setAge(25);
        String[] playlist = { "playlist_1", "playlist_2", "playlist_3" };
        user1.setPlaylistIds(playlist);

        // default
        System.out.println("Hello World!");

        System.out.println(user1);
    }
}
