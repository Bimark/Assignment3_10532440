public class MultiplicationTable 
{
    
    public static void  main(String[] arg)
    {
        for(int i =1;i<=12;i++)
        {
            
            System.out.printf(" %n");
            for(int y=1;y<=9;y++)
            {
               
                int t=i*y;
                System.out.print(t+"  ");
            }
        }
    }
}
