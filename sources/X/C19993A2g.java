package X;

import com.whatsapp.infra.graphql.BaseMexCallback;

/* renamed from: X.A2g  reason: case insensitive filesystem */
public final class C19993A2g {
    public long A00 = 32000;
    public boolean A01;
    public C35021lW A02;
    public final AnonymousClass5WY A03;
    public final AnonymousClass1PX A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;

    public void A02(C35021lW r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public static final C191799nC A00(C33051iB r13, C19993A2g a2g) {
        AnonymousClass1PX r8 = a2g.A04;
        C184499b3 r4 = (C184499b3) C18070vi.A0E(a2g.A08);
        C18030ve r3 = (C18030ve) C18070vi.A0E(a2g.A05);
        long j = a2g.A00;
        boolean z = a2g.A01;
        return new C191799nC(a2g.A03, a2g.A02, r3, r4, r13, (C192659ol) C18070vi.A0E(a2g.A09), (C191019lt) C18070vi.A0E(a2g.A07), r8, (AnonymousClass1OZ) C18070vi.A0E(a2g.A06), j, z);
    }

    public void A04(C22821Di r2) {
        C1193567u r0 = new C1193567u();
        r2.invoke(r0);
        A00(r0, this).A00();
    }

    public C19993A2g(AnonymousClass5WY r3, AnonymousClass1PX r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        this.A03 = r3;
        this.A04 = r4;
        this.A09 = r5;
        this.A07 = r6;
        this.A06 = r7;
        this.A08 = r8;
        this.A05 = r9;
    }

    public Object A01(C30391dr r3, C22821Di r4) {
        C71053Dp A0k = C108975cc.A0k(r3);
        A04(new AnonymousClass82L(A0k, r4));
        return A0k.A00();
    }

    public void A03(BaseMexCallback baseMexCallback) {
        A00(baseMexCallback, this).A00();
    }
}
