package X;

/* renamed from: X.5gv  reason: invalid class name and case insensitive filesystem */
public class C110705gv extends AnonymousClass01T {
    public C110125ey A00;

    public C110705gv() {
        super(false);
    }

    public void A03() {
        boolean z;
        C110125ey r0 = this.A00;
        if (r0 == null || !r0.canGoBack()) {
            z = false;
        } else {
            this.A00.goBack();
            z = this.A00.canGoBack();
        }
        A06(z);
    }
}
