package X;

import android.app.ActivityManager;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;

/* renamed from: X.1Wc  reason: invalid class name and case insensitive filesystem */
public class C27441Wc {
    public long A00;
    public final AnonymousClass11C A01;
    public final AnonymousClass11P A02;

    public C27441Wc(AnonymousClass11C r1, AnonymousClass11P r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public Long A00() {
        ActivityManager A04;
        if (SystemClock.uptimeMillis() - this.A00 > 300000 && (A04 = this.A01.A04()) != null) {
            Debug.MemoryInfo[] processMemoryInfo = A04.getProcessMemoryInfo(new int[]{Process.myPid()});
            this.A00 = SystemClock.uptimeMillis();
            if (processMemoryInfo != null && processMemoryInfo.length > 0) {
                return Long.valueOf((long) processMemoryInfo[0].getTotalPrivateDirty());
            }
        }
        return null;
    }
}
