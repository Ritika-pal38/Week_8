package org.bridgelabz.regex.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC3Email {
    public static void main(String[] args) {
        String[] testCases = {
                "abc@bridgelabz.co",
                "abc@bridgelabz.co.in",
                "abc@bridgelabzcom",
                "abc@xyz.co",
                "abc@bridgelabz.co.uk",
                "abc@bridgelabz.co123"
        };

        String regex = "^abc@[bB]ridgelabz\\.co(?:\\.[a-zA-Z]{2,})?$";
        Pattern pattern = Pattern.compile(regex);

        for (String email : testCases) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " is a valid email.");
            } else {
                System.out.println(email + " is an invalid email.");
            }
        }
    }

}
