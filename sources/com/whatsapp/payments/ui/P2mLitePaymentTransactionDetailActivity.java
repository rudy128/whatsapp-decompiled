package com.whatsapp.payments.ui;

import X.AGD;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass1K1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BT;
import X.AnonymousClass93Q;
import X.C000200d;
import X.C137116uw;
import X.C17880vN;
import X.C18070vi;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import android.os.Bundle;
import android.view.MenuItem;

public final class P2mLitePaymentTransactionDetailActivity extends PaymentTransactionDetailsListActivity {
    public AnonymousClass118 A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public boolean A03;

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        if (AnonymousClass3MY.A09(this) != null) {
            bundle.putAll(AnonymousClass3MY.A09(this));
        }
        super.onSaveInstanceState(bundle);
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            AnonymousClass93Q.A0q(r2, r1, this);
            AnonymousClass93Q.A0d(r2, r1, AnonymousClass8BT.A0J(r2), this);
            this.A0N = AnonymousClass3MZ.A0z(r2);
            AnonymousClass93Q.A0V(A002, r2, r1, AnonymousClass3MZ.A0q(r2), this);
            AnonymousClass93Q.A0c(A002, r2, r1, this);
            this.A01 = C000200d.A00(r1.AEK);
            this.A02 = C000200d.A00(r1.AEM);
            this.A00 = AnonymousClass3MZ.A0l(r2);
        }
    }

    public P2mLitePaymentTransactionDetailActivity(int i) {
        this.A03 = false;
        AGD.A00(this, 39);
    }

    public void onBackPressed() {
        super.onBackPressed();
        Integer A0h = C17880vN.A0h();
        A4g(A0h, A0h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (X.A4C.A01(r1) == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreate(r15)
            X.8Gc r0 = r14.A0Q
            X.9NU r0 = r0.A06
            r9 = 0
            if (r0 == 0) goto L_0x0059
            X.21K r2 = r0.A03
            X.AW0 r1 = r0.A01
        L_0x000e:
            X.00H r0 = r14.A01
            if (r0 == 0) goto L_0x005c
            java.lang.Object r3 = r0.get()
            X.BD4 r3 = (X.BD4) r3
            java.lang.String r7 = r14.A0f
            if (r1 == 0) goto L_0x0023
            boolean r0 = X.A4C.A01(r1)
            r12 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r12 = 0
        L_0x0024:
            if (r2 == 0) goto L_0x0057
            X.AEt r0 = r2.BPK()
            if (r0 == 0) goto L_0x0057
            X.AEn r0 = r0.A02
            if (r0 == 0) goto L_0x0057
            int r0 = r0.A01()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0038:
            java.lang.String r8 = X.C196449v5.A01(r0)
            if (r2 == 0) goto L_0x004c
            X.AEt r0 = r2.BPK()
            if (r0 == 0) goto L_0x004c
            X.AEn r0 = r0.A02
            if (r0 == 0) goto L_0x004c
            java.lang.String r9 = r0.A04()
        L_0x004c:
            r4 = 0
            java.lang.String r6 = "payment_transaction_details"
            r10 = 0
            r13 = r10
            r5 = r4
            r11 = r10
            r3.BiJ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0057:
            r0 = r9
            goto L_0x0038
        L_0x0059:
            r2 = r9
            r1 = r9
            goto L_0x000e
        L_0x005c:
            java.lang.String r0 = "paymentFieldStatsLogger"
            X.C18070vi.A11(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.P2mLitePaymentTransactionDetailActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) == 16908332) {
            Integer A0h = C17880vN.A0h();
            A4g(A0h, A0h);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public P2mLitePaymentTransactionDetailActivity() {
        this(0);
    }
}
