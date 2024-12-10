package X;

import android.os.SystemClock;

/* renamed from: X.0vQ  reason: invalid class name and case insensitive filesystem */
public final class C17910vQ {
    public static final C17910vQ A04 = new C17910vQ();
    public long A00;
    public long A01 = SystemClock.elapsedRealtime();
    public long A02 = SystemClock.uptimeMillis();
    public long A03 = SystemClock.elapsedRealtimeNanos();

    public static final C17910vQ A00() {
        return A04;
    }

    public final void A01() {
        this.A00 = SystemClock.elapsedRealtimeNanos();
    }
}
