package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{	

	ArrayList<Color> Colors = new ArrayList<Color>();

	public void loadColors(){

		Table table = loadTable("colours.csv", "header");
        for(TableRow tr:table.rows())
        {
            Color c = new Color(tr);
			Colors.add(c);
		}
	}

	public void printColors(){

		for(int i = 0 ; i < Colors.size() ; i ++)
        {
			System.out.println(Colors.get(i));  
        }

	}

	public void findColor(){

	}

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
	}
}
