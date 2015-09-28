package org.itstep;

import java.util.Date;

/**
 * Created by Вадим on 28.09.2015.
 */
public class SBuilder {
    public static void main(String[] args) {
        String result = "";

        Date startTime = new Date();
        for (int i = 0; i < 100000; i++) {
            result += String.valueOf(i);
        }
        Date endTime = new Date();

        System.out.println("Time: " + (endTime.getTime() - startTime.getTime()));
        System.out.println(result);

        StringBuilder stringBuilder = new StringBuilder();

        startTime = new Date();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(i);
        }
        endTime = new Date();


        System.out.println("Time: " + (endTime.getTime() - startTime.getTime()));
        System.out.println(stringBuilder);
    }
}
