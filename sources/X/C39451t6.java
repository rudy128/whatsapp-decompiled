package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.1t6  reason: invalid class name and case insensitive filesystem */
public final class C39451t6 extends View {
    public final /* synthetic */ int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39451t6(Context context, int i) {
        super(context);
        this.A00 = i;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.A00, 1073741824));
    }
}
