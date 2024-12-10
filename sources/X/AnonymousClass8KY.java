package X;

import android.os.SystemClock;

/* renamed from: X.8KY  reason: invalid class name */
public class AnonymousClass8KY extends C180179Ll implements C71993Kd {
    public int A00;
    public final long[] A01 = new long[5];

    public void BKR(boolean z) {
        long[] jArr = this.A01;
        synchronized (jArr) {
            int i = this.A00;
            int i2 = i + 1;
            this.A00 = i2;
            jArr[i] = SystemClock.uptimeMillis();
            this.A00 = i2 % 5;
        }
    }

    public AnonymousClass8KY() {
        C30221da.A02.A00(this);
    }
}
