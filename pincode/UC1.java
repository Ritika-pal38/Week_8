package org.bridgelabz.regex.pincode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC1 {
    public static void main(String[] args) {
        String pinCode = "400088";
        String regex = "^[1-9][0-9]{5}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pinCode);

        if (matcher.matches()) {
            System.out.println(pinCode + " is a valid PIN code.");
        } else {
            System.out.println(pinCode + " is an invalid PIN code.");
        }
    }

}
