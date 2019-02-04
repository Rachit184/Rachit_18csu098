
import java.io.File;

public class FileDemo {
   
   public static void main(String[] args) {
      File f = null;
      String strs = "rachit.txt";
      try {
         FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
        Scanner sc = new Scanner(System.in);
             System.out.print("\nEnter a String:");
        while(sc.hasNext()){
               bout.write(sc.nextLine());
               bout.newLine();
        }
            bout.close();

            // create new file
            f = new File(strs);
            String a = f.getAbsolutePath(); 
            
            // prints absolute path and length
 	     System.out.print("\n"+a);
            System.out.print("\nLength =" +f.length());
            
         } catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
      }
   }
}
