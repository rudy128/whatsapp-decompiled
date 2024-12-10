package X;

/* renamed from: X.6zj  reason: invalid class name and case insensitive filesystem */
public final class C139966zj {
    public final C33501iv A00;
    public final AnonymousClass10I A01;
    public final AnonymousClass1KB A02;
    public final C52352am A03;
    public final AnonymousClass00H A04;

    public final void A02(AnonymousClass1FU r8, C160848Ae r9, C18090vk r10, int i) {
        AnonymousClass1FU r2 = r8;
        C18070vi.A0d(r8, 0);
        C160848Ae r4 = r9;
        C18070vi.A0k(r10, r9);
        if (A01(i).intValue() != 0) {
            ((C37291pH) this.A04.get()).A02(r2, C138126wZ.A05, r4, Integer.valueOf(i), (String) null);
            return;
        }
        r10.invoke();
    }

    public static boolean A00(AnonymousClass749 r0) {
        return ((C139966zj) r0.A0B.get()).A03();
    }

    public final Integer A01(int i) {
        try {
            if (this.A00.A08(i)) {
                return AnonymousClass00R.A00;
            }
            return AnonymousClass00R.A01;
        } catch (IllegalArgumentException unused) {
            return AnonymousClass00R.A0C;
        }
    }

    public final boolean A03() {
        C18030ve r1 = this.A03.A00;
        Integer A012 = A01(Integer.parseInt(C108955ca.A0v(r1, 3810)));
        Integer num = AnonymousClass00R.A00;
        if (A012 == num || A01(Integer.parseInt(C108955ca.A0v(r1, 3834))) == num || A01(Integer.parseInt(C108955ca.A0v(r1, 6498))) == num) {
            return true;
        }
        return false;
    }

    public C139966zj(AnonymousClass1KB r1, C52352am r2, C33501iv r3, AnonymousClass10I r4, AnonymousClass00H r5) {
        C18070vi.A0w(r3, r5, r2, r4, r1);
        this.A00 = r3;
        this.A04 = r5;
        this.A03 = r2;
        this.A01 = r4;
        this.A02 = r1;
    }
}
