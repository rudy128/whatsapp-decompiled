package X;

import android.view.View;

/* renamed from: X.2AB  reason: invalid class name */
public final class AnonymousClass2AB extends C29221bq {
    public int getItemDefaultMarginResId() {
        return 2131167893;
    }

    public int getItemLayoutResId() {
        return 2131626093;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)));
        }
    }
}
