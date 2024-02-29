public class richestMan {
    public static void main(String[] args) {
        int[][] accounts = {
                {2,4,6},
                {54,7,2},
                {4,87}
        };
        System.out.println(richest(accounts));
    }
    static int richest(int[][] accounts){
        //person = row
        //account = col
        int max = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++){
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++){
                sum = sum + accounts[person][account];

            }
            if(sum > max){
                max = sum;
            }

        }
        return max;

    }
}
