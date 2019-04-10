package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{	

	ArrayList<Color> Colors = new ArrayList<Color>();
	ArrayList<Resistor> resistors = new ArrayList<Resistor>();

	public void loadColors(){

		Table table = loadTable("colours.csv", "header");
        for(TableRow tr:table.rows())
        {
            Color c = new Color(tr);
			Colors.add(c);
			System.out.println(Colors.get(1));
		}
	}

	public void loadResistors(){
		Table table = loadTable("resistors.csv", "header");
        for(TableRow tr:table.rows())
        {
            Resistor r = new Resistor(tr);
			resistors.add(r);
		}
	}

	public void printColors(){

		for(int i = 0 ; i < Colors.size() ; i ++)
        {
			System.out.println(Colors.get(i));  
        }

	}

	 ///public void findColor(int value){
		///for(int i = 0 ; i < Colors.size() ; i ++)
        ///{
			///if(Color.getValue (i) == value){
				///System.out.println(Colors.get(i)); 
			///} 
        ///}
		
	///}
	
	

	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
	}
	
	public void draw()
	{			
		noFill();
		rect(150,100,200,200);
		line(150,200,50,200);
		line(350,200,450,200);
	}
}
