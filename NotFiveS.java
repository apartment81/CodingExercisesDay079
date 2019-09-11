package ro.mirodone;

import java.util.ArrayList;

public class NotFiveS {

    public int dontGiveMeFive(int start, int end) {


      //  int count = 0;

        ArrayList<String> ar = new ArrayList<>();

        for (int i = start; i <= end; i++) {
           // count++;
            ar.add(i + "");
        }
        int arSize = ar.size();

        //System.out.println(count);
       // System.out.println(arSize);
        String[] newArray = new String[arSize];
        ar.toArray(newArray);

        int cnt = 0;

        for (String s : newArray) {

            if(!s.contains("5")) {
                cnt++;
                //System.out.println(s);
            }
        }

        return cnt;


/*        int ans = 0;
        for (int i = start; i <= end; i++) {
            if (!("" + i).contains("5")) ans++;
        }
        return ans;*/

    }

}
