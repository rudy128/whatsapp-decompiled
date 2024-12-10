package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.BHg  reason: case insensitive filesystem */
public final class C22644BHg extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public Bitmap A03;
    public final int A04;
    public final Paint A05;
    public final View A06;

    public C22644BHg(Context context, View view) {
        super(context);
        this.A06 = view;
        Paint A0K = C108945cZ.A0K(1);
        this.A05 = A0K;
        addView(view);
        C108965cb.A11(A0K, PorterDuff.Mode.CLEAR);
        this.A04 = AnonymousClass6VZ.A00(context, C30.sc_surface_background);
    }

    public void dispatchDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        super.dispatchDraw(canvas);
        Bitmap bitmap = this.A03;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = (float) (i3 - i);
        float f2 = (float) (i4 - i2);
        int i5 = this.A02;
        float f3 = (float) i5;
        if (i5 == 0) {
            f3 = f;
        }
        int i6 = this.A01;
        float f4 = (float) i6;
        if (i6 == 0) {
            f4 = f2;
        }
        int i7 = this.A00;
        if (i7 == 90 || i7 == 270) {
            float f5 = f4;
            f4 = f3;
            f3 = f5;
        }
        float f6 = f / f3;
        float f7 = f2 / f4;
        float f8 = f / 2.0f;
        float f9 = (f3 * f6) / 2.0f;
        float f10 = f2 / 2.0f;
        float f11 = (f4 * f7) / 2.0f;
        this.A06.layout((int) (f8 - f9), (int) (f10 - f11), (int) (f8 + f9), (int) (f10 + f11));
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0 && !(i == i3 && i2 == i4)) {
            Bitmap A0J = BE8.A0J(i, i2);
            Canvas canvas = new Canvas(A0J);
            A0J.eraseColor(0);
            canvas.drawColor(this.A04);
            canvas.drawCircle(((float) i) * 0.5f, ((float) i2) * 0.5f, ((float) Math.min(i, i2)) * 0.5f, this.A05);
            this.A03 = A0J;
        }
        super.onSizeChanged(i, i2, i3, i4);
    }
}
