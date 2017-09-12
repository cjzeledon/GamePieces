package com.TheIronYard;

public class Main {

    public static void main(String[] args) {
	// write your code here
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

        hitIt.freeze();

        hitIt.move(3,5);

        hitIt.unfreeze();

        hitIt.move(3,5);

    }
}
