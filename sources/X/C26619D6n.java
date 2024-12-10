package X;

/* renamed from: X.D6n  reason: case insensitive filesystem */
public class C26619D6n implements C22851Dl {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C26619D6n(AnonymousClass1DS r1, AnonymousClass1DS r2, C22801Dg r3, C28540E6o e6o, int i) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = r3;
        this.A03 = e6o;
    }

    public final void Bo9(Object obj) {
        Object BCH;
        int i = this.A00;
        AnonymousClass1DS r3 = (AnonymousClass1DS) this.A04;
        C28540E6o e6o = (C28540E6o) this.A03;
        Object A06 = ((AnonymousClass1DS) this.A01).A06();
        Object A062 = ((AnonymousClass1DS) this.A02).A06();
        switch (i) {
            case 0:
                if (obj != null && A06 != null && A062 != null) {
                    BCH = e6o.BCH(obj, A06, A062);
                    break;
                } else {
                    return;
                }
                break;
            case 1:
                if (A06 != null && obj != null && A062 != null) {
                    BCH = e6o.BCH(A06, obj, A062);
                    break;
                } else {
                    return;
                }
            default:
                if (A06 != null && A062 != null && obj != null) {
                    BCH = e6o.BCH(A06, A062, obj);
                    break;
                } else {
                    return;
                }
        }
        r3.A0F(BCH);
    }
}
