package basics;

public class Array {
    public static void main(String[] args){
        int[] numbers;
        numbers = new int[4];
        numbers[0] = 13;
        numbers[1] = 25;
        numbers[2] = 46;
        numbers[3] = 50;
    
    // System.out.println(numbers[0]);
    // System.out.println(numbers[1]);
    // System.out.println(numbers[2]);
    // System.out.println(numbers[3]);

    // int[] arr = {3, 4, 5, 6, 8};
    // for (int i = 0; i < arr.length; i++){
    //     System.out.println(arr[i]);
    // }
    String[] firstNames = new String[3];
    firstNames[0] = "Rubin";
    firstNames[1] = "Aljis";
    firstNames[2] = "Elian";
    String[] names = {"Rakib", "Farid", "Fahim"};

    // for(String name: names){
    //     System.out.println(name);
    // }

    for (int i = 0; i < names.length; i++){
        String name = firstNames[i] + " " + names[i];
        System.out.println(name);
    }




    }
}   
