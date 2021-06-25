public class BubbleSort {
    public static void main(String []args)
    {
        int[] arr ={12,34,25,8,-9,87,95};

        for(int lastIndex= arr.length -1; lastIndex>0; lastIndex--)
        {
            for(int i =0; i<lastIndex; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    swap(arr, i, i+1);
                }
            }
        }
        for(int i=arr.length-1; i>=0; i--)
        {
            System.out.println(arr[i]);
        }
    }
    public static void swap(int[] a, int i, int j)
    {
        if(i==j)
        {
            return;
        }
        int temp= a[i];
        a[i]=a[j];
        a[j]= temp;
    }
}
