public class SmartTv{
    boolean ligada = false;
    int volume = 25;
    int canal = 1;
    
    //Configuração de estado da Smart TV:
    public void ligar(){
        ligada = true;
        System.out.println("Smart TV ligada? " + ligada);
    }

    public void desligar(){
        ligada = false;
        System.out.println("Smart TV ligada? " + ligada);
    }

    //Configuração de volume da Smart TV:
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    //Configuração de canal da Smart TV:
    public void subirCanal(){
        canal++;
        System.out.println("Subir canal para: " + canal);
    }

    public void descerCanal(){
        canal--;
        System.out.println("Descer canal para: " + canal);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudar canal para: " + canal);
    }
   

}