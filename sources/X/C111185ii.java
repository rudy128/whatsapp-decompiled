package X;

import java.util.List;

/* renamed from: X.5ii  reason: invalid class name and case insensitive filesystem */
public final class C111185ii extends AnonymousClass1J2 {
    public String A00 = "";
    public boolean A01;
    public final AnonymousClass1DT A02 = C108945cZ.A0S();
    public final C19830z4 A03;
    public final C18030ve A04;
    public final C129276hX A05;
    public final C18100vl A06 = AnonymousClass1DF.A01(new C153947qL(this));

    public static final void A00(C111185ii r7, String str, boolean z) {
        r7.A01 = z;
        if (str.length() <= 20) {
            String A0o = C108985cd.A0o(str, "[\\p{Punct}¥%，。？；：（）【】「」《》—¡!«»¿?{}]");
            if (C18070vi.A18(A0o, r7.A00) && !z) {
                return;
            }
            if (A0o.length() != 0) {
                r7.A00 = A0o;
                C129276hX r6 = r7.A05;
                C17960vV.A02();
                C131976ly r4 = new C131976ly();
                if (((C133686pK) r6.A03.get()).A02) {
                    C121806Lo r1 = r6.A00;
                    if (r1 != null) {
                        r1.A0B(true);
                        r6.A00 = null;
                    }
                    C121806Lo r3 = new C121806Lo(new AnonymousClass7IL(r4, 3), r6, r6.A01);
                    r6.A00 = r3;
                    r6.A02.CGD(r3, A0o);
                }
                r4.A00((AnonymousClass87G) r7.A06.getValue());
                return;
            }
        }
        r7.A02.A0F(C18460wS.A00);
        r7.A00 = "";
        C129276hX r2 = r7.A05;
        C121806Lo r12 = r2.A00;
        if (r12 != null) {
            r12.A0B(true);
            r2.A00 = null;
        }
    }

    public void A0T() {
        List A10 = AnonymousClass3MW.A10(this.A02);
        if (A10 != null && !A10.isEmpty()) {
            A00(this, this.A00, true);
        }
    }

    public C111185ii(C19830z4 r2, C18030ve r3, C129276hX r4) {
        C18070vi.A0o(r3, r2, r4);
        this.A04 = r3;
        this.A03 = r2;
        this.A05 = r4;
    }
}
