package designPatterns.behavioural.stateDesign.creational.builder.com.one;

public class BankAccount {

    private BankAccount(){
    }

    private String name;
    private String accountNumber;
    private String email;
    private boolean newsLetters;

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", email='" + email + '\'' +
                ", newsLetters=" + newsLetters +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isNewsLetters() {
        return newsLetters;
    }
    public void setNewsLetters(boolean newsLetters) {
        this.newsLetters = newsLetters;
    }

    public static class BankAccountBuilder{
        private String name;
        private String accountNumber;
        private String email;
        private boolean newsLetters;

        public BankAccountBuilder(String name, String accountNumber){
            this.name=name;
            this.accountNumber=accountNumber;
        }

        public BankAccountBuilder withEmail(String email){
            this.email=email;
            return this;
        }

        public BankAccountBuilder wantNewsLetters(boolean newsLetters){
            this.newsLetters = newsLetters;
            return this;
        }

        public BankAccount build(){
            BankAccount bankAccount = new BankAccount();
            bankAccount.accountNumber = this.accountNumber;
            bankAccount.email=this.email;
            bankAccount.name=this.name;
            bankAccount.newsLetters=this.newsLetters;
            return bankAccount;
        }
    }
}
