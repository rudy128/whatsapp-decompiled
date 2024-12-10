package X;

import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.8n9  reason: invalid class name */
public final class AnonymousClass8n9 extends C169808mv {
    public final AnonymousClass1S4 A00;
    public final AnonymousClass1LW A01;
    public final AnonymousClass00H A02;
    public final Integer A03 = AnonymousClass00R.A0j;
    public final Integer A04 = AnonymousClass00R.A00;
    public final C18030ve A05;

    public void A0M(C170558qD r5, C170558qD r6) {
        C18070vi.A0d(r5, 0);
        if (r6 == null) {
            AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(r5.A02);
            if (A022 != null) {
                if (A022 instanceof PhoneUserJid) {
                    C42701yb.A01(A022);
                }
                String A0A = r5.A0G(A022.getRawString()).A0A();
                String A0A2 = r5.A0G(A022.getRawString()).A0A();
                boolean equals = A022.equals(A022);
                C26331Rs r0 = this.A00;
                r6 = (C170558qD) r0.A09(A0A2);
                if (r6 == null) {
                    if (!equals) {
                        r6 = (C170558qD) r0.A09(A0A);
                    }
                }
            }
            r6 = null;
        }
        super.A0I(r5, r6);
    }

    public boolean A0J() {
        C18030ve r2 = this.A05;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 5587) || C18020vd.A05(r1, r2, 4873)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8n9(AnonymousClass1S4 r2, AnonymousClass9j5 r3, AnonymousClass1LW r4, C26331Rs r5, C18030ve r6, AnonymousClass00H r7) {
        super(r3, r5);
        C18070vi.A0w(r6, r4, r2, r7, r5);
        C18070vi.A0d(r3, 6);
        this.A05 = r6;
        this.A01 = r4;
        this.A00 = r2;
        this.A02 = r7;
    }

    public String A0D() {
        return "regular_low";
    }
}
