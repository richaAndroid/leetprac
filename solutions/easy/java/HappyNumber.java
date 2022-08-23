import java.util.*;

class HappyNumber {
    HashSet ss = new HashSet();
    public boolean isHappy(int n) {
        int num = 0;
        ss.add(n);
        while(n >0 ){
            num += (n%10) * (n%10);
            n /= 10;
        }
        if (num ==1 )
            return true;
        else if (ss.contains(num))
            return false;
        else {
            return isHappy(num);
        }
    }
}