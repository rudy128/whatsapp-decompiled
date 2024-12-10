package X;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;

/* renamed from: X.0Pe  reason: invalid class name and case insensitive filesystem */
public abstract class C04850Pe {
    public static final AnonymousClass0PS A00 = new AnonymousClass0PS("MagnifierPositionInRoot", (AnonymousClass1OS) null, (AnonymousClass1Y1) null, 2);

    public static final C17090tj A02(C17070th r13, C17090tj r14, C22821Di r15, C22821Di r16, long j) {
        C17070th r2 = r13;
        if (Build.VERSION.SDK_INT >= 28) {
            if (r13 == null) {
                r2 = C04530Nt.A00();
            }
            return r14.CP5(new MagnifierElement(r2, r15, (C22821Di) null, r16, (AnonymousClass1Y1) null, Float.NaN, Float.NaN, Float.NaN, j, true, true));
        }
        return AnonymousClass0O1.A00(r14, C17090tj.A00, AnonymousClass0O1.A01());
    }

    public static /* synthetic */ boolean A03() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public static final long A00() {
        return C26200CuV.A01;
    }
}
