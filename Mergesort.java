class Main 
{ 
    
    void mergesort(int arr[], int l, int m, int r) 
    { 
        //initialize the array
        int p = m - l + 1; 
        int q = r - m; 
  
        //create a new array.
        int L[] = new int [p]; 
        int R[] = new int [q]; 
  
       
        for (int i=0; i<p; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<q; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
       //initialize i and j.
        int i = 0, j = 0; 
  
        //intialize k=l.
        int k = l; 
        while (i < p && j < q) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
                k++;
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
                k++;
            } 
            
        } 
  
       
        while (i < p) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
      
        while (j < q) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
     
    void sortarray(int arr[], int l, int r) 
    { 
        if (l<r) 
        { 
           
            int m = (l+r)/2; 
  
             
            sortarray(arr, l, m); 
            sortarray(arr , m+1, r); 
   
            mergesort(arr, l, m, r); 
        } 
    } 
  
   
    static void print(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    
    public static void main(String args[]) 
    { 
        int arr[] = {2, 1, 103, 50, 60, 47}; 
  
        System.out.println("input array:"); 
        print(arr); 
  
        Main t1 = new Main(); 
        t1.sortarray(arr, 0, arr.length-1); 
  
        System.out.println("\nthe sort array:"); 
        print(arr); 
    } 
} 
