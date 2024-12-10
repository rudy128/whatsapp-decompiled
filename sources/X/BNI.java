package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;

public final class BNI extends C2y {
    public final Context A00;
    public final RectF A01;
    public final C24344Bzf A02;
    public final C24339Bza A03;

    public static final Matrix A00(BNI bni, boolean z) {
        Matrix matrix;
        float f;
        float f2;
        int ordinal = bni.A03.ordinal();
        if (ordinal == 0) {
            matrix = C108945cZ.A0J();
            if (z) {
                RectF rectF = bni.A01;
                f = rectF.width() / 2.0f;
                f2 = rectF.height();
                matrix.postScale(-1.0f, 1.0f, f, f2 / 2.0f);
                return matrix;
            }
        } else if (ordinal == 3) {
            Matrix A0J = C108945cZ.A0J();
            if (z) {
                RectF rectF2 = bni.A01;
                A0J.postScale(-1.0f, 1.0f, rectF2.width() / 2.0f, rectF2.height() / 2.0f);
            }
            A0J.postRotate(90.0f, 0.0f, 0.0f);
            A0J.postTranslate(bni.A01.height(), 0.0f);
            return A0J;
        } else if (ordinal == 1) {
            matrix = C108945cZ.A0J();
            RectF rectF3 = bni.A01;
            matrix.postScale(1.0f, -1.0f, rectF3.width() / 2.0f, rectF3.height() / 2.0f);
            if (z) {
                f = rectF3.width() / 2.0f;
                f2 = rectF3.height();
                matrix.postScale(-1.0f, 1.0f, f, f2 / 2.0f);
                return matrix;
            }
        } else if (ordinal == 2) {
            matrix = C108945cZ.A0J();
            if (!z) {
                RectF rectF4 = bni.A01;
                matrix.postScale(-1.0f, 1.0f, rectF4.width() / 2.0f, rectF4.height() / 2.0f);
            }
            matrix.postRotate(-90.0f, 0.0f, 0.0f);
            matrix.postTranslate(0.0f, bni.A01.width());
        } else {
            throw AnonymousClass3MW.A14();
        }
        return matrix;
    }

    public BNI(Context context, RectF rectF, C24344Bzf bzf, C24339Bza bza) {
        this.A00 = context;
        this.A01 = rectF;
        this.A02 = bzf;
        this.A03 = bza;
    }
}
