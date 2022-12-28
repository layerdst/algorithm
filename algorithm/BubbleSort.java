class BubbleSort{
  static void swap(int [] a, int idx1, int idx2){
    int temp = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = temp; 
  }
  
  static void bubbleSort(int [] a, int n){
    for(int i=0; i<n-1; i++){
      for(int j = n-1; j>i;j--){
        if(a[j-1] > a[j]){
          swap(a, j-1, j);
        }
      }
    }
  }
  

}
