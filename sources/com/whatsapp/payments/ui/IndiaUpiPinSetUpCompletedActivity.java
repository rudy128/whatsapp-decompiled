package com.whatsapp.payments.ui;

import X.AFP;
import X.AGD;
import X.AZ6;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1HF;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8pS;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.C000200d;
import X.C003401n;
import X.C137116uw;
import X.C170278pb;
import X.C17880vN;
import X.C20284AEs;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;

public class IndiaUpiPinSetUpCompletedActivity extends AnonymousClass91T {
    public AnonymousClass00H A00;
    public boolean A01;

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
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
            this.A00 = C000200d.A00(r2.A87);
        }
    }

    public IndiaUpiPinSetUpCompletedActivity(int i) {
        this.A01 = false;
        AGD.A00(this, 23);
    }

    public void onBackPressed() {
        super.onBackPressed();
        AZ6.A04(this.A0S, C17880vN.A0j(), "pin_created");
    }

    public void onCreate(Bundle bundle) {
        C170278pb r2;
        getWindow().addFlags(DefaultCrypto.BUFFER_SIZE);
        super.onCreate(bundle);
        setContentView(2131625676);
        C20284AEs aEs = (C20284AEs) AnonymousClass91U.A1I(this);
        C003401n A1J = AnonymousClass91U.A1J(this);
        if (A1J != null) {
            AnonymousClass8BU.A17(A1J, 2131893788);
        }
        if (aEs == null || (r2 = aEs.A08) == null) {
            Log.e("Screen called without valid account, finishing");
            finish();
            return;
        }
        AnonymousClass8pS r22 = (AnonymousClass8pS) r2;
        View findViewById = findViewById(2131427428);
        AnonymousClass1HF.A06(findViewById, 2131434180).setVisibility(8);
        AnonymousClass3MY.A1A(findViewById, 2131430073, 8);
        AnonymousClass3MY.A1A(findViewById, 2131434311, 8);
        AnonymousClass91U.A1N(findViewById, aEs);
        AnonymousClass3MW.A0J(findViewById, 2131427431).setText(AnonymousClass8BR.A0c(this.A00).A03(aEs, false));
        AnonymousClass8BR.A1E(AnonymousClass3MW.A0J(findViewById, 2131427429), AnonymousClass8BT.A0q(r22.A02));
        AnonymousClass3MW.A0J(findViewById, 2131427464).setText(r22.A0C());
        if (getIntent().getBooleanExtra("on_settings_page", false)) {
            AnonymousClass3MX.A0L(this, 2131429535).setText(2131898925);
        }
        AFP.A00(findViewById(2131429535), this, 36);
        this.A0S.BiL((Integer) null, "pin_created", (String) null, 0);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            AZ6.A04(this.A0S, C17880vN.A0j(), "pin_created");
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiPinSetUpCompletedActivity() {
        this(0);
    }
}
