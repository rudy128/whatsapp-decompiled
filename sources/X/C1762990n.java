package X;

import android.view.View;
import java.util.List;

/* renamed from: X.90n  reason: invalid class name and case insensitive filesystem */
public final class C1762990n extends C195289t6 {
    public View A00;
    public final AnonymousClass91y A01;
    public final boolean A02;

    public void A02(List list) {
        C18070vi.A0d(list, 0);
        super.A02(list);
        if (this.A02) {
            this.A00.setOnClickListener(this.A01);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C20284AEs r5, boolean r6) {
        /*
            r4 = this;
            boolean r0 = r4.A02
            java.lang.String r3 = "defaultPaymentMethodSubTextView"
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.data.payments.PaymentBankAccount"
            X.C18070vi.A0z(r5, r0)
            X.8pb r1 = r5.A08
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData"
            X.C18070vi.A0z(r1, r0)
            X.8pS r1 = (X.AnonymousClass8pS) r1
            boolean r2 = r1.A0G
            android.widget.ImageView r1 = r4.A01
            int r0 = r4.A03
            X.AnonymousClass4aX.A0D(r1, r0)
            android.widget.TextView r1 = r4.A02
            if (r2 == 0) goto L_0x0043
            if (r1 == 0) goto L_0x0029
            r0 = 2131889245(0x7f120c5d, float:1.9413148E38)
        L_0x0026:
            r1.setText(r0)
        L_0x0029:
            android.widget.ImageView r1 = r4.A01
            if (r1 == 0) goto L_0x0033
            r0 = 2131232317(0x7f08063d, float:1.808074E38)
            r1.setImageResource(r0)
        L_0x0033:
            android.view.View r1 = r4.A00
            if (r1 == 0) goto L_0x0056
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r1 = r4.A00
            X.91y r0 = r4.A01
            r1.setOnClickListener(r0)
            return
        L_0x0043:
            if (r1 == 0) goto L_0x0029
            r0 = 2131889246(0x7f120c5e, float:1.941315E38)
            goto L_0x0026
        L_0x0049:
            super.A01(r5, r6)
            android.view.View r1 = r4.A00
            if (r1 == 0) goto L_0x0056
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0056:
            X.C18070vi.A11(r3)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1762990n.A01(X.AEs, boolean):void");
    }

    public C1762990n(AnonymousClass91y r1, boolean z) {
        super(r1);
        this.A01 = r1;
        this.A02 = z;
    }

    public void A00() {
        super.A00();
        this.A00 = C18070vi.A05(this.A01.A00, 2131429856);
    }
}
