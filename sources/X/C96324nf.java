package X;

import java.io.File;

/* renamed from: X.4nf  reason: invalid class name and case insensitive filesystem */
public final class C96324nf implements BC1 {
    public final /* synthetic */ AnonymousClass4X4 A00;
    public final /* synthetic */ AnonymousClass1E7 A01;
    public final /* synthetic */ AnonymousClass1EB A02;

    public void C7e(AnonymousClass4OX r7, AnonymousClass1EC r8) {
        C18070vi.A0d(r8, 0);
        AnonymousClass4X4 r4 = this.A00;
        r4.A0H.remove(this.A02);
        File A002 = r4.A07.A00(this.A01);
        if (A002 != null && A002.exists()) {
            C27071Up.A01(r4.A05.A0H(r8), r4.A0G, A002, (byte[]) null, false);
        }
        AnonymousClass4X4.A00(r4, r4.A0I.decrementAndGet());
    }

    public C96324nf(AnonymousClass4X4 r1, AnonymousClass1E7 r2, AnonymousClass1EB r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void C8g() {
        AnonymousClass4X4 r1 = this.A00;
        AnonymousClass4X4.A00(r1, r1.A0I.decrementAndGet());
    }

    public void onError(int i) {
        AnonymousClass4X4 r1 = this.A00;
        AnonymousClass4X4.A00(r1, r1.A0I.decrementAndGet());
    }
}
