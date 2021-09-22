package Array;

public class TestMain {

    public static int candy(int[] ratings) {

        int [] candies = new int[ratings.length];

        //since all of them must have candy
        for (int i = 0; i< candies.length; i++) {
            candies[i] = 1;
        }
// 1,2,3,1,3,2,1
// 1,2,3,1,1,1,1
        //build
        for (int i = 0; i< ratings.length-1; i++) {
            if(ratings[i] <  ratings[i+1]  && candies[i+1] <= candies[i]) {
                candies[i+1]=candies[i]+1;
            }
            if(ratings[i] >  ratings[i+1] && candies[i] <= candies[i+1]) {
                candies[i]++;
            }
        }

        int minCandies = 0;

        for (int i = 0; i< candies.length; i++) {
            System.out.println(candies[i]);
            minCandies += candies[i];
        }
        return minCandies;

    }
    public static void main(String[] args) {
//        candy(new int[] {1,3,2,2,1});
        candy(new int[]{1,2,87,87,87,2,1});
        //ans: 1,2,3,1,3,2,1
//        System.out.println(Character.getNumericValue('z') );
//        System.out.println(Character.getNumericValue('a'));
//

    }
}
