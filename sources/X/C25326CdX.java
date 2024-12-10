package X;

import android.graphics.RectF;
import android.opengl.Matrix;

/* renamed from: X.CdX  reason: case insensitive filesystem */
public abstract class C25326CdX {
    public static void A01(C25752ClM clM, float[] fArr, float[] fArr2) {
        int i;
        int i2;
        float[] fArr3 = fArr;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        C221718w.A00(clM.A0C);
        RectF rectF = clM.A0C;
        Matrix.translateM(fArr, 0, rectF.left, rectF.top, 0.0f);
        Matrix.scaleM(fArr, 0, clM.A0C.width(), clM.A0C.height(), 1.0f);
        if (clM.A0K) {
            if (clM.A06 % 180 != 0) {
                i = clM.A05;
                i2 = clM.A07;
            } else {
                i = clM.A07;
                i2 = clM.A05;
            }
            RectF rectF2 = clM.A0C;
            float width = (((float) i) * rectF2.width()) / (((float) i2) * rectF2.height());
            if (clM.A09 % 180 != 0) {
                width = 1.0f / width;
            }
            Matrix.scaleM(fArr2, 0, 1.0f, (((float) clM.A0A) / width) / ((float) clM.A08), 1.0f);
        }
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        if (clM.A0F == AnonymousClass00R.A01) {
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix.rotateM(fArr3, 0, (float) clM.A09, 0.0f, 0.0f, -1.0f);
        Matrix.translateM(fArr3, 0, -0.5f, -0.5f, 0.0f);
    }

    public static CPT A00() {
        C25555Cht cht = new C25555Cht();
        cht.A00 = 5;
        cht.A02.put("aPosition", new C25523ChL(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}));
        cht.A01.add("aPosition");
        return C25523ChL.A00(cht, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    }
}
