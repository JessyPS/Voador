public class Main {

    public static void main(String[] args) {

        Pato pato = new Pato();
        pato.setEnergia(100);

        Aviao aviao = new Aviao();
        aviao.setHorasVoo(80);

        SuperHomem superH = new SuperHomem();
        superH.setExperiencia(100);

        TorreDeControle torre = new TorreDeControle();

        torre.adicionarVoador(pato);
        torre.adicionarVoador(aviao);
        torre.adicionarVoador(superH);

        torre.voemTodos();
    }
}
