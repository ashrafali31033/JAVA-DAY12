import java.util.*;
public class linkedhashset
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        HashSet<String> a=new HashSet<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String s=sc.nextLine();
            a.add(s);
            System.out.println(s);


        }
    }
}