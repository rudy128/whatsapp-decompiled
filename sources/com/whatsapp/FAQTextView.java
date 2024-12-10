package com.whatsapp;

import X.AnonymousClass10E;
import X.AnonymousClass11C;
import X.AnonymousClass129;
import X.AnonymousClass1KB;
import X.AnonymousClass1L8;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass5YY;
import X.C18070vi;
import X.C22628BGo;
import X.C26302CxJ;
import X.C36361nl;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C74703cE;
import X.C84144If;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;

public class FAQTextView extends TextEmojiLabel {
    public AnonymousClass1KB A00;
    public C36361nl A01;
    public AnonymousClass129 A02;
    public boolean A03;

    public FAQTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setEducationText(Spannable spannable, String str, String str2, boolean z, int i, AnonymousClass5YY r19) {
        C74703cE r6;
        setLinksClickable(true);
        setFocusable(false);
        AnonymousClass3Ma.A1L(this.A04, this);
        if (str2 == null) {
            str2 = getContext().getString(2131899101);
        }
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(str2);
        Context context = getContext();
        AnonymousClass1KB r9 = this.A00;
        AnonymousClass11C r10 = this.A02;
        C36361nl r8 = this.A01;
        String str3 = str;
        int i2 = i;
        if (i == 0) {
            r6 = new C74703cE(context, r8, r9, r10, str3);
        } else {
            C18070vi.A0d(context, 1);
            C72473Md.A1M(r9, r10, r8, 3);
            r6 = new C74703cE(context, (AnonymousClass1L8) r8, r9, r10, str3, i2);
        }
        int length = str2.length();
        A09.setSpan(r6, 0, length, 33);
        if (z) {
            getContext();
            A09.setSpan(new C22628BGo(), 0, length, 33);
        }
        setText(C26302CxJ.A04(getContext().getString(2131890363), spannable, A09));
        AnonymousClass5YY r0 = r19;
        if (r19 != null) {
            r6.A04(r0);
        }
    }

    public void A0I() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0X = C72463Mc.A0X(this);
            C72483Me.A0s(A0X, this);
            C72483Me.A0r(A0X, this);
            this.A00 = AnonymousClass10E.A12(A0X);
            this.A02 = AnonymousClass10E.AKP(A0X);
            this.A01 = AnonymousClass3Ma.A0L(A0X);
        }
    }

    public void setEducationTextFromArticleID(Spannable spannable, String str) {
        setEducationText(spannable, this.A02.A06(str), (String) null, (AnonymousClass5YY) null);
    }

    public void setEducationTextFromNamedArticle(Spannable spannable, String str, String str2) {
        setEducationText(spannable, this.A02.A05(str, str2).toString(), (String) null, (AnonymousClass5YY) null);
    }

    public FAQTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0I();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = AnonymousClass3Ma.A06(this).obtainStyledAttributes(attributeSet, C84144If.A09, 0, 0);
            try {
                String A0E = this.A03.A0E(obtainStyledAttributes, 1);
                String string = obtainStyledAttributes.getString(0);
                if (!(A0E == null || string == null)) {
                    setEducationTextFromArticleID(AnonymousClass3MW.A09(A0E), string);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        AnonymousClass3Ma.A1K(this, this.A02);
        setClickable(true);
    }

    public void setEducationText(Spannable spannable, String str, String str2, AnonymousClass5YY r11) {
        setEducationText(spannable, str, str2, false, 0, r11);
    }

    public void setEducationTextFromArticleID(Spannable spannable, String str, AnonymousClass5YY r5) {
        setEducationText(spannable, this.A02.A06(str), (String) null, r5);
    }

    public void setEducationTextFromArticleID(Spannable spannable, String str, String str2) {
        setEducationText(spannable, this.A02.A06(str), str2, (AnonymousClass5YY) null);
    }
}
