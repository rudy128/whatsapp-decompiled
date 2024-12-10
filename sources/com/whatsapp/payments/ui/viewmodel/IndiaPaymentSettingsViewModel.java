package com.whatsapp.payments.ui.viewmodel;

import X.A13;
import X.A5C;
import X.A5K;
import X.AXS;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1DT;
import X.AnonymousClass1KI;
import X.AnonymousClass1QE;
import X.AnonymousClass1QL;
import X.AnonymousClass1QR;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass5YR;
import X.AnonymousClass8BW;
import X.AnonymousClass8GH;
import X.C18030ve;
import X.C184789bW;
import X.C20008A2y;
import X.C20863Aaf;
import X.C30901eh;
import X.C33651jA;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.common.dextricks.StringTreeSet;
import java.util.concurrent.TimeUnit;

public class IndiaPaymentSettingsViewModel extends AnonymousClass8GH {
    public static final long A0E = TimeUnit.MINUTES.toMillis(15);
    public static final long A0F = AnonymousClass8BW.A05();
    public static final long A0G;
    public static final long A0H;
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass1QR A02;
    public final C18030ve A03;
    public final AXS A04;
    public final AnonymousClass1QL A05;
    public final C33651jA A06;
    public final AnonymousClass1QE A07 = AnonymousClass1QE.A00("IndiaPaymentSettingsViewModel", "payment", "IN");
    public final C184789bW A08;
    public final C20008A2y A09;
    public final C30901eh A0A;
    public final AnonymousClass10I A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass1KI A0D;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IndiaPaymentSettingsViewModel(X.AnonymousClass11P r12, X.C18000vb r13, X.AnonymousClass1QR r14, X.AnonymousClass1KI r15, X.C32981i4 r16, X.C18030ve r17, X.AXS r18, X.AnonymousClass1QL r19, X.AnonymousClass1QD r20, X.AnonymousClass1QS r21, X.C33651jA r22, X.AZ6 r23, X.C184789bW r24, X.C20008A2y r25, X.C30901eh r26, X.AnonymousClass10I r27, X.AnonymousClass00H r28) {
        /*
            r11 = this;
            r3 = r11
            r10 = r23
            r4 = r12
            r5 = r13
            r6 = r16
            r7 = r17
            r8 = r20
            r9 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            X.1DT r0 = X.AnonymousClass3MW.A0L()
            r11.A01 = r0
            X.1DT r0 = X.AnonymousClass3MW.A0L()
            r11.A00 = r0
            java.lang.String r2 = "payment"
            java.lang.String r1 = "IN"
            java.lang.String r0 = "IndiaPaymentSettingsViewModel"
            X.1QE r0 = X.AnonymousClass1QE.A00(r0, r2, r1)
            r11.A07 = r0
            r11.A03 = r7
            r0 = r27
            r11.A0B = r0
            r0 = r19
            r11.A05 = r0
            r0 = r26
            r11.A0A = r0
            r11.A0D = r15
            r0 = r24
            r11.A08 = r0
            r11.A02 = r14
            r0 = r22
            r11.A06 = r0
            r0 = r18
            r11.A04 = r0
            r0 = r25
            r11.A09 = r0
            r0 = r28
            r11.A0C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel.<init>(X.11P, X.0vb, X.1QR, X.1KI, X.1i4, X.0ve, X.AXS, X.1QL, X.1QD, X.1QS, X.1jA, X.AZ6, X.9bW, X.A2y, X.1eh, X.10I, X.00H):void");
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A0H = timeUnit.toMillis(90);
        A0G = timeUnit.toMillis(30);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0148, code lost:
        return new X.A5C(r7, new X.C20863Aaf(r0, r1), r9, r10, r11, r12, 0, 0, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x01cb, code lost:
        return new X.A5C(r2, new X.C20863Aaf(r0, r1), r4, r5, r6, r7, 0, 0, 0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.A5C A0T() {
        /*
            r20 = this;
            r0 = r20
            X.0ve r3 = r0.A03
            r2 = 7964(0x1f1c, float:1.116E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            if (r1 == 0) goto L_0x001c
            X.10I r3 = r0.A0B
            r2 = 42
            X.Aju r1 = new X.Aju
            r1.<init>(r0, r2)
            r3.CGN(r1)
            r1 = 0
            return r1
        L_0x001c:
            int r1 = r0.A0c()
            r5 = 1
            r4 = -1
            r8 = 0
            switch(r1) {
                case 1: goto L_0x01a1;
                case 2: goto L_0x0149;
                case 3: goto L_0x0026;
                case 4: goto L_0x0107;
                case 5: goto L_0x00e9;
                case 6: goto L_0x00bb;
                case 7: goto L_0x009d;
                case 8: goto L_0x007f;
                case 9: goto L_0x007a;
                case 10: goto L_0x0051;
                case 11: goto L_0x002c;
                default: goto L_0x0026;
            }
        L_0x0026:
            X.A5C r1 = new X.A5C
            r1.<init>(r8)
            return r1
        L_0x002c:
            r12 = 2131433608(0x7f0b1888, float:1.8489006E38)
            r1 = 2131890219(0x7f12102b, float:1.9415124E38)
            X.A5K r9 = X.AnonymousClass8GH.A00(r1)
            X.A5K r10 = X.A5K.A05
            r1 = 2131890220(0x7f12102c, float:1.9415126E38)
            X.A5K r11 = X.AnonymousClass8GH.A00(r1)
            r3 = 2131233294(0x7f080a0e, float:1.8082721E38)
            r2 = 2131168149(0x7f070b95, float:1.7950592E38)
            r1 = 2131168150(0x7f070b96, float:1.7950594E38)
            X.A13 r7 = new X.A13
            r7.<init>(r4, r3, r2, r1)
            r1 = 8
            goto L_0x0138
        L_0x0051:
            r12 = 2131433608(0x7f0b1888, float:1.8489006E38)
            r1 = 2131898467(0x7f123063, float:1.9431853E38)
            X.A5K r9 = X.AnonymousClass8GH.A00(r1)
            r1 = 2131898469(0x7f123065, float:1.9431857E38)
            X.A5K r10 = X.AnonymousClass8GH.A00(r1)
            r1 = 2131898468(0x7f123064, float:1.9431855E38)
            X.A5K r11 = X.AnonymousClass8GH.A00(r1)
            r3 = 2131233629(0x7f080b5d, float:1.80834E38)
            r2 = 2131168500(0x7f070cf4, float:1.7951304E38)
            r1 = 2131168501(0x7f070cf5, float:1.7951306E38)
            X.A13 r7 = new X.A13
            r7.<init>(r4, r3, r2, r1)
            r1 = 3
            goto L_0x0138
        L_0x007a:
            X.A5C r1 = A03(r0)
            return r1
        L_0x007f:
            r7 = 2131433608(0x7f0b1888, float:1.8489006E38)
            r1 = 2131894964(0x7f1222b4, float:1.9424748E38)
            X.A5K r4 = X.AnonymousClass8GH.A00(r1)
            X.A5K r5 = X.A5K.A05
            r1 = 2131894965(0x7f1222b5, float:1.942475E38)
            X.A5K r6 = X.AnonymousClass8GH.A00(r1)
            r1 = 2131232068(0x7f080544, float:1.8080235E38)
            X.A13 r2 = new X.A13
            r2.<init>(r1)
            r1 = 5
            goto L_0x01be
        L_0x009d:
            r7 = 2131433608(0x7f0b1888, float:1.8489006E38)
            r1 = 2131894966(0x7f1222b6, float:1.9424752E38)
            X.A5K r4 = X.AnonymousClass8GH.A00(r1)
            X.A5K r5 = X.A5K.A05
            r1 = 2131894967(0x7f1222b7, float:1.9424754E38)
            X.A5K r6 = X.AnonymousClass8GH.A00(r1)
            r1 = 2131233660(0x7f080b7c, float:1.8083464E38)
            X.A13 r2 = new X.A13
            r2.<init>(r1)
            r1 = 6
            goto L_0x01be
        L_0x00bb:
            r12 = 2131433608(0x7f0b1888, float:1.8489006E38)
            X.1QL r1 = r0.A05
            boolean r2 = r1.A0D()
            r1 = 2131893633(0x7f121d81, float:1.9422048E38)
            if (r2 == 0) goto L_0x00cc
            r1 = 2131895402(0x7f12246a, float:1.9425636E38)
        L_0x00cc:
            X.A5K r9 = X.AnonymousClass8GH.A00(r1)
            X.A5K r10 = X.A5K.A05
            r1 = 2131895403(0x7f12246b, float:1.9425638E38)
            X.A5K r11 = X.AnonymousClass8GH.A00(r1)
            r3 = 2131232257(0x7f080601, float:1.8080618E38)
            r2 = 2131168500(0x7f070cf4, float:1.7951304E38)
            r1 = 2131168501(0x7f070cf5, float:1.7951306E38)
            X.A13 r7 = new X.A13
            r7.<init>(r4, r3, r2, r1)
            r1 = 7
            goto L_0x0138
        L_0x00e9:
            r7 = 2131433608(0x7f0b1888, float:1.8489006E38)
            r1 = 2131886347(0x7f12010b, float:1.940727E38)
            X.A5K r4 = X.AnonymousClass8GH.A00(r1)
            X.A5K r5 = X.A5K.A05
            r1 = 2131886348(0x7f12010c, float:1.9407272E38)
            X.A5K r6 = X.AnonymousClass8GH.A00(r1)
            r1 = 2131233666(0x7f080b82, float:1.8083476E38)
            X.A13 r2 = new X.A13
            r2.<init>(r1)
            r1 = 4
            goto L_0x01be
        L_0x0107:
            r12 = 2131433608(0x7f0b1888, float:1.8489006E38)
            r1 = 2131886524(0x7f1201bc, float:1.940763E38)
            X.A5K r9 = X.AnonymousClass8GH.A00(r1)
            r1 = 2131886526(0x7f1201be, float:1.9407633E38)
            X.A5K r10 = X.AnonymousClass8GH.A00(r1)
            r3 = 2131886525(0x7f1201bd, float:1.9407631E38)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r1 = "learn-more"
            r2[r8] = r1
            java.lang.String r1 = "https://faq.whatsapp.com/general/payments/about-using-your-mobile-number-as-your-UPI-number"
            X.A5K r11 = new X.A5K
            r11.<init>(r1, r2, r3, r8)
            r3 = 2131233128(0x7f080968, float:1.8082385E38)
            r2 = 2131165295(0x7f07006f, float:1.7944803E38)
            r1 = 2131165296(0x7f070070, float:1.7944805E38)
            X.A13 r7 = new X.A13
            r7.<init>(r4, r3, r2, r1)
            r1 = 9
        L_0x0138:
            X.Aaf r8 = new X.Aaf
            r8.<init>(r0, r1)
            r13 = 0
            X.A5C r1 = new X.A5C
            r15 = r13
            r16 = r13
            r6 = r1
            r14 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x0149:
            X.1KI r2 = r0.A0D
            java.lang.String r1 = "INR"
            X.1KJ r4 = r2.A01(r1)
            r15 = 2131433608(0x7f0b1888, float:1.8489006E38)
            r1 = 2131895678(0x7f12257e, float:1.9426196E38)
            X.A5K r12 = X.AnonymousClass8GH.A00(r1)
            X.A5K r13 = X.A5K.A05
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            r1 = r4
            X.1KK r1 = (X.AnonymousClass1KK) r1
            java.lang.String r1 = r1.A02
            r2.append(r1)
            X.1KL r4 = (X.AnonymousClass1KL) r4
            X.1KN r1 = r4.A05
            java.math.BigDecimal r1 = r1.A00
            int r1 = r1.intValue()
            java.lang.String r1 = X.C17880vN.A0t(r2, r1)
            r3[r8] = r1
            r2 = 2131895997(0x7f1226bd, float:1.9426843E38)
            r1 = 0
            X.A5K r14 = new X.A5K
            r14.<init>(r1, r3, r2, r8)
            r1 = 2131232289(0x7f080621, float:1.8080683E38)
            X.A13 r10 = new X.A13
            r10.<init>(r1)
            r1 = 10
            X.Aaf r11 = new X.Aaf
            r11.<init>(r0, r1)
            X.A5C r9 = new X.A5C
            r17 = r8
            r18 = r8
            r19 = r8
            r16 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r9
        L_0x01a1:
            r7 = 2131433608(0x7f0b1888, float:1.8489006E38)
            r1 = 2131895329(0x7f122421, float:1.9425488E38)
            X.A5K r4 = X.AnonymousClass8GH.A00(r1)
            X.A5K r5 = X.A5K.A05
            r1 = 2131895330(0x7f122422, float:1.942549E38)
            X.A5K r6 = X.AnonymousClass8GH.A00(r1)
            r1 = 2131232248(0x7f0805f8, float:1.80806E38)
            X.A13 r2 = new X.A13
            r2.<init>(r1)
            r1 = 12
        L_0x01be:
            X.Aaf r3 = new X.Aaf
            r3.<init>(r0, r1)
            X.A5C r1 = new X.A5C
            r10 = r8
            r11 = r8
            r9 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel.A0T():X.A5C");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
        if (r11.A05.A0D() != false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0c() {
        /*
            r17 = this;
            r11 = r17
            X.1QD r12 = r11.A07
            android.content.SharedPreferences r1 = r12.A03()
            java.lang.String r0 = "payments_home_explore_merchsnts_banner_dismissed"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 != 0) goto L_0x002f
            X.0ve r2 = r11.A03
            r0 = 5702(0x1646, float:7.99E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 != 0) goto L_0x002c
            r0 = 6088(0x17c8, float:8.531E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x002f
            X.1QL r0 = r11.A05
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x002f
        L_0x002c:
            r1 = 11
        L_0x002e:
            return r1
        L_0x002f:
            X.0ve r7 = r11.A03
            r0 = 1644(0x66c, float:2.304E-42)
            X.0vf r6 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r6, r7, r0)
            if (r0 == 0) goto L_0x0054
            X.AXS r1 = r11.A04
            java.lang.String r0 = r1.A0G()
            boolean r0 = r1.A0U(r0)
            if (r0 != 0) goto L_0x0054
            android.content.SharedPreferences r1 = r12.A03()
            java.lang.String r0 = "payment_account_recovered"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            r1 = 5
            if (r0 != 0) goto L_0x002e
        L_0x0054:
            r0 = 5260(0x148c, float:7.371E-42)
            boolean r0 = X.C18020vd.A05(r6, r7, r0)
            if (r0 == 0) goto L_0x0072
            android.content.SharedPreferences r1 = r12.A03()
            java.lang.String r0 = "payment_upi_warm_welcme_banner_dismissed_state"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 != 0) goto L_0x0072
            X.1QL r0 = r11.A05
            boolean r0 = r0.A0D()
            r1 = 10
            if (r0 == 0) goto L_0x002e
        L_0x0072:
            r0 = 2319(0x90f, float:3.25E-42)
            boolean r0 = X.C18020vd.A05(r6, r7, r0)
            if (r0 == 0) goto L_0x008f
            android.content.SharedPreferences r1 = r12.A03()
            java.lang.String r0 = "payments_home_scan_to_pay_banner_dismissed"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 != 0) goto L_0x008f
            X.1QL r0 = r11.A05
            boolean r1 = r0.A0D()
            r0 = 1
            if (r1 == 0) goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            r16 = 6
            if (r0 != 0) goto L_0x0289
            java.util.List r0 = r11.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00be
            java.util.List r0 = r11.A04
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00be
            java.util.List r0 = r11.A03
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00be
            X.9bW r0 = r11.A08
            X.1QD r0 = r0.A01
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "settingsQuickTipDismissedState"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 != 0) goto L_0x00be
            r1 = 2
            return r1
        L_0x00be:
            X.1QL r2 = r11.A05
            boolean r0 = r2.A0D()
            if (r0 == 0) goto L_0x00e8
            X.AXS r0 = r11.A04
            java.lang.String r0 = r0.A0G()
            boolean r0 = X.C197269wQ.A00(r7, r0)
            if (r0 == 0) goto L_0x00e8
            X.A2y r0 = r11.A09
            boolean r0 = r0.A07()
            if (r0 != 0) goto L_0x00e8
            android.content.SharedPreferences r1 = r12.A03()
            java.lang.String r0 = "payments_home_add_upi_number_banner_dismissed"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 != 0) goto L_0x00e8
            r1 = 4
            return r1
        L_0x00e8:
            android.content.SharedPreferences r1 = r12.A03()
            java.lang.String r0 = "payments_home_onboarding_banner_dismissed"
            r3 = 0
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x0109
            android.content.SharedPreferences r1 = r12.A03()
            java.lang.String r0 = "payments_resume_onboarding_banner_started"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x0109
            boolean r0 = r2.A0D()
            if (r0 != 0) goto L_0x0109
            r1 = 1
            return r1
        L_0x0109:
            X.1DT r1 = r11.A01
            java.lang.Object r0 = r1.A06()
            if (r0 == 0) goto L_0x011e
            java.lang.Object r0 = r1.A06()
            X.A5C r0 = (X.A5C) r0
            int r1 = r0.A01
            r0 = 1
            if (r1 != r0) goto L_0x011e
            r1 = 3
            return r1
        L_0x011e:
            X.1QS r0 = r11.A08
            X.1KH r0 = X.AnonymousClass8BR.A0R(r0)
            X.AEs r0 = r0.A07()
            if (r0 == 0) goto L_0x01a8
            X.8pb r1 = r0.A08
            if (r1 == 0) goto L_0x01a8
            boolean r0 = r1 instanceof X.AnonymousClass8pS
            if (r0 == 0) goto L_0x01a8
            X.8pS r1 = (X.AnonymousClass8pS) r1
        L_0x0134:
            X.1eh r9 = r11.A0A
            java.lang.String r0 = r9.A02()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01c1
            boolean r0 = r2.A0D()
            if (r0 == 0) goto L_0x01c1
            if (r1 == 0) goto L_0x01c1
            X.77e r0 = r1.A04
            if (r0 == 0) goto L_0x01c1
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 != 0) goto L_0x01c1
            X.11P r0 = r11.A05
            long r4 = X.AnonymousClass11P.A01(r0)
            android.content.SharedPreferences r0 = r12.A03()
            java.lang.String r10 = "payments_home_recovery_upin_upsell_banner_display"
            long r14 = X.C17890vO.A05(r0, r10)
            android.content.SharedPreferences r2 = r12.A03()
            java.lang.String r8 = "payments_home_recovery_upin_upsell_banner_impression"
            r0 = 10
            long r2 = r2.getLong(r8, r0)
            r0 = 0
            int r13 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r13 == 0) goto L_0x017c
            int r13 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r13 >= 0) goto L_0x01aa
        L_0x017c:
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x01aa
            android.content.SharedPreferences r7 = r12.A03()
            java.lang.String r6 = "payments_home_recovery_upin_upsell_banner_impression_update_timestamp"
            long r9 = r7.getLong(r6, r0)
            int r7 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0195
            long r0 = A0F
            long r9 = r9 + r0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x01a6
        L_0x0195:
            r0 = 1
            long r2 = r2 - r0
            android.content.SharedPreferences r0 = r12.A03()
            X.AnonymousClass8BW.A12(r0, r8, r2)
            android.content.SharedPreferences r0 = r12.A03()
            X.AnonymousClass8BW.A12(r0, r6, r4)
        L_0x01a6:
            r1 = 7
            return r1
        L_0x01a8:
            r1 = 0
            goto L_0x0134
        L_0x01aa:
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 > 0) goto L_0x01c1
            r0 = 10
            android.content.SharedPreferences r2 = r12.A03()
            X.AnonymousClass8BW.A12(r2, r8, r0)
            long r0 = A0H
            long r4 = r4 + r0
            android.content.SharedPreferences r0 = r12.A03()
            X.AnonymousClass8BW.A12(r0, r10, r4)
        L_0x01c1:
            X.11P r0 = r11.A05
            long r4 = X.AnonymousClass11P.A01(r0)
            java.lang.String r0 = r9.A02()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x025c
            android.content.SharedPreferences r1 = r12.A03()
            java.lang.String r0 = "payments_two_factor_nudge_count"
            int r1 = X.C17890vO.A00(r1, r0)
            r0 = 1124(0x464, float:1.575E-42)
            int r0 = X.C18020vd.A00(r6, r7, r0)
            if (r1 < r0) goto L_0x025c
            android.content.SharedPreferences r3 = r12.A03()
            java.lang.String r2 = "payments_last_two_factor_nudge_time"
            r0 = 0
            long r8 = r3.getLong(r2, r0)
            long r2 = A0G
            long r8 = r8 + r2
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x025c
            android.content.SharedPreferences r2 = r12.A03()
            java.lang.String r8 = "payments_home_recovery_2fa_upsell_banner_display"
            long r13 = r2.getLong(r8, r0)
            android.content.SharedPreferences r2 = r12.A03()
            java.lang.String r9 = "payments_home_recovery_2fa_upsell_banner_impression"
            r0 = 10
            long r2 = r2.getLong(r9, r0)
            r0 = 0
            int r10 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x0218
            int r10 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x0245
        L_0x0218:
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x0245
            android.content.SharedPreferences r7 = r12.A03()
            java.lang.String r6 = "payments_home_recovery_2fa_upsell_banner_impression_update_timestamp"
            long r10 = r7.getLong(r6, r0)
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0231
            long r0 = A0F
            long r10 = r10 + r0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0242
        L_0x0231:
            r0 = 1
            long r2 = r2 - r0
            android.content.SharedPreferences r0 = r12.A03()
            X.AnonymousClass8BW.A12(r0, r9, r2)
            android.content.SharedPreferences r0 = r12.A03()
            X.AnonymousClass8BW.A12(r0, r6, r4)
        L_0x0242:
            r1 = 8
            return r1
        L_0x0245:
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x025c
            r0 = 10
            android.content.SharedPreferences r2 = r12.A03()
            X.AnonymousClass8BW.A12(r2, r9, r0)
            long r0 = A0H
            long r4 = r4 + r0
            android.content.SharedPreferences r0 = r12.A03()
            X.AnonymousClass8BW.A12(r0, r8, r4)
        L_0x025c:
            r0 = 2318(0x90e, float:3.248E-42)
            boolean r0 = X.C18020vd.A05(r6, r7, r0)
            if (r0 == 0) goto L_0x0271
            android.content.SharedPreferences r1 = r12.A03()
            java.lang.String r0 = "payments_home_scan_to_pay_banner_dismissed"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 != 0) goto L_0x0271
            return r16
        L_0x0271:
            r0 = 3332(0xd04, float:4.669E-42)
            boolean r0 = X.C18020vd.A05(r6, r7, r0)
            if (r0 == 0) goto L_0x0287
            android.content.SharedPreferences r1 = r12.A03()
            java.lang.String r0 = "payments_home_upi_video_banner_dismissed"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            r1 = 9
            if (r0 == 0) goto L_0x002e
        L_0x0287:
            r1 = 0
            return r1
        L_0x0289:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel.A0c():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (X.A8C.A04(r4, r3.A0G()) != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r1.contains(r2) != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (X.C17880vN.A1W(r5.A07.A03(), "payment_has_received_upi_mandate_request") != false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0d() {
        /*
            r5 = this;
            X.0ve r4 = r5.A03
            X.AXS r3 = r5.A04
            java.lang.String r2 = r3.A0G()
            r1 = 1231(0x4cf, float:1.725E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x003b
            r0 = 2835(0xb13, float:3.973E-42)
            java.lang.String r1 = r4.A0I(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x003b
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x003b
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L_0x003b
        L_0x002a:
            X.1QD r0 = r5.A07
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "payment_has_received_upi_mandate_request"
            boolean r1 = X.C17880vN.A1W(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            return r0
        L_0x003b:
            java.lang.String r0 = r3.A0G()
            boolean r0 = X.A8C.A04(r4, r0)
            if (r0 == 0) goto L_0x0039
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel.A0d():boolean");
    }

    public static A5C A03(IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel) {
        return new A5C(new A13(-1, 2131233663, 2131169108, 2131169109), new A13(-1, 2131232396, 0, 0), new A13(-1, 2131232038, 0, 0), new C20863Aaf(indiaPaymentSettingsViewModel, 11), AnonymousClass8GH.A00(2131897461), A5K.A05, AnonymousClass8GH.A00(2131897462), (AnonymousClass5YR) null, 2131433608, 0, 0, 0, 0, 0);
    }

    public void A0a(String str) {
        if (!TextUtils.isEmpty(str)) {
            int A0E2 = this.A0B.A0E(Uri.parse(str));
            if (A0E2 != 19) {
                switch (A0E2) {
                    case 119:
                    case 120:
                    case 121:
                    case 122:
                    case 123:
                    case 124:
                    case 125:
                    case 126:
                    case StringTreeSet.OFFSET_BASE_ENCODING:
                        break;
                    default:
                        switch (A0E2) {
                            case 132:
                            case 133:
                            case 134:
                            case 135:
                            case 136:
                                break;
                            default:
                                super.A0a(str);
                                return;
                        }
                }
            }
            AnonymousClass3MX.A1K(this.A00, A0E2);
        }
    }
}
