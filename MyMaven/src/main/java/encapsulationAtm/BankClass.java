package encapsulationAtm;

public class BankClass {
int pin;
public void setPin(int pin) {
this.pin=pin;	
}
public boolean validPin() {
int temp=pin;
int count=0;
while(temp>0) {
temp=temp/10;
count++;
}

if(pin>0 && count==4) {
return true;
}
else {
return false;
}
}
}




