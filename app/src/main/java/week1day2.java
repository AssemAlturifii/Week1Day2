import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class week1day2 {
    public static void main(String[] args) {
       

    }
    //done
    public static List findDuplicates(List<String> cities){

        Map<String,Integer> map=new HashMap<>();

        for(String a:cities){
            map.put(a,0);
        }

        for(String a:cities){
            map.put(a,map.get(a).intValue()+1);
        }

        List newList=new ArrayList<>();

        for(String a:map.keySet()){
            if(map.get(a)>1){
                newList.add(a);
            }
        }

        return newList;
    }
    //done
    public static boolean checkPalindrome(String word){
        String newWord="";

        for(int i=word.length()-1;i>=0;i--){
            newWord=newWord+word.charAt(i);
        }
        if(word.equals(newWord)){
            return true;
        }
        return false;
    }


    public static void fizzBuzz(int count){

        String word="";
        for(int i=0;i<=count;i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                word="fizzbuzz";
            }
            else if (i % 3 == 0) {
                word="fizz";

            } else if (i % 5 == 0) {
                word="buzz";

            }
            System.out.println(i+"="+word);
            word="";

        }


    }
    public static boolean checkAnagram(String word1,String word2){

        if(word1.length()!=word2.length()){
            return false;
        }

        else {
            char wordOne[] = word1.toCharArray();

            Arrays.sort(wordOne);

            word1 = new String(wordOne);


            char[] wordTwp = word2.toCharArray();

            Arrays.sort(wordTwp);

            word2 = new String(wordTwp);


            if (word1.equals(word2)) {
                return true;
            } else {
                return false;
            }
        }

    }
    public static void printTable(){

        int [][]array1=new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                array1[i][j]=(i+1)*(j+1);
            }
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }
    }

}
