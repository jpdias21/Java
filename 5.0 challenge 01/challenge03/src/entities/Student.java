package entities;

public class Student {
    public String name;
    public double noteOne;
    public double noteTwo;
    public double noteThree;


    public double notesSome(){
        return noteOne + noteTwo + noteThree;
    }

    public String passFailed(){
        if (notesSome() >= 60.00){
           return "Pass";
        } else{
            double calculation = 60.00 - notesSome() ;
         return    "Failed, Missing " + calculation + "Points";
        }
    }


    public String toMensagem(){
      return  "Saida, Final grade = " + notesSome() + passFailed();
    }
}
