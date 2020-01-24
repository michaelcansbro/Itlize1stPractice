 

public class LoopFun
{

     /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
           int res = 1, i; 
              for (i=2; i<=number; i++) {
                  res *= i; 
              }
              return res; 
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
            char[] ch = new char[phrase.length()];
              String[] arrOfStr = phrase.split(" "); 
              String acr = "";
              for(int i=0;i<arrOfStr.length;i++) {
                  ch[i] = arrOfStr[i].charAt(0);
                 
                  acr += ch[i];
              
              }
              return acr.toUpperCase() ;
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
         char[] ch = new char[word.length()];
              for(int i=0;i<word.length();i++) {
                  ch[i] = word.charAt(i); 
                  System.out.println(ch[i]);
                  int a = ch[i];
                  a= a +3;
                  ch[i] = (char) a;
                  if(ch[i] > 'z')
                    {
                        ch[i] = (char)(ch[i] - 26);
                    }
                    else if(ch[i] < 'a')
                    {
                        ch[i] = (char)(ch[i] + 26);
                    }
                
              }
              String b = new String(ch);
              return b;
      }
     public static void main(String[] args) {
         LoopFun fun = new LoopFun();
         System.out.println(fun.factorial(5));
         System.out.println(fun.acronym("Hello how are ya?"));
         System.out.println(fun.encrypt("awxy"));
        }
}
