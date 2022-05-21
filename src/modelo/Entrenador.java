package modelo;
import java.util.ArrayList;
import java.util.Random;

public class Entrenador {

    //Atributos
    String nombre;
    //Meter un equpo de 4 pokemon
    //Meter caja pokemon 
    Random r1 = new Random();
    int pokedolares = r1.nextInt(200) + 800;
    ArrayList<Pokemon>equipoPokemon = new ArrayList<Pokemon>(4);
    ArrayList<Pokemon>cajaPokemon = new ArrayList<Pokemon>();


    //Metodos

    public void Captura(){
        
    }


    //Completar método
    int moverPokemonACaja(){
        return 3;
    }

    //Completar método
    int moverPokemonAEquipo(){
        return 3;
    }

    

   



    
}
