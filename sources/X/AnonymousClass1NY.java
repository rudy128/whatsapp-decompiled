package X;

import java.util.Set;

/* renamed from: X.1NY  reason: invalid class name */
public final class AnonymousClass1NY implements AnonymousClass1CU {
    public final AnonymousClass190 A00;
    public final AnonymousClass118 A01;
    public final AnonymousClass1Cb A02;
    public final AnonymousClass1CP A03;
    public final AnonymousClass1CO A04;
    public final String A05;

    public AnonymousClass1NY(AnonymousClass190 r2, AnonymousClass118 r3, AnonymousClass1Cb r4, AnonymousClass1CP r5, AnonymousClass1CO r6, String str) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r5, 4);
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A05 = str;
    }

    public /* bridge */ /* synthetic */ C22591Cl CCq(Set set) {
        C18070vi.A0d(set, 0);
        AnonymousClass118 r7 = this.A01;
        AnonymousClass190 r6 = this.A00;
        AnonymousClass1CO r10 = this.A04;
        C39561tH r5 = new C39561tH(r6, r7, this.A02, this.A03, r10, this.A05);
        for (Object next : set) {
            AnonymousClass10W r2 = r5.A01;
            C18070vi.A0d(next, 0);
            AnonymousClass11L r1 = new AnonymousClass11L(next);
            if (r2.A01.putIfAbsent(next, r1) == null) {
                r2.A02.add(next);
                r1.A00();
            }
        }
        return r5;
    }
}
