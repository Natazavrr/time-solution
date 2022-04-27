package com.company;

public class Main {


        public static void main(String[] args) {
            System.out.println(timeTranslate(122));

        }

        public static String timeTranslate(int timeInSeconds) {
            int  yrs, days, hrs, min, scnd;
            String  yrsStr, daysStr, hrsStr, minStr, scndStr;

            if(timeInSeconds < 0) {
                throw new ArithmeticException("Time should not be negative.");
            } else if (timeInSeconds == 0) {
                return "сейчас";
            } else {
                scnd = timeInSeconds % 60;
                min = (timeInSeconds / 60) % 60;
                hrs = (timeInSeconds / 60) / 60 % 24;
                days = ((timeInSeconds / 60) / 60 ) / 24 % 365;
                yrs = ((timeInSeconds / 60) / 60 ) / 24 / 365;


                yrsStr = (yrs == 1) ? yrs + " year, " : yrs + " years, ";
                daysStr = (days == 1)? days + " day, " : days + " days, ";
                hrsStr = (hrs == 1) ? hrs + " hour, " : hrs + " hours, ";
                minStr = (min == 1) ? min + " minute " : min + " minutes ";
                scndStr = (scnd == 1) ?  "and " + scnd + " second " : "and " + scnd + " seconds ";

            }
            yrsStr = (yrs == 0) ? "" : yrsStr;
            daysStr = (days == 0) ? "" : daysStr;
            hrsStr = (hrs == 0) ? "" : hrsStr;
            minStr = (min == 0) ? "" : minStr;
            scndStr = (scnd == 0) ? "" : scndStr;
            if(yrs == 0 && days == 0 && hrs == 0 && min == 0 && scnd != 1) {
                scndStr = scnd + " seconds ";
            }

           if(yrs == 0 && days == 0 && hrs == 0 && min == 0 && scnd == 1) {
               scndStr = scnd + " second ";
           }

            return yrsStr + daysStr + hrsStr + minStr + scndStr;
        }
    }


