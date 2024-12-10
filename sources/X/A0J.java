package X;

import java.lang.ref.Reference;

public final class A0J {
    public final AnonymousClass1KB A00;
    public final C18030ve A01;
    public final AnonymousClass1QO A02;
    public final AnonymousClass1QE A03 = AnonymousClass1QE.A00("IndiaUpiP2mCheckoutSessionRepository", "payment", "IN");
    public final AnonymousClass1R2 A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass11P A08;

    public static final void A00(A7B a7b, A0J a0j, AnonymousClass205 r6, AnonymousClass9FM r7) {
        BBC bbc;
        AnonymousClass9AY r3 = (AnonymousClass9AY) a0j.A07.get();
        r3.A03.A04(AnonymousClass001.A1E(r6, "Removing pending callback for ", AnonymousClass000.A10()));
        Reference reference = (Reference) r3.A00.remove(r6);
        if (reference != null && (bbc = (BBC) reference.get()) != null) {
            a0j.A03.A04(AnonymousClass001.A1E(r6, "Executing pending callback for ", AnonymousClass000.A10()));
            if (r7 != null) {
                bbc.C3k(r7);
            }
            if (a7b != null) {
                bbc.Bss(a7b);
            }
        }
    }

    public final void A01(AnonymousClass205 r3) {
        if (r3 != null) {
            ((AnonymousClass9AY) this.A07.get()).A0B(r3, "UPI");
        }
    }

    public A0J(AnonymousClass1KB r4, AnonymousClass11P r5, C18030ve r6, AnonymousClass1QO r7, AnonymousClass1R2 r8, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        C18070vi.A0w(r5, r6, r4, r9, r8);
        C18070vi.A0q(r7, r10, r11);
        this.A08 = r5;
        this.A01 = r6;
        this.A00 = r4;
        this.A05 = r9;
        this.A04 = r8;
        this.A02 = r7;
        this.A07 = r10;
        this.A06 = r11;
    }
}
