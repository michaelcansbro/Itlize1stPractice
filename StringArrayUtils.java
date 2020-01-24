 

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
            String res = array[0];
            return res;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
            String res = array[1];
            return res;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String res = array[array.length-1];
        return res;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String res = array[array.length-2];
        return res;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean check = false;
        for(int i = 0; i < array.length; i++){
        if(array[i].equals(value))
        check = true;
    }
    return check;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] arr = new String[array.length]; 
        for (int i = 0; i < array.length; i++){
        arr[i] = array[array.length - 1 - i];
        }
        return arr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int i1 = 0;
        int i2 = array.length - 1;
    while (i2 > i1) {
        if (array[i1] != array[i2]) {
            return false;
        }
        ++i1;
        --i2;
    }
    return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
          String alphabet = "abcdefghijklmnopqrstuvwxyz";
        boolean pangram = true;
        boolean check = false;
            
        for (int i = 0; i > 26; i++){
            
            for(String string:array){
                
                if (string.toLowerCase().contains(Character.toString(alphabet.charAt(i)))){    
                    check = true;
                }
                
                else{ 
                    check = false;
                }
            }
            if (check == false){
                pangram = false;
         
            }
        
        }
        return pangram;
        
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
         int counter = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i] == value){
                counter=counter+1;   
            }

        }

        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        
        String [] temp = new String[array.length-(getNumberOfOccurrences(array,valueToRemove))];

        for(int i = 0, j = 0;  i<array.length; i++){
            if(!array[i].equals(valueToRemove)){

                temp[j] = array[i];
                j++;
            }
        }

        return temp;
    }

    public static int duplicates(String[] array){
        String dupes = new String();
        int counter = 0;
        for (int i=0; i<array.length-1;i++){
            if (array[i] == array[i+1]){
                counter++;
            }
        }
        return counter;    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
String [] temp = new String[array.length-duplicates(array)];
        int j = 0;
        for(int i = 0; i<array.length-1; i++){
            if(array[i] != array[i+1]){
                temp[j] = array[i];
                j++;
            }
        }
        temp[temp.length-1] = array[array.length-1];
        return temp;    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
     String[] pack = new String[array.length-duplicates(array)];
        int j = 0;
        pack[0]=array[0];
        for(int i=1; i<array.length; i++){

            if (array[i] == array[i-1]){
                pack[j] += array[i];
            }
            else{
                j++;
                pack[j]=array[i];
            }
        }

        return pack;
    }    


}
