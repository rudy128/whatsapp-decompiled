package X;

import android.system.Os;
import android.system.OsConstants;

/* renamed from: X.9T2  reason: invalid class name */
public abstract class AnonymousClass9T2 {
    public static final long A00;

    static {
        long j = 100;
        long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
        if (sysconf > 0) {
            j = sysconf;
        }
        A00 = j;
    }
}
