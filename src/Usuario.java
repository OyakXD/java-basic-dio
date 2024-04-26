package src;

public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status A TV está ligada? " + smartTv.ligada);
        smartTv.aumentarVolume();
        System.out.println("Novo Status Volume: " + smartTv.volume);
        smartTv.pularCanal();
        System.out.println("Novo Status Canal: " + smartTv.canal);
        smartTv.escolherCanal(5);
        System.out.println("Novo Status Canal: " + smartTv.canal);

    }
}
