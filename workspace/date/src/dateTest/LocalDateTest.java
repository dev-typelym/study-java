package dateTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
   public static void main(String[] args) {
      LocalDate now = LocalDate.now();
      LocalDateTime localDateTime = LocalDateTime.now();
//      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� a hh�� mm�� ss��");
      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� HH�� mm�� ss��");
      
      System.out.println(LocalDateTime.parse("2023�� 12�� 04�� 12�� 00�� 00��", DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� HH�� mm�� ss��")));
      
      System.out.println(now);
      System.out.println(localDateTime.format(dateTimeFormatter));
   }
}
