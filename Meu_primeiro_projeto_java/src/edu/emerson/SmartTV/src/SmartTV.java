

public class SmartTV {
    
    boolean ligando = true;
    boolean ligada = false;
    int canal = 10;
    int volume = 15;

    public void ligando(){
        ligando = true;
    }

    public void desligando(){
        ligando = false;
    }

    public void ligar(){
        ligada= true;
    }

    public void desligar(){
        ligada = false;
    }


    public void volume(){
        volume = volume;
    }

    public void aumentarVolume(){
        volume ++;
    }

    public void diminuirVolume(){
        volume --;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    

} 






