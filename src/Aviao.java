public class Aviao implements Voador{

    private int horasVoo;

    public int getHorasVoo() {
        return horasVoo;
    }

    public void setHorasVoo(int horasVoo) {
        this.horasVoo = horasVoo;
    }


    @Override
    public void voar() {
        System.out.println("Estou voando como um avião ");
        System.out.println("Minhas horas de vôo aumentaram para: " + (horasVoo + 13));
        System.out.println("------------------------------------- ");
    }
}
