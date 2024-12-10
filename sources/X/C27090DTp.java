package X;

import java.lang.Thread;

/* renamed from: X.DTp  reason: case insensitive filesystem */
public class C27090DTp implements Thread.UncaughtExceptionHandler {
    public final int A00;
    public final Object A01;

    public C27090DTp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (this.A00 != 0) {
            C26380Cyg.A0D((C26380Cyg) this.A01, th);
        } else {
            C26236CvW.A03((C26236CvW) this.A01, th);
        }
    }
}
