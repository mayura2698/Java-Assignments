package ass1;

public class a5 {
    static int findIndex(int n) 
    { 
          
        if (n <= 1) 
            return n; 
      
        int a = 0, b = 1, c = 1; 
        int res = 1; 
      
        while (c < n) 
        { 
            c = a + b; 
              
            res++; 
            a = b; 
            b = c; 
        } 
          
        return res; 
    } 
      
    public static void main (String[] args)  
    { 
        int result = findIndex(21); 
        System.out.println( result); 
    } 
} 

