package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass053;
import X.AnonymousClass1HF;
import X.C002801g;
import X.C005902p;
import X.C007003d;
import X.C007103e;
import X.C27831Xu;
import X.C29261bv;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;

public class SwitchCompat extends CompoundButton {
    public static final Property A0f = new AnonymousClass053();
    public static final int[] A0g = {16842912};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public ObjectAnimator A08;
    public ColorStateList A09;
    public ColorStateList A0A;
    public PorterDuff.Mode A0B;
    public PorterDuff.Mode A0C;
    public Drawable A0D;
    public Drawable A0E;
    public TransformationMethod A0F;
    public VelocityTracker A0G;
    public CharSequence A0H;
    public CharSequence A0I;
    public float A0J;
    public float A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public ColorStateList A0P;
    public Layout A0Q;
    public Layout A0R;
    public C007003d A0S;
    public CharSequence A0T;
    public CharSequence A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public final Rect A0c;
    public final TextPaint A0d;
    public final C007103e A0e;
    public int mSwitchWidth;
    public float mThumbPosition;

    /* JADX WARNING: type inference failed for: r1v10, types: [X.0RR, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchCompat(android.content.Context r15, android.util.AttributeSet r16, int r17) {
        /*
            r14 = this;
            r11 = r14
            r8 = r15
            r10 = r16
            r13 = r17
            r14.<init>(r15, r10, r13)
            r1 = 0
            r14.A0P = r1
            r14.A0B = r1
            r4 = 0
            r14.A0W = r4
            r14.A0X = r4
            r14.A0A = r1
            r14.A0C = r1
            r14.A0Y = r4
            r14.A0Z = r4
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r14.A0G = r0
            r5 = 1
            r14.A0V = r5
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r14.A0c = r0
            X.AnonymousClass000.A1A(r14)
            android.text.TextPaint r2 = new android.text.TextPaint
            r2.<init>(r5)
            r14.A0d = r2
            android.content.res.Resources r0 = r14.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r2.density = r0
            int[] r12 = X.C002501d.A0M
            X.01c r3 = X.C002401c.A00(r15, r10, r12, r13, r4)
            android.content.res.TypedArray r9 = r3.A02
            X.AnonymousClass1HF.A0K(r8, r9, r10, r11, r12, r13)
            r0 = 2
            android.graphics.drawable.Drawable r0 = r3.A03(r0)
            r14.A0D = r0
            if (r0 == 0) goto L_0x0058
            r0.setCallback(r14)
        L_0x0058:
            r0 = 11
            android.graphics.drawable.Drawable r0 = r3.A03(r0)
            r14.A0E = r0
            if (r0 == 0) goto L_0x0065
            r0.setCallback(r14)
        L_0x0065:
            java.lang.CharSequence r0 = r9.getText(r4)
            r14.setTextOnInternal(r0)
            java.lang.CharSequence r0 = r9.getText(r5)
            r14.setTextOffInternal(r0)
            r0 = 3
            boolean r0 = r9.getBoolean(r0, r5)
            r14.A0a = r0
            r0 = 8
            int r0 = r9.getDimensionPixelSize(r0, r4)
            r14.A0O = r0
            r0 = 5
            int r0 = r9.getDimensionPixelSize(r0, r4)
            r14.A03 = r0
            r0 = 6
            int r0 = r9.getDimensionPixelSize(r0, r4)
            r14.A0M = r0
            r0 = 4
            boolean r0 = r9.getBoolean(r0, r4)
            r14.A0b = r0
            r0 = 9
            android.content.res.ColorStateList r0 = r3.A01(r0)
            if (r0 == 0) goto L_0x00a3
            r14.A0P = r0
            r14.A0W = r5
        L_0x00a3:
            r0 = 10
            r6 = -1
            int r0 = r9.getInt(r0, r6)
            android.graphics.PorterDuff$Mode r2 = X.C005902p.A00(r1, r0)
            android.graphics.PorterDuff$Mode r0 = r14.A0B
            if (r0 == r2) goto L_0x00b6
            r14.A0B = r2
            r14.A0X = r5
        L_0x00b6:
            boolean r0 = r14.A0W
            if (r0 != 0) goto L_0x00be
            boolean r0 = r14.A0X
            if (r0 == 0) goto L_0x00c1
        L_0x00be:
            r14.A01()
        L_0x00c1:
            r0 = 12
            android.content.res.ColorStateList r0 = r3.A01(r0)
            if (r0 == 0) goto L_0x00cd
            r14.A0A = r0
            r14.A0Y = r5
        L_0x00cd:
            r0 = 13
            int r0 = r9.getInt(r0, r6)
            android.graphics.PorterDuff$Mode r1 = X.C005902p.A00(r1, r0)
            android.graphics.PorterDuff$Mode r0 = r14.A0C
            if (r0 == r1) goto L_0x00df
            r14.A0C = r1
            r14.A0Z = r5
        L_0x00df:
            boolean r0 = r14.A0Y
            if (r0 != 0) goto L_0x00e7
            boolean r0 = r14.A0Z
            if (r0 == 0) goto L_0x00ea
        L_0x00e7:
            r14.A02()
        L_0x00ea:
            r0 = 7
            int r1 = r9.getResourceId(r0, r4)
            if (r1 == 0) goto L_0x0188
            int[] r0 = X.C002501d.A0N
            android.content.res.TypedArray r0 = r15.obtainStyledAttributes(r1, r0)
            X.01c r1 = new X.01c
            r1.<init>(r15, r0)
            r0 = 3
            android.content.res.ColorStateList r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x0107
            android.content.res.ColorStateList r0 = r14.getTextColors()
        L_0x0107:
            r14.A09 = r0
            android.content.res.TypedArray r2 = r1.A02
            int r0 = r2.getDimensionPixelSize(r4, r4)
            if (r0 == 0) goto L_0x0122
            float r3 = (float) r0
            android.text.TextPaint r1 = r14.A0d
            float r0 = r1.getTextSize()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0122
            r1.setTextSize(r3)
            r14.requestLayout()
        L_0x0122:
            int r1 = r2.getInt(r5, r6)
            r0 = 2
            int r7 = r2.getInt(r0, r6)
            if (r1 == r5) goto L_0x01d5
            if (r1 == r0) goto L_0x01d1
            r0 = 3
            if (r1 == r0) goto L_0x01cd
            r1 = 0
        L_0x0133:
            r6 = 0
            r5 = 0
            if (r7 <= 0) goto L_0x01c1
            if (r1 != 0) goto L_0x01bb
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r7)
        L_0x013d:
            r14.setSwitchTypeface(r0)
            if (r0 == 0) goto L_0x01b9
            int r0 = r0.getStyle()
        L_0x0146:
            r3 = r0 ^ -1
            r3 = r3 & r7
            android.text.TextPaint r1 = r14.A0d
            r0 = r3 & 1
            if (r0 == 0) goto L_0x0150
            r5 = 1
        L_0x0150:
            r1.setFakeBoldText(r5)
            r0 = r3 & 2
            if (r0 == 0) goto L_0x0159
            r6 = -1098907648(0xffffffffbe800000, float:-0.25)
        L_0x0159:
            r1.setTextSkewX(r6)
        L_0x015c:
            r0 = 14
            boolean r0 = r2.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x01b7
            android.content.Context r0 = r14.getContext()
            X.0RR r1 = new X.0RR
            r1.<init>()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            r1.A00 = r0
        L_0x0179:
            r14.A0F = r1
            java.lang.CharSequence r0 = r14.A0I
            r14.setTextOnInternal(r0)
            java.lang.CharSequence r0 = r14.A0H
            r14.setTextOffInternal(r0)
            r2.recycle()
        L_0x0188:
            X.03e r0 = new X.03e
            r0.<init>(r14)
            r14.A0e = r0
            r0.A0C(r10, r13)
            r9.recycle()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r15)
            int r0 = r1.getScaledTouchSlop()
            r14.A07 = r0
            int r0 = r1.getScaledMinimumFlingVelocity()
            r14.A00 = r0
            X.03d r0 = r14.getEmojiTextViewHelper()
            r0.A02(r10, r13)
            r14.refreshDrawableState()
            boolean r0 = r14.isChecked()
            r14.setChecked(r0)
            return
        L_0x01b7:
            r1 = 0
            goto L_0x0179
        L_0x01b9:
            r0 = 0
            goto L_0x0146
        L_0x01bb:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r1, r7)
            goto L_0x013d
        L_0x01c1:
            android.text.TextPaint r0 = r14.A0d
            r0.setFakeBoldText(r4)
            r0.setTextSkewX(r6)
            r14.setSwitchTypeface(r1)
            goto L_0x015c
        L_0x01cd:
            android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE
            goto L_0x0133
        L_0x01d1:
            android.graphics.Typeface r1 = android.graphics.Typeface.SERIF
            goto L_0x0133
        L_0x01d5:
            android.graphics.Typeface r1 = android.graphics.Typeface.SANS_SERIF
            goto L_0x0133
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static void A05(ObjectAnimator objectAnimator) {
        objectAnimator.setAutoCancel(true);
    }

    private StaticLayout A00(CharSequence charSequence) {
        int i;
        TextPaint textPaint = this.A0d;
        CharSequence charSequence2 = charSequence;
        if (charSequence != null) {
            i = (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i = 0;
        }
        return new StaticLayout(charSequence2, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void A01() {
        Drawable drawable = this.A0D;
        if (drawable == null) {
            return;
        }
        if (this.A0W || this.A0X) {
            Drawable mutate = C27831Xu.A02(drawable).mutate();
            this.A0D = mutate;
            if (this.A0W) {
                C27831Xu.A03(this.A0P, mutate);
            }
            if (this.A0X) {
                C27831Xu.A07(this.A0B, this.A0D);
            }
            if (this.A0D.isStateful()) {
                AnonymousClass000.A17(this.A0D, this);
            }
        }
    }

    private void A02() {
        Drawable drawable = this.A0E;
        if (drawable == null) {
            return;
        }
        if (this.A0Y || this.A0Z) {
            Drawable mutate = C27831Xu.A02(drawable).mutate();
            this.A0E = mutate;
            if (this.A0Y) {
                C27831Xu.A03(this.A0A, mutate);
            }
            if (this.A0Z) {
                C27831Xu.A07(this.A0C, this.A0E);
            }
            if (this.A0E.isStateful()) {
                AnonymousClass000.A17(this.A0E, this);
            }
        }
    }

    private void A03() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.A0H;
            if (charSequence == null) {
                charSequence = getResources().getString(2131898648);
            }
            AnonymousClass1HF.A0o(this, charSequence);
        }
    }

    private void A04() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.A0I;
            if (charSequence == null) {
                charSequence = getResources().getString(2131898649);
            }
            AnonymousClass1HF.A0o(this, charSequence);
        }
    }

    private C007003d getEmojiTextViewHelper() {
        C007003d r0 = this.A0S;
        if (r0 != null) {
            return r0;
        }
        C007003d r02 = new C007003d(this);
        this.A0S = r02;
        return r02;
    }

    private boolean getTargetCheckedState() {
        return AnonymousClass000.A1R((this.mThumbPosition > 0.5f ? 1 : (this.mThumbPosition == 0.5f ? 0 : -1)));
    }

    private int getThumbOffset() {
        float f;
        boolean z = C002801g.A01;
        if (getLayoutDirection() == 1) {
            f = 1.0f - this.mThumbPosition;
        } else {
            f = this.mThumbPosition;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.A0E;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.A0c;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.A0D;
        if (drawable2 != null) {
            rect = C005902p.A01(drawable2);
        } else {
            rect = C005902p.A00;
        }
        return ((((this.mSwitchWidth - this.A05) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.A0H = charSequence;
        TransformationMethod A002 = getEmojiTextViewHelper().A00(this.A0F);
        if (A002 != null) {
            charSequence = A002.getTransformation(charSequence, this);
        }
        this.A0T = charSequence;
        this.A0Q = null;
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.A0I = charSequence;
        TransformationMethod A002 = getEmojiTextViewHelper().A00(this.A0F);
        if (A002 != null) {
            charSequence = A002.getTransformation(charSequence, this);
        }
        this.A0U = charSequence;
        this.A0R = null;
    }

    public void draw(Canvas canvas) {
        Rect rect;
        Rect rect2 = this.A0c;
        int i = this.A02;
        int i2 = this.A04;
        int i3 = this.A0N;
        int i4 = this.A01;
        int thumbOffset = getThumbOffset() + i;
        Drawable drawable = this.A0D;
        if (drawable != null) {
            rect = C005902p.A01(drawable);
        } else {
            rect = C005902p.A00;
        }
        Drawable drawable2 = this.A0E;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i5 = rect2.left;
            thumbOffset += i5;
            int i6 = rect.left;
            if (i6 > i5) {
                i += i6 - i5;
            }
            int i7 = rect.top;
            int i8 = rect2.top;
            int i9 = (i7 - i8) + i2;
            if (i7 <= i8) {
                i9 = i2;
            }
            int i10 = rect.right;
            int i11 = rect2.right;
            if (i10 > i11) {
                i3 -= i10 - i11;
            }
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            int i14 = i4 - (i12 - i13);
            if (i12 <= i13) {
                i14 = i4;
            }
            this.A0E.setBounds(i, i9, i3, i14);
        }
        Drawable drawable3 = this.A0D;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.A05 + rect2.right;
            this.A0D.setBounds(i15, i2, i16, i4);
            Drawable background = getBackground();
            if (background != null) {
                C27831Xu.A0E(background, i15, i2, i16, i4);
            }
        }
        super.draw(canvas);
    }

    public int getCompoundPaddingLeft() {
        boolean z = C002801g.A01;
        boolean z2 = true;
        if (getLayoutDirection() != 1) {
            z2 = false;
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        if (!z2) {
            return compoundPaddingLeft;
        }
        int i = compoundPaddingLeft + this.mSwitchWidth;
        if (!TextUtils.isEmpty(getText())) {
            return i + this.A0M;
        }
        return i;
    }

    public int getCompoundPaddingRight() {
        boolean z = C002801g.A01;
        boolean z2 = true;
        if (getLayoutDirection() != 1) {
            z2 = false;
        }
        int compoundPaddingRight = super.getCompoundPaddingRight();
        if (z2) {
            return compoundPaddingRight;
        }
        int i = compoundPaddingRight + this.mSwitchWidth;
        if (!TextUtils.isEmpty(getText())) {
            return i + this.A0M;
        }
        return i;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0g);
        }
        return onCreateDrawableState;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.A0a) {
            if (this.A0R == null) {
                this.A0R = A00(this.A0U);
            }
            if (this.A0Q == null) {
                this.A0Q = A00(this.A0T);
            }
        }
        Rect rect = this.A0c;
        Drawable drawable = this.A0D;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.A0D.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.A0D.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.A0a) {
            i5 = Math.max(this.A0R.getWidth(), this.A0Q.getWidth()) + (this.A0O * 2);
        } else {
            i5 = 0;
        }
        this.A05 = Math.max(i5, i3);
        Drawable drawable2 = this.A0E;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.A0E.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.A0D;
        if (drawable3 != null) {
            Rect A012 = C005902p.A01(drawable3);
            i8 = Math.max(i8, A012.left);
            i9 = Math.max(i9, A012.right);
        }
        if (this.A0V) {
            i6 = Math.max(this.A03, (this.A05 * 2) + i8 + i9);
        } else {
            i6 = this.A03;
        }
        int max = Math.max(i7, i4);
        this.mSwitchWidth = i6;
        this.A0L = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if (isEnabled() == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r1 != 3) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            android.view.VelocityTracker r7 = r9.A0G
            r7.addMovement(r10)
            int r1 = r10.getActionMasked()
            r5 = 1
            if (r1 == 0) goto L_0x0100
            r6 = 2
            if (r1 == r5) goto L_0x008f
            if (r1 == r6) goto L_0x0019
            r0 = 3
            if (r1 == r0) goto L_0x008f
        L_0x0014:
            boolean r0 = super.onTouchEvent(r10)
            return r0
        L_0x0019:
            int r0 = r9.A06
            if (r0 == r5) goto L_0x005e
            if (r0 != r6) goto L_0x0014
            float r6 = r10.getX()
            int r2 = r9.getThumbScrollRange()
            float r0 = r9.A0J
            float r1 = r6 - r0
            r4 = 0
            if (r2 == 0) goto L_0x0055
            float r0 = (float) r2
            float r1 = r1 / r0
        L_0x0030:
            boolean r0 = X.C002801g.A01
            int r0 = r9.getLayoutDirection()
            if (r0 != r5) goto L_0x0039
            float r1 = -r1
        L_0x0039:
            float r3 = r9.mThumbPosition
            float r2 = r3 + r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x004e
            r2 = 0
        L_0x0044:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x004d
            r9.A0J = r6
            r9.setThumbPosition(r2)
        L_0x004d:
            return r5
        L_0x004e:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0044
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0044
        L_0x0055:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 <= 0) goto L_0x0030
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0030
        L_0x005e:
            float r4 = r10.getX()
            float r3 = r10.getY()
            float r0 = r9.A0J
            float r0 = r4 - r0
            float r2 = java.lang.Math.abs(r0)
            int r0 = r9.A07
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0081
            float r0 = r9.A0K
            float r0 = r3 - r0
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
        L_0x0081:
            r9.A06 = r6
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
            r9.A0J = r4
            r9.A0K = r3
            return r5
        L_0x008f:
            int r0 = r9.A06
            if (r0 != r6) goto L_0x00f8
            r4 = 0
            r9.A06 = r4
            int r0 = r10.getAction()
            r3 = 1
            if (r0 != r5) goto L_0x00a4
            boolean r1 = r9.isEnabled()
            r0 = 1
            if (r1 != 0) goto L_0x00a5
        L_0x00a4:
            r0 = 0
        L_0x00a5:
            boolean r2 = r9.isChecked()
            if (r0 == 0) goto L_0x00f6
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            float r6 = r7.getXVelocity()
            float r1 = java.lang.Math.abs(r6)
            int r0 = r9.A00
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f1
            boolean r0 = X.C002801g.A01
            int r0 = r9.getLayoutDirection()
            r1 = 1
            if (r0 == r5) goto L_0x00c9
            r1 = 0
        L_0x00c9:
            r0 = 0
            if (r1 == 0) goto L_0x00ea
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ef
        L_0x00d0:
            if (r3 == r2) goto L_0x00d5
            r9.playSoundEffect(r4)
        L_0x00d5:
            r9.setChecked(r3)
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r10)
            r0 = 3
            r1.setAction(r0)
            super.onTouchEvent(r1)
            r1.recycle()
            super.onTouchEvent(r10)
            return r5
        L_0x00ea:
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ef
            goto L_0x00d0
        L_0x00ef:
            r3 = 0
            goto L_0x00d0
        L_0x00f1:
            boolean r3 = r9.getTargetCheckedState()
            goto L_0x00d0
        L_0x00f6:
            r3 = r2
            goto L_0x00d0
        L_0x00f8:
            r0 = 0
            r9.A06 = r0
            r7.clear()
            goto L_0x0014
        L_0x0100:
            float r3 = r10.getX()
            float r2 = r10.getY()
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r0 = r9.A0D
            if (r0 == 0) goto L_0x0014
            int r4 = r9.getThumbOffset()
            android.graphics.drawable.Drawable r0 = r9.A0D
            android.graphics.Rect r1 = r9.A0c
            r0.getPadding(r1)
            int r8 = r9.A04
            int r7 = r9.A07
            int r8 = r8 - r7
            int r6 = r9.A02
            int r6 = r6 + r4
            int r6 = r6 - r7
            int r4 = r9.A05
            int r4 = r4 + r6
            int r0 = r1.left
            int r4 = r4 + r0
            int r0 = r1.right
            int r4 = r4 + r0
            int r4 = r4 + r7
            int r1 = r9.A01
            int r1 = r1 + r7
            float r0 = (float) r6
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            float r0 = (float) r4
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            float r0 = (float) r8
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            r9.A06 = r5
            r9.A0J = r3
            r9.A0K = r2
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.A0V = z;
        invalidate();
    }

    public void setShowText(boolean z) {
        if (this.A0a != z) {
            this.A0a = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.A0b = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.A03 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.A0M = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.A0d;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.A0D;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.A0D = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.mThumbPosition = f;
        invalidate();
    }

    public void setThumbTextPadding(int i) {
        this.A0O = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.A0P = colorStateList;
        this.A0W = true;
        A01();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.A0B = mode;
        this.A0X = true;
        A01();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.A0E;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.A0E = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.A0A = colorStateList;
        this.A0Y = true;
        A02();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.A0C = mode;
        this.A0Z = true;
        A02();
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A0D;
        if (drawable != null) {
            C27831Xu.A0A(drawable, f, f2);
        }
        Drawable drawable2 = this.A0E;
        if (drawable2 != null) {
            C27831Xu.A0A(drawable2, f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A0D;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.A0E;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C29261bv.A00(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.A0a;
    }

    public boolean getSplitTrack() {
        return this.A0b;
    }

    public int getSwitchMinWidth() {
        return this.A03;
    }

    public int getSwitchPadding() {
        return this.A0M;
    }

    public CharSequence getTextOff() {
        return this.A0H;
    }

    public CharSequence getTextOn() {
        return this.A0I;
    }

    public Drawable getThumbDrawable() {
        return this.A0D;
    }

    public final float getThumbPosition() {
        return this.mThumbPosition;
    }

    public int getThumbTextPadding() {
        return this.A0O;
    }

    public ColorStateList getThumbTintList() {
        return this.A0P;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.A0B;
    }

    public Drawable getTrackDrawable() {
        return this.A0E;
    }

    public ColorStateList getTrackTintList() {
        return this.A0A;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.A0C;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A0D;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.A0E;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.A08;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.A08.end();
            this.A08 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.A0c;
        Drawable drawable = this.A0E;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.A04;
        int i2 = this.A01;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.A0D;
        if (drawable != null) {
            if (!this.A0b || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect A012 = C005902p.A01(drawable2);
                drawable2.copyBounds(rect);
                rect.left += A012.left;
                rect.right -= A012.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.A0R;
        } else {
            layout = this.A0Q;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.A09;
            if (colorStateList != null) {
                this.A0d.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.A0d.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((float) ((width / 2) - (layout.getWidth() / 2)), (float) (((i3 + i4) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.A0I;
            } else {
                charSequence = this.A0H;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(text);
                A10.append(' ');
                A10.append(charSequence);
                accessibilityNodeInfo.setText(A10);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.A0D != null) {
            Rect rect = this.A0c;
            Drawable drawable = this.A0E;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect A012 = C005902p.A01(this.A0D);
            i5 = Math.max(0, A012.left - rect.left);
            i9 = Math.max(0, A012.right - rect.right);
        } else {
            i5 = 0;
        }
        boolean z2 = C002801g.A01;
        if (getLayoutDirection() == 1) {
            i6 = getPaddingLeft() + i5;
            width = ((this.mSwitchWidth + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.mSwitchWidth) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i7 = this.A0L;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i7 / 2);
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            i7 = this.A0L;
        } else {
            i8 = getHeight() - getPaddingBottom();
            paddingTop = i8 - this.A0L;
            this.A02 = i6;
            this.A04 = paddingTop;
            this.A01 = i8;
            this.A0N = width;
        }
        i8 = i7 + paddingTop;
        this.A02 = i6;
        this.A04 = paddingTop;
        this.A01 = i8;
        this.A0N = width;
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.A0I;
        } else {
            charSequence = this.A0H;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper();
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            A04();
        } else {
            A03();
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.A08;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float f = 0.0f;
            if (isChecked) {
                f = 1.0f;
            }
            setThumbPosition(f);
            return;
        }
        float f2 = 0.0f;
        if (isChecked) {
            f2 = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, A0f, new float[]{f2});
        this.A08 = ofFloat;
        ofFloat.setDuration(250);
        A05(this.A08);
        this.A08.start();
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C29261bv.A01(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().A03(z);
        setTextOnInternal(this.A0I);
        setTextOffInternal(this.A0H);
        requestLayout();
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().A04(inputFilterArr));
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            A03();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            A04();
        }
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AnonymousClass001.A0y(this, i));
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AnonymousClass001.A0y(this, i));
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A0D || drawable == this.A0E) {
            return true;
        }
        return false;
    }

    public SwitchCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971445);
    }
}
