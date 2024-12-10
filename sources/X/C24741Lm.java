package X;

import java.lang.ref.WeakReference;

/* renamed from: X.1Lm  reason: invalid class name and case insensitive filesystem */
public abstract class C24741Lm implements C24721Lk, C24731Ll {
    public final AnonymousClass193 A00;
    public final C24561Ku A01;

    public C24741Lm(C24571Kv r2) {
        C18070vi.A0d(r2, 1);
        C24561Ku r0 = r2.A00;
        C18070vi.A0X(r0);
        this.A01 = r0;
        AnonymousClass193 r02 = (AnonymousClass193) r2.A01.get();
        C18070vi.A0X(r02);
        this.A00 = r02;
    }

    public final void A09() {
        this.A01.registerObserver(this);
        AnonymousClass193 r2 = this.A00;
        synchronized (r2) {
            r2.A00.add(new WeakReference(this));
        }
    }
}
