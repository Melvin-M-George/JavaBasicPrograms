import java.util.Scanner;
public class CWH_29_Practice_Set_6 {
    public static void main(String[] args) {
        //Question-1
        /*
        float[] marks = {98.5f,95.5f,92.5f,97.0f,96.0f};

        float sum =0;
        for(int i =0;i< marks.length;i++){
            sum = sum + marks[i];
        }
        System.out.printf("The sum of marks is %f",sum);


        for(float element: marks){
            sum = sum + element;
        }
        System.out.println(sum);

         */

        //Question-2
        /*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] marks = {99,98,97,96,95};
        boolean isInArray = false;
        for (int i=0;i< marks.length;i++){
            if(num==marks[i]){
                isInArray=true;
            }
        }
        if(isInArray){
            System.out.println("The integer is present in the array");
        }
        else {
            System.out.println("The integer is not present in the array");
        }

         */
        //Question-3
        /*
        int [] marks = {99,98,97,96,95};
        float sum = 0;
        for(int element:marks){
            sum = sum + element;
        }
        System.out.println("Average of marks is " + (sum/ marks.length));

         */
        //Question-4
        int [][] mat1 ={{1,2,3},{4,5,6}};
        int [][] mat2 ={{7,8,9},{10,11,12}};
        int [][] result = {{0,0,0},{0,0,0}};
        for(int i=0;i< mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int i=0;i< mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println(" ");
        }








    }
}
