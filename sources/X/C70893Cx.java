package X;

/* renamed from: X.3Cx  reason: invalid class name and case insensitive filesystem */
public class C70893Cx implements Runnable, Comparable, C107095Yj {
    public final Runnable A00;
    public final Object A01;
    public final Object A02;
    public volatile boolean A03 = false;
    public final /* synthetic */ C26461Sf A04;

    public void run() {
        try {
            this.A03 = true;
            this.A00.run();
        } finally {
            C26461Sf.A00(this, this.A04, this.A02);
            this.A03 = false;
        }
    }

    public C70893Cx(C26461Sf r2, Object obj, Object obj2, Runnable runnable) {
        this.A04 = r2;
        this.A02 = obj;
        this.A00 = runnable;
        this.A01 = obj2;
    }

    public void cancel() {
        Runnable runnable = this.A00;
        if (runnable instanceof C107095Yj) {
            ((C107095Yj) runnable).cancel();
        }
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C70893Cx r3 = (C70893Cx) obj;
        Runnable runnable = this.A00;
        if (runnable instanceof Comparable) {
            return ((Comparable) runnable).compareTo(r3.A00);
        }
        return 0;
    }
}
