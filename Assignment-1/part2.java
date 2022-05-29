import java.util.*;
public class part2{
    public static boolean isStringPermutation(String s1, String s2) {
        //checks if s1 is a permutation of s2
        Set<Character> letters = new HashSet();
        for (int i = 0; i < s2.length(); i++){
            letters.add(s2.charAt(i));
        }
        for (int i = 0; i < s1.length(); i++){
            if (letters.contains(s1.charAt(i))){
                letters.remove(s1.charAt(i));
            }
        }
        //this always returns
        if (letters.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        boolean isString = isStringPermutation("asdf", "fsa");
        System.out.println(isString);
   
    }
}

