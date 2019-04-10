package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Resistor extends PApplet

{	
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public Resistor(TableRow tr)
    {
        
    }

    public Resistor(int value)
    {
        this.value = value;
        hundreds = (value / 100);
        tens = (value - (hundreds * 100)) / 10;
        ones = value - ((hundreds * 100)  + (tens * 10));
        print(hundreds + ",");
        print(tens + ",");
        println(ones);
    }

}
