class Solution {
    public int calPoints(String[] operations) {

        ArrayList<Integer> scores = new ArrayList<>();

        for (String op : operations) {

            if (op.equals("C")) {
                scores.remove(scores.size() - 1);
            }

            else if (op.equals("D")) {
                int last = scores.get(scores.size() - 1);
                scores.add(2 * last);
            }

            else if (op.equals("+")) {
                int last = scores.get(scores.size() - 1);
                int secondLast = scores.get(scores.size() - 2);

                scores.add(last + secondLast);
            }

            else {
                scores.add(Integer.parseInt(op));
            }
        }

        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        return sum;
    }
}