package ru.gb;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new ConnectWindow(new LogHandler("./Chat_Log"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}