package com.whatsapp.communitymedia.itemviews;

import X.AnonymousClass1DF;
import X.AnonymousClass3MX;
import X.AnonymousClass4NY;
import X.C102075Fb;
import X.C102085Fc;
import X.C18070vi;
import X.C18100vl;
import X.C28931bI;
import X.C87744Wu;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.WaTextView;

public final class LinkMetadataView extends LinearLayout {
    public final C18100vl A00 = AnonymousClass1DF.A01(new C102075Fb(this));
    public final C18100vl A01 = AnonymousClass1DF.A01(new C102085Fc(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkMetadataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        View.inflate(context, 2131625817, this);
        setOrientation(1);
    }

    private final C28931bI getSuspiciousLinkStubView() {
        return AnonymousClass3MX.A0v(this.A00);
    }

    private final WaTextView getUrlTextView() {
        return (WaTextView) AnonymousClass3MX.A14(this.A01);
    }

    public final void A00(C87744Wu r4) {
        WaTextView urlTextView = getUrlTextView();
        AnonymousClass4NY r1 = r4.A00;
        urlTextView.setText(r1.A01);
        C28931bI A0v = AnonymousClass3MX.A0v(this.A00);
        int i = 8;
        if (r1.A02 != null) {
            i = 0;
        }
        A0v.A04(i);
    }
}
