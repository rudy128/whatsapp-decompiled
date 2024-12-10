package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: X.6vG  reason: invalid class name and case insensitive filesystem */
public abstract class C137316vG {
    public static final RectF A00(Bitmap bitmap) {
        C18070vi.A0d(bitmap, 0);
        return C108965cb.A04((float) bitmap.getWidth(), (float) bitmap.getHeight());
    }

    public static final RectF A01(RectF rectF, RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        Matrix A0J = C108945cZ.A0J();
        A0J.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        A0J.mapRect(rectF3);
        return rectF3;
    }
}
