package org.bridgelabz.regex.pincode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC2 {
    public static void main(String[] args) {
        String pinCode = "A400088";
        String regex = "^[0-9]{6}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pinCode);

        if (matcher.matches()) {
            System.out.println(pinCode + " is a valid PIN code.");
        } else {
            System.out.println(pinCode + " is an invalid PIN code.");
        }
    }
}
