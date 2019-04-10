package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Color extends PApplet

{	
    public int rgb;
    public int value;
    private String color;

    public Color(String color, int rgb, int value)
    {
        this.color = color;
        this.rgb = rgb;
        this.value = value;
    }

    public Color(TableRow tr)
    {
        // Constructor chaining
        this(tr.getString("Color"), tr.getInt("rgb"),tr.getInt("Value"));
    }



    public String toString()
    {
        return color + "\t" +  + rgb + value;
    }

}
