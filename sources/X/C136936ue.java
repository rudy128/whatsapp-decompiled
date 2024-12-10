package X;

/* renamed from: X.6ue  reason: invalid class name and case insensitive filesystem */
public final class C136936ue {
    public Integer A00;
    public String A01;
    public String A02;
    public Long A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass18K A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;

    public final void A05(Integer num, String str, int i, boolean z) {
        Long l = null;
        if (i != 1) {
            Long l2 = this.A03;
            if (l2 != null) {
                l = C108945cZ.A1B(System.currentTimeMillis(), l2.longValue());
            }
        } else {
            this.A03 = C108955ca.A0m();
        }
        C1183463c r1 = new C1183463c();
        r1.A02 = Integer.valueOf(i);
        r1.A06 = this.A02;
        r1.A05 = this.A01;
        r1.A01 = num;
        r1.A04 = str;
        r1.A03 = l;
        r1.A00 = Boolean.valueOf(z);
        this.A05.CC7(r1);
    }

    public final void A00(int i) {
        Integer num = this.A00;
        if (num != null && num.intValue() == i) {
            this.A02 = null;
            this.A00 = null;
        }
    }

    public final void A01(int i) {
        if (this.A02 == null && this.A00 == null) {
            this.A02 = C17890vO.A0Q();
            this.A00 = Integer.valueOf(i);
        }
    }

    public final void A02(int i, String str, String str2) {
        AnonymousClass63T r2 = new AnonymousClass63T();
        r2.A01 = str2;
        r2.A04 = str;
        r2.A00 = Integer.valueOf(i);
        r2.A05 = C138886xr.A00(this.A06);
        r2.A03 = ((C133716pN) this.A09.get()).A01();
        r2.A02 = C108995ce.A0X(",", ((C132436mn) this.A08.get()).A00());
        this.A05.CC7(r2);
    }

    public final void A03(Boolean bool, int i) {
        AnonymousClass63S r1 = new AnonymousClass63S();
        r1.A05 = this.A02;
        String str = this.A01;
        if (str == null) {
            str = C17890vO.A0Q();
            this.A01 = str;
        }
        C18070vi.A0b(str);
        r1.A04 = str;
        r1.A02 = this.A00;
        r1.A03 = Integer.valueOf(i);
        r1.A01 = bool;
        r1.A00 = Boolean.valueOf(C108975cc.A1I(this.A07));
        this.A05.CC7(r1);
    }

    public final void A04(Integer num, String str, int i, boolean z) {
        C1183463c r1 = new C1183463c();
        r1.A02 = Integer.valueOf(i);
        r1.A06 = this.A02;
        r1.A05 = this.A01;
        r1.A01 = num;
        r1.A04 = str;
        r1.A00 = Boolean.valueOf(z);
        this.A05.CC7(r1);
    }

    public C136936ue(AnonymousClass11P r2, AnonymousClass18K r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        C18070vi.A0d(r7, 6);
        this.A04 = r2;
        this.A05 = r3;
        this.A06 = r4;
        this.A07 = r5;
        this.A09 = r6;
        this.A08 = r7;
    }
}
