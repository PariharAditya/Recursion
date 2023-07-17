// package Array;

// public class TargetSum {
//     int count = 0;

//     public static void main(String[] args) {

//         int[] array = { 1, 1, 1, 1, 1 };
//         int target = 3;

//         findSum(array, 0, 0, target);

//     }
//     private static int findTargetSumWays(int[] nums, int target) {
//         findSum(nums, 0, 0, target);
//         return count;        
//     }

//     private static void findSum(int[] array, int index, int tempT, int target) {
//         if (index == array.length) {

//             if (tempT == target) {
//                 count++;
//             }
//             return;
//         }

//         findSum(array, index + 1, tempT + array[index], target);
//         findSum(array, index + 1, tempT - array[index], target);
//     }

// }
