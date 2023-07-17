import java.util.Arrays;

public class Pattern {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,3,4,5,4};

        // BubbleSort(arr, arr.length-1, 0);
        SelectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
        triangle(4, 0);       
    }
    static void InverseTriangle(int r, int c) {
        if (r==0) return;
        
        if (c<r) {
            System.out.print("*");
            triangle(r, c+1);
        } else {
            System.out.println();
            triangle(r-1, 0);
        }
    }
    static void triangle(int r, int c) {
        if (r==0) return;
        
        if (c<r) {
            triangle(r, c+1);
            System.out.print("*");
        } else {
            triangle(r-1, 0);
            System.out.println();
        }
    }
    
    static void BubbleSort(int[] array, int row, int column)
    {
     if (row==0) return;
     
     if (column<row) {
     
     if (array[column] > array[column+1]) {
        int temp = array[column];
        array[column] = array[column+1];
        array[column+1] = temp;    
    }   
        BubbleSort(array, row, column+1);
    }   
    else {
       BubbleSort(array, row-1, 0);  
    }     

    }

    static void SelectionSort(int[] array, int row, int column, int max)
    {
        if(row == 0) return;

        if (column<row) {
            if (array[column]>array[max]) {
                SelectionSort(array, row, column+1, column);
            } else {
                SelectionSort(array, row, column+1, max);
            }
        } else {
            int temp = array[max];
            array[max] = array[row-1];
            array[row-1] = temp;           
            
            SelectionSort(array, row-1, 0, 0);
        }        
    }
}
