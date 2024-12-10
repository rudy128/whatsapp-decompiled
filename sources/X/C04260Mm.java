package X;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: X.0Mm  reason: invalid class name and case insensitive filesystem */
public final class C04260Mm {
    public static final C05600Uw A00(String str) {
        return AnonymousClass0L3.A01(C33321id.A04, str);
    }

    public final C04650Of A01(C17130tn r5) {
        C04650Of r1;
        r5.COB(-1366542614);
        View view = (View) r5.BFh(AnonymousClass0PK.A04);
        WeakHashMap weakHashMap = C04650Of.A0O;
        synchronized (weakHashMap) {
            Object obj = weakHashMap.get(view);
            if (obj == null) {
                obj = new C04650Of(view);
                weakHashMap.put(view, obj);
            }
            r1 = (C04650Of) obj;
        }
        AnonymousClass0QC.A03(r5, r1, new C10250i2(view, r1));
        AnonymousClass0VR.A0T(r5);
        return r1;
    }
}
