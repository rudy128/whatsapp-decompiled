package X;

import android.view.View;

/* renamed from: X.BJe  reason: case insensitive filesystem */
public final class C22663BJe extends AnonymousClass1XU {
    public final DFL A00;

    public C22663BJe(DFL dfl) {
        this.A00 = dfl;
    }

    public void A1Z(View view, C26228CvK cvK) {
        boolean A15 = C18070vi.A15(view, cvK);
        super.A1Z(view, cvK);
        DFL dfl = this.A00;
        String A0e = BE7.A0e(dfl);
        String A0f = BE7.A0f(dfl);
        if (A0e != null) {
            cvK.A0Q(A0e);
        }
        C24566C9n.A00(view.getContext(), view, cvK, A0f);
        String A0g = BE7.A0g(dfl);
        if (A0g != null) {
            cvK.A0L(new C26137Ct0(16, (CharSequence) A0g));
        }
        boolean A0I = dfl.A0I(42, A15);
        boolean A0I2 = dfl.A0I(43, A15);
        cvK.A0q(A0I);
        cvK.A0h(!A0I2);
    }
}
