package X;

import java.lang.Thread;
import java.lang.ref.WeakReference;

/* renamed from: X.DTo  reason: case insensitive filesystem */
public class C27089DTo implements Thread.UncaughtExceptionHandler {
    public WeakReference A00;

    public void uncaughtException(Thread thread, Throwable th) {
        C26376Cyc cyc = (C26376Cyc) this.A00.get();
        if (cyc != null) {
            cyc.A05.Bxp(AnonymousClass8BR.A0x(th));
        }
    }
}
