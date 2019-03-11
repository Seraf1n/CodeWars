class LongestConsec {
    
    public static String longestConsec(String[] strarr, int k) {

        String result = "";
        int n = strarr.length;
        if (n == 0 || k > n || k <= 0){
            return result;
        }
        if (k == n){
            for(String str:strarr){
                result = result.concat(str);
            }
        }

        String tmpResult_1;
        for(int i = 0 ; i < n-k+1; i++){
            tmpResult_1 = "";
            for(int tmp = 0; tmp < k; tmp++){

                tmpResult_1 = tmpResult_1.concat(strarr[i+tmp]);
            }
            if (tmpResult_1.length()>result.length()) {
                result = tmpResult_1;
            }
        }


        return result;
    }
}
