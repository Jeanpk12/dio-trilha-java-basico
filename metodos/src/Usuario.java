public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        smartTv.pressionarBotaoPower();
        System.out.println(smartTv.ligada);
        smartTv.pressionarBotaoPower();
        System.out.println(smartTv.ligada);
        smartTv.mudarCanal();
        System.out.println(smartTv.canal);
        smartTv.escolherCanal(17);
        System.out.println(smartTv.canal);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);
        

    }
}
