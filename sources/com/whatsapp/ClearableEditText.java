package com.whatsapp;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3SX;
import X.C18000vb;
import X.C40501uo;
import X.C72463Mc;
import X.C72473Md;
import X.C84144If;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;

public class ClearableEditText extends TextInputEditText implements AnonymousClass009, TextWatcher, View.OnTouchListener {
    public Drawable A00;
    public View.OnClickListener A01;
    public C18000vb A02;
    public AnonymousClass031 A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Rect A08;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    private void A06(Editable editable) {
        if (this.A04 || (!TextUtils.isEmpty(editable) && isFocusable() && isEnabled())) {
            if (this.A00 != null) {
                boolean A1Z = AnonymousClass3MW.A1Z(this.A02);
                Drawable drawable = this.A00;
                if (A1Z) {
                    setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                }
            }
        } else if (getClearIconDrawable() != null) {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void A08() {
        if (!this.A06) {
            this.A06 = true;
            this.A02 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public Drawable getClearIconDrawable() {
        boolean A1Z = AnonymousClass3MW.A1Z(this.A02);
        Drawable[] compoundDrawables = getCompoundDrawables();
        char c = 2;
        if (A1Z) {
            c = 0;
        }
        return compoundDrawables[c];
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (this.A05 && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            clearFocus();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public void setAlwaysShowClearIcon(boolean z) {
        if (z != this.A04) {
            this.A04 = z;
            invalidate();
        }
    }

    public ClearableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A08();
        this.A07 = true;
        this.A08 = AnonymousClass3MW.A07();
        A05(context, attributeSet);
    }

    private void A05(Context context, AttributeSet attributeSet) {
        int i = 2131231814;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A07);
            this.A05 = obtainStyledAttributes.getBoolean(1, false);
            this.A07 = obtainStyledAttributes.getBoolean(3, true);
            this.A04 = obtainStyledAttributes.getBoolean(0, false);
            i = obtainStyledAttributes.getResourceId(2, 2131231814);
            obtainStyledAttributes.recycle();
        }
        this.A00 = C40501uo.A00((Resources.Theme) null, getResources(), i);
        setOnTouchListener(this);
        addTextChangedListener(this);
        AnonymousClass1HF.A0f(this, new AnonymousClass3SX(this, this));
    }

    public static boolean A07(ClearableEditText clearableEditText, int i, int i2) {
        Rect clearBounds = clearableEditText.getClearBounds();
        if (i < clearBounds.left || i > clearBounds.right || i2 < clearBounds.top || i2 > clearBounds.bottom) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public Rect getClearBounds() {
        int A09;
        int width;
        Drawable clearIconDrawable = getClearIconDrawable();
        if (clearIconDrawable == null) {
            return AnonymousClass3MW.A07();
        }
        if (AnonymousClass3MW.A1Z(this.A02)) {
            A09 = 0;
        } else {
            A09 = C72463Mc.A09(this) - clearIconDrawable.getIntrinsicWidth();
        }
        if (AnonymousClass3MW.A1Z(this.A02)) {
            width = getPaddingLeft() + clearIconDrawable.getIntrinsicWidth();
        } else {
            width = getWidth();
        }
        int bottom = ((getBottom() - getTop()) / 2) - (clearIconDrawable.getIntrinsicHeight() / 2);
        int bottom2 = ((getBottom() - getTop()) / 2) + (clearIconDrawable.getIntrinsicHeight() / 2);
        Rect rect = this.A08;
        rect.left = A09;
        rect.right = width;
        rect.top = bottom;
        rect.bottom = bottom2;
        return rect;
    }

    public void afterTextChanged(Editable editable) {
        A06(editable);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (getClearIconDrawable() == null) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() != 1 || !A07(this, x, y)) {
            return false;
        }
        View.OnClickListener onClickListener = this.A01;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
        AnonymousClass3MW.A1S(this);
        requestFocus();
        return this.A07;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        A06(getText());
    }

    public void setOnClearIconClickedListener(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }

    public ClearableEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A08();
        this.A07 = true;
        this.A08 = AnonymousClass3MW.A07();
        A05(context, attributeSet);
    }

    public ClearableEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A08();
    }

    public ClearableEditText(Context context) {
        super(context, (AttributeSet) null);
        A08();
        this.A07 = true;
        this.A08 = AnonymousClass3MW.A07();
        A05(context, (AttributeSet) null);
    }
}
