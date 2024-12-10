package com.whatsapp.payments.ui;

import X.AEC;
import X.AFP;
import X.AGD;
import X.AH1;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass192;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1QE;
import X.AnonymousClass3MX;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BX;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.C003401n;
import X.C137116uw;
import X.C1418477e;
import X.C175648z3;
import X.C175658z4;
import X.C20008A2y;
import X.C20112A7u;
import X.C20337AGt;
import X.C30931ek;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel;

public class IndiaUpiNumberSettingsActivity extends AnonymousClass91T {
    public ImageView A00;
    public ImageView A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public ConstraintLayout A07;
    public ConstraintLayout A08;
    public AnonymousClass192 A09;
    public C1418477e A0A;
    public AEC A0B;
    public C175658z4 A0C;
    public C175648z3 A0D;
    public C20008A2y A0E;
    public IndiaUpiNumberSettingsViewModel A0F;
    public C30931ek A0G;
    public boolean A0H;
    public final AnonymousClass1QE A0I;

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        this.A0S.BiL((Integer) null, "alias_info", AnonymousClass8BV.A0p(this), 0);
        AnonymousClass8BX.A0u(this);
        this.A0B = (AEC) getIntent().getParcelableExtra("extra_payment_upi_alias");
        this.A0A = (C1418477e) getIntent().getParcelableExtra("extra_payment_name");
        setContentView(2131625597);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            AEC aec = this.A0B;
            if (aec != null) {
                String str = aec.A03;
                if (!str.equals("numeric_id")) {
                    i = 2131897593;
                    if (!str.equals("mobile_number")) {
                        i = 2131897594;
                    }
                } else {
                    i = 2131897592;
                }
                supportActionBar.A0M(i);
            }
            supportActionBar.A0W(true);
        }
        this.A08 = (ConstraintLayout) findViewById(2131436569);
        this.A00 = AnonymousClass3MX.A0I(this, 2131436570);
        this.A06 = AnonymousClass3MX.A0L(this, 2131436578);
        this.A01 = AnonymousClass3MX.A0I(this, 2131436577);
        this.A07 = (ConstraintLayout) findViewById(2131435415);
        this.A02 = (LinearLayout) findViewById(2131434491);
        this.A03 = (LinearLayout) findViewById(2131436576);
        this.A05 = AnonymousClass3MX.A0L(this, 2131436574);
        this.A04 = AnonymousClass3MX.A0L(this, 2131432056);
        IndiaUpiNumberSettingsViewModel indiaUpiNumberSettingsViewModel = (IndiaUpiNumberSettingsViewModel) AnonymousClass8BR.A0C(new AH1(this, 1), this).A00(IndiaUpiNumberSettingsViewModel.class);
        this.A0F = indiaUpiNumberSettingsViewModel;
        C20337AGt.A00(this, indiaUpiNumberSettingsViewModel.A00, 17);
        AnonymousClass1KB r6 = this.A05;
        C30931ek r11 = this.A0G;
        this.A0C = new C175658z4(this, r6, this.A0M, AnonymousClass8BT.A0S(this), this.A0N, this.A0S, r11);
        this.A0D = new C175648z3(this, this.A05, AnonymousClass8BT.A0M(this), this.A0M, AnonymousClass8BT.A0S(this), this.A0N, this.A0G);
        AFP.A00(this.A02, this, 5);
        AFP.A00(this.A03, this, 6);
    }

    public static void A03(IndiaUpiNumberSettingsActivity indiaUpiNumberSettingsActivity, String str) {
        if (indiaUpiNumberSettingsActivity.A0B != null) {
            C20112A7u A022 = C20112A7u.A02();
            A022.A07("alias_type", indiaUpiNumberSettingsActivity.A0B.A03);
            A022.A07("alias_status", str);
            indiaUpiNumberSettingsActivity.A0S.BiM(A022, 165, "alias_info", AnonymousClass8BV.A0p(indiaUpiNumberSettingsActivity), 1);
        }
    }

    public void A2y() {
        if (!this.A0H) {
            this.A0H = true;
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
            this.A09 = (AnonymousClass192) r2.A31.get();
            this.A0G = AnonymousClass8BT.A0V(r2);
            this.A0E = (C20008A2y) r2.AW4.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r2.equals("numeric_id") == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r4) {
        /*
            r3 = this;
            r0 = 38
            if (r4 == r0) goto L_0x0009
            android.app.Dialog r0 = super.onCreateDialog(r4)
            return r0
        L_0x0009:
            X.AEC r0 = r3.A0B
            if (r0 == 0) goto L_0x0023
            java.lang.String r2 = r0.A03
            int r1 = r2.hashCode()
            r0 = -1660330099(0xffffffff9d095f8d, float:-1.8181198E-21)
            if (r1 != r0) goto L_0x0023
            java.lang.String r0 = "numeric_id"
            boolean r0 = r2.equals(r0)
            r1 = 2131897442(0x7f122c62, float:1.9429774E38)
            if (r0 != 0) goto L_0x0026
        L_0x0023:
            r1 = 2131897586(0x7f122cf2, float:1.9430066E38)
        L_0x0026:
            X.3Rj r2 = X.AnonymousClass4a6.A00(r3)
            r0 = 2131897587(0x7f122cf3, float:1.9430068E38)
            r2.A0E(r0)
            r2.A0D(r1)
            r1 = 2131895092(0x7f122334, float:1.9425007E38)
            r0 = 17
            X.C20154A9q.A00(r2, r3, r0, r1)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 18
            X.C20154A9q.A01(r2, r3, r0, r1)
            X.05w r0 = r2.create()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity.onCreateDialog(int):android.app.Dialog");
    }

    public IndiaUpiNumberSettingsActivity(int i) {
        this.A0H = false;
        AGD.A00(this, 9);
    }

    public IndiaUpiNumberSettingsActivity() {
        this(0);
        this.A0I = AnonymousClass1QE.A00("IndiaUpiNumberSettingsActivity", "onboarding", "IN");
    }
}
