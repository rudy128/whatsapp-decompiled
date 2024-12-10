package com.whatsapp.payments.ui.widget;

import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C27691Xc;
import X.C28931bI;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.whatsapp.qrcode.QrScannerOverlay;

public final class IndiaUpiQrScannerOverlay extends QrScannerOverlay {
    public C18030ve A00;
    public boolean A01;
    public boolean A02;
    public final View A03;
    public final C28931bI A04;

    public void A01(Canvas canvas, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        View view = this.A03;
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        canvas.translate(0.0f, (float) i);
        view.draw(canvas);
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public void A00() {
        if (!this.A02) {
            this.A02 = true;
            this.A00 = AnonymousClass10E.A8r(((C27691Xc) ((AnonymousClass033) generatedComponent())).A10);
        }
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("abProps");
        throw null;
    }

    public int getPaddingBottom() {
        int i;
        if (this.A01) {
            if (C18020vd.A05(C18040vf.A02, getAbProps(), 10659)) {
                i = (int) TypedValue.applyDimension(1, 160.0f, AnonymousClass3Ma.A09(this));
                return super.getPaddingBottom() + i;
            }
        }
        i = 0;
        return super.getPaddingBottom() + i;
    }

    public IndiaUpiQrScannerOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndiaUpiQrScannerOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A00();
        View A08 = AnonymousClass3MX.A08(context, 2131625688);
        C18070vi.A0X(A08);
        this.A03 = A08;
        this.A04 = C28931bI.A00(A08, 2131433368);
    }
}
