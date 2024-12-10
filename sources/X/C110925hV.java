package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.whatsapp.PagerSlidingTabStrip;

/* renamed from: X.5hV  reason: invalid class name and case insensitive filesystem */
public class C110925hV extends AnonymousClass1XU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ PagerSlidingTabStrip A02;
    public final /* synthetic */ String A03;

    public C110925hV(View view, PagerSlidingTabStrip pagerSlidingTabStrip, String str, int i) {
        this.A02 = pagerSlidingTabStrip;
        this.A01 = view;
        this.A03 = str;
        this.A00 = i;
    }

    public void A1Z(View view, C26228CvK cvK) {
        super.A1Z(view, cvK);
        if (view.isSelected()) {
            cvK.A0M(C26137Ct0.A08);
            cvK.A0f(false);
        }
        Context context = this.A01.getContext();
        Object[] objArr = new Object[3];
        objArr[0] = this.A03;
        C17880vN.A1T(objArr, this.A00 + 1, 1);
        PagerSlidingTabStrip pagerSlidingTabStrip = this.A02;
        AnonymousClass3Ma.A1S(objArr, pagerSlidingTabStrip.A02);
        cvK.A0Q(context.getString(2131886280, objArr));
        if (Build.VERSION.SDK_INT >= 22) {
            view.setAccessibilityTraversalBefore(pagerSlidingTabStrip.A04.getId());
        }
    }
}
