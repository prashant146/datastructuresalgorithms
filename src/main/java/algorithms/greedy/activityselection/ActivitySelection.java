package algorithms.greedy.activityselection;

//You are given n activities with their start and finish times.
// Select the maximum number of activities that can be performed by a single person,
// assuming that a person can only work on a single activity at a time.
public class ActivitySelection {

    public static void main(String[] args) {
        int s[] =  {1, 3, 0, 5, 8, 5};
        int f[] =  {2, 4, 6, 7, 9, 9};
        int n = s.length;

        printMaxActivities(s, f, n);
    }

    public static void printMaxActivities(int s[], int f[], int n){

        print(s);
        print(f);
        int i=0;
        int j;
        System.out.print(i+" ");
        for(j=1; j<n;j++){
            if(s[j]>=f[i]){
                System.out.print(j+" ");
                i=j;
            }
        }

    }

    public static void print(int arr[]){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }


}
