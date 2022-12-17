package com.goit.module6;

public class GameMenuTest {
    public static void main(String[] args) {
        GameMenu menu = new GameMenu();

        //options
        menu.act(new GameMenu.Options());

        //start
        menu.act(new GameMenu.Start());

        //exit
        menu.act(new GameMenu.Exit());
    }
}
class GameMenu{
    static abstract class MenuItem{
        public abstract String getAction();
    }

    void act(MenuItem item){
        System.out.println(item.getAction());
    }


    public static class Start extends MenuItem {
        @Override
        public String getAction() {
            return "start";
        }
    }
    public static class Options extends MenuItem{
        @Override
        public String getAction() {
            return "options";
        }
    }

    public static class Exit extends MenuItem{
        @Override
        public String getAction() {
            return "exit";
        }
    }
}
