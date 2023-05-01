package com.scalar;

import com.scalar.greetings.Greetings;
import com.scalar.http.Client;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World from sonal!!!");

        Greetings greetings = new Greetings();
        greetings.greet();

        Client client =  new Client();
        String response = client.get("https://square.github.io/okhttp/");
        System.out.println(response);
    }
}
