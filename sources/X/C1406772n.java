package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;

/* renamed from: X.72n  reason: invalid class name and case insensitive filesystem */
public class C1406772n {
    public static C110865hM A01(Activity activity, C19760yx... r6) {
        Pair[] pairArr;
        if (r6 != null) {
            int length = r6.length;
            pairArr = new Pair[length];
            for (int i = 0; i < length; i++) {
                C19760yx r0 = r6[i];
                pairArr[i] = Pair.create(r0.A00, r0.A01);
            }
        } else {
            pairArr = null;
        }
        return new C110865hM(A00(activity, pairArr));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.72n, java.lang.Object] */
    public static C1406772n A02() {
        if (Build.VERSION.SDK_INT >= 23) {
            return new C110865hM(C123556Ux.A00());
        }
        return new Object();
    }

    public Bundle A03() {
        if (this instanceof C110865hM) {
            return ((C110865hM) this).A00.toBundle();
        }
        return null;
    }

    public static ActivityOptions A00(Activity activity, Pair... pairArr) {
        return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
    }
}
