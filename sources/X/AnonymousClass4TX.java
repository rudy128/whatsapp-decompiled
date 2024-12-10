package X;

/* renamed from: X.4TX  reason: invalid class name */
public class AnonymousClass4TX {
    public final AnonymousClass19Y A00;
    public final C84884Lf A01;

    public AnonymousClass4TX(C84884Lf r1, AnonymousClass19Y r2) {
        C18070vi.A0j(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }

    public void A00(String str) {
        C18070vi.A0d(str, 1);
        if (C18020vd.A05(C18040vf.A02, this.A01.A00, 2087)) {
            this.A00.markerPoint(1029386189, str);
        }
    }

    public void A01(String str) {
        if (C18020vd.A05(C18040vf.A02, this.A01.A00, 2087)) {
            this.A00.markerStart(1029386189, "entry_point", str);
        }
    }

    public void A02(String str, short s) {
        if (C18020vd.A05(C18040vf.A02, this.A01.A00, 2087)) {
            AnonymousClass19Y r0 = this.A00;
            if (str == null) {
                r0.markerEnd(1029386189, s);
            } else {
                r0.Biw(str, s);
            }
        }
    }
}
