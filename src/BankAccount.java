public class BankAccount {
    private String AccountHolderName;
    private String AccountNumber;
    private double balance;

    public void setAccountHolderName(String propria){
        if (propria.isEmpty()){
            System.out.println("The account name must not be negative");
        }else{
            this.AccountHolderName = propria;

        }
    }

    public String getAccountHolderName (){
        return AccountHolderName;
    }

    public void setAccountNumber(String Num){
        if(Num.isEmpty()){
            System.out.println("Type the acoount number correctly.");
        }else{
            Num = AccountNumber;
        }
    }

    public String getAccountNumber(){
        return AccountNumber;
    }
}

