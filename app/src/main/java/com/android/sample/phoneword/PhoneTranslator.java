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
         return null;
        
    }

}
