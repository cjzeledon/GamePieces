package com.TheIronYard;

public class Main {

    public static void main(String[] args) {
        // Create a GamePiece object
        // Only call the methods on the object, do not access the instance variables directly.
        GamePiece hitIt = new GamePiece();

//        hitIt.move(10, 50);
//        System.out.println(hitIt.getPositionX());
//
//        hitIt.freeze(); // value of frozen is true, so do not move
//        hitIt.move(5,6);
//        System.out.println(hitIt.move(5, 6);
//
//        hitIt.unfreeze();
//        hitIt.move(4, 2);

        System.out.println("Verify that if the game piece is not frozen then the call to freeze sets the frozen variable to true.");
        hitIt.unfreeze();
        hitIt.moveRandom();
        hitIt.move(9,4);
        hitIt.freeze();
        System.out.println("The frozen variable is now set to " + hitIt.frozen);

        System.out.println("Verify that if the game piece is frozen then the call to unfreeze sets the frozen variable to false.");
        hitIt.freeze();
        hitIt.moveRandom();
        hitIt.move(3,10);
        hitIt.unfreeze();
        System.out.println("The frozen variable is now set to " + hitIt.frozen);

        System.out.println("Verify that if the game piece is frozen then the call to unfreeze sets the frozen variable to false.");
        hitIt.freeze();
        hitIt.moveRandom();
        hitIt.move(24,45);
        hitIt.unfreeze();
        System.out.println("The frozen variable is now set to " + hitIt.frozen);

        System.out.println("Verify that if the game piece is not frozen then the call to move results in the new position.");
        hitIt.unfreeze();
//        hitIt.move(32,87);
//        hitIt.freeze();
//        System.out.println("The frozen variable is now set to " + hitIt.frozen);

        System.out.println("Verify that if the game piece is frozen then the call to move does not change the position.");
//        hitIt.unfreeze();
//        hitIt.move(32,87);
//        hitIt.freeze();
//        System.out.println("The frozen variable is now set to " + hitIt.frozen);

    }
}
