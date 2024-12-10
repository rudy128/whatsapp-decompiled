package X;

import java.util.Comparator;

/* renamed from: X.4rr  reason: invalid class name and case insensitive filesystem */
public class C98874rr implements Comparator {
    public final AnonymousClass1M9 A00;
    public final C24921Me A01;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass1M9 r1 = this.A00;
        AnonymousClass1E7 A0H = r1.A0H(((C178109Bv) obj).A00);
        AnonymousClass1E7 A0H2 = r1.A0H(((C178109Bv) obj2).A00);
        C59042lf r4 = A0H.A0H;
        boolean z = false;
        boolean A1W = AnonymousClass000.A1W(r4);
        if (A0H2.A0H != null) {
            z = true;
        }
        if (A1W == z) {
            C24921Me r0 = this.A01;
            String A0I = r0.A0I(A0H);
            String A0I2 = r0.A0I(A0H2);
            if (A0I == null) {
                return -1;
            }
            if (A0I2 != null) {
                return A0I.compareTo(A0I2);
            }
            return 1;
        } else if (r4 != null) {
            return -1;
        } else {
            return 1;
        }
    }

    public C98874rr(AnonymousClass1M9 r1, C24921Me r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
