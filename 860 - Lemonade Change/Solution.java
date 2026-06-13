class Solution {
    public boolean lemonadeChange(int[] bills) {

        int five = 0;
        int ten = 0;

        for (int bill : bills) {

            if (bill == 5) {
                five++;
            }

            else if (bill == 10) { // return $5 to customer 

                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            }

            else { // bill == 20

                if (ten > 0 && five > 0) { //return $15 to customer
                    ten--;
                    five--;
                }

                else if (five >= 3) { // $5, $5 , $5 
                    five -= 3;
                }

                else {
                    return false;
                }
            }
        }

        return true;
    }
}