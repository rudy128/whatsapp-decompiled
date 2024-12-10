package X;

import android.os.SystemClock;

/* renamed from: X.2x7  reason: invalid class name and case insensitive filesystem */
public final class C65792x7 implements E9K {
    public final C58372ka A00;

    public C65792x7(C58372ka r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void BKf(int i, int i2) {
        C58372ka r4 = this.A00;
        if (C18020vd.A05(C18040vf.A02, r4.A00, 4771)) {
            r4.A01.markerAnnotate(4, i, "instance", i2);
        }
    }

    public void BKh(int i) {
        C58372ka r5 = this.A00;
        Short sh = (short) 2;
        int intValue = sh.intValue();
        if (C18020vd.A05(C18040vf.A02, r5.A00, 4771)) {
            r5.A01.markerEnd(4, i, (short) intValue);
        }
    }

    public void BKi(int i) {
        C58372ka r4 = this.A00;
        if (C18020vd.A05(C18040vf.A02, r4.A00, 4771)) {
            r4.A01.markerStart(4, i);
        }
    }

    public long currentMonotonicTimestamp() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
