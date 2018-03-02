package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main 
{

	public static void main(String[] args) 
	{
		String pathFile="src/a_example.in";
		String nameFile="a.in";
		Mappa m = null;
		
		FileReader reader;
		try {
			reader = new FileReader(pathFile);
			BufferedReader buffer=new BufferedReader(reader);
			String line="";
			int line_numero=1;
			while((line=buffer.readLine())!=null)
			{
				String []splitLines=line.split(" ");
				if(line_numero==1)
				{
					m= new Mappa(Integer.parseInt(splitLines[0]), Integer.parseInt(splitLines[1]),Integer.parseInt(splitLines[2]),Integer.parseInt(splitLines[3]),Integer.parseInt(splitLines[4]),Integer.parseInt(splitLines[5]));
					
				}
						
				if(line_numero > 1)
				{
					//corse
					Corsa c=new Corsa(Integer.parseInt(splitLines[0]), Integer.parseInt(splitLines[1]),Integer.parseInt(splitLines[2]),Integer.parseInt(splitLines[3]),Integer.parseInt(splitLines[4]),Integer.parseInt(splitLines[5]));
					m.aggiungiCorsa(c);
					
				}
				line_numero++;
				
			}
			m.getCorseDaFare().sort(( c1, c2)-> { 
				return Integer.compare(c1.getTempo_iniziale() , c2.getTempo_iniziale());
			});
			List<Auto> auto_copy=new ArrayList<Auto>(m.getAutos());
			for (Corsa a : m.getCorseDaFare()) 
			{
				int min_distanza=Integer.MAX_VALUE;
				Auto autoDiGemod=null;
				for(Auto o: m.getAutos())
				{
					int distanza=m.distanza(o.getX(),o.getY(),a.getX_iniziale(),a.getY_iniziale());
					if(a.getTempo_finale() <= distanza || distanza<min_distanza)
					{
						min_distanza=distanza;
						autoDiGemod=o;
					}
					
				}
				auto_copy.sort(( c1, c2)-> { 
					return Integer.compare(c1.getDistanza_Tempo() , c2.getDistanza_Tempo());
				});
				
				int minima_distanza=Integer.MAX_VALUE;
				for(Auto auto : auto_copy)
				{
					
					int distanza=m.distanza(auto.getX(),auto.getY(),a.getX_iniziale(),a.getY_iniziale());
					if(distanza <= minima_distanza && auto.getDistanza_Tempo() < autoDiGemod.getDistanza_Tempo())
					{	
						autoDiGemod=auto;
					}
				}
				if((min_distanza+a.getDistanza_in_abs()+autoDiGemod.getDistanza_Tempo())<m.getSteps())
				{
					autoDiGemod.setX(a.getX_finale());
					autoDiGemod.setY(a.getY_finale());
					autoDiGemod.setDistanza_Tempo(min_distanza+autoDiGemod.getDistanza_Tempo());
					autoDiGemod.getCorseEffettuate().add(a);
				}

			}
			String output="";
			for (Auto a : m.getAutos()) 
			{
				output+=a.getCorseEffettuate().size()+" ";
				for(Corsa c : a.getCorseEffettuate())
				{
					output+=c.getId()+" ";
				}
				output+="\n";
			}
			System.out.println(output);
			BufferedWriter writer= new BufferedWriter(new FileWriter(nameFile));
			writer.write(output);
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}

