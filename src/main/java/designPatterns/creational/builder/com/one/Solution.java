package designPatterns.behavioural.stateDesign.creational.builder.com.one;

public class Solution {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.BankAccountBuilder("Prashant", "10203055")
                .withEmail("prashant146@gmail.com")
                .wantNewsLetters(true)
                .build();
        System.out.println(bankAccount.toString());

    }
}
