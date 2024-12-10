package X;

import android.graphics.Canvas;
import android.graphics.Paint;

public class DWY implements C18080vj, C18090vk {
    public final float A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public static void A00(Canvas canvas, BHV bhv, float f, float f2) {
        canvas.scale(f, f2, 0.0f, 0.0f);
        Paint paint = bhv.A0P;
        paint.setAlpha((int) (bhv.A09.A00 * 255.0f));
        canvas.drawCircle(0.0f, 0.0f, 50.0f, paint);
    }

    public DWY(Canvas canvas, BHV bhv, float f, int i) {
        this.A01 = i;
        this.A02 = canvas;
        this.A03 = bhv;
        this.A00 = f;
    }

    public final Object invoke() {
        switch (this.A01) {
            case 0:
                Canvas canvas = (Canvas) this.A02;
                BHV bhv = (BHV) this.A03;
                float f = this.A00;
                int[] iArr = BHV.A0b;
                canvas.rotate(bhv.A00, 0.0f, 0.0f);
                A00(canvas, bhv, bhv.A0R[0], f);
                break;
            case 1:
                Canvas canvas2 = (Canvas) this.A02;
                BHV bhv2 = (BHV) this.A03;
                float f2 = this.A00;
                int[] iArr2 = BHV.A0b;
                canvas2.rotate(bhv2.A00 + 90.0f, 0.0f, 0.0f);
                A00(canvas2, bhv2, bhv2.A0R[1], f2);
                break;
            default:
                Canvas canvas3 = (Canvas) this.A02;
                BHV bhv3 = (BHV) this.A03;
                float f3 = this.A00;
                int[] iArr3 = BHV.A0b;
                canvas3.rotate(-bhv3.A00, 0.0f, 0.0f);
                A00(canvas3, bhv3, bhv3.A0R[2], f3);
                break;
        }
        return C27621Wu.A00;
    }
}
