public class User {
    public static void main(String[] args) throws Exception {
    
    SmartTV smartv = new SmartTV();

    smartv.diminuirVolume();
    smartv.diminuirVolume();
    smartv.diminuirVolume();
    smartv.aumentarVolume();

    smartv.ligar();
    System.out.println("Novo status => TV ligada: " + smartv.ligada);

    System.out.println("Volume atual: " + smartv.volume);

    System.out.println("Canal atual: " + smartv.canal);

    smartv.mudarCanal(5);
    System.out.println("Canal atual: " + smartv.canal);

    System.out.println("Volume atual: " + smartv.volume);

    smartv.desligar();
    System.out.println("Novo status => TV ligada: " + smartv.ligada);
        

    
    }
}
