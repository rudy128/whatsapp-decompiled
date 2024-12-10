package X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: X.9Rm  reason: invalid class name and case insensitive filesystem */
public abstract class C181699Rm {
    public static final boolean A00(AnonymousClass11C r5, AnonymousClass19D r6, C192319oA r7, int i) {
        TelephonyManager A0K;
        int A1U = AnonymousClass8BX.A1U(r5, r6, r7);
        boolean A05 = C18020vd.A05(C18040vf.A02, r6, 4431);
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 28;
        if (A05) {
            i3 = 23;
        }
        boolean A1C = C108975cc.A1C(i2, i3);
        Boolean bool = C17970vW.A01;
        if (A1C && (((A0K = r5.A0K()) == null || A0K.getSimState() != A1U) && i >= A1U)) {
            return true;
        }
        r7.A00("flash");
        return false;
    }
}
