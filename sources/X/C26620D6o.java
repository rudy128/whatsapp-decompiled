package X;

/* renamed from: X.D6o  reason: case insensitive filesystem */
public class C26620D6o implements C22851Dl {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public C26620D6o(AnonymousClass1DS r1, C22801Dg r2, C28541E6p e6p, int i, boolean z) {
        this.A00 = i;
        this.A01 = r1;
        this.A04 = z;
        this.A02 = r2;
        this.A03 = e6p;
    }

    public final void Bo9(Object obj) {
        Object BCG;
        int i = this.A00;
        boolean z = this.A04;
        AnonymousClass1DS r2 = (AnonymousClass1DS) this.A02;
        C28541E6p e6p = (C28541E6p) this.A03;
        Object A06 = ((AnonymousClass1DS) this.A01).A06();
        if (i != 0) {
            if (z || !(A06 == null || obj == null)) {
                BCG = e6p.BCG(A06, obj);
            } else {
                return;
            }
        } else if (z || !(obj == null || A06 == null)) {
            BCG = e6p.BCG(obj, A06);
        } else {
            return;
        }
        r2.A0F(BCG);
    }
}
