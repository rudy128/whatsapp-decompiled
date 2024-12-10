package X;

import android.content.Context;

/* renamed from: X.6Xm  reason: invalid class name and case insensitive filesystem */
public abstract class C124216Xm {
    public static final boolean A00(Context context, C18030ve r4, AnonymousClass1DC r5) {
        C18070vi.A0n(r4, context, r5);
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r4, 7061)) {
            return true;
        }
        if (!context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") || !C18020vd.A05(r2, r4, 7066)) {
            return false;
        }
        return true;
    }
}
