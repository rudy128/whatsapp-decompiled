package X;

/* renamed from: X.71b  reason: invalid class name and case insensitive filesystem */
public final class C1403571b {
    public final C18030ve A00;
    public final C26431Sc A01;

    public static final C135276rw A00(Integer num, int i, int i2) {
        double d = ((double) i) / ((double) i2);
        if (d < 0.5625d) {
            return new C135276rw(num, (int) (((float) i2) * 0.5625f), i2);
        }
        if (d > 0.5625d) {
            return new C135276rw(num, i, (int) (((float) i) / 0.5625f));
        }
        return new C135276rw(num, i, i2);
    }

    public static final C135276rw A01(C18090vk r2, int i, int i2, int i3, int i4) {
        if (i > i2 || C108945cZ.A05(i, i2) <= 5) {
            i4 = AnonymousClass000.A0M(r2.invoke());
        }
        Integer valueOf = Integer.valueOf(i4);
        C135276rw A002 = A00(valueOf, i, i2);
        int i5 = A002.A00;
        if (i5 < i3) {
            return new C135276rw(valueOf, (int) (((float) i3) * 0.5625f), i3);
        }
        if (i5 > i4) {
            return new C135276rw(valueOf, (int) (((float) i4) * 0.5625f), i4);
        }
        return A002;
    }

    public final C135276rw A02(int i, int i2) {
        return A01(new C151487mN(this), i, i2, C18020vd.A00(C18040vf.A02, this.A00, 9734), this.A01.A0C(true, false, false).A02);
    }

    public C1403571b(C18030ve r1, C26431Sc r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
