package X;

import android.view.View;

/* renamed from: X.3SN  reason: invalid class name */
public class AnonymousClass3SN extends AnonymousClass1XU {
    public final int A00;

    public AnonymousClass3SN(int i) {
        this.A00 = i;
    }

    public void A1Z(View view, C26228CvK cvK) {
        boolean z;
        switch (this.A00) {
            case 0:
                super.A1Z(view, cvK);
                z = true;
                break;
            case 1:
                z = C18070vi.A16(view, cvK);
                super.A1Z(view, cvK);
                break;
            default:
                C18070vi.A0h(view, cvK);
                super.A1Z(view, cvK);
                cvK.A0V("Button");
                return;
        }
        cvK.A0k(z);
    }
}
