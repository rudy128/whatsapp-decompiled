package X;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;

/* renamed from: X.Cvn  reason: case insensitive filesystem */
public final class C26249Cvn {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07 = 15.0f;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public float A0F;
    public float A0G;
    public float A0H;
    public float A0I;
    public float A0J;
    public float A0K;
    public float A0L;
    public float A0M = 15.0f;
    public float A0N;
    public float A0O;
    public float A0P = 0.0f;
    public float A0Q = 1.0f;
    public int A0R = 16;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V = 16;
    public int A0W = C25694CkP.A0F;
    public int A0X = 1;
    public TimeInterpolator A0Y;
    public TimeInterpolator A0Z;
    public ColorStateList A0a;
    public ColorStateList A0b;
    public ColorStateList A0c;
    public ColorStateList A0d;
    public Typeface A0e;
    public Typeface A0f;
    public StaticLayout A0g;
    public TextUtils.TruncateAt A0h = TextUtils.TruncateAt.END;
    public E2R A0i;
    public CharSequence A0j;
    public CharSequence A0k;
    public CharSequence A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p = true;
    public int[] A0q;
    public float A0r;
    public float A0s;
    public float A0t;
    public Typeface A0u;
    public Typeface A0v;
    public Typeface A0w;
    public Typeface A0x;
    public Typeface A0y;
    public C23514Bid A0z;
    public C23514Bid A10;
    public final Rect A11;
    public final Rect A12;
    public final RectF A13;
    public final TextPaint A14;
    public final TextPaint A15;
    public final View A16;

    public static int A01(ColorStateList colorStateList, C26249Cvn cvn) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = cvn.A0q;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public void A07(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.A0G) {
            this.A0G = f;
            A02();
        }
    }

    public static int A00(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), Math.round((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), Math.round((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), Math.round((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    private void A02() {
        View view;
        float f;
        int A012;
        float A002;
        Rect rect;
        float f2 = this.A0G;
        float f3 = f2;
        boolean z = this.A0n;
        RectF rectF = this.A13;
        if (z) {
            if (f2 < this.A0O) {
                rect = this.A12;
            } else {
                rect = this.A11;
            }
            rectF.set(rect);
        } else {
            Rect rect2 = this.A12;
            float f4 = (float) rect2.left;
            Rect rect3 = this.A11;
            float f5 = (float) rect3.left;
            TimeInterpolator timeInterpolator = this.A0Y;
            float f6 = f2;
            if (timeInterpolator != null) {
                f6 = timeInterpolator.getInterpolation(f2);
            }
            TimeInterpolator timeInterpolator2 = AnonymousClass1YW.A00;
            rectF.left = C17880vN.A00(f5, f4, f6);
            float f7 = this.A0F;
            float f8 = this.A01;
            TimeInterpolator timeInterpolator3 = this.A0Y;
            float f9 = f2;
            if (timeInterpolator3 != null) {
                f9 = timeInterpolator3.getInterpolation(f2);
            }
            rectF.top = C17880vN.A00(f8, f7, f9);
            float f10 = (float) rect2.right;
            float f11 = (float) rect3.right;
            TimeInterpolator timeInterpolator4 = this.A0Y;
            float f12 = f2;
            if (timeInterpolator4 != null) {
                f12 = timeInterpolator4.getInterpolation(f2);
            }
            rectF.right = C17880vN.A00(f11, f10, f12);
            float f13 = (float) rect2.bottom;
            float f14 = (float) rect3.bottom;
            TimeInterpolator timeInterpolator5 = this.A0Y;
            if (timeInterpolator5 != null) {
                f3 = timeInterpolator5.getInterpolation(f2);
            }
            rectF.bottom = C17880vN.A00(f14, f13, f3);
        }
        if (!this.A0n) {
            float f15 = this.A0E;
            float f16 = this.A00;
            TimeInterpolator timeInterpolator6 = this.A0Y;
            float f17 = f2;
            if (timeInterpolator6 != null) {
                f17 = timeInterpolator6.getInterpolation(f2);
            }
            TimeInterpolator timeInterpolator7 = AnonymousClass1YW.A00;
            this.A09 = C17880vN.A00(f16, f15, f17);
            float f18 = this.A0F;
            float f19 = this.A01;
            TimeInterpolator timeInterpolator8 = this.A0Y;
            float f20 = f2;
            if (timeInterpolator8 != null) {
                f20 = timeInterpolator8.getInterpolation(f2);
            }
            this.A0A = C17880vN.A00(f19, f18, f20);
            A03(f2, false);
            view = this.A16;
            view.postInvalidateOnAnimation();
            f = f2;
        } else if (f2 < this.A0O) {
            this.A09 = this.A0E;
            this.A0A = this.A0F;
            A03(0.0f, false);
            view = this.A16;
            view.postInvalidateOnAnimation();
            f = 0.0f;
        } else {
            this.A09 = this.A00;
            this.A0A = this.A01 - ((float) Math.max(0, this.A0S));
            A03(1.0f, false);
            view = this.A16;
            view.postInvalidateOnAnimation();
            f = 1.0f;
        }
        TimeInterpolator timeInterpolator9 = AnonymousClass1YW.A02;
        this.A06 = 1.0f - C17880vN.A00(1.0f, 0.0f, timeInterpolator9.getInterpolation(1.0f - f2));
        view.postInvalidateOnAnimation();
        this.A0L = C17880vN.A00(0.0f, 1.0f, timeInterpolator9.getInterpolation(f2));
        view.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.A0b;
        ColorStateList colorStateList2 = this.A0d;
        TextPaint textPaint = this.A14;
        if (colorStateList != colorStateList2) {
            A012 = A00(f, A01(colorStateList2, this), A01(this.A0b, this));
        } else {
            A012 = A01(colorStateList, this);
        }
        textPaint.setColor(A012);
        float f21 = this.A02;
        float f22 = this.A0H;
        if (f21 != f22) {
            f21 = C17880vN.A00(f21, f22, timeInterpolator9.getInterpolation(f2));
        }
        textPaint.setLetterSpacing(f21);
        this.A0D = C17880vN.A00(this.A05, this.A0K, f2);
        this.A0B = C17880vN.A00(this.A03, this.A0I, f2);
        this.A0C = C17880vN.A00(this.A04, this.A0J, f2);
        int A003 = A00(f2, A01(this.A0c, this), A01(this.A0a, this));
        this.A0T = A003;
        textPaint.setShadowLayer(this.A0D, this.A0B, this.A0C, A003);
        if (this.A0n) {
            int alpha = textPaint.getAlpha();
            float f23 = this.A0O;
            if (f2 <= f23) {
                A002 = AnonymousClass1YW.A00(1.0f, 0.0f, this.A0N, f23, f2);
            } else {
                A002 = AnonymousClass1YW.A00(0.0f, 1.0f, f23, 1.0f, f2);
            }
            textPaint.setAlpha((int) (A002 * ((float) alpha)));
        }
        view.postInvalidateOnAnimation();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0052, code lost:
        if (r1 == 0) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r12.A0m != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010e, code lost:
        if (r0 != false) goto L_0x0110;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03(float r13, boolean r14) {
        /*
            r12 = this;
            java.lang.CharSequence r0 = r12.A0j
            if (r0 == 0) goto L_0x0157
            android.graphics.Rect r0 = r12.A11
            float r4 = X.BE6.A02(r0)
            android.graphics.Rect r0 = r12.A12
            float r5 = X.BE6.A02(r0)
            r8 = 1065353216(0x3f800000, float:1.0)
            float r1 = X.C108945cZ.A00(r13, r8)
            r0 = 925353388(0x3727c5ac, float:1.0E-5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)
            r7 = 0
            if (r0 == 0) goto L_0x00bd
            float r6 = r12.A07
            float r3 = r12.A02
            r12.A0t = r8
            android.graphics.Typeface r2 = r12.A0e
        L_0x002a:
            r5 = 1
            r9 = 0
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0078
            float r0 = r12.A0s
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            boolean r11 = X.AnonymousClass000.A1O(r0)
            float r0 = r12.A0r
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            boolean r10 = X.AnonymousClass000.A1O(r0)
            android.graphics.Typeface r0 = r12.A0w
            boolean r7 = X.AnonymousClass3Ma.A1Z(r0, r2)
            android.text.StaticLayout r0 = r12.A0g
            if (r0 == 0) goto L_0x0054
            int r0 = r0.getWidth()
            float r0 = (float) r0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r0 = 1
            if (r1 != 0) goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            if (r11 != 0) goto L_0x0062
            if (r10 != 0) goto L_0x0062
            if (r0 != 0) goto L_0x0062
            if (r7 != 0) goto L_0x0062
            boolean r0 = r12.A0m
            r7 = 0
            if (r0 == 0) goto L_0x0063
        L_0x0062:
            r7 = 1
        L_0x0063:
            r12.A0s = r6
            r12.A0r = r3
            r12.A0w = r2
            r12.A0m = r9
            android.text.TextPaint r1 = r12.A14
            float r0 = r12.A0t
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0074
            r9 = 1
        L_0x0074:
            r1.setLinearText(r9)
            r9 = r7
        L_0x0078:
            java.lang.CharSequence r0 = r12.A0k
            if (r0 == 0) goto L_0x007e
            if (r9 == 0) goto L_0x0157
        L_0x007e:
            android.text.TextPaint r7 = r12.A14
            float r0 = r12.A0s
            r7.setTextSize(r0)
            android.graphics.Typeface r0 = r12.A0w
            r7.setTypeface(r0)
            float r0 = r12.A0r
            r7.setLetterSpacing(r0)
            java.lang.CharSequence r2 = r12.A0j
            android.view.View r0 = r12.A16
            int r0 = r0.getLayoutDirection()
            boolean r6 = X.BE8.A1T(r0)
            boolean r0 = r12.A0p
            if (r0 == 0) goto L_0x00ab
            if (r6 == 0) goto L_0x00ba
            X.1X5 r1 = X.AnonymousClass1X4.A02
        L_0x00a3:
            int r0 = r2.length()
            boolean r6 = r1.BgG(r2, r0)
        L_0x00ab:
            r12.A0o = r6
            int r1 = r12.A0X
            if (r1 <= r5) goto L_0x0116
            if (r6 == 0) goto L_0x00b7
            boolean r0 = r12.A0n
            if (r0 == 0) goto L_0x0116
        L_0x00b7:
            r5 = r1
            r1 = 1
            goto L_0x00fc
        L_0x00ba:
            X.1X5 r1 = X.AnonymousClass1X4.A01
            goto L_0x00a3
        L_0x00bd:
            float r6 = r12.A0M
            r9 = r6
            float r3 = r12.A0H
            android.graphics.Typeface r2 = r12.A0f
            float r1 = X.C108945cZ.A00(r13, r7)
            r0 = 925353388(0x3727c5ac, float:1.0E-5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e3
            r12.A0t = r8
        L_0x00d1:
            float r1 = r12.A07
            float r1 = r1 / r9
            float r0 = r5 * r1
            if (r14 != 0) goto L_0x00f9
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f9
            float r4 = r4 / r1
            float r4 = java.lang.Math.min(r4, r5)
            goto L_0x002a
        L_0x00e3:
            float r1 = r12.A07
            android.animation.TimeInterpolator r0 = r12.A0Z
            if (r0 == 0) goto L_0x00ed
            float r13 = r0.getInterpolation(r13)
        L_0x00ed:
            android.animation.TimeInterpolator r0 = X.AnonymousClass1YW.A00
            float r0 = X.C17880vN.A00(r1, r6, r13)
            float r9 = r12.A0M
            float r0 = r0 / r9
            r12.A0t = r0
            goto L_0x00d1
        L_0x00f9:
            r4 = r5
            goto L_0x002a
        L_0x00fc:
            int r0 = r12.A0V     // Catch:{ C1f -> 0x0141 }
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r6)     // Catch:{ C1f -> 0x0141 }
            r2 = r0 & 7
            if (r2 == r1) goto L_0x0113
            r1 = 5
            boolean r0 = r12.A0o     // Catch:{ C1f -> 0x0141 }
            if (r2 == r1) goto L_0x010e
            if (r0 == 0) goto L_0x0110
            goto L_0x0119
        L_0x010e:
            if (r0 == 0) goto L_0x0119
        L_0x0110:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ C1f -> 0x0141 }
            goto L_0x011b
        L_0x0113:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ C1f -> 0x0141 }
            goto L_0x011b
        L_0x0116:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ C1f -> 0x0141 }
            goto L_0x011b
        L_0x0119:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ C1f -> 0x0141 }
        L_0x011b:
            java.lang.CharSequence r1 = r12.A0j     // Catch:{ C1f -> 0x0141 }
            int r0 = (int) r4     // Catch:{ C1f -> 0x0141 }
            X.CkP r2 = new X.CkP     // Catch:{ C1f -> 0x0141 }
            r2.<init>(r7, r1, r0)     // Catch:{ C1f -> 0x0141 }
            android.text.TextUtils$TruncateAt r0 = r12.A0h     // Catch:{ C1f -> 0x0141 }
            r2.A06 = r0     // Catch:{ C1f -> 0x0141 }
            r2.A09 = r6     // Catch:{ C1f -> 0x0141 }
            r2.A05 = r3     // Catch:{ C1f -> 0x0141 }
            r0 = 0
            r2.A08 = r0     // Catch:{ C1f -> 0x0141 }
            r2.A04 = r5     // Catch:{ C1f -> 0x0141 }
            float r1 = r12.A0P     // Catch:{ C1f -> 0x0141 }
            float r0 = r12.A0Q     // Catch:{ C1f -> 0x0141 }
            r2.A00 = r1     // Catch:{ C1f -> 0x0141 }
            r2.A01 = r0     // Catch:{ C1f -> 0x0141 }
            int r0 = r12.A0W     // Catch:{ C1f -> 0x0141 }
            r2.A03 = r0     // Catch:{ C1f -> 0x0141 }
            android.text.StaticLayout r0 = r2.A00()     // Catch:{ C1f -> 0x0141 }
            goto L_0x014c
        L_0x0141:
            r2 = move-exception
            java.lang.String r1 = X.BE7.A0p(r2)
            java.lang.String r0 = "CollapsingTextHelper"
            android.util.Log.e(r0, r1, r2)
            r0 = 0
        L_0x014c:
            X.C28111Yx.A02(r0)
            r12.A0g = r0
            java.lang.CharSequence r0 = r0.getText()
            r12.A0k = r0
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26249Cvn.A03(float, boolean):void");
    }

    public static boolean A04(Typeface typeface, C26249Cvn cvn) {
        C23514Bid bid = cvn.A0z;
        if (bid != null) {
            bid.A00 = true;
        }
        if (cvn.A0v == typeface) {
            return false;
        }
        cvn.A0v = typeface;
        Typeface A002 = CBP.A00(AnonymousClass000.A0Y(cvn.A16).getConfiguration(), typeface);
        cvn.A0u = A002;
        if (A002 == null) {
            A002 = cvn.A0v;
        }
        cvn.A0e = A002;
        return true;
    }

    public static boolean A05(Typeface typeface, C26249Cvn cvn) {
        C23514Bid bid = cvn.A10;
        if (bid != null) {
            bid.A00 = true;
        }
        if (cvn.A0y == typeface) {
            return false;
        }
        cvn.A0y = typeface;
        Typeface A002 = CBP.A00(AnonymousClass000.A0Y(cvn.A16).getConfiguration(), typeface);
        cvn.A0x = A002;
        if (A002 == null) {
            A002 = cvn.A0y;
        }
        cvn.A0f = A002;
        return true;
    }

    public float A06() {
        TextPaint textPaint = this.A15;
        textPaint.setTextSize(this.A07);
        textPaint.setTypeface(this.A0e);
        textPaint.setLetterSpacing(this.A02);
        return -textPaint.ascent();
    }

    public void A08(int i) {
        View view = this.A16;
        C26044Cr8 cr8 = new C26044Cr8(view.getContext(), i);
        ColorStateList colorStateList = cr8.A01;
        if (colorStateList != null) {
            this.A0b = colorStateList;
        }
        float f = cr8.A00;
        if (f != 0.0f) {
            this.A07 = f;
        }
        ColorStateList colorStateList2 = cr8.A0A;
        if (colorStateList2 != null) {
            this.A0a = colorStateList2;
        }
        this.A03 = cr8.A05;
        this.A04 = cr8.A06;
        this.A05 = cr8.A07;
        this.A02 = cr8.A04;
        C23514Bid bid = this.A0z;
        if (bid != null) {
            bid.A00 = true;
        }
        DLC dlc = new DLC(this, 0);
        C26044Cr8.A00(cr8);
        this.A0z = new C23514Bid(cr8.A02, dlc);
        cr8.A06(view.getContext(), this.A0z);
        A0D(false);
    }

    public void A09(int i) {
        if (this.A0R != i) {
            this.A0R = i;
            A0D(false);
        }
    }

    public void A0A(int i) {
        View view = this.A16;
        C26044Cr8 cr8 = new C26044Cr8(view.getContext(), i);
        ColorStateList colorStateList = cr8.A01;
        if (colorStateList != null) {
            this.A0d = colorStateList;
        }
        float f = cr8.A00;
        if (f != 0.0f) {
            this.A0M = f;
        }
        ColorStateList colorStateList2 = cr8.A0A;
        if (colorStateList2 != null) {
            this.A0c = colorStateList2;
        }
        this.A0I = cr8.A05;
        this.A0J = cr8.A06;
        this.A0K = cr8.A07;
        this.A0H = cr8.A04;
        C23514Bid bid = this.A10;
        if (bid != null) {
            bid.A00 = true;
        }
        DLC dlc = new DLC(this, 1);
        C26044Cr8.A00(cr8);
        this.A10 = new C23514Bid(cr8.A02, dlc);
        cr8.A06(view.getContext(), this.A10);
        A0D(false);
    }

    public void A0B(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.A0v;
            if (typeface != null) {
                this.A0u = CBP.A00(configuration, typeface);
            }
            Typeface typeface2 = this.A0y;
            if (typeface2 != null) {
                this.A0x = CBP.A00(configuration, typeface2);
            }
            Typeface typeface3 = this.A0u;
            if (typeface3 == null) {
                typeface3 = this.A0v;
            }
            this.A0e = typeface3;
            Typeface typeface4 = this.A0x;
            if (typeface4 == null) {
                typeface4 = this.A0y;
            }
            this.A0f = typeface4;
            A0D(true);
        }
    }

    public void A0C(Canvas canvas) {
        Canvas canvas2 = canvas;
        int save = canvas2.save();
        if (this.A0k != null) {
            RectF rectF = this.A13;
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                TextPaint textPaint = this.A14;
                textPaint.setTextSize(this.A0s);
                float f = this.A09;
                float f2 = this.A0A;
                float f3 = this.A0t;
                if (f3 != 1.0f && !this.A0n) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if (this.A0X <= 1 || ((this.A0o && !this.A0n) || (this.A0n && this.A0G <= this.A0O))) {
                    canvas2.translate(f, f2);
                    this.A0g.draw(canvas2);
                } else {
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(this.A09 - ((float) this.A0g.getLineStart(0)), f2);
                    float f4 = (float) alpha;
                    textPaint.setAlpha((int) (this.A0L * f4));
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.A0D, this.A0B, this.A0C, BEA.A04(this.A0T, textPaint.getAlpha()));
                    }
                    this.A0g.draw(canvas2);
                    textPaint.setAlpha((int) (this.A06 * f4));
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.A0D, this.A0B, this.A0C, BEA.A04(this.A0T, textPaint.getAlpha()));
                    }
                    int lineBaseline = this.A0g.getLineBaseline(0);
                    CharSequence charSequence = this.A0l;
                    TextPaint textPaint2 = textPaint;
                    float f5 = (float) lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, textPaint2);
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.A0D, this.A0B, this.A0C, this.A0T);
                    }
                    if (!this.A0n) {
                        String trim = this.A0l.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        textPaint.setAlpha(alpha);
                        canvas2.drawText(trim, 0, Math.min(this.A0g.getLineEnd(0), trim.length()), 0.0f, f5, textPaint2);
                    }
                }
                canvas2.restoreToCount(save);
            }
        }
    }

    public void A0D(boolean z) {
        Rect rect;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        Rect rect2;
        float f6;
        float f7;
        float descent;
        StaticLayout staticLayout;
        View view = this.A16;
        if ((view.getHeight() > 0 && view.getWidth() > 0) || z) {
            A03(1.0f, z);
            CharSequence charSequence = this.A0k;
            if (!(charSequence == null || (staticLayout = this.A0g) == null)) {
                this.A0l = TextUtils.ellipsize(charSequence, this.A14, (float) staticLayout.getWidth(), this.A0h);
            }
            CharSequence charSequence2 = this.A0l;
            float f8 = 0.0f;
            if (charSequence2 != null) {
                this.A08 = this.A14.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.A08 = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.A0R, this.A0o ? 1 : 0);
            int i2 = absoluteGravity & 112;
            if (i2 == 48) {
                rect = this.A11;
                f = (float) rect.top;
                this.A01 = f;
            } else if (i2 != 80) {
                TextPaint textPaint = this.A14;
                rect = this.A11;
                this.A01 = ((float) rect.centerY()) - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
            } else {
                rect = this.A11;
                f = ((float) rect.bottom) + this.A14.ascent();
                this.A01 = f;
            }
            int i3 = absoluteGravity & 8388615;
            if (i3 == 1) {
                f2 = (float) rect.centerX();
                f3 = this.A08 / 2.0f;
                f4 = f2 - f3;
            } else if (i3 != 5) {
                f4 = (float) rect.left;
            } else {
                f2 = (float) rect.right;
                f3 = this.A08;
                f4 = f2 - f3;
            }
            this.A00 = f4;
            A03(0.0f, z);
            StaticLayout staticLayout2 = this.A0g;
            if (staticLayout2 != null) {
                f5 = (float) staticLayout2.getHeight();
            } else {
                f5 = 0.0f;
            }
            StaticLayout staticLayout3 = this.A0g;
            if (staticLayout3 == null || this.A0X <= 1) {
                CharSequence charSequence3 = this.A0k;
                if (charSequence3 != null) {
                    f8 = this.A14.measureText(charSequence3, 0, charSequence3.length());
                }
            } else {
                f8 = (float) staticLayout3.getWidth();
            }
            StaticLayout staticLayout4 = this.A0g;
            if (staticLayout4 != null) {
                i = staticLayout4.getLineCount();
            } else {
                i = 0;
            }
            this.A0U = i;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.A0V, this.A0o ? 1 : 0);
            int i4 = absoluteGravity2 & 112;
            if (i4 != 48) {
                if (i4 != 80) {
                    rect2 = this.A12;
                    descent = ((float) rect2.centerY()) - (f5 / 2.0f);
                } else {
                    rect2 = this.A12;
                    descent = (((float) rect2.bottom) - f5) + this.A14.descent();
                }
                this.A0F = descent;
            } else {
                rect2 = this.A12;
                this.A0F = (float) rect2.top;
            }
            int i5 = absoluteGravity2 & 8388615;
            if (i5 == 1) {
                f6 = (float) rect2.centerX();
                f8 /= 2.0f;
                f7 = f6 - f8;
            } else if (i5 != 5) {
                f7 = (float) rect2.left;
            } else {
                f6 = (float) rect2.right;
                f7 = f6 - f8;
            }
            this.A0E = f7;
            A03(this.A0G, false);
            view.postInvalidateOnAnimation();
            A02();
        }
    }

    public C26249Cvn(View view) {
        this.A16 = view;
        TextPaint textPaint = new TextPaint(129);
        this.A14 = textPaint;
        this.A15 = new TextPaint(textPaint);
        this.A11 = AnonymousClass3MW.A07();
        this.A12 = AnonymousClass3MW.A07();
        this.A13 = AnonymousClass3MW.A08();
        float f = this.A0N;
        this.A0O = f + ((1.0f - f) * 0.5f);
        A0B(AnonymousClass000.A0Y(view).getConfiguration());
    }
}
