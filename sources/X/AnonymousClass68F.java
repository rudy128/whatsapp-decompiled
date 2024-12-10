package X;

/* renamed from: X.68F  reason: invalid class name */
public class AnonymousClass68F extends C57262in {
    public final int A00 = 1;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass68F(AnonymousClass1BI r2, C143087By r3) {
        super(r2, true);
        this.A01 = r3;
    }

    public void A00(int i) {
        if (this.A00 != 0) {
            super.A00(i);
            if (i > 0) {
                ((C143087By) this.A01).A03 = (long) i;
            }
            C143087By.A06((C143087By) this.A01);
            return;
        }
        super.A00(i);
        if (i != 0) {
            ((C143087By) ((AnonymousClass7RA) this.A01).A01).A03 = (long) i;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass68F(AnonymousClass7RA r2, AnonymousClass1BI r3) {
        super(r3, false);
        this.A01 = r2;
    }
}
