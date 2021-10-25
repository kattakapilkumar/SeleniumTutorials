
public class Test12 {
    public static void main(String args[]) {
        
        String str = "srstr";
        int len = str.length();
        
        char arr[] = new char[len];
        arr = str.toCharArray();
        
        char arr2[] = new char[len];
        arr2 = str.toCharArray();
        
        int countindex = 0; 
        int count = 0;
       boolean result = false;
        
        String temp = " ";
        
        for(int i=0;i<len;i++) {
            count = 0;
            for(int j=0;j<len;j++) {
                if(arr[j] == arr2[i]) {
                      arr2[i] = '1';
                //    System.out.println(arr[j] );
                  //  System.out.println(arr2[i]);
                    countindex = j ; 
                    count++ ;
                    if(count>1) {
                        
                        
                    }
                }
                
                
                if(count>0) {
                    
                    
                    
                }
                
            }
            
            
            
            
            
            
            
        }
        
        
        
     
     
    }
}
