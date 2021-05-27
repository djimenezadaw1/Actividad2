package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */


public class Juego 
{
    private static int VICTORIAP1 = 0;
    private static int VICTORIAP2 = 0;

	public static void main(String args[])
    {
        Jugador p1=new Jugador();
        Jugador p2=new Jugador();
        boolean finDeJuego=false;  
        Integer rondasJugadas = 1;    // Número de rondas jugadas
        Integer empates = 0;
        String opcionJugador1, opcionJugador2;
        
        // Bucle de juego
        do {
            System.out.println("*********************** Ronda: " + rondasJugadas +" *********************\n");
            System.out.println("\tNumero de empates: "+ empates + "\n");
            opcionJugador1=p1.opcion_al_azar();
            System.out.println("\tJugador 1: " + opcionJugador1+"\t Jugador 1 - Partidas ganadas: " + p1.getExitos());
            opcionJugador2 = p2.opcion_al_azar();
            System.out.println("\tJugador 2: " + opcionJugador2+"\t Jugador 2 - Partidas ganadas: " + p2.getExitos());
            
            if((opcionJugador1.equals("piedra"))&&(opcionJugador2.equals("papel"))) {
            	VICTORIAP2++;
            	p2.setExitos(VICTORIAP2);
            	System.out.println("\n\t\t\t Jugador 2 GANA \n");
                
                
            }
            else if((opcionJugador1.equals("papel"))&&(opcionJugador2.equals("piedra"))) {
                System.out.println("\n\t\t   Jugador 1 GANA \n");
                VICTORIAP1++;
                p1.setExitos(VICTORIAP1);
            }
            else if((opcionJugador1.equals("piedra"))&&(opcionJugador2.equals("tijeras"))) {
                System.out.println("\n\t\t   Jugador 1 GANA \n");
                VICTORIAP1++;
                p1.setExitos(VICTORIAP1);
            }
            else if((opcionJugador1.equals("tijeras"))&&(opcionJugador2.equals("piedra"))) {
            	VICTORIAP2++;
            	p2.setExitos(VICTORIAP2);
                System.out.println("\n\t\t   Jugador 2 GANA \n");
            }
            else if((opcionJugador1.equals("tijeras"))&&(opcionJugador2.equals("papel"))) {
            	VICTORIAP1++;
                p1.setExitos(VICTORIAP1);
                System.out.println("\n\t\t   Jugador 1 GANA \n");
            }
            else if((opcionJugador1.equals("papel"))&&(opcionJugador2.equals("tijeras"))) {
            	VICTORIAP2++;
            	p2.setExitos(VICTORIAP2);
            	System.out.println("\n\t\t   Jugador 2 GANA \n");
            }
            if(opcionJugador1==opcionJugador2) {
            	empates++;
                System.out.println("\n\t\t\t  Empate \n");
            }
            rondasJugadas++;
            if((p1.getExitos()>=3)||(p2.getExitos()>=3)) {
            	finDeJuego=true;
                System.out.println("\n\t\t\t  FIN DEL JUEGO!! \n");
            }
            System.out.println();
        } while(finDeJuego!=true);
    }
}
/**
 *
 */
class Jugador{
	// Atributos
	private int exitos;      // número de partidas ganadas
   
    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcion_al_azar()
    {
        String opcion="";
        Integer c = (int)(Math.random() * 3);
        switch(c){
            case 0:
            	opcion=("piedra");
                break;
            case 1:
            	opcion=("papel");
                break;
            case 2:
            	opcion=("tijeras");
        }
        return opcion;
    }

	public int getExitos() {
		return exitos;
	}

	public void setExitos(int exitos) {
		this.exitos = exitos;
	}
    
   
    
}
