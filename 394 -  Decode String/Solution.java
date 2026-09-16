class Solution {
    public String decodeString(String s) {

        Stack<Integer> numStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String currentString = "";
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {
                numStack.push(num);
                stringStack.push(currentString);

                num = 0;
                currentString = "";
            }

            else if (ch == ']') {

                int repeat = numStack.pop();
                String previousString = stringStack.pop();

                StringBuilder temp = new StringBuilder(previousString);

                for (int i = 0; i < repeat; i++) {
                    temp.append(currentString);
                }

                currentString = temp.toString();
            }

            else {
                currentString += ch;
            }
        }

        return currentString;
    }
}