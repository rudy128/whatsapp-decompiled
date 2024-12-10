package X;

import java.util.HashMap;

/* renamed from: X.25h  reason: invalid class name and case insensitive filesystem */
public class C449225h extends C200910u {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C449225h(C200710s r1, Runnable runnable, String str, int i) {
        super(str);
        this.A00 = i;
        this.A01 = r1;
        this.A02 = runnable;
    }

    public void run() {
        Runnable runnable;
        if (this.A00 != 0) {
            C200710s r2 = (C200710s) this.A01;
            synchronized (r2) {
                HashMap hashMap = r2.A02;
                runnable = (Runnable) this.A02;
                hashMap.remove(runnable);
            }
            r2.execute(runnable);
            return;
        }
        try {
            C200710s r22 = (C200710s) this.A01;
            r22.A06 = Thread.currentThread().getId();
            synchronized (r22.A01) {
                ((Runnable) this.A02).run();
            }
            r22.A06 = -1;
            C200710s.A01(r22);
        } catch (Throwable th) {
            C200710s r23 = (C200710s) this.A01;
            r23.A06 = -1;
            C200710s.A01(r23);
            throw th;
        }
    }
}
