package com.whatsapp.accountsync;

import X.AGB;
import X.AnonymousClass10E;
import X.AnonymousClass11S;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C137116uw;
import X.C166998f9;
import X.C177769An;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.os.Bundle;

public class LoginActivity extends C166998f9 {
    public AnonymousClass1KB A00;
    public AnonymousClass11S A01;
    public AnonymousClass1LU A02;
    public boolean A03;

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E r1 = C137116uw.A00(this).AAQ;
            this.A05 = AnonymousClass10E.AL1(r1);
            this.A00 = AnonymousClass10E.A12(r1);
            this.A01 = AnonymousClass10E.A17(r1);
            this.A02 = AnonymousClass3MY.A0Z(r1);
        }
    }

    public LoginActivity(int i) {
        this.A03 = false;
        AGB.A00(this, 9);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131898700);
        setContentView(2131625914);
        boolean z = false;
        for (Account account : AccountManager.get(this).getAccounts()) {
            if ("com.whatsapp".contains(account.type)) {
                z = true;
            }
        }
        if (z) {
            this.A00.A08(2131886398, 1);
        } else if (AnonymousClass11S.A00(this.A01) == null) {
            startActivity(AnonymousClass1LU.A0A(this).putExtra("show_registration_first_dlg", true));
        } else {
            AnonymousClass3MW.A1T(new C177769An(this, this), this.A05, 0);
            return;
        }
        finish();
    }

    public LoginActivity() {
        this(0);
    }
}
