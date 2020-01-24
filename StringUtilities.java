
public class StringUtilities {
   /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String concat = baseValue + valueToBeAdded;
            return concat;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        int index=0;
        char [] chp = new char[valueToBeReversed.length()];
            for(int i =valueToBeReversed.length()-1;i>=0;i--) {
                
                chp[index]=valueToBeReversed.charAt(i);
               
                
            
                ++index;
            }
            
            String reversed = new String(chp);
            return reversed;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
            int mid =word.length()/2;
            char c = word.charAt(mid);      
            return c;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
            /*char []  remove = value.toCharArray();
            int size = value.length();
            char []  newString = new char[size];
            int charRemoved=0;
            
                    for(int j=0;j<value.length();j++) {
                        if(charToRemove !=remove[j]) {
                          
                            newString[j] = remove[j];
                        }else{
                            ++charRemoved;
                        }
                    }
                    
                    char [] fin = new char[newString.length];
                    for(int j=0;j<fin.length;j++) {
                      
                            
                            fin[j]=newString[j];
                        
                    }
                    String newStr = new String(fin);
                    return newStr;
                    */
                   StringBuilder val = new StringBuilder(value);
                   int check =0;
                   for(int i = 0; i< val.length();i++){
                       if(val.charAt(i)==charToRemove){
                           int j = i+1;
                           val.delete(i,j);
                           
                        }
                    }
                  
                   return val.toString();
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
       String [] sent = sentence.split(" ");
                String lastWord= sent[sent.length-1];
                
            return lastWord;
    }
    public static void main(String[] args){
        StringUtilities stringUt = new StringUtilities();
        System.out.println(stringUt.removeCharacter("melatonin",'o'));
        System.out.println(stringUt.removeCharacter("tryptophan",'t'));
        
        System.out.println(stringUt.removeCharacter("methyl",'m'));
        
    }
        
}
