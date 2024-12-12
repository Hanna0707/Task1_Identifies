package week11.morning;

public class Task1_Identifies {
    public static void main(String[] args) {
        // indexes:  0       1         2        3
        String[] array = {"Java", "Python", "Python", "Ruby",
                //        4       5
                "Ruby", "C#"};
/*
        System.out.println("array[0] = " + array[0]);
        System.out.println("array[1] = " + array[1]);

        //if you need to know index of each element(1st iteration ,2nd....)
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
         // if you need each element only
        for (String each : array){
            System.out.println(each);
        }*/
     // 1. Get the element one by one
     // 2. Count the element(by the creating a method)
     // 3. If my count time is 1 it means that element is unique

        // 1. Get the element one by one
        for (String each : array){

             // 2. Count the element by the creating a method
            int result = countThElement(array,each);

            // 3. If my count time is 1 it means that element is unique
            if (result == 1 ){
                System.out.println(each);
            }

        }

    }

    public static int countThElement(String[] array, String each) {

        int counter = 0;

      //Comparing first ,nd,rd,...ele-t with each elem. of array
        for (String stNdRd : array) {
            if (stNdRd.equals(each)){
                counter++;
            }

        } return counter;
    }
}
