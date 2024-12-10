package X;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import java.util.List;

/* renamed from: X.Cnw  reason: case insensitive filesystem */
public abstract class C25885Cnw {
    public static int A00(DOZ doz, DFL dfl) {
        DFL A09 = dfl.A09(38);
        if (A09 != null) {
            return C25340Cdz.A00(doz, A09);
        }
        try {
            String A0D = dfl.A0D(36);
            if (A0D == null) {
                return -16777216;
            }
            return A90.A04(A0D);
        } catch (AnonymousClass9HX e) {
            C25913CoX.A00(doz, "ColorDrawableUtils", "Error parsing border color in BoxDecoration", e);
            return 0;
        }
    }

    public static C22593BEz A01(DOZ doz, DFL dfl, int i) {
        float A02;
        int A00;
        int A002;
        float A022;
        float[] A023;
        float A01;
        C22593BEz bEz = new C22593BEz();
        if (dfl == null) {
            A02 = 0.0f;
            A00 = 0;
            A002 = 0;
            A022 = 0.0f;
            A023 = null;
        } else {
            A02 = BEA.A02(dfl, 46);
            A00 = C25887Cny.A00(dfl.A0G(56), 0);
            A002 = A00(doz, dfl);
            A022 = BEA.A02(dfl, 40);
            A023 = A02(dfl.A0G(62));
            String A0D = dfl.A0D(63);
            if (A0D != null) {
                A01 = A90.A01(A0D);
                bEz.A05.setColor(i);
                Paint paint = bEz.A04;
                paint.setColor(A002);
                paint.setStrokeWidth(A022);
                if (A022 > 0.0f && A023 != null) {
                    paint.setPathEffect(new DashPathEffect(A023, A01));
                }
                bEz.A02 = A02;
                bEz.A03 = A00;
                float f = A022 / 2.0f;
                bEz.A00 = f;
                bEz.A01 = A02 - f;
                return bEz;
            }
        }
        A01 = 0.0f;
        bEz.A05.setColor(i);
        Paint paint2 = bEz.A04;
        paint2.setColor(A002);
        paint2.setStrokeWidth(A022);
        paint2.setPathEffect(new DashPathEffect(A023, A01));
        bEz.A02 = A02;
        bEz.A03 = A00;
        float f2 = A022 / 2.0f;
        bEz.A00 = f2;
        bEz.A01 = A02 - f2;
        return bEz;
    }

    public static float[] A02(List list) {
        float A01;
        if (list == null || list.size() == 0) {
            return null;
        }
        float[] fArr = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String A0w = C17880vN.A0w(list, i);
            if (A0w == null) {
                A01 = 0.0f;
            } else {
                A01 = A90.A01(A0w);
            }
            fArr[i] = A01;
        }
        return fArr;
    }
}
