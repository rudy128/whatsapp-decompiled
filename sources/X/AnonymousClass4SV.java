package X;

import android.view.View;

/* renamed from: X.4SV  reason: invalid class name */
public final class AnonymousClass4SV {
    public final AnonymousClass1CJ A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass18O A03;
    public final AnonymousClass11E A04;
    public final AnonymousClass1M9 A05;
    public final C24921Me A06;
    public final C18000vb A07;
    public final AnonymousClass1NN A08;
    public final AnonymousClass1MZ A09;
    public final C18030ve A0A;
    public final AnonymousClass126 A0B;
    public final AnonymousClass12M A0C;
    public final C25011Mn A0D;
    public final AnonymousClass00H A0E;

    public final void A00(AnonymousClass1FU r7, AnonymousClass1BI r8, AnonymousClass1EC r9) {
        String A0K;
        C29741cn r0;
        boolean A17 = C18070vi.A17(r8, r7);
        AnonymousClass1CJ r1 = this.A00;
        C29691ci A002 = AnonymousClass1CJ.A00(r1, r8);
        if (A002 == null || (r0 = A002.A0h) == null || r0.A00 != A17) {
            AnonymousClass1E7 A0F = this.A05.A0F(r8);
            if (A0F == null || (A0K = A0F.A0K()) == null || A0K.length() == 0) {
                C83784Gq.A00(r7, 2, 2131886481);
            } else if (r9 == null || !AnonymousClass3MX.A1Y(this.A0A)) {
                this.A01.get();
                r7.startActivity(AnonymousClass1LU.A0Z(r7, r8));
            } else {
                String A0F2 = r1.A0F(r9);
                if (A0F2 != null) {
                    C73203Rj A003 = AnonymousClass4a6.A00(r7);
                    A003.A0g(r7, new C91514fo(r8, r7, this, 9), 2131896585);
                    C73203Rj.A05(r7, A003, 7, 2131898766);
                    A003.A0E(2131896586);
                    A003.A0S(C17890vO.A0R(r7, A0F2, 1, 0, 2131896584));
                    A003.A0C();
                }
            }
        } else {
            r7.CMl(C83834Gv.A00(false, A17));
        }
    }

    public final void A01(AnonymousClass1FU r32, AnonymousClass1BI r33, String str) {
        AnonymousClass1BI r14 = r33;
        C18070vi.A0d(r14, 0);
        AnonymousClass1KB r12 = this.A02;
        C25011Mn r11 = this.A0D;
        AnonymousClass18O r10 = this.A03;
        C18000vb r9 = this.A07;
        C24921Me r8 = this.A06;
        AnonymousClass1M9 r7 = this.A05;
        AnonymousClass126 r6 = this.A0B;
        AnonymousClass12M r5 = this.A0C;
        AnonymousClass11E r4 = this.A04;
        AnonymousClass1NN r3 = this.A08;
        AnonymousClass1FU r17 = r32;
        AnonymousClass1MZ r25 = this.A09;
        AnonymousClass126 r26 = r6;
        C18000vb r23 = r9;
        AnonymousClass1NN r24 = r3;
        AnonymousClass1M9 r21 = r7;
        C24921Me r22 = r8;
        AnonymousClass18O r19 = r10;
        AnonymousClass11E r20 = r4;
        AnonymousClass1KB r18 = r12;
        AnonymousClass4VI r15 = new AnonymousClass4VI((View) null, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, (AnonymousClass4QE) C18070vi.A0E(this.A0E), r5, (AnonymousClass1EC) r14, r11);
        r15.A00 = new C96284nb(r17, this, r14);
        r15.A00(str);
    }

    public AnonymousClass4SV(AnonymousClass1KB r1, AnonymousClass18O r2, AnonymousClass11E r3, AnonymousClass1M9 r4, C24921Me r5, C18000vb r6, AnonymousClass1CJ r7, AnonymousClass1NN r8, AnonymousClass1MZ r9, C18030ve r10, AnonymousClass126 r11, AnonymousClass12M r12, C25011Mn r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        C18070vi.A0w(r10, r1, r7, r14, r13);
        C18070vi.A0x(r2, r4, r5, r6, r11);
        C18070vi.A0y(r12, r8, r15, r9, r3);
        this.A0A = r10;
        this.A02 = r1;
        this.A00 = r7;
        this.A01 = r14;
        this.A0D = r13;
        this.A03 = r2;
        this.A05 = r4;
        this.A06 = r5;
        this.A07 = r6;
        this.A0B = r11;
        this.A0C = r12;
        this.A08 = r8;
        this.A0E = r15;
        this.A09 = r9;
        this.A04 = r3;
    }
}
