class QueenB{
  static int [] pos = new int [8];
  
  static void print(){
    for(int i=0;i<8;i++){
      System.out.println(pos[i]);
    }
  }
  
  static void set(int i){
    for(int j = 0; j<8; j++){
      pos[i] = j;
      if(i==7){
        print();
      }else{
        set(i+1);
      }
    }
  }
  
  pubic static void main(String [] args){
    set(0);
  }
  
}
