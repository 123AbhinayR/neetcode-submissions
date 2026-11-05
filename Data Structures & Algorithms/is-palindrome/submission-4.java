class Solution {
    public boolean isPalindrome(String s) {

        char[] c = s.toCharArray();
        int leftIndex = 0;
        int rightIndex = s.length() - 1;

        while(leftIndex < rightIndex){
            while(!Character.isLetterOrDigit(c[leftIndex]) && leftIndex < rightIndex){
                leftIndex++;
            }

            while(!Character.isLetterOrDigit(c[rightIndex]) && leftIndex < rightIndex){
                rightIndex--;
            }

            char left = Character.toLowerCase(c[leftIndex]);
            char right = Character.toLowerCase(c[rightIndex]);

            if(left != right){
                return false;
            }

            leftIndex++;
            rightIndex--;
        }
        return true;
        
    }
}
