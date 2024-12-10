package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6ox  reason: invalid class name and case insensitive filesystem */
public final class C133546ox {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public void A00(C132756nV r12, Boolean bool) {
        long j;
        if (!C18070vi.A19(bool, false)) {
            C130716jt r6 = r12.A00;
            C18070vi.A0z(r6, "null cannot be cast to non-null type com.whatsapp.newsletter.logging.merlin.WhatsappMerlinData");
            if (r6.A05 != null) {
                List<AnonymousClass6UF> list = r12.A03;
                for (AnonymousClass6UF r0 : list) {
                    C134016ps r5 = r0.A01;
                    List<C123376Uf> list2 = r5.A07;
                    C123376Uf r02 = (C123376Uf) C29431cG.A0c(list2);
                    if (r02 != null) {
                        j = r02.A00;
                    } else {
                        j = 0;
                    }
                    for (C123376Uf A012 : list2) {
                        A01(A012, 0);
                    }
                    for (C123376Uf A013 : r5.A02) {
                        A01(A013, j);
                    }
                    for (C123376Uf A014 : r5.A04) {
                        A01(A014, j);
                    }
                    for (C123376Uf A015 : r5.A05) {
                        A01(A015, j);
                    }
                    for (C123376Uf A016 : r5.A03) {
                        A01(A016, j);
                    }
                }
                ArrayList A0D = C29351c6.A0D(list);
                for (AnonymousClass6UF r03 : list) {
                    C108955ca.A1U(r03.A01, A0D);
                }
                r6.A07 = C29431cG.A0g(", ", "", "", A0D, (C22821Di) null);
                ArrayList A0D2 = C29351c6.A0D(list);
                for (AnonymousClass6UF r04 : list) {
                    C134016ps r9 = r04.A01;
                    StringBuilder A10 = AnonymousClass000.A10();
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("\"t50\":");
                    A102.append(AnonymousClass6VU.A00(r9.A03));
                    A10.append(C17890vO.A0c(A102, ','));
                    A10.append(10);
                    StringBuilder A103 = AnonymousClass000.A10();
                    A103.append("\"t100\":");
                    C108985cd.A1L(AnonymousClass6VU.A00(r9.A05), A103, A10);
                    A10.append(10);
                    A0D2.add(C18070vi.A0H(A10));
                }
                r6.A08 = C29431cG.A0g(", ", "", "", A0D2, (C22821Di) null);
                AnonymousClass74D r52 = (AnonymousClass74D) this.A00.get();
                C1185663y r4 = new C1185663y();
                r4.A06 = r6.A05;
                r4.A02 = r6.A02;
                r4.A05 = r6.A04;
                r4.A03 = Long.valueOf(AnonymousClass74D.A02(r52));
                r4.A04 = r6.A03;
                r4.A07 = r6.A06;
                r4.A00 = r6.A00;
                r4.A01 = r6.A01;
                StringBuilder A104 = AnonymousClass000.A10();
                A104.append('{');
                A104.append(r6.A07);
                r4.A08 = C17890vO.A0c(A104, '}');
                StringBuilder A105 = AnonymousClass000.A10();
                A105.append('{');
                A105.append(r6.A08);
                r4.A09 = C17890vO.A0c(A105, '}');
                r52.A05.CC7(r4);
            }
        }
    }

    public final void A01(C123376Uf r7, long j) {
        C18070vi.A0d(r7, 0);
        this.A01.get();
        long currentTimeMillis = System.currentTimeMillis();
        if (j != 0) {
            currentTimeMillis += r7.A00 - j;
        }
        r7.A00 = currentTimeMillis;
        r7.A01 = (r7.A01 - r7.A00) + currentTimeMillis;
    }

    public C133546ox(AnonymousClass00H r1, AnonymousClass00H r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
