package com.whatsapp.components;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C18000vb;
import X.C18070vi;
import X.C43421zm;
import X.C72463Mc;
import X.C72483Me;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;

public final class SuspiciousLinkView extends WaTextView {
    public boolean A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspiciousLinkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A0I();
        setText(2131896645);
        C43421zm.A04(this);
    }

    public final void A0M(int i, long j) {
        String string;
        if (i > 1) {
            C18000vb whatsAppLocale = getWhatsAppLocale();
            Object[] objArr = new Object[1];
            AnonymousClass3MX.A1S(objArr, 0, j);
            string = whatsAppLocale.A0K(objArr, 2131755424, j);
        } else {
            string = getContext().getString(2131896645);
        }
        setText(string);
    }

    public void A0I() {
        if (!this.A00) {
            this.A00 = true;
            C72483Me.A0s(C72463Mc.A0X(this), this);
        }
    }

    public SuspiciousLinkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A0I();
    }

    public /* synthetic */ SuspiciousLinkView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }
}
