package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.30E  reason: invalid class name */
public final class AnonymousClass30E implements C72113Kr {
    public final AnonymousClass11S A00;
    public final AnonymousClass1M9 A01;
    public final C24921Me A02;
    public final AnonymousClass118 A03;
    public final AnonymousClass1CJ A04;
    public final AnonymousClass1NI A05;
    public final AnonymousClass1MZ A06;
    public final C18030ve A07;

    public void Bqf() {
        if (C18020vd.A05(C18040vf.A02, this.A07, 6645)) {
            LinkedHashMap A13 = C17880vN.A13();
            Collection A0H = this.A04.A0H();
            C18070vi.A0X(A0H);
            ArrayList A132 = AnonymousClass000.A13();
            for (Object next : A0H) {
                if (((C29691ci) next).A08() instanceof AnonymousClass1EC) {
                    A132.add(next);
                }
            }
            ArrayList<C29691ci> A133 = AnonymousClass000.A13();
            for (Object next2 : A132) {
                AnonymousClass1E7 A0G = this.A01.A0G(((C29691ci) next2).A08());
                if (A0G != null && A0G.A0F()) {
                    String A0K = A0G.A0K();
                    if (A0K == null || A0K.length() == 0) {
                        A133.add(next2);
                    }
                }
            }
            for (C29691ci r1 : A133) {
                AnonymousClass118 r7 = this.A03;
                AnonymousClass11S r4 = this.A00;
                AnonymousClass1M9 r5 = this.A01;
                C24921Me r6 = this.A02;
                AnonymousClass1MZ r8 = this.A06;
                AnonymousClass1BI A08 = r1.A08();
                C18070vi.A0z(A08, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
                A13.put(C88374Zl.A00(r4, r5, r6, r7, r8, (AnonymousClass1E9) A08), r1);
            }
            Iterator A15 = AnonymousClass000.A15(A13);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                this.A05.A03(((C29691ci) A16.getValue()).A08(), C17880vN.A0x(A16));
            }
        }
    }

    public AnonymousClass30E(AnonymousClass11S r1, AnonymousClass1M9 r2, C24921Me r3, AnonymousClass118 r4, AnonymousClass1CJ r5, AnonymousClass1NI r6, AnonymousClass1MZ r7, C18030ve r8) {
        C18070vi.A0w(r8, r4, r1, r5, r6);
        C18070vi.A0q(r2, r3, r7);
        this.A07 = r8;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = r7;
    }
}
