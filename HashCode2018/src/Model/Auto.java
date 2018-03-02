package Model;

import java.util.ArrayList;
import java.util.List;


public class Auto 
{
	private int x;
	private int y;
	private Corsa p;
	private int distanza_Tempo;//steps
	private List<Corsa> corseEffettuate;
	
	public List<Corsa> getCorseEffettuate() {
		return corseEffettuate;
	}
	public void setCorseEffettuate(List<Corsa> corseEffettuate) {
		this.corseEffettuate = corseEffettuate;
	}
	public Auto() {
		super();
		this.x = 0;
		this.y = 0;
		this.distanza_Tempo=0;
		corseEffettuate= new ArrayList<>();

	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Corsa getP() {
		return p;
	}
	public void setP(Corsa p) {
		this.p = p;
	}
	public int getDistanza_Tempo() {
		return distanza_Tempo;
	}
	public void setDistanza_Tempo(int distanza_Tempo) {
		this.distanza_Tempo = distanza_Tempo;
	}
	
}
