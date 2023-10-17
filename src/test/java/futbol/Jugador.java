package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	

	public Jugador() {
		super();
		this.golesMarcados=289;
		this.dorsal=7;
	}

	public Jugador(String nombre,int edad,String posicion, short golesMarcados,byte dorsal) {
		super(nombre,edad,posicion);
		this.golesMarcados=golesMarcados;
		this.dorsal=dorsal;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Jugador) {
	        Jugador jugador = (Jugador) o; // Realizamos un casting a tipo Portero
	        return Math.abs(this.getEdad()-jugador.getEdad());
	    } else {
	        
	        return 0; 
	    }
		 
	}
	

	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+ ", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+ ". Ha marcado "+this.golesMarcados;
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
	}
	
	
}