package X;

import java.util.HashSet;

public class DF7 implements E4p {
    public boolean BKc(HashSet hashSet, String[] strArr) {
        for (String contains : strArr) {
            if (hashSet.contains(contains)) {
                return true;
            }
        }
        return false;
    }
}
