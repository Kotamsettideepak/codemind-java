import java.util.*;
public class A
{
    public static void main(String ar[])
    {
        Scanner sc  = new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]= new int[a];
        for (int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}