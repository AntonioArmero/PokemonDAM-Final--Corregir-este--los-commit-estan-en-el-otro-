package modelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;



import java.sql.*;
import javax.sql.*;


public class Pokemon {

    //Atributos
    private int numPokedex;
    private int idPokemon;
    private String nombre;
    private String mote;
    private int vitalidad;
    private int ataque;
    private int defensa;
    private int ataqueEsp;
    private int defensaEsp;
    private int velocidad;
    static int estamina = 100;
    private int nivel = 1;
    private int experiencia;
    private int fertilidad = 5;
    //Enums
    private Tipo tipo1;
    private Tipo tipo2;
    private Estado estado;
    Movimiento[] movimientos;

    //TODO: Hacer constructor pasándole todos los parámetros
    public Pokemon pokemonRdm(Pokemon pokemon){

        Random random = new Random();
        pokemon.vitalidad = random.nextInt(9) + 1;
        pokemon.ataque = random.nextInt(9) + 1;
        pokemon.defensa = random.nextInt(9) + 1;
        pokemon.ataqueEsp = random.nextInt(9) + 1;
        pokemon.defensaEsp = random.nextInt(9) + 1;
        pokemon.velocidad = random.nextInt(9) + 1;
        

        movimientos = new Movimiento[4];
        return pokemon;
    }

   public int getIdPokemon() {
       return idPokemon;
   }

   public void setIdPokemon(int idPokemon) {
       this.idPokemon = idPokemon;
   }
    
    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMote() {
        return this.mote;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public int getVitalidad() {
        return this.vitalidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return this.defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaqueEsp() {
        return this.ataqueEsp;
    }

    public void setAtaqueEsp(int ataqueEsp) {
        this.ataqueEsp = ataqueEsp;
    }

    public int getDefensaEsp() {
        return this.defensaEsp;
    }

    public void setDefensaEsp(int defensaEsp) {
        this.defensaEsp = defensaEsp;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getEstamina() {
        return this.estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getFertilidad() {
        return this.fertilidad;
    }

    public void setFertilidad(int fertilidad) {
        this.fertilidad = fertilidad;
    }

    public Tipo getTipo1() {
        return this.tipo1;
    }

    public void setTipo1(Tipo tipo1) {
        this.tipo1 = tipo1;
    }

    public Tipo getTipo2() {
        return this.tipo2;
    }

    public void setTipo2(Tipo tipo2) {
        this.tipo2 = tipo2;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Random getR1() {
        return this.r1;
    }

    public void setR1(Random r1) {
        this.r1 = r1;
    }
     

    //Constructor

   

    //Metodos get y set

    Random r1 = new Random();

    //Completar método (aprender ataques)
    public void subirNivel(){
        if (experiencia >= 10 * nivel) {
            nivel++;
            vitalidad = r1.nextInt(4) + 1 + vitalidad;
            ataque = r1.nextInt(4) + 1 + ataque;
            defensa = r1.nextInt(4) + 1 + defensa;
            ataqueEsp = r1.nextInt(4) + 1 + ataqueEsp;
            defensaEsp = r1.nextInt(4) + 1 + defensaEsp;
            velocidad = r1.nextInt(4) + 1 + velocidad;

        }
         
    }

    

    //Completar método
    public int atacar(){
        return 3;
    }
    

    //TODO: Completar método con el enumerado
    public Ventaja comprobarVentaja(Pokemon ejemplo){

        switch (tipo1) {
            case FUEGO : 
                if (ejemplo.tipo1 == Tipo.PLANTA || ejemplo.tipo1 == Tipo.BICHO ) {
                    return Ventaja.VENTAJA;
                    
                }
                else if (ejemplo.tipo1 == Tipo.TIERRA || ejemplo.tipo1 == Tipo.AGUA ) {
                    
                    return Ventaja.DESVENTAJA;
                    
                }
            case AGUA : 
                if (ejemplo.tipo1 == Tipo.FUEGO  || ejemplo.tipo1 == Tipo.TIERRA) {
                    
                    return Ventaja.VENTAJA;
                    
                }
                else if (ejemplo.tipo1 == Tipo.PLANTA || ejemplo.tipo1 == Tipo.ELECTRICO ) {
                    
                    return Ventaja.DESVENTAJA;
                }

            case PLANTA : 
                if (ejemplo.tipo1 == Tipo.TIERRA  || ejemplo.tipo1 == Tipo.AGUA) {
                   
                    return Ventaja.VENTAJA;    
                }
                else if (ejemplo.tipo1 == Tipo.FUEGO || ejemplo.tipo1 == Tipo.BICHO ) {
                    
                    return Ventaja.DESVENTAJA;
                }
            case VOLADOR : 
                if (ejemplo.tipo1 == Tipo.PLANTA || ejemplo.tipo1 == Tipo.BICHO) {
                    
                    return Ventaja.VENTAJA;    
                }
                else if (ejemplo.tipo1 == Tipo.ELECTRICO || ejemplo.tipo1 == Tipo.TIERRA ) {
                    
                    return Ventaja.DESVENTAJA;
                }
            case ELECTRICO : 
                if (ejemplo.tipo1 == Tipo.AGUA || ejemplo.tipo1 == Tipo.VOLADOR) {
                    
                    return Ventaja.VENTAJA;    
                }
                else if (ejemplo.tipo1 == Tipo.TIERRA || ejemplo.tipo1 == Tipo.PLANTA ) {
                    return Ventaja.DESVENTAJA;
                }
            case BICHO : 
                if (ejemplo.tipo1 == Tipo.PLANTA || ejemplo.tipo1 == Tipo.AGUA) {
                    return Ventaja.VENTAJA;
                    
                }
                else if (ejemplo.tipo1 == Tipo.FUEGO || ejemplo.tipo1 == Tipo.VOLADOR ) {
                    return Ventaja.DESVENTAJA;
                }
            case TIERRA : 
                if (ejemplo.tipo1 == Tipo.FUEGO || ejemplo.tipo1 == Tipo.ELECTRICO) {
                    return Ventaja.VENTAJA;
                      
                }
                else if (ejemplo.tipo1 == Tipo.PLANTA || ejemplo.tipo1 == Tipo.AGUA ) {
                    return Ventaja.DESVENTAJA;
                }

                break;
        
            
            
                  
        }
        return Ventaja.NEUTRO;
        
        
    }
    
    public void descansar(){
        this.estamina = 100;
    }

    //Completar método
    public void aprenderAtaque(Movimiento movimiento, int posicion){
        this.movimientos[posicion] = movimiento;
    }


    public void mostrarPokemon(Connection con) throws SQLException {
        Random rdm = new Random();
        int pokemonRandom = (rdm.nextInt(9) + 1);		
        String consulta = "SELECT * FROM POKEMON WHERE NUM_POKEDEX = " + pokemonRandom;
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(consulta);
        
        
        while (rs.next()) {
           
            this.setNumPokedex(rs.getInt("NUM_POKEDEX"));
            this.setNombre(rs.getString("NOMBRE"));
            this.setTipo1(rs.getString("TIPO1"));
           
            if(rs.getObject("TIPO2")!=null){
                this.setTipo2(Tipo.valueOf(rs.getString("TIPO2")));
            }else{
                this.setTipo2(Tipo.NULO);

            }
            this.setAtaque(rdm.nextInt(9) + 1);
            this.setAtaqueEsp(rdm.nextInt(9) + 1);
            this.setDefensa(rdm.nextInt(9) + 1);
            this.setDefensaEsp(rdm.nextInt(9) + 1);
            this.setVelocidad(rdm.nextInt(9) + 1);
            this.setVitalidad(rdm.nextInt(9) + 1);
            
            System.out.println(this.toString());
        }
        statement.close();
    }

    
    private void setTipo1(String string) {
    }





    

    public void insertarID(Connection con) throws SQLException {		
        String consulta = "SELECT MAX (ID_POKEMON) FROM POKEMON_ENTRENADOR";
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(consulta);

        while (rs.next()) {
           
            this.setIdPokemon(rs.getInt(1) + 1);

            
        }
            statement.close();

        
    }

    public void insertarPokemon(Connection con) throws SQLException {
		String sentencia ="INSERT INTO POKEDEX(ID_POKEMON, NUM_POKEDEX, ID_ENTRENADOR, MOTE, VITALIDAD, ATAQUE, ATAQUE_ESPECIAL, DEFENSA_ESPECIAL, ESTAMINA, NIVEL, FERTILIDAD, EQUIPO, EXPERIENCIA) VALUES("+ this.getIdPokemon()
        +", "+this.getNumPokedex()
        +", 1"
        +", '"+this.getMote()
        +"', "+this.getVitalidad()
        +", "+this.getAtaque()
        +", "+this.getAtaqueEsp()
        +", "+this.getDefensaEsp()
        +", "+this.getEstamina()
        +", "+this.getVelocidad()
        +", "+this.getNivel()
        +", "+this.getFertilidad()
        +", 1"
        +", 0"
        +")";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(sentencia);
			
			System.out.println("Nuevo pokemon insertado. "+this.getNombre());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			stmt.close(); 
		}
													   
	}

    public void probCapturar(Connection con) throws SQLException{

        Random randm = new Random();
        int numRnd = randm.nextInt(3) + 1;

        if (numRnd < 3) {
            System.out.println("Lo has caputrado!");
            insertarID(con);
            insertarPokemon(con);    
        }
        else{
            System.out.println("Has fracasado!");
        }





    }

    
}
