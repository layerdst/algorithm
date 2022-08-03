package enumpac;

import java.util.Calendar;
import java.util.EnumSet;

public class EnumWeekExample {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch(week){
            case 1 :
                today=Week.SUNDAY; break;
            case 2 :
                today=Week.MONDAY; break;
            case 3 :
                today=Week.TUESDAY; break;
            case 4 :
                today=Week.WEDNESDAY; break;
            case 5 :
                today=Week.THURSDAY; break;
            case 6 :
                today=Week.FRIDAY; break;
            case 7 :
                today=Week.SATURDAY;break;

        }

        if(today==Week.MONDAY){
            System.out.println("월요일");
        }

        Week[] days = Week.values();
        for (Week day : days) {
            System.out.println(day);
        }

        System.out.println("enumSet");

        EnumSet<Week> set = EnumSet.allOf(Week.class);
        set.forEach(a -> System.out.println(a));
        System.out.println("enumSet");
        System.out.println("enumSet");

        EnumSet<Week> weeks = EnumSet.noneOf(Week.class);
        weeks.forEach(a -> System.out.println(a));

        EnumSet<Week> range = EnumSet.range(Week.THURSDAY, Week.FRIDAY);
        range.forEach(System.out::println);

        EnumSet<Week> comp = EnumSet.complementOf(EnumSet.of(Week.THURSDAY, Week.FRIDAY));
        comp.forEach(System.out::println);

    }
}
