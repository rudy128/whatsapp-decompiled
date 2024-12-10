package X;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.0My  reason: invalid class name and case insensitive filesystem */
public final class C04370My {
    public boolean A00;
    public final Object A01 = new Object();
    public final Runnable A02 = new C06430Yh(this);
    public final List A03 = AnonymousClass000.A13();
    public final Executor A04;
    public final C18090vk A05;

    public C04370My(Executor executor, C18090vk r3) {
        C18070vi.A0d(executor, 1);
        this.A04 = executor;
        this.A05 = r3;
    }

    public static final void A00(C04370My r2) {
        C18070vi.A0d(r2, 0);
        synchronized (r2.A01) {
            if (!r2.A00) {
                r2.A05.invoke();
                r2.A01();
            }
        }
    }

    public final void A01() {
        synchronized (this.A01) {
            this.A00 = true;
            List<C18090vk> list = this.A03;
            for (C18090vk invoke : list) {
                invoke.invoke();
            }
            list.clear();
        }
    }
}
