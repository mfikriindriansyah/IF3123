package tugasipl2;
import java.util.*;
/**
 *
 * @author muhammad fikri indriansyah 3411191057 DSE B
 */
public class reversestring{
    
    public static void main(String args[]){
        
    String huruf, hasil = "";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan string: ");
    huruf = scanner.nextLine();
    
    int jumlah = huruf.length();
    
    int jumlahHuruf = jumlah - 1;
    
    for (int i = 0; i < jumlah; i++){
        
      hasil = hasil + huruf.charAt(jumlahHuruf);
      jumlahHuruf--;
    }
    System.out.println("Hasil reverse string: " + hasil);
    }
}
