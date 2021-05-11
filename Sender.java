public class Sender implements Comparable<Sender>{
    protected double AccountID;
    protected double RecipientIPAddress;
    protected int time; // in minutes

    public Sender(double AccountID, double RecipientIPAddress, int time){
        this.AccountID = AccountID;
        this.RecipientIPAddress = RecipientIPAddress;
        this.time = time;
    }

    public int getTime(){
        return time;
    }
    public double getIP(){
        return RecipientIPAddress;
    }

    @Override
    public String toString() {
        return "Sender [Account ID = " + AccountID + "| Recipient ID Address = " + RecipientIPAddress + "| Time = " + time + "]";
    }

    @Override
    public int compareTo(Sender s) {
        return this.time - s.time;
    }
}
