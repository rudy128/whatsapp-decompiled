package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import java.util.Locale;

/* renamed from: X.4Yo  reason: invalid class name and case insensitive filesystem */
public abstract class C88164Yo {
    public C62572rc A00;
    public final int A01;

    public static int A01(C88164Yo r2) {
        int i;
        AnonymousClass4QT r0;
        int i2 = r2.A01;
        if (r2 instanceof C79953wJ) {
            i = 72;
        } else if (r2 instanceof C80043wS) {
            C80043wS r22 = (C80043wS) r2;
            if (r22.A06()) {
                r0 = r22.A01;
            } else {
                r0 = r22.A00;
            }
            i = r0.A02;
        } else {
            i = 100;
        }
        C17960vV.A0C(true);
        return Math.round((((float) i2) * ((float) i)) / 100.0f);
    }

    public RectF A02(int i, int i2) {
        C62572rc r1;
        float f;
        float f2;
        if (this instanceof C79953wJ) {
            throw new UnsupportedOperationException();
        } else if (this instanceof C80043wS) {
            C80043wS r8 = (C80043wS) this;
            if (r8 instanceof C80033wR) {
                throw new UnsupportedOperationException();
            } else if (r8 instanceof C79993wN) {
                throw new UnsupportedOperationException();
            } else if (r8 instanceof C79983wM) {
                throw new UnsupportedOperationException();
            } else if (r8 instanceof C80003wO) {
                throw new UnsupportedOperationException();
            } else {
                C62572rc r12 = r8.A00;
                if (r12 == null || i2 <= 0 || i <= 0) {
                    return null;
                }
                float f3 = (float) r12.A08;
                float f4 = (float) r12.A06;
                PointF pointF = new PointF(f3 / 2.0f, f4 / 2.0f);
                float f5 = (float) i;
                float f6 = (float) i2;
                PointF pointF2 = new PointF(f5 / 2.0f, f6 / 2.0f);
                if (r8.A06()) {
                    int i3 = r8.A00.A03;
                    if (i3 > 0) {
                        f2 = (float) i3;
                    } else {
                        f2 = f4 / 3.0f;
                    }
                    pointF.y = f2;
                    pointF2.y = f6 / 3.0f;
                }
                float f7 = f3 / f5;
                float f8 = f6 * f7;
                float f9 = f3 / f4;
                if (f9 > 4.0f / 1.0f) {
                    f7 = f4 / f6;
                    f = f5 * f7;
                    f8 = f4;
                } else {
                    f = f3;
                }
                PointF pointF3 = new PointF(pointF2.x * f7, pointF2.y * f7);
                RectF A08 = AnonymousClass3MW.A08();
                float f10 = pointF.x - pointF3.x;
                A08.left = f10;
                float f11 = pointF.y - pointF3.y;
                A08.top = f11;
                A08.right = f10 + f;
                float f12 = f11 + f8;
                A08.bottom = f12;
                if (f11 < 0.0f) {
                    A08.top = 0.0f;
                    A08.bottom = f8;
                    f12 = f8;
                }
                if (f12 > f4) {
                    A08.bottom = f4;
                    A08.top = f4 - f8;
                }
                Locale locale = Locale.US;
                Object[] objArr = new Object[12];
                objArr[0] = Float.valueOf(f3);
                objArr[1] = Float.valueOf(f4);
                objArr[2] = Float.valueOf(f9);
                C62572rc r13 = r8.A00;
                C17890vO.A1G(objArr, r13.A02);
                AnonymousClass3Ma.A1T(objArr, r13.A03);
                C17880vN.A1T(objArr, i, 5);
                C17880vN.A1T(objArr, i2, 6);
                objArr[7] = Float.valueOf(f5 / f6);
                objArr[8] = Float.valueOf(f);
                objArr[9] = Float.valueOf(f8);
                objArr[10] = Float.valueOf(f / f8);
                objArr[11] = A08.toString();
                String.format(locale, "ConversationRowSingleImagePreviewCalculator/getSourceRect bitmap=%f,%f(%f) face=%d,%d preview=%d,%d(%f) scaled=%f,%f(%f) rect=%s", objArr);
                return A08;
            }
        } else if (!(this instanceof C79963wK) || (r1 = this.A00) == null) {
            return null;
        } else {
            int i4 = r1.A08;
            int i5 = r1.A06;
            int i6 = i4 * i2;
            float f13 = (float) i;
            float f14 = (float) i4;
            float f15 = f14;
            if (i6 > i5 * i) {
                f13 = (float) i2;
                f14 = (float) i5;
            }
            return new RectF(0.0f, 0.0f, f15, ((float) i2) / (f13 / f14));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0089, code lost:
        if (r6 == null) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A03(int r10, int r11) {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.C79953wJ
            if (r0 == 0) goto L_0x0010
            int r0 = A01(r9)
            android.util.Pair r0 = r9.A04(r10, r11, r0)
            X.C18070vi.A0X(r0)
            return r0
        L_0x0010:
            boolean r0 = r9 instanceof X.C80043wS
            if (r0 == 0) goto L_0x00fd
            r5 = r9
            X.3wS r5 = (X.C80043wS) r5
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x00f9
            X.4QT r6 = r5.A01
        L_0x001f:
            int r0 = r5.A01
            float r4 = (float) r0
            int r0 = r6.A02
            float r0 = (float) r0
            float r1 = r4 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            java.lang.Float r8 = X.C80043wS.A00(r1, r10)
            if (r8 == 0) goto L_0x008b
            float r7 = r8.floatValue()
            X.2rc r2 = r5.A00
            int r0 = r2.A06
            float r1 = (float) r0
            float r1 = r1 * r7
            int r0 = r2.A08
            float r0 = (float) r0
            float r1 = r1 / r0
            java.lang.Float r2 = X.C80043wS.A00(r1, r11)
            if (r2 == 0) goto L_0x008b
            X.2rc r1 = r5.A00
            int r0 = r1.A08
            float r3 = (float) r0
            float r7 = r7 / r3
            float r2 = r2.floatValue()
            int r0 = r1.A06
            float r0 = (float) r0
            float r1 = r2 / r0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x005c
            float r3 = r3 * r1
            java.lang.Float r8 = java.lang.Float.valueOf(r3)
        L_0x005c:
            float r3 = r8.floatValue()
            float r0 = r6.A00
            float r1 = r3 * r0
            float r0 = r6.A01
            float r1 = r1 / r0
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x00f3
            float r0 = java.lang.Math.min(r2, r1)
        L_0x0071:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r2 = r0.floatValue()
            int r0 = java.lang.Math.round(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = java.lang.Math.round(r2)
            android.util.Pair r6 = X.C17890vO.A0F(r1, r0)
            if (r6 != 0) goto L_0x00ab
        L_0x008b:
            X.4QT r0 = r5.A00
            int r0 = r0.A02
            float r0 = (float) r0
            float r4 = r4 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = r4 * r0
            r0 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 / r0
            int r0 = java.lang.Math.round(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = java.lang.Math.round(r2)
            android.util.Pair r6 = X.C17890vO.A0F(r1, r0)
        L_0x00ab:
            java.util.Locale r4 = java.util.Locale.US
            r0 = 8
            java.lang.Object[] r3 = new java.lang.Object[r0]
            X.2rc r2 = r5.A00
            int r1 = r2.A08
            X.AnonymousClass000.A1L(r3, r1)
            int r0 = r2.A06
            X.AnonymousClass000.A1M(r3, r0)
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0 = 2
            r3[r0] = r1
            int r0 = r2.A02
            X.C17890vO.A1G(r3, r0)
            int r0 = r2.A03
            X.AnonymousClass3Ma.A1T(r3, r0)
            r0 = 5
            java.lang.Object r1 = r6.first
            r3[r0] = r1
            r0 = 6
            java.lang.Object r2 = r6.second
            r3[r0] = r2
            int r0 = X.AnonymousClass000.A0M(r1)
            float r1 = (float) r0
            int r0 = X.AnonymousClass000.A0M(r2)
            float r0 = (float) r0
            float r1 = r1 / r0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0 = 7
            r3[r0] = r1
            java.lang.String r0 = "ConversationRowSingleImagePreviewCalculator/getPreviewDimension bitmap=%d,%d(%f) face=%d,%d preview=%d,%d(%f)"
            java.lang.String.format(r4, r0, r3)
            return r6
        L_0x00f3:
            float r0 = java.lang.Math.max(r2, r1)
            goto L_0x0071
        L_0x00f9:
            X.4QT r6 = r5.A00
            goto L_0x001f
        L_0x00fd:
            boolean r0 = r9 instanceof X.C79963wK
            if (r0 == 0) goto L_0x011c
            int r0 = android.view.View.MeasureSpec.getSize(r10)
            float r1 = (float) r0
            int r0 = android.view.View.MeasureSpec.getSize(r11)
            float r2 = (float) r0
            int r0 = java.lang.Math.round(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = java.lang.Math.round(r2)
            android.util.Pair r0 = X.C17890vO.A0F(r1, r0)
            return r0
        L_0x011c:
            r1 = r9
            X.3wL r1 = (X.C79973wL) r1
            int r4 = r1.A00
            if (r4 > 0) goto L_0x012c
            int r0 = android.view.View.MeasureSpec.getSize(r10)
            android.util.Pair r0 = r1.A04(r10, r11, r0)
            return r0
        L_0x012c:
            X.2rc r1 = r1.A00
            int r0 = r1.A08
            float r3 = (float) r0
            int r0 = r1.A06
            float r2 = (float) r0
            int r0 = android.view.View.MeasureSpec.getSize(r10)
            float r1 = (float) r0
            int r0 = r4 * 2
            float r0 = (float) r0
            float r2 = r2 * r1
            float r2 = r2 / r3
            float r2 = java.lang.Math.min(r0, r2)
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            if (r0 == 0) goto L_0x0151
            int r0 = android.view.View.MeasureSpec.getSize(r11)
            float r0 = (float) r0
            float r2 = java.lang.Math.min(r0, r2)
        L_0x0151:
            int r0 = java.lang.Math.round(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = java.lang.Math.round(r2)
            android.util.Pair r0 = X.C17890vO.A0F(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88164Yo.A03(int, int):android.util.Pair");
    }

    public final Pair A04(int i, int i2, int i3) {
        C62572rc r1 = this.A00;
        C17960vV.A08(r1, "setMediaData() must be called prior.");
        float f = (float) r1.A08;
        float f2 = (float) r1.A06;
        float f3 = (float) i3;
        if (View.MeasureSpec.getMode(i) != 0) {
            f3 = Math.min((float) View.MeasureSpec.getSize(i), f3);
        }
        float f4 = (f2 * f3) / f;
        if (View.MeasureSpec.getMode(i2) != 0) {
            f4 = Math.min((float) View.MeasureSpec.getSize(i2), f4);
        }
        return C17890vO.A0F(Integer.valueOf(Math.round(f3)), Math.round(f4));
    }

    public void A05(int i, int i2) {
        C62572rc r0 = new C62572rc();
        r0.A08 = i;
        r0.A06 = i2;
        this.A00 = r0;
    }

    public boolean A06() {
        C62572rc r3;
        boolean z;
        if (this instanceof C80033wR) {
            C80033wR r1 = (C80033wR) this;
            r3 = r1.A00;
            z = true;
            C17960vV.A0D(AnonymousClass000.A1W(r3));
            if (!r1.A00) {
                if (r3.A06 >= r3.A08) {
                    return true;
                }
                return false;
            }
        } else {
            r3 = this.A00;
            z = true;
            C17960vV.A0D(AnonymousClass000.A1W(r3));
        }
        if (r3.A06 > r3.A08) {
            return z;
        }
        return false;
    }

    public C88164Yo(int i) {
        this.A01 = i;
    }
}
