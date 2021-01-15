
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        
        
    } 
    public static int smallest(int[] array){
        int z = array[0];
        for(int number: array){
            if(number < z){
                z = number;
            }
        }
        return z;
    }
    
    public static int indexOfSmallest(int[] array){
        int z = array[0];
        int index = 0;
        int i = 0;
        for(int number: array){
            if(number < z){
                z = number;
                index = i;
            }
            i++;
        }return index;
    }
    public static int indexOfSmallestFrom(int[] array, int startIndex){
        int z = array[startIndex];
        int index = startIndex;
        while(startIndex < array.length){
            if(array[startIndex] < z){
                z = array[startIndex];
                index = startIndex;
            }
            startIndex++;
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array){
        int i = 0;
        int smallestFrom;
        System.out.println(Arrays.toString(array));
        while(i < array.length){
            smallestFrom = indexOfSmallestFrom(array, i);
            swap(array, i, smallestFrom);
            System.out.println(Arrays.toString(array));
            i++;
        }
    }
}
