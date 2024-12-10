package X;

import java.util.concurrent.Executor;

/* renamed from: X.2Py  reason: invalid class name and case insensitive filesystem */
public class C49302Py extends AnonymousClass10P {
    public final /* synthetic */ AnonymousClass10J A00;
    public final /* synthetic */ boolean A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C49302Py(X.AnonymousClass10J r10, java.util.concurrent.BlockingQueue r11, java.util.concurrent.ThreadFactory r12, java.util.concurrent.TimeUnit r13, int r14, int r15, long r16, boolean r18) {
        /*
            r9 = this;
            r1 = r9
            r9.A00 = r10
            r0 = r18
            r9.A01 = r0
            r7 = r11
            r8 = r12
            r6 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r1.<init>(r2, r3, r4, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49302Py.<init>(X.10J, java.util.concurrent.BlockingQueue, java.util.concurrent.ThreadFactory, java.util.concurrent.TimeUnit, int, int, long, boolean):void");
    }

    public void afterExecute(Runnable runnable, Throwable th) {
        if (this.A01) {
            Executor executor = AnonymousClass10J.A07;
        }
    }

    public void beforeExecute(Thread thread, Runnable runnable) {
        if (this.A01) {
            Executor executor = AnonymousClass10J.A07;
        }
    }

    public void execute(Runnable runnable) {
        Executor executor = AnonymousClass10J.A07;
        Boolean bool = C17960vV.A01;
        super.execute(runnable);
    }
}
