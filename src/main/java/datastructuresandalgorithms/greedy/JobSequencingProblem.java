package datastructuresandalgorithms.greedy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class JobSequencingProblem {

    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal("2.51248596");
        System.out.println(bigDecimal.toString());

        /*Job[] jobs = new Job[5];
        jobs[0] = new Job('a', 2, 100);
        jobs[1] = new Job('b', 1, 19);
        jobs[2] = new Job('c', 2, 27);
        jobs[3] = new Job('d', 1, 25);
        jobs[4] = new Job('e', 3, 15);
        getMaximumProfit(jobs);*/

    }


    public static void getMaximumProfit(Job[] jobs){

        System.out.println("Printing jobs before sort");
        printJobs(jobs);

        sortJobs(jobs);
        System.out.println("Printing jobs after sort");
        printJobs(jobs);

        Job[] occupiedJobs = new Job[jobs.length];
        boolean[] slotOccupied = new boolean[jobs.length];

        for(int i=0; i<jobs.length; i++){

            for(int j=jobs[i].getDeadline()-1; j>=0; j--){
                if(!slotOccupied[j]){
                    slotOccupied[j]=true;
                    occupiedJobs[j] = jobs[i];
                    break;
                }
            }
        }

        System.out.println("Printing jobs with max profit");

        for(int i=0; i<occupiedJobs.length; i++){
            if(slotOccupied[i]){
                System.out.println(occupiedJobs[i].toString());
            }
        }

    }

    private static void printJobs(Job[] jobs){
        for(Job job : jobs){
            System.out.println(job.toString()+"  ");
        }
    }

    private static void sortJobs(Job[] jobs){

        Comparator<Job> sortingByProfit =
                (Job job1, Job job2)->{
                    if(job1.getProfit()>job2.getProfit()){
                        return -1;
                    }else if(job1.getProfit()==job2.getProfit()){
                        return 0;
                    }else{
                        return 1;
                    }
                };
        Arrays.sort(jobs, sortingByProfit);


    }









    static class Job {

        char jobID;
        int deadline;
        int profit;

        public Job(char jobID, int deadline, int profit) {
            this.jobID = jobID;
            this.deadline = deadline;
            this.profit = profit;
        }

        @Override
        public String toString() {
            return "Job{" +
                    "jobID=" + jobID +
                    ", deadline=" + deadline +
                    ", profit=" + profit +
                    '}';
        }

        public char getJobID() {
            return jobID;
        }

        public void setJobID(char jobID) {
            this.jobID = jobID;
        }

        public int getDeadline() {
            return deadline;
        }

        public void setDeadline(int deadline) {
            this.deadline = deadline;
        }

        public int getProfit() {
            return profit;
        }

        public void setProfit(int profit) {
            this.profit = profit;
        }
    }

}
