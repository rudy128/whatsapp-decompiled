package X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

public class BV1 extends C01930Bz {
    public CUC A00;

    public CUC getDecorationHelper() {
        return this.A00;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        CUC cuc = this.A00;
        if (cuc.A04) {
            Path path = cuc.A08;
            if (path.isEmpty()) {
                RectF rectF = cuc.A09;
                float f = cuc.A00;
                RectF rectF2 = cuc.A0A;
                rectF.set(f, f, rectF2.right - f, rectF2.bottom - f);
                path.addRect(rectF2, Path.Direction.CW);
                int i = cuc.A03;
                boolean A02 = C25887Cny.A02(i);
                float f2 = cuc.A02;
                if (A02) {
                    path.addRoundRect(rectF2, f2, f2, Path.Direction.CCW);
                } else {
                    float[] fArr = cuc.A0C;
                    C25887Cny.A01(fArr, f2, i);
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    Path path2 = cuc.A07;
                    path2.reset();
                    C25887Cny.A01(fArr, cuc.A01, cuc.A03);
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                }
            }
            canvas.drawPath(path, cuc.A06);
            if (C25887Cny.A02(cuc.A03)) {
                RectF rectF3 = cuc.A09;
                float f3 = cuc.A01;
                canvas.drawRoundRect(rectF3, f3, f3, cuc.A05);
                return;
            }
            canvas.drawPath(cuc.A07, cuc.A05);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        CUC cuc = this.A00;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF rectF = cuc.A0A;
        float f = (float) measuredWidth;
        if (rectF.right != f || rectF.bottom != ((float) measuredHeight)) {
            BE7.A13(rectF, f, measuredHeight);
            cuc.A08.reset();
        }
    }
}
