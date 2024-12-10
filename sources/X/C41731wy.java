package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1wy  reason: invalid class name and case insensitive filesystem */
public class C41731wy extends AnonymousClass1DT {
    public final AtomicBoolean A00 = new AtomicBoolean(false);

    public void A0A(AnonymousClass1F9 r3, C22851Dl r4) {
        if (this.A00 > 0) {
            throw new IllegalStateException("Can not register multiple observers for a *Single*LiveEvent");
        }
        super.A0A(r3, new C41741wz(r4, this));
    }

    public void A0E(Object obj) {
        this.A00.set(true);
        super.A0E(obj);
    }

    public void A0F(Object obj) {
        this.A00.set(true);
        super.A0F(obj);
    }

    public C41731wy(Object obj) {
        super(obj);
    }

    public C41731wy() {
    }
}
