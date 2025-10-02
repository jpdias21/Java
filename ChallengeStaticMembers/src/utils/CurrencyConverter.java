package utils;

public class CurrencyConverter {
    public static double dollar  = 3.10;
    public static double iof = 0.06;

    public static double calculationDollar(double reais){
        double calculo = dollar * reais;
        double calculoIof = calculo * iof;
        return calculo + calculoIof;
    }

}
