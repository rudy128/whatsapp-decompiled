package X;

import android.os.Build;

public abstract class CF9 {
    public static final int A00;

    static {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 67108864;
        }
        A00 = i;
    }
}
