package com.goit.module5;

public class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }



//    @Override
//    public String toString() {
//        int[] nominalStar ={ 1000, 100, 10, 1};
//        int counter = 0;
//        int divSum;
//        String res="";
//        int count = getCount();
//
//        while (counter < nominalStar.length) {
//            int nominal = nominalStar[counter];
//            if (count >= nominal) {
//                divSum = count / nominal;
//                res= res + nominalStar[counter]+" ";
//                 count= count - nominal * divSum;
//            }
//            counter++;
//        }
//        return res;
//    }


    @Override
    public String toString() {
        int[] nominalStar ={ 1000, 100, 10, 1};
        int counter = 0;
        String res="";
        int count = getCount();

        while (counter < nominalStar.length) {
            int nominal = nominalStar[counter];
            if (count >= nominal) {
                count = count - nominal;
                res= res + convertToSymbol(nominal);

            }
            if (count >= nominal){
                counter = counter;
            }if (count < nominal){
                counter++;
            }
        }
        return res;
    }

    public String convertToSymbol(int number){
        String resSymbol="";
        switch (number){
            case 1000:
                resSymbol="X";
                break;
            case 100:
                resSymbol="Y";
                break;
            case 10:
                resSymbol="Z";
                break;
            case 1:
                resSymbol="*";
                break;
        }
        return resSymbol;
    }


    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }
}