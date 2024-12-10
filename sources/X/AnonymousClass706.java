package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.706  reason: invalid class name */
public final class AnonymousClass706 {
    public final C18030ve A00;
    public final C26161Rb A01;
    public final AnonymousClass18K A02;
    public final AnonymousClass00H A03;

    public final void A01(AnonymousClass1BI r13) {
        A00(r13, this, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, 1);
    }

    public static final void A00(AnonymousClass1BI r5, AnonymousClass706 r6, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, int i) {
        C18030ve r3 = r6.A00;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r3, 6034)) {
            AnonymousClass64C r1 = new AnonymousClass64C();
            r1.A09 = C17880vN.A0h();
            r1.A04 = Integer.valueOf(i);
            r1.A0C = r6.A01.A04(r5.getRawString());
            r1.A08 = num;
            r1.A02 = num2;
            r1.A07 = num3;
            r1.A0A = C108975cc.A0X();
            r1.A06 = num4;
            r1.A05 = num5;
            if (C18020vd.A05(r2, r3, 10912)) {
                r1.A0B = str;
            }
            r1.A03 = num6;
            r1.A01 = bool;
            r1.A00 = bool2;
            r6.A02.CC7(r1);
        }
    }

    public final void A04(AnonymousClass206 r17, Boolean bool, int i, boolean z) {
        UserJid A0I;
        Boolean bool2;
        String str;
        AnonymousClass206 r3 = r17;
        C18030ve r2 = this.A00;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 10535) && (A0I = r3.A0I()) != null) {
            C20956AcA A002 = AnonymousClass9RV.A00(r3);
            if (A002 != null) {
                bool2 = Boolean.valueOf(A002.A02);
            } else {
                bool2 = null;
            }
            if (C72463Mc.A1Y(bool2) || !C18020vd.A05(r1, r2, 10953)) {
                this.A03.get();
                if (r3 instanceof C439521o) {
                    str = ((C439521o) r3).A00.A05;
                } else {
                    str = null;
                }
                int i2 = 9;
                if (z) {
                    i2 = 10;
                }
                A00(A0I, this, bool2, bool, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(i), str, i2);
            }
        }
    }

    public AnonymousClass706(C18030ve r2, C26161Rb r3, AnonymousClass18K r4, AnonymousClass00H r5) {
        C18070vi.A0j(r2, r4);
        C18070vi.A0d(r5, 4);
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
    }

    public final void A02(AnonymousClass1BI r13, int i, int i2) {
        AnonymousClass1BI r0 = r13;
        A00(r0, this, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(i), Integer.valueOf(i2), (Integer) null, (String) null, 7);
    }

    public final void A03(AnonymousClass1BI r13, String str, int i) {
        AnonymousClass1BI r0 = r13;
        A00(r0, this, (Boolean) null, (Boolean) null, Integer.valueOf(i), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, str, 2);
    }
}
