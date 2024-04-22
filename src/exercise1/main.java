package exercise1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringCut stringCut = new StringCut();

        System.out.println("Digite sua data de nascimento no formato YYYY-mm-DD");
        String nascimento = sc.next();

        LocalDate today_date = LocalDate.now();

        String[] array_nascimento = stringCut.cutString(nascimento);
        String[] array_today = stringCut.cutString(String.valueOf(today_date));

        DaysCounting daysCounting = new DaysCounting();

        System.out.printf(String.valueOf(daysCounting.qntAnoParaDias(array_nascimento, array_today)));
    }
}
