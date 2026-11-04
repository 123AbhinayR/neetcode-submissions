class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] first = s.toCharArray();
        Arrays.sort(first);

        char[] second = t.toCharArray();
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }
}
