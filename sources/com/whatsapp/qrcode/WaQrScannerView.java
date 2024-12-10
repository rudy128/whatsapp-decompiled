package com.whatsapp.qrcode;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass3MW;
import X.AnonymousClass8AH;
import X.C109835e5;
import X.C110515g2;
import X.C160918An;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C27691Xc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Map;

public class WaQrScannerView extends FrameLayout implements AnonymousClass009, C160918An {
    public C18030ve A00;
    public C160918An A01;
    public AnonymousClass031 A02;
    public boolean A03;

    private void A00() {
        View r0;
        boolean A05 = C18020vd.A05(C18040vf.A02, this.A00, 349);
        Context context = getContext();
        if (A05) {
            r0 = new C110515g2(context);
        } else {
            r0 = new C109835e5(context);
        }
        addView(r0);
        this.A01 = (C160918An) r0;
    }

    public void A01() {
        if (!this.A03) {
            this.A03 = true;
            this.A00 = AnonymousClass10E.A8r(((C27691Xc) ((AnonymousClass033) generatedComponent())).A10);
        }
    }

    public boolean Bgi() {
        return this.A01.Bgi();
    }

    public void CFY() {
        this.A01.CFY();
    }

    public void CFw() {
        this.A01.CFw();
    }

    public void CNk() {
        this.A01.CNk();
    }

    public void COW() {
        this.A01.COW();
    }

    public boolean COq() {
        return this.A01.COq();
    }

    public void CPa() {
        this.A01.CPa();
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setQrDecodeHints(Map map) {
        this.A01.setQrDecodeHints(map);
    }

    public void setQrScannerCallback(AnonymousClass8AH r2) {
        this.A01.setQrScannerCallback(r2);
    }

    public void setShouldUseGoogleVisionScanner(boolean z) {
        this.A01.setShouldUseGoogleVisionScanner(z);
    }

    public WaQrScannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A00();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        ((View) this.A01).setVisibility(i);
    }

    public WaQrScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        A01();
        A00();
    }

    public WaQrScannerView(Context context) {
        super(context);
        A01();
        A00();
    }
}
