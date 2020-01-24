import java.util.*;
public class Hearth
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        long n=scan.nextInt();
        scan.nextLine();
        String s="";
        String a="";
        for(long i=0;i<n;i++)
        {
            a=scan.next();
            if(i<n/2)
            s=s+a.charAt(0);
            else
            s=s+a.charAt(a.length()-1);
        }
        //System.out.println(s);
        long l=s.length(),so=0,se=0,d;
        for(int i=0;i<n;i++)
        {
            if((i&1)==0)
            so+=s.charAt(i)-'0';
            else
            se+=s.charAt(i)-'0';
        }
        //System.out.println(so+" "+se);
        d=Math.abs(so-se);
        //System.out.println(d);
        if((d==0)||(d%11==0))
        System.out.println("OUI");
        else
        System.out.println("NON");
        scan.close();
    }
}