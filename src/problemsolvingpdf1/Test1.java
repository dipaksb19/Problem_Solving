package problemsolvingpdf1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Test1 {
	
	
	// 1)   Two Sum: Given an array of integers, find two numbers that add up to a specific 
	//      target.
	public int[] twoSum(int [] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		                                                   // 0           1           2
		for(int i = 0; i < arr.length; i++) {              // i = 0       i = 1       i = 2
			int complement = target - arr[i];              // 9 - 2 = 7   9 - 7 = 2   9 - 11 = -2
			if(map.containsKey(complement)) {              // false       false
				return new int[] {map.get(complement), i}; 
			}
			map.put(arr[i], i);                            // 2 , 0       7, 1
		}
		
		return new int[] {};
	}
	
	
	
	// 2) Reverse a String: Write a function to reverse a string without using built-in functions.
	public void reverseString(String str) {
		StringBuilder res = new StringBuilder();
		
		for(int i = str.length() - 1; i >= 0 ; i--) {
			char c = str.charAt(i);
			res.append(c);
		}
		
		System.out.println("Reversed String is : " + res);
	}

	
	
	// 5)  (Method 1)Longest Substring Without Repeating Characters: Find the length of the longest 
	//     substring without repeating characters.
	public int longestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) { // abcabcbb
            char currentChar = s.charAt(right);
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }  
        return maxLength;
    }
	
	// (Method 2)
	public int longestSubstringByOwn(String str) {
		int size = 0;
		Set<Character> set = new HashSet<>();
		for(int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		size = set.size();
		System.out.println("Unique Char :" + set);
		
		return size;
	}
	
	
	
	// 6) Valid Parentheses: Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
	//    determine if the input string is valid.
	public boolean validParenthesis(String str) {
		Stack<Character> stack = new Stack<>();
		for(char c : str.toCharArray()) {
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}else if(!stack.isEmpty() && 
					(( c == ')' && stack.peek() == '(') ||
					 ( c == '}' && stack.peek() == '{') ||
					 ( c == ']' && stack.peek() == '['))){
				stack.pop();	
			}else {
				return false;
			}
		}
		
		return stack.isEmpty();
	}
	
	

	
	public static void main(String[] args) {
		Test1 obj = new Test1();
		System.out.println("---Problem Solving from PDF 1---");
		
		
		System.out.println("Two Sum--->");
		int [] arr1 = { 2, 7, 11, 15};
		int target = 9;
		int res[] = obj.twoSum(arr1, target);
		for(int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		
		
		System.out.println("Reverse the String--->");
		String str1 = "Hello World";
		obj.reverseString(str1);
		
	
		System.out.println("Longest Substring Without repeating characters--->");
		String str2 = "こんにちは世界";
		System.out.println(obj.longestSubstring(str2));
		
		
		
		System.out.println("Valid Parenthesis in String --->");
		String str3 = "(){}[";
		System.out.println(obj.validParenthesis(str3));
		
		
	}

}
