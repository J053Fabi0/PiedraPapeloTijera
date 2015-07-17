package piedra.papel.y.tijera;

import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PiedraPapelYTijera {
    
    public static void main(String[] args) throws InterruptedException, IOException { //es muy importante que le digamos que
    //puede tirar una interrupcion
        
    String seguir = "s";
    
    Scanner respuesta = new Scanner (System.in);
    
    BufferedReader repetir = new BufferedReader(new InputStreamReader(System.in));
    
    while (seguir.equals("s")){

        
    
        System.out.println("\nEscoge y escribe 1 para piedra,\n 2 para papel o 3 para tijera:\n");
        
        int userTurn = respuesta.nextInt();

        Papel_O_Que tipoDeArma = new Papel_O_Que();

        String armaDefinida = tipoDeArma.setArma(userTurn); //la variabe que registra el tipo de arma del usuario



        System.out.println("Tu respuesta fue "+armaDefinida+"\n");

    //    System.out.println("Calculando una respuesta al azar \nde la computadora…");
    //    
    //    Thread.sleep(2700);

        Random hola = new Random();

        int compuTurn = hola.nextInt(3) + 1; //se saca el numero al azar entre 1, 2 y 3

        String armaDefinidaRnd = tipoDeArma.setArmaRnd(compuTurn); //la variable que registra el tipo de arma del CPU

        Papel_O_Que resultadoFnl = new Papel_O_Que(); //se crea esa cosa que tiene acceso a las fucs de la clase "papel o que"

        System.out.println("La computadora eligio: "+armaDefinidaRnd+"\n");

        System.out.println("Lo cual significa que…");

        Thread.sleep(800);

        System.out.println(resultadoFnl.setWinner(armaDefinida, armaDefinidaRnd));

        System.out.println("¿Desea seguir? s para si y n para no");
        
        seguir = repetir.readLine();
        
    }
    
}}
;