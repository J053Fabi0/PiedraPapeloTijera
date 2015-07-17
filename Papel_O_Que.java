package piedra.papel.y.tijera;


public class Papel_O_Que {
    
    
    public String setArma(int numDeArma){  //esta func deduce que es la respuesta de el usuario 
        
    if (numDeArma == 1){
        return "piedra";
        
    }else if(numDeArma == 2){
        return "papel";
        
    }else if(numDeArma == 3){
        return "tijera";
    }
        return "no se";
    
    }
    
    public String setArmaRnd(int numDeArmaRnd){  //esta func deduce lo de la compu rnd
        if (numDeArmaRnd == 1){
        return "piedra";
        
    }else if(numDeArmaRnd == 2){
        return "papel";
        
    }else if(numDeArmaRnd == 3){
        return "tijera";
    }
        return null;
    
    }
    
    public String setWinner(String respuestaUsr, String respuestaRnd){
        
        if(respuestaUsr != respuestaRnd){//si son diferentes entonces…
            
        if(respuestaUsr == "piedra"){//si la respuesta de usr es piedra…
            
            if (respuestaRnd == "tijera"){//y la otra es tijera…
                
            return "ahora te toco GANAR!!";
            
            }else if(respuestaRnd == "papel"){//o papel…
                
            return "has perdido contra el CPU.";
            
           }
        }
        if(respuestaUsr == "papel"){//si la respuesta de usr es piedra…
            
            if (respuestaRnd == "piedra"){//y la otra es tijera…
                
            return "ahora te toco GANAR!!";
            
            }else if(respuestaRnd == "tijera"){//o papel…
                
            return "has perdido contra el CPU.";
            
           }
        }
        if(respuestaUsr == "tijera"){//si la respuesta de usr es piedra…
            
            if (respuestaRnd == "papel"){//y la otra es tijera…
                
            return "ahora te toco GANAR!!";
            
            }else if(respuestaRnd == "piedra"){//o papel…
                
            return "has perdido contra el CPU.";
            
           }
        }
        
        }
        else if (respuestaUsr == respuestaRnd){//si es un empate …
        return "es un empate!! Intenta de nuevo.";
        }
        
    return null;
    }
}
    