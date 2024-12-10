package X;

/* renamed from: X.DJn  reason: case insensitive filesystem */
public final class C26932DJn implements E5Q {
    public final CQ9 A00;
    public final Object A01;

    public C26932DJn(CQ9 cq9, Object obj) {
        this.A01 = obj;
        this.A00 = cq9;
    }

    public final void CTC() {
        if (CHD.A01 == null) {
            CHD.A01 = new C2F((C24432C3h) null);
        }
        synchronized (CHD.A00) {
        }
        throw AnonymousClass000.A0n("Must call PhenotypeContext.setContext() first");
    }
}
