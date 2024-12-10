package com.google.android.material.slider;

import X.AnonymousClass000;
import X.AnonymousClass1YT;
import X.AnonymousClass1YU;
import X.AnonymousClass1YW;
import X.AnonymousClass1Z2;
import X.AnonymousClass1Z9;
import X.AnonymousClass1ZA;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass47H;
import X.AnonymousClass5WZ;
import X.AnonymousClass7RP;
import X.AnonymousClass8BR;
import X.BE6;
import X.BE7;
import X.BE8;
import X.BE9;
import X.BEA;
import X.BEQ;
import X.BHJ;
import X.BL7;
import X.C108945cZ;
import X.C108975cc;
import X.C108985cd;
import X.C17880vN;
import X.C19740yt;
import X.C23519Bii;
import X.C25923Coh;
import X.C26044Cr8;
import X.C26323Cxg;
import X.C27781Xn;
import X.C27791Xo;
import X.C27801Xq;
import X.C27831Xu;
import X.C28011Ym;
import X.C28041Yp;
import X.C29101bc;
import X.C72473Md;
import X.C91854gM;
import X.E2S;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Slider extends View {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public ValueAnimator A0J;
    public ValueAnimator A0K;
    public ColorStateList A0L;
    public ColorStateList A0M;
    public ColorStateList A0N;
    public ColorStateList A0O;
    public ColorStateList A0P;
    public Drawable A0Q;
    public AnonymousClass7RP A0R;
    public E2S A0S;
    public ArrayList A0T;
    public List A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public float[] A0Z;
    public float A0a;
    public float A0b;
    public MotionEvent A0c;
    public boolean A0d;
    public final int A0e;
    public final Paint A0f;
    public final Paint A0g;
    public final Paint A0h;
    public final Paint A0i;
    public final Paint A0j;
    public final Paint A0k;
    public final AccessibilityManager A0l;
    public final C27801Xq A0m;
    public final BL7 A0n;
    public final List A0o;
    public final List A0p;
    public final List A0q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Slider(android.content.Context r15, android.util.AttributeSet r16, int r17) {
        /*
            r14 = this;
            r3 = 0
            r0 = 2132084802(0x7f150842, float:1.9809785E38)
            r9 = r16
            r12 = r17
            android.content.Context r0 = X.C27771Xm.A00(r15, r9, r12, r0)
            r14.<init>(r0, r9, r12)
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r14.A0p = r0
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r14.A0o = r0
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r14.A0q = r0
            r14.A0W = r3
            r14.A0X = r3
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r14.A0T = r0
            r0 = -1
            r14.A03 = r0
            r14.A06 = r0
            r0 = 0
            r14.A00 = r0
            r2 = 1
            r14.A0Y = r2
            r14.A0V = r3
            X.1Xq r6 = new X.1Xq
            r6.<init>()
            r14.A0m = r6
            java.util.List r0 = java.util.Collections.emptyList()
            r14.A0U = r0
            android.content.Context r8 = r14.getContext()
            android.graphics.Paint r0 = X.AnonymousClass3MW.A06()
            r14.A0j = r0
            X.AnonymousClass3MW.A1P(r0)
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r4)
            android.graphics.Paint r0 = X.AnonymousClass3MW.A06()
            r14.A0g = r0
            X.AnonymousClass3MW.A1P(r0)
            r0.setStrokeCap(r4)
            android.graphics.Paint r1 = X.C108945cZ.A0K(r2)
            r14.A0k = r1
            X.C108945cZ.A1L(r1)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.CLEAR
            X.C108965cb.A11(r1, r0)
            android.graphics.Paint r0 = X.C108945cZ.A0K(r2)
            r14.A0h = r0
            X.C108945cZ.A1L(r0)
            android.graphics.Paint r0 = X.AnonymousClass3MW.A06()
            r14.A0i = r0
            X.AnonymousClass3MW.A1P(r0)
            r0.setStrokeCap(r4)
            android.graphics.Paint r0 = X.AnonymousClass3MW.A06()
            r14.A0f = r0
            X.AnonymousClass3MW.A1P(r0)
            r0.setStrokeCap(r4)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131167923(0x7f070ab3, float:1.7950133E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r14.A0D = r0
            r0 = 2131167922(0x7f070ab2, float:1.7950131E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r14.A0C = r0
            r14.A0G = r0
            r0 = 2131167920(0x7f070ab0, float:1.7950127E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r14.A04 = r0
            r0 = 2131167921(0x7f070ab1, float:1.795013E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r14.A05 = r0
            r0 = 2131167916(0x7f070aac, float:1.795012E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r14.A09 = r0
            int[] r10 = X.C27781Xn.A0f
            r13 = 2132084802(0x7f150842, float:1.9809785E38)
            int[] r11 = new int[r3]
            android.content.res.TypedArray r5 = X.C27791Xo.A00(r8, r9, r10, r11, r12, r13)
            r1 = 8
            r0 = 2132084836(0x7f150864, float:1.9809854E38)
            int r0 = r5.getResourceId(r1, r0)
            r14.A0A = r0
            r0 = 3
            r4 = 0
            float r0 = r5.getFloat(r0, r4)
            r14.A01 = r0
            r1 = 4
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r5.getFloat(r1, r0)
            r14.A02 = r0
            java.lang.Float[] r1 = new java.lang.Float[r2]
            float r0 = r14.A01
            X.BE6.A1T(r1, r0, r3)
            r14.setValues((java.lang.Float[]) r1)
            r0 = 2
            float r0 = r5.getFloat(r0, r4)
            r14.A00 = r0
            android.content.Context r1 = r14.getContext()
            r0 = 48
            float r0 = X.AnonymousClass1YU.A00(r1, r0)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r7 = (float) r0
            r0 = 9
            float r0 = r5.getDimension(r0, r7)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r7 = (int) r0
            r14.A0B = r7
            r0 = 19
            boolean r7 = r5.hasValue(r0)
            r0 = 21
            r1 = 20
            if (r7 == 0) goto L_0x012b
            r0 = 19
            r1 = 19
        L_0x012b:
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r8, r5, r0)
            if (r0 != 0) goto L_0x0138
            r0 = 2131101825(0x7f060881, float:1.781607E38)
            android.content.res.ColorStateList r0 = X.C19740yt.A03(r8, r0)
        L_0x0138:
            r14.setTrackInactiveTintList(r0)
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r8, r5, r1)
            if (r0 != 0) goto L_0x0148
            r0 = 2131101822(0x7f06087e, float:1.7816065E38)
            android.content.res.ColorStateList r0 = X.C19740yt.A03(r8, r0)
        L_0x0148:
            r14.setTrackActiveTintList(r0)
            r0 = 10
            android.content.res.ColorStateList r1 = X.AnonymousClass1YT.A01(r8, r5, r0)
            X.1Xq r0 = r14.A0m
            r0.A0F(r1)
            r0 = 13
            r1 = 13
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x0167
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r8, r5, r1)
            r14.setThumbStrokeColor(r0)
        L_0x0167:
            r0 = 14
            float r0 = r5.getDimension(r0, r4)
            r14.setThumbStrokeWidth(r0)
            r0 = 5
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r8, r5, r0)
            if (r0 != 0) goto L_0x017e
            r0 = 2131101823(0x7f06087f, float:1.7816067E38)
            android.content.res.ColorStateList r0 = X.C19740yt.A03(r8, r0)
        L_0x017e:
            r14.setHaloTintList(r0)
            r0 = 18
            boolean r0 = r5.getBoolean(r0, r2)
            r14.A0Y = r0
            r0 = 15
            boolean r7 = r5.hasValue(r0)
            r0 = 17
            r1 = 16
            if (r7 == 0) goto L_0x0199
            r0 = 15
            r1 = 15
        L_0x0199:
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r8, r5, r0)
            if (r0 != 0) goto L_0x01a6
            r0 = 2131101824(0x7f060880, float:1.7816069E38)
            android.content.res.ColorStateList r0 = X.C19740yt.A03(r8, r0)
        L_0x01a6:
            r14.setTickInactiveTintList(r0)
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r8, r5, r1)
            if (r0 != 0) goto L_0x01b6
            r0 = 2131101821(0x7f06087d, float:1.7816063E38)
            android.content.res.ColorStateList r0 = X.C19740yt.A03(r8, r0)
        L_0x01b6:
            r14.setTickActiveTintList(r0)
            r0 = 12
            int r0 = r5.getDimensionPixelSize(r0, r3)
            r14.setThumbRadius(r0)
            r0 = 6
            int r0 = r5.getDimensionPixelSize(r0, r3)
            r14.setHaloRadius(r0)
            r0 = 11
            float r0 = r5.getDimension(r0, r4)
            r14.setThumbElevation(r0)
            r0 = 22
            int r0 = r5.getDimensionPixelSize(r0, r3)
            r14.setTrackHeight(r0)
            r0 = 7
            int r0 = r5.getInt(r0, r3)
            r14.setLabelBehavior(r0)
            boolean r0 = r5.getBoolean(r3, r2)
            if (r0 != 0) goto L_0x01ed
            r14.setEnabled(r3)
        L_0x01ed:
            r5.recycle()
            r14.setFocusable(r2)
            r14.setClickable(r2)
            r6.A0B()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r8)
            int r0 = r0.getScaledTouchSlop()
            r14.A0e = r0
            X.BL7 r0 = new X.BL7
            r0.<init>(r14)
            r14.A0n = r0
            X.AnonymousClass1HF.A0f(r14, r0)
            android.view.accessibility.AccessibilityManager r0 = X.BEA.A0O(r14)
            r14.A0l = r0
            int[] r1 = new int[r2]
            r0 = 16842788(0x1010024, float:2.369366E-38)
            r1[r3] = r0
            android.content.res.TypedArray r1 = r15.obtainStyledAttributes(r9, r1)
            boolean r0 = r1.hasValue(r3)
            if (r0 == 0) goto L_0x022b
            float r0 = r1.getFloat(r3, r4)
            r14.setValue(r0)
        L_0x022b:
            r1.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.Slider.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void A09(C23519Bii bii, float f) {
        String str;
        ViewOverlay viewOverlay = null;
        if (((float) ((int) f)) == f) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        Object[] A1a = AnonymousClass3MW.A1a();
        BE6.A1T(A1a, f, 0);
        String format = String.format(str, A1a);
        if (!TextUtils.equals(bii.A0A, format)) {
            bii.A0A = format;
            bii.A0F.A02 = true;
            bii.invalidateSelf();
        }
        int A002 = (this.A0G + ((int) (A00(f) * ((float) this.A0H)))) - (bii.getIntrinsicWidth() / 2);
        int A022 = A02() - (this.A09 + this.A0E);
        bii.setBounds(A002, A022 - bii.getIntrinsicHeight(), bii.getIntrinsicWidth() + A002, A022);
        Rect rect = new Rect(bii.getBounds());
        C25923Coh.A01(rect, this, AnonymousClass1YU.A02(this));
        bii.setBounds(rect);
        ViewGroup A023 = AnonymousClass1YU.A02(this);
        if (A023 != null) {
            viewOverlay = A023.getOverlay();
        }
        viewOverlay.add(bii);
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.A0V = false;
        return super.onKeyUp(i, keyEvent);
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.A0Q = null;
        this.A0U = AnonymousClass000.A13();
        for (Drawable mutate : drawableArr) {
            List list = this.A0U;
            Drawable newDrawable = mutate.mutate().getConstantState().newDrawable();
            A07(newDrawable);
            list.add(newDrawable);
        }
        postInvalidate();
    }

    public void setSeparationUnit(int i) {
        this.A0d = true;
        postInvalidate();
    }

    /* renamed from: setStepSize$BaseSlider */
    public void setStepSize(float f) {
        if (f < 0.0f) {
            Object[] A1a = AnonymousClass8BR.A1a();
            BE6.A1T(A1a, f, 0);
            BE6.A1T(A1a, this.A01, 1);
            BE8.A1K(A1a, this.A02);
            throw BE8.A0X("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", A1a);
        } else if (this.A00 != f) {
            this.A00 = f;
            this.A0d = true;
            postInvalidate();
        }
    }

    public void setValue(float f) {
        Float[] fArr = new Float[1];
        BE6.A1T(fArr, f, 0);
        setValues(fArr);
    }

    private float A00(float f) {
        float f2 = this.A01;
        float f3 = (f - f2) / (this.A02 - f2);
        if (getLayoutDirection() == 1) {
            return 1.0f - f3;
        }
        return f3;
    }

    public static float A01(Slider slider) {
        float f = slider.A00;
        if (f == 0.0f) {
            f = 1.0f;
        }
        float f2 = (slider.A02 - slider.A01) / f;
        if (f2 <= 20.0f) {
            return f;
        }
        return ((float) Math.round(f2 / 20.0f)) * f;
    }

    private int A02() {
        int i = this.A0I / 2;
        int i2 = this.A08;
        int i3 = 0;
        if (i2 == 1 || i2 == 3) {
            i3 = ((Drawable) this.A0p.get(0)).getIntrinsicHeight();
        }
        return i + i3;
    }

    private void A03() {
        if (this.A00 > 0.0f) {
            A06();
            int i = this.A0H;
            int min = Math.min((int) (((this.A02 - this.A01) / this.A00) + 1.0f), (i / (this.A0F * 2)) + 1);
            float[] fArr = this.A0Z;
            if (fArr == null || fArr.length != min * 2) {
                this.A0Z = new float[(min * 2)];
            }
            float f = ((float) i) / ((float) (min - 1));
            for (int i2 = 0; i2 < min * 2; i2 += 2) {
                float[] fArr2 = this.A0Z;
                fArr2[i2] = ((float) this.A0G) + ((((float) i2) / 2.0f) * f);
                fArr2[i2 + 1] = (float) A02();
            }
        }
    }

    private void A04() {
        Iterator it = this.A0q.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass000.A0s("onStartTrackingTouch");
        }
    }

    private void A06() {
        if (this.A0d) {
            float f = this.A01;
            float f2 = this.A02;
            if (f >= f2) {
                Object[] A1b = AnonymousClass3MW.A1b();
                A1b[0] = Float.valueOf(f);
                BE8.A1J(A1b, f2);
                throw BE8.A0Y("valueFrom(%s) must be smaller than valueTo(%s)", A1b);
            } else if (f2 <= f) {
                Object[] A1b2 = AnonymousClass3MW.A1b();
                A1b2[0] = Float.valueOf(f2);
                BE8.A1J(A1b2, f);
                throw BE8.A0Y("valueTo(%s) must be greater than valueFrom(%s)", A1b2);
            } else if (this.A00 <= 0.0f || A0B(f2 - f)) {
                Iterator it = this.A0T.iterator();
                while (it.hasNext()) {
                    Number number = (Number) it.next();
                    float floatValue = number.floatValue();
                    float f3 = this.A01;
                    if (floatValue < f3 || floatValue > this.A02) {
                        Object[] objArr = new Object[3];
                        objArr[0] = number;
                        BE6.A1T(objArr, f3, 1);
                        BE6.A1T(objArr, this.A02, 2);
                        throw BE8.A0Y("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", objArr);
                    } else if (this.A00 > 0.0f && !A0B(floatValue - f3)) {
                        Object[] A1a = BE6.A1a();
                        A1a[0] = number;
                        BE6.A1T(A1a, this.A01, 1);
                        Float valueOf = Float.valueOf(this.A00);
                        A1a[2] = valueOf;
                        A1a[3] = valueOf;
                        throw BE8.A0Y("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", A1a);
                    }
                }
                float f4 = this.A00;
                if (f4 != 0.0f) {
                    if (((float) ((int) f4)) != f4) {
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = "stepSize";
                        BE6.A1T(objArr2, f4, 1);
                        BE7.A1M("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "BaseSlider", objArr2);
                    }
                    float f5 = this.A01;
                    if (((float) ((int) f5)) != f5) {
                        Object[] objArr3 = new Object[2];
                        objArr3[0] = "valueFrom";
                        BE6.A1T(objArr3, f5, 1);
                        BE7.A1M("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "BaseSlider", objArr3);
                    }
                    float f6 = this.A02;
                    if (((float) ((int) f6)) != f6) {
                        Object[] objArr4 = new Object[2];
                        objArr4[0] = "valueTo";
                        BE6.A1T(objArr4, f6, 1);
                        BE7.A1M("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "BaseSlider", objArr4);
                    }
                }
                this.A0d = false;
            } else {
                Object[] A1a2 = AnonymousClass8BR.A1a();
                A1a2[0] = Float.valueOf(this.A00);
                BE8.A1J(A1a2, this.A01);
                BE8.A1K(A1a2, this.A02);
                throw BE8.A0Y("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", A1a2);
            }
        }
    }

    private void A07(Drawable drawable) {
        int i = this.A0E * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, i);
            return;
        }
        float max = ((float) i) / ((float) Math.max(intrinsicWidth, intrinsicHeight));
        drawable.setBounds(0, 0, (int) (((float) intrinsicWidth) * max), (int) (((float) intrinsicHeight) * max));
    }

    private boolean A0C(int i) {
        int i2 = this.A06;
        long j = ((long) i2) + ((long) i);
        long size = (long) (this.A0T.size() - 1);
        if (j < 0) {
            size = 0;
        } else if (j <= size) {
            size = j;
        }
        int i3 = (int) size;
        this.A06 = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.A03 != -1) {
            this.A03 = i3;
        }
        A08(this);
        postInvalidate();
        return true;
    }

    public static boolean A0D(Slider slider, float f, int i) {
        float A042;
        float A043;
        slider.A06 = i;
        if (((double) C108945cZ.A00(f, BE9.A04(slider.A0T, i))) < 1.0E-4d) {
            return false;
        }
        float f2 = 0.0f;
        if (slider.getLayoutDirection() == 1) {
            f2 = -0.0f;
        }
        int i2 = i + 1;
        ArrayList arrayList = slider.A0T;
        if (i2 >= arrayList.size()) {
            A042 = slider.A02;
        } else {
            A042 = BE9.A04(arrayList, i2) - f2;
        }
        int i3 = i - 1;
        if (i3 < 0) {
            A043 = slider.A01;
        } else {
            A043 = BE9.A04(arrayList, i3) + f2;
        }
        if (f < A043) {
            A042 = A043;
        } else if (f <= A042) {
            A042 = f;
        }
        slider.A0T.set(i, Float.valueOf(A042));
        for (AnonymousClass5WZ r1 : slider.A0o) {
            float A044 = BE9.A04(slider.A0T, i);
            AnonymousClass47H r2 = ((C91854gM) r1).A00;
            if (r2.A0D) {
                r2.A0D = false;
            } else {
                r2.A4i(100.0f - A044);
            }
        }
        AccessibilityManager accessibilityManager = slider.A0l;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return true;
        }
        AnonymousClass7RP r0 = slider.A0R;
        if (r0 == null) {
            slider.A0R = new AnonymousClass7RP(slider);
        } else {
            slider.removeCallbacks(r0);
        }
        AnonymousClass7RP r22 = slider.A0R;
        r22.A00 = i;
        slider.postDelayed(r22, 200);
        return true;
    }

    private float[] getActiveRange() {
        float A042 = AnonymousClass000.A04(Collections.max(C17880vN.A10(this.A0T)));
        float A043 = AnonymousClass000.A04(Collections.min(C17880vN.A10(this.A0T)));
        if (this.A0T.size() == 1) {
            A043 = this.A01;
        }
        float A002 = A00(A043);
        float A003 = A00(A042);
        boolean A1T = BE8.A1T(getLayoutDirection());
        float[] A1V = C108945cZ.A1V();
        if (A1T) {
            A1V[0] = A003;
            A1V[1] = A002;
            return A1V;
        }
        A1V[0] = A002;
        A1V[1] = A003;
        return A1V;
    }

    private float getValueOfTouchPosition() {
        double d;
        float f = this.A0b;
        float f2 = this.A00;
        if (f2 > 0.0f) {
            int i = (int) ((this.A02 - this.A01) / f2);
            d = ((double) BE6.A04(f, (float) i)) / ((double) i);
        } else {
            d = (double) f;
        }
        if (getLayoutDirection() == 1) {
            d = 1.0d - d;
        }
        float f3 = this.A02;
        float f4 = this.A01;
        return (float) ((d * ((double) (f3 - f4))) + ((double) f4));
    }

    public void A0E(Rect rect, int i) {
        int A002 = this.A0G + ((int) (A00(BE9.A04(C17880vN.A10(this.A0T), i)) * ((float) this.A0H)));
        int A022 = A02();
        int i2 = this.A0E;
        int i3 = this.A0B;
        if (i2 <= i3) {
            i2 = i3;
        }
        int i4 = i2 / 2;
        rect.set(A002 - i4, A022 - i4, A002 + i4, A022 + i4);
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A0n.A1o(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public CharSequence getAccessibilityClassName$BaseSlider() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.A0n.A00;
    }

    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return this.A03;
    }

    public int getActiveThumbIndex$BaseSlider() {
        return this.A03;
    }

    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return this.A06;
    }

    public int getFocusedThumbIndex$BaseSlider() {
        return this.A06;
    }

    public /* bridge */ /* synthetic */ int getHaloRadius() {
        return this.A07;
    }

    public int getHaloRadius$BaseSlider() {
        return this.A07;
    }

    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        return this.A0L;
    }

    public ColorStateList getHaloTintList$BaseSlider() {
        return this.A0L;
    }

    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        return this.A08;
    }

    public int getLabelBehavior$BaseSlider() {
        return this.A08;
    }

    public /* bridge */ /* synthetic */ float getStepSize() {
        return this.A00;
    }

    public float getStepSize$BaseSlider() {
        return this.A00;
    }

    public /* bridge */ /* synthetic */ float getThumbElevation() {
        return this.A0m.A01.A00;
    }

    public float getThumbElevation$BaseSlider() {
        return this.A0m.A01.A00;
    }

    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return this.A0E;
    }

    public int getThumbRadius$BaseSlider() {
        return this.A0E;
    }

    public /* bridge */ /* synthetic */ ColorStateList getThumbStrokeColor() {
        return this.A0m.A01.A0C;
    }

    public ColorStateList getThumbStrokeColor$BaseSlider() {
        return this.A0m.A01.A0C;
    }

    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
        return this.A0m.A01.A04;
    }

    public float getThumbStrokeWidth$BaseSlider() {
        return this.A0m.A01.A04;
    }

    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        return this.A0m.A01.A0B;
    }

    public ColorStateList getThumbTintList$BaseSlider() {
        return this.A0m.A01.A0B;
    }

    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        return this.A0M;
    }

    public ColorStateList getTickActiveTintList$BaseSlider() {
        return this.A0M;
    }

    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        return this.A0N;
    }

    public ColorStateList getTickInactiveTintList$BaseSlider() {
        return this.A0N;
    }

    /* renamed from: getTickTintList$BaseSlider */
    public ColorStateList getTickTintList() {
        if (this.A0N.equals(this.A0M)) {
            return this.A0M;
        }
        throw AnonymousClass000.A0n("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        return this.A0O;
    }

    public ColorStateList getTrackActiveTintList$BaseSlider() {
        return this.A0O;
    }

    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return this.A0F;
    }

    public int getTrackHeight$BaseSlider() {
        return this.A0F;
    }

    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        return this.A0P;
    }

    public ColorStateList getTrackInactiveTintList$BaseSlider() {
        return this.A0P;
    }

    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return this.A0G;
    }

    public int getTrackSidePadding$BaseSlider() {
        return this.A0G;
    }

    /* renamed from: getTrackTintList$BaseSlider */
    public ColorStateList getTrackTintList() {
        if (this.A0P.equals(this.A0O)) {
            return this.A0O;
        }
        throw AnonymousClass000.A0n("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return this.A0H;
    }

    public int getTrackWidth$BaseSlider() {
        return this.A0H;
    }

    public float getValue() {
        return BE9.A04(C17880vN.A10(this.A0T), 0);
    }

    public /* bridge */ /* synthetic */ float getValueFrom() {
        return this.A01;
    }

    public float getValueFrom$BaseSlider() {
        return this.A01;
    }

    public /* bridge */ /* synthetic */ float getValueTo() {
        return this.A02;
    }

    public float getValueTo$BaseSlider() {
        return this.A02;
    }

    public List getValues() {
        return C17880vN.A10(this.A0T);
    }

    public void onDetachedFromWindow() {
        AnonymousClass7RP r0 = this.A0R;
        if (r0 != null) {
            removeCallbacks(r0);
        }
        this.A0W = false;
        for (C23519Bii bii : this.A0p) {
            ViewGroup A022 = AnonymousClass1YU.A02(this);
            if (A022 != null) {
                A022.getOverlay().remove(bii);
                ViewGroup A023 = AnonymousClass1YU.A02(this);
                if (A023 != null) {
                    A023.removeOnLayoutChangeListener(bii.A0E);
                }
            }
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        if (this.A0d) {
            A06();
            A03();
        }
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        int A022 = A02();
        int i = this.A0H;
        float[] activeRange = getActiveRange();
        int i2 = this.A0G;
        float f = (float) i;
        float f2 = ((float) i2) + (activeRange[1] * f);
        float f3 = (float) (i2 + i);
        if (f2 < f3) {
            float f4 = (float) A022;
            canvas2.drawLine(f2, f4, f3, f4, this.A0j);
        }
        float f5 = (float) this.A0G;
        float A032 = BE6.A03(activeRange, f, f5, 0);
        if (A032 > f5) {
            float f6 = (float) A022;
            canvas2.drawLine(f5, f6, A032, f6, this.A0j);
        }
        if (AnonymousClass000.A04(Collections.max(C17880vN.A10(this.A0T))) > this.A01) {
            int i3 = this.A0H;
            float[] activeRange2 = getActiveRange();
            float f7 = (float) this.A0G;
            float f8 = (float) i3;
            float f9 = (float) A022;
            canvas2.drawLine(BE6.A03(activeRange2, f8, f7, 0), f9, f7 + (activeRange2[1] * f8), f9, this.A0g);
        }
        if (this.A0Y && this.A00 > 0.0f) {
            float[] activeRange3 = getActiveRange();
            float[] fArr = this.A0Z;
            float f10 = activeRange3[0];
            float length = (float) ((fArr.length / 2) - 1);
            int A042 = BE6.A04(f10, length);
            int A043 = BE6.A04(activeRange3[1], length);
            int i4 = A042 * 2;
            Paint paint = this.A0i;
            canvas2.drawPoints(fArr, 0, i4, paint);
            int i5 = A043 * 2;
            canvas2.drawPoints(this.A0Z, i4, i5 - i4, this.A0f);
            float[] fArr2 = this.A0Z;
            canvas2.drawPoints(fArr2, i5, fArr2.length - i5, paint);
        }
        if ((this.A0X || isFocused()) && isEnabled()) {
            int i6 = this.A0H;
            if (!(getBackground() instanceof RippleDrawable)) {
                int A002 = (int) (((float) this.A0G) + (A00(BE9.A04(this.A0T, this.A06)) * ((float) i6)));
                if (Build.VERSION.SDK_INT < 28) {
                    int i7 = this.A07;
                    canvas2.clipRect((float) (A002 - i7), (float) (A022 - i7), (float) (A002 + i7), (float) (i7 + A022), Region.Op.UNION);
                }
                canvas2.drawCircle((float) A002, (float) A022, (float) this.A07, this.A0h);
            }
        }
        if ((this.A03 != -1 || this.A08 == 3) && isEnabled()) {
            if (this.A08 != 2) {
                if (!this.A0W) {
                    this.A0W = true;
                    float f11 = 0.0f;
                    ValueAnimator valueAnimator = this.A0K;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        f11 = C108985cd.A00(valueAnimator);
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(C72473Md.A1a(f11, 1.0f));
                    int A003 = AnonymousClass1Z9.A00(getContext(), 2130970538, 83);
                    TimeInterpolator A012 = C29101bc.A01(AnonymousClass1YW.A00, getContext(), 2130970548);
                    ofFloat.setDuration((long) A003);
                    ofFloat.setInterpolator(A012);
                    C26323Cxg.A00(ofFloat, this, 9);
                    this.A0J = ofFloat;
                    this.A0K = null;
                    ofFloat.start();
                }
                List list = this.A0p;
                Iterator it = list.iterator();
                for (int i8 = 0; i8 < this.A0T.size() && it.hasNext(); i8++) {
                    if (i8 != this.A06) {
                        A09((C23519Bii) it.next(), BE9.A04(this.A0T, i8));
                    }
                }
                if (it.hasNext()) {
                    A09((C23519Bii) it.next(), BE9.A04(this.A0T, this.A06));
                } else {
                    Object[] objArr = new Object[2];
                    C17880vN.A1T(objArr, list.size(), 0);
                    C17880vN.A1T(objArr, this.A0T.size(), 1);
                    throw BE8.A0Y("Not enough labels(%d) to display all the values(%d)", objArr);
                }
            }
        } else if (this.A0W) {
            this.A0W = false;
            float f12 = 1.0f;
            ValueAnimator valueAnimator2 = this.A0J;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                f12 = C108985cd.A00(valueAnimator2);
                valueAnimator2.cancel();
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(C72473Md.A1a(f12, 0.0f));
            int A004 = AnonymousClass1Z9.A00(getContext(), 2130970541, 117);
            TimeInterpolator A013 = C29101bc.A01(AnonymousClass1YW.A01, getContext(), 2130970546);
            ofFloat2.setDuration((long) A004);
            ofFloat2.setInterpolator(A013);
            C26323Cxg.A00(ofFloat2, this, 9);
            this.A0K = ofFloat2;
            this.A0J = null;
            BEQ.A00(ofFloat2, this, 13);
            this.A0K.start();
        }
        int i9 = this.A0H;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.A0T;
            if (i10 < arrayList.size()) {
                float A044 = BE9.A04(arrayList, i10);
                Drawable drawable = this.A0Q;
                if (drawable == null) {
                    if (i10 < this.A0U.size()) {
                        drawable = (Drawable) this.A0U.get(i10);
                    } else {
                        if (!isEnabled()) {
                            canvas2.drawCircle(((float) this.A0G) + (A00(A044) * ((float) i9)), (float) A022, (float) this.A0E, this.A0k);
                        }
                        drawable = this.A0m;
                    }
                }
                canvas2.save();
                canvas2.translate(((float) (this.A0G + ((int) (A00(A044) * ((float) i9))))) - (BE6.A02(drawable.getBounds()) / 2.0f), ((float) A022) - (((float) drawable.getBounds().height()) / 2.0f));
                drawable.draw(canvas2);
                canvas2.restore();
                i10++;
            } else {
                return;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.A0I;
        int i4 = this.A08;
        int i5 = 0;
        if (i4 == 1 || i4 == 3) {
            i5 = ((Drawable) this.A0p.get(0)).getIntrinsicHeight();
        }
        super.onMeasure(i, BE7.A06(i3 + i5));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        BHJ bhj = (BHJ) parcelable;
        super.onRestoreInstanceState(bhj.getSuperState());
        this.A01 = bhj.A01;
        this.A02 = bhj.A02;
        setValuesInternal(bhj.A03);
        this.A00 = bhj.A00;
        if (bhj.A04) {
            requestFocus();
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.A0H = Math.max(i - (this.A0G * 2), 0);
        A03();
        A08(this);
    }

    /* renamed from: setFocusedThumbIndex$BaseSlider */
    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.A0T.size()) {
            throw AnonymousClass000.A0k("index out of range");
        }
        this.A06 = i;
        this.A0n.A1l(i);
        postInvalidate();
    }

    /* renamed from: setHaloRadius$BaseSlider */
    public void setHaloRadius(int i) {
        if (i != this.A07) {
            this.A07 = i;
            Drawable background = getBackground();
            if (!(getBackground() instanceof RippleDrawable) || !(background instanceof RippleDrawable)) {
                postInvalidate();
                return;
            }
            RippleDrawable rippleDrawable = (RippleDrawable) background;
            int i2 = this.A07;
            if (Build.VERSION.SDK_INT >= 23) {
                rippleDrawable.setRadius(i2);
                return;
            }
            Class<RippleDrawable> cls = RippleDrawable.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setMaxRadius", new Class[]{Integer.TYPE});
                Object[] objArr = new Object[1];
                C17880vN.A1T(objArr, i2, 0);
                declaredMethod.invoke(rippleDrawable, objArr);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new IllegalStateException("Couldn't set RippleDrawable radius", e);
            }
        }
    }

    /* renamed from: setHaloTintList$BaseSlider */
    public void setHaloTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.A0L)) {
            this.A0L = colorStateList;
            Drawable background = getBackground();
            if (!(getBackground() instanceof RippleDrawable) || !(background instanceof RippleDrawable)) {
                Paint paint = this.A0h;
                BEA.A10(colorStateList, paint, this);
                paint.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    /* renamed from: setLabelBehavior$BaseSlider */
    public void setLabelBehavior(int i) {
        if (this.A08 != i) {
            this.A08 = i;
            requestLayout();
        }
    }

    /* renamed from: setThumbElevation$BaseSlider */
    public void setThumbElevation(float f) {
        this.A0m.A0C(f);
    }

    /* renamed from: setThumbRadius$BaseSlider */
    public void setThumbRadius(int i) {
        if (i != this.A0E) {
            this.A0E = i;
            C27801Xq r3 = this.A0m;
            C28041Yp r2 = new C28041Yp();
            r2.A01((float) i);
            r3.setShapeAppearanceModel(new C28011Ym(r2));
            int i2 = this.A0E * 2;
            r3.setBounds(0, 0, i2, i2);
            Drawable drawable = this.A0Q;
            if (drawable != null) {
                A07(drawable);
            }
            for (Drawable A072 : this.A0U) {
                A07(A072);
            }
            A05();
        }
    }

    /* renamed from: setThumbStrokeColor$BaseSlider */
    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.A0m.A0G(colorStateList);
        postInvalidate();
    }

    /* renamed from: setThumbStrokeColorResource$BaseSlider */
    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(C19740yt.A03(getContext(), i));
        }
    }

    /* renamed from: setThumbStrokeWidth$BaseSlider */
    public void setThumbStrokeWidth(float f) {
        C27801Xq r1 = this.A0m;
        r1.A01.A04 = f;
        r1.invalidateSelf();
        postInvalidate();
    }

    /* renamed from: setThumbStrokeWidthResource$BaseSlider */
    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    /* renamed from: setThumbTintList$BaseSlider */
    public void setThumbTintList(ColorStateList colorStateList) {
        C27801Xq r1 = this.A0m;
        if (!colorStateList.equals(r1.A01.A0B)) {
            r1.A0F(colorStateList);
            invalidate();
        }
    }

    /* renamed from: setTickActiveTintList$BaseSlider */
    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.A0M)) {
            this.A0M = colorStateList;
            BEA.A10(colorStateList, this.A0f, this);
            invalidate();
        }
    }

    /* renamed from: setTickInactiveTintList$BaseSlider */
    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.A0N)) {
            this.A0N = colorStateList;
            BEA.A10(colorStateList, this.A0i, this);
            invalidate();
        }
    }

    /* renamed from: setTickVisible$BaseSlider */
    public void setTickVisible(boolean z) {
        if (this.A0Y != z) {
            this.A0Y = z;
            postInvalidate();
        }
    }

    /* renamed from: setTrackActiveTintList$BaseSlider */
    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.A0O)) {
            this.A0O = colorStateList;
            BEA.A10(colorStateList, this.A0g, this);
            invalidate();
        }
    }

    /* renamed from: setTrackHeight$BaseSlider */
    public void setTrackHeight(int i) {
        if (this.A0F != i) {
            this.A0F = i;
            this.A0j.setStrokeWidth((float) i);
            this.A0g.setStrokeWidth((float) this.A0F);
            this.A0i.setStrokeWidth(((float) this.A0F) / 2.0f);
            this.A0f.setStrokeWidth(((float) this.A0F) / 2.0f);
            A05();
        }
    }

    /* renamed from: setTrackInactiveTintList$BaseSlider */
    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.A0P)) {
            this.A0P = colorStateList;
            BEA.A10(colorStateList, this.A0j, this);
            invalidate();
        }
    }

    /* renamed from: setValueFrom$BaseSlider */
    public void setValueFrom(float f) {
        this.A01 = f;
        this.A0d = true;
        postInvalidate();
    }

    /* renamed from: setValueTo$BaseSlider */
    public void setValueTo(float f) {
        this.A02 = f;
        this.A0d = true;
        postInvalidate();
    }

    private void A05() {
        boolean z;
        boolean z2;
        int max = Math.max(this.A0D, Math.max(this.A0F + BE9.A08(this), (this.A0E * 2) + getPaddingTop() + getPaddingBottom()));
        if (max == this.A0I) {
            z = false;
        } else {
            this.A0I = max;
            z = true;
        }
        int max2 = this.A0C + Math.max(Math.max(this.A0E - this.A04, 0), Math.max((this.A0F - this.A05) / 2, 0));
        if (this.A0G == max2) {
            z2 = false;
        } else {
            this.A0G = max2;
            if (isLaidOut()) {
                this.A0H = Math.max(getWidth() - (this.A0G * 2), 0);
                A03();
            }
            z2 = true;
        }
        if (z) {
            requestLayout();
        } else if (z2) {
            postInvalidate();
        }
    }

    public static void A08(Slider slider) {
        if ((slider.getBackground() instanceof RippleDrawable) && slider.getMeasuredWidth() > 0) {
            Drawable background = slider.getBackground();
            if (background instanceof RippleDrawable) {
                int A002 = (int) ((slider.A00(BE9.A04(slider.A0T, slider.A06)) * ((float) slider.A0H)) + ((float) slider.A0G));
                int A022 = slider.A02();
                int i = slider.A07;
                C27831Xu.A0E(background, A002 - i, A022 - i, A002 + i, A022 + i);
            }
        }
    }

    private boolean A0A() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private boolean A0B(float f) {
        double doubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.A00)), MathContext.DECIMAL64).doubleValue();
        return C108975cc.A19((BE6.A01((double) Math.round(doubleValue), doubleValue) > 1.0E-4d ? 1 : (BE6.A01((double) Math.round(doubleValue), doubleValue) == 1.0E-4d ? 0 : -1)));
    }

    private void setValuesInternal(ArrayList arrayList) {
        int i;
        ViewGroup A022;
        int resourceId;
        ViewGroup A023;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            ArrayList arrayList2 = this.A0T;
            if (arrayList2.size() != arrayList.size() || !arrayList2.equals(arrayList)) {
                this.A0T = arrayList;
                this.A0d = true;
                this.A06 = 0;
                A08(this);
                List<C27801Xq> list = this.A0p;
                int size = list.size();
                ArrayList arrayList3 = this.A0T;
                if (size > arrayList3.size()) {
                    List<C23519Bii> subList = list.subList(arrayList3.size(), list.size());
                    for (C23519Bii bii : subList) {
                        if (isAttachedToWindow() && (A023 = AnonymousClass1YU.A02(this)) != null) {
                            A023.getOverlay().remove(bii);
                            ViewGroup A024 = AnonymousClass1YU.A02(this);
                            if (A024 != null) {
                                A024.removeOnLayoutChangeListener(bii.A0E);
                            }
                        }
                    }
                    subList.clear();
                }
                while (true) {
                    i = 0;
                    if (list.size() >= this.A0T.size()) {
                        break;
                    }
                    Context context = getContext();
                    int i2 = this.A0A;
                    C23519Bii bii2 = new C23519Bii(context, i2);
                    C26044Cr8 cr8 = null;
                    Context context2 = bii2.A0B;
                    TypedArray A002 = C27791Xo.A00(context2, (AttributeSet) null, C27781Xn.A0m, new int[0], 0, i2);
                    bii2.A04 = context2.getResources().getDimensionPixelSize(2131167945);
                    C28041Yp r4 = new C28041Yp(bii2.A01.A0K);
                    r4.A08 = C23519Bii.A01(bii2);
                    bii2.setShapeAppearanceModel(new C28011Ym(r4));
                    CharSequence text = A002.getText(6);
                    if (!TextUtils.equals(bii2.A0A, text)) {
                        bii2.A0A = text;
                        bii2.A0F.A02 = true;
                        bii2.invalidateSelf();
                    }
                    if (A002.hasValue(0) && (resourceId = A002.getResourceId(0, 0)) != 0) {
                        cr8 = new C26044Cr8(context2, resourceId);
                        if (A002.hasValue(1)) {
                            cr8.A01 = AnonymousClass1YT.A01(context2, A002, 1);
                        }
                    }
                    bii2.A0F.A01(context2, cr8);
                    Class<C23519Bii> cls = C23519Bii.class;
                    int A025 = AnonymousClass1ZA.A02(context2, cls.getCanonicalName(), 2130969118);
                    BE7.A1C(bii2, A002.getColor(7, AnonymousClass1Z2.A05(AnonymousClass1Z2.A06(A025, 153), AnonymousClass1Z2.A06(AnonymousClass1ZA.A02(context2, cls.getCanonicalName(), 16842801), 229))));
                    bii2.A0G(ColorStateList.valueOf(AnonymousClass1ZA.A02(context2, cls.getCanonicalName(), 2130969148)));
                    bii2.A09 = A002.getDimensionPixelSize(2, 0);
                    bii2.A08 = A002.getDimensionPixelSize(4, 0);
                    bii2.A07 = A002.getDimensionPixelSize(5, 0);
                    bii2.A05 = A002.getDimensionPixelSize(3, 0);
                    A002.recycle();
                    list.add(bii2);
                    if (isAttachedToWindow() && (A022 = AnonymousClass1YU.A02(this)) != null) {
                        int[] A1W = C108945cZ.A1W();
                        A022.getLocationOnScreen(A1W);
                        bii2.A06 = A1W[0];
                        A022.getWindowVisibleDisplayFrame(bii2.A0D);
                        A022.addOnLayoutChangeListener(bii2.A0E);
                    }
                }
                if (list.size() != 1) {
                    i = 1;
                }
                for (C27801Xq r2 : list) {
                    r2.A01.A04 = (float) i;
                    r2.invalidateSelf();
                }
                for (AnonymousClass5WZ r42 : this.A0o) {
                    Iterator it = this.A0T.iterator();
                    while (it.hasNext()) {
                        float A042 = AnonymousClass000.A04(it.next());
                        AnonymousClass47H r1 = ((C91854gM) r42).A00;
                        if (r1.A0D) {
                            r1.A0D = false;
                        } else {
                            r1.A4i(100.0f - A042);
                        }
                    }
                }
                postInvalidate();
                return;
            }
            return;
        }
        throw AnonymousClass000.A0k("At least one value must be set");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        BEA.A10(this.A0P, this.A0j, this);
        BEA.A10(this.A0O, this.A0g, this);
        BEA.A10(this.A0N, this.A0i, this);
        BEA.A10(this.A0M, this.A0f, this);
        for (Drawable drawable : this.A0p) {
            if (drawable.isStateful()) {
                AnonymousClass000.A17(drawable, this);
            }
        }
        C27801Xq r1 = this.A0m;
        if (r1.isStateful()) {
            AnonymousClass000.A17(r1, this);
        }
        Paint paint = this.A0h;
        BEA.A10(this.A0L, paint, this);
        paint.setAlpha(63);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (C23519Bii bii : this.A0p) {
            ViewGroup A022 = AnonymousClass1YU.A02(this);
            if (A022 != null) {
                int[] A1W = C108945cZ.A1W();
                A022.getLocationOnScreen(A1W);
                bii.A06 = BE6.A0I(A1W);
                A022.getWindowVisibleDisplayFrame(bii.A0D);
                A022.addOnLayoutChangeListener(bii.A0E);
            }
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        int i2;
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.A03 = -1;
            this.A0n.A1k(this.A06);
            return;
        }
        int i3 = Integer.MAX_VALUE;
        if (i != 1) {
            i3 = Integer.MIN_VALUE;
            if (i != 2) {
                if (i != 17) {
                    if (i == 66) {
                        i2 = Integer.MIN_VALUE;
                        if (getLayoutDirection() == 1) {
                            i2 = Integer.MAX_VALUE;
                        }
                    }
                    this.A0n.A1l(this.A06);
                }
                i2 = Integer.MAX_VALUE;
                if (getLayoutDirection() == 1) {
                    i2 = -2147483647;
                }
                A0C(i2);
                this.A0n.A1l(this.A06);
            }
        }
        A0C(i3);
        this.A0n.A1l(this.A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r0 != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0074, code lost:
        if (r6 != 81) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0080, code lost:
        if (r6 != 66) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0087, code lost:
        if (getLayoutDirection() == 1) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0092, code lost:
        if (getLayoutDirection() == 1) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0094, code lost:
        r2 = -r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r6, android.view.KeyEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.isEnabled()
            if (r0 == 0) goto L_0x002f
            java.util.ArrayList r0 = r5.A0T
            int r0 = r0.size()
            r4 = 0
            r3 = 1
            if (r0 != r3) goto L_0x0012
            r5.A03 = r4
        L_0x0012:
            int r0 = r5.A03
            r1 = -1
            if (r0 != r1) goto L_0x0053
            r0 = 61
            r2 = -1
            if (r6 == r0) goto L_0x0034
            r0 = 66
            if (r6 == r0) goto L_0x00cd
            r0 = 81
            if (r6 == r0) goto L_0x00c9
            r0 = 69
            if (r6 == r0) goto L_0x00dc
            r0 = 70
            if (r6 == r0) goto L_0x00c9
            switch(r6) {
                case 21: goto L_0x00d5;
                case 22: goto L_0x00c0;
                case 23: goto L_0x00cd;
                default: goto L_0x002f;
            }
        L_0x002f:
            boolean r0 = super.onKeyDown(r6, r7)
            return r0
        L_0x0034:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L_0x0046
            boolean r0 = r5.A0C(r3)
        L_0x003e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L_0x002f
            goto L_0x00e3
        L_0x0046:
            boolean r0 = r7.isShiftPressed()
            if (r0 == 0) goto L_0x0051
            boolean r0 = r5.A0C(r1)
            goto L_0x003e
        L_0x0051:
            r0 = 0
            goto L_0x003e
        L_0x0053:
            boolean r2 = r5.A0V
            boolean r0 = r7.isLongPress()
            r2 = r2 | r0
            r5.A0V = r2
            if (r2 == 0) goto L_0x00b6
            float r2 = A01(r5)
        L_0x0062:
            r0 = 21
            if (r6 == r0) goto L_0x0083
            r0 = 22
            if (r6 == r0) goto L_0x008e
            r0 = 69
            if (r6 == r0) goto L_0x0096
            r0 = 70
            if (r6 == r0) goto L_0x0089
            r0 = 81
            if (r6 == r0) goto L_0x0089
        L_0x0076:
            r0 = 23
            if (r6 == r0) goto L_0x00ff
            r0 = 61
            if (r6 == r0) goto L_0x00e8
            r0 = 66
            if (r6 == r0) goto L_0x00ff
            goto L_0x002f
        L_0x0083:
            int r0 = r5.getLayoutDirection()
            if (r0 != r3) goto L_0x0094
        L_0x0089:
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x009b
        L_0x008e:
            int r0 = r5.getLayoutDirection()
            if (r0 != r3) goto L_0x0089
        L_0x0094:
            float r2 = -r2
            goto L_0x0089
        L_0x0096:
            float r0 = -r2
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
        L_0x009b:
            if (r2 == 0) goto L_0x0076
            java.util.ArrayList r1 = r5.A0T
            int r0 = r5.A03
            float r1 = X.BE9.A04(r1, r0)
            float r0 = r2.floatValue()
            float r1 = r1 + r0
            int r0 = r5.A03
            boolean r0 = A0D(r5, r1, r0)
            if (r0 == 0) goto L_0x0104
            A08(r5)
            goto L_0x0101
        L_0x00b6:
            float r2 = r5.A00
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0062
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0062
        L_0x00c0:
            r2 = 1
            int r0 = r5.getLayoutDirection()
            if (r0 != r3) goto L_0x00dc
            r2 = -1
            goto L_0x00dc
        L_0x00c9:
            r5.A0C(r3)
            goto L_0x00df
        L_0x00cd:
            int r0 = r5.A06
            r5.A03 = r0
            r5.postInvalidate()
            goto L_0x00df
        L_0x00d5:
            int r0 = r5.getLayoutDirection()
            if (r0 != r3) goto L_0x00dc
            r2 = 1
        L_0x00dc:
            r5.A0C(r2)
        L_0x00df:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
        L_0x00e3:
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00e8:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r5.A0C(r3)
            return r0
        L_0x00f3:
            boolean r0 = r7.isShiftPressed()
            if (r0 == 0) goto L_0x00fe
            boolean r0 = r5.A0C(r1)
            return r0
        L_0x00fe:
            return r4
        L_0x00ff:
            r5.A03 = r1
        L_0x0101:
            r5.postInvalidate()
        L_0x0104:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.Slider.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, X.BHJ, android.os.Parcelable] */
    public Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.A01 = this.A01;
        baseSavedState.A02 = this.A02;
        baseSavedState.A03 = C17880vN.A10(this.A0T);
        baseSavedState.A00 = this.A00;
        baseSavedState.A04 = hasFocus();
        return baseSavedState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r1 != 3) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.isEnabled()
            r3 = 0
            if (r0 == 0) goto L_0x010f
            float r4 = r6.getX()
            int r0 = r5.A0G
            float r0 = (float) r0
            float r1 = r4 - r0
            int r0 = r5.A0H
            float r0 = (float) r0
            float r1 = r1 / r0
            r5.A0b = r1
            r0 = 0
            float r1 = java.lang.Math.max(r0, r1)
            r5.A0b = r1
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r0, r1)
            r5.A0b = r0
            int r1 = r6.getActionMasked()
            r2 = 1
            if (r1 == 0) goto L_0x00e0
            if (r1 == r2) goto L_0x0058
            r0 = 2
            if (r1 == r0) goto L_0x0040
            r0 = 3
            if (r1 == r0) goto L_0x0058
        L_0x0034:
            boolean r0 = r5.A0X
            r5.setPressed(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r6)
            r5.A0c = r0
            return r2
        L_0x0040:
            boolean r0 = r5.A0X
            if (r0 != 0) goto L_0x00c6
            boolean r0 = r5.A0A()
            if (r0 == 0) goto L_0x00bc
            float r0 = r5.A0a
            float r1 = X.C108945cZ.A00(r4, r0)
            int r0 = r5.A0e
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bc
            return r3
        L_0x0058:
            r5.A0X = r3
            android.view.MotionEvent r0 = r5.A0c
            if (r0 == 0) goto L_0x0096
            int r0 = r0.getActionMasked()
            if (r0 != 0) goto L_0x0096
            android.view.MotionEvent r0 = r5.A0c
            float r1 = r0.getX()
            float r0 = r6.getX()
            float r1 = X.C108945cZ.A00(r1, r0)
            int r0 = r5.A0e
            float r3 = (float) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0096
            android.view.MotionEvent r0 = r5.A0c
            float r1 = r0.getY()
            float r0 = r6.getY()
            float r0 = X.C108945cZ.A00(r1, r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0096
            int r1 = r5.A03
            r0 = -1
            if (r1 != r0) goto L_0x0093
            r0 = 0
            r5.A03 = r0
        L_0x0093:
            r5.A04()
        L_0x0096:
            int r0 = r5.A03
            r3 = -1
            if (r0 == r3) goto L_0x00db
            float r1 = r5.getValueOfTouchPosition()
            int r0 = r5.A03
            A0D(r5, r1, r0)
            r5.A03 = r3
            java.util.List r0 = r5.A0q
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00db
            r1.next()
            java.lang.String r0 = "onStopTrackingTouch"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00bc:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            r5.A04()
        L_0x00c6:
            int r1 = r5.A03
            r0 = -1
            if (r1 != r0) goto L_0x00cd
            r5.A03 = r3
        L_0x00cd:
            r5.A0X = r2
            float r1 = r5.getValueOfTouchPosition()
            int r0 = r5.A03
            A0D(r5, r1, r0)
            A08(r5)
        L_0x00db:
            r5.invalidate()
            goto L_0x0034
        L_0x00e0:
            r5.A0a = r4
            boolean r0 = r5.A0A()
            if (r0 != 0) goto L_0x0034
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            int r1 = r5.A03
            r0 = -1
            if (r1 != r0) goto L_0x00f6
            r5.A03 = r3
        L_0x00f6:
            r5.requestFocus()
            r5.A0X = r2
            float r1 = r5.getValueOfTouchPosition()
            int r0 = r5.A03
            A0D(r5, r1, r0)
            A08(r5)
            r5.invalidate()
            r5.A04()
            goto L_0x0034
        L_0x010f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.Slider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onVisibilityChanged(View view, int i) {
        ViewGroup A022;
        super.onVisibilityChanged(view, i);
        if (i != 0 && (A022 = AnonymousClass1YU.A02(this)) != null) {
            ViewOverlay overlay = A022.getOverlay();
            for (Drawable remove : this.A0p) {
                overlay.remove(remove);
            }
        }
    }

    public void setCustomThumbDrawable$BaseSlider(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        A07(newDrawable);
        this.A0Q = newDrawable;
        this.A0U.clear();
        postInvalidate();
    }

    /* renamed from: setEnabled$BaseSlider */
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        int i = 2;
        if (z) {
            i = 0;
        }
        setLayerType(i, (Paint) null);
    }

    /* renamed from: setHaloRadiusResource$BaseSlider */
    public void setHaloRadiusResource(int i) {
        setHaloRadius(AnonymousClass3Ma.A02(this, i));
    }

    /* renamed from: setThumbElevationResource$BaseSlider */
    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    /* renamed from: setThumbRadiusResource$BaseSlider */
    public void setThumbRadiusResource(int i) {
        setThumbRadius(AnonymousClass3Ma.A02(this, i));
    }

    /* renamed from: setTickTintList$BaseSlider */
    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    /* renamed from: setTrackTintList$BaseSlider */
    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValues(Float... fArr) {
        ArrayList A13 = AnonymousClass000.A13();
        Collections.addAll(A13, fArr);
        setValuesInternal(A13);
    }

    public void setActiveThumbIndex(int i) {
        this.A03 = i;
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable$BaseSlider(i);
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(E2S e2s) {
        this.A0S = e2s;
    }

    public void setLabelFormatter$BaseSlider(E2S e2s) {
        this.A0S = e2s;
    }

    public Slider(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        setCustomThumbDrawable$BaseSlider(drawable);
    }

    public void setCustomThumbDrawable$BaseSlider(int i) {
        setCustomThumbDrawable$BaseSlider(getResources().getDrawable(i));
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        int length = iArr.length;
        Drawable[] drawableArr = new Drawable[length];
        for (int i = 0; i < length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    public void setValues(List list) {
        setValuesInternal(C17880vN.A10(list));
    }

    public Slider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971300);
    }
}
