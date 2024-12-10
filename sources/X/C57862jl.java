package X;

import android.os.Handler;

/* renamed from: X.2jl  reason: invalid class name and case insensitive filesystem */
public final class C57862jl {
    public final C29771cq A00;
    public final C31251fG A01;
    public final C25151Nc A02;
    public final C18100vl A03 = new C18110vm(new AnonymousClass3HU(this));
    public final C18100vl A04 = new C18110vm(new AnonymousClass3HV(this));

    public final void A00() {
        C18100vl r3 = this.A03;
        C18100vl r1 = this.A04;
        ((Handler) r3.getValue()).removeCallbacks((Runnable) r1.getValue());
        ((Handler) r3.getValue()).postDelayed((Runnable) r1.getValue(), 60000);
    }

    public C57862jl(C29771cq r3, C31251fG r4, C25151Nc r5) {
        C18070vi.A0o(r4, r3, r5);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
    }
}
