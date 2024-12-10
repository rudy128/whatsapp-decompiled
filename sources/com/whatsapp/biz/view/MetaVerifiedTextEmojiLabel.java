package com.whatsapp.biz.view;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C18070vi;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;

public final class MetaVerifiedTextEmojiLabel extends TextEmojiLabel {
    public int A00;
    public CharSequence A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetaVerifiedTextEmojiLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
    }

    private final CharSequence getTextWithInlineDrawable() {
        if (this.A00 == 0) {
            return this.A01;
        }
        CharSequence charSequence = this.A01;
        if (charSequence == null) {
            charSequence = "";
        }
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(charSequence);
        A09.append("  ");
        A09.setSpan(new ImageSpan(getContext(), this.A00, 0), A09.length() - 1, A09.length(), 33);
        return A09;
    }

    public CharSequence getText() {
        return this.A01;
    }

    public final void setInlineDrawableAfterText(int i) {
        this.A00 = i;
        setText(this.A01);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.A01 = charSequence;
        super.setText(getTextWithInlineDrawable(), bufferType);
    }

    public /* synthetic */ MetaVerifiedTextEmojiLabel(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }
}
