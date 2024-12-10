package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* renamed from: X.05i  reason: invalid class name */
public class AnonymousClass05i extends RatingBar {
    public final AnonymousClass0N3 A00;

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.A00.A00;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AnonymousClass05i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130970904);
        AnonymousClass000.A1A(this);
        AnonymousClass0N3 r0 = new AnonymousClass0N3(this);
        this.A00 = r0;
        r0.A02(attributeSet, 2130970904);
    }
}
