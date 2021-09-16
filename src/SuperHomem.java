public class SuperHomem implements Voador {

    private int experiencia;

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void voar() {
        System.out.println("Estou voando como um campeão!\n" + "Aumentei minha experiência para: " + (experiencia + 3));
    }
}
