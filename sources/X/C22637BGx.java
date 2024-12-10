package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: X.BGx  reason: case insensitive filesystem */
public class C22637BGx extends Property {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22637BGx(int r3) {
        /*
            r2 = this;
            r2.A00 = r3
            switch(r3) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0012;
                case 2: goto L_0x0017;
                case 3: goto L_0x001c;
                case 4: goto L_0x0021;
                case 5: goto L_0x0026;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r0 = "growFraction"
        L_0x0009:
            r2.<init>(r1, r0)
            return
        L_0x000d:
            java.lang.Class<float[]> r1 = float[].class
            java.lang.String r0 = "nonTranslations"
            goto L_0x0009
        L_0x0012:
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r0 = "translations"
            goto L_0x0009
        L_0x0017:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r0 = "translationAlpha"
            goto L_0x0009
        L_0x001c:
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            java.lang.String r0 = "clipBounds"
            goto L_0x0009
        L_0x0021:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r0 = "animationFraction"
            goto L_0x0009
        L_0x0026:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r0 = "completeEndFraction"
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22637BGx.<init>(int):void");
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        float f;
        switch (this.A00) {
            case 2:
                f = C25446Cfx.A02.A00((View) obj);
                break;
            case 3:
                return ((View) obj).getClipBounds();
            case 4:
                Property property = C25692CkN.A0B;
                f = ((C25692CkN) obj).A00;
                break;
            case 5:
                Property property2 = C25692CkN.A0B;
                f = ((C25692CkN) obj).A01;
                break;
            case 6:
                BFE bfe = (BFE) obj;
                C24468C5i c5i = bfe.A09;
                if (c5i.A01 != 0 || c5i.A00 != 0) {
                    f = bfe.A00;
                    break;
                } else {
                    f = 1.0f;
                    break;
                }
            default:
                return null;
        }
        return Float.valueOf(f);
    }

    public /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        AnonymousClass1YX r5;
        float interpolation;
        CS7 cs7;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (this.A00) {
            case 0:
                cs7 = (CS7) obj4;
                float[] fArr = (float[]) obj3;
                System.arraycopy(fArr, 0, cs7.A04, 0, fArr.length);
                break;
            case 1:
                cs7 = (CS7) obj4;
                PointF pointF = (PointF) obj3;
                cs7.A00 = pointF.x;
                cs7.A01 = pointF.y;
                break;
            case 2:
                float A04 = AnonymousClass000.A04(obj3);
                C25446Cfx.A02.A04((View) obj4, A04);
                return;
            case 3:
                ((View) obj4).setClipBounds((Rect) obj3);
                return;
            case 4:
                C25692CkN ckN = (C25692CkN) obj4;
                float A042 = AnonymousClass000.A04(obj3);
                ckN.A00 = A042;
                int i = (int) (5400.0f * A042);
                float[] fArr2 = ckN.A09;
                float f = A042 * 1520.0f;
                fArr2[0] = -20.0f + f;
                fArr2[1] = f;
                int i2 = 0;
                do {
                    float f2 = fArr2[1];
                    r5 = ckN.A07;
                    fArr2[1] = f2 + (r5.getInterpolation(((float) (i - C25692CkN.A0E[i2])) / 667.0f) * 250.0f);
                    interpolation = fArr2[0] + (r5.getInterpolation(((float) (i - C25692CkN.A0D[i2])) / 667.0f) * 250.0f);
                    fArr2[0] = interpolation;
                    i2++;
                } while (i2 < 4);
                float f3 = interpolation + ((fArr2[1] - interpolation) * ckN.A01);
                fArr2[0] = f3;
                fArr2[0] = f3 / 360.0f;
                fArr2[1] = fArr2[1] / 360.0f;
                int i3 = 0;
                while (true) {
                    float f4 = ((float) (i - C25692CkN.A0F[i3])) / 333.0f;
                    if (f4 < 0.0f || f4 > 1.0f) {
                        i3++;
                        if (i3 >= 4) {
                        }
                    } else {
                        int i4 = i3 + ckN.A02;
                        C24468C5i c5i = ckN.A08;
                        int[] iArr = c5i.A08;
                        int length = iArr.length;
                        int i5 = i4 % length;
                        int i6 = (i5 + 1) % length;
                        int A043 = BEA.A04(iArr[i5], ckN.A06.A01);
                        int A044 = BEA.A04(c5i.A08[i6], ckN.A06.A01);
                        float interpolation2 = r5.getInterpolation(f4);
                        int[] iArr2 = ckN.A0A;
                        float f5 = ((float) ((A043 >> 24) & 255)) / 255.0f;
                        float pow = (float) Math.pow((double) (((float) ((A043 >> 16) & 255)) / 255.0f), 2.2d);
                        float pow2 = (float) Math.pow((double) (((float) ((A043 >> 8) & 255)) / 255.0f), 2.2d);
                        float pow3 = (float) Math.pow((double) (((float) (A043 & 255)) / 255.0f), 2.2d);
                        float pow4 = (float) Math.pow((double) (((float) ((A044 >> 16) & 255)) / 255.0f), 2.2d);
                        float pow5 = (float) Math.pow((double) (((float) ((A044 >> 8) & 255)) / 255.0f), 2.2d);
                        float A002 = C17880vN.A00((float) Math.pow((double) (((float) (A044 & 255)) / 255.0f), 2.2d), pow3, interpolation2);
                        iArr2[0] = (Math.round(((float) Math.pow((double) (pow + ((pow4 - pow) * interpolation2)), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round((f5 + (((((float) ((A044 >> 24) & 255)) / 255.0f) - f5) * interpolation2)) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (pow2 + ((pow5 - pow2) * interpolation2)), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) A002, 0.45454545454545453d)) * 255.0f);
                    }
                }
                ckN.A06.invalidateSelf();
                return;
            case 5:
                float A045 = AnonymousClass000.A04(obj3);
                Property property = C25692CkN.A0B;
                ((C25692CkN) obj4).A01 = A045;
                return;
            default:
                BFE bfe = (BFE) obj4;
                float A046 = AnonymousClass000.A04(obj3);
                if (bfe.A00 != A046) {
                    bfe.A00 = A046;
                    bfe.invalidateSelf();
                    return;
                }
                return;
        }
        float[] fArr3 = cs7.A04;
        fArr3[2] = cs7.A00;
        fArr3[5] = cs7.A01;
        Matrix matrix = cs7.A02;
        matrix.setValues(fArr3);
        C25446Cfx.A02.A01(matrix, cs7.A03);
    }
}
