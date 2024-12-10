package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.4Wt  reason: invalid class name and case insensitive filesystem */
public class C87734Wt {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final /* synthetic */ C74323Zj A04;

    public C87734Wt(C74323Zj r1) {
        this.A04 = r1;
    }

    public static int A00(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int i = layoutParams.width;
        int i2 = 1073741824;
        int i3 = 0;
        if (i > 0) {
            i3 = 1073741824;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, i3);
        int i4 = layoutParams.height;
        if (i4 <= 0) {
            i2 = 0;
        }
        AnonymousClass3MY.A1C(view, i4, i2, makeMeasureSpec);
        return view.getMeasuredHeight();
    }
}
