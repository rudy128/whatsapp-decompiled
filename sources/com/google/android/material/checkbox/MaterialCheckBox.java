package com.google.android.material.checkbox;

import X.AnonymousClass000;
import X.AnonymousClass1ZA;
import X.BE7;
import X.BEA;
import X.BHM;
import X.C17890vO;
import X.C26173Ctq;
import X.C27831Xu;
import X.C454028v;
import X.C6Y;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialCheckBox extends AppCompatCheckBox {
    public static final int A0K = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public static final int[] A0L = {2130971361};
    public static final int[] A0M = {2130971362};
    public static final int[][] A0N = {new int[]{16842910, 2130971361}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public int A00;
    public ColorStateList A01;
    public ColorStateList A02;
    public Drawable A03;
    public Drawable A04;
    public CharSequence A05;
    public CharSequence A06;
    public boolean A07;
    public boolean A08;
    public int[] A09;
    public ColorStateList A0A;
    public PorterDuff.Mode A0B;
    public CompoundButton.OnCheckedChangeListener A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final C6Y A0G;
    public final C454028v A0H;
    public final LinkedHashSet A0I;
    public final LinkedHashSet A0J;

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.A00 == 2) {
            View.mergeDrawableStates(onCreateDrawableState, A0M);
        }
        if (this.A07) {
            View.mergeDrawableStates(onCreateDrawableState, A0L);
        }
        int[] iArr = onCreateDrawableState;
        int i2 = 0;
        while (true) {
            int length = onCreateDrawableState.length;
            if (i2 >= length) {
                iArr = Arrays.copyOf(onCreateDrawableState, length + 1);
                iArr[length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                break;
            } else if (i3 == 0) {
                iArr = (int[]) onCreateDrawableState.clone();
                iArr[i2] = 16842912;
                break;
            } else {
                i2++;
            }
        }
        this.A09 = iArr;
        return onCreateDrawableState;
    }

    private void A01() {
        int intrinsicWidth;
        int intrinsicHeight;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.A03;
        ColorStateList colorStateList3 = this.A02;
        PorterDuff.Mode A002 = A00(this);
        int i = Build.VERSION.SDK_INT;
        boolean A1U = AnonymousClass000.A1U(i, 23);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = BE7.A0E(drawable);
            if (A002 != null) {
                C27831Xu.A07(A002, drawable);
            }
        } else if (A1U) {
            drawable.mutate();
        }
        this.A03 = drawable;
        Drawable drawable2 = this.A04;
        ColorStateList colorStateList4 = this.A01;
        PorterDuff.Mode mode = this.A0B;
        boolean A1U2 = AnonymousClass000.A1U(i, 23);
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = BE7.A0E(drawable2);
            if (mode != null) {
                C27831Xu.A07(mode, drawable2);
            }
        } else if (A1U2) {
            drawable2.mutate();
        }
        this.A04 = drawable2;
        if (this.A08) {
            C454028v r4 = this.A0H;
            if (r4 != null) {
                C6Y c6y = this.A0G;
                r4.A09(c6y);
                r4.A08(c6y);
            }
            if (i >= 24) {
                Drawable drawable3 = this.A03;
                if ((drawable3 instanceof AnimatedStateListDrawable) && r4 != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(2131429088, 2131436496, r4, false);
                    ((AnimatedStateListDrawable) this.A03).addTransition(2131431611, 2131436496, r4, false);
                }
            }
        }
        Drawable drawable4 = this.A03;
        if (!(drawable4 == null || (colorStateList2 = this.A02) == null)) {
            C27831Xu.A03(colorStateList2, drawable4);
        }
        Drawable drawable5 = this.A04;
        if (!(drawable5 == null || (colorStateList = this.A01) == null)) {
            C27831Xu.A03(colorStateList, drawable5);
        }
        Drawable drawable6 = this.A03;
        Drawable drawable7 = this.A04;
        if (drawable6 != null) {
            if (drawable7 == null) {
                drawable7 = drawable6;
            } else {
                Drawable[] drawableArr = new Drawable[2];
                boolean A1X = BE7.A1X(drawable6, drawable7, drawableArr);
                LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
                if (drawable7.getIntrinsicWidth() == -1 || drawable7.getIntrinsicHeight() == -1) {
                    intrinsicWidth = drawable6.getIntrinsicWidth();
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                } else if (drawable7.getIntrinsicWidth() > drawable6.getIntrinsicWidth() || drawable7.getIntrinsicHeight() > drawable6.getIntrinsicHeight()) {
                    float intrinsicWidth2 = ((float) drawable7.getIntrinsicWidth()) / ((float) drawable7.getIntrinsicHeight());
                    if (intrinsicWidth2 >= ((float) drawable6.getIntrinsicWidth()) / ((float) drawable6.getIntrinsicHeight())) {
                        intrinsicWidth = drawable6.getIntrinsicWidth();
                        intrinsicHeight = (int) (((float) intrinsicWidth) / intrinsicWidth2);
                    } else {
                        intrinsicHeight = drawable6.getIntrinsicHeight();
                        intrinsicWidth = (int) (intrinsicWidth2 * ((float) intrinsicHeight));
                    }
                } else {
                    intrinsicWidth = drawable7.getIntrinsicWidth();
                    intrinsicHeight = drawable7.getIntrinsicHeight();
                }
                if (i >= 23) {
                    layerDrawable.setLayerSize(A1X, intrinsicWidth, intrinsicHeight);
                    layerDrawable.setLayerGravity(A1X, 17);
                } else {
                    int intrinsicWidth3 = (drawable6.getIntrinsicWidth() - intrinsicWidth) / 2;
                    int intrinsicHeight2 = (drawable6.getIntrinsicHeight() - intrinsicHeight) / 2;
                    layerDrawable.setLayerInset(A1X ? 1 : 0, intrinsicWidth3, intrinsicHeight2, intrinsicWidth3, intrinsicHeight2);
                }
                drawable7 = layerDrawable;
            }
        }
        super.setButtonDrawable(drawable7);
        refreshDrawableState();
    }

    private String getButtonStateDescription() {
        int i;
        int i2 = this.A00;
        Resources resources = getResources();
        if (i2 == 1) {
            i = 2131899197;
        } else {
            i = 2131899198;
            if (i2 == 0) {
                i = 2131899199;
            }
        }
        return resources.getString(i);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.A0A;
        if (colorStateList != null) {
            return colorStateList;
        }
        int[][] iArr = A0N;
        int A032 = AnonymousClass1ZA.A03(this, 2130969111);
        int A033 = AnonymousClass1ZA.A03(this, 2130969114);
        int A034 = AnonymousClass1ZA.A03(this, 2130969148);
        int A035 = AnonymousClass1ZA.A03(this, 2130969128);
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{AnonymousClass1ZA.A00(1.0f, A034, A033), AnonymousClass1ZA.A00(1.0f, A034, A032), AnonymousClass1ZA.A00(0.54f, A034, A035), AnonymousClass1ZA.A00(0.38f, A034, A035), AnonymousClass1ZA.A00(0.38f, A034, A035)});
        this.A0A = colorStateList2;
        return colorStateList2;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.A02;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public Drawable getButtonDrawable() {
        return this.A03;
    }

    public Drawable getButtonIconDrawable() {
        return this.A04;
    }

    public ColorStateList getButtonIconTintList() {
        return this.A01;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.A0B;
    }

    public ColorStateList getButtonTintList() {
        return this.A02;
    }

    public int getCheckedState() {
        return this.A00;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.A06;
    }

    public boolean isChecked() {
        return C17890vO.A1R(this.A00);
    }

    public void onDraw(Canvas canvas) {
        Drawable A002;
        if (!this.A0E || !TextUtils.isEmpty(getText()) || (A002 = C26173Ctq.A00(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int i = 1;
        if (getLayoutDirection() == 1) {
            i = -1;
        }
        int width = ((getWidth() - A002.getIntrinsicWidth()) / 2) * i;
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = A002.getBounds();
            C27831Xu.A0E(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof BHM)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        BHM bhm = (BHM) parcelable;
        super.onRestoreInstanceState(bhm.getSuperState());
        setCheckedState(bhm.A00);
    }

    public void setButtonDrawable(Drawable drawable) {
        this.A03 = drawable;
        this.A08 = false;
        A01();
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.A04 = drawable;
        A01();
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.A01 != colorStateList) {
            this.A01 = colorStateList;
            A01();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.A0B != mode) {
            this.A0B = mode;
            A01();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.A02 != colorStateList) {
            this.A02 = colorStateList;
            A01();
        }
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.A00 != i) {
            this.A00 = i;
            super.setChecked(AnonymousClass000.A1T(i, 1));
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.A05 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.A0D) {
                this.A0D = true;
                LinkedHashSet linkedHashSet = this.A0I;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw AnonymousClass000.A0s("onCheckedStateChangedListener");
                    }
                }
                if (!(this.A00 == 2 || (onCheckedChangeListener = this.A0C) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.A0D = false;
            }
        }
    }

    public void setErrorShown(boolean z) {
        if (this.A07 != z) {
            this.A07 = z;
            refreshDrawableState();
            Iterator it = this.A0J.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0s("onErrorChanged");
            }
        }
    }

    public void setStateDescription(CharSequence charSequence) {
        this.A05 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 30) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.A0F = z;
        if (z) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        C26173Ctq.A02(colorStateList, this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCheckBox(android.content.Context r14, android.util.AttributeSet r15, int r16) {
        /*
            r13 = this;
            r12 = 2132084756(0x7f150814, float:1.9809692E38)
            r8 = r15
            r11 = r16
            android.content.Context r0 = X.C27771Xm.A00(r14, r15, r11, r12)
            r13.<init>(r0, r15, r11)
            java.util.LinkedHashSet r0 = X.C17880vN.A14()
            r13.A0J = r0
            java.util.LinkedHashSet r0 = X.C17880vN.A14()
            r13.A0I = r0
            android.content.Context r1 = r13.getContext()
            r0 = 2131232671(0x7f08079f, float:1.8081458E38)
            X.28v r0 = X.C454028v.A03(r1, r0)
            r13.A0H = r0
            r1 = 0
            X.BMd r0 = new X.BMd
            r0.<init>(r13, r1)
            r13.A0G = r0
            android.content.Context r7 = r13.getContext()
            android.graphics.drawable.Drawable r0 = X.C26173Ctq.A00(r13)
            r13.A03 = r0
            android.content.res.ColorStateList r0 = r13.getSuperButtonTintList()
            r13.A02 = r0
            r6 = 0
            r13.setSupportButtonTintList(r6)
            int[] r9 = X.C27781Xn.A0Q
            int[] r10 = new int[r1]
            X.01c r5 = X.C27791Xo.A01(r7, r8, r9, r10, r11, r12)
            r0 = 2
            android.graphics.drawable.Drawable r0 = r5.A03(r0)
            r13.A04 = r0
            android.graphics.drawable.Drawable r0 = r13.A03
            r4 = 1
            if (r0 == 0) goto L_0x008a
            r0 = 2130970145(0x7f040621, float:1.7548992E38)
            boolean r0 = X.AnonymousClass1Z9.A03(r7, r0, r1)
            if (r0 == 0) goto L_0x008a
            android.content.res.TypedArray r0 = r5.A02
            int r3 = r0.getResourceId(r1, r1)
            int r2 = r0.getResourceId(r4, r1)
            int r0 = A0K
            if (r3 != r0) goto L_0x008a
            if (r2 != 0) goto L_0x008a
            super.setButtonDrawable((android.graphics.drawable.Drawable) r6)
            r0 = 2131232670(0x7f08079e, float:1.8081456E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass03S.A01(r7, r0)
            r13.A03 = r0
            r13.A08 = r4
            android.graphics.drawable.Drawable r0 = r13.A04
            if (r0 != 0) goto L_0x008a
            r0 = 2131232672(0x7f0807a0, float:1.808146E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass03S.A01(r7, r0)
            r13.A04 = r0
        L_0x008a:
            r0 = 3
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A02(r7, r5, r0)
            r13.A01 = r0
            r3 = 4
            r0 = -1
            android.content.res.TypedArray r2 = r5.A02
            int r3 = r2.getInt(r3, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r0 = X.AnonymousClass1YU.A01(r0, r3)
            r13.A0B = r0
            r0 = 10
            boolean r0 = r2.getBoolean(r0, r1)
            r13.A0F = r0
            r0 = 6
            boolean r0 = r2.getBoolean(r0, r4)
            r13.A0E = r0
            r0 = 9
            boolean r0 = r2.getBoolean(r0, r1)
            r13.A07 = r0
            r0 = 8
            java.lang.CharSequence r0 = r2.getText(r0)
            r13.A06 = r0
            r0 = 7
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x00cf
            r0 = 7
            int r0 = r2.getInt(r0, r1)
            r13.setCheckedState(r0)
        L_0x00cf:
            r2.recycle()
            r13.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static PorterDuff.Mode A00(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0F && this.A02 == null && this.A01 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.A07) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(accessibilityNodeInfo.getText());
            A10.append(", ");
            accessibilityNodeInfo.setText(C17890vO.A0V(this.A06, A10));
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, X.BHM] */
    public Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.A00 = this.A00;
        return baseSavedState;
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(BE7.A0F(this, i));
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        A01();
    }

    public void setErrorAccessibilityLabelResource(int i) {
        this.A06 = BEA.A0a(this, i);
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.A0E = z;
    }

    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.A06 = charSequence;
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A0C = onCheckedChangeListener;
    }

    public MaterialCheckBox(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(BE7.A0F(this, i));
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969028);
    }
}
