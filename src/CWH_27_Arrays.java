public class CWH_27_Arrays {
    public static void main(String[] args) {
        /*
        float [] marks1 ={99.0f,98.5f,97.5f,93,5f,94.0f};
        System.out.println(marks.length);
        String [] name = {"M","E","L","V","I","N"};
        System.out.println(name.length);

        */

        int [] marks = {99,98,97,96,95};
        System.out.println("Printing the array");
        for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Printing the array in the reverse order");
        for(int i= marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("Printing the array using for each loop");
        for(int element : marks){
            System.out.println(element);
        }


    }
}
