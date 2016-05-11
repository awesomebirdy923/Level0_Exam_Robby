

import java.awt.Color;

import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class CodingExercise1
{
	public static void main(String[] args)
	{
		// 3. ask the user what color they would like the tortoise to draw
		String input = JOptionPane.showInputDialog("Color??");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if(input.equalsIgnoreCase("red")){
			Tortoise.setPenColor(Color.red);
		} else{
			Tortoise.setPenColor(Color.blue);
		}
		Tortoise.setPenWidth(10);
		// 2. set the pen width to 10
		for(int i = 0; i < 4; i++){
			Tortoise.turn(90);
			Tortoise.move(100);
		}
		// 1. make the tortoise draw a shape
		
	}
}




