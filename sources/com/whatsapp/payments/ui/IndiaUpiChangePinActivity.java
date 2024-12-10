package com.whatsapp.payments.ui;

import X.A7B;
import X.AGC;
import X.AXS;
import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1QE;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4Yv;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8pN;
import X.AnonymousClass8pS;
import X.AnonymousClass91S;
import X.AnonymousClass91U;
import X.C003401n;
import X.C137116uw;
import X.C170278pb;
import X.C20061A5k;
import X.C20080A6g;
import X.C20752AXh;
import X.C21447AkE;
import X.C63662tU;
import X.C63932tv;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ProgressBar;
import android.widget.TextView;

public class IndiaUpiChangePinActivity extends AnonymousClass91S {
    public ProgressBar A00;
    public TextView A01;
    public AnonymousClass8pN A02;
    public String A03;
    public boolean A04;
    public final AnonymousClass1QE A05;

    public void Bwk(A7B a7b, String str) {
        Integer num;
        C170278pb r0;
        AnonymousClass8pN r02;
        this.A0S.A09(this.A02, a7b, 1);
        String str2 = str;
        if (!TextUtils.isEmpty(str) && (r02 = this.A02) != null && r02.A08 != null) {
            this.A03 = AXS.A01(this);
            this.A04.A01("upi-get-credential");
            AnonymousClass8pN r03 = this.A02;
            A5C((AnonymousClass8pS) r03.A08, str2, r03.A0B, this.A03, (String) C20061A5k.A01(r03.A09), 2);
        } else if (a7b != null && !C20752AXh.A01(this, "upi-list-keys", a7b.A00, true)) {
            if (this.A04.A05("upi-list-keys")) {
                this.A0N.A0K();
                this.A05.A08(2131894072, 1);
                A5A(this.A02.A08);
                return;
            }
            AnonymousClass1QE r3 = this.A05;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("IndiaUpiChangePinActivity: onListKeys: ");
            if (str != null) {
                num = AnonymousClass8BT.A0j(str);
            } else {
                num = null;
            }
            A10.append(num);
            A10.append(" bankAccount: ");
            A10.append(this.A02);
            A10.append(" countrydata: ");
            AnonymousClass8pN r04 = this.A02;
            if (r04 != null) {
                r0 = r04.A08;
            } else {
                r0 = null;
            }
            A10.append(r0);
            r3.A08("payment-settings", AnonymousClass000.A0y(" failed; ; showErrorAndFinish", A10), (Throwable) null);
            A56();
        }
    }

    public Dialog onCreateDialog(int i) {
        int i2;
        int i3;
        String str;
        int i4;
        this.A01.setVisibility(4);
        this.A00.setVisibility(4);
        int i5 = i;
        switch (i) {
            case 10:
                str = getString(2131893828);
                i3 = 2131898593;
                i2 = 2131892908;
                i4 = 12;
                break;
            case 11:
                str = getString(2131893944);
                i3 = 2131898593;
                i2 = 2131892908;
                i4 = 13;
                break;
            case 12:
                str = getString(2131893945);
                i3 = 2131898593;
                i2 = 2131892908;
                i4 = 14;
                break;
            case 13:
                this.A0N.A0L();
                str = getString(2131894038);
                i3 = 2131898593;
                i2 = 2131892908;
                i4 = 15;
                break;
            default:
                return super.onCreateDialog(i);
        }
        return A51(C21447AkE.A00(this, i4), str, i5, i3, i2);
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            AnonymousClass91U.A1V(r2, r1, this);
            AnonymousClass91U.A1Q(A002, r2, r1, this, r2.A7z);
            AnonymousClass91U.A1P(A002, r2, r1, AnonymousClass8BU.A0E(r2), this);
            AnonymousClass91U.A1Y(r2, this);
            AnonymousClass91U.A1W(r2, r1, this);
            AnonymousClass91U.A1T(A002, r2, r1, this);
        }
    }

    public void C5K(A7B a7b) {
        this.A0S.A09(this.A02, a7b, 7);
        if (a7b == null) {
            this.A05.A06("onSetPin success; showSuccessAndFinish");
            A4p();
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = C20080A6g.A01(this.A02);
            BhU(A1a, 0, 2131893829);
        } else if (!C20752AXh.A01(this, "upi-change-mpin", a7b.A00, true)) {
            int i = a7b.A00;
            int i2 = 10;
            if (i != 11459) {
                i2 = 11;
                if (i != 11468) {
                    i2 = 12;
                    if (i != 11454) {
                        if (i == 11456 || i == 11471) {
                            i2 = 13;
                        } else {
                            this.A05.A06(" onSetPin failed; showErrorAndFinish");
                            A56();
                            return;
                        }
                    }
                }
            }
            AnonymousClass4Yv.A01(this, i2);
        }
    }

    public IndiaUpiChangePinActivity(int i) {
        this.A04 = false;
        AGC.A00(this, 48);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131625672);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            AnonymousClass8BV.A17(supportActionBar, this.A00.A0A(2131893830));
        }
        this.A01 = AnonymousClass3MX.A0L(this, 2131433702);
        this.A00 = (ProgressBar) findViewById(2131434180);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        AnonymousClass8pN r0 = (AnonymousClass8pN) bundle.getParcelable("bankAccountSavedInst");
        this.A02 = r0;
        if (r0 != null) {
            this.A02.A08 = (C170278pb) bundle.getParcelable("countryDataSavedInst");
        }
        this.A03 = bundle.getString("seqNumSavedInst");
    }

    public void onResume() {
        super.onResume();
        AnonymousClass1QE r2 = this.A05;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("onResume with states: ");
        AnonymousClass8BV.A1D(r2, this.A04, A10);
        if (!this.A04.A07.contains("upi-get-challenge") && this.A0N.A0E().A00 == null) {
            this.A04.A01("upi-get-challenge");
            A53();
        } else if (!this.A04.A07.contains("upi-get-challenge")) {
            A57();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C170278pb r1;
        super.onSaveInstanceState(bundle);
        AnonymousClass8pN r12 = this.A02;
        if (r12 != null) {
            bundle.putParcelable("bankAccountSavedInst", r12);
        }
        AnonymousClass8pN r0 = this.A02;
        if (!(r0 == null || (r1 = r0.A08) == null)) {
            bundle.putParcelable("countryDataSavedInst", r1);
        }
        String str = this.A03;
        if (str != null) {
            bundle.putString("seqNumSavedInst", str);
        }
    }

    public IndiaUpiChangePinActivity() {
        this(0);
        this.A05 = AnonymousClass1QE.A00("IndiaUpiChangePinActivity", "payment-settings", "IN");
    }
}
