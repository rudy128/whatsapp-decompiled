package X;

import android.os.Build;

public abstract class CE6 {
    public static final E3X A00;

    static {
        Object obj;
        if (Build.VERSION.SDK_INT >= 24) {
            obj = new D68();
        } else {
            obj = new Object();
        }
        A00 = (E3X) obj;
    }
}
