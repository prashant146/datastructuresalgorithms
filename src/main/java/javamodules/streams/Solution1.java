package javamodules.streams;

public class Solution1 {

    public static void main(String[] args) {
        String s = "lqmvpiamptfeesyuaisnaajpmjprmwezosuecusuoxyupxqrhjfjlqyxbnonmupanjepgzjwwlqmvpiamptfeesyuaisnaajpmjprmwezosuecusuoxyupxqrhjfjlqyxbnonmupanjepgzjwwlqmvpiamptfeesyuaisnaajpmjprmwezosuecusuoxyupxqrhjfjlqyxbnonmupanjepgzjwwlqmvpiamptfeesyuaisnaajpmjprmwezosuecusuoxyupxqrhjfjlqyxbnonmupanjepgzjwwlqmvpiamptfeesyuaisnaajpmjprmwezosuecusuoxyupxqrhjfjlqyxbnonmupanjepgzjww";
        String t = "lqmvpiamptfeesyuaisnaajpmjprmwezosuecusuoxyupxqrhjfjlqyxbnonmupanjepgzjwwlqmvpiamptfeesyuaisnaajpmjprmwezosuecusuoxyupxqrhjfjlqyxbnonmupanjepgzjwwlqmvpiamptfeesyuaisnaajpmjprmwezosuecusuoxyupxqrhjfjlqyxbnonmupanjepgzjwwlqmvpiamptfeesyuaisnaajpmjprmwezosuecusuoxyupxqrhjfjlqyxbnonmupanjepgzjwwlqmvpiamptfeesyuaisnaajpmjprmwezosuecusuoxyupxqrhjfjlqyxbnonmupanjepgzjww";
        System.out.println(findSmallestDivisor(s, t));
        //System.out.println("lqmvpiamptfeesyuaisnaajpmjprmwezosuecusuoxyupxqrhjfjlqyxbnonmupanjepgzjww".length());

    }

    public static int findSmallestDivisor(String s, String t) {
        System.out.println(s);
        System.out.println(t);
        if((s.length())%(t.length())!=0){
            return -1;
        }

        int result = s.length()/t.length();
        String temp = "";
        for(int i=0; i<result; i++){
            temp=temp.concat(t);
        }

        if(!temp.equals(s)){
            return -1;
        }
        String output = "";
        String temp1 = "";
        boolean subStringPresent = false;
        for(int i=0; i<t.length(); i++){

            output = output.concat(String.valueOf(t.charAt(i)));
            if(t.lastIndexOf(output)>0){
                subStringPresent=true;
                temp1=output;
            }

        }
        if(subStringPresent){
            return temp1.length();
        }

        return t.length();

    }
}
