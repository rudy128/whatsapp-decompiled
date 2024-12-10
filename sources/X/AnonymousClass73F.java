package X;

import android.content.SharedPreferences;

/* renamed from: X.73F  reason: invalid class name */
public final class AnonymousClass73F {
    public final AnonymousClass11P A00;
    public final C19830z4 A01;
    public final AnonymousClass121 A02;
    public final C18030ve A03;
    public final AnonymousClass1PQ A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass10I A0C;

    public final void A03(AnonymousClass1BI r12) {
        C18070vi.A0d(r12, 0);
        AnonymousClass11P r3 = this.A00;
        ((C133556oy) this.A09.get()).A00(AnonymousClass11P.A01(r3), true);
        A04(r12);
        C185109c2 r0 = new C185109c2(r3, (AnonymousClass1OZ) C18070vi.A0E(this.A0B));
        C132066m8 r1 = new C132066m8(r12, this);
        AnonymousClass1OZ r2 = r0.A01;
        String A0B2 = r2.A0B();
        r2.A0I(new C693736y(r1, 2), (C29621ca) new AnonymousClass9F7(A0B2, 27, 20231028, 5).A00, A0B2, 434, 20000);
    }

    public static AnonymousClass706 A00(AnonymousClass73F r0) {
        return (AnonymousClass706) r0.A07.get();
    }

    public static final void A01(AnonymousClass73F r2, C18090vk r3) {
        if (C18020vd.A05(C18040vf.A02, r2.A03, 6730)) {
            r3.invoke();
        }
    }

    public static final boolean A02(AnonymousClass1BI r7, AnonymousClass73F r8) {
        if (((C133556oy) r8.A09.get()).A01()) {
            AnonymousClass00H r3 = r8.A08;
            if (C18070vi.A03(((C127666ej) r3.get()).A01).getBoolean(r7.getRawString(), false)) {
                SharedPreferences A032 = C18070vi.A03(((C127666ej) r3.get()).A01);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("pref_disclosure_eligibility_ts_");
                long A052 = C17890vO.A05(A032, AnonymousClass000.A0y(r7.getRawString(), A10));
                if (AnonymousClass11P.A01(r8.A00) - A052 > C17890vO.A03(C18020vd.A00(C18040vf.A02, r8.A03, 5990))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean A05() {
        C18030ve r2 = this.A03;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 976) || C18020vd.A05(r1, r2, 10388)) {
            return false;
        }
        return true;
    }

    public final boolean A06() {
        C18030ve r2 = this.A03;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 10379) || !C18020vd.A05(r1, r2, 10388)) {
            return false;
        }
        return true;
    }

    public final boolean A07() {
        C18030ve r2 = this.A03;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 10379) || C18020vd.A05(r1, r2, 10388)) {
            return false;
        }
        return true;
    }

    public final boolean A08(AnonymousClass1BI r4) {
        if (!C18020vd.A05(C18040vf.A02, this.A03, 5869) || !C18070vi.A03(((C127666ej) this.A08.get()).A01).getBoolean(r4.getRawString(), false) || !((C133556oy) this.A09.get()).A01()) {
            return false;
        }
        return true;
    }

    public AnonymousClass73F(AnonymousClass11P r1, C19830z4 r2, AnonymousClass121 r3, C18030ve r4, AnonymousClass1PQ r5, AnonymousClass10I r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        C18070vi.A0w(r1, r4, r6, r7, r8);
        C18070vi.A0x(r2, r5, r3, r9, r10);
        C18070vi.A0r(r11, r12, r13);
        this.A00 = r1;
        this.A03 = r4;
        this.A0C = r6;
        this.A0A = r7;
        this.A0B = r8;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A06 = r9;
        this.A07 = r10;
        this.A08 = r11;
        this.A09 = r12;
        this.A05 = r13;
    }

    public final void A04(AnonymousClass1BI r7) {
        if (A02(r7, this)) {
            AnonymousClass00H r5 = this.A08;
            SharedPreferences A032 = C18070vi.A03(((C127666ej) r5.get()).A01);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("pref_disclosure_system_message_shown_");
            if (!A032.getBoolean(AnonymousClass000.A0y(r7.getRawString(), A10), false)) {
                C17880vN.A1F(C108995ce.A0E(((C127666ej) r5.get()).A01), AnonymousClass000.A0y(r7.getRawString(), AnonymousClass000.A11("pref_disclosure_system_message_shown_")), true);
                this.A0C.CGF(new C21433Ak0(this, r7, 44));
            }
        }
    }
}
