public class ExampleChapterTwo {

    static final int VMAX = 21;

    static class PhysicData{
        String name;
        int height;
        double vision;

        public PhysicData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double aveHeight(PhysicData[] data){
        double sum = 0;
        for(PhysicData a : data){
            sum += a.height;
        }
        return sum/data.length;
    }

    static void distVision(PhysicData[] data, int[] dist){
        int i = 0;
        dist[i] =0;
        for(PhysicData v : data){
            if(v.vision>=0.0 && v.vision <= VMAX/10.0){
                dist[(int)(v.vision*10)]++;
            }
        }
    }
    
    static class YMD {
        int y;
        int m;
        int d;

        public YMD(int y, int m, int d) {
            setYear(y);
            setMonth(m);
            setDay(d);
        }

        public enum Months{
            THIRTYONE,
            THIRTY,
            LEAP
        }


        void setYear(int year){
            if (year >= 0) {
                this.y = year;
            }else {
                throw new IllegalArgumentException("년도는 1년 부터입니다.");
            }
        }

        void setMonth(int month) {
            if (month >= 1 && month <= 12) {
                this.m = month;
            }else {
                throw new IllegalArgumentException("해당 월은 1에서 12월 까지 입니다.");
            }
        }

        void setDay(int day) {
            switch (m){
                case 1: case 3: case 5: case 7 : setDay(day, 31); break;
                case 2: setLeapDay(day); break;
                default: setDay(day, 30);
            }
        }

        void setLeapDay(int day) {
            if(y%400 ==0 ){
                setDay(day, 29);
            } else if (y%100 == 0) {
                setDay(day, 28);
            } else if( y % 4 == 0){
                setDay(day, 29);
            } else {
                setDay(day, 28);
            }
        }

        void setDay(int day, int lastMonthDay){
            if(boundedDay(day, lastMonthDay)){
                this.d = day;}
            else {
                throw new IllegalArgumentException("해당 월의 일은 " + lastMonthDay +"까지 입니다.");
            }
        }

        boolean boundedDay(int day, int lastMonthDay) {
            return (day >= 1 && day <= lastMonthDay);
        }

    public static void main(String[] args) {
        PhysicData[] x = {
                new PhysicData("kim", 170, 0.2),
                new PhysicData("asd", 165, 3.2),
                new PhysicData("sdgasg", 160, 1.2),
                new PhysicData("dfgsg", 150, 1.0),
                new PhysicData("sgasdg", 140, 0.8),
                new PhysicData("asdga", 180, 0.2),

        };

        for(PhysicData data : x){
            System.out.println(data.name + " " + data.height + " " + data.vision);
        }
        int[] vdist = new int[VMAX];

        System.out.println(aveHeight(x));
        distVision(x,vdist);

        for(int i = 0 ; i < VMAX ; i++){
            System.out.println(i/10.0 + ": "+ "*".repeat(vdist[i]));
        }
        
        YMD ymd = new YMD(2004, 2, 30);
    }

}

