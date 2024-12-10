package com.whatsapp.payments.ui;

import X.A7B;
import X.AGD;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass122;
import X.AnonymousClass1FY;
import X.AnonymousClass1KB;
import X.AnonymousClass1QD;
import X.AnonymousClass1QE;
import X.AnonymousClass1QS;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.C000200d;
import X.C003401n;
import X.C108965cb;
import X.C137116uw;
import X.C192839p4;
import X.C30931ek;
import X.C31061ex;
import X.C33661jB;
import X.C33701jF;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

public class PaymentDeleteAccountActivity extends AnonymousClass1FY implements C33661jB {
    public AnonymousClass122 A00;
    public AnonymousClass1QD A01;
    public C31061ex A02;
    public C33701jF A03;
    public AnonymousClass1QS A04;
    public C30931ek A05;
    public AnonymousClass00H A06;
    public int A07;
    public boolean A08;
    public final AnonymousClass1QE A09;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131626430);
        C003401n supportActionBar = getSupportActionBar();
        int i = 1;
        if (supportActionBar != null) {
            supportActionBar.A0M(2131894179);
            supportActionBar.A0W(true);
        }
        if (getIntent() != null) {
            i = getIntent().getIntExtra("extra_remove_payment_account", 1);
        }
        this.A07 = i;
        AnonymousClass1KB r4 = this.A05;
        AnonymousClass10I r12 = this.A05;
        C30931ek r11 = this.A05;
        AnonymousClass1QS r10 = this.A04;
        new C192839p4(this, r4, this.A00, AnonymousClass8BR.A0a(this.A06), this.A01, this.A02, this.A03, r10, r11, r12).A00(this);
        this.A09.A06("deleted payments store and sending delete account request");
        onConfigurationChanged(C108965cb.A03(this));
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A05 = AnonymousClass8BT.A0V(r2);
            this.A04 = AnonymousClass3MZ.A0z(r2);
            this.A00 = AnonymousClass3MZ.A0n(r2);
            this.A01 = AnonymousClass8BU.A0Q(r2);
            this.A02 = AnonymousClass8BU.A0R(r2);
            this.A03 = (C33701jF) r2.A8I.get();
            this.A06 = C000200d.A00(r2.A84);
        }
    }

    public void C3X(A7B a7b) {
        int BRO = this.A04.A06().BPY().BRO(a7b.A00);
        if (BRO == 0) {
            BRO = 2131893599;
        }
        BhQ(BRO);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C3Y(X.C186089dd r5) {
        /*
            r4 = this;
            X.1QE r2 = r4.A09
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "onDeleteAccount successful: "
            r1.append(r0)
            boolean r0 = r5.A02
            r1.append(r0)
            java.lang.String r0 = " remove type: "
            r1.append(r0)
            int r0 = r4.A07
            X.AnonymousClass8BV.A1F(r2, r1, r0)
            r0 = 2131434180(0x7f0b1ac4, float:1.8490167E38)
            android.view.View r0 = r4.findViewById(r0)
            r3 = 8
            r0.setVisibility(r3)
            boolean r0 = r5.A02
            r2 = 1
            if (r0 == 0) goto L_0x0066
            int r0 = r4.A07
            if (r0 != r2) goto L_0x0045
            r1 = 2131893600(0x7f121d60, float:1.9421981E38)
        L_0x0032:
            r0 = 2131436509(0x7f0b23dd, float:1.849489E38)
            android.widget.TextView r0 = X.AnonymousClass3MX.A0L(r4, r0)
            r0.setText(r1)
            r0 = 2131436508(0x7f0b23dc, float:1.8494888E38)
            X.AnonymousClass3MX.A1H(r4, r0, r3)
            r4.BhQ(r1)
        L_0x0045:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x004e
            X.1QS r0 = r4.A04
            r0.A09(r2, r2)
        L_0x004e:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0065
            int r1 = r4.A07
            r0 = 2
            if (r1 != r0) goto L_0x0065
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = "extra_remove_payment_account"
            int r0 = r4.A07
            r2.putExtra(r1, r0)
            X.C72453Mb.A16(r4, r2)
        L_0x0065:
            return
        L_0x0066:
            r1 = 2131893599(0x7f121d5f, float:1.942198E38)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentDeleteAccountActivity.C3Y(X.9dd):void");
    }

    public PaymentDeleteAccountActivity(int i) {
        this.A08 = false;
        AGD.A00(this, 45);
    }

    public void A3h(int i) {
        C72453Mb.A14(this);
    }

    public void C3L(A7B a7b) {
        BhQ(2131893599);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(2131431413);
        int i = 0;
        if (configuration.orientation == 2) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    public PaymentDeleteAccountActivity() {
        this(0);
        this.A09 = AnonymousClass1QE.A00("PaymentDeleteAccountActivity", "payment-settings", "COMMON");
    }
}
