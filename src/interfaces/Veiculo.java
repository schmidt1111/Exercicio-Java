package interfaces;

public class Veiculo {

}
package one.digitalinnovation.interfaces;



public interface Veiculo {



    String registro();



    default void ligar() {



        System.out.println("Ligando o ve�culo!");

    }



    //void desligar();



    /*default void desligar() {

        System.out.println("Desligando o ve�culo!");

    }*/

}