package X;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: X.10s  reason: invalid class name and case insensitive filesystem */
public class C200710s implements Executor {
    public Runnable A00;
    public final Object A01;
    public final HashMap A02;
    public final AnonymousClass10I A03;
    public final Queue A04;
    public final boolean A05;
    public volatile long A06;

    public C200710s(AnonymousClass10I r2) {
        this(r2, false);
    }

    public static C200710s A00(AnonymousClass10I r2) {
        return new C200710s(r2, false);
    }

    public static synchronized void A01(C200710s r2) {
        synchronized (r2) {
            Runnable runnable = (Runnable) r2.A04.poll();
            r2.A00 = runnable;
            if (runnable != null) {
                if (r2.A05) {
                    r2.A03.CGN(runnable);
                } else {
                    r2.A03.CGF(runnable);
                }
            }
        }
    }

    public synchronized void A03() {
        this.A04.clear();
        HashMap hashMap = this.A02;
        for (Runnable CEz : hashMap.values()) {
            this.A03.CEz(CEz);
        }
        hashMap.clear();
    }

    public synchronized void A04(Runnable runnable) {
        this.A04.remove(runnable);
        Runnable runnable2 = (Runnable) this.A02.remove(runnable);
        if (runnable2 != null) {
            this.A03.CEz(runnable2);
        }
    }

    public synchronized void A05(Runnable runnable, long j) {
        AnonymousClass10I r3 = this.A03;
        StringBuilder sb = new StringBuilder();
        sb.append("SerialExecutor/executeDelayed/");
        sb.append(C200810t.A00(runnable));
        this.A02.put(runnable, r3.CGv(new C449225h(this, runnable, sb.toString(), 1), j));
    }

    public synchronized void execute(Runnable runnable) {
        Queue queue = this.A04;
        StringBuilder sb = new StringBuilder();
        sb.append("SerialExecutor/execute/");
        sb.append(C200810t.A00(runnable));
        queue.offer(new C449225h(this, runnable, sb.toString(), 0));
        if (this.A00 == null) {
            A01(this);
        }
    }

    public boolean A06() {
        if (this.A06 == Thread.currentThread().getId()) {
            return true;
        }
        return false;
    }

    public void A02() {
        C17960vV.A0F(A06(), "Not running on this SerialExecutor");
    }

    public C200710s(AnonymousClass10I r2, boolean z) {
        this.A01 = new Object();
        this.A04 = new ArrayDeque();
        this.A02 = new HashMap();
        this.A03 = r2;
        this.A05 = z;
    }
}
