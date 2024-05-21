
public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();
        // System.out.println("Ligando a TV: " +smartTV.ligando);
        // System.out.println("TV ligada: " +smartTV.ligada);
        // System.out.println("Canal atual:" +smartTV.canal);
        // System.out.println("Volume atual:" +smartTV.volume);

        smartTV.ligando();
        System.out.println("Ligando TV: " +smartTV.ligando);
        
        smartTV.ligar();
        System.out.println("Novo status TV -> ligada: " +smartTV.ligada);
      
        System.out.println("Canal atual: " +smartTV.canal);
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        System.out.println("Canal trocado: " + smartTV.canal);

        smartTV.volume();
        System.out.println("Volume atual da tv: " +smartTV.volume);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume atual da tv aumentado em 3: " +smartTV.volume);

        smartTV.mudarCanal(36);
        System.out.println("Canal trocado: " + smartTV.canal);

        

    }
}
