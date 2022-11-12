package com.goit.module2;

public class NameEncoderDecoder {
    public static void main(String[] args) {
        NameEncoderDecoder coder = new NameEncoderDecoder();
        System.out.println(coder.encode("Crab"));
        System.out.println(coder.decode("NOTFORYOUCr5bYESNOTFORYOU"));
        System.out.println(coder.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
    }
    public String encode(String name){
        return "NOTFORYOU" + name  .replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a", "5") + "YESNOTFORYOU";
    }
    public String decode(String name) {
        String step1 = name.replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a");
        String part1 = step1.substring(9,step1.length()-12);
        return part1 ;
    }
}
