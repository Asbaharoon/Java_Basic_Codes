/*	
*                   COMPOSITE MAGIC NUMBER
*	Input m and n.
*	Check if m<n.
*	Take a counter variable.
*	Check if the number is composite.
*	Check If the number is magic number.
*	If the number is both a composite and magic number , print it and increase value of counter by 1.
*	Print frequency of composite magic numbers.
*/
import java.util.*;
class CompositeMagicNumber
{
    int checkComposite(int n)
    {//to check if a number is composite
        int c=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)   return 0;
        else       return 1;
    }

    int Magic(int n)
    {//to check if a number is a magic number

        int s=0;
        while(n>9)
        {
            int t=n;
            s=0;
            while(t>0)
            {
                int d=t%10; 
                s+=d;
                t=t/10;
            }
            n=s;
        }
        if(n==1) return 1;
        else     return 0;
    }

    void main()
    {        
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter lower boundary");
        m=sc.nextInt();
        System.out.println("enter upper boundary");
        n=sc.nextInt();
        if(m>=n)
            System.out.println("INVALID INPUT");
        else
        {
            int c=0;
            for(int i=m; i<=n; i++)
            {
                int comp=checkComposite(i);
                int mag=Magic(i);
                if(comp==1 && mag==1)
                {
                    System.out.print(i+ ",");
                    c++;
                }
            }
            System.out.println("FREQUENCY OF COMPOSITE INTEGER IS: "+ c);
        }
    }
}
