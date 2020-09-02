package csFundamentals.binary;

public class Binary {

    public static void main(String args[])
    {
        int flags = 28;
        int f = 5;

        // Test whether flag f is set
        if ((flags & f) != 0) // 011100 & 000100 ==> 000100 or 4
        {
            System.out.println("flag f is set in flags: " + (flags & f));
        }
        else
        {
            System.out.println("flag f is not set in flags: " + (flags & f));
        }
    }


}
