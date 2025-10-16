package entities;

public class Mais_Velho {
    private String name;
    private int age;

    public Mais_Velho(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mais_Velho CalMaisVelho(Mais_Velho[] maisVelhos){

        Mais_Velho maisVelho = maisVelhos[0];
        for(int i = 0; i < maisVelhos.length; i++){
            if(maisVelhos[i].getAge() > maisVelho.getAge()){
                maisVelho = maisVelhos[i];
            }
        }
        return maisVelho;
    }
}
