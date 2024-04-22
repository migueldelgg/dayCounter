package exercise1;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite sua data de nascimento no formato DD/mm/YYYY");
        String i = sc.next();

        LocalDate end_date = LocalDate.now();
        LocalDate start_date = LocalDate.parse(i, formatter);

        long days = ChronoUnit.DAYS.between(start_date, end_date);

        System.out.println("Você tem "+ days + " dias de vida.");

    }
}
