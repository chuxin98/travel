package com.it.travel.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class UUIDUtils {
    public static String getShortUID(){
        return UUID.randomUUID().toString().substring(18);
    }
    public static String getDateStr(){
        SimpleDateFormat foramt = new SimpleDateFormat("yyyy-MM-dd");
        return foramt.format(new Date());
    }
}
