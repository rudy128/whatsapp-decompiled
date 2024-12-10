package com.whatsapp.checkbox;

import X.AnonymousClass00E;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3NE;
import X.C000100c;
import X.C18000vb;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;

public class RtlCheckBox extends AppCompatCheckBox {
    public C18000vb A00;
    public int A01;
    public Drawable A02;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = ((C000100c) AnonymousClass00E.A00(getContext(), C000100c.class)).CS9();
        }
        if (!isInEditMode() && AnonymousClass3MW.A1Z(this.A00)) {
            setBackgroundDrawable((Drawable) null);
            this.A01 = getPaddingLeft();
            int min = Math.min(this.A01, getPaddingRight());
            setPadding(min, getPaddingTop(), min, getPaddingBottom());
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        if (this.A00 == null) {
            this.A00 = ((C000100c) AnonymousClass00E.A00(getContext(), C000100c.class)).CS9();
        }
        if (!isInEditMode() && !AnonymousClass3MY.A1b(this.A00)) {
            this.A02 = drawable;
            drawable = new AnonymousClass3NE(drawable, this);
        }
        super.setButtonDrawable(drawable);
    }

    public RtlCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public int getCompoundPaddingLeft() {
        if (isInEditMode() || AnonymousClass3MY.A1b(this.A00)) {
            return super.getCompoundPaddingLeft();
        }
        return super.getPaddingLeft();
    }

    public int getCompoundPaddingRight() {
        if (isInEditMode() || AnonymousClass3MY.A1b(this.A00)) {
            return super.getCompoundPaddingRight();
        }
        int paddingRight = super.getPaddingRight();
        Drawable drawable = this.A02;
        if (drawable != null) {
            return paddingRight + Math.max(this.A01, drawable.getIntrinsicWidth());
        }
        return paddingRight;
    }

    public void onDraw(Canvas canvas) {
        int height;
        super.onDraw(canvas);
        if (!isInEditMode() && AnonymousClass3MW.A1Z(this.A00) && this.A02 != null) {
            int gravity = getGravity() & 112;
            int intrinsicHeight = this.A02.getIntrinsicHeight();
            int intrinsicWidth = this.A02.getIntrinsicWidth();
            if (gravity == 16) {
                height = (getHeight() - intrinsicHeight) / 2;
            } else if (gravity != 80) {
                height = 0;
            } else {
                height = getHeight() - intrinsicHeight;
            }
            int width = getWidth() - intrinsicWidth;
            int width2 = getWidth();
            this.A02.setBounds(width, height, width2, intrinsicHeight + height);
            this.A02.draw(canvas);
        }
    }

    public RtlCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public RtlCheckBox(Context context) {
        this(context, (AttributeSet) null);
    }
}
