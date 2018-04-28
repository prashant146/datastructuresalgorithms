package datastructuresandalgorithms.linkedlist;

public class Sol {

    @Override
    protected void finalize(){
        System.out.println("inside finalize method");
    }

    public static void main(String[] args) {

        Sol sol = new Sol();
        Sol sol1= new Sol();
        sol = sol1;

        //Runtime.getRuntime().runFinalization();
        Runtime.runFinalizersOnExit(true);
        System.out.println("done");


    }
}
