package X;

import java.util.concurrent.Executor;

/* renamed from: X.00u  reason: invalid class name and case insensitive filesystem */
public class C001600u extends C001500t {
    public static final Executor A02 = new C001700v();
    public static volatile C001600u A03;
    public C001500t A00;
    public final C001500t A01;

    public static C001600u A00() {
        if (A03 == null) {
            synchronized (C001600u.class) {
                if (A03 == null) {
                    A03 = new C001600u();
                }
            }
        }
        return A03;
    }

    public void A01(Runnable runnable) {
        this.A00.A01(runnable);
    }

    public void A02(Runnable runnable) {
        this.A00.A02(runnable);
    }

    public boolean A03() {
        return this.A00.A03();
    }

    public C001600u() {
        C001800w r0 = new C001800w();
        this.A01 = r0;
        this.A00 = r0;
    }
}
