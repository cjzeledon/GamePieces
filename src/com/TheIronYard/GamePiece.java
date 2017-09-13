package com.TheIronYard;
import java.util.Random;


public class GamePiece {

    // Set of fields (or are these called required instance variables?)
    // This set of fields is visible to the entire class itself
    private Integer positionX;
    private Integer positionY;
    Boolean frozen;
    String name;
    String color;

    // Add an empty constructor (no parameters). (IntelliJ can generate these for you)
    // In the constructor set the position variables to zero and frozen to false.
    // When setting the Class and then the public, the variable is usually the same variable
    public GamePiece() {
        positionX = 0;
        positionY = 0;
        frozen = false; // This means that it is NOT frozen
    }

    public Integer getPositionX() {
        return positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    public Boolean getFrozen() {
        return frozen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // When the move method has a parameter set (i.e. "Integer X, Integer Y"), it means that you are telling the computer that you will
    // provide the inputs to that parameter.
    public void move(Integer X, Integer Y) {
        // look at the frozen field
        // if the frozen field = true move the piece
        // if the frozen field = false don't allow the piece to move
        if (this.frozen == true) {
            this.positionX = X;
            this.positionY = Y;
            System.out.println("The manual input for X position is: " + this.positionX);
            System.out.println("The manual input for Y position is: " + this.positionY);
        } else {
            System.out.println("You are so manually frozen!");
        }
    }

    // The parameter of move method does not need to be assigned if you simply want the computer to move pass and run
    // the next block of code within that method.
    // You can easily set the X.nextInt() as it is and it will give you LARGE random numbers (and weird)
    // Otherwise, set X.nextInt(100) which will give you the random number up to 99. If you want 100, you need to add a plus 1 which will
    // look like this X.nextInt(100)+1
    // Random X = new Random();
    // Random is a type of object
    // X is variable name
    // Random() is new constructor
    public void moveRandom() {
        if (this.frozen == true) {
            Random X = new Random();
            this.positionX = X.nextInt();
            Random Y = new Random();
            this.positionY = Y.nextInt();
        } else {
            System.out.println("You are randomly frozen!");
        }
        System.out.println("The randomized X position is: " + this.positionX);
        System.out.println("The randomized Y position is: " + this.positionY);
    }

    // Creates a method that initialize instance variables
    // Since the method contains a void, it returns nothing
    // Add a freeze() method (returns void) and set frozen to true
    public void freeze() {
        this.frozen = true; // Indicates that freeze IS frozen
    }

    // Creates a method that initialize instance variables
    // Since this method contains void, it will not return anything
    public void unfreeze() {
        this.frozen = false; // Indicates that the unfreeze is NOT frozen
    }

    // Extras - Incomplete
    // Add four instance variables (minX, maxX, minY, maxY) to define the bounds of a grid confining the game piece (e.g. x is bounded by zero and 100 and y is bounded by zero and 500). Set the values in the constructor. Add getter methods.
    // Refactor the move() method to not allow the game piece to move outside the grid (move the piece to the border of the grid but not beyond).
    // Test the movement in the main method of Main.java.
}
