package com.goit.module2;

class ProfessorHelper {
    public boolean areNumbersCool(int number1, int number2) {
        return number1 == number2;
    }
    public boolean areNumbersFatal(int first, int second){
        return (first*5)+3==second;
    }
    public boolean canPrincessMarry(int day){
return day>15;
    }
    //Test output
    public static void main(String[] args) {
        ProfessorHelper helper = new ProfessorHelper();
        System.out.println("areNumbersCool(3, 3) = " + helper.areNumbersCool(3, 3));
        System.out.println("areNumbersFatal(1, 8) = " + helper.areNumbersFatal(1, 8));
        System.out.println("areNumbersFatal(1, 8) = " + helper.areNumbersFatal(1, 9));
        System.out.println("canPrincessMarry(16) = " + helper.canPrincessMarry(16));
        System.out.println("canPrincessMarry(4) = " + helper.canPrincessMarry(4));
    }
}
