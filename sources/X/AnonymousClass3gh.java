package X;

import android.view.View;
import com.whatsapp.WaDynamicRoundCornerImageView;

/* renamed from: X.3gh  reason: invalid class name */
public class AnonymousClass3gh extends WaDynamicRoundCornerImageView {
    public boolean A00;

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, (int) (((double) ((float) defaultSize)) * 1.5d));
    }
}
