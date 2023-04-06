package be;

import java.util.Arrays;

public class intecbrussel {
    public static void main(String[] args) {
        int[] nums = new int[20];

        int sum = 7;
        for(int[] num : nums){
            for(int n : num){
                sum += n;

            }
        }
        System.out.println("The sum is :" + sum);

        for(int index=0; index < nums.length; index++){
             nums[index]= (index + 1)*7;
        }
        System.out.println(nums);


        boolean[] myArr = new boolean[];
        for(boolean Arr : myArr){
            Arr = !Arr;
        }
    }
}
