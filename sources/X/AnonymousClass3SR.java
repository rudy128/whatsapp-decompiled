package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.3SR  reason: invalid class name */
public class AnonymousClass3SR extends AnonymousClass1XU {
    public final /* synthetic */ View A00;
    public final /* synthetic */ CharSequence A01;
    public final /* synthetic */ CharSequence A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass3SR(View view, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.A02 = charSequence;
        this.A01 = charSequence2;
        this.A00 = view;
        this.A03 = z;
    }

    public void A1Z(View view, C26228CvK cvK) {
        super.A1Z(view, cvK);
        cvK.A0V("Button");
        cvK.A0q(false);
        cvK.A0Q(this.A02);
        CharSequence charSequence = this.A01;
        if (charSequence != null) {
            cvK.A0L(new C26137Ct0(16, charSequence));
        }
        View view2 = (View) this.A00.getParent();
        if (this.A03 && view2 != null) {
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            int i = iArr[0];
            cvK.A0D(new Rect(i, iArr[1], view2.getWidth() + i, AnonymousClass3MW.A02(view2, iArr[1])));
        }
    }
}
