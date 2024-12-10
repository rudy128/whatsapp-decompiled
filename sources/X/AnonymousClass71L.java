package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.71L  reason: invalid class name */
public final class AnonymousClass71L {
    public static final C131266ko A08 = new Object();
    public final AnonymousClass1KB A00;
    public final C32011gU A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    public static final void A00(AnonymousClass77S r4, C135586sR r5, AnonymousClass71L r6, List list) {
        ArrayList A002 = A08.A00(r4, (C58612ky) C18070vi.A0E(r6.A05), list);
        AnonymousClass1IX r0 = r5.A00;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C108985cd.A1F(Long.valueOf(((AnonymousClass206) next).A0x), next, A002, A13);
        }
        ArrayList A0D = C29351c6.A0D(A13);
        Iterator it2 = A13.iterator();
        while (it2.hasNext()) {
            C108995ce.A1Q(A0D, it2);
        }
        AnonymousClass74B.A06(r6.A00, (AnonymousClass2LI) C18070vi.A0E(r6.A03), r6.A06, A0D, 3);
    }

    public AnonymousClass71L(AnonymousClass1KB r1, C32011gU r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        C18070vi.A0q(r6, r7, r8);
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r6;
        this.A07 = r7;
        this.A02 = r8;
    }
}
