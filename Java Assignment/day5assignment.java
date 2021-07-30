class day5assignment
{
    public static void main(String[] args) {
    int n=4;
    int k=1;
    char c = 'a';
    // 1
    // 3 5
    // 7 9 1
    // 3 5 7 9
    for(int i=0;i<n;i++)
    {        
        for(int j=0;j<n;j++)
        {                
            if(i>=j)
            {
              if(k>=9)
              {
                  System.out.print(k+" ");
                k=1;
              }
              else
              {
                  System.out.print(k +" ");
                  k+=2;
              }
            }
            else
            {
              System.out.print("  ");  
            }
        }
        System.out.println();
    }
    // a
    // b c 
    // d a b
    // c d a b
    
    for(int i=0;i<n;i++)
    {        
        for(int j=0;j<n;j++)
        {                
            if(i>=j)
            {
              if(c>='d')
              {
                  System.out.print(c +" ");
                  c='a';
              }
              else
              {
                  System.out.print(c +" ");
                  c++;
                  
              }
            }
            else
            {
              System.out.print("  ");  
            }
        }
        System.out.println();
    }


    }
}