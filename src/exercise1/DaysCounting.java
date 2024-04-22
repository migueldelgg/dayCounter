package exercise1;

public class DaysCounting {

    public int days (String[] nascimento, String[] today){

        int anos_em_dias = qntAnoParaDias(nascimento, today);
        int meses_em_dias = qntMesesParaDias(nascimento, today);

    return anos_em_dias + meses_em_dias + Integer.parseInt(nascimento[0]) + Integer.parseInt(today[0]) ;
    }

    public int qntAnoParaDias(String[] nascimento, String[] today){

        int ano_nascimento = Integer.parseInt(nascimento[2]);
        int ano_today = Integer.parseInt(today[2]);

        return ano_today - ano_nascimento;
    }

    public int qntMesesParaDias(String[] nascimento, String[] today) {

        int mes_nascimento = Integer.parseInt(nascimento[2]);
        int mes_today = Integer.parseInt(today[2]);

        return (mes_nascimento * 30) + (mes_today * 30);
    }

}
