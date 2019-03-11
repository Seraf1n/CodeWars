public class Order {
  public static String order(String words) {
     
     String finalString = "";
     String[] orderList = {"1","2","3","4","5","6","7","8","9"};          
     
     if (words.equals("")){
      return words;
     }
     
     String[] splitedWords = words.split(" ");
    
     for (int pos = 0; pos < splitedWords.length; pos++ ){
        String  regular = "(.*)" + orderList[pos]+ "(.*)";           
       for (int i=0; i < splitedWords.length; i++){
         if (splitedWords[i].matches(regular)){
           finalString = finalString.concat(splitedWords[i]);
         if (pos+1<splitedWords.length){
         finalString = finalString.concat(" ");
         }
       }
       }       
     }
     
     return finalString;
  }
}
