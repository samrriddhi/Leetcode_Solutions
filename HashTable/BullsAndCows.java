class Solution {
    public String getHint(String secret, String guess) {

        int bulls = 0;
        int cows = 0;

        HashMap<Character, Integer> sec = new HashMap<>();
        HashMap<Character, Integer> gue = new HashMap<>();

        for (int i = 0; i < secret.length(); i++) {

            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if (s == g) {
                bulls++;
            }
            else {
                sec.put(s, sec.getOrDefault(s, 0) + 1);
                gue.put(g, gue.getOrDefault(g, 0) + 1);
            }
        }

        for (char ch : sec.keySet()) {

            if (gue.containsKey(ch)) {

                cows += Math.min(sec.get(ch), gue.get(ch));
            }
        }

        return bulls + "A" + cows + "B";
    }
}