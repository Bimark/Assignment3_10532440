public class NumberPuzzlesArmstrongNumbers 
{
    public static void main(String[] arg)
    {
        for(int i =0;i<=9;i++)
        {
            for(int y=0;y<=9;y++)
            {
                for(int t=0;t<=9;t++)
            {
               int v=(i*i*i)+(y*y*y)+(t+t+t);
               int w=(v/100)%10;
               int z=(v/10)%10;
               int j=(v%10);
               
               if(w==i && z==y && j==t )
               {
                   System.out.printf("%d%d%d%n",i,y,t);
               }
            }
            }
        }
    }
    }

