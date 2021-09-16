public class Pato implements Voador{

    private int energia;

    public int getEnergia(){
        return energia;
    }

     public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public void voar() {
        System.out.println("Estou voando como um pato ");
        System.out.println("Minha energia agora está em: " + (energia - 5));
        System.out.println("--------------------------------- ");
    }
}
