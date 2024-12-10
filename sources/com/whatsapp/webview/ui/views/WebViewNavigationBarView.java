package com.whatsapp.webview.ui.views;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1F9;
import X.AnonymousClass1K1;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass78M;
import X.AnonymousClass7AS;
import X.C133236oO;
import X.C138376wy;
import X.C1587381v;
import X.C1587481w;
import X.C18070vi;
import X.C27691Xc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public final class WebViewNavigationBarView extends LinearLayout implements AnonymousClass009 {
    public C138376wy A00;
    public C133236oO A01;
    public AnonymousClass031 A02;
    public boolean A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewNavigationBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean booleanValue;
        C18070vi.A0d(context, 1);
        if (!this.A03) {
            this.A03 = true;
            C27691Xc r1 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            this.A00 = AnonymousClass1K1.A26(r1.A0z);
            this.A01 = (C133236oO) r1.A10.A00.A5D.get();
        }
        View inflate = View.inflate(context, 2131627612, this);
        C18070vi.A0X(inflate);
        this.A06 = inflate;
        View A0C = AnonymousClass3MX.A0C(inflate, 2131428012);
        this.A04 = A0C;
        View A0C2 = AnonymousClass3MX.A0C(inflate, 2131430984);
        this.A05 = A0C2;
        View A0C3 = AnonymousClass3MX.A0C(inflate, 2131434437);
        this.A07 = A0C3;
        View A0C4 = AnonymousClass3MX.A0C(inflate, 2131435354);
        this.A08 = A0C4;
        Boolean bool = (Boolean) getWebViewViewModel().A05.A06();
        boolean z = false;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        A0C.setEnabled(booleanValue);
        Boolean bool2 = (Boolean) getWebViewViewModel().A06.A06();
        A0C2.setEnabled(bool2 != null ? bool2.booleanValue() : z);
        AnonymousClass3MZ.A1M(A0C3, this, 18);
        AnonymousClass3MZ.A1M(A0C, this, 19);
        AnonymousClass3MZ.A1M(A0C2, this, 20);
        AnonymousClass78M.A00(A0C4, this, context, 32);
    }

    public final void setUpWithLiveData(AnonymousClass1F9 r4) {
        C18070vi.A0d(r4, 0);
        AnonymousClass7AS.A00(r4, getWebViewViewModel().A05, new C1587381v(this), 42);
        AnonymousClass7AS.A00(r4, getWebViewViewModel().A06, new C1587481w(this), 42);
    }

    public final void setWebViewIntentUtils(C138376wy r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setWebViewViewModel(C133236oO r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final C138376wy getWebViewIntentUtils() {
        C138376wy r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("webViewIntentUtils");
        throw null;
    }

    public final C133236oO getWebViewViewModel() {
        C133236oO r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("webViewViewModel");
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WebViewNavigationBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ WebViewNavigationBarView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WebViewNavigationBarView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
