class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] first = s.toCharArray();
        Arrays.sort(first);
        String sortedOne = new String(first);

        char[] second = t.toCharArray();
        Arrays.sort(second);
        String sortedTwo = new String(second);

        if(sortedOne.equals(sortedTwo)){
            return true;
        }
        else{
            return false;
        }





    }
}
