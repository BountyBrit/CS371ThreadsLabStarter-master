package edu.up.cs301threadslab;

public class ThreadedStarAnimation extends Thread {
    StarAnimation mySA;
    public ThreadedStarAnimation(StarAnimation newSA){
        super();
        mySA = newSA;
    }
//    @Override
    public void run(){
        while(true){
            if(Math.random() >= 0.5){
                mySA.addStar();
            } else {
                mySA.removeStar();
            }
            //try-catch for exception
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
