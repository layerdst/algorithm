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
  
  static void bubbleSort(int[] a, int n) {
		int ccnt = 0;			// 비교 회수
		int scnt = 0;			// 교환 회수

		for (int i = 0; i < n - 1; i++) {
			System.out.printf("패스%d : \n", i + 1);
			for (int j = n - 1; j > i; j--) {
				for (int m = 0; m < n - 1; m++){
					System.out.printf("%3d %c" , a[m], (m != j-1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
        		}
				System.out.printf("%3d\n", a[n - 1]);
				ccnt++;
				if (a[j - 1] > a[j]) {
					scnt++;
					swap(a, j - 1, j);
				}
        
			}
			for (int m = 0; m < n; m++){
				System.out.printf("%3d  " , a[m]);
      }
			System.out.println();
		}
		System.out.println("비교를 " + ccnt + "회 했습니다.");
		System.out.println("교환을 " + scnt + "회 했습니다.");
	}


  
  

}
