package X;

import android.os.SystemClock;

/* renamed from: X.8Kj  reason: invalid class name and case insensitive filesystem */
public class C162348Kj extends C223019j {
    /* JADX WARNING: type inference failed for: r0v0, types: [X.19z, java.lang.Object] */
    public /* bridge */ /* synthetic */ C224519z A01() {
        return new Object();
    }

    public /* bridge */ /* synthetic */ boolean A02(C224519z r3) {
        C162308Kf r32 = (C162308Kf) r3;
        if (r32 != null) {
            r32.realtimeMs = SystemClock.elapsedRealtime();
            r32.uptimeMs = SystemClock.uptimeMillis();
            return true;
        }
        throw AnonymousClass000.A0k("Null value passed to getSnapshot!");
    }
}
