package X;

/* renamed from: X.7Cb  reason: invalid class name and case insensitive filesystem */
public class C143117Cb implements C72073Kn {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public C143117Cb(AnonymousClass1FU r1, C138636xR r2, AnonymousClass1E7 r3, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = r2;
        this.A03 = r1;
        this.A01 = i;
        this.A04 = r3;
        this.A05 = str;
    }

    public final void C3p(boolean z) {
        int i;
        int i2;
        String str;
        Object obj;
        Object obj2;
        C138636xR r2;
        AnonymousClass1KB r0;
        switch (this.A00) {
            case 0:
                r2 = (C138636xR) this.A02;
                obj2 = this.A03;
                i2 = this.A01;
                obj = this.A04;
                str = this.A05;
                if (z) {
                    r0 = r2.A00;
                    i = 1;
                    break;
                } else {
                    return;
                }
            case 1:
                r2 = (C138636xR) this.A02;
                obj2 = this.A03;
                i2 = this.A01;
                obj = this.A04;
                str = this.A05;
                if (z) {
                    r0 = r2.A00;
                    i = 2;
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        r0.A0J(new C98824rm(r2, obj2, obj, str, i2, i));
    }
}
