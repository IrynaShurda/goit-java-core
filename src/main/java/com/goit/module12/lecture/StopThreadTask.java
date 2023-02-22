package com.goit.module12.lecture;

public class StopThreadTask {
    public static void main(String[] args) throws InterruptedException {
        StoppableThread thread = new StoppableThread();
        thread.start();
        Thread.currentThread().sleep(7000);
        thread.setAlive(false);
        System.out.println("continue main method");

    }

    public static class StoppableThread extends Thread {
        private boolean isAlive = true;
        @Override

        public void run() {
            while (isAlive) {
                System.out.println("Time " + System.currentTimeMillis());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }



        public void setAlive(boolean alive) {
            isAlive = alive;
        }
    }
}
