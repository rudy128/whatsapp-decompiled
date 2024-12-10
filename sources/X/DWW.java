package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;

public class DWW implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DWW(Canvas canvas, BHV bhv, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = bhv;
            this.A02 = canvas;
            return;
        }
        this.A01 = canvas;
        this.A02 = bhv;
    }

    public final Object invoke() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            BHV bhv = (BHV) obj;
            Canvas canvas = (Canvas) this.A02;
            int[] iArr = BHV.A0b;
            Paint paint = bhv.A0P;
            paint.setShader(bhv.A07);
            canvas.drawCircle(0.0f, 0.0f, 50.0f, paint);
            paint.setShader(bhv.A08);
            canvas.drawCircle(0.0f, 0.0f, 50.0f, paint);
        } else {
            Canvas canvas2 = (Canvas) obj;
            BHV bhv2 = (BHV) this.A02;
            int[] iArr2 = BHV.A0b;
            canvas2.rotate(bhv2.A05, 0.0f, 0.0f);
            Paint paint2 = bhv2.A0P;
            paint2.setAlpha((int) (bhv2.A09.A05 * 255.0f));
            float max = Math.max(bhv2.A04 * 0.02f, 0.0f);
            Matrix matrix = bhv2.A0O;
            float f = max + 2.3f;
            matrix.setScale(f, f, 0.0f, 0.0f);
            matrix.preTranslate(bhv2.A01 - 0.08984375f, -50.0f);
            LinearGradient linearGradient = bhv2.A06;
            if (linearGradient != null) {
                linearGradient.setLocalMatrix(matrix);
            }
            canvas2.drawCircle(0.0f, 0.0f, 50.0f, paint2);
        }
        return C27621Wu.A00;
    }
}
