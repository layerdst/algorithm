class EightQueen{
  static boolean[] flag_row = new boolean[8];
  static boolean[] flag_column = new boolean[15];
  static boolean[] flag_diagonal = new boolean[15];
  
  static int[] pos = new int [8];
  
  static void print(){
    for(int i =0;i<8;i++){
      System.out.println(pos[i]);
    }
  }
  
  static void set(int i){
    for(int j=0;j<8;j++){
      if(flag_row[i] == false && 
         flag_column[i+j] == false && 
         flag_diagonal[i-j+7 ==false){
      
      pos[i] =j;

        if(i==7) {
          print();
        }else{
          flag_row[j] = flag_column[i+j] = flag_diagonal[i-j+7] = true;
          set(i+1);
          flag_row[j] = flag_column[i+j] = flag_diagonal[i-j+7] = false;
        }
      }
    }
  }
}
