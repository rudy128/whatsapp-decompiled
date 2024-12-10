package X;

/* renamed from: X.2lA  reason: invalid class name and case insensitive filesystem */
public final class C58732lA {
    public final AnonymousClass1NK A00;
    public final AnonymousClass1NJ A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass121 A05;
    public final C18030ve A06;
    public final AnonymousClass1PQ A07;
    public final AnonymousClass00H A08;

    public final void A00(C46162Dk r12) {
        if (this.A01.A05(r12.A08()) != 3) {
            C29681ch A0M = r12.A0M();
            Long valueOf = Long.valueOf(r12.A0E);
            A01(A0M, valueOf, 134, 3);
            A01(A0M, valueOf, 132, 4);
            if (r12.A0P()) {
                A01(A0M, valueOf, 154, 5);
            }
        }
    }

    public final void A01(AnonymousClass1BI r6, Long l, int i, long j) {
        long A012;
        C18070vi.A0d(r6, 0);
        if (l != null) {
            A012 = l.longValue();
        } else {
            A012 = AnonymousClass11P.A01(this.A04);
        }
        C436420i A022 = this.A07.A02(r6, i, A012);
        C18070vi.A0X(A022);
        A022.A0y = j;
        this.A05.BBY(A022);
        C57562jH r3 = (C57562jH) this.A08.get();
        C17880vN.A0d(r3.A02).A00(new C21458AkP(A022, r3, 49));
    }

    public C58732lA(AnonymousClass11P r2, AnonymousClass121 r3, AnonymousClass1NK r4, AnonymousClass1NJ r5, C18030ve r6, AnonymousClass1PQ r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r2, r4, r5, r8, r7);
        C18070vi.A0q(r9, r3, r10);
        C18070vi.A0d(r6, 9);
        this.A04 = r2;
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r8;
        this.A07 = r7;
        this.A03 = r9;
        this.A05 = r3;
        this.A08 = r10;
        this.A06 = r6;
    }
}
