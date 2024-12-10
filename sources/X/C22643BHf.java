package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.BHf  reason: case insensitive filesystem */
public final class C22643BHf extends ViewGroup {
    public Bitmap A00;
    public final int A01;
    public final Paint A02;
    public final Paint A03;
    public final View A04;
    public final boolean A05;

    public C22643BHf(Context context, View view, boolean z) {
        super(context);
        int A002;
        this.A04 = view;
        this.A05 = z;
        Paint A0K = C108945cZ.A0K(1);
        this.A03 = A0K;
        Paint A0K2 = C108945cZ.A0K(1);
        this.A02 = A0K2;
        addView(view);
        C108965cb.A11(A0K, PorterDuff.Mode.CLEAR);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130971061, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            A002 = typedValue.data;
        } else {
            A002 = C19740yt.A00(context, i);
        }
        this.A01 = A002;
        AnonymousClass3MW.A1P(A0K2);
        A0K2.setColor(-7829368);
        A0K2.setStrokeWidth(C72463Mc.A00(context) * 2.0f);
    }

    public void dispatchDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        super.dispatchDraw(canvas);
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            if (this.A05) {
                Paint paint = this.A02;
                canvas.drawCircle(C108945cZ.A03(this) * 0.5f, C108945cZ.A04(this) * 0.5f, (((float) Math.min(getWidth(), getHeight())) * 0.5f) - (paint.getStrokeWidth() / 2.0f), paint);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = (float) (i3 - i);
        float f2 = (float) (i4 - i2);
        float f3 = f / 2.0f;
        float f4 = (f * (f / f)) / 2.0f;
        float f5 = f2 / 2.0f;
        float f6 = (f2 * (f2 / f2)) / 2.0f;
        this.A04.layout((int) (f3 - f4), (int) (f5 - f6), (int) (f3 + f4), (int) (f5 + f6));
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0 && !(i == i3 && i2 == i4)) {
            Bitmap A0J = BE8.A0J(i, i2);
            Canvas canvas = new Canvas(A0J);
            A0J.eraseColor(0);
            canvas.drawColor(this.A01);
            canvas.drawCircle(((float) i) * 0.5f, ((float) i2) * 0.5f, ((float) Math.min(i, i2)) * 0.5f, this.A03);
            this.A00 = A0J;
        }
        super.onSizeChanged(i, i2, i3, i4);
    }
}
