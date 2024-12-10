package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.Bo0  reason: case insensitive filesystem */
public final class C23693Bo0 extends BV6 {
    public /* bridge */ /* synthetic */ Object BHD(Context context) {
        C18070vi.A0d(context, 0);
        SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(context, (AttributeSet) null);
        swipeRefreshLayout.addView(new BV3(context), new FrameLayout.LayoutParams(-1, -1));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(CFs.A00);
        C18070vi.A0X(obtainStyledAttributes);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        if (colorStateList != null) {
            swipeRefreshLayout.setColorSchemeColors(colorStateList.getDefaultColor());
        }
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(0);
        if (colorStateList2 != null) {
            swipeRefreshLayout.setProgressBackgroundColorSchemeColor(colorStateList2.getDefaultColor());
        }
        return swipeRefreshLayout;
    }

    public C23693Bo0(DOZ doz, DFL dfl) {
        super(doz, dfl);
    }
}
