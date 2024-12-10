package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3OG  reason: invalid class name */
public class AnonymousClass3OG extends ViewGroup {
    public final /* synthetic */ C72993Oo A00;

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2 = (float) (i3 - i);
        int i6 = i4 - i2;
        C72993Oo r9 = this.A00;
        AnonymousClass4aN r1 = r9.A03;
        int i7 = AnonymousClass4aN.A0X;
        float f3 = f2 / ((float) r1.A01);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            float f4 = ((float) i8) * f3;
            View childAt = getChildAt(i8);
            if (AnonymousClass3MY.A1b(r9.A00)) {
                i5 = (int) f4;
                f = f4 + f3;
            } else {
                f = f2 - f4;
                i5 = (int) (f - f3);
            }
            childAt.layout(i5, 0, (int) f, i6);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3OG(Context context, C72993Oo r2) {
        super(context);
        this.A00 = r2;
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        AnonymousClass4aN r7 = this.A00.A03;
        int i3 = AnonymousClass4aN.A0X;
        float f = (float) (size / r7.A01);
        for (int i4 = 0; i4 < childCount; i4++) {
            float f2 = ((float) i4) * f;
            getChildAt(i4).measure(View.MeasureSpec.makeMeasureSpec(((int) (f2 + f)) - ((int) f2), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), r7.A05);
    }
}
