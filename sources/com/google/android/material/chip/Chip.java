package com.google.android.material.chip;

import X.AnonymousClass000;
import X.AnonymousClass03S;
import X.AnonymousClass1HF;
import X.AnonymousClass1X3;
import X.AnonymousClass1XU;
import X.AnonymousClass1Xp;
import X.AnonymousClass1Xr;
import X.AnonymousClass1YT;
import X.AnonymousClass1YU;
import X.AnonymousClass1ZD;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.BE6;
import X.BE7;
import X.BE8;
import X.BE9;
import X.BL8;
import X.C19740yt;
import X.C22650BHo;
import X.C23513Bic;
import X.C23518Bih;
import X.C26044Cr8;
import X.C27771Xm;
import X.C27781Xn;
import X.C27791Xo;
import X.C27811Xs;
import X.C27831Xu;
import X.C27991Yk;
import X.C28011Ym;
import X.C6I;
import X.CZD;
import X.D5S;
import X.E2N;
import X.E2Q;
import X.ECX;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.util.Arrays;
import java.util.Locale;

public class Chip extends AppCompatCheckBox implements ECX, AnonymousClass1Xp, E2N {
    public static final Rect A0J = AnonymousClass3MW.A07();
    public static final int[] A0K = {16842911};
    public static final int[] A0L = {16842913};
    public int A00;
    public InsetDrawable A01;
    public View.OnClickListener A02;
    public CompoundButton.OnCheckedChangeListener A03;
    public C23518Bih A04;
    public E2Q A05;
    public CharSequence A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public RippleDrawable A0D;
    public boolean A0E;
    public final BL8 A0F;
    public final Rect A0G;
    public final RectF A0H;
    public final C6I A0I;

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw BE6.A0v("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw BE6.A0v("Chip does not support multi-line text");
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw BE6.A0v("Chip does not support multi-line text");
    }

    private void A03() {
        ColorStateList A022 = AnonymousClass1ZD.A02(this.A04.A0O);
        Drawable drawable = this.A01;
        if (drawable == null) {
            drawable = this.A04;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(A022, drawable, (Drawable) null);
        this.A0D = rippleDrawable;
        setBackground(rippleDrawable);
        A04();
    }

    public static boolean A06(Chip chip) {
        Drawable drawable;
        C23518Bih bih = chip.A04;
        if (bih == null || (drawable = bih.A0T) == null || C27831Xu.A01(drawable) == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.A0H;
        rectF.setEmpty();
        if (A06(this) && this.A02 != null) {
            C23518Bih bih = this.A04;
            Rect bounds = bih.getBounds();
            rectF.setEmpty();
            if (C23518Bih.A06(bih)) {
                float f = bih.A01 + bih.A06 + bih.A07 + bih.A08 + bih.A0B;
                if (C27831Xu.A00(bih) == 0) {
                    float f2 = (float) bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = (float) bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return rectF;
    }

    private C26044Cr8 getTextAppearance() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A0v.A00;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.A08 != z) {
            this.A08 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.A09 != z) {
            this.A09 = z;
            refreshDrawableState();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r1.right == r2) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        if (r1 > 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(int r7) {
        /*
            r6 = this;
            r6.A00 = r7
            boolean r0 = r6.A0A
            r3 = 0
            if (r0 == 0) goto L_0x0067
            X.Bih r2 = r6.A04
            float r0 = r2.A03
            int r0 = (int) r0
            int r0 = r7 - r0
            int r1 = java.lang.Math.max(r3, r0)
            int r0 = r2.getIntrinsicWidth()
            int r0 = r7 - r0
            int r0 = java.lang.Math.max(r3, r0)
            if (r0 > 0) goto L_0x0062
            if (r1 <= 0) goto L_0x0067
            r2 = 0
        L_0x0021:
            int r3 = r1 / 2
        L_0x0023:
            android.graphics.drawable.InsetDrawable r0 = r6.A01
            if (r0 == 0) goto L_0x0044
            android.graphics.Rect r1 = X.AnonymousClass3MW.A07()
            android.graphics.drawable.InsetDrawable r0 = r6.A01
            r0.getPadding(r1)
            int r0 = r1.top
            if (r0 != r3) goto L_0x0044
            int r0 = r1.bottom
            if (r0 != r3) goto L_0x0044
            int r0 = r1.left
            if (r0 != r2) goto L_0x0044
            int r0 = r1.right
            if (r0 != r2) goto L_0x0044
        L_0x0040:
            r6.A03()
            return
        L_0x0044:
            int r0 = r6.getMinHeight()
            if (r0 == r7) goto L_0x004d
            r6.setMinHeight(r7)
        L_0x004d:
            int r0 = r6.getMinWidth()
            if (r0 == r7) goto L_0x0056
            r6.setMinWidth(r7)
        L_0x0056:
            X.Bih r1 = r6.A04
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            r4 = r2
            r5 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A01 = r0
            goto L_0x0040
        L_0x0062:
            int r2 = r0 / 2
            if (r1 <= 0) goto L_0x0023
            goto L_0x0021
        L_0x0067:
            android.graphics.drawable.InsetDrawable r0 = r6.A01
            if (r0 == 0) goto L_0x0040
            r0 = 0
            r6.A01 = r0
            r6.setMinWidth(r3)
            float r0 = r6.getChipMinHeight()
            int r0 = (int) r0
            r6.setMinHeight(r0)
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.A07(int):void");
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.A0B) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (this.A0F.A1o(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.A0B) {
            BL8 bl8 = this.A0F;
            if (bl8.A1n(keyEvent) && bl8.A02 != Integer.MIN_VALUE) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r1 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence getAccessibilityClassName() {
        /*
            r3 = this;
            java.lang.CharSequence r0 = r3.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000b
            java.lang.CharSequence r0 = r3.A06
            return r0
        L_0x000b:
            X.Bih r0 = r3.A04
            if (r0 == 0) goto L_0x0014
            boolean r1 = r0.A0b
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            java.lang.String r2 = "android.widget.Button"
            if (r0 == 0) goto L_0x002c
            android.view.ViewParent r1 = r3.getParent()
            boolean r0 = r1 instanceof com.google.android.material.chip.ChipGroup
            if (r0 == 0) goto L_0x0035
            com.google.android.material.chip.ChipGroup r1 = (com.google.android.material.chip.ChipGroup) r1
            X.Csj r0 = r1.A03
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "android.widget.RadioButton"
            return r0
        L_0x002c:
            boolean r0 = r3.isClickable()
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "android.view.View"
            return r0
        L_0x0035:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.getAccessibilityClassName():java.lang.CharSequence");
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.A01;
        if (insetDrawable == null) {
            return this.A04;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A0R;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A0I;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A0J;
        }
        return null;
    }

    public float getChipCornerRadius() {
        float f;
        C23518Bih bih = this.A04;
        if (bih == null) {
            return 0.0f;
        }
        if (bih.A0f) {
            f = bih.A08();
        } else {
            f = bih.A00;
        }
        return Math.max(0.0f, f);
    }

    public Drawable getChipDrawable() {
        return this.A04;
    }

    public float getChipEndPadding() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A01;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C23518Bih bih = this.A04;
        if (bih == null || (drawable = bih.A0S) == null) {
            return null;
        }
        return C27831Xu.A01(drawable);
    }

    public float getChipIconSize() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A02;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A0K;
        }
        return null;
    }

    public float getChipMinHeight() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A03;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A04;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A0L;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A05;
        }
        return 0.0f;
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        C23518Bih bih = this.A04;
        if (bih == null || (drawable = bih.A0T) == null) {
            return null;
        }
        return C27831Xu.A01(drawable);
    }

    public CharSequence getCloseIconContentDescription() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A0Y;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A06;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A07;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A08;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A0N;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A0V;
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.A0B) {
            BL8 bl8 = this.A0F;
            if (bl8.A02 == 1 || bl8.A00 == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C27991Yk getHideMotionSpec() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A0W;
        }
        return null;
    }

    public float getIconEndPadding() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A09;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A0A;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A0O;
        }
        return null;
    }

    public C28011Ym getShapeAppearanceModel() {
        return this.A04.A01.A0K;
    }

    public C27991Yk getShowMotionSpec() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A0X;
        }
        return null;
    }

    public float getTextEndPadding() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A0B;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C23518Bih bih = this.A04;
        if (bih != null) {
            return bih.A0C;
        }
        return 0.0f;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0L);
        }
        C23518Bih bih = this.A04;
        if (bih != null && bih.A0b) {
            View.mergeDrawableStates(onCreateDrawableState, A0K);
        }
        return onCreateDrawableState;
    }

    public void setBackground(Drawable drawable) {
        Drawable drawable2 = this.A01;
        if (drawable2 == null) {
            drawable2 = this.A04;
        }
        if (drawable == drawable2 || drawable == this.A0D) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.A01;
        if (drawable2 == null) {
            drawable2 = this.A04;
        }
        if (drawable == drawable2 || drawable == this.A0D) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0c(z);
        }
    }

    public void setCheckableResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0c(bih.A0p.getResources().getBoolean(i));
        }
    }

    public void setChecked(boolean z) {
        C23518Bih bih = this.A04;
        if (bih == null) {
            this.A0E = z;
        } else if (bih.A0b) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0Z(drawable);
        }
    }

    public void setCheckedIconResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0Z(AnonymousClass03S.A01(bih.A0p, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0V(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0V(C19740yt.A03(bih.A0p, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0d(bih.A0p.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C23518Bih bih = this.A04;
        if (bih != null && bih.A0J != colorStateList) {
            bih.A0J = colorStateList;
            BE7.A1B(bih);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList A032;
        C23518Bih bih = this.A04;
        if (bih != null && bih.A0J != (A032 = C19740yt.A03(bih.A0p, i))) {
            bih.A0J = A032;
            BE7.A1B(bih);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0N(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0N(BE9.A02(bih, i));
        }
    }

    public void setChipDrawable(C23518Bih bih) {
        C23518Bih bih2 = this.A04;
        if (bih2 != bih) {
            if (bih2 != null) {
                bih2.A0a = BE8.A0m();
            }
            this.A04 = bih;
            bih.A0g = false;
            bih.A0a = AnonymousClass3MW.A0z(this);
            A07(this.A00);
        }
    }

    public void setChipEndPadding(float f) {
        C23518Bih bih = this.A04;
        if (bih != null && bih.A01 != f) {
            bih.A01 = f;
            bih.invalidateSelf();
            bih.A0M();
        }
    }

    public void setChipEndPaddingResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            float A022 = BE9.A02(bih, i);
            if (bih.A01 != A022) {
                bih.A01 = A022;
                bih.invalidateSelf();
                bih.A0M();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0a(drawable);
        }
    }

    public void setChipIconResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0a(AnonymousClass03S.A01(bih.A0p, i));
        }
    }

    public void setChipIconSize(float f) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0O(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0O(BE9.A02(bih, i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0W(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0W(C19740yt.A03(bih.A0p, i));
        }
    }

    public void setChipIconVisible(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0e(bih.A0p.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C23518Bih bih = this.A04;
        if (bih != null && bih.A03 != f) {
            bih.A03 = f;
            bih.invalidateSelf();
            bih.A0M();
        }
    }

    public void setChipMinHeightResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            float A022 = BE9.A02(bih, i);
            if (bih.A03 != A022) {
                bih.A03 = A022;
                bih.invalidateSelf();
                bih.A0M();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C23518Bih bih = this.A04;
        if (bih != null && bih.A04 != f) {
            bih.A04 = f;
            bih.invalidateSelf();
            bih.A0M();
        }
    }

    public void setChipStartPaddingResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            float A022 = BE9.A02(bih, i);
            if (bih.A04 != A022) {
                bih.A04 = A022;
                bih.invalidateSelf();
                bih.A0M();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0X(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0X(C19740yt.A03(bih.A0p, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0P(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0P(BE9.A02(bih, i));
        }
    }

    public void setCloseIcon(Drawable drawable) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0b(drawable);
        }
        A02();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        AnonymousClass1X3 r1;
        C23518Bih bih = this.A04;
        if (bih != null && bih.A0Y != charSequence) {
            AnonymousClass1X3 r0 = AnonymousClass1X3.A02;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                r1 = AnonymousClass1X3.A03;
            } else {
                r1 = AnonymousClass1X3.A02;
            }
            bih.A0Y = r1.A02(r1.A00, charSequence);
            bih.invalidateSelf();
        }
    }

    public void setCloseIconEndPadding(float f) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0Q(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0Q(BE9.A02(bih, i));
        }
    }

    public void setCloseIconResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0b(AnonymousClass03S.A01(bih.A0p, i));
        }
        A02();
    }

    public void setCloseIconSize(float f) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0R(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0R(BE9.A02(bih, i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0S(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0S(BE9.A02(bih, i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0Y(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0Y(C19740yt.A03(bih.A0p, i));
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw BE6.A0v("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw BE6.A0v("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw BE6.A0v("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw BE6.A0v("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw BE6.A0v("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw BE6.A0v("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw BE6.A0v("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw BE6.A0v("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.A04 == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            C23518Bih bih = this.A04;
            if (bih != null) {
                bih.A0V = truncateAt;
                return;
            }
            return;
        }
        throw BE6.A0v("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.A0A = z;
        A07(this.A00);
    }

    public void setHideMotionSpec(C27991Yk r2) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0W = r2;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0W = C27991Yk.A00(bih.A0p, i);
        }
    }

    public void setIconEndPadding(float f) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0T(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0T(BE9.A02(bih, i));
        }
    }

    public void setIconStartPadding(float f) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0U(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0U(BE9.A02(bih, i));
        }
    }

    public void setLayoutDirection(int i) {
        if (this.A04 != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.A02 = onClickListener;
        A02();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C23518Bih bih = this.A04;
        if (!(bih == null || bih.A0O == colorStateList)) {
            bih.A0O = colorStateList;
            BE7.A1B(bih);
        }
        A03();
    }

    public void setRippleColorResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            ColorStateList A032 = C19740yt.A03(bih.A0p, i);
            if (bih.A0O != A032) {
                bih.A0O = A032;
                BE7.A1B(bih);
            }
            A03();
        }
    }

    public void setShapeAppearanceModel(C28011Ym r2) {
        this.A04.setShapeAppearanceModel(r2);
    }

    public void setShowMotionSpec(C27991Yk r2) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0X = r2;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0X = C27991Yk.A00(bih.A0p, i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw BE6.A0v("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = bih.A0g;
            CharSequence charSequence2 = charSequence;
            if (z) {
                charSequence2 = null;
            }
            super.setText(charSequence2, bufferType);
            C23518Bih bih2 = this.A04;
            if (bih2 != null && !TextUtils.equals(bih2.A0Z, charSequence)) {
                bih2.A0Z = charSequence;
                bih2.A0v.A02 = true;
                bih2.invalidateSelf();
                bih2.A0M();
            }
        }
    }

    public void setTextEndPadding(float f) {
        C23518Bih bih = this.A04;
        if (bih != null && bih.A0B != f) {
            bih.A0B = f;
            bih.invalidateSelf();
            bih.A0M();
        }
    }

    public void setTextEndPaddingResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            float A022 = BE9.A02(bih, i);
            if (bih.A0B != A022) {
                bih.A0B = A022;
                bih.invalidateSelf();
                bih.A0M();
            }
        }
    }

    public void setTextStartPadding(float f) {
        C23518Bih bih = this.A04;
        if (bih != null && bih.A0C != f) {
            bih.A0C = f;
            bih.invalidateSelf();
            bih.A0M();
        }
    }

    public void setTextStartPaddingResource(int i) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            float A022 = BE9.A02(bih, i);
            if (bih.A0C != A022) {
                bih.A0C = A022;
                bih.invalidateSelf();
                bih.A0M();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(C27771Xm.A00(context, attributeSet, i, 2132084746), attributeSet, i);
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.A0G = AnonymousClass3MW.A07();
        this.A0H = AnonymousClass3MW.A08();
        this.A0I = new C23513Bic(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw BE6.A0v("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw BE6.A0v("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw BE6.A0v("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw BE6.A0v("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw BE6.A0v("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C23518Bih A002 = C23518Bih.A00(context2, attributeSet, i);
        int[] iArr = C27781Xn.A07;
        TypedArray A003 = C27791Xo.A00(context2, attributeSet2, iArr, new int[0], i2, 2132084746);
        this.A0A = A003.getBoolean(32, false);
        this.A00 = (int) Math.ceil((double) A003.getDimension(20, (float) Math.ceil((double) AnonymousClass1YU.A00(getContext(), 48))));
        A003.recycle();
        setChipDrawable(A002);
        A002.A0C(AnonymousClass1Xr.A00(this));
        TypedArray A004 = C27791Xo.A00(context2, attributeSet2, iArr, new int[0], i2, 2132084746);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(AnonymousClass1YT.A01(context2, A004, 2));
        }
        boolean hasValue = A004.hasValue(37);
        A004.recycle();
        this.A0F = new BL8(this, this);
        A02();
        if (!hasValue) {
            setOutlineProvider(new C22650BHo(this, 0));
        }
        setChecked(this.A0E);
        setText(A002.A0Z);
        setEllipsize(A002.A0V);
        A05();
        if (!this.A04.A0g) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        A04();
        if (this.A0A) {
            setMinHeight(this.A00);
        }
        this.A0C = getLayoutDirection();
        super.setOnCheckedChangeListener(new D5S(this));
    }

    private void A02() {
        boolean z;
        C23518Bih bih;
        if (!A06(this) || (bih = this.A04) == null || !bih.A0d || this.A02 == null) {
            AnonymousClass1HF.A0f(this, (AnonymousClass1XU) null);
            z = false;
        } else {
            AnonymousClass1HF.A0f(this, this.A0F);
            z = true;
        }
        this.A0B = z;
    }

    private void A04() {
        C23518Bih bih;
        if (!TextUtils.isEmpty(getText()) && (bih = this.A04) != null) {
            int A0L2 = (int) (bih.A01 + bih.A0B + bih.A0L());
            int A0K2 = (int) (bih.A04 + bih.A0C + bih.A0K());
            if (this.A01 != null) {
                Rect A072 = AnonymousClass3MW.A07();
                this.A01.getPadding(A072);
                A0K2 += A072.left;
                A0L2 += A072.right;
            }
            setPaddingRelative(A0K2, getPaddingTop(), A0L2, getPaddingBottom());
        }
    }

    private void A05() {
        TextPaint paint = getPaint();
        C23518Bih bih = this.A04;
        if (bih != null) {
            paint.drawableState = bih.getState();
        }
        C26044Cr8 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.A04(getContext(), paint, this.A0I);
        }
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.A0G;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    public void drawableStateChanged() {
        Drawable drawable;
        super.drawableStateChanged();
        C23518Bih bih = this.A04;
        if (bih != null && (drawable = bih.A0T) != null && drawable.isStateful()) {
            C23518Bih bih2 = this.A04;
            int i = 0;
            int A1O = AnonymousClass000.A1O(isEnabled() ? 1 : 0);
            if (this.A07) {
                A1O++;
            }
            if (this.A08) {
                A1O++;
            }
            if (this.A09) {
                A1O++;
            }
            if (isChecked()) {
                A1O++;
            }
            int[] iArr = new int[A1O];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.A07) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.A08) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.A09) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(bih2.A0h, iArr)) {
                bih2.A0h = iArr;
                if (C23518Bih.A06(bih2) && C23518Bih.A07(bih2, bih2.getState(), iArr)) {
                    invalidate();
                }
            }
        }
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C27811Xs.A03(this, this.A04);
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.A0B) {
            this.A0F.A1j(z, i, rect);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 == false) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        /*
            r9 = this;
            super.onInitializeAccessibilityNodeInfo(r10)
            java.lang.CharSequence r0 = r9.getAccessibilityClassName()
            r10.setClassName(r0)
            X.Bih r0 = r9.A04
            if (r0 == 0) goto L_0x0013
            boolean r1 = r0.A0b
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r10.setCheckable(r0)
            boolean r0 = r9.isClickable()
            r10.setClickable(r0)
            android.view.ViewParent r0 = r9.getParent()
            boolean r0 = r0 instanceof com.google.android.material.chip.ChipGroup
            if (r0 == 0) goto L_0x0071
            android.view.ViewParent r4 = r9.getParent()
            X.BHd r4 = (X.C22642BHd) r4
            X.CvK r2 = new X.CvK
            r2.<init>(r10)
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0056
            r3 = 0
            r5 = 0
        L_0x0037:
            int r0 = r4.getChildCount()
            if (r3 >= r0) goto L_0x0056
            android.view.View r1 = r4.getChildAt(r3)
            boolean r0 = r1 instanceof com.google.android.material.chip.Chip
            if (r0 == 0) goto L_0x0053
            android.view.View r0 = r4.getChildAt(r3)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0053
            if (r1 == r9) goto L_0x0057
            int r5 = r5 + 1
        L_0x0053:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x0056:
            r5 = -1
        L_0x0057:
            r0 = 2131434758(0x7f0b1d06, float:1.8491339E38)
            java.lang.Object r1 = r9.getTag(r0)
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0072
            r3 = -1
        L_0x0063:
            r7 = 0
            boolean r8 = r9.isChecked()
            r4 = 1
            r6 = r4
            X.CgV r0 = X.C25476CgV.A00(r3, r4, r5, r6, r7, r8)
            r2.A0a(r0)
        L_0x0071:
            return
        L_0x0072:
            int r3 = X.AnonymousClass000.A0M(r1)
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.A0C != i) {
            this.A0C = i;
            A04();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r4 != 3) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r4 = r6.getActionMasked()
            android.graphics.RectF r2 = r5.getCloseIconTouchBounds()
            float r1 = r6.getX()
            float r0 = r6.getY()
            boolean r3 = r2.contains(r1, r0)
            r2 = 1
            r1 = 0
            if (r4 == 0) goto L_0x0052
            if (r4 == r2) goto L_0x0032
            r0 = 2
            if (r4 == r0) goto L_0x0028
            r0 = 3
            if (r4 == r0) goto L_0x0050
        L_0x0020:
            boolean r0 = super.onTouchEvent(r6)
            if (r0 != 0) goto L_0x0027
            r2 = 0
        L_0x0027:
            return r2
        L_0x0028:
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0020
            if (r3 != 0) goto L_0x0027
            r5.setCloseIconPressed(r1)
            return r2
        L_0x0032:
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0050
            r5.playSoundEffect(r1)
            android.view.View$OnClickListener r0 = r5.A02
            if (r0 == 0) goto L_0x0040
            r0.onClick(r5)
        L_0x0040:
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0049
            X.BL8 r0 = r5.A0F
            r0.A1e(r2, r2)
        L_0x0049:
            r0 = 1
        L_0x004a:
            r5.setCloseIconPressed(r1)
            if (r0 != 0) goto L_0x0027
            goto L_0x0020
        L_0x0050:
            r0 = 0
            goto L_0x004a
        L_0x0052:
            if (r3 == 0) goto L_0x0020
            r5.setCloseIconPressed(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0C(f);
        }
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0H = i;
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C23518Bih bih = this.A04;
        if (bih != null) {
            Context context2 = bih.A0p;
            bih.A0v.A01(context2, new C26044Cr8(context2, i));
        }
        A05();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C23518Bih bih = this.A04;
        if (bih != null) {
            float applyDimension = TypedValue.applyDimension(i, f, AnonymousClass3Ma.A09(this));
            CZD czd = bih.A0v;
            C26044Cr8 cr8 = czd.A00;
            if (cr8 != null) {
                cr8.A00 = applyDimension;
                czd.A04.setTextSize(applyDimension);
                bih.C8W();
            }
        }
        A05();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.A06 = charSequence;
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setInternalOnCheckedChangeListener(E2Q e2q) {
        this.A05 = e2q;
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A03 = onCheckedChangeListener;
    }

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setCheckedIconVisible(boolean z) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0d(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0e(z);
        }
    }

    public void setCloseIconVisible(boolean z) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0f(z);
        }
        A02();
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw BE6.A0v("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw BE6.A0v("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw BE6.A0v("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw BE6.A0v("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C23518Bih bih = this.A04;
        if (bih != null) {
            Context context = bih.A0p;
            bih.A0v.A01(context, new C26044Cr8(context, i));
        }
        A05();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969058);
    }

    public void setTextAppearance(C26044Cr8 cr8) {
        C23518Bih bih = this.A04;
        if (bih != null) {
            bih.A0v.A01(bih.A0p, cr8);
        }
        A05();
    }
}
