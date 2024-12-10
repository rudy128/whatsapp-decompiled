package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.whatsapp.WaTabLayout;

/* renamed from: X.5hU  reason: invalid class name and case insensitive filesystem */
public class C110915hU extends AnonymousClass1XU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ WaTabLayout A02;

    public C110915hU(View view, WaTabLayout waTabLayout, int i) {
        this.A02 = waTabLayout;
        this.A01 = view;
        this.A00 = i;
    }

    public void A1Z(View view, C26228CvK cvK) {
        super.A1Z(view, cvK);
        cvK.A0F(this.A01);
        cvK.A0a(new C25476CgV(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, this.A00, 1, false)));
    }
}
