public class PrimeDecomp {
   
    public static String factors(int n) {

        String result = "";

        result = factorsReq(2, n, 0, result);

        return result;

    }

    private static String factorsReq(int div, int n, int mod, String result){

        if (n == 1 || div == n) {
           return result;
        }
        result = result.concat("(");
        if (odd(n)){
            if (div%2==0){
                div+=1;
            }
            while (n % div != 0) {
                div += 2;
            }
        }
        while (n%div==0) {
            n = n / div;
            mod += 1;
        }
        result = result.concat(String.valueOf(div) + (mod == 1 ? ")" : "**" +String.valueOf(mod)+")"));
        result = factorsReq(div+1, n, 0, result);
        return result;

    }

    private static boolean odd(int n){

        if (n%2==0) {
            return false;
        }

        return true;
    }
       
}
