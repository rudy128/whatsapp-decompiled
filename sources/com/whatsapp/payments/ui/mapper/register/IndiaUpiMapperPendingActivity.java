package com.whatsapp.payments.ui.mapper.register;

import X.AFR;
import X.AGE;
import X.AZ6;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FY;
import X.AnonymousClass8BU;
import X.AnonymousClass8BX;
import X.AnonymousClass9R2;
import X.C137116uw;
import X.C17880vN;
import X.C18070vi;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public final class IndiaUpiMapperPendingActivity extends AnonymousClass1FY {
    public AZ6 A00;
    public boolean A01;

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A00 = AnonymousClass8BU.A0T(r2);
        }
    }

    public IndiaUpiMapperPendingActivity(int i) {
        this.A01 = false;
        AGE.A00(this, 9);
    }

    public void onBackPressed() {
        super.onBackPressed();
        AZ6 az6 = this.A00;
        if (az6 != null) {
            az6.BiL(1, "pending_alias_setup", AnonymousClass8BX.A0Y(this), 1);
        } else {
            C18070vi.A11("indiaUpiFieldStatsLogger");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        AnonymousClass8BX.A0u(this);
        setContentView(2131625636);
        AnonymousClass9R2.A00(this, 2131232759);
        View findViewById = findViewById(2131432298);
        View findViewById2 = findViewById(2131432300);
        AFR.A00(findViewById, this, 2);
        AFR.A00(findViewById2, this, 3);
        AZ6 az6 = this.A00;
        if (az6 != null) {
            Intent intent = getIntent();
            if (intent != null) {
                str = intent.getStringExtra("extra_referral_screen");
            } else {
                str = null;
            }
            az6.BiL((Integer) null, "pending_alias_setup", str, 0);
            return;
        }
        C18070vi.A11("indiaUpiFieldStatsLogger");
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) == 16908332) {
            AZ6 az6 = this.A00;
            if (az6 != null) {
                az6.BiL(C17880vN.A0j(), "pending_alias_setup", AnonymousClass8BX.A0Y(this), 1);
            } else {
                C18070vi.A11("indiaUpiFieldStatsLogger");
                throw null;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiMapperPendingActivity() {
        this(0);
    }
}
