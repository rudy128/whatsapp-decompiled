package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: X.5kF  reason: invalid class name and case insensitive filesystem */
public final class C111675kF extends BMI {
    public final C18000vb A00;

    public float A06(DisplayMetrics displayMetrics) {
        if (displayMetrics != null) {
            return 75.0f / ((float) displayMetrics.densityDpi);
        }
        throw AnonymousClass000.A0s("densityDpi");
    }

    public int A07() {
        if (AnonymousClass3MW.A1Z(this.A00)) {
            return 1;
        }
        return -1;
    }

    public int A08() {
        if (AnonymousClass3MW.A1Z(this.A00)) {
            return 1;
        }
        return -1;
    }

    public C111675kF(Context context, C18000vb r2) {
        super(context);
        this.A00 = r2;
    }
}
