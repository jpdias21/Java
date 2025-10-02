package utils;

public class Calculator {
        public static double Pi = 3.1415;

        public static double circumference(double radio){
            return 2.0 * Pi * radio;
        }
        public static double volume (double radio){
            return 4.0 * Pi * radio * radio * radio / 3.0;
        }
}
