package com.whatsapp.ui.media;

import X.AnonymousClass000;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass784;
import X.AnonymousClass86P;
import X.C109685dq;
import X.C109715dt;
import X.C124326Xx;
import X.C18070vi;
import X.C19740yt;
import X.C19760yx;
import X.C25807CmK;
import X.C26302CxJ;
import X.C32011gU;
import X.C63462t7;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C97964qL;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import com.whatsapp.text.ReadMoreTextView;

public final class MediaCaptionTextView extends ReadMoreTextView {
    public C32011gU A00;
    public boolean A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaCaptionTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final void setCaptionText(CharSequence charSequence) {
        A0U((AnonymousClass86P) null, charSequence, false);
    }

    public final void setLinkifyWeb(C32011gU r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void A0U(AnonymousClass86P r18, CharSequence charSequence, boolean z) {
        float A002;
        int length;
        CharSequence charSequence2 = charSequence;
        if (charSequence == null || charSequence2.length() == 0) {
            setVisibility(8);
            return;
        }
        int A003 = C63462t7.A00(charSequence2);
        if (1 <= A003) {
            float A004 = AnonymousClass3MW.A00(AnonymousClass000.A0Y(this), 2131165738);
            float A005 = (C72473Md.A00(this) * A004) / AnonymousClass000.A0Y(this).getDisplayMetrics().scaledDensity;
            float f = A004;
            if (A004 > A005) {
                f = A005;
            }
            float f2 = f * 1.5f;
            float f3 = A004;
            if (A004 < f2) {
                f3 = f2;
            }
            A002 = A004 + (((f3 - A004) * ((float) (4 - A003))) / 3.0f);
        } else {
            Resources A0Y = AnonymousClass000.A0Y(this);
            int i = 2131169432;
            if (charSequence2.length() < 96) {
                i = 2131165738;
            }
            A002 = AnonymousClass3MW.A00(A0Y, i);
        }
        int i2 = 8388611;
        if (charSequence2.length() < 96) {
            i2 = 17;
        }
        setGravity(i2);
        setTextSize(0, A002);
        int A02 = AnonymousClass3MZ.A02(getContext(), getContext(), 2130970892, 2131102330);
        int A022 = AnonymousClass3MZ.A02(getContext(), getContext(), 2130970132, 2131101250);
        TextPaint paint = getPaint();
        C18070vi.A0X(paint);
        C19760yx A06 = C26302CxJ.A06(paint, getSystemServices(), getSharedPreferencesFactory(), new C25807CmK(A02, A022, 0, false, false, false, false, false), charSequence2);
        if (C72463Mc.A1Y(A06.A01)) {
            getLayoutParams().width = -2;
            setGravity(8388611);
        }
        C72483Me.A0w(this, (CharSequence) A06.A00);
        setVisibility(0);
        if (z) {
            AnonymousClass86P r10 = r18;
            if (r18 != null) {
                SpannableStringBuilder A09 = AnonymousClass3MW.A09(getText());
                getLinkifyWeb().A05(A09);
                URLSpan[] uRLSpanArr = (URLSpan[]) A09.getSpans(0, A09.length(), URLSpan.class);
                if (uRLSpanArr != null && (length = uRLSpanArr.length) != 0) {
                    int i3 = 0;
                    do {
                        URLSpan uRLSpan = uRLSpanArr[i3];
                        String url = uRLSpan.getURL();
                        C18070vi.A0b(url);
                        String A006 = C124326Xx.A00(url);
                        int spanStart = A09.getSpanStart(uRLSpan);
                        A09.replace(spanStart, A09.getSpanEnd(uRLSpan), A006);
                        A09.removeSpan(uRLSpan);
                        A09.setSpan(new C109715dt(r10, this, url), spanStart, A006.length() + spanStart, 0);
                        i3++;
                    } while (i3 < length);
                    setLinkTextColor(C19740yt.A00(getContext(), C72473Md.A06(this)));
                    setMovementMethod(new C109685dq());
                    setText(A09);
                    requestLayout();
                }
            }
        }
    }

    public final C32011gU getLinkifyWeb() {
        C32011gU r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("linkifyWeb");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCaptionTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A0I();
        setOnClickListener(new AnonymousClass784(this, 14));
        this.A03 = new C97964qL(1);
    }

    public /* synthetic */ MediaCaptionTextView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaCaptionTextView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
