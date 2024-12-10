package com.whatsapp.payments.ui;

import X.AEC;
import X.AFP;
import X.AGD;
import X.AH1;
import X.AXS;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1QE;
import X.AnonymousClass3MX;
import X.AnonymousClass4Yv;
import X.AnonymousClass4a6;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.C003401n;
import X.C137116uw;
import X.C1418477e;
import X.C161798Hu;
import X.C175648z3;
import X.C175658z4;
import X.C184869be;
import X.C20008A2y;
import X.C20112A7u;
import X.C20154A9q;
import X.C20337AGt;
import X.C30931ek;
import X.C63662tU;
import X.C63932tv;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IndiaUpiProfileDetailsActivity extends AnonymousClass91T {
    public LinearLayout A00;
    public LinearLayout A01;
    public RecyclerView A02;
    public C1418477e A03;
    public C175658z4 A04;
    public C20008A2y A05;
    public IndiaUpiNumberSettingsViewModel A06;
    public C30931ek A07;
    public String A08;
    public ImageView A09;
    public LinearLayout A0A;
    public LinearLayout A0B;
    public LinearLayout A0C;
    public LinearLayout A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public ConstraintLayout A0I;
    public C175648z3 A0J;
    public Boolean A0K;
    public boolean A0L;
    public final AnonymousClass1QE A0M;

    public void onCreate(Bundle bundle) {
        C20112A7u a7u;
        super.onCreate(bundle);
        AnonymousClass8BX.A0u(this);
        this.A03 = (C1418477e) AnonymousClass8BS.A05(this, 2131625679).getParcelableExtra("extra_payment_name");
        this.A08 = AnonymousClass8BV.A0p(this);
        this.A0K = Boolean.valueOf(getIntent().getBooleanExtra("extra_mapper_recover_alias", false));
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0M(2131897616);
            supportActionBar.A0W(true);
        }
        this.A0M.A06("onCreate");
        AnonymousClass1KB r7 = this.A05;
        C30931ek r12 = this.A07;
        this.A04 = new C175658z4(this, r7, this.A0M, AnonymousClass8BT.A0S(this), this.A0N, this.A0S, r12);
        this.A0J = new C175648z3(this, this.A05, AnonymousClass8BT.A0M(this), this.A0M, AnonymousClass8BT.A0S(this), this.A0N, this.A07);
        TextView A0L2 = AnonymousClass3MX.A0L(this, 2131434152);
        this.A0H = A0L2;
        AnonymousClass8BR.A1E(A0L2, AnonymousClass8BT.A0q(this.A03));
        TextView A0L3 = AnonymousClass3MX.A0L(this, 2131434178);
        this.A0G = A0L3;
        AnonymousClass8BR.A1E(A0L3, this.A0N.A0D().A00);
        this.A0C = (LinearLayout) findViewById(2131435226);
        this.A0F = AnonymousClass3MX.A0L(this, 2131436574);
        this.A0E = AnonymousClass3MX.A0L(this, 2131436573);
        this.A09 = AnonymousClass3MX.A0I(this, 2131432054);
        this.A0A = (LinearLayout) findViewById(2131432055);
        this.A0B = (LinearLayout) findViewById(2131434491);
        this.A0I = (ConstraintLayout) findViewById(2131435415);
        this.A0D = (LinearLayout) findViewById(2131435335);
        this.A00 = (LinearLayout) findViewById(2131427652);
        this.A02 = (RecyclerView) findViewById(2131436579);
        this.A01 = (LinearLayout) findViewById(2131434422);
        AnonymousClass3MX.A0I(this, 2131436945).setImageDrawable(this.A0W.A0N(this, this.A0O.A02(), 2131102093, 2131167015));
        IndiaUpiNumberSettingsViewModel indiaUpiNumberSettingsViewModel = (IndiaUpiNumberSettingsViewModel) AnonymousClass8BR.A0C(new AH1(this, 2), this).A00(IndiaUpiNumberSettingsViewModel.class);
        this.A06 = indiaUpiNumberSettingsViewModel;
        C20337AGt.A00(this, indiaUpiNumberSettingsViewModel.A00, 22);
        AFP.A00(this.A0B, this, 37);
        AFP.A00(this.A0C, this, 38);
        AFP.A00(this.A00, this, 39);
        AFP.A00(this.A01, this, 40);
        if (bundle == null && this.A0K.booleanValue()) {
            A51(true);
            A0Q(this);
        }
        if (!A0V()) {
            A50(false);
        } else if (!this.A0K.booleanValue()) {
            A51(false);
        }
        if (A0V()) {
            a7u = A03(this);
        } else {
            a7u = null;
        }
        this.A0S.BiM(a7u, (Integer) null, "payments_profile", this.A08, 0);
    }

    public static void A0Q(IndiaUpiProfileDetailsActivity indiaUpiProfileDetailsActivity) {
        AEC A012;
        if (A0c(indiaUpiProfileDetailsActivity, 12) && (A012 = indiaUpiProfileDetailsActivity.A05.A01()) != null) {
            IndiaUpiNumberSettingsViewModel indiaUpiNumberSettingsViewModel = indiaUpiProfileDetailsActivity.A06;
            C175648z3 r5 = indiaUpiProfileDetailsActivity.A0J;
            indiaUpiNumberSettingsViewModel.A0T(indiaUpiProfileDetailsActivity.A0N.A0D(), indiaUpiProfileDetailsActivity.A03, A012, r5, indiaUpiProfileDetailsActivity.A0N.A0J(), "active");
        }
    }

    private boolean A0V() {
        String A0I2 = this.A0E.A0I(2965);
        if (!TextUtils.isEmpty(A0I2)) {
            List A0t = AnonymousClass8BW.A0t(A0I2);
            String A022 = AXS.A02(this);
            if (!TextUtils.isEmpty(A022)) {
                return A0t.contains(A022);
            }
        }
        return false;
    }

    public static boolean A0c(IndiaUpiProfileDetailsActivity indiaUpiProfileDetailsActivity, int i) {
        if (!indiaUpiProfileDetailsActivity.A0N.A0S()) {
            return true;
        }
        Intent A0B2 = AnonymousClass8BX.A0B(indiaUpiProfileDetailsActivity);
        A0B2.putExtra("extra_payments_entry_type", i);
        A0B2.putExtra("extra_skip_value_props_display", false);
        A0B2.putExtra("extra_referral_screen", "payments_profile");
        A0B2.putExtra("extra_payment_name", indiaUpiProfileDetailsActivity.A03);
        indiaUpiProfileDetailsActivity.A4v(A0B2);
        indiaUpiProfileDetailsActivity.startActivity(A0B2);
        return false;
    }

    public void A2y() {
        if (!this.A0L) {
            this.A0L = true;
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
            this.A07 = AnonymousClass8BT.A0V(r2);
            this.A05 = (C20008A2y) r2.AW4.get();
        }
    }

    public void A51(boolean z) {
        this.A0A.setVisibility(8);
        this.A0C.setVisibility(8);
        this.A0I.setVisibility(8);
        ArrayList A022 = this.A05.A02();
        AEC A012 = this.A05.A01();
        if (!z && A012 != null) {
            A022.remove(A012);
        }
        int size = A022.size();
        int i = 0;
        RecyclerView recyclerView = this.A02;
        if (size == 0) {
            recyclerView.setVisibility(8);
        } else {
            recyclerView.setVisibility(0);
        }
        this.A02.setAdapter(new C161798Hu(new C184869be(this, A022), this, A022));
        boolean A072 = this.A05.A07();
        LinearLayout linearLayout = this.A00;
        if (A072) {
            if (A012 != null) {
                linearLayout.setVisibility(8);
                LinearLayout linearLayout2 = this.A01;
                if (z) {
                    i = 8;
                }
                linearLayout2.setVisibility(i);
                this.A00.setEnabled(!z);
            } else if (!this.A05.A06()) {
                i = 8;
            }
        }
        linearLayout.setVisibility(i);
        this.A01.setVisibility(8);
        this.A00.setEnabled(!z);
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj r2;
        if (i == 28) {
            r2 = AnonymousClass4a6.A00(this);
            r2.A0D(2131893867);
            C20154A9q.A00(r2, this, 47, 2131899286);
        } else if (i != 38) {
            return super.onCreateDialog(i);
        } else {
            this.A0S.BiL((Integer) null, "alias_remove_confirm_dialog", "payments_profile", 0);
            r2 = AnonymousClass4a6.A00(this);
            r2.A0E(2131897587);
            r2.A0D(2131897586);
            C20154A9q.A00(r2, this, 48, 2131895092);
            C20154A9q.A01(r2, this, 49, 2131898766);
        }
        return r2.create();
    }

    public IndiaUpiProfileDetailsActivity(int i) {
        this.A0L = false;
        AGD.A00(this, 24);
    }

    public static C20112A7u A03(IndiaUpiProfileDetailsActivity indiaUpiProfileDetailsActivity) {
        String str;
        C20112A7u A022 = C20112A7u.A02();
        Iterator it = indiaUpiProfileDetailsActivity.A05.A02().iterator();
        while (it.hasNext()) {
            AEC aec = (AEC) it.next();
            String str2 = aec.A03;
            if (str2.equals("numeric_id")) {
                str = "numeric_alias";
            } else if (str2.equals("mobile_number")) {
                str = "phone_num_alias";
            }
            A022.A07(str, aec.A02);
        }
        return A022;
    }

    public void A50(boolean z) {
        int i;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        if (A0V()) {
            A51(z);
            return;
        }
        this.A0D.setVisibility(8);
        if (z) {
            this.A0I.setVisibility(0);
            this.A0A.setVisibility(8);
            linearLayout = this.A0C;
        } else {
            ArrayList A022 = this.A05.A02();
            this.A0I.setVisibility(8);
            if (A022.size() == 0) {
                this.A0A.setVisibility(8);
                linearLayout2 = this.A0C;
            } else {
                AEC aec = (AEC) A022.get(0);
                this.A0C.setVisibility(8);
                this.A0A.setVisibility(0);
                AnonymousClass8BR.A1E(this.A0F, aec.A00.A00);
                TextView textView = this.A0E;
                String str = aec.A02;
                boolean equals = str.equals("active_pending");
                if (equals) {
                    i = 2131891707;
                } else {
                    i = 2131891705;
                    if (str.equals("deregistered_pending")) {
                        i = 2131891706;
                    }
                }
                textView.setText(i);
                if (equals || str.equals("deregistered_pending")) {
                    this.A09.setImageResource(2131232342);
                    linearLayout = this.A0B;
                } else {
                    this.A09.setImageResource(2131231742);
                    linearLayout2 = this.A0B;
                }
            }
            linearLayout2.setVisibility(0);
            return;
        }
        linearLayout.setVisibility(8);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0 && intent != null) {
            AnonymousClass4Yv.A01(this, 28);
        }
    }

    public void onResume() {
        super.onResume();
        A50(false);
    }

    public IndiaUpiProfileDetailsActivity() {
        this(0);
        this.A0M = AnonymousClass1QE.A00("IndiaUpiProfileDetailsActivity", "onboarding", "IN");
    }
}
