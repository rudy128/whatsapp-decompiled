package X;

import java.util.concurrent.Executor;

/* renamed from: X.AlB  reason: case insensitive filesystem */
public class C21502AlB implements Executor {
    public final int A00;
    public final Object A01;

    public C21502AlB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void execute(Runnable runnable) {
        if (this.A00 != 0) {
            ((AnonymousClass10I) this.A01).CGF(runnable);
        } else {
            ((C20367AHx) this.A01).A00.post(runnable);
        }
    }
}
