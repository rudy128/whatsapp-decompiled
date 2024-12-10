package X;

/* renamed from: X.ChK  reason: case insensitive filesystem */
public final class C25522ChK {
    public C6B A00;
    public final C6V A01;

    public static C6B A00(C25522ChK chK, BNB bnb, EEE[] eeeArr, int i) {
        EEE eee = eeeArr[i];
        C18070vi.A0d(eee, 1);
        C6B c6b = chK.A00;
        if (c6b != null) {
            return c6b;
        }
        BNA bna = new BNA(bnb, chK.A01, ((AnonymousClass1JG) eee).name);
        chK.A00 = bna;
        return bna;
    }

    public C25522ChK(C6V c6v) {
        this.A01 = c6v;
    }
}
