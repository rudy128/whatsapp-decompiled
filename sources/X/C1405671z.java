package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;

/* renamed from: X.71z  reason: invalid class name and case insensitive filesystem */
public final class C1405671z {
    public float A00;
    public float A01 = 1.0f;
    public int A02;
    public int A03;
    public int A04;
    public Matrix A05 = C108945cZ.A0J();
    public Rect A06;
    public RectF A07;
    public RectF A08;
    public DisplayMetrics A09;
    public final Matrix A0A = C108945cZ.A0J();
    public final RectF A0B = AnonymousClass3MW.A08();

    public final void A02(C1409573s r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2.A02;
        this.A08 = r2.A01;
        A01(this);
        this.A02 = r2.A00;
        A01(this);
        this.A06 = null;
        this.A01 = 1.0f;
        A01(this);
    }

    public static RectF A00(Canvas canvas, C1405671z r2) {
        float f = r2.A00;
        canvas.scale(f, f);
        canvas.concat(r2.A0A);
        return r2.A08;
    }

    public static final void A01(C1405671z r3) {
        RectF rectF = r3.A08;
        if (rectF != null) {
            C123926Wj.A00(r3.A0A, rectF, (float) r3.A02);
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DoodleViewState{bitmapRect=");
        A10.append(this.A07);
        A10.append(", cropRect=");
        A10.append(this.A08);
        A10.append(", rotate=");
        A10.append(this.A02);
        A10.append(", rotateMatrix=");
        A10.append(this.A0A);
        A10.append(", zoomScale=");
        A10.append(this.A01);
        A10.append(", zoomRect=");
        A10.append(this.A06);
        A10.append(", zoomMatrix=");
        A10.append(this.A05);
        A10.append(", displayRect=");
        A10.append(this.A0B);
        A10.append(", screenScale=");
        A10.append(this.A00);
        A10.append(", displayMetrics=");
        A10.append(this.A09);
        A10.append(", viewWidth=");
        A10.append(this.A04);
        A10.append(", viewHeight=");
        A10.append(this.A03);
        return C17890vO.A0b(A10);
    }
}
