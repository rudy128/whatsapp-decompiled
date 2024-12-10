package X;

/* renamed from: X.8Fv  reason: invalid class name and case insensitive filesystem */
public final class C161558Fv extends AnonymousClass1J2 {
    public String A00;
    public final C22801Dg A01;
    public final C198719yn A02;

    /* JADX WARNING: type inference failed for: r2v1, types: [X.1Dh, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.1Dh, java.lang.Object] */
    public C161558Fv(C198719yn r6) {
        C18070vi.A0d(r6, 1);
        this.A02 = r6;
        C22801Dg A0R = C108945cZ.A0R();
        A0R.A0F(new C19972A1h((C195679tj) null, false, false));
        ? obj = new Object();
        ? obj2 = new Object();
        C20339AGv.A01(r6.A00, A0R, new B1Y(A0R, this, obj, obj2), 3);
        C20339AGv.A01(r6.A01, A0R, new B1D(A0R, this, obj2), 3);
        this.A01 = A0R;
    }

    public final C195679tj A0T() {
        C19972A1h a1h = (C19972A1h) this.A01.A06();
        if (a1h != null) {
            return a1h.A00;
        }
        return null;
    }

    public final void A0U(String str) {
        C19972A1h a1h = (C19972A1h) this.A01.A06();
        if (a1h == null || a1h.A02) {
            C198719yn r2 = this.A02;
            C21452AkJ.A00(r2.A0C, r2, str, 28);
            return;
        }
        this.A00 = str;
    }
}
