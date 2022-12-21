class QueenBB{
  
  static boolean[] flag = new boolean[8];
  static int[] pos = new int[8];
  
  static void print(){
    for(int i = 0; i<8;i++){
      System.out.println(pos[i]);
    }
  }
  
  static void set(int i){
    if(flag[j] == false){
      pos[i] = j;
      if(i == 7){
        print();
      }else{
        flag[j] = true;
        set(i + 1);
        flag[j] = false;
      }
  }

}
