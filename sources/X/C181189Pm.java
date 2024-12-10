package X;

import android.content.res.Resources;
import android.view.View;

/* renamed from: X.9Pm  reason: invalid class name and case insensitive filesystem */
public abstract class C181189Pm {
    public static int A00(View view) {
        Resources resources = view.getResources();
        int paddingStart = resources.getDisplayMetrics().widthPixels - (view.getPaddingStart() + view.getPaddingEnd());
        return (int) Math.floor((double) (((float) paddingStart) / ((float) resources.getDimensionPixelSize(2131168273))));
    }
}
