package datastructuresandalgorithms.greedy;

public class ActivitySelection {

    public static void getActivitiesToComplete(int[]s, int[]f, int n){

        int i=0;

        System.out.print(i+"  ");

        for(int j=1;j < n; j++){

            if(s[j]>=f[i]){
                System.out.print(j+"  ");
                i=j;
            }
        }

    }


    public static void main(String[] args) {

        int s[] =  {1, 3, 0, 5, 8, 5};
        int f[] =  {2, 4, 6, 7, 9, 9};
        int n = s.length;

        getActivitiesToComplete(s, f, n);
    }

}
