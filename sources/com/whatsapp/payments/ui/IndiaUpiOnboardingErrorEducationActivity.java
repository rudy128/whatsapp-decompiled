package com.whatsapp.payments.ui;

import X.AGD;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.C108955ca;
import X.C137116uw;
import X.C63662tU;
import X.C63932tv;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.wds.components.button.WDSButton;

public class IndiaUpiOnboardingErrorEducationActivity extends AnonymousClass91T {
    public int A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public WDSButton A04;
    public boolean A05;

    public void onBackPressed() {
        A0Q(this, 1);
        if (this.A00 != 4059001) {
            A03(this);
        } else {
            finish();
        }
    }

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
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
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x013a A[LOOP:0: B:32:0x0134->B:34:0x013a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x025b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r2 = r19
            r0 = r20
            super.onCreate(r0)
            r0 = 2131625623(0x7f0e0697, float:1.887846E38)
            r2.setContentView((int) r0)
            r1 = 2131232758(0x7f0807f6, float:1.8081634E38)
            r0 = 2131434837(0x7f0b1d55, float:1.84915E38)
            r2.A4r(r1, r0)
            X.01n r3 = r2.getSupportActionBar()
            r1 = 1
            if (r3 == 0) goto L_0x002a
            r0 = 2131894007(0x7f121ef7, float:1.9422807E38)
            java.lang.String r0 = r2.getString(r0)
            r3.A0S(r0)
            r3.A0W(r1)
        L_0x002a:
            r0 = 2131431411(0x7f0b0ff3, float:1.848455E38)
            android.widget.ImageView r0 = X.AnonymousClass3MX.A0I(r2, r0)
            r2.A01 = r0
            r0 = 2131430524(0x7f0b0c7c, float:1.8482751E38)
            android.widget.TextView r0 = X.AnonymousClass3MX.A0L(r2, r0)
            r2.A03 = r0
            r0 = 2131430523(0x7f0b0c7b, float:1.848275E38)
            android.widget.TextView r0 = X.AnonymousClass3MX.A0L(r2, r0)
            r2.A02 = r0
            r0 = 2131433262(0x7f0b172e, float:1.8488305E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r2.A04 = r0
            android.content.Intent r4 = r2.getIntent()
            r0 = -1
            java.lang.String r3 = "error_code"
            int r0 = r4.getIntExtra(r3, r0)
            r2.A00 = r0
            r4 = 0
            X.A7u[] r0 = new X.C20112A7u[r4]
            r15 = 0
            X.A7u r14 = X.C20112A7u.A03(r0)
            int r0 = r2.A00
            r14.A06(r3, r0)
            X.AZ6 r13 = r2.A0S
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r5 = "extra_referral_screen"
            java.lang.String r17 = r0.getStringExtra(r5)
            java.lang.String r6 = "error"
            r18 = r4
            r16 = r6
            r13.BiM(r14, r15, r16, r17, r18)
            int r3 = r2.A00
            r0 = 446(0x1be, float:6.25E-43)
            if (r3 == r0) goto L_0x0314
            r0 = 11498(0x2cea, float:1.6112E-41)
            if (r3 == r0) goto L_0x02f7
            r0 = 1383026(0x151a72, float:1.938032E-39)
            if (r3 == r0) goto L_0x0331
            r0 = 4059001(0x3def79, float:5.687872E-39)
            if (r3 == r0) goto L_0x02ca
            android.content.Intent r0 = r2.getIntent()
            int r7 = r0.getIntExtra(r6, r4)
            android.content.Intent r3 = r2.getIntent()
            java.lang.String r0 = "error_text"
            java.lang.String r3 = r3.getStringExtra(r0)
            r0 = 2131897411(0x7f122c43, float:1.942971E38)
            if (r7 == r0) goto L_0x0331
            android.content.Intent r6 = r2.getIntent()
            java.lang.String r0 = "error_type"
            int r11 = r6.getIntExtra(r0, r4)
            android.os.Parcelable r6 = X.AnonymousClass91U.A1I(r2)
            X.8pW r6 = (X.AnonymousClass8pW) r6
            if (r6 == 0) goto L_0x0250
            X.77e r0 = r6.A01
            java.lang.Object r9 = X.AnonymousClass8BT.A0q(r0)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r12 = r6.A04
        L_0x00c6:
            r13 = 5
            if (r11 < r1) goto L_0x0266
            r0 = 4
            if (r11 > r0) goto L_0x0266
            X.11S r0 = r2.A02
            X.1E8 r0 = X.AnonymousClass3MZ.A0Q(r0)
            java.lang.String r6 = X.AnonymousClass17K.A02(r0)
            r3 = 0
            if (r6 == 0) goto L_0x00e1
            r3 = 32
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r3 = r6.replace(r3, r0)
        L_0x00e1:
            X.0vb r0 = r2.A00
            java.lang.String r10 = r0.A0G(r3)
            r0 = 2131430786(0x7f0b0d82, float:1.8483283E38)
            android.view.ViewGroup r6 = X.AnonymousClass3MX.A0F(r2, r0)
            r0 = 2131430787(0x7f0b0d83, float:1.8483285E38)
            android.widget.TextView r8 = X.C17880vN.A0E(r6, r0)
            java.util.ArrayList r3 = X.C17880vN.A0z(r13)
            r13 = 2
            if (r11 != r1) goto L_0x01ac
            com.whatsapp.wds.components.button.WDSButton r8 = r2.A04
            r0 = 2131894173(0x7f121f9d, float:1.9423143E38)
            r8.setText(r0)
            android.widget.TextView r14 = r2.A03
            r11 = 2131886948(0x7f120364, float:1.940849E38)
            java.lang.Object[] r8 = new java.lang.Object[r1]
            X.0vb r0 = r2.A00
            java.lang.String r0 = r0.A0F(r9)
            r8[r4] = r0
            X.AnonymousClass3MY.A0y(r2, r14, r8, r11)
            r0 = 2131890762(0x7f12124a, float:1.9416225E38)
            r9 = 2131890762(0x7f12124a, float:1.9416225E38)
            if (r7 != r0) goto L_0x0130
            android.widget.TextView r8 = r2.A02
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L_0x019d
            r0 = 2131890763(0x7f12124b, float:1.9416227E38)
            java.lang.String r1 = X.C17890vO.A0R(r2, r10, r1, r4, r0)
        L_0x012d:
            r8.setText(r1)
        L_0x0130:
            java.util.Iterator r9 = r3.iterator()
        L_0x0134:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0255
            java.lang.String r8 = X.C17880vN.A0v(r9)
            android.text.SpannableString r7 = new android.text.SpannableString
            r7.<init>(r8)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131168236(0x7f070bec, float:1.7950768E38)
            int r0 = X.AnonymousClass3MW.A01(r1, r0)
            X.3Na r1 = new X.3Na
            r1.<init>(r0)
            int r0 = r8.length()
            r7.setSpan(r1, r4, r0, r4)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r2)
            r8.setText(r7)
            android.content.res.Resources r7 = r2.getResources()
            r1 = 2130971113(0x7f0409e9, float:1.7550955E38)
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            X.AnonymousClass8BW.A0z(r2, r7, r8, r1, r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131169432(0x7f071098, float:1.7953194E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r8.setTextSize(r4, r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131168193(0x7f070bc1, float:1.795068E38)
            r7 = 2131168193(0x7f070bc1, float:1.795068E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r8.setLineSpacing(r1, r0)
            int r0 = X.AnonymousClass3MZ.A01(r2, r7)
            r8.setPadding(r4, r4, r4, r0)
            r6.addView(r8)
            goto L_0x0134
        L_0x019d:
            java.lang.Object[] r7 = new java.lang.Object[r13]
            r7[r4] = r10
            X.0vb r0 = r2.A00
            java.lang.String r0 = r0.A0G(r12)
            java.lang.String r1 = X.C17880vN.A0q(r2, r0, r7, r1, r9)
            goto L_0x012d
        L_0x01ac:
            if (r11 != r13) goto L_0x01fa
            android.widget.ImageView r3 = r2.A01
            if (r3 == 0) goto L_0x01b8
            r0 = 2131233642(0x7f080b6a, float:1.8083427E38)
            X.AnonymousClass3MX.A1B(r2, r3, r0)
        L_0x01b8:
            android.widget.TextView r3 = r2.A03
            r0 = 2131889385(0x7f120ce9, float:1.9413432E38)
            r3.setText(r0)
            r0 = 2131889382(0x7f120ce6, float:1.9413426E38)
            r8.setText(r0)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            r0 = 2131889378(0x7f120ce2, float:1.9413418E38)
            java.lang.String r0 = X.C17890vO.A0R(r2, r10, r1, r4, r0)
            r3.add(r0)
            r0 = 2131889379(0x7f120ce3, float:1.941342E38)
            java.lang.String r0 = r2.getString(r0)
            r3.add(r0)
            r0 = 2131889380(0x7f120ce4, float:1.9413422E38)
            java.lang.String r0 = r2.getString(r0)
            r3.add(r0)
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r7 > r0) goto L_0x0130
            r0 = 2131889381(0x7f120ce5, float:1.9413424E38)
            java.lang.String r0 = X.C17890vO.A0R(r2, r10, r1, r4, r0)
            r3.add(r0)
            goto L_0x0130
        L_0x01fa:
            r0 = 3
            if (r11 != r0) goto L_0x0234
            android.widget.ImageView r3 = r2.A01
            if (r3 == 0) goto L_0x0207
            r0 = 2131233642(0x7f080b6a, float:1.8083427E38)
            X.AnonymousClass3MX.A1B(r2, r3, r0)
        L_0x0207:
            android.widget.TextView r3 = r2.A03
            r0 = 2131889386(0x7f120cea, float:1.9413434E38)
            r3.setText(r0)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r7 > r0) goto L_0x0223
            r0 = 2131889384(0x7f120ce8, float:1.941343E38)
            java.lang.String r0 = r2.getString(r0)
            r3.add(r0)
        L_0x0223:
            r0 = 2131889377(0x7f120ce1, float:1.9413416E38)
            java.lang.String r1 = X.C17890vO.A0R(r2, r10, r1, r4, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x012d
            android.widget.TextView r8 = r2.A02
            goto L_0x012d
        L_0x0234:
            android.widget.ImageView r1 = r2.A01
            if (r1 == 0) goto L_0x023e
            r0 = 2131233642(0x7f080b6a, float:1.8083427E38)
            X.AnonymousClass3MX.A1B(r2, r1, r0)
        L_0x023e:
            android.widget.TextView r1 = r2.A03
            r0 = 2131889385(0x7f120ce9, float:1.9413432E38)
            r1.setText(r0)
            android.widget.TextView r1 = r2.A02
            r0 = 2131889383(0x7f120ce7, float:1.9413428E38)
            r1.setText(r0)
            goto L_0x0130
        L_0x0250:
            java.lang.String r9 = ""
            r12 = r9
            goto L_0x00c6
        L_0x0255:
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x027f
            r6.setVisibility(r4)
            android.widget.TextView r1 = r2.A02
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x027f
        L_0x0266:
            if (r7 <= 0) goto L_0x027f
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x02a7
            if (r11 != r13) goto L_0x02a7
        L_0x0270:
            android.widget.TextView r3 = r2.A02
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.0vb r0 = r2.A00
            java.lang.String r0 = r0.A0F(r9)
            r1[r4] = r0
            X.AnonymousClass3MY.A0y(r2, r3, r1, r7)
        L_0x027f:
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            r0 = 11
            X.AFP.A00(r1, r2, r0)
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "extra_error_screen_name"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L_0x029f
            X.AZ6 r3 = r2.A0S
            java.lang.String r1 = X.C108955ca.A0r(r2, r1)
            java.lang.String r0 = X.C108955ca.A0r(r2, r5)
            r3.BiL(r15, r1, r0, r4)
        L_0x029f:
            android.content.res.Configuration r0 = X.C108965cb.A03(r2)
            r2.onConfigurationChanged(r0)
            return
        L_0x02a7:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x02b1
            r0 = 6
            if (r11 != r0) goto L_0x02b1
            goto L_0x0270
        L_0x02b1:
            r0 = 7
            if (r11 != r0) goto L_0x02c2
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            r0 = 2131894173(0x7f121f9d, float:1.9423143E38)
            r1.setText(r0)
        L_0x02bc:
            android.widget.TextView r0 = r2.A02
            r0.setText(r3)
            goto L_0x027f
        L_0x02c2:
            if (r3 != 0) goto L_0x02bc
            android.widget.TextView r0 = r2.A02
            r0.setText(r7)
            goto L_0x027f
        L_0x02ca:
            r1 = 2131233642(0x7f080b6a, float:1.8083427E38)
            android.widget.ImageView r0 = r2.A01
            X.AnonymousClass3MX.A1B(r2, r0, r1)
            r1 = 2131894176(0x7f121fa0, float:1.942315E38)
            android.widget.TextView r0 = r2.A03
            r0.setText(r1)
            r1 = 2131893867(0x7f121e6b, float:1.9422523E38)
            android.widget.TextView r0 = r2.A02
            r0.setText(r1)
            r0 = 8
            X.AFP r3 = new X.AFP
            r3.<init>(r2, r0)
            r1 = 2131894173(0x7f121f9d, float:1.9423143E38)
            com.whatsapp.wds.components.button.WDSButton r0 = r2.A04
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r2.A04
            r0.setOnClickListener(r3)
            return
        L_0x02f7:
            r1 = 2131233665(0x7f080b81, float:1.8083474E38)
            android.widget.ImageView r0 = r2.A01
            X.AnonymousClass3MX.A1B(r2, r0, r1)
            r1 = 2131886949(0x7f120365, float:1.9408491E38)
            android.widget.TextView r0 = r2.A03
            r0.setText(r1)
            r1 = 2131897452(0x7f122c6c, float:1.9429794E38)
            android.widget.TextView r0 = r2.A02
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            r0 = 9
            goto L_0x0354
        L_0x0314:
            r1 = 2131233665(0x7f080b81, float:1.8083474E38)
            android.widget.ImageView r0 = r2.A01
            X.AnonymousClass3MX.A1B(r2, r0, r1)
            r1 = 2131894176(0x7f121fa0, float:1.942315E38)
            android.widget.TextView r0 = r2.A03
            r0.setText(r1)
            r1 = 2131897612(0x7f122d0c, float:1.9430118E38)
            android.widget.TextView r0 = r2.A02
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            r0 = 10
            goto L_0x0354
        L_0x0331:
            r1 = 2131233665(0x7f080b81, float:1.8083474E38)
            android.widget.ImageView r0 = r2.A01
            X.AnonymousClass3MX.A1B(r2, r0, r1)
            r1 = 2131897413(0x7f122c45, float:1.9429715E38)
            android.widget.TextView r0 = r2.A03
            r0.setText(r1)
            r1 = 2131897411(0x7f122c43, float:1.942971E38)
            android.widget.TextView r0 = r2.A02
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            r0 = 2131897410(0x7f122c42, float:1.9429709E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            r0 = 7
        L_0x0354:
            X.AFP.A00(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity.onCreate(android.os.Bundle):void");
    }

    public IndiaUpiOnboardingErrorEducationActivity(int i) {
        this.A05 = false;
        AGD.A00(this, 10);
    }

    public static void A03(IndiaUpiOnboardingErrorEducationActivity indiaUpiOnboardingErrorEducationActivity) {
        Intent A042;
        int i = 0;
        if (indiaUpiOnboardingErrorEducationActivity.getIntent() != null) {
            i = indiaUpiOnboardingErrorEducationActivity.getIntent().getIntExtra("try_again", 0);
        }
        if (indiaUpiOnboardingErrorEducationActivity.A0l || i <= 0) {
            A042 = AnonymousClass8BS.A04(indiaUpiOnboardingErrorEducationActivity);
        } else {
            if (i == 1) {
                A042 = AnonymousClass1LU.A07(indiaUpiOnboardingErrorEducationActivity);
            }
            indiaUpiOnboardingErrorEducationActivity.finish();
        }
        indiaUpiOnboardingErrorEducationActivity.A4v(A042);
        indiaUpiOnboardingErrorEducationActivity.startActivity(A042);
        indiaUpiOnboardingErrorEducationActivity.finish();
    }

    public static void A0Q(IndiaUpiOnboardingErrorEducationActivity indiaUpiOnboardingErrorEducationActivity, int i) {
        if (indiaUpiOnboardingErrorEducationActivity.getIntent().hasExtra("extra_error_screen_name")) {
            indiaUpiOnboardingErrorEducationActivity.A0S.BiL(Integer.valueOf(i), C108955ca.A0r(indiaUpiOnboardingErrorEducationActivity, "extra_error_screen_name"), AnonymousClass8BV.A0p(indiaUpiOnboardingErrorEducationActivity), 1);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        A0Q(this, 1);
        if (this.A00 != 4059001) {
            A03(this);
            return true;
        }
        finish();
        return true;
    }

    public IndiaUpiOnboardingErrorEducationActivity() {
        this(0);
        this.A00 = -1;
    }
}
