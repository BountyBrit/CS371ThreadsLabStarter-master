package edu.up.cs301threadslab;

public class ThreadedAnimationView extends Thread {
    private AnimationView myAV;
    public ThreadedAnimationView (AnimationView myAv) {
        super();
        this.myAV = myAv;
    }

    @Override
    public void run(){
        while(true) {
            myAV.postInvalidate();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
