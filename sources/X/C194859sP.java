package X;

/* renamed from: X.9sP  reason: invalid class name and case insensitive filesystem */
public final class C194859sP {
    public C194289rU A00;
    public final AnonymousClass18K A01;
    public final AnonymousClass00H A02;
    public final C200710s A03;

    public final void A02(Integer num, Integer num2, int i) {
        A01((Boolean) null, (Boolean) null, num, num2, (Integer) null, i);
    }

    public final void A00() {
        AnonymousClass00H r2;
        String str;
        C194289rU r0 = this.A00;
        String A0Q = C17890vO.A0Q();
        if (r0 == null) {
            r2 = this.A02;
            str = C108985cd.A0f();
        } else {
            r2 = r0.A00;
            str = r0.A02;
        }
        this.A00 = new C194289rU(r2, str, A0Q);
    }

    public final void A01(Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, int i) {
        Long l;
        int intValue;
        C194289rU r1 = this.A00;
        if (r1 != null) {
            C171478rm r2 = new C171478rm();
            r2.A08 = r1.A02;
            r2.A09 = r1.A01;
            r2.A07 = AnonymousClass3MW.A0y(((C189339iv) r1.A00.get()).A00);
            r2.A06 = AnonymousClass8BT.A0m();
            r2.A03 = num;
            r2.A02 = Integer.valueOf(i);
            if (!(num2 == null || (intValue = num2.intValue()) == -1)) {
                r2.A05 = C17880vN.A0n(intValue);
            }
            if (num3 != null) {
                l = C17890vO.A0N(num3);
            } else {
                l = null;
            }
            r2.A04 = l;
            r2.A00 = bool;
            r2.A01 = bool2;
            C21431Ajy.A00(this.A03, this, r2, 27);
        }
    }

    public C194859sP(AnonymousClass18K r2, AnonymousClass10I r3, AnonymousClass00H r4) {
        C18070vi.A0o(r3, r2, r4);
        this.A01 = r2;
        this.A02 = r4;
        this.A03 = C200710s.A00(r3);
    }
}
