package com.android.sample.phoneword;

import android.text.TextUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yvonne on 11/14/2017.
 */

public class PhoneTranslator {

    public static String toNumber(String raw){

        if(TextUtils.isEmpty(raw)){
            return "";
        } else {
            raw = raw.toUpperCase();
        }

        String newNumber = new String();
        List<String> rawArray = Arrays.asList(raw.split(""));

        for (String c : rawArray) {

            if (" -0123456789".contains(c))
            {
                newNumber += c;
            }else {
                String result = translateToNumber(c);
                if (result != null)
                    newNumber += result;
            }
        }
        return newNumber;

    }

    private static String translateToNumber(String c) {

            if ("ABC".contains(c))
                return "2";
            else if ("DEF".contains(c))
                return "3";
            else if ("GHI".contains(c))
                return "4";
            else if ("JKL".contains(c))
                return "5";
            else if ("MNO".contains(c))
                return "6";
            else if ("PQRS".contains(c))
                return "7";
            else if ("TUV".contains(c))
                return "8";
            else if ("WXYZ".contains(c))
                return "9";

            return null;

    }

}
