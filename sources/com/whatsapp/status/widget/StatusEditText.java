package com.whatsapp.status.widget;

import X.AnonymousClass3Ma;
import X.AnonymousClass74F;
import X.AnonymousClass7RE;
import X.C18070vi;
import X.C72473Md;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.whatsapp.mentions.MentionableEntry;

public final class StatusEditText extends MentionableEntry {
    public boolean A00;
    public boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A0G();
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C18070vi.A0d(charSequence, 0);
        super.onTextChanged(charSequence, i, i2, i3);
        A0P();
    }

    public final void A0P() {
        int A07 = C72473Md.A07(this, getMeasuredWidth());
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (A07 > 0 && measuredHeight > 0) {
            if (getText() == null) {
                super.setTextSize(2, 32.0f);
                return;
            }
            Editable text = getText();
            if (text != null) {
                DisplayMetrics A09 = AnonymousClass3Ma.A09(this);
                float f = ((float) A09.heightPixels) / A09.density;
                int A03 = AnonymousClass74F.A03(text, 0, text.length());
                super.setTextSize(2, (float) AnonymousClass74F.A01(A03, (int) f, this.A01));
                if (A03 < 150) {
                    setGravity(17);
                    setTextAlignment(4);
                    return;
                }
                setGravity(16);
                setTextAlignment(5);
                setTextDirection(5);
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            A0P();
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            if (selectionStart >= 0 && selectionEnd >= 0) {
                post(new AnonymousClass7RE(this, selectionEnd, selectionStart, 9));
            }
        }
    }

    public final void setCursorPosition(int i) {
        super.setCursorPosition_internal(i, i);
    }

    public final void setLinkPreviewPresent(boolean z) {
        this.A01 = z;
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        A0P();
    }

    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        A0P();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A0G();
    }

    public StatusEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A0G();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusEditText(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A0G();
    }
}
