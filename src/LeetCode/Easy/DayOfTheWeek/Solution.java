package LeetCode.Easy.DayOfTheWeek;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Solution {
    public static String dayOfTheWeek(int day, int month, int year) {
        LocalDate current = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = current.getDayOfWeek();
        return dayOfWeek.toString().charAt(0) + dayOfWeek.toString().substring(1).toLowerCase();

    }

    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(7,11,1999));
    }
}
