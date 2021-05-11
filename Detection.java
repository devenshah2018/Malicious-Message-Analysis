import java.util.*;
// Maximum Runtime: O(N log N)
public class Detection {
    List<Sender> send;
    public Detection (List<Sender> send){
        this.send = send;
        Collections.sort(send);
    }
    public List<Sender> getSend(){
        return send;
    }
    public void analyzer(int timeSpan){
          int n = timeSpan;
          int i = 0;
          double[] ips = new double[send.size()];
          while (send.get(i).getTime() <= n) {
              ips[i] = send.get(i).getIP();
              i++;
          }
          Arrays.sort(ips);
          List theIps = Arrays.asList(ips);
          Set<Double> mySet = new HashSet<Double>(theIps);
          for (Double x : mySet){
              System.out.println(x + " occurs " + Collections.frequency(theIps, x));
          }
    }
}