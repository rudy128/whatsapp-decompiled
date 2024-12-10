package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.6tF  reason: invalid class name and case insensitive filesystem */
public final class C136086tF {
    public WDSButton A00;
    public WaTextView A01;
    public WaTextView A02;
    public final ConstraintLayout A03;
    public final C18030ve A04;

    public C136086tF(ConstraintLayout constraintLayout, C18030ve r3) {
        C18070vi.A0d(constraintLayout, 1);
        this.A03 = constraintLayout;
        this.A04 = r3;
    }

    public final WaTextView A00() {
        WaTextView waTextView = this.A01;
        if (waTextView != null) {
            return waTextView;
        }
        WaTextView A0U = AnonymousClass3MW.A0U(this.A03, 2131431387);
        this.A01 = A0U;
        return A0U;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if ((r1 instanceof com.whatsapp.WaTextView) != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.whatsapp.WaTextView A01(boolean r3) {
        /*
            r2 = this;
            com.whatsapp.WaTextView r0 = r2.A02
            if (r0 != 0) goto L_0x001d
            if (r3 == 0) goto L_0x001d
            androidx.constraintlayout.widget.ConstraintLayout r1 = r2.A03
            r0 = 2131435858(0x7f0b2152, float:1.849357E38)
            android.view.View r1 = r1.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0020
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            android.view.View r1 = r1.inflate()
        L_0x0019:
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r2.A02 = r1
        L_0x001d:
            com.whatsapp.WaTextView r0 = r2.A02
            return r0
        L_0x0020:
            boolean r0 = r1 instanceof com.whatsapp.WaTextView
            if (r0 == 0) goto L_0x001d
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136086tF.A01(boolean):com.whatsapp.WaTextView");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if ((r1 instanceof com.whatsapp.wds.components.button.WDSButton) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.whatsapp.wds.components.button.WDSButton A02(boolean r3) {
        /*
            r2 = this;
            com.whatsapp.wds.components.button.WDSButton r0 = r2.A00
            if (r0 != 0) goto L_0x0025
            if (r3 == 0) goto L_0x0025
            androidx.constraintlayout.widget.ConstraintLayout r1 = r2.A03
            r0 = 2131427666(0x7f0b0152, float:1.8476955E38)
            android.view.View r1 = r1.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0028
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0 = 2131627596(0x7f0e0e4c, float:1.888246E38)
            android.view.View r1 = X.AnonymousClass3MY.A0G(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.wds.components.button.WDSButton"
            X.C18070vi.A0z(r1, r0)
        L_0x0021:
            com.whatsapp.wds.components.button.WDSButton r1 = (com.whatsapp.wds.components.button.WDSButton) r1
            r2.A00 = r1
        L_0x0025:
            com.whatsapp.wds.components.button.WDSButton r0 = r2.A00
            return r0
        L_0x0028:
            boolean r0 = r1 instanceof com.whatsapp.wds.components.button.WDSButton
            if (r0 == 0) goto L_0x0025
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136086tF.A02(boolean):com.whatsapp.wds.components.button.WDSButton");
    }
}
