package com.whatsapp.payments.ui.mapper.register;

import X.AFR;
import X.AGE;
import X.AXS;
import X.AZ6;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass1FY;
import X.AnonymousClass1VW;
import X.AnonymousClass1VX;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BX;
import X.AnonymousClass9R2;
import X.C137116uw;
import X.C1418477e;
import X.C17880vN;
import X.C18070vi;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.Me;

public final class IndiaUpiMapperConfirmationActivity extends AnonymousClass1FY {
    public ImageView A00;
    public AnonymousClass1VW A01;
    public AXS A02;
    public AZ6 A03;
    public boolean A04;

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A01 = AnonymousClass3MZ.A0e(r2);
            this.A03 = AnonymousClass8BU.A0T(r2);
            this.A02 = AnonymousClass8BT.A0Q(r2);
        }
    }

    public IndiaUpiMapperConfirmationActivity(int i) {
        this.A04 = false;
        AGE.A00(this, 8);
    }

    public void onBackPressed() {
        super.onBackPressed();
        AZ6 az6 = this.A03;
        if (az6 != null) {
            az6.BiL(1, "alias_complete", AnonymousClass8BX.A0Y(this), 1);
        } else {
            C18070vi.A11("indiaUpiFieldStatsLogger");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        String string;
        String str;
        String str2;
        super.onCreate(bundle);
        AnonymousClass8BX.A0u(this);
        setContentView(2131625633);
        AnonymousClass9R2.A00(this, 2131232759);
        TextView A0L = AnonymousClass3MX.A0L(this, 2131433599);
        C1418477e r0 = (C1418477e) getIntent().getParcelableExtra("extra_payment_name");
        if (r0 == null || (string = (String) r0.A00) == null) {
            string = this.A0B.A00.getString("push_name", "");
        }
        A0L.setText(string);
        int i = 3;
        if (AnonymousClass3MW.A1Z(this.A00)) {
            i = 5;
        }
        A0L.setGravity(i);
        View findViewById = findViewById(2131432291);
        TextView A0L2 = AnonymousClass3MX.A0L(this, 2131436946);
        TextView A0L3 = AnonymousClass3MX.A0L(this, 2131436943);
        ImageView imageView = (ImageView) AnonymousClass3MY.A0H(this, 2131434135);
        C18070vi.A0d(imageView, 0);
        this.A00 = imageView;
        AnonymousClass1VW r1 = this.A01;
        if (r1 != null) {
            r1.A0B(imageView, (AnonymousClass1VX) null, 2131231047);
            Resources resources = getResources();
            Object[] objArr = new Object[1];
            AXS axs = this.A02;
            if (axs != null) {
                A0L2.setText(AnonymousClass3MW.A0x(resources, axs.A0D().A00, objArr, 0, 2131898300));
                Resources resources2 = getResources();
                Object[] objArr2 = new Object[1];
                AnonymousClass11S r02 = this.A02;
                r02.A0I();
                Me me = r02.A00;
                if (me != null) {
                    str = me.number;
                } else {
                    str = null;
                }
                A0L3.setText(AnonymousClass3MW.A0x(resources2, str, objArr2, 0, 2131897589));
                AFR.A00(findViewById, this, 1);
                AZ6 az6 = this.A03;
                if (az6 != null) {
                    Intent intent = getIntent();
                    if (intent != null) {
                        str2 = intent.getStringExtra("extra_referral_screen");
                    } else {
                        str2 = null;
                    }
                    az6.BiL((Integer) null, "alias_complete", str2, 0);
                    return;
                }
                C18070vi.A11("indiaUpiFieldStatsLogger");
                throw null;
            }
            C18070vi.A11("paymentSharedPrefs");
            throw null;
        }
        C18070vi.A11("contactAvatars");
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) == 16908332) {
            AZ6 az6 = this.A03;
            if (az6 != null) {
                az6.BiL(C17880vN.A0j(), "alias_complete", AnonymousClass8BX.A0Y(this), 1);
            } else {
                C18070vi.A11("indiaUpiFieldStatsLogger");
                throw null;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiMapperConfirmationActivity() {
        this(0);
    }
}
