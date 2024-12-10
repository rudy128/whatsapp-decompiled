package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior;

/* renamed from: X.1YQ  reason: invalid class name */
public abstract class AnonymousClass1YQ extends AnonymousClass1YN implements AnonymousClass1Xp, AnonymousClass1YO, AnonymousClass1YP {
    public int A00;
    public int A01;
    public ColorStateList A02;
    public PorterDuff.Mode A03;
    public boolean A04;
    public int A05;
    public int A06;
    public int A07;
    public ColorStateList A08;
    public ColorStateList A09;
    public PorterDuff.Mode A0A;
    public AnonymousClass1YV A0B;
    public final Rect A0C = new Rect();
    public final C28101Yw A0D;
    public final Rect A0E = new Rect();
    public final AnonymousClass03V A0F;

    public void setSize(int i) {
        this.A06 = 0;
        if (i != this.A01) {
            this.A01 = i;
            requestLayout();
        }
    }

    public static int A00(AnonymousClass1YQ r4, int i) {
        int i2 = r4.A06;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = r4.getResources();
        if (i != -1) {
            int i3 = 2131166418;
            if (i != 1) {
                i3 = 2131166419;
            }
            return resources.getDimensionPixelSize(i3);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return A00(r4, 1);
        } else {
            return A00(r4, 0);
        }
    }

    private AnonymousClass1YV getImpl() {
        AnonymousClass1YV r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        int[] iArr = AnonymousClass1YV.A0R;
        AnonymousClass1YV r02 = new AnonymousClass1YV(this, new C27891Ya(this));
        this.A0B = r02;
        return r02;
    }

    public C41501wV getBehavior() {
        return new FloatingActionButton$BaseBehavior();
    }

    public int getExpandedComponentIdHint() {
        return this.A0D.A00;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.A09;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public int getSizeDimension() {
        return A00(this, this.A01);
    }

    public void onMeasure(int i, int i2) {
        int A002 = A00(this, this.A01);
        this.A00 = (A002 - this.A07) / 2;
        getImpl().A04();
        int min = Math.min(View.resolveSize(A002, i), View.resolveSize(A002, i2));
        Rect rect = this.A0C;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof BL6)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        BL6 bl6 = (BL6) parcelable;
        super.onRestoreInstanceState(bl6.A00);
        C28101Yw r2 = this.A0D;
        Object obj = bl6.A00.get("expandableWidgetHelper");
        C28111Yx.A02(obj);
        r2.A01((Bundle) obj);
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.A02 != colorStateList) {
            this.A02 = colorStateList;
            AnonymousClass1YV impl = getImpl();
            C27801Xq r0 = impl.A0D;
            if (r0 != null) {
                r0.setTintList(colorStateList);
            }
            AnonymousClass1ZB r2 = impl.A0C;
            if (r2 != null) {
                if (colorStateList != null) {
                    r2.A03 = colorStateList.getColorForState(r2.getState(), r2.A03);
                }
                r2.A06 = colorStateList;
                r2.A08 = true;
                r2.invalidateSelf();
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.A03 != mode) {
            this.A03 = mode;
            C27801Xq r0 = getImpl().A0D;
            if (r0 != null) {
                r0.setTintMode(mode);
            }
        }
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.A06) {
            this.A06 = i;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.A0D.A00 = i;
    }

    public void setImageResource(int i) {
        this.A0F.A03(i);
        A01();
    }

    public void setMaxImageSize(int i) {
        this.A07 = i;
        AnonymousClass1YV impl = getImpl();
        if (impl.A05 != i) {
            impl.A05 = i;
            float f = impl.A02;
            impl.A02 = f;
            Matrix matrix = impl.A0H;
            AnonymousClass1YV.A03(matrix, impl, f);
            impl.A0I.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.A09 != colorStateList) {
            this.A09 = colorStateList;
            getImpl().A07(this.A09);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.A08 != colorStateList) {
            this.A08 = colorStateList;
            A01();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.A0A != mode) {
            this.A0A = mode;
            A01();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.A04 != z) {
            this.A04 = z;
            getImpl().A04();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1YQ(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            r19 = this;
            r1 = 2132084544(0x7f150740, float:1.9809262E38)
            r0 = r20
            r14 = r21
            r2 = r22
            android.content.Context r0 = X.C27771Xm.A00(r0, r14, r2, r1)
            r3 = r19
            r3.<init>(r0, r14, r2)
            int r0 = r3.getVisibility()
            r3.A00 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.A0C = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.A0E = r0
            android.content.Context r13 = r3.getContext()
            int[] r15 = X.C27781Xn.A0F
            r10 = 0
            int[] r0 = new int[r10]
            r16 = r0
            r17 = r2
            r18 = r1
            android.content.res.TypedArray r9 = X.C27791Xo.A00(r13, r14, r15, r16, r17, r18)
            r0 = 2
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r13, r9, r0)
            r3.A02 = r0
            r0 = 3
            r5 = -1
            int r4 = r9.getInt(r0, r5)
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.AnonymousClass1YU.A01(r0, r4)
            r3.A03 = r0
            r0 = 13
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r13, r9, r0)
            r3.A09 = r0
            r0 = 8
            int r0 = r9.getInt(r0, r5)
            r3.A01 = r0
            r0 = 7
            int r0 = r9.getDimensionPixelSize(r0, r10)
            r3.A06 = r0
            r0 = 4
            int r0 = r9.getDimensionPixelSize(r0, r10)
            r3.A05 = r0
            r0 = 5
            r4 = 0
            float r8 = r9.getDimension(r0, r4)
            r0 = 10
            float r7 = r9.getDimension(r0, r4)
            r0 = 12
            float r6 = r9.getDimension(r0, r4)
            r0 = 17
            boolean r0 = r9.getBoolean(r0, r10)
            r3.A04 = r0
            android.content.res.Resources r4 = r3.getResources()
            r0 = 2131167869(0x7f070a7d, float:1.7950024E38)
            int r17 = r4.getDimensionPixelSize(r0)
            r0 = 11
            int r0 = r9.getDimensionPixelSize(r0, r10)
            r3.setMaxImageSize(r0)
            r0 = 16
            X.1Yk r16 = X.C27991Yk.A01(r13, r9, r0)
            r0 = 9
            X.1Yk r5 = X.C27991Yk.A01(r13, r9, r0)
            X.1Yn r12 = X.C28011Ym.A0C
            int[] r0 = X.C27781Xn.A0T
            android.content.res.TypedArray r4 = r13.obtainStyledAttributes(r14, r0, r2, r1)
            int r1 = r4.getResourceId(r10, r10)
            r11 = 1
            int r0 = r4.getResourceId(r11, r10)
            r4.recycle()
            X.1Yp r0 = X.C28011Ym.A02(r13, r12, r1, r0)
            X.1Ym r1 = new X.1Ym
            r1.<init>(r0)
            r0 = 6
            boolean r4 = r9.getBoolean(r0, r10)
            boolean r0 = r9.getBoolean(r10, r11)
            r3.setEnabled(r0)
            r9.recycle()
            X.03V r0 = new X.03V
            r0.<init>(r3)
            r3.A0F = r0
            r0.A04(r14, r2)
            X.1Yw r0 = new X.1Yw
            r0.<init>(r3)
            r3.A0D = r0
            X.1YV r0 = r3.getImpl()
            r0.A09(r1)
            X.1YV r9 = r3.getImpl()
            android.content.res.ColorStateList r2 = r3.A02
            android.graphics.PorterDuff$Mode r10 = r3.A03
            android.content.res.ColorStateList r0 = r3.A09
            r18 = r0
            int r14 = r3.A05
            X.1Ym r1 = r9.A0E
            X.C28111Yx.A02(r1)
            X.1Yy r0 = new X.1Yy
            r0.<init>((X.C28011Ym) r1)
            r9.A0D = r0
            r0.setTintList(r2)
            if (r10 == 0) goto L_0x010d
            X.1Xq r0 = r9.A0D
            r0.setTintMode(r10)
        L_0x010d:
            X.1Xq r10 = r9.A0D
            X.1YQ r1 = r9.A0I
            android.content.Context r0 = r1.getContext()
            r10.A0E(r0)
            r10 = 0
            if (r14 <= 0) goto L_0x01f7
            android.content.Context r15 = r1.getContext()
            X.1Ym r0 = r9.A0E
            X.C28111Yx.A02(r0)
            X.1ZB r11 = new X.1ZB
            r11.<init>(r0)
            r0 = 2131100360(0x7f0602c8, float:1.78131E38)
            int r13 = X.C19740yt.A00(r15, r0)
            r0 = 2131100359(0x7f0602c7, float:1.7813097E38)
            int r12 = X.C19740yt.A00(r15, r0)
            r0 = 2131100357(0x7f0602c5, float:1.7813093E38)
            int r1 = X.C19740yt.A00(r15, r0)
            r0 = 2131100358(0x7f0602c6, float:1.7813095E38)
            int r0 = X.C19740yt.A00(r15, r0)
            r11.A05 = r13
            r11.A04 = r12
            r11.A02 = r1
            r11.A01 = r0
            float r12 = (float) r14
            float r0 = r11.A00
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0165
            r11.A00 = r12
            android.graphics.Paint r1 = r11.A09
            r0 = 1068149139(0x3faaa993, float:1.3333)
            float r12 = r12 * r0
            r1.setStrokeWidth(r12)
            r0 = 1
            r11.A08 = r0
            r11.invalidateSelf()
        L_0x0165:
            if (r2 == 0) goto L_0x0173
            int[] r1 = r11.getState()
            int r0 = r11.A03
            int r0 = r2.getColorForState(r1, r0)
            r11.A03 = r0
        L_0x0173:
            r11.A06 = r2
            r2 = 1
            r11.A08 = r2
            r11.invalidateSelf()
            r9.A0C = r11
            r0 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r0]
            r0 = 0
            r1[r0] = r11
            X.1Xq r0 = r9.A0D
            X.C28111Yx.A02(r0)
            r1[r2] = r0
            android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
            r2.<init>(r1)
        L_0x018f:
            android.content.res.ColorStateList r1 = X.AnonymousClass1ZD.A02(r18)
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            r0.<init>(r1, r2, r10)
            r9.A09 = r0
            r9.A08 = r0
            X.1YV r1 = r3.getImpl()
            r0 = r17
            r1.A06 = r0
            X.1YV r2 = r3.getImpl()
            float r0 = r2.A00
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x01b7
            r2.A00 = r8
            float r1 = r2.A01
            float r0 = r2.A03
            r2.A06(r8, r1, r0)
        L_0x01b7:
            X.1YV r2 = r3.getImpl()
            float r0 = r2.A01
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x01ca
            r2.A01 = r7
            float r1 = r2.A00
            float r0 = r2.A03
            r2.A06(r1, r7, r0)
        L_0x01ca:
            X.1YV r2 = r3.getImpl()
            float r0 = r2.A03
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01dd
            r2.A03 = r6
            float r1 = r2.A00
            float r0 = r2.A01
            r2.A06(r1, r0, r6)
        L_0x01dd:
            X.1YV r1 = r3.getImpl()
            r0 = r16
            r1.A0B = r0
            X.1YV r0 = r3.getImpl()
            r0.A0A = r5
            X.1YV r0 = r3.getImpl()
            r0.A0F = r4
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            r3.setScaleType(r0)
            return
        L_0x01f7:
            r9.A0C = r10
            X.1Xq r2 = r9.A0D
            goto L_0x018f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YQ.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void A01() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.A08;
            if (colorStateList == null) {
                C27831Xu.A09(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.A0A;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(AnonymousClass01X.A00(mode, colorForState));
        }
    }

    public void A04(boolean z) {
        AnimatorSet A012;
        AnonymousClass1YV impl = getImpl();
        AnonymousClass1YQ r3 = impl.A0I;
        int visibility = r3.getVisibility();
        int i = impl.A04;
        if (visibility == 0) {
            if (i == 1) {
                return;
            }
        } else if (i != 2) {
            return;
        }
        Animator animator = impl.A07;
        if (animator != null) {
            animator.cancel();
        }
        if (!r3.isLaidOut() || r3.isInEditMode()) {
            int i2 = 4;
            if (z) {
                i2 = 8;
            }
            r3.A03(i2, z);
            return;
        }
        C27991Yk r1 = impl.A0A;
        if (r1 != null) {
            A012 = AnonymousClass1YV.A00(r1, impl, 0.0f, 0.0f, 0.0f);
        } else {
            A012 = AnonymousClass1YV.A01(impl, 0.0f, 0.4f, 0.4f, 2130970535, 2130970546);
        }
        A012.addListener(new C450125q(impl, z));
        A012.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r4.isInEditMode() != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(boolean r12) {
        /*
            r11 = this;
            X.1YV r5 = r11.getImpl()
            X.1YQ r4 = r5.A0I
            int r2 = r4.getVisibility()
            r0 = 1
            int r1 = r5.A04
            if (r2 == 0) goto L_0x0013
            r0 = 2
            if (r1 != r0) goto L_0x0016
            return
        L_0x0013:
            if (r1 == r0) goto L_0x0016
            return
        L_0x0016:
            android.animation.Animator r0 = r5.A07
            if (r0 == 0) goto L_0x001d
            r0.cancel()
        L_0x001d:
            X.1Yk r0 = r5.A0B
            r3 = 0
            r2 = 0
            if (r0 != 0) goto L_0x0024
            r2 = 1
        L_0x0024:
            boolean r0 = r4.isLaidOut()
            if (r0 == 0) goto L_0x0031
            boolean r1 = r4.isInEditMode()
            r0 = 1
            if (r1 == 0) goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0082
            int r0 = r4.getVisibility()
            if (r0 == 0) goto L_0x0061
            r1 = 0
            r4.setAlpha(r1)
            r0 = 0
            if (r2 == 0) goto L_0x0046
            r0 = 1053609165(0x3ecccccd, float:0.4)
        L_0x0046:
            r4.setScaleY(r0)
            r0 = 0
            if (r2 == 0) goto L_0x004f
            r0 = 1053609165(0x3ecccccd, float:0.4)
        L_0x004f:
            r4.setScaleX(r0)
            if (r2 == 0) goto L_0x0057
            r1 = 1053609165(0x3ecccccd, float:0.4)
        L_0x0057:
            r5.A02 = r1
            android.graphics.Matrix r0 = r5.A0H
            X.AnonymousClass1YV.A03(r0, r5, r1)
            r4.setImageMatrix(r0)
        L_0x0061:
            X.1Yk r0 = r5.A0B
            if (r0 == 0) goto L_0x0075
            android.animation.AnimatorSet r1 = X.AnonymousClass1YV.A00(r0, r5, r6, r6, r6)
        L_0x0069:
            X.25p r0 = new X.25p
            r0.<init>(r5, r12)
            r1.addListener(r0)
            r1.start()
            return
        L_0x0075:
            r9 = 2130970532(0x7f0407a4, float:1.7549777E38)
            r10 = 2130970548(0x7f0407b4, float:1.754981E38)
            r8 = r6
            r7 = r6
            android.animation.AnimatorSet r1 = X.AnonymousClass1YV.A01(r5, r6, r7, r8, r9, r10)
            goto L_0x0069
        L_0x0082:
            r4.A03(r3, r12)
            r4.setAlpha(r6)
            r4.setScaleY(r6)
            r4.setScaleX(r6)
            r5.A02 = r6
            android.graphics.Matrix r0 = r5.A0H
            X.AnonymousClass1YV.A03(r0, r5, r6)
            r4.setImageMatrix(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YQ.A05(boolean):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass1YV impl = getImpl();
        getDrawableState();
        impl.A05();
    }

    public ColorStateList getBackgroundTintList() {
        return this.A02;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.A03;
    }

    public float getCompatElevation() {
        return getImpl().A0I.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().A01;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().A03;
    }

    public Drawable getContentBackground() {
        return getImpl().A08;
    }

    public int getCustomSize() {
        return this.A06;
    }

    public C27991Yk getHideMotionSpec() {
        return getImpl().A0A;
    }

    public ColorStateList getRippleColorStateList() {
        return this.A09;
    }

    public C28011Ym getShapeAppearanceModel() {
        C28011Ym r0 = getImpl().A0E;
        C28111Yx.A02(r0);
        return r0;
    }

    public C27991Yk getShowMotionSpec() {
        return getImpl().A0B;
    }

    public int getSize() {
        return this.A01;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.A02;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.A03;
    }

    public ColorStateList getSupportImageTintList() {
        return this.A08;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.A0A;
    }

    public boolean getUseCompatPadding() {
        return this.A04;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass1YV impl = getImpl();
        C27801Xq r1 = impl.A0D;
        if (r1 != null) {
            C27811Xs.A03(impl.A0I, r1);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().A0I.getViewTreeObserver();
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        BL6 bl6 = new BL6(onSaveInstanceState);
        bl6.A00.put("expandableWidgetHelper", this.A0D.A00());
        return bl6;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.A0E;
            if (isLaidOut()) {
                rect.set(0, 0, getWidth(), getHeight());
                int i = rect.left;
                Rect rect2 = this.A0C;
                rect.left = i + rect2.left;
                rect.top += rect2.top;
                rect.right -= rect2.right;
                rect.bottom -= rect2.bottom;
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCompatElevation(float f) {
        AnonymousClass1YV impl = getImpl();
        if (impl.A00 != f) {
            impl.A00 = f;
            impl.A06(f, impl.A01, impl.A03);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        AnonymousClass1YV impl = getImpl();
        if (impl.A01 != f) {
            impl.A01 = f;
            impl.A06(impl.A00, f, impl.A03);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        AnonymousClass1YV impl = getImpl();
        if (impl.A03 != f) {
            impl.A03 = f;
            impl.A06(impl.A00, impl.A01, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C27801Xq r0 = getImpl().A0D;
        if (r0 != null) {
            r0.A0C(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().A0F) {
            getImpl().A0F = z;
            requestLayout();
        }
    }

    public void setHideMotionSpec(C27991Yk r2) {
        getImpl().A0A = r2;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C27991Yk.A00(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            AnonymousClass1YV impl = getImpl();
            float f = impl.A02;
            impl.A02 = f;
            Matrix matrix = impl.A0H;
            AnonymousClass1YV.A03(matrix, impl, f);
            impl.A0I.setImageMatrix(matrix);
            if (this.A08 != null) {
                A01();
            }
        }
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl();
    }

    public void setShadowPaddingEnabled(boolean z) {
        AnonymousClass1YV impl = getImpl();
        impl.A0G = z;
        impl.A04();
    }

    public void setShapeAppearanceModel(C28011Ym r2) {
        getImpl().A09(r2);
    }

    public void setShowMotionSpec(C27991Yk r2) {
        getImpl().A0B = r2;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C27991Yk.A00(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }
}
