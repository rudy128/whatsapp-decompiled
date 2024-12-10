package X;

/* renamed from: X.4mx  reason: invalid class name and case insensitive filesystem */
public class C95884mx implements C107375Zl {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C95884mx(AnonymousClass3O9 r1, AnonymousClass4aN r2, int i) {
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r1;
    }

    public final void C5m(int[] iArr) {
        int i = this.A00;
        AnonymousClass4aN r0 = (AnonymousClass4aN) this.A01;
        AnonymousClass3O9 r1 = (AnonymousClass3O9) this.A02;
        AnonymousClass4aN.A04(r0, iArr);
        r1.setEmoji(iArr);
        C18010vc r02 = r0.A0M;
        if (i != 0) {
            C1409873v.A03(r02, iArr);
        } else {
            C1409873v.A04(r02, iArr);
        }
        r1.invalidate();
    }
}
