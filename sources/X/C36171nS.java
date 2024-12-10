package X;

/* renamed from: X.1nS  reason: invalid class name and case insensitive filesystem */
public class C36171nS {
    public final C18030ve A00;
    public final AnonymousClass18K A01;

    public static void A00(C46922Gk r3, C36171nS r4) {
        if (!C18020vd.A05(C18040vf.A02, r4.A00, 1730)) {
            r4.A01.CC7(r3);
        }
    }

    public static void A01(C46922Gk r2, C140056zs r3) {
        r2.A06 = r3.A05;
        r2.A08 = r3.A07;
        r2.A05 = r3.A04;
        r2.A04 = Long.valueOf((long) r3.A00);
        r2.A07 = r3.A06;
    }

    public void A02(C140056zs r3, Integer num, Long l) {
        C46922Gk r1 = new C46922Gk();
        A01(r1, r3);
        r1.A00 = 1;
        r1.A01 = 2;
        r1.A02 = num;
        r1.A03 = l;
        A00(r1, this);
    }

    public C36171nS(C18030ve r1, AnonymousClass18K r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
