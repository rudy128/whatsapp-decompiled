package com.whatsapp.biz.catalog.view;

import X.AnonymousClass10E;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.C72463Mc;
import X.C72483Me;
import X.C74673cB;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

public class EllipsizedTextEmojiLabel extends TextEmojiLabel {
    public int A00;
    public View.OnClickListener A01;
    public boolean A02;
    public boolean A03;

    public void A0S(CharSequence charSequence, List list, int i, boolean z) {
        CharSequence charSequence2 = charSequence;
        List list2 = list;
        if (i == 0 || !this.A02) {
            super.A0S(charSequence, list, 0, true);
            return;
        }
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(charSequence);
        if (codePointCount > i) {
            SpannableStringBuilder A092 = AnonymousClass3MW.A09(getContext().getString(2131894929));
            A092.setSpan(new C74673cB(getContext(), this, charSequence2, list2, this.A00), 0, A092.length(), 18);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                i2 += Character.charCount(Character.codePointAt(charSequence, i2));
            }
            A09.delete(i2, A09.length()).append("... ").append(A092);
        }
        super.A0S(A09, list, 0, true);
    }

    private void A0F(Context context) {
        AnonymousClass3Ma.A1L(this.A04, this);
        this.A00 = AnonymousClass1YL.A00(context, 2130970299, 2131101293);
    }

    public void A0I() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0X = C72463Mc.A0X(this);
            C72483Me.A0s(A0X, this);
            C72483Me.A0r(A0X, this);
        }
    }

    public EllipsizedTextEmojiLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0I();
        this.A02 = true;
        A0F(context);
    }

    public void setOnTextExpandClickListener(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }

    public void setReadMoreColor(int i) {
        this.A00 = i;
    }

    public EllipsizedTextEmojiLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0I();
        this.A02 = true;
        A0F(context);
    }

    public EllipsizedTextEmojiLabel(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A0I();
    }

    public EllipsizedTextEmojiLabel(Context context) {
        super(context);
        A0I();
        this.A02 = true;
        A0F(context);
    }
}
