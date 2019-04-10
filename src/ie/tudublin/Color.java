package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Color extends PApplet

{	
    public int r;
    public int g;
    public int b;
    public int value;
    private String colour;

    public Color(String colour, int r, int g, int b, int value)
    {
        this.colour = colour;
        this.r = r;
        this.g = g;
        this.b = b;
        this.value = value;
    }

    public Color(TableRow tr)
    {
        this(tr.getString("colour"), tr.getInt("r"), tr.getInt("g"), tr.getInt("b"),  tr.getInt("value"));
        
    }

    public int getValue(){
        return value;
    }

    public String toString()
    {
    return colour + "\t" +  r + g + b + value;
    }

}
