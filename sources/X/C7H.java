package X;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

public abstract class C7H {
    public static ColorFilter A00(Integer num, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object A00 = C7I.A00(num);
            if (A00 != null) {
                return C7G.A00(A00, i);
            }
            return null;
        }
        PorterDuff.Mode A002 = C7J.A00(num);
        if (A002 != null) {
            return new PorterDuffColorFilter(i, A002);
        }
        return null;
    }
}
