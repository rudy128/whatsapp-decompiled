package com.whatsapp.payments.ui;

import X.AFP;
import X.AGD;
import X.AXS;
import X.AnonymousClass00H;
import X.AnonymousClass026;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.AnonymousClass8pN;
import X.AnonymousClass8pS;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.C000200d;
import X.C137116uw;
import X.C17880vN;
import X.C18030ve;
import X.C185039bv;
import X.C20063A5m;
import X.C20112A7u;
import X.C26302CxJ;
import X.C63662tU;
import X.C63932tv;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.TextEmojiLabel;

public class IndiaUpiPinPrimerFullSheetActivity extends AnonymousClass91T {
    public int A00;
    public CountDownTimer A01;
    public AnonymousClass8pN A02;
    public C185039bv A03;
    public AnonymousClass00H A04;
    public String A05;
    public String A06;
    public boolean A07;

    public static void A0V(IndiaUpiPinPrimerFullSheetActivity indiaUpiPinPrimerFullSheetActivity) {
        String str;
        int i;
        IndiaUpiPinPrimerFullSheetActivity indiaUpiPinPrimerFullSheetActivity2 = indiaUpiPinPrimerFullSheetActivity;
        if (indiaUpiPinPrimerFullSheetActivity.A0O.A08(indiaUpiPinPrimerFullSheetActivity.A02)) {
            indiaUpiPinPrimerFullSheetActivity.A0Q();
        } else {
            AnonymousClass8pS r5 = (AnonymousClass8pS) indiaUpiPinPrimerFullSheetActivity.A02.A08;
            View findViewById = indiaUpiPinPrimerFullSheetActivity.findViewById(2131427428);
            AnonymousClass3MY.A1A(findViewById, 2131434180, 8);
            AnonymousClass3MY.A1A(findViewById, 2131430073, 8);
            AnonymousClass3MY.A1A(findViewById, 2131434311, 8);
            AnonymousClass91U.A1N(findViewById, indiaUpiPinPrimerFullSheetActivity.A02);
            AnonymousClass3MW.A0J(findViewById, 2131427431).setText(AnonymousClass8BR.A0c(indiaUpiPinPrimerFullSheetActivity.A04).A03(indiaUpiPinPrimerFullSheetActivity.A02, false));
            AnonymousClass8BR.A1E(AnonymousClass3MW.A0J(findViewById, 2131427429), AnonymousClass8BT.A0q(r5.A02));
            AnonymousClass3MW.A0J(findViewById, 2131427464).setText(r5.A0C());
        }
        if (AnonymousClass026.A00(indiaUpiPinPrimerFullSheetActivity.A06, "CREDIT")) {
            str = "https://faq.whatsapp.com/797709544841009";
        } else {
            str = "https://faq.whatsapp.com/general/payments/about-payments-data";
        }
        Uri parse = Uri.parse(str);
        C18030ve r13 = indiaUpiPinPrimerFullSheetActivity.A0E;
        AnonymousClass1KB r10 = indiaUpiPinPrimerFullSheetActivity.A05;
        AnonymousClass1L9 r9 = indiaUpiPinPrimerFullSheetActivity.A01;
        AnonymousClass11C r12 = indiaUpiPinPrimerFullSheetActivity.A08;
        TextEmojiLabel A0H = AnonymousClass8BR.A0H(indiaUpiPinPrimerFullSheetActivity, 2131433193);
        if (C20063A5m.A02(indiaUpiPinPrimerFullSheetActivity.A02)) {
            i = 2131894210;
        } else {
            i = 2131894213;
            if (indiaUpiPinPrimerFullSheetActivity.A0O.A08(indiaUpiPinPrimerFullSheetActivity.A02)) {
                i = 2131894209;
            }
        }
        C26302CxJ.A0K(indiaUpiPinPrimerFullSheetActivity2, parse, r9, r10, A0H, r12, r13, C17880vN.A0q(indiaUpiPinPrimerFullSheetActivity2, "learn-more", AnonymousClass3MW.A1a(), 0, i), "learn-more");
        AFP.A00(indiaUpiPinPrimerFullSheetActivity2.findViewById(2131429535), indiaUpiPinPrimerFullSheetActivity2, 35);
        boolean A022 = C20063A5m.A02(indiaUpiPinPrimerFullSheetActivity2.A02);
        View findViewById2 = indiaUpiPinPrimerFullSheetActivity2.findViewById(2131436568);
        if (A022) {
            findViewById2.setVisibility(8);
            AnonymousClass8BU.A18(indiaUpiPinPrimerFullSheetActivity2, 2131434767);
            return;
        }
        findViewById2.setVisibility(0);
    }

    public static Intent A03(Context context, AnonymousClass8pN r2, String str, boolean z) {
        String str2;
        Intent A09 = AnonymousClass8BW.A09(context, r2, IndiaUpiPinPrimerFullSheetActivity.class);
        A09.putExtra("extra_payment_method_type", str);
        if (z) {
            str2 = "forgot_pin";
        } else {
            str2 = "setup_pin";
        }
        A09.putExtra("event_screen", str2);
        return A09;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0Q() {
        /*
            r11 = this;
            android.view.View r1 = r11.A00
            r0 = 2131427419(0x7f0b005b, float:1.8476454E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            r2 = 8
            r0.setVisibility(r2)
            android.view.View r1 = r11.A00
            r0 = 2131427418(0x7f0b005a, float:1.8476452E38)
            X.AnonymousClass3MY.A1A(r1, r0, r2)
            android.view.View r1 = r11.A00
            r0 = 2131427428(0x7f0b0064, float:1.8476472E38)
            X.AnonymousClass3MY.A1A(r1, r0, r2)
            android.view.View r1 = r11.A00
            r0 = 2131436701(0x7f0b249d, float:1.849528E38)
            X.1bI r0 = X.C28931bI.A00(r1, r0)
            android.view.View r5 = r0.A02()
            r0 = 2131429823(0x7f0b09bf, float:1.848133E38)
            android.view.View r4 = X.AnonymousClass1HF.A06(r5, r0)
            com.whatsapp.payments.ui.widget.PaymentMethodRow r4 = (com.whatsapp.payments.ui.widget.PaymentMethodRow) r4
            r0 = 2131427347(0x7f0b0013, float:1.8476308E38)
            android.view.View r3 = X.AnonymousClass1HF.A06(r5, r0)
            com.whatsapp.payments.ui.widget.PaymentMethodRow r3 = (com.whatsapp.payments.ui.widget.PaymentMethodRow) r3
            X.9bv r6 = r11.A03
            X.AXS r10 = r6.A01
            int r1 = r10.A0A()
            r0 = 2
            if (r1 < r0) goto L_0x00fe
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            r0 = 24
            long r8 = r2.toMillis(r0)
            X.11P r0 = r6.A00
            long r6 = X.AnonymousClass11P.A01(r0)
            long r0 = r10.A0C()
            long r6 = r6 - r0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fb
            r6 = 1
        L_0x0060:
            r0 = 2131893834(0x7f121e4a, float:1.9422456E38)
            X.AnonymousClass8BV.A14(r11, r4, r0)
            r1 = 2131231039(0x7f08013f, float:1.8078148E38)
            android.widget.ImageView r0 = r4.A00
            r0.setImageResource(r1)
            android.widget.ImageView r1 = r4.A00
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r1)
            r7 = 0
            int r0 = r0.rightMargin
            X.C27641Ww.A03(r1, r7, r0)
            r4.A00()
            r4.setRadioButtonChecked(r6)
            r2 = 0
            r4.A05(r7)
            r1 = 27
            X.78A r0 = new X.78A
            r0.<init>(r11, r3, r4, r1)
            r4.setOnClickListener(r0)
            r1 = 1
            if (r6 == 0) goto L_0x00ee
            r11.A00 = r7
            X.9bv r9 = r11.A03
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.HOURS
            r0 = 24
            long r7 = r7.toMillis(r0)
            X.AXS r0 = r9.A01
            long r0 = r0.A0C()
            long r0 = r0 + r7
            X.11P r7 = r9.A00
            long r7 = X.AnonymousClass11P.A01(r7)
            long r0 = r0 - r7
            X.8Cd r7 = new X.8Cd
            r7.<init>(r11, r3, r0)
            android.os.CountDownTimer r0 = r7.start()
            r11.A01 = r0
        L_0x00b6:
            r0 = 2131893776(0x7f121e10, float:1.9422338E38)
            X.AnonymousClass8BV.A14(r11, r3, r0)
            r1 = 2131231614(0x7f08037e, float:1.8079314E38)
            android.widget.ImageView r0 = r3.A00
            r0.setImageResource(r1)
            android.widget.ImageView r1 = r3.A00
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r1)
            int r0 = r0.rightMargin
            X.C27641Ww.A03(r1, r2, r0)
            r3.A00()
            r0 = r6 ^ 1
            r3.setRadioButtonChecked(r0)
            r3.A04(r0)
            X.AnonymousClass4aO.A04(r3, r0)
            r3.A05(r2)
            r1 = 28
            X.78A r0 = new X.78A
            r0.<init>(r11, r4, r3, r1)
            r3.setOnClickListener(r0)
            r5.setVisibility(r2)
            return
        L_0x00ee:
            r11.A00 = r1
            r0 = 2131893777(0x7f121e11, float:1.942234E38)
            java.lang.String r0 = r11.getString(r0)
            r3.A03(r0, r1)
            goto L_0x00b6
        L_0x00fb:
            r10.A0M()
        L_0x00fe:
            r6 = 0
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A0Q():void");
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r3 = A002.AAQ;
            C63932tv.A02(r3, this);
            AnonymousClass10G r1 = r3.A00;
            C63932tv.A01(r3, r1, this);
            C63662tU.A00(r3, r1, this, r1.A5A);
            AnonymousClass91U.A1V(r3, r1, this);
            AnonymousClass91U.A1Q(A002, r3, r1, this, r3.A7z);
            AnonymousClass91U.A1P(A002, r3, r1, AnonymousClass8BU.A0E(r3), this);
            AnonymousClass91U.A1Y(r3, this);
            AnonymousClass91U.A1W(r3, r1, this);
            this.A03 = new C185039bv((AnonymousClass11P) r3.AAv.get(), (AXS) r3.A5F.get());
            this.A04 = C000200d.A00(r3.A87);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Class cls;
        if (i != 1012) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            if (intent != null && intent.hasExtra("extra_bank_account")) {
                AnonymousClass8pN r0 = (AnonymousClass8pN) intent.getParcelableExtra("extra_bank_account");
                this.A02 = r0;
                this.A0A = r0;
            }
            switch (this.A02) {
                case 0:
                    Intent A0A = C17880vN.A0A();
                    A0A.putExtra("extra_bank_account", this.A02);
                    setResult(-1, A0A);
                    finish();
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 11:
                    if (this.A0m) {
                        A4o();
                        cls = IndiaUpiPaymentsAccountSetupActivity.class;
                    } else {
                        cls = IndiaUpiBankAccountAddedLandingActivity.class;
                    }
                    Intent A072 = AnonymousClass8BR.A07(this, cls);
                    A072.putExtra("referral_screen", this.A05);
                    A4v(A072);
                    AnonymousClass8BU.A13(A072, this, "extra_previous_screen", "enter_debit_card");
                    return;
                default:
                    return;
            }
        } else if (i2 == 0 && intent != null && AnonymousClass3MY.A1a(intent, "extra_max_aadhaar_attempt_exceeded")) {
            A0Q();
        }
    }

    public IndiaUpiPinPrimerFullSheetActivity(int i) {
        this.A07 = false;
        AGD.A00(this, 22);
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A0S.A0B((C20112A7u) null, C17880vN.A0h(), C17880vN.A0j(), this.A0c, this.A05, this.A0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.Window r1 = r7.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.addFlags(r0)
            super.onCreate(r8)
            r0 = 2131625675(0x7f0e06cb, float:1.8878565E38)
            android.content.Intent r1 = X.AnonymousClass8BS.A05(r7, r0)
            java.lang.String r0 = "event_screen"
            java.lang.String r2 = r1.getStringExtra(r0)
            android.os.Parcelable r0 = X.AnonymousClass91U.A1I(r7)
            X.8pN r0 = (X.AnonymousClass8pN) r0
            r7.A02 = r0
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "extra_payment_method_type"
            java.lang.String r0 = r1.getStringExtra(r0)
            r7.A06 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0035
            r7.A05 = r2
        L_0x0035:
            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
            android.widget.TextView r4 = X.AnonymousClass3MX.A0L(r7, r0)
            r0 = 2131429918(0x7f0b0a1e, float:1.8481522E38)
            android.widget.TextView r3 = X.AnonymousClass3MX.A0L(r7, r0)
            java.lang.String r1 = "CREDIT"
            java.lang.String r0 = r7.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008e
            r0 = 2131897435(0x7f122c5b, float:1.942976E38)
            r4.setText(r0)
            r1 = 2131897434(0x7f122c5a, float:1.9429757E38)
        L_0x0056:
            r3.setText(r1)
        L_0x0059:
            X.01n r1 = X.AnonymousClass91U.A1J(r7)
            if (r1 == 0) goto L_0x0065
            r0 = 2131893788(0x7f121e1c, float:1.9422362E38)
            X.AnonymousClass8BU.A17(r1, r0)
        L_0x0065:
            X.8pN r0 = r7.A02
            if (r0 == 0) goto L_0x0082
            X.8pb r0 = r0.A08
            if (r0 == 0) goto L_0x0082
            A0V(r7)
        L_0x0070:
            X.AZ6 r0 = r7.A0S
            java.lang.Integer r2 = X.AnonymousClass3MY.A0f()
            java.lang.String r4 = r7.A0c
            java.lang.String r5 = r7.A05
            java.lang.String r6 = r7.A0f
            r1 = 0
            r3 = r1
            r0.A0B(r1, r2, r3, r4, r5, r6)
            return
        L_0x0082:
            java.lang.String r0 = "Screen called without account, fetching account from local db to setup pin"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.10I r1 = r7.A05
            r0 = 1
            X.C21427Aju.A00(r1, r7, r0)
            goto L_0x0070
        L_0x008e:
            X.A6g r1 = r7.A0O
            X.8pN r0 = r7.A02
            boolean r2 = r1.A08(r0)
            java.lang.String r1 = "forgot_pin"
            java.lang.String r0 = r7.A05
            boolean r0 = r0.equals(r1)
            if (r2 == 0) goto L_0x00af
            r1 = 2131897391(0x7f122c2f, float:1.942967E38)
            if (r0 == 0) goto L_0x0056
            r0 = 2131893863(0x7f121e67, float:1.9422515E38)
            r4.setText(r0)
            r1 = 2131897390(0x7f122c2e, float:1.9429668E38)
            goto L_0x0056
        L_0x00af:
            if (r0 == 0) goto L_0x0059
            r0 = 2131893863(0x7f121e67, float:1.9422515E38)
            r4.setText(r0)
            r1 = 2131893862(0x7f121e66, float:1.9422513E38)
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        A4w(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A01 = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131432589) {
            A4u(2131888962, this.A05, "payments:setup-pin");
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            this.A0S.A0B((C20112A7u) null, 1, C17880vN.A0j(), this.A0c, this.A05, this.A0f);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiPinPrimerFullSheetActivity() {
        this(0);
        this.A05 = "setup_pin";
        this.A00 = 0;
    }
}
