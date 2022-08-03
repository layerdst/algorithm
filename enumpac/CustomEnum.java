package enumpac;

import java.util.Calendar;

public class CustomEnum {


    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);


        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(week);
    }


}
