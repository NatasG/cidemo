package com.natas.cidemo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by shuaigao on 03/08/2017.
 */
public class DateUtils {

    public static String dateToStamp(String s) throws ParseException {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        res = String.valueOf(ts);
        return res;
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(dateToStamp("2014-06-17 08:00:00"));
    }

}
