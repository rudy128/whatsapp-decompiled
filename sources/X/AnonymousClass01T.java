package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.01T  reason: invalid class name */
public abstract class AnonymousClass01T {
    public boolean A00;
    public C18090vk A01;
    public final CopyOnWriteArrayList A02 = new CopyOnWriteArrayList();

    public void A01() {
    }

    public void A02() {
    }

    public abstract void A03();

    public void A04(C005002d r1) {
    }

    public final void A06(boolean z) {
        this.A00 = z;
        C18090vk r0 = this.A01;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public AnonymousClass01T(boolean z) {
        this.A00 = z;
    }

    public final C18090vk A00() {
        return this.A01;
    }

    public final void A05(C18090vk r1) {
        this.A01 = r1;
    }
}
