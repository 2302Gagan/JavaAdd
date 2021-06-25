public class Factorial {
    public static void main(String[] args)
    {
        int n= 9;
        int r= fact(n);
        int t= factR(n);
        System.out.println("Iterative factorial:- "+r);
        System.out.println("Recursive factorial:- "+t);
    }
    public static int fact(int num)
    {
        if(num==0)
            return 1;

        int factorial =1;
        for(int i=1; i<=num; i++)
        {
            factorial *= i;
        }
        return factorial;
    }
    public static int factR(int num)
    {
        if (num==0)
            return 1;

        return num*factR(num-1);
    }
}
