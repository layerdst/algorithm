package algorithm;

public class PhysicalExamination {

    static final int VMAX = 21;

    static class PhycsData{
        String name;
        int height;
        double vision;

        public PhycsData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double avgHeight(PhycsData[] data){
        double sum = 0;

        for(PhycsData temp : data){
            sum += temp.height;
        }

        return sum / data.length;
    }

    static void distVision(PhycsData[] data, int[] dist) {
        int i = 0;
        dist[i] =0;
        for (PhycsData temp : data) {
            if (temp.vision >= 0.0 && temp.vision < VMAX / 10.0) {
                dist[(int) (temp.vision * 10)]++;
            }
        }
    }

    static void distVisionStar(PhycsData[] data, int[] dist) {
        int i = 0;
        dist[i] =0;
        for (PhycsData temp : data) {
            if (temp.vision >= 0.0 && temp.vision < VMAX / 10.0) {
                dist[(int) (temp.vision * 10)]++;
            }
        }
    }

    static void reverse(int [] temp){
        int s;
        for(int i=0; i<temp.length/2;i++){
            s = temp[i];
            temp[i] = temp[temp.length-1-i] ;
            temp[temp.length-1-i] = s;
        }
    }

    public static void main(String[] args) {
        PhycsData[] x = {
                new PhycsData("김", 125, 0.3),
                new PhycsData("이", 150, 0.2),
                new PhycsData("최", 170, 0.6),
                new PhycsData("긴", 168, 0.5),
                new PhycsData("일", 180, 0.4),
                new PhycsData("선", 190, 0.4),
        };

        int[] vdist = new int[VMAX];

        System.out.println(avgHeight(x));
        distVision(x,vdist);

        for (int d =0; d<vdist.length;d++ ) {
            if(vdist[d]==0) continue;
            String temp = "";
            System.out.print((float) (d) / 10);
            for(int a =0; a<vdist[d];a++){
                temp += "*";
            }
            System.out.print(" : " + temp);
            System.out.println();
        }
    }
}
