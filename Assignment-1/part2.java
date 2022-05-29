import java.util.*;
public class part2{
    public static boolean isStringPermutation(String s1, String s2) {
        //checks if s1 is a permutation of s2
        Set<Character> letters = new HashSet();

        //if string 2 is longer than string 1, create set accordingly
        if (s2.length() > s1.length()){
            for (int i = 0; i < s2.length(); i++){
                letters.add(s2.charAt(i));
            }

            for (int i = 0; i < s1.length(); i++){
                if (letters.contains(s1.charAt(i))){
                    letters.remove(s1.charAt(i));
                }
            }
        }

        //if string 1 is longer than string 2, create set accordingly
        if (s2.length() < s1.length()){
            for (int i = 0; i < s1.length(); i++){
                letters.add(s1.charAt(i));
            }

            for (int i = 0; i < s2.length(); i++){
                if (letters.contains(s2.charAt(i))){
                    letters.remove(s2.charAt(i));
                }
            }
        }
        
        //System.out.println(letters);
        //this always returns
        if (letters.size() > 0 ){
            return false;
        }
        return true;
    }

    public static List<List<Integer>> pairsThatEqualSum(List<Integer> inputArray, Integer targetSum) {
        List<List<Integer>> pairs = new ArrayList<>();

        for (int i = 0; i < inputArray.size(); i++){
            List<Integer> pair = new ArrayList<>();
            Integer search = targetSum - inputArray.get(i);
            if (inputArray.contains(search)){
                pair.add(inputArray.get(i));
                pair.add(search);
                pairs.add(pair);
            }
            inputArray.remove(i);

        }
        return pairs;
        
    }

    public static void main(String args[]) {
        boolean isString = isStringPermutation("asfd", "fsa");
        System.out.println(isString + "\n");

        List<Integer> inputToPairs = new ArrayList<>();
        inputToPairs.add(1);
        inputToPairs.add(2);
        inputToPairs.add(3);


        List<List<Integer>> sumPairs = pairsThatEqualSum(inputToPairs, 4);
        System.out.println(sumPairs + "\n");

   
    }
}

