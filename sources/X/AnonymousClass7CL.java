package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7CL  reason: invalid class name */
public final class AnonymousClass7CL implements AnonymousClass191, C24401Ke {
    public final AnonymousClass1VC A00;
    public final AtomicBoolean A01 = new AtomicBoolean();
    public final AnonymousClass195 A02;
    public final AnonymousClass10I A03;

    public /* synthetic */ void Blf() {
    }

    public void onAppBackgrounded() {
    }

    public void BlT() {
        this.A02.unregisterObserver(this);
        this.A03.CGF(new C146447Pd(this, 28));
    }

    public void Blg() {
        AnonymousClass195 r1 = this.A02;
        if (!r1.A00) {
            r1.registerObserver(this);
        } else if (!this.A01.getAndSet(true)) {
            this.A00.A00();
        }
    }

    public AnonymousClass7CL(AnonymousClass195 r2, AnonymousClass1VC r3, AnonymousClass10I r4) {
        C18070vi.A0o(r4, r3, r2);
        this.A03 = r4;
        this.A00 = r3;
        this.A02 = r2;
    }

    public void Ba9() {
    }
}
