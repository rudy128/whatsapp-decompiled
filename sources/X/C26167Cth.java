package X;

import android.content.Context;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Cth  reason: case insensitive filesystem */
public abstract class C26167Cth {
    public static ArrayList A00(Context context, Layout layout, float f, float f2) {
        float A00 = AnonymousClass3MW.A00(context.getResources(), 2131165452) * f2;
        float A002 = AnonymousClass3MW.A00(context.getResources(), 2131165453) * f2;
        return A03(A02(layout), A00, A00, A002, A002, f);
    }

    public static ArrayList A01(Context context, Layout layout, float f, float f2) {
        return A03(A02(layout), AnonymousClass3MW.A00(context.getResources(), 2131165449) * f2, AnonymousClass3MW.A00(context.getResources(), 2131165450) * f2, AnonymousClass3MW.A00(context.getResources(), 2131165451) * f2, AnonymousClass3MW.A00(context.getResources(), 2131165448) * f2, f);
    }

    public static ArrayList A02(Layout layout) {
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        for (int i = 0; i < layout.getLineCount(); i++) {
            RectF rectF = new RectF(layout.getLineLeft(i), (float) layout.getLineTop(i), layout.getLineRight(i), (float) layout.getLineBottom(i));
            String A0k = BE7.A0k(layout.getText(), layout.getLineStart(i), layout.getLineEnd(i));
            if (rectF.width() > 0.0f && !TextUtils.isEmpty(A0k.replace("\n", ""))) {
                A132.add(rectF);
            } else if (!A132.isEmpty()) {
                A132 = BE8.A0n(A132, A13);
            }
        }
        if (!A132.isEmpty()) {
            A13.add(A132);
        }
        return A13;
    }

    public static ArrayList A03(List list, float f, float f2, float f3, float f4, float f5) {
        ArrayList A13 = AnonymousClass000.A13();
        for (int i = 0; i < list.size(); i++) {
            List list2 = (List) list.get(i);
            Path A0L = C108945cZ.A0L();
            A13.add(A0L);
            int size = list2.size();
            int i2 = size * 2;
            PointF[] pointFArr = new PointF[i2];
            PointF[] pointFArr2 = new PointF[i2];
            for (int i3 = 0; i3 <= size - 1; i3++) {
                RectF rectF = (RectF) list2.get(i3);
                int i4 = i3 * 2;
                int i5 = i4 + 1;
                pointFArr2[i4] = new PointF(rectF.right + f2, rectF.top - f3);
                pointFArr2[i5] = new PointF(rectF.right + f2, rectF.bottom + f4);
                pointFArr[i4] = new PointF(rectF.left - f, rectF.top - f3);
                pointFArr[i5] = new PointF(rectF.left - f, rectF.bottom + f4);
            }
            for (int i6 = 1; i6 < pointFArr2.length; i6++) {
                PointF pointF = pointFArr2[i6];
                PointF pointF2 = pointFArr2[i6 - 1];
                if (pointF.x > pointF2.x) {
                    pointF2.y = pointF.y;
                } else if (pointF.x < pointF2.x) {
                    pointF.y = pointF2.y;
                }
            }
            for (int i7 = 1; i7 < pointFArr.length; i7++) {
                PointF pointF3 = pointFArr[i7];
                PointF pointF4 = pointFArr[i7 - 1];
                if (pointF3.x > pointF4.x) {
                    pointF3.y = pointF4.y;
                } else if (pointF3.x < pointF4.x) {
                    pointF4.y = pointF3.y;
                }
            }
            float f6 = f5;
            ArrayList A04 = A04(pointFArr2, f6, true);
            ArrayList A042 = A04(pointFArr, f6, false);
            A0L.moveTo(((PointF) A04.get(0)).x, ((PointF) A04.get(0)).y);
            for (int i8 = 1; i8 < A04.size(); i8++) {
                BEB.A0m(A0L, A04, i8);
            }
            for (int size2 = A042.size() - 1; size2 >= 0; size2--) {
                BEB.A0m(A0L, A042, size2);
            }
            A0L.close();
        }
        return A13;
    }

    public static ArrayList A04(PointF[] pointFArr, float f, boolean z) {
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
