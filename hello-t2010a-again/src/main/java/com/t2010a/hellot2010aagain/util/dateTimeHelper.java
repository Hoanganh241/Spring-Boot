package com.t2010a.hellot2010aagain.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimeHelper {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static LocalDateTime convertStringToDataTime(String date) {
        return LocalDateTime.parse(date, formatter).atStartOfDay();
    }
}
