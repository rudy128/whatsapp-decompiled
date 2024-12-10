package com.whatsapp.payments.ui;

import X.AGC;
import X.AZ6;
import X.AnonymousClass000;
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
import X.C108965cb;
import X.C137116uw;
import X.C176058zi;
import X.C17880vN;
import X.C17890vO;
import X.C20061A5k;
import X.C63662tU;
import X.C63932tv;
import X.C87544Vz;
import android.content.Intent;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.wds.components.button.WDSButton;

public class IndiaUpiBankAccountAddedLandingActivity extends AnonymousClass91T {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public WDSButton A04;
    public WDSButton A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public boolean A08;

    public static C176058zi A03(IndiaUpiBankAccountAddedLandingActivity indiaUpiBankAccountAddedLandingActivity) {
        if (C20061A5k.A02(indiaUpiBankAccountAddedLandingActivity.A0G) || !indiaUpiBankAccountAddedLandingActivity.A0W.A0o(indiaUpiBankAccountAddedLandingActivity.A0J)) {
            return null;
        }
        return C176058zi.A00();
    }

    public static void A0c(IndiaUpiBankAccountAddedLandingActivity indiaUpiBankAccountAddedLandingActivity) {
        Class cls;
        if (indiaUpiBankAccountAddedLandingActivity.A0G != null || !C20061A5k.A03(indiaUpiBankAccountAddedLandingActivity.A0J)) {
            if (C87544Vz.A00(indiaUpiBankAccountAddedLandingActivity.A0E)) {
                cls = IndiaUpiSendPaymentActivityBottomSheet.class;
            } else {
                cls = IndiaUpiSendPaymentActivity.class;
            }
            Intent A072 = AnonymousClass8BR.A07(indiaUpiBankAccountAddedLandingActivity, cls);
            indiaUpiBankAccountAddedLandingActivity.A4v(A072);
            indiaUpiBankAccountAddedLandingActivity.startActivity(A072);
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("openPaymentActivity, jid and vpa is null, payment entry type = ");
            A10.append(indiaUpiBankAccountAddedLandingActivity.A02);
            C17890vO.A0w(A10);
        }
        indiaUpiBankAccountAddedLandingActivity.finish();
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
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
            this.A07 = C000200d.A00(r2.A87);
            this.A06 = C000200d.A00(r2.AcC);
        }
    }

    public void A50() {
        AZ6.A03(this.A0S, this, C17880vN.A0h(), C17880vN.A0l());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0294, code lost:
        r3 = r1.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x029e, code lost:
        if (r10.A0O.A08(r10.A0A) == false) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x02a3, code lost:
        if (r10.A03 != 1) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02ad, code lost:
        if (java.lang.Boolean.FALSE.equals(r3.A00) == false) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02b0, code lost:
        r2 = r10.A01;
        r4 = r3.A00;
        X.C17960vV.A07(r4);
        r3 = X.AnonymousClass000.A1Y(r4);
        r0 = 2131233627;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02be, code lost:
        if (r3 == false) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02c0, code lost:
        r0 = 2131233550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02c3, code lost:
        r2.setImageResource(r0);
        r2 = r10.A03;
        X.C17960vV.A07(r4);
        r0 = 2131886944;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02ce, code lost:
        if (r3 == false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02d0, code lost:
        r0 = 2131886943;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02d3, code lost:
        X.AnonymousClass91U.A1O(r2, r10, r0);
        r10.A04.setText(2131887451);
        r10.A05.setVisibility(8);
        r2 = r10.A04;
        r0 = 38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02f0, code lost:
        r0 = r10.A0m;
        r4 = r1.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02f4, code lost:
        if (r0 == false) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02fe, code lost:
        if (r10.A0O.A08(r10.A0A) == false) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0303, code lost:
        if (r10.A03 != 1) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x030d, code lost:
        if (java.lang.Boolean.FALSE.equals(r4.A00) == false) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x030f, code lost:
        A0Q(r10.A01);
        r10.A03.setText(2131886945);
        r10.A02.setText(2131886938);
        r0 = r10.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0326, code lost:
        if (r0 == null) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0328, code lost:
        r0 = r0.A08;
        X.C17960vV.A07(r0);
        A0V((X.AnonymousClass8pS) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0332, code lost:
        r10.A04.setText(2131887451);
        r10.A05.setVisibility(8);
        X.AFO.A00(r10.A04, r10, 34);
        r10.A00.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x034f, code lost:
        A0Q(r10.A01);
        r10.A03.setText(2131886945);
        r3 = r10.A02;
        r0 = 2131886941;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0365, code lost:
        if (X.AnonymousClass8BW.A1S(r4) == false) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0367, code lost:
        r0 = 2131886940;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x036a, code lost:
        r3.setText(r0);
        r10.A04.setText(2131886936);
        r10.A05.setVisibility(8);
        r2 = r10.A04;
        r0 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0381, code lost:
        r2 = r10.A01;
        r4 = r4.A00;
        X.C17960vV.A07(r4);
        r3 = X.AnonymousClass000.A1Y(r4);
        r0 = 2131233627;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x038f, code lost:
        if (r3 == false) goto L_0x0394;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0391, code lost:
        r0 = 2131233550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0394, code lost:
        r2.setImageResource(r0);
        r2 = r10.A03;
        X.C17960vV.A07(r4);
        r0 = 2131886944;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x039f, code lost:
        if (r3 == false) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x03a1, code lost:
        r0 = 2131886943;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x03a4, code lost:
        X.AnonymousClass91U.A1O(r2, r10, r0);
        r10.A04.setText(2131886937);
        r10.A05.setText(2131886936);
        X.AFO.A00(r10.A04, r10, 28);
        r2 = r10.A05;
        r0 = 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03c2, code lost:
        X.AFO.A00(r2, r10, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r10 = r19
            r0 = r20
            super.onCreate(r0)
            X.AnonymousClass8BX.A0u(r10)
            r0 = 2131625600(0x7f0e0680, float:1.8878413E38)
            r10.setContentView((int) r0)
            X.01n r1 = X.AnonymousClass91U.A1J(r10)
            r3 = 1
            if (r1 == 0) goto L_0x0024
            r0 = 2131893783(0x7f121e17, float:1.9422352E38)
            java.lang.String r0 = r10.getString(r0)
            r1.A0S(r0)
            r1.A0W(r3)
        L_0x0024:
            X.AZ6 r11 = r10.A0S
            r1 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            java.lang.String r15 = r10.A0c
            java.lang.String r0 = r10.A0f
            X.8zi r12 = A03(r10)
            r14 = 0
            java.lang.String r16 = "registration_complete"
            r17 = r0
            r11.A0B(r12, r13, r14, r15, r16, r17)
            r0 = 2131431412(0x7f0b0ff4, float:1.8484552E38)
            android.widget.ImageView r0 = X.AnonymousClass3MX.A0I(r10, r0)
            r10.A01 = r0
            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
            android.widget.TextView r0 = X.AnonymousClass3MX.A0L(r10, r0)
            r10.A03 = r0
            r0 = 2131429918(0x7f0b0a1e, float:1.8481522E38)
            android.widget.TextView r0 = X.AnonymousClass3MX.A0L(r10, r0)
            r10.A02 = r0
            r0 = 2131434059(0x7f0b1a4b, float:1.8489921E38)
            android.view.View r0 = r10.findViewById(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r10.A04 = r0
            r0 = 2131435001(0x7f0b1df9, float:1.8491832E38)
            android.view.View r0 = r10.findViewById(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r10.A05 = r0
            r0 = 2131431593(0x7f0b10a9, float:1.848492E38)
            android.view.View r5 = r10.findViewById(r0)
            r0 = 2131433194(0x7f0b16ea, float:1.8488167E38)
            android.view.View r2 = r10.findViewById(r0)
            r10.A00 = r2
            X.0ve r4 = r10.A0E
            X.1KB r13 = r10.A05
            X.1L9 r12 = r10.A01
            X.11C r15 = r10.A08
            r0 = 2131433193(0x7f0b16e9, float:1.8488165E38)
            com.whatsapp.TextEmojiLabel r14 = X.AnonymousClass3MX.A0V(r2, r0)
            r2 = 2131893796(0x7f121e24, float:1.9422379E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = "learn-more"
            java.lang.String r17 = X.C17880vN.A0q(r10, r0, r3, r1, r2)
            java.lang.String r9 = "https://faq.whatsapp.com/general/payments/about-payments-data"
            android.net.Uri r11 = android.net.Uri.parse(r9)
            r18 = r0
            r16 = r4
            X.C26302CxJ.A0K(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            android.view.View r3 = r10.A00
            r3.setVisibility(r1)
            android.view.View r3 = r10.A00
            r1 = 2131433195(0x7f0b16eb, float:1.8488169E38)
            X.C72463Mc.A13(r3, r1)
            X.8pN r1 = r10.A0A
            if (r1 == 0) goto L_0x03f3
            X.8pb r1 = r1.A08
            if (r1 == 0) goto L_0x03f3
            int r3 = r10.A00
            r1 = 20
            if (r3 != r1) goto L_0x03c7
            r1 = 2131891312(0x7f121470, float:1.941734E38)
            java.lang.String r3 = r10.getString(r1)
        L_0x00c5:
            r1 = 0
            r5.setVisibility(r1)
            r1 = 2131431594(0x7f0b10aa, float:1.8484922E38)
            android.widget.TextView r1 = X.AnonymousClass3MW.A0J(r5, r1)
            r1.setText(r3)
        L_0x00d3:
            X.8pN r1 = r10.A0A
            X.8pb r1 = r1.A08
            X.8pS r1 = (X.AnonymousClass8pS) r1
            java.lang.String r3 = r1.A0A
            boolean r3 = X.C20063A5m.A03(r3)
            if (r3 == 0) goto L_0x0185
            java.lang.String r7 = r1.A0A
            android.widget.TextView r4 = r10.A03
            r3 = 2131897433(0x7f122c59, float:1.9429755E38)
            r4.setText(r3)
            android.widget.TextView r4 = r10.A02
            r3 = 2131897431(0x7f122c57, float:1.9429751E38)
            r4.setText(r3)
            com.whatsapp.wds.components.button.WDSButton r4 = r10.A04
            r3 = 2131887451(0x7f12055b, float:1.940951E38)
            r4.setText(r3)
            com.whatsapp.wds.components.button.WDSButton r4 = r10.A05
            r3 = 8
            r4.setVisibility(r3)
            com.whatsapp.wds.components.button.WDSButton r5 = r10.A04
            r4 = 30
            X.AFO.A00(r5, r10, r4)
            r4 = 2131433194(0x7f0b16ea, float:1.8488167E38)
            android.view.View r8 = r10.findViewById(r4)
            java.lang.String r4 = "CREDIT"
            boolean r4 = X.C18070vi.A18(r7, r4)
            r6 = 0
            r5 = 1
            if (r4 == 0) goto L_0x015e
            X.0ve r4 = r10.A0E
            X.1KB r13 = r10.A05
            X.1L9 r12 = r10.A01
            X.11C r15 = r10.A08
            r2 = 2131433193(0x7f0b16e9, float:1.8488165E38)
            com.whatsapp.TextEmojiLabel r14 = X.AnonymousClass3MX.A0V(r8, r2)
            r2 = 2131897432(0x7f122c58, float:1.9429753E38)
            java.lang.String r17 = X.C17890vO.A0R(r10, r0, r5, r6, r2)
            java.lang.String r2 = "https://faq.whatsapp.com/797709544841009"
            android.net.Uri r11 = android.net.Uri.parse(r2)
            r16 = r4
            X.C26302CxJ.A0K(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = 2131436568(0x7f0b2418, float:1.849501E38)
            X.AnonymousClass3MX.A1H(r10, r0, r3)
            r0 = 2131434767(0x7f0b1d0f, float:1.8491357E38)
            X.AnonymousClass8BU.A18(r10, r0)
        L_0x0147:
            android.widget.ImageView r2 = r10.A01
            r0 = 2131233550(0x7f080b0e, float:1.808324E38)
            r2.setImageResource(r0)
        L_0x014f:
            r10.A0V(r1)
            X.00H r0 = r10.A06
            X.10T r1 = X.C17880vN.A0V(r0)
            r0 = 37
            X.C20735AWq.A00(r1, r0)
            return
        L_0x015e:
            java.lang.String r3 = "CREDIT_LINE"
            boolean r7 = X.C18070vi.A18(r7, r3)
            X.0ve r4 = r10.A0E
            X.1KB r13 = r10.A05
            X.1L9 r12 = r10.A01
            X.11C r15 = r10.A08
            r3 = 2131433193(0x7f0b16e9, float:1.8488165E38)
            com.whatsapp.TextEmojiLabel r14 = X.AnonymousClass3MX.A0V(r8, r3)
            java.lang.String r17 = X.C17890vO.A0R(r10, r0, r5, r6, r2)
            if (r7 == 0) goto L_0x017b
            java.lang.String r9 = "https://faq.whatsapp.com/3183041011825911"
        L_0x017b:
            android.net.Uri r11 = android.net.Uri.parse(r9)
            r16 = r4
            X.C26302CxJ.A0K(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0147
        L_0x0185:
            int r0 = r10.A02
            switch(r0) {
                case 0: goto L_0x02eb;
                case 1: goto L_0x024d;
                case 2: goto L_0x020c;
                case 3: goto L_0x01d3;
                case 4: goto L_0x01d3;
                case 5: goto L_0x02f0;
                case 6: goto L_0x01d3;
                case 7: goto L_0x018a;
                case 8: goto L_0x01d3;
                case 9: goto L_0x01d3;
                case 10: goto L_0x01d3;
                case 11: goto L_0x01d3;
                case 12: goto L_0x018a;
                case 13: goto L_0x018a;
                case 14: goto L_0x018b;
                default: goto L_0x018a;
            }
        L_0x018a:
            goto L_0x014f
        L_0x018b:
            X.77e r4 = r1.A04
            android.widget.ImageView r3 = r10.A01
            boolean r2 = X.AnonymousClass8BW.A1S(r4)
            r0 = 2131233627(0x7f080b5b, float:1.8083397E38)
            if (r2 == 0) goto L_0x019b
            r0 = 2131233550(0x7f080b0e, float:1.808324E38)
        L_0x019b:
            r3.setImageResource(r0)
            android.widget.TextView r3 = r10.A03
            boolean r2 = X.AnonymousClass8BW.A1S(r4)
            r0 = 2131886944(0x7f120360, float:1.9408481E38)
            if (r2 == 0) goto L_0x01ac
            r0 = 2131886943(0x7f12035f, float:1.940848E38)
        L_0x01ac:
            X.AnonymousClass91U.A1O(r3, r10, r0)
            android.content.Intent r2 = r10.getIntent()
            java.lang.String r0 = "extra_scan_qr_onboarding_only"
            boolean r0 = X.AnonymousClass3MY.A1a(r2, r0)
            r2 = 2131887451(0x7f12055b, float:1.940951E38)
            if (r0 == 0) goto L_0x01c1
            r2 = 2131898925(0x7f12322d, float:1.9432781E38)
        L_0x01c1:
            com.whatsapp.wds.components.button.WDSButton r0 = r10.A04
            r0.setText(r2)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A05
            r0 = 8
            r2.setVisibility(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A04
            r0 = 35
            goto L_0x03c2
        L_0x01d3:
            boolean r0 = r10.A0m
            if (r0 != 0) goto L_0x0294
            X.77e r4 = r1.A04
            android.widget.ImageView r0 = r10.A01
            r10.A0Q(r0)
            android.widget.TextView r2 = r10.A03
            r0 = 2131886945(0x7f120361, float:1.9408483E38)
            r2.setText(r0)
            android.widget.TextView r3 = r10.A02
            boolean r2 = X.AnonymousClass8BW.A1S(r4)
            r0 = 2131886941(0x7f12035d, float:1.9408475E38)
            if (r2 == 0) goto L_0x01f4
            r0 = 2131886940(0x7f12035c, float:1.9408473E38)
        L_0x01f4:
            r3.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A04
            r0 = 2131886936(0x7f120358, float:1.9408465E38)
            r2.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A05
            r0 = 8
            r2.setVisibility(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A04
            r0 = 33
            goto L_0x03c2
        L_0x020c:
            X.77e r4 = r1.A04
            android.widget.ImageView r3 = r10.A01
            boolean r2 = X.AnonymousClass8BW.A1S(r4)
            r0 = 2131233627(0x7f080b5b, float:1.8083397E38)
            if (r2 == 0) goto L_0x021c
            r0 = 2131233550(0x7f080b0e, float:1.808324E38)
        L_0x021c:
            r3.setImageResource(r0)
            android.widget.TextView r3 = r10.A03
            boolean r2 = X.AnonymousClass8BW.A1S(r4)
            r0 = 2131886944(0x7f120360, float:1.9408481E38)
            if (r2 == 0) goto L_0x022d
            r0 = 2131886943(0x7f12035f, float:1.940848E38)
        L_0x022d:
            X.AnonymousClass91U.A1O(r3, r10, r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A04
            r0 = 2131886936(0x7f120358, float:1.9408465E38)
            r2.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A05
            r0 = 2131886937(0x7f120359, float:1.9408467E38)
            r2.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A04
            r0 = 39
            X.AFO.A00(r2, r10, r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A05
            r0 = 29
            goto L_0x03c2
        L_0x024d:
            int r2 = r10.A00
            r0 = 20
            if (r2 == r0) goto L_0x0294
            X.77e r4 = r1.A04
            android.widget.ImageView r3 = r10.A01
            boolean r2 = X.AnonymousClass8BW.A1S(r4)
            r0 = 2131233627(0x7f080b5b, float:1.8083397E38)
            if (r2 == 0) goto L_0x0263
            r0 = 2131233550(0x7f080b0e, float:1.808324E38)
        L_0x0263:
            r3.setImageResource(r0)
            android.widget.TextView r3 = r10.A03
            boolean r2 = X.AnonymousClass8BW.A1S(r4)
            r0 = 2131886944(0x7f120360, float:1.9408481E38)
            if (r2 == 0) goto L_0x0274
            r0 = 2131886943(0x7f12035f, float:1.940848E38)
        L_0x0274:
            X.AnonymousClass91U.A1O(r3, r10, r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A04
            r0 = 2131886937(0x7f120359, float:1.9408467E38)
            r2.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A05
            r0 = 2131886936(0x7f120358, float:1.9408465E38)
            r2.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A04
            r0 = 36
            X.AFO.A00(r2, r10, r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A05
            r0 = 37
            goto L_0x03c2
        L_0x0294:
            X.77e r3 = r1.A04
            X.A6g r2 = r10.A0O
            X.8pN r0 = r10.A0A
            boolean r0 = r2.A08(r0)
            if (r0 == 0) goto L_0x02b0
            int r2 = r10.A03
            r0 = 1
            if (r2 != r0) goto L_0x02b0
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r3.A00
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02b0
            goto L_0x030f
        L_0x02b0:
            android.widget.ImageView r2 = r10.A01
            java.lang.Object r4 = r3.A00
            X.C17960vV.A07(r4)
            boolean r3 = X.AnonymousClass000.A1Y(r4)
            r0 = 2131233627(0x7f080b5b, float:1.8083397E38)
            if (r3 == 0) goto L_0x02c3
            r0 = 2131233550(0x7f080b0e, float:1.808324E38)
        L_0x02c3:
            r2.setImageResource(r0)
            android.widget.TextView r2 = r10.A03
            X.C17960vV.A07(r4)
            r0 = 2131886944(0x7f120360, float:1.9408481E38)
            if (r3 == 0) goto L_0x02d3
            r0 = 2131886943(0x7f12035f, float:1.940848E38)
        L_0x02d3:
            X.AnonymousClass91U.A1O(r2, r10, r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A04
            r0 = 2131887451(0x7f12055b, float:1.940951E38)
            r2.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A05
            r0 = 8
            r2.setVisibility(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A04
            r0 = 38
            goto L_0x03c2
        L_0x02eb:
            java.lang.String r0 = "Wrong onboarding type 0"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x02f0:
            boolean r0 = r10.A0m
            X.77e r4 = r1.A04
            if (r0 == 0) goto L_0x034f
            X.A6g r2 = r10.A0O
            X.8pN r0 = r10.A0A
            boolean r0 = r2.A08(r0)
            if (r0 == 0) goto L_0x0381
            int r2 = r10.A03
            r0 = 1
            if (r2 != r0) goto L_0x0381
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r4.A00
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0381
        L_0x030f:
            android.widget.ImageView r0 = r10.A01
            r10.A0Q(r0)
            android.widget.TextView r2 = r10.A03
            r0 = 2131886945(0x7f120361, float:1.9408483E38)
            r2.setText(r0)
            android.widget.TextView r2 = r10.A02
            r0 = 2131886938(0x7f12035a, float:1.9408469E38)
            r2.setText(r0)
            X.8pN r0 = r10.A0A
            if (r0 == 0) goto L_0x0332
            X.8pb r0 = r0.A08
            X.C17960vV.A07(r0)
            X.8pS r0 = (X.AnonymousClass8pS) r0
            r10.A0V(r0)
        L_0x0332:
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A04
            r0 = 2131887451(0x7f12055b, float:1.940951E38)
            r2.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = r10.A05
            r3 = 8
            r0.setVisibility(r3)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A04
            r0 = 34
            X.AFO.A00(r2, r10, r0)
            android.view.View r0 = r10.A00
            r0.setVisibility(r3)
            goto L_0x014f
        L_0x034f:
            android.widget.ImageView r0 = r10.A01
            r10.A0Q(r0)
            android.widget.TextView r2 = r10.A03
            r0 = 2131886945(0x7f120361, float:1.9408483E38)
            r2.setText(r0)
            android.widget.TextView r3 = r10.A02
            boolean r2 = X.AnonymousClass8BW.A1S(r4)
            r0 = 2131886941(0x7f12035d, float:1.9408475E38)
            if (r2 == 0) goto L_0x036a
            r0 = 2131886940(0x7f12035c, float:1.9408473E38)
        L_0x036a:
            r3.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A04
            r0 = 2131886936(0x7f120358, float:1.9408465E38)
            r2.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A05
            r0 = 8
            r2.setVisibility(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A04
            r0 = 32
            goto L_0x03c2
        L_0x0381:
            android.widget.ImageView r2 = r10.A01
            java.lang.Object r4 = r4.A00
            X.C17960vV.A07(r4)
            boolean r3 = X.AnonymousClass000.A1Y(r4)
            r0 = 2131233627(0x7f080b5b, float:1.8083397E38)
            if (r3 == 0) goto L_0x0394
            r0 = 2131233550(0x7f080b0e, float:1.808324E38)
        L_0x0394:
            r2.setImageResource(r0)
            android.widget.TextView r2 = r10.A03
            X.C17960vV.A07(r4)
            r0 = 2131886944(0x7f120360, float:1.9408481E38)
            if (r3 == 0) goto L_0x03a4
            r0 = 2131886943(0x7f12035f, float:1.940848E38)
        L_0x03a4:
            X.AnonymousClass91U.A1O(r2, r10, r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A04
            r0 = 2131886937(0x7f120359, float:1.9408467E38)
            r2.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A05
            r0 = 2131886936(0x7f120358, float:1.9408465E38)
            r2.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A04
            r0 = 28
            X.AFO.A00(r2, r10, r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A05
            r0 = 31
        L_0x03c2:
            X.AFO.A00(r2, r10, r0)
            goto L_0x014f
        L_0x03c7:
            X.77e r1 = r10.A0G
            boolean r1 = X.C20061A5k.A02(r1)
            if (r1 != 0) goto L_0x03ec
            X.1R2 r3 = r10.A0W
            com.whatsapp.jid.UserJid r1 = r10.A0J
            boolean r1 = r3.A0o(r1)
            if (r1 == 0) goto L_0x03ec
            r4 = 2131886946(0x7f120362, float:1.9408485E38)
            java.lang.Object[] r3 = X.AnonymousClass3MW.A1a()
            X.77e r1 = r10.A0G
            java.lang.Object r1 = X.C20061A5k.A01(r1)
            java.lang.String r3 = X.C108975cc.A0b(r10, r1, r3, r4)
            goto L_0x00c5
        L_0x03ec:
            r1 = 8
            r5.setVisibility(r1)
            goto L_0x00d3
        L_0x03f3:
            java.lang.String r0 = "Screen called without valid account, finishing"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r10.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity.onCreate(android.os.Bundle):void");
    }

    public IndiaUpiBankAccountAddedLandingActivity(int i) {
        this.A08 = false;
        AGC.A00(this, 41);
    }

    private void A0Q(ImageView imageView) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int applyDimension = (int) TypedValue.applyDimension(1, 64.0f, C108965cb.A08(this));
        layoutParams.width = applyDimension;
        layoutParams.height = applyDimension;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(2131231969);
    }

    private void A0V(AnonymousClass8pS r6) {
        View findViewById = findViewById(2131427428);
        AnonymousClass1HF.A06(findViewById, 2131434180).setVisibility(8);
        AnonymousClass3MY.A1A(findViewById, 2131430073, 8);
        AnonymousClass3MY.A1A(findViewById, 2131434311, 8);
        AnonymousClass91U.A1N(findViewById, this.A0A);
        AnonymousClass3MW.A0J(findViewById, 2131427431).setText(AnonymousClass8BR.A0c(this.A07).A03(this.A0A, false));
        AnonymousClass8BR.A1E(AnonymousClass3MW.A0J(findViewById, 2131427429), AnonymousClass8BT.A0q(r6.A02));
        AnonymousClass3MW.A0J(findViewById, 2131427464).setText(r6.A0C());
        if (!(!"OD_UNSECURED".equals(r6.A0A))) {
            TextView A0L = AnonymousClass3MX.A0L(this, 2131433359);
            A0L.setVisibility(0);
            A0L.setText(2131886942);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        AZ6.A03(this.A0S, this, C17880vN.A0h(), C17880vN.A0j());
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            AZ6.A03(this.A0S, this, C17880vN.A0h(), C17880vN.A0j());
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiBankAccountAddedLandingActivity() {
        this(0);
    }
}
