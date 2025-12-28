import java.util.*;

public class NumberStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        while (true) {
            int x = sc.nextInt();
            if (x == -999) break;
            a.add(x);
        }
        Collections.sort(a);
        int sum = 0;
        for (int x : a) sum += x;
        double avg = sum * 1.0 / a.size();
        double med = a.size()%2==0 ? (a.get(a.size()/2-1)+a.get(a.size()/2))/2.0 : a.get(a.size()/2);

        int mode = a.get(0), maxc = 1;
        for (int i=0;i<a.size();i++){
            int c=1;
            for(int j=i+1;j<a.size();j++)
                if(a.get(i)==a.get(j)) c++;
            if(c>maxc){maxc=c;mode=a.get(i);}
        }

        System.out.printf("Count=%d, Sum=%d, Min=%d, Max=%d, Avg=%.2f, Median=%.2f, Mode=%d%n",
                a.size(), sum, a.get(0), a.get(a.size()-1), avg, med, mode);
    }
}
