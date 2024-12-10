package X;

import java.util.List;

/* renamed from: X.7Ef  reason: invalid class name and case insensitive filesystem */
public class C143647Ef implements C43451zp {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C143647Ef(AnonymousClass206 r1, C120816Fm r2, List list, int i) {
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r1;
        this.A03 = list;
    }

    public final void BpK(Object obj) {
        if (this.A00 != 0) {
            C120816Fm r4 = (C120816Fm) this.A01;
            AnonymousClass206 r3 = (AnonymousClass206) this.A02;
            List list = (List) this.A03;
            C128376ft r6 = (C128376ft) obj;
            if (r6 != null) {
                r4.A07(r6.A00, r6.A01, r3, list);
                return;
            }
            return;
        }
        C120816Fm r2 = (C120816Fm) this.A01;
        r2.A04 = (CharSequence) obj;
        C120816Fm.A02((AnonymousClass206) this.A02, r2, (List) this.A03);
    }
}
