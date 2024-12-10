package X;

import android.os.MessageQueue;

/* renamed from: X.Cz3  reason: case insensitive filesystem */
public class C26403Cz3 implements MessageQueue.IdleHandler {
    public final int A00;
    public final Object A01;

    public C26403Cz3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean queueIdle() {
        boolean z;
        switch (this.A00) {
            case 0:
                C25019CTv cTv = (C25019CTv) this.A01;
                C27082DTh.A01(cTv.A01, cTv, 49);
                synchronized (cTv) {
                    if (!cTv.A05.isEmpty() || !cTv.A04.isEmpty()) {
                        z = false;
                    } else {
                        cTv.A08 = false;
                        z = true;
                    }
                }
                return !z;
            case 1:
                C25019CTv cTv2 = (C25019CTv) this.A01;
                C27082DTh.A01(cTv2.A01, cTv2, 49);
                return true;
            default:
                AnonymousClass1FP.A0I((AnonymousClass1FP) this.A01);
                return false;
        }
    }
}
