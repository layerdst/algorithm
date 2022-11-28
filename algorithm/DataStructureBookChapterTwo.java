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
        for(i=0;i< data.length;i++){
            if(data[i].vision>=0.0 && data[i].vision<=VMAX/10.0){
                dist[(int)(data[i].vision * 10)]++;
            }
        }
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
    }

}

