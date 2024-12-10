package X;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import android.text.style.LineBackgroundSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D4R implements LineBackgroundSpan {
    public final Paint A00;
    public final List A01;

    public D4R(Layout layout, float f, float f2, float f3, float f4, float f5, int i) {
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        int i2 = 0;
        while (true) {
            Layout layout2 = layout;
            if (i2 >= layout2.getLineCount()) {
                break;
            }
            RectF rectF = new RectF(layout2.getLineLeft(i2), (float) layout2.getLineTop(i2), layout2.getLineRight(i2), (float) layout2.getLineBottom(i2));
            String A0k = BE7.A0k(layout2.getText(), layout2.getLineStart(i2), layout2.getLineEnd(i2));
            if (rectF.width() > 0.0f && !TextUtils.isEmpty(A0k.replace("\n", ""))) {
                A132.add(rectF);
            } else if (!A132.isEmpty()) {
                A132 = BE8.A0n(A132, A13);
            }
            i2++;
        }
        if (!A132.isEmpty()) {
            A13.add(A132);
        }
        ArrayList A133 = AnonymousClass000.A13();
        int i3 = 0;
        while (true) {
            float f6 = f5;
            if (i3 < A13.size()) {
                List list = (List) A13.get(i3);
                Path A0L = C108945cZ.A0L();
                A133.add(A0L);
                int size = list.size();
                int i4 = size * 2;
                PointF[] pointFArr = new PointF[i4];
                PointF[] pointFArr2 = new PointF[i4];
                for (int i5 = 0; i5 <= size - 1; i5++) {
                    RectF rectF2 = (RectF) list.get(i5);
                    int i6 = i5 * 2;
                    int i7 = i6 + 1;
                    pointFArr2[i6] = new PointF(rectF2.right + f2, rectF2.top - f3);
                    pointFArr2[i7] = new PointF(rectF2.right + f2, rectF2.bottom + f4);
                    pointFArr[i6] = new PointF(rectF2.left - f, rectF2.top - f3);
                    pointFArr[i7] = new PointF(rectF2.left - f, rectF2.bottom + f4);
                }
                for (int i8 = 1; i8 < pointFArr2.length; i8++) {
                    PointF pointF = pointFArr2[i8];
                    PointF pointF2 = pointFArr2[i8 - 1];
                    if (pointF.x > pointF2.x) {
                        pointF2.y = pointF.y;
                    } else if (pointF.x < pointF2.x) {
                        pointF.y = pointF2.y;
                    }
                }
                for (int i9 = 1; i9 < pointFArr.length; i9++) {
                    PointF pointF3 = pointFArr[i9];
                    PointF pointF4 = pointFArr[i9 - 1];
                    if (pointF3.x > pointF4.x) {
                        pointF3.y = pointF4.y;
                    } else if (pointF3.x < pointF4.x) {
                        pointF4.y = pointF3.y;
                    }
                }
                ArrayList A002 = A00(pointFArr2, f6, true);
                ArrayList A003 = A00(pointFArr, f6, false);
                A0L.moveTo(((PointF) A002.get(0)).x, ((PointF) A002.get(0)).y);
                for (int i10 = 1; i10 < A002.size(); i10++) {
                    BEB.A0m(A0L, A002, i10);
                }
                for (int size2 = A003.size() - 1; size2 >= 0; size2--) {
                    BEB.A0m(A0L, A003, size2);
                }
                A0L.close();
                i3++;
            } else {
                this.A01 = A133;
                Paint A0A = AnonymousClass3MZ.A0A();
                this.A00 = A0A;
                A0A.setColor(i);
                A0A.setStyle(Paint.Style.FILL_AND_STROKE);
                A0A.setPathEffect(new CornerPathEffect(f6));
                return;
            }
        }
    }

    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        for (Path drawPath : this.A01) {
            canvas.drawPath(drawPath, this.A00);
        }
    }

    public static ArrayList A00(PointF[] pointFArr, float f, boolean z) {
        float min;
        ArrayList A13 = AnonymousClass000.A13();
        Collections.addAll(A13, pointFArr);
        int i = 0;
        while (i < (A13.size() / 2) - 1) {
            int i2 = i * 2;
            PointF pointF = (PointF) A13.get(i2);
            PointF pointF2 = (PointF) A13.get(i2 + 1);
            PointF pointF3 = (PointF) A13.get(i2 + 2);
            PointF pointF4 = (PointF) A13.get(i2 + 3);
            if (C108945cZ.A00(pointF2.x, pointF3.x) < f) {
                A13.remove(pointF2);
                A13.remove(pointF3);
                float f2 = pointF.x;
                float f3 = pointF4.x;
                if (z) {
                    min = Math.max(f2, f3);
                } else {
                    min = Math.min(f2, f3);
                }
                pointF4.x = min;
                pointF.x = min;
                i--;
            }
            i++;
        }
        return A13;
    }
}
