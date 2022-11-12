package com.goit.module2;

public class ExonNames {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        String lowerCaseName = name.toLowerCase();
        return lowerCaseName.contains("a") || lowerCaseName.contains("o");
    }

    //Test output
    public static void main(String[] args) {
        ExonNames names = new ExonNames();

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);

        //Should be "exor BIGO"
        String fullName = names.makeFullName("exor", "bigo");
        System.out.println("names.makeFullName(\"exor\", \"bigo\") = " + fullName);

        //Should be true
        boolean isNameLucky = names.isNameLucky("Bigo");
        System.out.println("names.isNameLucky(\"Bigo\") = " + isNameLucky);

        //Should be BA
        String nameCode = names.getNameCode("boRA");
        System.out.println("names.getNameCode(\"boRA\") = " + nameCode);

        //Should be true
        boolean isMoneyName = names.isMoneyName("31Boss31");
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);

        //Should be true
        boolean isInvisible = names.isInvisibleName(" ");
        System.out.println("names.isInvisibleName(\" \") = " + isInvisible);


        //Should be YesMont
        String positive = names.makeNamePositive("NoMont");
        System.out.println("names.makeNamePositive(\"NoMont\") = " + positive);

        //Should be CLEANdirtyCLEAN
        String cleanName = names.makeNameClean(" dirty ");
        System.out.println("names.makeNameClean(\" dirty \") = " + cleanName);

        //Should be Gu
        String halfOfName = names.makeHalfOfName("Gurk");
        System.out.println("names.makeHalfOfName(\"Gurk\") = " + names.makeHalfOfName("Gurk"));
    }


    public String getNameCode(String name) {
        int length = name.length();
        if (length == 1) {
            return name.toUpperCase();
        } else {
            return (String.valueOf(name.charAt(0)) + String.valueOf(name.charAt(name.length() - 1))).toUpperCase();
        }
    }
    public boolean isMoneyName(String name){
        char symbol = '5';
        //boolean isMoneyName = symbol> '0' && symbol <= '9';
         char firsfL = name.charAt(0) ;
        boolean isDigitFirsfL = firsfL > '0' && firsfL <= '9';
        char lastL = name.charAt(name.length()-1);
        boolean isDigitLastL = lastL > '0' && lastL <= '9';

        return  isDigitFirsfL && isDigitLastL;
    }
    public boolean isInvisibleName(String name){
return name.isBlank();
    }
    public String makeNamePositive(String name){
        //String part1 = name.substring(0,2);
        // String part2 = name.substring(2);
        // System.out.println("part1  " + part1);
        // System.out.println("part2  " + part2);
        // return " ";

        //String replace = name.replace("no","yes");
        // name.replace("No", "yes");
        //replace = name.replace("nO", "yes");
        //replace = name.replace("NO", "yes");
        //return replace;
        name = name.replace("no", "yes")
                .replace("NO", "yes")
                .replace("No", "yes")
                .replace("nO", "yes");
return name;
    }
    public String makeNameClean(String name){
        return "CLEAN"+name.trim()+"CLEAN";
    }
    public String makeHalfOfName(String name){
        String part1 = name.substring(0,name.length()/2); //);
        return part1;//String.valueOf(name.length()/2);
    }
}

