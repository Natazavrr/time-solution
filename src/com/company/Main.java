package com.company;

public class Main {


        public static void main(String[] args) {
            System.out.println(timeTranslate(3600));

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
            // empty string if time unit equal zero
            yrsStr = (yrs == 0) ? "" : yrsStr;
            daysStr = (days == 0) ? "" : daysStr;
            hrsStr = (hrs == 0) ? "" : hrsStr;
            minStr = (min == 0) ? "" : minStr;
            scndStr = (scnd == 0) ? "" : scndStr;

            // delete commas at the end if other time units equal zero
            if(yrs == 0 && days == 0 && hrs == 0 && min == 0 && scnd != 1) {
                scndStr = scnd + " seconds";
            }

           if(yrs == 0 && days == 0 && hrs == 0 && min == 0 && scnd == 1) {
               scndStr = scnd + " second";
           }

           if(yrs != 0 && days == 0 && hrs == 0 && min == 0 && scnd == 0) {
               yrsStr = yrs + " years";
           }

            if(yrs == 1 && days == 0 && hrs == 0 && min == 0 && scnd == 0) {
                yrsStr = yrs + " year";
            }

            if(yrs == 0 && days != 0 && hrs == 0 && min == 0 && scnd == 0) {
                daysStr = days + " days";
            }

            if(yrs == 0 && days == 1 && hrs == 0 && min == 0 && scnd == 0) {
                daysStr = days + " day";
            }

            if(yrs == 0 && days == 0 && hrs != 0 && min == 0 && scnd == 0) {
                hrsStr = hrs + " hours";
            }

            if(yrs == 0 && days == 0 && hrs == 1 && min == 0 && scnd == 0) {
                hrsStr = hrs + " hour";
            }

            if(yrs == 0 && days == 0 && hrs == 0 && min != 0 && scnd == 0) {
                minStr = min + " minutes";
            }

            if(yrs == 0 && days == 0 && hrs == 0 && min == 1 && scnd == 0) {
                minStr = min + " minute";
            }


            return yrsStr + daysStr + hrsStr + minStr + scndStr;
        }


    }


