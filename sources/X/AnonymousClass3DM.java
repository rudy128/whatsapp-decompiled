package X;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: X.3DM  reason: invalid class name */
public class AnonymousClass3DM implements Executor {
    public int A00;
    public final int A01;
    public final AnonymousClass10I A02;
    public final Queue A03 = new ArrayDeque();
    public final boolean A04;

    public synchronized void execute(Runnable runnable) {
        this.A03.offer(new AnonymousClass7RD(this, runnable, 41));
        if (this.A00 < this.A01) {
            A00(this);
        }
    }

    public static void A00(AnonymousClass3DM r3) {
        Runnable runnable = (Runnable) r3.A03.poll();
        if (runnable != null) {
            r3.A00++;
            boolean z = r3.A04;
            AnonymousClass10I r0 = r3.A02;
            if (z) {
                r0.CGN(runnable);
            } else {
                r0.CGF(runnable);
            }
        }
    }

    public AnonymousClass3DM(AnonymousClass10I r2, int i, boolean z) {
        this.A02 = r2;
        this.A01 = i;
        this.A04 = z;
    }
}
