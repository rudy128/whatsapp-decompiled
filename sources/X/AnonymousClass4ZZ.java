package X;

/* renamed from: X.4ZZ  reason: invalid class name */
public final class AnonymousClass4ZZ {
    public final int A00;
    public final AnonymousClass18K A01;

    public AnonymousClass4ZZ(AnonymousClass18K r2, int i) {
        C18070vi.A0d(r2, 2);
        this.A00 = i;
        this.A01 = r2;
    }

    public static C81313z2 A00(AnonymousClass4ZZ r2) {
        C81313z2 r1 = new C81313z2();
        r1.A01 = Integer.valueOf(r2.A00);
        return r1;
    }

    public static void A01(AnonymousClass4ZZ r1, C81313z2 r2, int i) {
        r2.A02 = Integer.valueOf(i);
        r2.A00 = false;
        r1.A01.CC7(r2);
    }

    public final void A02() {
        A01(this, A00(this), 3);
    }

    public final void A03() {
        A01(this, A00(this), 6);
    }
}
