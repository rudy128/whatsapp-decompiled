package com.whatsapp.text;

import X.AnonymousClass000;
import X.AnonymousClass112;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1EG;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.C107685aQ;
import X.C108155bD;
import X.C17890vO;
import X.C18070vi;
import X.C29471cL;
import X.C72463Mc;
import X.C75043dk;
import X.C98734rd;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.widget.TextView;

public class ReadMoreTextView extends C75043dk {
    public static final C108155bD A0C;
    public int A00;
    public int A01;
    public TextAppearanceSpan A02;
    public C107685aQ A03;
    public CharSequence A04 = "";
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09 = C17890vO.A0D();
    public final AnonymousClass1DT A0A = AnonymousClass3MW.A0M(AnonymousClass000.A0h());
    public final Runnable A0B = new C98734rd(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReadMoreTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A0F(context, attributeSet);
    }

    public final void setLinkAppearanceSpan(TextAppearanceSpan textAppearanceSpan) {
        C18070vi.A0d(textAppearanceSpan, 0);
        this.A02 = textAppearanceSpan;
    }

    private final void A0F(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        A0C.CKm(this);
        AnonymousClass3Ma.A1L(getAbProps(), this);
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29471cL.A00)) != null) {
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            Integer valueOf = Integer.valueOf(resourceId);
            String str = null;
            if (!AnonymousClass000.A1P(resourceId) && valueOf != null) {
                str = getWhatsAppLocale().A09(resourceId);
            }
            this.A05 = str;
            this.A01 = obtainStyledAttributes.getResourceId(2, C72463Mc.A02(context));
            this.A07 = obtainStyledAttributes.getBoolean(1, false);
            setLinesLimit(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public final boolean A0T() {
        Boolean bool = (Boolean) this.A0A.A06();
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final AnonymousClass1DS getExpanded() {
        return this.A0A;
    }

    public final int getLinesLimit() {
        return this.A00;
    }

    public final void setLinesLimit(int i) {
        int i2;
        this.A00 = i;
        if (A0T() || (i2 = this.A00) == 0) {
            i2 = Integer.MAX_VALUE;
        }
        setMaxLines(i2);
    }

    static {
        Object obj;
        if (AnonymousClass112.A01()) {
            obj = new Object();
        } else {
            obj = new Object();
        }
        A0C = (C108155bD) obj;
    }

    /* access modifiers changed from: private */
    public final void setVisibleText(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, getText())) {
            this.A08 = true;
            setText(charSequence);
            this.A08 = false;
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09.removeCallbacksAndMessages((Object) null);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Handler handler = this.A09;
        handler.removeCallbacksAndMessages((Object) null);
        if (this.A00 != 0) {
            handler.post(this.A0B);
        }
    }

    public final void setExpanded(boolean z) {
        int i;
        Boolean valueOf = Boolean.valueOf(z);
        AnonymousClass1DT r1 = this.A0A;
        if (!C18070vi.A18(valueOf, r1.A06())) {
            r1.A0F(valueOf);
            if (z || (i = this.A00) == 0) {
                i = Integer.MAX_VALUE;
            }
            setMaxLines(i);
            setText(this.A04);
        }
    }

    public final void setLinkColor(int i) {
        this.A01 = i;
    }

    public final void setLinkText(String str) {
        this.A05 = str;
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
    }

    public final void setReadMoreClickListener(C107685aQ r1) {
        this.A03 = r1;
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence A022 = AnonymousClass1EG.A02(charSequence);
        if (A022 == null) {
            A022 = "";
        }
        super.setText(A022, bufferType);
        if (!this.A08) {
            this.A04 = A022;
        }
    }

    public final void setTruncatedWhenCollapsed(boolean z) {
        this.A06 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReadMoreTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A0I();
        A0F(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReadMoreTextView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A0I();
        A0F(context, (AttributeSet) null);
    }
}
