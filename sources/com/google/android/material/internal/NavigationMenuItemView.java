package com.google.android.material.internal;

import X.AnonymousClass000;
import X.AnonymousClass03G;
import X.AnonymousClass1HF;
import X.AnonymousClass1XU;
import X.C008003p;
import X.C22667BJi;
import X.C27781Xn;
import X.C27791Xo;
import X.C27831Xu;
import X.C29261bv;
import X.C40501uo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;

public class NavigationMenuItemView extends LinearLayoutCompat implements C008003p {
    public static final int[] A0G = {16842912};
    public int A00;
    public int A01;
    public FrameLayout A02;
    public AnonymousClass03G A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public ColorStateList A07;
    public Drawable A08;
    public Drawable A09;
    public boolean A0A;
    public boolean A0B;
    public final Rect A0C;
    public final Rect A0D;
    public final CheckedTextView A0E;
    public final AnonymousClass1XU A0F;

    public NavigationMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public boolean CCE() {
        return false;
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.A0A) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C27831Xu.A02(drawable).mutate();
                C27831Xu.A04(this.A07, drawable);
            }
            int i = this.A01;
            drawable.setBounds(0, 0, i, i);
        } else if (this.A0B) {
            if (this.A08 == null) {
                Drawable A002 = C40501uo.A00(getContext().getTheme(), getResources(), 2131232717);
                this.A08 = A002;
                if (A002 != null) {
                    int i2 = this.A01;
                    A002.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.A08;
        }
        this.A0E.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    private void setActionView(View view) {
        if (view != null) {
            FrameLayout frameLayout = this.A02;
            if (frameLayout == null) {
                frameLayout = (FrameLayout) ((ViewStub) findViewById(2131429950)).inflate();
                this.A02 = frameLayout;
            }
            frameLayout.removeAllViews();
            this.A02.addView(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a0, code lost:
        if (r5.A03.getActionView() == null) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdW(X.AnonymousClass03G r6) {
        /*
            r5 = this;
            r5.A03 = r6
            int r0 = r6.getItemId()
            if (r0 <= 0) goto L_0x000b
            r5.setId(r0)
        L_0x000b:
            boolean r1 = r6.isVisible()
            r0 = 8
            if (r1 == 0) goto L_0x0014
            r0 = 0
        L_0x0014:
            r5.setVisibility(r0)
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 != 0) goto L_0x0053
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources$Theme r2 = r0.getTheme()
            r1 = 2130969112(0x7f040218, float:1.7546897E38)
            r0 = 1
            boolean r0 = r2.resolveAttribute(r1, r4, r0)
            if (r0 == 0) goto L_0x00cb
            android.graphics.drawable.StateListDrawable r3 = new android.graphics.drawable.StateListDrawable
            r3.<init>()
            int[] r2 = A0G
            int r1 = r4.data
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r3.addState(r2, r0)
            int[] r2 = android.view.View.EMPTY_STATE_SET
            r1 = 0
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r3.addState(r2, r0)
        L_0x0050:
            r5.setBackground(r3)
        L_0x0053:
            boolean r0 = r6.isCheckable()
            r5.setCheckable(r0)
            boolean r0 = r6.isChecked()
            r5.setChecked(r0)
            boolean r0 = r6.isEnabled()
            r5.setEnabled(r0)
            java.lang.CharSequence r0 = r6.getTitle()
            r5.setTitle(r0)
            android.graphics.drawable.Drawable r0 = r6.getIcon()
            r5.setIcon(r0)
            android.view.View r0 = r6.getActionView()
            r5.setActionView(r0)
            java.lang.CharSequence r0 = r6.getContentDescription()
            r5.setContentDescription(r0)
            java.lang.CharSequence r0 = r6.getTooltipText()
            X.AnonymousClass03N.A00(r5, r0)
            X.03G r1 = r5.A03
            java.lang.CharSequence r0 = r1.getTitle()
            if (r0 != 0) goto L_0x00a2
            android.graphics.drawable.Drawable r0 = r1.getIcon()
            if (r0 != 0) goto L_0x00a2
            X.03G r0 = r5.A03
            android.view.View r1 = r0.getActionView()
            r0 = 1
            if (r1 != 0) goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            android.widget.CheckedTextView r1 = r5.A0E
            if (r0 == 0) goto L_0x00bd
            r0 = 8
            r1.setVisibility(r0)
            android.widget.FrameLayout r0 = r5.A02
            if (r0 == 0) goto L_0x00bc
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = -1
        L_0x00b5:
            r1.width = r0
            android.widget.FrameLayout r0 = r5.A02
            r0.setLayoutParams(r1)
        L_0x00bc:
            return
        L_0x00bd:
            r0 = 0
            r1.setVisibility(r0)
            android.widget.FrameLayout r0 = r5.A02
            if (r0 == 0) goto L_0x00bc
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = -2
            goto L_0x00b5
        L_0x00cb:
            r3 = 0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.NavigationMenuItemView.BdW(X.03G):void");
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        AnonymousClass03G r1 = this.A03;
        if (r1 != null && r1.isCheckable() && r1.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0G);
        }
        return onCreateDrawableState;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.A09;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.A09);
            }
            this.A09 = drawable;
            this.A05 = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.A00 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.A00 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.A00 = i;
            if (i == 119 && this.A09 != null) {
                this.A09.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public void setIconPadding(int i) {
        this.A0E.setCompoundDrawablePadding(i);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.A07 = colorStateList;
        this.A0A = AnonymousClass000.A1W(colorStateList);
        AnonymousClass03G r0 = this.A03;
        if (r0 != null) {
            setIcon(r0.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.A0E.setMaxLines(i);
    }

    public void setTextAppearance(int i) {
        C29261bv.A08(this.A0E, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.A0E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.A0E.setText(charSequence);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A09;
        if (drawable != null) {
            if (this.A05) {
                this.A05 = false;
                Rect rect = this.A0D;
                Rect rect2 = this.A0C;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.A06) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.A00, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A09;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A09;
        if (drawable != null && drawable.isStateful()) {
            this.A09.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.A09;
    }

    public int getForegroundGravity() {
        return this.A00;
    }

    public AnonymousClass03G getItemData() {
        return this.A03;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A09;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A05 = z | this.A05;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.A05 = true;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.A04 != z) {
            this.A04 = z;
            this.A0F.A1S(this.A0E, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.A0E;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIconSize(int i) {
        this.A01 = i;
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.A0B = z;
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A09) {
            return true;
        }
        return false;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0D = new Rect();
        this.A0C = new Rect();
        this.A00 = 119;
        this.A06 = true;
        this.A05 = false;
        TypedArray A002 = C27791Xo.A00(context, attributeSet, C27781Xn.A0I, new int[0], i, 0);
        this.A00 = A002.getInt(1, 119);
        Drawable drawable = A002.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.A06 = A002.getBoolean(2, true);
        A002.recycle();
        C22667BJi bJi = new C22667BJi(this, 5);
        this.A0F = bJi;
        setOrientation(0);
        LayoutInflater.from(context).inflate(2131625082, this, true);
        this.A01 = context.getResources().getDimensionPixelSize(2131166424);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(2131429951);
        this.A0E = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AnonymousClass1HF.A0f(checkedTextView, bJi);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
