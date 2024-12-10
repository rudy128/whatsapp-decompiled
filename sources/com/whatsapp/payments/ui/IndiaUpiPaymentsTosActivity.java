package com.whatsapp.payments.ui;

import X.A7B;
import X.ADT;
import X.AFP;
import X.AFT;
import X.AGD;
import X.AZ6;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass12E;
import X.AnonymousClass1K1;
import X.AnonymousClass1QE;
import X.AnonymousClass1QK;
import X.AnonymousClass1QM;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.C000200d;
import X.C108965cb;
import X.C137116uw;
import X.C171858sO;
import X.C1764594h;
import X.C17880vN;
import X.C186089dd;
import X.C196259ui;
import X.C19967A1c;
import X.C20031A4a;
import X.C20154A9q;
import X.C20752AXh;
import X.C21447AkE;
import X.C33661jB;
import X.C36401np;
import X.C60442o2;
import X.C63662tU;
import X.C63932tv;
import X.C73203Rj;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.TextEmojiLabel;

public class IndiaUpiPaymentsTosActivity extends AnonymousClass91T implements C33661jB {
    public C20752AXh A00;
    public C20031A4a A01;
    public C1764594h A02;
    public C36401np A03;
    public AnonymousClass00H A04;
    public AnonymousClass1QM A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C171858sO A09;
    public final AnonymousClass1QE A0A;

    public static void A03(IndiaUpiPaymentsTosActivity indiaUpiPaymentsTosActivity) {
        ADT A042 = indiaUpiPaymentsTosActivity.A0Q.A04();
        if (A042 != null) {
            String str = A042.A02;
            if (!TextUtils.isEmpty(str) && str.startsWith("tos_upgrade_step_up")) {
                indiaUpiPaymentsTosActivity.A0Q.A08();
            }
        }
        indiaUpiPaymentsTosActivity.A0K.A0A(indiaUpiPaymentsTosActivity.A05);
        indiaUpiPaymentsTosActivity.setResult(-1);
        if (indiaUpiPaymentsTosActivity.A06) {
            Intent A043 = AnonymousClass8BS.A04(indiaUpiPaymentsTosActivity);
            indiaUpiPaymentsTosActivity.A4v(A043);
            A043.putExtra("extra_previous_screen", "tos_page");
            C60442o2.A00(A043, indiaUpiPaymentsTosActivity.A05, "tosAccept");
            indiaUpiPaymentsTosActivity.A3q(A043, true);
            return;
        }
        indiaUpiPaymentsTosActivity.finish();
    }

    public static void A0Q(IndiaUpiPaymentsTosActivity indiaUpiPaymentsTosActivity, int i) {
        indiaUpiPaymentsTosActivity.A02.A00.A0C(3);
        indiaUpiPaymentsTosActivity.A0S.reset();
        C20031A4a.A01(indiaUpiPaymentsTosActivity.A01);
        indiaUpiPaymentsTosActivity.A0A.A0A("showErrorAndFinish", (Throwable) null);
        indiaUpiPaymentsTosActivity.findViewById(2131434180).setVisibility(4);
        C19967A1c A022 = indiaUpiPaymentsTosActivity.A00.A02((C196259ui) null, i);
        if (A022.A00 != 0) {
            String A002 = A022.A00(indiaUpiPaymentsTosActivity);
            LegacyMessageDialogFragment legacyMessageDialogFragment = new LegacyMessageDialogFragment();
            legacyMessageDialogFragment.A1R(AnonymousClass8BX.A0E(A002));
            AnonymousClass3MY.A1H(legacyMessageDialogFragment, indiaUpiPaymentsTosActivity, (String) null);
            return;
        }
        indiaUpiPaymentsTosActivity.BhQ(2131894081);
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
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
            this.A04 = C000200d.A00(r2.A3v);
            this.A03 = AnonymousClass3MY.A0e(r1);
            this.A01 = (C20031A4a) r2.AcX.get();
            this.A00 = AnonymousClass8BU.A0M(r1);
            this.A02 = (C1764594h) r1.ACM.get();
        }
    }

    public void C3L(A7B a7b) {
        AnonymousClass1QE r2 = this.A0A;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("got request error for accept-tos: ");
        r2.A05(C17880vN.A0t(A10, a7b.A00));
        A0Q(this, a7b.A00);
    }

    public void C3X(A7B a7b) {
        AnonymousClass1QE r2 = this.A0A;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("got response error for accept-tos: ");
        AnonymousClass8BV.A1F(r2, A10, a7b.A00);
        A0Q(this, a7b.A00);
    }

    public void C3Y(C186089dd r5) {
        AnonymousClass1QE r2 = this.A0A;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("got response for accept-tos: ");
        AnonymousClass8BW.A1D(r2, A10, r5.A02);
        if (!C17880vN.A1W(this.A0Q.A03(), "payment_usync_triggered")) {
            AnonymousClass10I r22 = this.A05;
            AnonymousClass12E r1 = this.A04;
            r1.getClass();
            C21447AkE.A01(r22, r1, 3);
            C17880vN.A1F(AnonymousClass8BU.A07(this.A0Q), "payment_usync_triggered", true);
        }
        if (!this.A05.A03.equals("tos_no_wallet")) {
            return;
        }
        if (r5.A00) {
            this.A02.A00.A0C(3);
            C73203Rj A002 = AnonymousClass4a6.A00(this);
            A002.A0D(2131894082);
            C20154A9q.A00(A002, this, 43, 2131899286);
            A002.A0C();
            return;
        }
        A03(this);
    }

    public void onBackPressed() {
        if (this.A08) {
            setResult(0);
            finish();
            return;
        }
        super.onBackPressed();
        C171858sO r1 = this.A09;
        r1.A07 = C17880vN.A0j();
        r1.A08 = C17880vN.A0h();
        AZ6.A02(r1, this);
        this.A02.A00.A0C(4);
    }

    public IndiaUpiPaymentsTosActivity(int i) {
        this.A07 = false;
        AGD.A00(this, 18);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(2131431412);
        int i = 0;
        if (configuration.orientation == 2) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    public void onCreate(Bundle bundle) {
        C171858sO r2;
        boolean z;
        super.onCreate(bundle);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("stepName");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.A05 = this.A0K.A04(stringExtra);
                this.A06 = true;
            } else {
                this.A05 = this.A0K.A04("tos_no_wallet");
            }
            this.A03 = getIntent().getIntExtra("extra_setup_mode", 1);
        }
        setContentView(2131625665);
        A4s(2131893788, 2131434837);
        TextView A0L = AnonymousClass3MX.A0L(this, 2131436208);
        if (getIntent() == null || !getIntent().getBooleanExtra("extra_show_updated_tos", false)) {
            A0L.setText(2131894083);
            r2 = this.A09;
            z = false;
        } else {
            this.A08 = true;
            A0L.setText(2131894084);
            r2 = this.A09;
            z = true;
        }
        r2.A01 = z;
        AFP.A00(findViewById(2131431961), this, 29);
        TextEmojiLabel A0H = AnonymousClass8BR.A0H(this, 2131433700);
        String[] strArr = new String[3];
        AnonymousClass8BW.A17(this.A03, "https://www.whatsapp.com/legal/payments/india/terms", strArr, 0);
        AnonymousClass8BW.A17(this.A03, "https://www.whatsapp.com/legal/payments/india/privacy-policy", strArr, 1);
        AnonymousClass8BW.A17(this.A03, "https://www.whatsapp.com/legal/payments/india/psp", strArr, 2);
        Runnable[] runnableArr = {C21447AkE.A00(this, 46), C21447AkE.A00(this, 47), C21447AkE.A00(this, 48)};
        SpannableString A042 = this.A03.A04(A0H.getContext(), getString(2131894077), runnableArr, new String[]{"terms", "privacy-policy", "payment-provider-terms"}, strArr);
        AnonymousClass3Ma.A1K(A0H, this.A08);
        AnonymousClass3Ma.A1L(this.A0E, A0H);
        A0H.setText(A042);
        View findViewById = findViewById(2131433699);
        findViewById.setOnClickListener(new AFT(this, findViewById, 19));
        AnonymousClass1QE r3 = this.A0A;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("onCreate step: ");
        AnonymousClass8BV.A1D(r3, this.A05, A10);
        AZ6 az6 = this.A0S;
        az6.reset();
        r2.A0b = "tos_page";
        r2.A08 = 0;
        r2.A0Y = this.A0c;
        r2.A0a = this.A0f;
        az6.BiH(r2);
        if (AnonymousClass8BS.A1M(this.A0E)) {
            this.A0X = AnonymousClass8BX.A0M(this);
        }
        onConfigurationChanged(C108965cb.A03(this));
        this.A0Q.A09();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0Q.A08(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            C171858sO r1 = this.A09;
            r1.A07 = C17880vN.A0j();
            r1.A08 = C17880vN.A0h();
            AZ6.A02(r1, this);
            this.A02.A00.A0C(4);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A08 = bundle.getBoolean("extra_show_updated_tos");
    }

    public void onResume() {
        super.onResume();
        this.A02.A00.A08("tosShown");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("extra_show_updated_tos", this.A08);
    }

    public IndiaUpiPaymentsTosActivity() {
        this(0);
        this.A05 = AnonymousClass1QK.A05;
        this.A06 = false;
        this.A08 = false;
        this.A09 = new C171858sO();
        this.A0A = AnonymousClass1QE.A00("IndiaUpiPaymentsTosActivity", "onboarding", "IN");
    }
}
