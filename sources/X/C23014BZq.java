package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* renamed from: X.BZq  reason: case insensitive filesystem */
public final class C23014BZq extends C23023BZz {
    public final Bundle A00;

    public final int BUx() {
        return 12451000;
    }

    public C23014BZq(Context context, Looper looper, DI2 di2, EDW edw, EDX edx, CTL ctl) {
        super(context, looper, edw, edx, ctl, 128);
        Bundle bundle;
        if (di2 == null) {
            bundle = C17880vN.A0D();
        } else {
            bundle = new Bundle(di2.A00);
        }
        this.A00 = bundle;
    }
}
