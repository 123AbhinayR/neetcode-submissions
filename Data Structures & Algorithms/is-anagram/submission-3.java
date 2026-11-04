class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] alphabet = new int[26];

        for(int i = 0; i < s.length(); i++){
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }

        for(int count: alphabet){
            if(count != 0){
                return false;
            }
        }
        return true;
        

        /*
        Before Code:
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
        */



    }
}
