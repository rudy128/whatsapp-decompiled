package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1tv  reason: invalid class name and case insensitive filesystem */
public abstract class C39961tv implements C38591rZ {
    public final AnonymousClass1KB A00;
    public final AtomicBoolean A01 = new AtomicBoolean(false);

    public C39961tv(AnonymousClass1KB r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    public final void onResult(Object obj) {
        if (!this.A01.getAndSet(true)) {
            this.A00.A0J(new C70633Bw(this, obj, 25));
        }
    }
}
