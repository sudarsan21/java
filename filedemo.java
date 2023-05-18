import java.io.FileOutputStream;
import java.io.IOException;
 

class Filedemo {
 
    
    public static void main(String args[])
    {
 
        
        try {
 
            
            FileOutputStream fout
                = new FileOutputStream("demo.txt");
 
           
            String s
                = "Welcome to SAKTHI POLYTECHNIC COLLEGE";
 
            
            byte b[] = s.getBytes();
 
            
            fout.write(b);
            System.out.println("File created successfully");
 
            
            fout.close();
        }
 
        
        catch (IOException e) {
 
           
            System.out.println(e);
        }
    }
}

 
