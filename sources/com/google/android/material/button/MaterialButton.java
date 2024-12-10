package com.google.android.material.button;

import X.AnonymousClass03S;
import X.AnonymousClass1Xp;
import X.AnonymousClass1YT;
import X.AnonymousClass1YU;
import X.AnonymousClass1ZD;
import X.C007803n;
import X.C19740yt;
import X.C22695BKx;
import X.C27741Xj;
import X.C27771Xm;
import X.C27781Xn;
import X.C27791Xo;
import X.C27811Xs;
import X.C27831Xu;
import X.C28011Ym;
import X.C29211bp;
import X.DL7;
import X.E2L;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends C007803n implements Checkable, AnonymousClass1Xp {
    public static final int[] A0D = {16842911};
    public static final int[] A0E = {16842912};
    public int A00;
    public Drawable A01;
    public E2L A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public PorterDuff.Mode A08;
    public boolean A09;
    public boolean A0A;
    public final C29211bp A0B;
    public final LinkedHashSet A0C;

    public MaterialButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A00(int i, int i2) {
        if (this.A01 != null && getLayout() != null) {
            int i3 = this.A00;
            boolean z = true;
            if (!(i3 == 1 || i3 == 2)) {
                z = false;
            }
            if (z || i3 == 3 || i3 == 4) {
                this.A06 = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i4 = this.A00;
                boolean z2 = true;
                if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.A03 = 0;
                } else {
                    int i5 = this.A05;
                    if (i5 == 0) {
                        i5 = this.A01.getIntrinsicWidth();
                    }
                    int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - i5) - this.A04) - getPaddingStart();
                    if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                        textLayoutWidth /= 2;
                    }
                    boolean z3 = true;
                    if (getLayoutDirection() != 1) {
                        z3 = false;
                    }
                    if (this.A00 != 4) {
                        z2 = false;
                    }
                    if (z3 != z2) {
                        textLayoutWidth = -textLayoutWidth;
                    }
                    if (this.A03 != textLayoutWidth) {
                        this.A03 = textLayoutWidth;
                    } else {
                        return;
                    }
                }
            } else if (i3 == 16 || i3 == 32) {
                this.A03 = 0;
                if (i3 == 16) {
                    this.A06 = 0;
                } else {
                    int i6 = this.A05;
                    if (i6 == 0) {
                        i6 = this.A01.getIntrinsicHeight();
                    }
                    int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i6) - this.A04) - getPaddingBottom()) / 2);
                    if (this.A06 != max) {
                        this.A06 = max;
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
            A01(false);
        }
    }

    private void A01(boolean z) {
        Drawable drawable = this.A01;
        if (drawable != null) {
            Drawable mutate = C27831Xu.A02(drawable).mutate();
            this.A01 = mutate;
            C27831Xu.A04(this.A07, mutate);
            PorterDuff.Mode mode = this.A08;
            if (mode != null) {
                C27831Xu.A08(mode, this.A01);
            }
            int i = this.A05;
            if (i == 0) {
                i = this.A01.getIntrinsicWidth();
            }
            int i2 = this.A05;
            if (i2 == 0) {
                i2 = this.A01.getIntrinsicHeight();
            }
            Drawable drawable2 = this.A01;
            int i3 = this.A03;
            int i4 = this.A06;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.A01.setVisible(true, z);
        }
        if (!z) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            Drawable drawable3 = compoundDrawablesRelative[0];
            Drawable drawable4 = compoundDrawablesRelative[1];
            Drawable drawable5 = compoundDrawablesRelative[2];
            int i5 = this.A00;
            if (i5 == 1 || i5 == 2) {
                if (drawable3 == this.A01) {
                    return;
                }
            } else if (i5 == 3 || i5 == 4) {
                if (drawable5 == this.A01) {
                    return;
                }
            } else if (!(i5 == 16 || i5 == 32) || drawable4 == this.A01) {
                return;
            }
        }
        int i6 = this.A00;
        boolean z2 = true;
        if (!(i6 == 1 || i6 == 2)) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.A01, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (i6 == 3 || i6 == 4) {
            setCompoundDrawablesRelative((Drawable) null, (Drawable) null, this.A01, (Drawable) null);
        } else if (i6 == 16 || i6 == 32) {
            setCompoundDrawablesRelative((Drawable) null, this.A01, (Drawable) null, (Drawable) null);
        }
    }

    private boolean A02() {
        C29211bp r0 = this.A0B;
        if (r0 == null || r0.A0E) {
            return false;
        }
        return true;
    }

    private String getA11yClassName() {
        Class cls;
        C29211bp r0 = this.A0B;
        if (r0 == null || !r0.A0F) {
            cls = Button.class;
        } else {
            cls = CompoundButton.class;
        }
        return cls.getName();
    }

    public int getInsetBottom() {
        return this.A0B.A02;
    }

    public int getInsetTop() {
        return this.A0B.A05;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        C29211bp r0 = this.A0B;
        if (r0 != null && r0.A0F) {
            View.mergeDrawableStates(onCreateDrawableState, A0D);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0E);
        }
        return onCreateDrawableState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C22695BKx)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C22695BKx bKx = (C22695BKx) parcelable;
        super.onRestoreInstanceState(bKx.A00);
        setChecked(bKx.A00);
    }

    public boolean performClick() {
        if (this.A0B.A0I) {
            toggle();
        }
        return super.performClick();
    }

    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass03S.A01(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setChecked(boolean z) {
        C29211bp r0 = this.A0B;
        if (r0 != null && r0.A0F && isEnabled() && this.A0A != z) {
            this.A0A = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.A0A;
                if (!materialButtonToggleGroup.A01) {
                    MaterialButtonToggleGroup.A01(materialButtonToggleGroup, getId(), z2);
                }
            }
            if (!this.A09) {
                this.A09 = true;
                Iterator it = this.A0C.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw new NullPointerException("onCheckedChanged");
                } else {
                    this.A09 = false;
                }
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.A01 != drawable) {
            this.A01 = drawable;
            A01(true);
            A00(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            A00(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass03S.A01(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.A05 != i) {
            this.A05 = i;
            A01(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.A07 != colorStateList) {
            this.A07 = colorStateList;
            A01(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.A08 != mode) {
            this.A08 = mode;
            A01(false);
        }
    }

    public void setInsetBottom(int i) {
        C29211bp r1 = this.A0B;
        C29211bp.A03(r1, r1.A05, i);
    }

    public void setInsetTop(int i) {
        C29211bp r1 = this.A0B;
        C29211bp.A03(r1, i, r1.A02);
    }

    public void setPressed(boolean z) {
        E2L e2l = this.A02;
        if (e2l != null) {
            ((DL7) e2l).A00.invalidate();
        }
        super.setPressed(z);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.A0B.A0I = z;
    }

    public void toggle() {
        setChecked(!this.A0A);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil((double) f);
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (A02()) {
            return this.A0B.A00;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.A01;
    }

    public int getIconGravity() {
        return this.A00;
    }

    public int getIconPadding() {
        return this.A04;
    }

    public int getIconSize() {
        return this.A05;
    }

    public ColorStateList getIconTint() {
        return this.A07;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A08;
    }

    public ColorStateList getRippleColor() {
        if (A02()) {
            return this.A0B.A08;
        }
        return null;
    }

    public C28011Ym getShapeAppearanceModel() {
        if (A02()) {
            return this.A0B.A0D;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (A02()) {
            return this.A0B.A09;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (A02()) {
            return this.A0B.A06;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (A02()) {
            return this.A0B.A07;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (A02()) {
            return this.A0B.A0A;
        }
        return super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.A0A;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (A02()) {
            C27811Xs.A03(this, C29211bp.A00(this.A0B, false));
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r3) {
        /*
            r2 = this;
            super.onInitializeAccessibilityNodeInfo(r3)
            java.lang.String r0 = r2.getA11yClassName()
            r3.setClassName(r0)
            X.1bp r0 = r2.A0B
            if (r0 == 0) goto L_0x0013
            boolean r1 = r0.A0F
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r3.setCheckable(r0)
            boolean r0 = r2.isChecked()
            r3.setChecked(r0)
            boolean r0 = r2.isClickable()
            r3.setClickable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C29211bp r4;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (r4 = this.A0B) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            Drawable drawable = r4.A0B;
            if (drawable != null) {
                drawable.setBounds(r4.A03, r4.A05, i6 - r4.A04, i5 - r4.A02);
            }
        }
        A00(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1Xj, android.os.Parcelable, X.BKx] */
    public Parcelable onSaveInstanceState() {
        ? r1 = new C27741Xj(super.onSaveInstanceState());
        r1.A00 = this.A0A;
        return r1;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        A00(getMeasuredWidth(), getMeasuredHeight());
    }

    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.A01 != null) {
            if (this.A01.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (A02()) {
            C29211bp r1 = this.A0B;
            if (C29211bp.A00(r1, false) != null) {
                C29211bp.A00(r1, false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (A02()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                C29211bp r2 = this.A0B;
                r2.A0E = true;
                MaterialButton materialButton = r2.A0J;
                materialButton.setSupportBackgroundTintList(r2.A07);
                materialButton.setSupportBackgroundTintMode(r2.A0A);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (A02()) {
            this.A0B.A0F = z;
        }
    }

    public void setCornerRadius(int i) {
        if (A02()) {
            C29211bp r2 = this.A0B;
            if (!r2.A0G || r2.A00 != i) {
                r2.A00 = i;
                r2.A0G = true;
                r2.A05(r2.A0D.A03((float) i));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (A02()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (A02()) {
            C29211bp.A00(this.A0B, false).A0C(f);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C19740yt.A03(getContext(), i));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(E2L e2l) {
        this.A02 = e2l;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (A02()) {
            C29211bp r1 = this.A0B;
            if (r1.A08 != colorStateList) {
                r1.A08 = colorStateList;
                MaterialButton materialButton = r1.A0J;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AnonymousClass1ZD.A02(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (A02()) {
            setRippleColor(C19740yt.A03(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(C28011Ym r3) {
        if (A02()) {
            this.A0B.A05(r3);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (A02()) {
            C29211bp r0 = this.A0B;
            r0.A0H = z;
            C29211bp.A02(r0);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (A02()) {
            C29211bp r1 = this.A0B;
            if (r1.A09 != colorStateList) {
                r1.A09 = colorStateList;
                C29211bp.A02(r1);
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (A02()) {
            setStrokeColor(C19740yt.A03(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (A02()) {
            C29211bp r1 = this.A0B;
            if (r1.A06 != i) {
                r1.A06 = i;
                C29211bp.A02(r1);
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (A02()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (A02()) {
            C29211bp r2 = this.A0B;
            if (r2.A07 != colorStateList) {
                r2.A07 = colorStateList;
                if (C29211bp.A00(r2, false) != null) {
                    C27831Xu.A04(r2.A07, C29211bp.A00(r2, false));
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (A02()) {
            C29211bp r2 = this.A0B;
            if (r2.A0A != mode) {
                r2.A0A = mode;
                if (C29211bp.A00(r2, false) != null && r2.A0A != null) {
                    C27831Xu.A08(r2.A0A, C29211bp.A00(r2, false));
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        A00(getMeasuredWidth(), getMeasuredHeight());
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(C27771Xm.A00(context, attributeSet, i, 2132084732), attributeSet, i);
        this.A0C = new LinkedHashSet();
        boolean z = false;
        this.A0A = false;
        this.A09 = false;
        Context context2 = getContext();
        TypedArray A002 = C27791Xo.A00(context2, attributeSet, C27781Xn.A0L, new int[0], i, 2132084732);
        this.A04 = A002.getDimensionPixelSize(12, 0);
        this.A08 = AnonymousClass1YU.A01(PorterDuff.Mode.SRC_IN, A002.getInt(15, -1));
        this.A07 = AnonymousClass1YT.A01(getContext(), A002, 14);
        this.A01 = AnonymousClass1YT.A03(getContext(), A002, 10);
        this.A00 = A002.getInteger(11, 1);
        this.A05 = A002.getDimensionPixelSize(13, 0);
        C29211bp r8 = new C29211bp(this, new C28011Ym(C28011Ym.A01(context2, attributeSet, i, 2132084732)));
        this.A0B = r8;
        r8.A03 = A002.getDimensionPixelOffset(1, 0);
        r8.A04 = A002.getDimensionPixelOffset(2, 0);
        r8.A05 = A002.getDimensionPixelOffset(3, 0);
        r8.A02 = A002.getDimensionPixelOffset(4, 0);
        if (A002.hasValue(8)) {
            int dimensionPixelSize = A002.getDimensionPixelSize(8, -1);
            r8.A00 = dimensionPixelSize;
            r8.A05(r8.A0D.A03((float) dimensionPixelSize));
            r8.A0G = true;
        }
        r8.A06 = A002.getDimensionPixelSize(20, 0);
        r8.A0A = AnonymousClass1YU.A01(PorterDuff.Mode.SRC_IN, A002.getInt(7, -1));
        MaterialButton materialButton = r8.A0J;
        r8.A07 = AnonymousClass1YT.A01(materialButton.getContext(), A002, 6);
        r8.A09 = AnonymousClass1YT.A01(materialButton.getContext(), A002, 19);
        r8.A08 = AnonymousClass1YT.A01(materialButton.getContext(), A002, 16);
        r8.A0F = A002.getBoolean(5, false);
        r8.A01 = A002.getDimensionPixelSize(9, 0);
        r8.A0I = A002.getBoolean(21, true);
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        if (A002.hasValue(0)) {
            r8.A0E = true;
            materialButton.setSupportBackgroundTintList(r8.A07);
            materialButton.setSupportBackgroundTintMode(r8.A0A);
        } else {
            C29211bp.A01(r8);
        }
        materialButton.setPaddingRelative(paddingStart + r8.A03, paddingTop + r8.A05, paddingEnd + r8.A04, paddingBottom + r8.A02);
        A002.recycle();
        setCompoundDrawablePadding(this.A04);
        A01(this.A01 != null ? true : z);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970420);
    }
}
