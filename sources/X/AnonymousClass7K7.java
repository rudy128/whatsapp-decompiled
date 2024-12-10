package X;

/* renamed from: X.7K7  reason: invalid class name */
public final class AnonymousClass7K7 implements C1607689v {
    public final /* synthetic */ C128586gM A00;

    public AnonymousClass7K7(C128586gM r1) {
        this.A00 = r1;
    }

    public void C4e(C1607589u r3) {
        C128586gM r1 = this.A00;
        if (r3 == r1.A00) {
            r1.A01.C4e(r3);
            r1.A00 = null;
        }
    }

    public void C4f(C1607589u r2) {
        C128586gM r0 = this.A00;
        r0.A00 = r2;
        r0.A01.C4f(r2);
    }

    public void C4g(C1607589u r5, int i) {
        C128586gM r3 = this.A00;
        if (r5 == r3.A00) {
            for (C1607589u r1 : r3.A02) {
                if (r1 != r3.A00) {
                    r1.C5r(i);
                }
            }
            r3.A01.C4g(r5, i);
        }
    }
}
