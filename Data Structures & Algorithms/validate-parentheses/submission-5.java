class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of(')', '(', '}', '{', ']', '[');
        Deque<Character> stack = new ArrayDeque<>();
        char[] a = s.toCharArray();

        for (char c : a) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (top != map.get(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}