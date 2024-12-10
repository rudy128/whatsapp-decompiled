package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.0FW  reason: invalid class name */
public abstract class AnonymousClass0FW {
    public static final long A00(C17130tn r2, int i) {
        Context context = (Context) r2.BFh(AnonymousClass0PK.A01);
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass0FV.A00(context, i);
        }
        long color = ((long) context.getResources().getColor(i)) << 32;
        C02540Ek r0 = C05100Qk.A06;
        return color;
    }
}
