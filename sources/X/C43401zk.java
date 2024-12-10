package X;

import android.view.View;

/* renamed from: X.1zk  reason: invalid class name and case insensitive filesystem */
public class C43401zk extends AnonymousClass1XU {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C43401zk(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public void A1Z(View view, C26228CvK cvK) {
        super.A1Z(view, cvK);
        cvK.A0V("Button");
        cvK.A0q(false);
        cvK.A0Q(this.A02);
        String str = this.A00;
        if (str != null) {
            cvK.A0L(new C26137Ct0(16, (CharSequence) str));
        }
        String str2 = this.A01;
        if (str2 != null) {
            cvK.A0L(new C26137Ct0(32, (CharSequence) str2));
        }
    }
}
