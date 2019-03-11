public class StockList { 
  
  // 1st parameter is the stocklist (L in example), 
  // 2nd parameter is list of categories (M in example)
  public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        String result = "";
         if(lstOfArt.length == 0 || lstOf1stLetter.length == 0){
            return result;
        }
        int count = 0;
        for(int m = 0 ; m < lstOf1stLetter.length; m++) {
            for (int i = 0; i < lstOfArt.length; i++) {
                if(lstOfArt[i].startsWith(lstOf1stLetter[m])){
                    count += Integer.valueOf(lstOfArt[i].substring(lstOfArt[i].indexOf(" ")+1, lstOfArt[i].length()));
                }
            }
            result = result.concat("(" + lstOf1stLetter[m] + " : " + String.valueOf(count) + ")");
            count = 0;
            if (m+1<lstOf1stLetter.length){
                result = result.concat(" - ");
            }
        }
        return result;
    }
}
