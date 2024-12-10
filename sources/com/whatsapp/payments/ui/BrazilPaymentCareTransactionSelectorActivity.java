package com.whatsapp.payments.ui;

import X.AGC;
import X.AW0;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass181;
import X.AnonymousClass1D9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1QJ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass6MW;
import X.AnonymousClass8BT;
import X.AnonymousClass8BV;
import X.AnonymousClass9YJ;
import X.BD4;
import X.C003401n;
import X.C108965cb;
import X.C132216mP;
import X.C137116uw;
import X.C166928eK;
import X.C17880vN;
import X.C17960vV;
import X.C20284AEs;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;
import android.widget.TextView;

public class BrazilPaymentCareTransactionSelectorActivity extends PaymentTransactionHistoryActivity {
    public C132216mP A00;
    public AnonymousClass181 A01;
    public AnonymousClass1M9 A02;
    public AnonymousClass1D9 A03;
    public AnonymousClass1LU A04;
    public AnonymousClass1QJ A05;
    public BD4 A06;
    public AnonymousClass6MW A07;
    public boolean A08;

    public static AnonymousClass6MW A0Q(BrazilPaymentCareTransactionSelectorActivity brazilPaymentCareTransactionSelectorActivity) {
        BrazilPaymentCareTransactionSelectorActivity brazilPaymentCareTransactionSelectorActivity2 = brazilPaymentCareTransactionSelectorActivity;
        AnonymousClass6MW r0 = brazilPaymentCareTransactionSelectorActivity.A07;
        if (r0 != null && r0.A09() == 1) {
            brazilPaymentCareTransactionSelectorActivity.A07.A0B(false);
        }
        Bundle A0D = C17880vN.A0D();
        A0D.putString("com.whatsapp.support.DescribeProblemActivity.from", "payments:settings");
        AnonymousClass1LU r10 = brazilPaymentCareTransactionSelectorActivity2.A04;
        AnonymousClass181 r5 = brazilPaymentCareTransactionSelectorActivity2.A01;
        AnonymousClass6MW r02 = new AnonymousClass6MW(A0D, brazilPaymentCareTransactionSelectorActivity2, brazilPaymentCareTransactionSelectorActivity2.A00, brazilPaymentCareTransactionSelectorActivity2.A06, r5, brazilPaymentCareTransactionSelectorActivity2.A04, (C20284AEs) null, (AW0) null, brazilPaymentCareTransactionSelectorActivity2.A03, r10, brazilPaymentCareTransactionSelectorActivity2.A05, "payments:settings");
        brazilPaymentCareTransactionSelectorActivity2.A07 = r02;
        return r02;
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            C166928eK.A03(r2, r1, this, r2.ABz);
            this.A02 = AnonymousClass10E.A4z(r2);
            this.A04 = AnonymousClass3MY.A0Z(r2);
            this.A03 = AnonymousClass8BT.A0J(r2);
            this.A05 = AnonymousClass8BV.A0G(r2);
            this.A00 = AnonymousClass8BT.A0A(r1);
            this.A01 = C108965cb.A0H(r2);
            this.A06 = AnonymousClass8BT.A0T(r1);
        }
    }

    public BrazilPaymentCareTransactionSelectorActivity(int i) {
        this.A08 = false;
        AGC.A00(this, 22);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C003401n supportActionBar = getSupportActionBar();
        C17960vV.A07(supportActionBar);
        supportActionBar.A0M(2131887950);
        this.A0C.A00 = new AnonymousClass9YJ(this);
        TextView A0I = AnonymousClass3MW.A0I(this, 2131428323);
        A0I.setVisibility(0);
        A0I.setText(2131887949);
        AnonymousClass3Ma.A19(A0I, this, 46);
    }

    public BrazilPaymentCareTransactionSelectorActivity() {
        this(0);
    }
}
