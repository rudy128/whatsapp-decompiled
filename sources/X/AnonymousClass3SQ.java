package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.3SQ  reason: invalid class name */
public class AnonymousClass3SQ extends AnonymousClass1XU {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass3SQ(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void A1Z(View view, C26228CvK cvK) {
        if (this.A00 != 0) {
            super.A1Z(view, cvK);
            cvK.A0L(new C26137Ct0(16, (CharSequence) ((C85524Ns) this.A02).A02));
            return;
        }
        super.A1Z(view, cvK);
        cvK.A0f(false);
        cvK.A0m(false);
        cvK.A0M(C26137Ct0.A08);
        Context context = ((View) this.A01).getContext();
        int i = 2131894955;
        if (((AnonymousClass3V4) this.A02).A01.A09) {
            i = 2131894956;
        }
        cvK.A0Q(context.getString(i));
    }
}
