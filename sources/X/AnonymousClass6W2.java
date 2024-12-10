package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.6W2  reason: invalid class name */
public abstract class AnonymousClass6W2 {
    public static final int A00(View view, C38251qy r4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        boolean A1I = r4.A1I();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        boolean z = layoutParams instanceof C38491rN;
        if (A1I) {
            if (!z || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return view.getMeasuredWidth();
            }
            return view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
        } else if (!z || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return view.getMeasuredHeight();
        } else {
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
    }
}
