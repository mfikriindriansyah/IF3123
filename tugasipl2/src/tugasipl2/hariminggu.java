package tugasipl2;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author muhammad fikri indriansyah 3411191057 DSE B
 */

public class hariminggu {
   public static void main(String[] args){
    int count = 0;
    LocalDate date1 = LocalDate.of(1901, Month.JANUARY, 1);
    LocalDate endDate = LocalDate.of(2000, Month.DECEMBER, 31);
    while (date1.isBefore(endDate)){
        date1 = date1.plusMonths(1);
        if(date1.getDayOfWeek() == DayOfWeek.SUNDAY){
            count++;
            }
        }
    System.out.println(count);
   }
}
