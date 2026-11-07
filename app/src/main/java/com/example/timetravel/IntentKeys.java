package com.example.timetravel;

public class IntentKeys {
    public static final String MATRICULE = "12345"; // ton matricule

    public static String key(String matricule, String name) {
        return matricule + "_" + name;
    }
}