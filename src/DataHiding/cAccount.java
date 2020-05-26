package DataHiding;

 class cAccount {

    private double balance = 10000;
    private String username = "Kamal";
    private String password = "password";

    public double getWalletBalance(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)){
            return balance;
        }
        else {
            return 0.0;
        }
    }

    public static class AccessAccount{

        public static void main(String[] args){
            cAccount acc = new cAccount();
            System.out.println(acc.getWalletBalance("Kamal","password"));
        }
    }
}
