public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    public void pressionarBotaoPower() {
        ligada = !ligada;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void mudarCanal(){
        canal++;
    }

    public int escolherCanal(int numeroCanal) {

        return canal = numeroCanal;
    }
}
