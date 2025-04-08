public class ExceptionMain {
    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount(1025, 10f,"Phuoc");

        try{
            System.out.println("balance: " + customer1.deposit(0));
        }catch (ValidateAmountException e){
            System.out.println(e.getMessage()); // output Exception
        }finally {
            System.out.println("Thank you for using services at VCB Banking!");
        }

        try{
            System.out.println("balance: " + customer1.transferMoney(1f));
        }catch (ValidateBalanceException e){
            System.out.println(e.getMessage()); // not call Exception because balance > amount
        }finally {
            System.out.println("Thank you for using services at VCB Banking!");
        }
    }
}
