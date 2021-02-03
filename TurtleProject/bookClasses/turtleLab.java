package bookClasses;


/**
 * Write a description of class turtleLab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class turtleLab
{
    public static void main(String []args)
    {
      World world = new World(false);
      Turtle turtle = new Turtle(world);
      turtle.drawCircle(200);  
      turtle.turn(-90);
      turtle.penUp();
      turtle.forward(200);
      turtle.penDown();
      turtle.drawSquare(200);
      turtle.penUp();
      turtle.forward(400);
      turtle.penDown();
      turtle.drawHex(100);
      turtle.penUp();
      turtle.forward(200);
      turtle.penDown();
      turtle.drawRec(100,200);
      turtle.penUp();
      turtle.forward(200);
      turtle.penDown();
      turtle.drawEquilateralTriangle(200); 
      turtle.turn(90);
      turtle.penUp();
      turtle.forward(200);
      turtle.penDown();
      turtle.randomWalk(50); 
      turtle.penUp();
      turtle.moveTo(960,540);
      turtle.turnToFace(1920,540);
      turtle.forward(600);
      turtle.penDown();
      for(int i = 32; i>=0; --i)
      {
          turtle.drawSquare(100);
          turtle.turn(11.25);
        }
      turtle.turn(90);
      turtle.penUp();
      turtle.forward(400);
      turtle.penDown();
      for (int i = 12; i>=0; --i)
      {
         turtle.drawHex(50);
         turtle.turn(90);
        }
      
     
        
        
        
      world.setVisible(true);
    }
}
