package encapsulationAtm;

public class UserClass {
public static boolean valid;
public void withdrawAmount() {
if(valid) 
{
System.out.println(" You can withdraw the amount");
}
else 
{
System.out.println(" Invalid Pin.You cannot withdraw the amount");
}
}
public static void main(String[] args) {
BankClass bankObj=new BankClass();
bankObj.setPin(1212);
valid=bankObj.validPin();
UserClass usrObj=new UserClass();
usrObj.withdrawAmount();
}
}


