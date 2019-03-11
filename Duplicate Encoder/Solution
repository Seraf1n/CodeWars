import java.util.*;
public class DuplicateEncoder {
  static String encode(String word){
              Map<String, Integer> map = new HashMap<String, Integer>();
            word = word.toLowerCase();
            for (int i = 0; i < word.length(); i++) {
                String tmpChar = String.valueOf(word.charAt(i));
                if (map.containsKey(tmpChar)) {
                    map.put(tmpChar,  map.get(tmpChar)+1);

                }else {
                    map.put(tmpChar, 1);
                }
            }
            char[] wordTmp = word.toCharArray();

            for (int i = 0; i<wordTmp.length; i++) {
                String tmpChar = String.valueOf(wordTmp[i]);
                if (map.get(tmpChar)>1) {
                    wordTmp[i] = ")".charAt(0);
                }   else{
                        wordTmp[i] = "(".charAt(0);
                    }

            }
            word = "";
            for(int i = 0; i<wordTmp.length;i++){
                word = word.concat(String.valueOf(wordTmp[i]));
            }

            return word;
        }
}
