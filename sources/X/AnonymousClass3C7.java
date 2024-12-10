package X;

import com.facebook.msys.mci.Execution;

/* renamed from: X.3C7  reason: invalid class name */
public class AnonymousClass3C7 implements Runnable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    public AnonymousClass3C7(Object obj, int i, int i2, int i3, long j) {
        this.A00 = i3;
        this.A04 = obj;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = j;
    }

    public void run() {
        int i = this.A00;
        Object obj = this.A04;
        if (i != 0) {
            A7P a7p = (A7P) obj;
            int i2 = this.A01;
            int i3 = this.A02;
            long j = this.A03;
            C171778sG A002 = A7P.A00(a7p, i2);
            A002.A08 = Integer.valueOf(i3);
            A002.A0J = Long.valueOf(j);
            A7P.A01(A002, a7p);
            return;
        }
        Execution.executeAfterWithPriorityInternal((C70553Bn) obj, this.A01, this.A02, this.A03);
    }
}
