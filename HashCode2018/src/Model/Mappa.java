package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Mappa 
{
	private int r;
	private int c;
	private int steps;
	private List<Corsa> corseDaFare;
	private List<Corsa> fatte;
	private List<Auto> autos;
	private int bonus;
	private int veicoli; //numeri auto
	private int viaggi; //numero corse
	private int [][]M;
	
	
	
	
	public Mappa(int r, int c,int veicoli,int viaggi ,int bonus,int steps) {
		super();
		this.r = r;
		this.c = c;
		this.steps = steps;
		this.corseDaFare =new ArrayList<>(viaggi);
		this.fatte = new ArrayList<>();
		this.autos = new ArrayList<>(veicoli);
		for(int i = 0;i < veicoli; i++) {
			autos.add(new Auto());
		}
		M = new int [r][c];
		this.veicoli=veicoli;
		this.bonus=bonus;
		this.viaggi=viaggi;
	}
	public boolean aggiungiCorsa(Corsa c)
	{
		corseDaFare.add(c);
		return true;
	}
	public boolean aggiungiAuto(Auto a)
	{
		autos.add(a);
		return true;
	}
	public boolean rimuoviCorsaFatta(Corsa c)
	{
		fatte.add(c); 
		corseDaFare.remove(c);
		 return true;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getSteps() {
		return steps;
	}
	public void setSteps(int steps) {
		this.steps = steps;
	}
	public List<Corsa> getCorseDaFare() {
		return corseDaFare;
	}
	public void setCorseDaFare(List<Corsa> corseDaFare) {
		this.corseDaFare = corseDaFare;
	}
	public List<Corsa> getFatte() {
		return fatte;
	}
	public void setFatte(List<Corsa> fatte) {
		this.fatte = fatte;
	}
	public List<Auto> getAutos() {
		return autos;
	}
	public void setAutos(List<Auto> autos) {
		this.autos = autos;
	}
	public int[][] getM() {
		return M;
	}
	public void setM(int[][] m) {
		M = m;
	}
	public int distanza(int x, int y,int x2, int y2 )
	{
		return (Math.abs(x-x2)+Math.abs(y-y2));
	}
}
