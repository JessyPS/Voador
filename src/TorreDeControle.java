public class TorreDeControle {

    public Voador [] lista = new Voador[10];

    public void voemTodos(){
        for (int i = 0; i <= lista.length; i++) {
            if(lista[i] == null) {
                break;
            }else {
                lista[i].voar();
            }
        }
    }

    public void adicionarVoador(Voador umVoador){
        for (int i=0; i <= lista.length; i++){
            if(lista[i] == null){
                lista[i] = umVoador;
                break;
            }
        }
    }
}
