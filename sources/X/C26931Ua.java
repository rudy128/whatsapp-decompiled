package X;

/* renamed from: X.1Ua  reason: invalid class name and case insensitive filesystem */
public final class C26931Ua {
    public Boolean A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass1UN A02;
    public final AnonymousClass1UZ A03;
    public final AnonymousClass18K A04;

    public C26931Ua(AnonymousClass11P r2, AnonymousClass1UN r3, AnonymousClass1UZ r4, AnonymousClass18K r5) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r4, 4);
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
    }

    public static final void A00(C26931Ua r5, int i, long j) {
        Boolean bool = r5.A00;
        if (bool == null) {
            bool = Boolean.valueOf(r5.A02.A06());
            r5.A00 = bool;
        }
        if (!C18070vi.A18(bool, true) || r5.A02.A02.A0O() > 0) {
            r5.A02.A02.A0O();
            return;
        }
        AnonymousClass18K r2 = r5.A04;
        AnonymousClass2HY r1 = new AnonymousClass2HY();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = Long.valueOf(j);
        r2.CC4(r1);
    }
}
