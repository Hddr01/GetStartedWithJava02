package org.example;

public class Main {

    public static int[] main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; i++){
                if ((nums[i] + nums[j] == target)) {
                    return new int[] {i,j};
                }
            }
        }

        return null;
    }
}
