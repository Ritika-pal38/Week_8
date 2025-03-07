package org.bridgelabz.regex.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC4Email {
    public static void main(String[] args) {
        String[] testCases = {
                "abc@bridgelabz.co",
                "abc.xyz@bridgelabz.co.in",
                "abc_xyz@bridgelabz.co",
                "abc+xyz@bridgelabz.co.uk",
                "abc-xyz@bridgelabz.co",
                "abc,xyz@bridgelabz.co",
                "abc!xyz@bridgelabz.co",  // invalid special character
                "abc@xyz.co",             // missing "bridgelabz"
                "abcxyz@bridgelabz.co"    // no special character before "xyz"
        };

        String regex = "^abc(?:[_,+\\-.][a-zA-Z0-9]+)?@bridgelabz\\.co(?:\\.[a-zA-Z]{2,})?$";
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
