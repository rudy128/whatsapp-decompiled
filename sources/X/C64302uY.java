package X;

import android.os.MessageQueue;

/* renamed from: X.2uY  reason: invalid class name and case insensitive filesystem */
public class C64302uY implements MessageQueue.IdleHandler {
    public final int A00;
    public final Object A01;

    public C64302uY(AnonymousClass1FP r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final boolean queueIdle() {
        if (this.A00 != 0) {
            ((AnonymousClass1FP) this.A01).A3S();
            return false;
        }
        ((AnonymousClass1FP) this.A01).A3R();
        return false;
    }
}
