package org.bridgelabz.regex.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC1Email {
    public static void main(String[] args) {
        String[] testCases = {
                "abc@bridgelabz.co",
                "abc.xyz@bridgelabz.co.in",
                "ab@bridgelabz.co",
                "abc@bridgelabzcom",
                "abc@bridgelabz.co.uk"
        };

        String regex = "^abc(?:\\.[a-zA-Z0-9]+)?@bridgelabz\\.co(?:\\.[a-zA-Z]{2,})?$";
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
