package Model;

public class Corsa 
{
	private int x_iniziale;
	private int y_iniziale;
	private int x_finale;
	private int y_finale;
	private int tempo_iniziale;
	private int tempo_finale;
	private int distanza_in_abs;
	static private int id_corsa=0;
	private int id;
	
	public Corsa(int x_iniziale, int y_iniziale, int x_finale, int y_finale, int tempo_iniziale, int tempo_finale) {
		super();
		this.x_iniziale = x_iniziale;
		this.y_iniziale = y_iniziale;
		this.x_finale = x_finale;
		this.y_finale = y_finale;
		this.tempo_iniziale = tempo_iniziale;
		this.tempo_finale = tempo_finale;
		this.distanza_in_abs=Math.abs(x_iniziale-x_finale)+Math.abs(y_iniziale-y_finale);
		id=id_corsa++;
	}
	public static int getId_corsa() {
		return id_corsa;
	}
	public static void setId_corsa(int id_corsa) {
		Corsa.id_corsa = id_corsa;
	}
	public int getDistanza_in_abs() {
		return distanza_in_abs;
	}
	public void setDistanza_in_abs(int distanza_in_abs) {
		this.distanza_in_abs = distanza_in_abs;
	}
	public int getX_iniziale() {
		return x_iniziale;
	}
	public void setX_iniziale(int x_iniziale) {
		this.x_iniziale = x_iniziale;
	}
	public int getY_iniziale() {
		return y_iniziale;
	}
	public void setY_iniziale(int y_iniziale) {
		this.y_iniziale = y_iniziale;
	}
	public int getX_finale() {
		return x_finale;
	}
	public void setX_finale(int x_finale) {
		this.x_finale = x_finale;
	}
	public int getY_finale() {
		return y_finale;
	}
	public void setY_finale(int y_finale) {
		this.y_finale = y_finale;
	}
	public int getTempo_iniziale() {
		return tempo_iniziale;
	}
	public void setTempo_iniziale(int tempo_iniziale) {
		this.tempo_iniziale = tempo_iniziale;
	}
	public int getTempo_finale() {
		return tempo_finale;
	}
	public void setTempo_finale(int tempo_finale) {
		this.tempo_finale = tempo_finale;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
