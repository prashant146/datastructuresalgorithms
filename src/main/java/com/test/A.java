package com.test;

import java.lang.reflect.Array;
import java.util.*;

public interface A {

    public static void main(String[] args) {

       /* //Arrays.sort(new String[]{"AFGCVFGH"});
        String str = "ewfwdnj";

        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        String st = new String(temp);
        System.out.println(st);
        ArrayList<String> al = getAllPerms("abcd");
        System.out.println(al);
        Collections.sort(al);*/
        //System.out.println(al);
        String str[] = {"bac", "aaa", "abba"};
        int arr[] = get_ranks(str);
        for(int i=0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    static String removeDups(String str){
        /*char ch1 = str.charAt(0);
        boolean b = false;
        for(int i=1; i<str.length();i++){
            if(str.charAt(i)!=ch1)
                b=true;
        }
        if(!b){
            return str;
        }*/
        if(str.charAt(0)==str.charAt(str.length()-1)){
            return str;
        }
        int cnt1 =1;
        int cnt2 =1;
        char ch[] = str.toCharArray();

        while(cnt2!=ch.length){
            if(ch[cnt2]!=ch[cnt2-1]){
                ch[cnt1]=ch[cnt2];
                cnt1++;

            }
            cnt2++;
        }
        str = new String(ch);
        return str.substring(0,cnt1);
    }

    static int[] get_ranks(String[] words) {
        int out[] = new int[words.length];
        int count =0;
        for(String word : words){

            /*char[] temp = word.toCharArray();
            Arrays.sort(temp);
            String st = new String(temp);

            String uniqueAlphs = removeDups(st);*/
            ArrayList<String> al = getAllPerms(word);
            Collections.sort(al);
            System.out.println(al);
            out[count++]=getRank(al, word);
        }

        return out;

    }

    static int getRank(ArrayList<String> al, String str){
        HashSet<String> hs = new HashSet<>();
        int count =0;
        for(int i=0; i<al.size();i++){
            if(!hs.contains(al.get(i))){
                hs.add(al.get(i));
                count++;
            }
            if(al.get(i).equals(str)){
                return count-1;
            }
        }
        return -1;
    }

    public static ArrayList<String> getAllPerms(String str){
        if(str==null)
            return null;

        ArrayList<String> perms = new ArrayList<>();
        if(str.length()==0){
            perms.add("");
            return perms;
        }
        char first = str.charAt(0);
        String remainder = str.substring(1);
        ArrayList<String> words = getAllPerms(remainder);
        for(String word : words){
            for(int j=0; j<=word.length(); j++){
                String s = inserAt(word, first, j);
                perms.add(s);
            }
        }
        return perms;
    }

    public static String inserAt(String word, char c, int i){
        String start = word.substring(0, i);
        String end = word.substring(i);
        return start+c+end;
    }
}
