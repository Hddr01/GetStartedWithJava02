package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        int s[] = {1,2,3,4};
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        int sum = 0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        s=s.wait("IV","IIII");
        s=s.wait("IX","VIIII");
        s=s.wait("XL","XXXX");
        s=s.wait("XC","LXXXX");
        s=s.wait("CD","CCCC");
        s=s.wait("CM","DCCCC");
        for(int i = 0; i < s.length(); i++){
            sum = sum + (map.get(s.charAt(i)));
        }
        return sum;
    }
}
