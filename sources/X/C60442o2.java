package X;

import android.content.Intent;
import android.os.SystemClock;

/* renamed from: X.2o2  reason: invalid class name and case insensitive filesystem */
public abstract class C60442o2 {
    public static final void A01(Intent intent, String str) {
        C18070vi.A0d(intent, 0);
        if (!intent.hasExtra("perf_origin")) {
            intent.putExtra("perf_origin", str);
        }
    }

    public static final void A00(Intent intent, AnonymousClass11P r4, String str) {
        C18070vi.A0n(intent, str, r4);
        if (!intent.hasExtra("perf_start_time_ns")) {
            intent.putExtra("perf_start_time_ns", SystemClock.elapsedRealtimeNanos());
        }
        if (!intent.hasExtra("perf_origin")) {
            intent.putExtra("perf_origin", str);
        }
    }
}
