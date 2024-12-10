package X;

import android.view.View;

/* renamed from: X.1zC  reason: invalid class name and case insensitive filesystem */
public class C43071zC extends AnonymousClass1XU {
    public final /* synthetic */ C43061zB[] A00;

    public C43071zC(C43061zB[] r1) {
        this.A00 = r1;
    }

    public void A1Z(View view, C26228CvK cvK) {
        String string;
        super.A1Z(view, cvK);
        for (C43061zB r3 : this.A00) {
            if (r3 instanceof C45722Bk) {
                string = ((C45722Bk) r3).A00;
            } else if (r3.A01 != 0) {
                string = view.getContext().getString(r3.A01);
            }
            if (string != null) {
                cvK.A0L(new C26137Ct0(r3.A00, (CharSequence) string));
            }
        }
    }
}
