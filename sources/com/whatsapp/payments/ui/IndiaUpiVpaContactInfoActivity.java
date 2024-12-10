package com.whatsapp.payments.ui;

import X.AGD;
import X.ALX;
import X.AXC;
import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FU;
import X.AnonymousClass1QE;
import X.AnonymousClass1QJ;
import X.AnonymousClass1R2;
import X.AnonymousClass1VW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4Yv;
import X.AnonymousClass4a6;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.C000200d;
import X.C003401n;
import X.C108975cc;
import X.C137116uw;
import X.C1418477e;
import X.C196199uc;
import X.C20155A9r;
import X.C31061ex;
import X.C63932tv;
import X.C72453Mb;
import X.C72463Mc;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.CopyableTextView;

public class IndiaUpiVpaContactInfoActivity extends AnonymousClass1FU implements View.OnClickListener {
    public AnonymousClass1VW A00;
    public C196199uc A01;
    public ALX A02;
    public C31061ex A03;
    public AnonymousClass1QJ A04;
    public AnonymousClass1R2 A05;
    public View A06;
    public LinearLayout A07;
    public C1418477e A08;
    public C1418477e A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public final AnonymousClass1QE A0F;

    public static void A0Q(IndiaUpiVpaContactInfoActivity indiaUpiVpaContactInfoActivity, boolean z) {
        IndiaUpiVpaContactInfoActivity indiaUpiVpaContactInfoActivity2 = indiaUpiVpaContactInfoActivity;
        C196199uc r1 = indiaUpiVpaContactInfoActivity.A01;
        C31061ex r4 = indiaUpiVpaContactInfoActivity.A03;
        String str = (String) AnonymousClass8BT.A0q(indiaUpiVpaContactInfoActivity.A08);
        str.getClass();
        r1.A01(indiaUpiVpaContactInfoActivity2, new AXC(indiaUpiVpaContactInfoActivity2, z), r4, str, z);
    }

    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            return super.onCreateDialog(i);
        }
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0S(C108975cc.A0b(this, AnonymousClass8BT.A0q(this.A09), new Object[1], 2131887202));
        return C73203Rj.A00(new C20155A9r(this, 18), A002, 2131887168);
    }

    private Intent A03() {
        Intent A002 = this.A02.A00(this, false, true);
        A002.putExtra("referral_screen", this.A0B);
        A002.putExtra("extra_payment_handle", this.A08);
        A002.putExtra("extra_payment_handle_id", this.A0C);
        A002.putExtra("extra_payee_name", this.A09);
        A002.putExtra("extra_merchant_code", this.A0A);
        return A002;
    }

    public static void A0V(IndiaUpiVpaContactInfoActivity indiaUpiVpaContactInfoActivity, boolean z) {
        int i;
        indiaUpiVpaContactInfoActivity.A0E = z;
        ImageView A0I = AnonymousClass3MX.A0I(indiaUpiVpaContactInfoActivity, 2131428228);
        TextView A0L = AnonymousClass3MX.A0L(indiaUpiVpaContactInfoActivity, 2131428229);
        int i2 = 8;
        indiaUpiVpaContactInfoActivity.A06.setVisibility(C72453Mb.A01(z ? 1 : 0));
        LinearLayout linearLayout = indiaUpiVpaContactInfoActivity.A07;
        if (!z) {
            i2 = 0;
        }
        linearLayout.setVisibility(i2);
        if (z) {
            A0I.setColorFilter(AnonymousClass3Ma.A00(indiaUpiVpaContactInfoActivity, 2130969324, 2131100309));
            C72463Mc.A0y(indiaUpiVpaContactInfoActivity, A0L, 2130969324, 2131100309);
            i = 2131897273;
        } else {
            A0I.setColorFilter(AnonymousClass3Ma.A00(indiaUpiVpaContactInfoActivity, 2130970925, 2131102369));
            C72463Mc.A0y(indiaUpiVpaContactInfoActivity, A0L, 2130970925, 2131102369);
            i = 2131887168;
        }
        A0L.setText(i);
    }

    public void A2y() {
        if (!this.A0D) {
            this.A0D = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            this.A0G = C000200d.A00(r1.A5A);
            this.A00 = AnonymousClass3MZ.A0e(r2);
            this.A05 = AnonymousClass8BU.A0V(r2);
            this.A03 = AnonymousClass8BU.A0R(r2);
            this.A04 = AnonymousClass8BV.A0G(r2);
            this.A02 = (ALX) r2.AcF.get();
            this.A01 = (C196199uc) r1.A2l.get();
        }
    }

    public IndiaUpiVpaContactInfoActivity(int i) {
        this.A0D = false;
        AGD.A00(this, 33);
    }

    public void onClick(View view) {
        Intent A032;
        String str;
        int i;
        if (view.getId() == 2131435188) {
            AnonymousClass1QE r2 = this.A0F;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("send payment to vpa: ");
            AnonymousClass8BV.A1D(r2, this.A08, A10);
            A032 = A03();
            str = "extra_transfer_direction";
            i = 0;
        } else if (view.getId() == 2131434600) {
            AnonymousClass1QE r22 = this.A0F;
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("request payment from vpa: ");
            AnonymousClass8BV.A1D(r22, this.A08, A102);
            A032 = A03();
            str = "extra_transfer_direction";
            i = 1;
        } else if (view.getId() == 2131428227) {
            boolean z = this.A0E;
            AnonymousClass1QE r23 = this.A0F;
            StringBuilder A103 = AnonymousClass000.A10();
            if (z) {
                A103.append("unblock vpa: ");
                AnonymousClass8BV.A1D(r23, this.A08, A103);
                A0Q(this, false);
                return;
            }
            A103.append("block vpa: ");
            AnonymousClass8BV.A1D(r23, this.A08, A103);
            AnonymousClass4Yv.A01(this, 1);
            return;
        } else {
            return;
        }
        A032.putExtra(str, i);
        startActivity(A032);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131625697);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
            supportActionBar.A0M(2131897463);
        }
        this.A08 = (C1418477e) getIntent().getParcelableExtra("extra_payment_handle");
        this.A0C = getIntent().getStringExtra("extra_payment_handle_id");
        this.A09 = (C1418477e) getIntent().getParcelableExtra("extra_payee_name");
        this.A0B = AnonymousClass8BV.A0p(this);
        this.A0A = getIntent().getStringExtra("extra_merchant_code");
        this.A06 = findViewById(2131433652);
        findViewById(2131435188).setOnClickListener(this);
        findViewById(2131434600).setOnClickListener(this);
        this.A07 = (LinearLayout) findViewById(2131435146);
        CopyableTextView copyableTextView = (CopyableTextView) findViewById(2131427420);
        AnonymousClass3MY.A0y(this, copyableTextView, new Object[]{AnonymousClass8BT.A0q(this.A08)}, 2131898300);
        copyableTextView.A02 = (String) AnonymousClass8BT.A0q(this.A08);
        AnonymousClass8BR.A1E(AnonymousClass3MX.A0L(this, 2131436947), AnonymousClass8BT.A0q(this.A09));
        this.A00.A09(AnonymousClass3MX.A0I(this, 2131427946), 2131231047);
        View findViewById = findViewById(2131428227);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(this);
        A0V(this, this.A01.A04(this.A08));
    }

    public IndiaUpiVpaContactInfoActivity() {
        this(0);
        this.A0F = AnonymousClass1QE.A00("IndiaUpiVpaContactInfoActivity", "payment-settings", "IN");
    }
}
