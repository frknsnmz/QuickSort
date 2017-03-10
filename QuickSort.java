import java.util.Arrays;


public class QuickSort {
    
    private int array[];
    private int length;
 
    public void sort(int[] enterArray)
    {
    	// check array empty or not
        if (enterArray == null || enterArray.length == 0)
        {
            return;
        }
        this.array = enterArray;
        length = enterArray.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int minIndex, int maxIndex)
    {
        int i = minIndex;
        int j = maxIndex;
        // calculate pivot number here middle of the array.
        int pivot = array[minIndex+(maxIndex-minIndex)/2];
        //System.out.print(" here is your min  : " + minIndex);
        // Divide into two arrays
        while (i <= j)
        {
            while (array[i] < pivot)
            {
                i++;
            }
            while (array[j] > pivot)
            {
                j--;
            }
            if (i <= j)
            {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
         if (minIndex < j)
             quickSort(minIndex, j);
        //System.out.println("lower :" + minIndex);
        //System.out.println("j : "+ j);
         if (i < maxIndex)
            quickSort(i, maxIndex);
        //System.out.println("higher " + maxIndex);
        //System.out.println("  i ;" + i);
    }
 
    private void exchangeNumbers(int i, int j) 
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static int [] myArray(int size)
    {
    	int [] ar1 = new int[size];
    	for(int i = 0; i<ar1.length; i++)
    	{
    		ar1[i] = (int)(Math.random()*size);
    	}
    	return ar1;
    }
    
    public static void main(String a[]){
         
        QuickSort sorter = new QuickSort();
        
        // 3 elemanlý
        int[] input = {4,2,3,1,8,9,9};
        long startTime = System.nanoTime(); 
        sorter.sort(input);
		long endTime = System.nanoTime();
		long estimatedTime = endTime - startTime;
		
		System.out.println("speed test = "+estimatedTime);
        System.out.println(Arrays.toString(input)+" ");
        
        
        // 100 elemanlý
        System.out.println();
     
        int b [] = myArray(100);
        long startTim = System.nanoTime();
        sorter.sort(b);
        long endTim = System.nanoTime();
        long estimatedTim = endTim - startTim;
        System.out.println("speed test = "+estimatedTim);
        System.out.println(Arrays.toString(b)+" ");
        System.out.println();
        
        // 1000 elemanlý
        int c [] = myArray(1000);
        long startTi = System.nanoTime();
        sorter.sort(c);
        long endTi = System.nanoTime();
        long estimatedTi = endTi - startTi;
        System.out.println("speed test = "+estimatedTi);
        System.out.println(Arrays.toString(c)+" ");
        
        System.out.println();
        
        //10000 elemanlý
        int d [] = myArray(10000);
        long startT = System.nanoTime();
        sorter.sort(c);
        long endT = System.nanoTime();
        long estimatedT = endT - startT;
        System.out.println("speed test = "+estimatedT);
        System.out.println(Arrays.toString(d)+" ");
        
      //250 elemanlý
        System.out.println();
        int fs [] = myArray(250);
        long start = System.nanoTime();
        sorter.sort(c);
        long end = System.nanoTime();
        long estimated = end - start;
        System.out.println("speed test = "+estimated);
        System.out.println(Arrays.toString(fs)+" ");
     
     }
        
}
        
        
    




