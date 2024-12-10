package com.whatsapp.payments;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1KJ;
import X.AnonymousClass1KL;
import X.AnonymousClass1QJ;
import X.BD1;
import X.C17900vP;
import X.C18070vi;
import X.C19880zA;
import X.C57312is;
import X.C63572tK;
import com.whatsapp.util.Log;

public final class PaymentConfiguration {
    public C57312is A00;
    public final C19880zA A01;
    public final AnonymousClass1QJ A02;
    public final AnonymousClass00H A03;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if ("UNSET".equalsIgnoreCase(r3) != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a1, code lost:
        r3 = X.C17900vP.A05(r0, r3);
        r2 = X.C17880vN.A1b("USD", "PEN", 11, 1);
        r2[2] = "COP";
        r2[3] = "ARS";
        r2[4] = "CLP";
        r2[5] = "IDR";
        r2[6] = "ILS";
        r2[7] = "AED";
        X.C17890vO.A0x("TRY", "HKD", r2);
        r1 = new X.C52432au(new X.C59142lp(r3, X.C17900vP.A0I("MXN", r2, 10)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ea, code lost:
        r3 = X.C17900vP.A05(r0, r3);
        r2 = X.C17880vN.A1b("USD", "PEN", 11, 1);
        r2[2] = "COP";
        r2[3] = "ARS";
        r2[4] = "CLP";
        r2[5] = "IDR";
        r2[6] = "ILS";
        r2[7] = "AED";
        X.C17890vO.A0x("TRY", "HKD", r2);
        r1 = new X.C52432au(new X.C59142lp(r3, X.C17900vP.A0I("MXN", r2, 10)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0241, code lost:
        r2 = new X.C57312is(r1, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C57312is A00(java.lang.String r23) {
        /*
            r22 = this;
            r3 = r23
            r5 = r22
            if (r23 == 0) goto L_0x0016
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0016
            X.2tK r0 = X.C63572tK.A0E
            java.lang.String r0 = "UNSET"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0033
        L_0x0016:
            X.1QJ r0 = r5.A02
            X.2tK r2 = r0.A02()
            if (r2 != 0) goto L_0x0025
            java.lang.String r0 = "PAY: PaymentConfiguration/initializeFactory/null country code/null default country"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r2 = 0
        L_0x0024:
            return r2
        L_0x0025:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: PaymentConfiguration/initializeFactory/null country code/default country code="
            r1.append(r0)
            java.lang.String r3 = r2.A03
            X.C17890vO.A19(r1, r3)
        L_0x0033:
            X.2is r2 = r5.A00
            if (r2 == 0) goto L_0x0040
            java.lang.String r1 = r2.A00
            r0 = 1
            boolean r0 = X.AnonymousClass1YE.A09(r1, r3, r0)
            if (r0 != 0) goto L_0x0024
        L_0x0040:
            X.0zA r0 = r5.A01
            java.lang.Object r1 = r0.A03()
            X.2as r1 = (X.C52412as) r1
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentFactory/empty country code"
        L_0x0050:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r2 = 0
        L_0x0054:
            r5.A00 = r2
            return r2
        L_0x0057:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r3.toUpperCase(r0)
            java.util.Map r3 = r1.A00
            boolean r0 = r3.containsKey(r4)
            if (r0 == 0) goto L_0x0092
            int r0 = r4.hashCode()
            r21 = 5
            r7 = 11
            r20 = 6
            r19 = 4
            r18 = 3
            r17 = 2
            r2 = 1
            r16 = -1
            switch(r0) {
                case 2084: goto L_0x009d;
                case 2097: goto L_0x00a8;
                case 2128: goto L_0x00b3;
                case 2153: goto L_0x00be;
                case 2156: goto L_0x00c9;
                case 2206: goto L_0x00d4;
                case 2307: goto L_0x00df;
                case 2331: goto L_0x00ea;
                case 2339: goto L_0x00f5;
                case 2341: goto L_0x0101;
                case 2475: goto L_0x010d;
                case 2549: goto L_0x0119;
                case 2644: goto L_0x0125;
                case 2686: goto L_0x0131;
                case 2718: goto L_0x013d;
                default: goto L_0x007b;
            }
        L_0x007b:
            java.lang.String r6 = "HKD"
            java.lang.String r1 = "TRY"
            java.lang.String r15 = "AED"
            java.lang.String r14 = "ILS"
            java.lang.String r13 = "IDR"
            java.lang.String r12 = "CLP"
            java.lang.String r11 = "ARS"
            java.lang.String r10 = "COP"
            java.lang.String r9 = "PEN"
            java.lang.String r8 = "USD"
            switch(r16) {
                case 0: goto L_0x0149;
                case 1: goto L_0x014d;
                case 2: goto L_0x0150;
                case 3: goto L_0x016d;
                case 4: goto L_0x0170;
                case 5: goto L_0x0173;
                case 6: goto L_0x0176;
                case 7: goto L_0x0179;
                case 8: goto L_0x017c;
                case 9: goto L_0x017f;
                case 10: goto L_0x019c;
                case 11: goto L_0x019f;
                case 12: goto L_0x01cc;
                case 13: goto L_0x01e8;
                case 14: goto L_0x0215;
                default: goto L_0x0092;
            }
        L_0x0092:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentFactory/unmapped factory for country code="
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r1)
            goto L_0x0050
        L_0x009d:
            java.lang.String r0 = "AE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007b
            r16 = 0
            goto L_0x007b
        L_0x00a8:
            java.lang.String r0 = "AR"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007b
            r16 = 1
            goto L_0x007b
        L_0x00b3:
            java.lang.String r0 = "BR"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007b
            r16 = 2
            goto L_0x007b
        L_0x00be:
            java.lang.String r0 = "CL"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007b
            r16 = 3
            goto L_0x007b
        L_0x00c9:
            java.lang.String r0 = "CO"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007b
            r16 = 4
            goto L_0x007b
        L_0x00d4:
            java.lang.String r0 = "EC"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007b
            r16 = 5
            goto L_0x007b
        L_0x00df:
            java.lang.String r0 = "HK"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007b
            r16 = 6
            goto L_0x007b
        L_0x00ea:
            java.lang.String r0 = "ID"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007b
            r16 = 7
            goto L_0x007b
        L_0x00f5:
            java.lang.String r0 = "IL"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007b
            r16 = 8
            goto L_0x007b
        L_0x0101:
            java.lang.String r0 = "IN"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007b
            r16 = 9
            goto L_0x007b
        L_0x010d:
            java.lang.String r0 = "MX"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007b
            r16 = 10
            goto L_0x007b
        L_0x0119:
            java.lang.String r0 = "PE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007b
            r16 = 11
            goto L_0x007b
        L_0x0125:
            java.lang.String r0 = "SG"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007b
            r16 = 12
            goto L_0x007b
        L_0x0131:
            java.lang.String r0 = "TR"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007b
            r16 = 13
            goto L_0x007b
        L_0x013d:
            java.lang.String r0 = "US"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007b
            r16 = 14
            goto L_0x007b
        L_0x0149:
            java.lang.String r0 = "AE"
            goto L_0x01ea
        L_0x014d:
            java.lang.String r0 = "AR"
            goto L_0x01a1
        L_0x0150:
            java.lang.String r0 = "BR"
            X.BD1 r2 = X.C17900vP.A05(r0, r3)
            java.lang.String r0 = "BRL"
            java.util.Set r0 = java.util.Collections.singleton(r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            X.2lp r0 = new X.2lp
            r0.<init>(r2, r1)
            X.2LX r1 = new X.2LX
            r1.<init>(r0)
            goto L_0x0241
        L_0x016d:
            java.lang.String r0 = "CL"
            goto L_0x01a1
        L_0x0170:
            java.lang.String r0 = "CO"
            goto L_0x01a1
        L_0x0173:
            java.lang.String r0 = "EC"
            goto L_0x01a1
        L_0x0176:
            java.lang.String r0 = "HK"
            goto L_0x01ea
        L_0x0179:
            java.lang.String r0 = "ID"
            goto L_0x01ea
        L_0x017c:
            java.lang.String r0 = "IL"
            goto L_0x01ea
        L_0x017f:
            java.lang.String r0 = "IN"
            X.BD1 r2 = X.C17900vP.A05(r0, r3)
            java.lang.String r0 = "INR"
            java.util.Set r0 = java.util.Collections.singleton(r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            X.2lp r0 = new X.2lp
            r0.<init>(r2, r1)
            X.2LZ r1 = new X.2LZ
            r1.<init>(r0)
            goto L_0x0241
        L_0x019c:
            java.lang.String r0 = "MX"
            goto L_0x01a1
        L_0x019f:
            java.lang.String r0 = "PE"
        L_0x01a1:
            X.BD1 r3 = X.C17900vP.A05(r0, r3)
            java.lang.String[] r2 = X.C17880vN.A1b(r8, r9, r7, r2)
            r2[r17] = r10
            r2[r18] = r11
            r2[r19] = r12
            r2[r21] = r13
            r2[r20] = r14
            r0 = 7
            r2[r0] = r15
            X.C17890vO.A0x(r1, r6, r2)
            java.lang.String r1 = "MXN"
            r0 = 10
            java.util.HashSet r1 = X.C17900vP.A0I(r1, r2, r0)
            X.2lp r0 = new X.2lp
            r0.<init>(r3, r1)
            X.2LY r1 = new X.2LY
            r1.<init>(r0)
            goto L_0x0241
        L_0x01cc:
            java.lang.String r0 = "SG"
            X.BD1 r2 = X.C17900vP.A05(r0, r3)
            java.lang.String r0 = "SGD"
            java.util.Set r0 = java.util.Collections.singleton(r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            X.2lp r0 = new X.2lp
            r0.<init>(r2, r1)
            X.2La r1 = new X.2La
            r1.<init>(r0)
            goto L_0x0241
        L_0x01e8:
            java.lang.String r0 = "TR"
        L_0x01ea:
            X.BD1 r3 = X.C17900vP.A05(r0, r3)
            java.lang.String[] r2 = X.C17880vN.A1b(r8, r9, r7, r2)
            r2[r17] = r10
            r2[r18] = r11
            r2[r19] = r12
            r2[r21] = r13
            r2[r20] = r14
            r0 = 7
            r2[r0] = r15
            X.C17890vO.A0x(r1, r6, r2)
            java.lang.String r1 = "MXN"
            r0 = 10
            java.util.HashSet r1 = X.C17900vP.A0I(r1, r2, r0)
            X.2lp r0 = new X.2lp
            r0.<init>(r3, r1)
            X.2LY r1 = new X.2LY
            r1.<init>(r0)
            goto L_0x0241
        L_0x0215:
            java.lang.String r0 = "US"
            X.BD1 r3 = X.C17900vP.A05(r0, r3)
            java.lang.String[] r2 = X.C17880vN.A1b(r8, r9, r7, r2)
            r2[r17] = r10
            r2[r18] = r11
            r2[r19] = r12
            r2[r21] = r13
            r2[r20] = r14
            r0 = 7
            r2[r0] = r15
            X.C17890vO.A0x(r1, r6, r2)
            java.lang.String r1 = "MXN"
            r0 = 10
            java.util.HashSet r1 = X.C17900vP.A0I(r1, r2, r0)
            X.2lp r0 = new X.2lp
            r0.<init>(r3, r1)
            X.2LY r1 = new X.2LY
            r1.<init>(r0)
        L_0x0241:
            X.2is r2 = new X.2is
            r2.<init>(r1, r4)
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.PaymentConfiguration.A00(java.lang.String):X.2is");
    }

    public BD1 A01() {
        String str;
        this.A03.get();
        AnonymousClass1QJ r1 = this.A02;
        C63572tK A022 = r1.A02();
        if (A022 == null) {
            Log.e("PAY: PaymentConfiguration/getService/null country");
        } else {
            String str2 = A022.A03;
            C57312is A002 = A00(str2);
            AnonymousClass1KJ A012 = r1.A01();
            if (A012 != null) {
                str = ((AnonymousClass1KL) A012).A06;
                C18070vi.A0W(str);
            } else {
                str = null;
            }
            C17900vP.A0e("PAY: PaymentConfiguration/getService/defaulted to countryCode=", str2, AnonymousClass000.A10());
            if (A002 != null) {
                return A002.A00(str);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01b6, code lost:
        if (r12.equals(r0) != false) goto L_0x03fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01f3, code lost:
        if (r12.equals(r0) != false) goto L_0x0402;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        com.whatsapp.util.Log.e("PAY: PaymentConfigurationMap/getPaymentService/currency set/unmapped service for currency");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0230, code lost:
        if (r12.equals(r0) != false) goto L_0x0408;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x026d, code lost:
        if (r12.equals(r0) != false) goto L_0x040e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x02aa, code lost:
        if (r12.equals(r0) != false) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        r2 = X.AnonymousClass000.A10();
        r2.append("PAY: PaymentConfigurationMap/getPaymentService/country=");
        r2.append(r1);
        X.C17890vO.A19(r2, "/unmapped service");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x02e7, code lost:
        if (r12.equals(r0) != false) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x02f1, code lost:
        if (r1.equals(r3) != false) goto L_0x0487;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x032e, code lost:
        if (r12.equals(r0) != false) goto L_0x041f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0376, code lost:
        if (r12.equals(r0) == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x037c, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0382, code lost:
        switch(r1.hashCode()) {
            case 2084: goto L_0x03dd;
            case 2097: goto L_0x03d6;
            case 2153: goto L_0x03cf;
            case 2156: goto L_0x03c8;
            case 2206: goto L_0x03c1;
            case 2307: goto L_0x03ba;
            case 2331: goto L_0x03b3;
            case 2339: goto L_0x03ac;
            case 2475: goto L_0x03a5;
            case 2549: goto L_0x039e;
            case 2686: goto L_0x0397;
            case 2718: goto L_0x0390;
            default: goto L_0x0385;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0385, code lost:
        r2 = X.AnonymousClass000.A10();
        r2.append("PAY: PaymentConfigurationMap/getPaymentService/currency set/unmapped service for country=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0394, code lost:
        if (r1.equals("US") != false) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x039b, code lost:
        if (r1.equals("TR") != false) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x03a2, code lost:
        if (r1.equals("PE") != false) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x03a9, code lost:
        if (r1.equals("MX") != false) goto L_0x03f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x03b0, code lost:
        if (r1.equals("IL") != false) goto L_0x03fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x03b7, code lost:
        if (r1.equals("ID") != false) goto L_0x0402;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x03be, code lost:
        if (r1.equals("HK") != false) goto L_0x0408;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x03c5, code lost:
        if (r1.equals("EC") != false) goto L_0x040e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x03cc, code lost:
        if (r1.equals("CO") != false) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x03d3, code lost:
        if (r1.equals("CL") != false) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x03da, code lost:
        if (r1.equals("AR") != false) goto L_0x041f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x03e1, code lost:
        if (r1.equals(r3) != false) goto L_0x0487;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x03e4, code lost:
        r0 = r2.get("US");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x03ea, code lost:
        r0 = r2.get("TR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x03f0, code lost:
        r0 = r2.get("PE");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x03f6, code lost:
        r0 = r2.get("MX");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x03fc, code lost:
        r0 = r2.get("IL");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0402, code lost:
        r0 = r2.get("ID");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0408, code lost:
        r0 = r2.get("HK");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x040e, code lost:
        r0 = r2.get("EC");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0414, code lost:
        r0 = r2.get("CO");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x041a, code lost:
        r0 = r2.get("CL");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x041f, code lost:
        r0 = r2.get("AR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0424, code lost:
        r0 = "PAY: PaymentConfigurationMap/getPaymentService/currency set/requires country but is empty";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x043a, code lost:
        r2 = X.AnonymousClass000.A10();
        r2.append("PAY: PaymentConfigurationMap/getPaymentService/country=");
        r2.append(r1);
        r1 = "/unmapped service for currency";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0448, code lost:
        r0 = X.AnonymousClass000.A0y(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x044c, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0450, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0475, code lost:
        if (r12.equals(r0) == false) goto L_0x043a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0478, code lost:
        r2 = X.AnonymousClass000.A10();
        r2.append("PAY: PaymentConfigurationMap/getPaymentService/country=");
        r2.append(r1);
        r1 = "/requires currency but is empty";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0487, code lost:
        r0 = r2.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x049a, code lost:
        r0 = (X.C18140vp) r0;
        r0.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x04a5, code lost:
        return (X.BD1) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ba, code lost:
        if (r12.equals(r0) != false) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f7, code lost:
        if (r12.equals(r0) != false) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0138, code lost:
        if (r12.equals(r0) != false) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0175, code lost:
        if (r12.equals(r0) != false) goto L_0x03f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.BD1 A02(java.lang.String r17, java.lang.String r18) {
        /*
            r16 = this;
            r1 = r17
            r12 = r18
            r0 = r16
            X.0zA r0 = r0.A01
            java.lang.Object r2 = r0.A03()
            X.2as r2 = (X.C52412as) r2
            if (r17 == 0) goto L_0x0016
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r0)
        L_0x0016:
            java.util.Map r2 = r2.A00
            boolean r3 = r2.containsKey(r1)
            r0 = 0
            if (r3 != 0) goto L_0x002d
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "PAY: PaymentConfigurationMap/getPaymentFactory/unmapped service for country code="
            java.lang.String r1 = X.AnonymousClass001.A1H(r2, r1, r3)
        L_0x0029:
            com.whatsapp.util.Log.e((java.lang.String) r1)
            return r0
        L_0x002d:
            if (r18 == 0) goto L_0x0035
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r12 = r12.toUpperCase(r0)
        L_0x0035:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            java.lang.String r11 = "US"
            java.lang.String r15 = "TR"
            java.lang.String r14 = "PE"
            java.lang.String r13 = "MX"
            java.lang.String r10 = "IL"
            java.lang.String r9 = "ID"
            java.lang.String r8 = "HK"
            java.lang.String r7 = "EC"
            java.lang.String r6 = "CO"
            java.lang.String r5 = "CL"
            java.lang.String r4 = "AR"
            java.lang.String r3 = "AE"
            if (r0 != 0) goto L_0x005f
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x0370;
                case 65090: goto L_0x036d;
                case 66044: goto L_0x048c;
                case 66823: goto L_0x036a;
                case 66916: goto L_0x0367;
                case 71585: goto L_0x0364;
                case 72343: goto L_0x0361;
                case 72592: goto L_0x035e;
                case 72653: goto L_0x034e;
                case 76803: goto L_0x034b;
                case 79097: goto L_0x0348;
                case 82032: goto L_0x0332;
                case 83355: goto L_0x0345;
                case 84326: goto L_0x0342;
                default: goto L_0x005a;
            }
        L_0x005a:
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentService/currency set/unmapped service for currency"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x005f:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x007d
            int r0 = r1.hashCode()
            switch(r0) {
                case 2084: goto L_0x0427;
                case 2097: goto L_0x02f5;
                case 2128: goto L_0x02eb;
                case 2153: goto L_0x02ae;
                case 2156: goto L_0x0271;
                case 2206: goto L_0x0234;
                case 2307: goto L_0x01f7;
                case 2331: goto L_0x01ba;
                case 2339: goto L_0x017d;
                case 2341: goto L_0x0179;
                case 2475: goto L_0x013c;
                case 2549: goto L_0x00ff;
                case 2644: goto L_0x00fb;
                case 2686: goto L_0x00be;
                case 2718: goto L_0x0081;
                default: goto L_0x006c;
            }
        L_0x006c:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentService/country="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "/unmapped service"
            X.C17890vO.A19(r2, r0)
        L_0x007d:
            r0 = 0
            java.lang.String r1 = "PAY: PaymentConfigurationMap/getPaymentService/unmapped service for country and currency"
            goto L_0x0029
        L_0x0081:
            boolean r0 = r1.equals(r11)
            if (r0 == 0) goto L_0x006c
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0478
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x00b4;
                case 65090: goto L_0x00b1;
                case 66823: goto L_0x00ae;
                case 66916: goto L_0x00ab;
                case 71585: goto L_0x00a8;
                case 72343: goto L_0x00a5;
                case 72592: goto L_0x00a2;
                case 76803: goto L_0x009f;
                case 79097: goto L_0x009c;
                case 83355: goto L_0x0099;
                case 84326: goto L_0x0096;
                default: goto L_0x0094;
            }
        L_0x0094:
            goto L_0x043a
        L_0x0096:
            java.lang.String r0 = "USD"
            goto L_0x00b6
        L_0x0099:
            java.lang.String r0 = "TRY"
            goto L_0x00b6
        L_0x009c:
            java.lang.String r0 = "PEN"
            goto L_0x00b6
        L_0x009f:
            java.lang.String r0 = "MXN"
            goto L_0x00b6
        L_0x00a2:
            java.lang.String r0 = "ILS"
            goto L_0x00b6
        L_0x00a5:
            java.lang.String r0 = "IDR"
            goto L_0x00b6
        L_0x00a8:
            java.lang.String r0 = "HKD"
            goto L_0x00b6
        L_0x00ab:
            java.lang.String r0 = "COP"
            goto L_0x00b6
        L_0x00ae:
            java.lang.String r0 = "CLP"
            goto L_0x00b6
        L_0x00b1:
            java.lang.String r0 = "ARS"
            goto L_0x00b6
        L_0x00b4:
            java.lang.String r0 = "AED"
        L_0x00b6:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03e4
            goto L_0x043a
        L_0x00be:
            boolean r0 = r1.equals(r15)
            if (r0 == 0) goto L_0x006c
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0478
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x00f1;
                case 65090: goto L_0x00ee;
                case 66823: goto L_0x00eb;
                case 66916: goto L_0x00e8;
                case 71585: goto L_0x00e5;
                case 72343: goto L_0x00e2;
                case 72592: goto L_0x00df;
                case 76803: goto L_0x00dc;
                case 79097: goto L_0x00d9;
                case 83355: goto L_0x00d6;
                case 84326: goto L_0x00d3;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            goto L_0x043a
        L_0x00d3:
            java.lang.String r0 = "USD"
            goto L_0x00f3
        L_0x00d6:
            java.lang.String r0 = "TRY"
            goto L_0x00f3
        L_0x00d9:
            java.lang.String r0 = "PEN"
            goto L_0x00f3
        L_0x00dc:
            java.lang.String r0 = "MXN"
            goto L_0x00f3
        L_0x00df:
            java.lang.String r0 = "ILS"
            goto L_0x00f3
        L_0x00e2:
            java.lang.String r0 = "IDR"
            goto L_0x00f3
        L_0x00e5:
            java.lang.String r0 = "HKD"
            goto L_0x00f3
        L_0x00e8:
            java.lang.String r0 = "COP"
            goto L_0x00f3
        L_0x00eb:
            java.lang.String r0 = "CLP"
            goto L_0x00f3
        L_0x00ee:
            java.lang.String r0 = "ARS"
            goto L_0x00f3
        L_0x00f1:
            java.lang.String r0 = "AED"
        L_0x00f3:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03ea
            goto L_0x043a
        L_0x00fb:
            java.lang.String r3 = "SG"
            goto L_0x02ed
        L_0x00ff:
            boolean r0 = r1.equals(r14)
            if (r0 == 0) goto L_0x006c
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0478
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x0132;
                case 65090: goto L_0x012f;
                case 66823: goto L_0x012c;
                case 66916: goto L_0x0129;
                case 71585: goto L_0x0126;
                case 72343: goto L_0x0123;
                case 72592: goto L_0x0120;
                case 76803: goto L_0x011d;
                case 79097: goto L_0x011a;
                case 83355: goto L_0x0117;
                case 84326: goto L_0x0114;
                default: goto L_0x0112;
            }
        L_0x0112:
            goto L_0x043a
        L_0x0114:
            java.lang.String r0 = "USD"
            goto L_0x0134
        L_0x0117:
            java.lang.String r0 = "TRY"
            goto L_0x0134
        L_0x011a:
            java.lang.String r0 = "PEN"
            goto L_0x0134
        L_0x011d:
            java.lang.String r0 = "MXN"
            goto L_0x0134
        L_0x0120:
            java.lang.String r0 = "ILS"
            goto L_0x0134
        L_0x0123:
            java.lang.String r0 = "IDR"
            goto L_0x0134
        L_0x0126:
            java.lang.String r0 = "HKD"
            goto L_0x0134
        L_0x0129:
            java.lang.String r0 = "COP"
            goto L_0x0134
        L_0x012c:
            java.lang.String r0 = "CLP"
            goto L_0x0134
        L_0x012f:
            java.lang.String r0 = "ARS"
            goto L_0x0134
        L_0x0132:
            java.lang.String r0 = "AED"
        L_0x0134:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03f0
            goto L_0x043a
        L_0x013c:
            boolean r0 = r1.equals(r13)
            if (r0 == 0) goto L_0x006c
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0478
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x016f;
                case 65090: goto L_0x016c;
                case 66823: goto L_0x0169;
                case 66916: goto L_0x0166;
                case 71585: goto L_0x0163;
                case 72343: goto L_0x0160;
                case 72592: goto L_0x015d;
                case 76803: goto L_0x015a;
                case 79097: goto L_0x0157;
                case 83355: goto L_0x0154;
                case 84326: goto L_0x0151;
                default: goto L_0x014f;
            }
        L_0x014f:
            goto L_0x043a
        L_0x0151:
            java.lang.String r0 = "USD"
            goto L_0x0171
        L_0x0154:
            java.lang.String r0 = "TRY"
            goto L_0x0171
        L_0x0157:
            java.lang.String r0 = "PEN"
            goto L_0x0171
        L_0x015a:
            java.lang.String r0 = "MXN"
            goto L_0x0171
        L_0x015d:
            java.lang.String r0 = "ILS"
            goto L_0x0171
        L_0x0160:
            java.lang.String r0 = "IDR"
            goto L_0x0171
        L_0x0163:
            java.lang.String r0 = "HKD"
            goto L_0x0171
        L_0x0166:
            java.lang.String r0 = "COP"
            goto L_0x0171
        L_0x0169:
            java.lang.String r0 = "CLP"
            goto L_0x0171
        L_0x016c:
            java.lang.String r0 = "ARS"
            goto L_0x0171
        L_0x016f:
            java.lang.String r0 = "AED"
        L_0x0171:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03f6
            goto L_0x043a
        L_0x0179:
            java.lang.String r3 = "IN"
            goto L_0x02ed
        L_0x017d:
            boolean r0 = r1.equals(r10)
            if (r0 == 0) goto L_0x006c
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0478
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x01b0;
                case 65090: goto L_0x01ad;
                case 66823: goto L_0x01aa;
                case 66916: goto L_0x01a7;
                case 71585: goto L_0x01a4;
                case 72343: goto L_0x01a1;
                case 72592: goto L_0x019e;
                case 76803: goto L_0x019b;
                case 79097: goto L_0x0198;
                case 83355: goto L_0x0195;
                case 84326: goto L_0x0192;
                default: goto L_0x0190;
            }
        L_0x0190:
            goto L_0x043a
        L_0x0192:
            java.lang.String r0 = "USD"
            goto L_0x01b2
        L_0x0195:
            java.lang.String r0 = "TRY"
            goto L_0x01b2
        L_0x0198:
            java.lang.String r0 = "PEN"
            goto L_0x01b2
        L_0x019b:
            java.lang.String r0 = "MXN"
            goto L_0x01b2
        L_0x019e:
            java.lang.String r0 = "ILS"
            goto L_0x01b2
        L_0x01a1:
            java.lang.String r0 = "IDR"
            goto L_0x01b2
        L_0x01a4:
            java.lang.String r0 = "HKD"
            goto L_0x01b2
        L_0x01a7:
            java.lang.String r0 = "COP"
            goto L_0x01b2
        L_0x01aa:
            java.lang.String r0 = "CLP"
            goto L_0x01b2
        L_0x01ad:
            java.lang.String r0 = "ARS"
            goto L_0x01b2
        L_0x01b0:
            java.lang.String r0 = "AED"
        L_0x01b2:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03fc
            goto L_0x043a
        L_0x01ba:
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x006c
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0478
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x01ed;
                case 65090: goto L_0x01ea;
                case 66823: goto L_0x01e7;
                case 66916: goto L_0x01e4;
                case 71585: goto L_0x01e1;
                case 72343: goto L_0x01de;
                case 72592: goto L_0x01db;
                case 76803: goto L_0x01d8;
                case 79097: goto L_0x01d5;
                case 83355: goto L_0x01d2;
                case 84326: goto L_0x01cf;
                default: goto L_0x01cd;
            }
        L_0x01cd:
            goto L_0x043a
        L_0x01cf:
            java.lang.String r0 = "USD"
            goto L_0x01ef
        L_0x01d2:
            java.lang.String r0 = "TRY"
            goto L_0x01ef
        L_0x01d5:
            java.lang.String r0 = "PEN"
            goto L_0x01ef
        L_0x01d8:
            java.lang.String r0 = "MXN"
            goto L_0x01ef
        L_0x01db:
            java.lang.String r0 = "ILS"
            goto L_0x01ef
        L_0x01de:
            java.lang.String r0 = "IDR"
            goto L_0x01ef
        L_0x01e1:
            java.lang.String r0 = "HKD"
            goto L_0x01ef
        L_0x01e4:
            java.lang.String r0 = "COP"
            goto L_0x01ef
        L_0x01e7:
            java.lang.String r0 = "CLP"
            goto L_0x01ef
        L_0x01ea:
            java.lang.String r0 = "ARS"
            goto L_0x01ef
        L_0x01ed:
            java.lang.String r0 = "AED"
        L_0x01ef:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0402
            goto L_0x043a
        L_0x01f7:
            boolean r0 = r1.equals(r8)
            if (r0 == 0) goto L_0x006c
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0478
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x022a;
                case 65090: goto L_0x0227;
                case 66823: goto L_0x0224;
                case 66916: goto L_0x0221;
                case 71585: goto L_0x021e;
                case 72343: goto L_0x021b;
                case 72592: goto L_0x0218;
                case 76803: goto L_0x0215;
                case 79097: goto L_0x0212;
                case 83355: goto L_0x020f;
                case 84326: goto L_0x020c;
                default: goto L_0x020a;
            }
        L_0x020a:
            goto L_0x043a
        L_0x020c:
            java.lang.String r0 = "USD"
            goto L_0x022c
        L_0x020f:
            java.lang.String r0 = "TRY"
            goto L_0x022c
        L_0x0212:
            java.lang.String r0 = "PEN"
            goto L_0x022c
        L_0x0215:
            java.lang.String r0 = "MXN"
            goto L_0x022c
        L_0x0218:
            java.lang.String r0 = "ILS"
            goto L_0x022c
        L_0x021b:
            java.lang.String r0 = "IDR"
            goto L_0x022c
        L_0x021e:
            java.lang.String r0 = "HKD"
            goto L_0x022c
        L_0x0221:
            java.lang.String r0 = "COP"
            goto L_0x022c
        L_0x0224:
            java.lang.String r0 = "CLP"
            goto L_0x022c
        L_0x0227:
            java.lang.String r0 = "ARS"
            goto L_0x022c
        L_0x022a:
            java.lang.String r0 = "AED"
        L_0x022c:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0408
            goto L_0x043a
        L_0x0234:
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L_0x006c
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0478
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x0267;
                case 65090: goto L_0x0264;
                case 66823: goto L_0x0261;
                case 66916: goto L_0x025e;
                case 71585: goto L_0x025b;
                case 72343: goto L_0x0258;
                case 72592: goto L_0x0255;
                case 76803: goto L_0x0252;
                case 79097: goto L_0x024f;
                case 83355: goto L_0x024c;
                case 84326: goto L_0x0249;
                default: goto L_0x0247;
            }
        L_0x0247:
            goto L_0x043a
        L_0x0249:
            java.lang.String r0 = "USD"
            goto L_0x0269
        L_0x024c:
            java.lang.String r0 = "TRY"
            goto L_0x0269
        L_0x024f:
            java.lang.String r0 = "PEN"
            goto L_0x0269
        L_0x0252:
            java.lang.String r0 = "MXN"
            goto L_0x0269
        L_0x0255:
            java.lang.String r0 = "ILS"
            goto L_0x0269
        L_0x0258:
            java.lang.String r0 = "IDR"
            goto L_0x0269
        L_0x025b:
            java.lang.String r0 = "HKD"
            goto L_0x0269
        L_0x025e:
            java.lang.String r0 = "COP"
            goto L_0x0269
        L_0x0261:
            java.lang.String r0 = "CLP"
            goto L_0x0269
        L_0x0264:
            java.lang.String r0 = "ARS"
            goto L_0x0269
        L_0x0267:
            java.lang.String r0 = "AED"
        L_0x0269:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x040e
            goto L_0x043a
        L_0x0271:
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L_0x006c
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0478
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x02a4;
                case 65090: goto L_0x02a1;
                case 66823: goto L_0x029e;
                case 66916: goto L_0x029b;
                case 71585: goto L_0x0298;
                case 72343: goto L_0x0295;
                case 72592: goto L_0x0292;
                case 76803: goto L_0x028f;
                case 79097: goto L_0x028c;
                case 83355: goto L_0x0289;
                case 84326: goto L_0x0286;
                default: goto L_0x0284;
            }
        L_0x0284:
            goto L_0x043a
        L_0x0286:
            java.lang.String r0 = "USD"
            goto L_0x02a6
        L_0x0289:
            java.lang.String r0 = "TRY"
            goto L_0x02a6
        L_0x028c:
            java.lang.String r0 = "PEN"
            goto L_0x02a6
        L_0x028f:
            java.lang.String r0 = "MXN"
            goto L_0x02a6
        L_0x0292:
            java.lang.String r0 = "ILS"
            goto L_0x02a6
        L_0x0295:
            java.lang.String r0 = "IDR"
            goto L_0x02a6
        L_0x0298:
            java.lang.String r0 = "HKD"
            goto L_0x02a6
        L_0x029b:
            java.lang.String r0 = "COP"
            goto L_0x02a6
        L_0x029e:
            java.lang.String r0 = "CLP"
            goto L_0x02a6
        L_0x02a1:
            java.lang.String r0 = "ARS"
            goto L_0x02a6
        L_0x02a4:
            java.lang.String r0 = "AED"
        L_0x02a6:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0414
            goto L_0x043a
        L_0x02ae:
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L_0x006c
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0478
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x02e1;
                case 65090: goto L_0x02de;
                case 66823: goto L_0x02db;
                case 66916: goto L_0x02d8;
                case 71585: goto L_0x02d5;
                case 72343: goto L_0x02d2;
                case 72592: goto L_0x02cf;
                case 76803: goto L_0x02cc;
                case 79097: goto L_0x02c9;
                case 83355: goto L_0x02c6;
                case 84326: goto L_0x02c3;
                default: goto L_0x02c1;
            }
        L_0x02c1:
            goto L_0x043a
        L_0x02c3:
            java.lang.String r0 = "USD"
            goto L_0x02e3
        L_0x02c6:
            java.lang.String r0 = "TRY"
            goto L_0x02e3
        L_0x02c9:
            java.lang.String r0 = "PEN"
            goto L_0x02e3
        L_0x02cc:
            java.lang.String r0 = "MXN"
            goto L_0x02e3
        L_0x02cf:
            java.lang.String r0 = "ILS"
            goto L_0x02e3
        L_0x02d2:
            java.lang.String r0 = "IDR"
            goto L_0x02e3
        L_0x02d5:
            java.lang.String r0 = "HKD"
            goto L_0x02e3
        L_0x02d8:
            java.lang.String r0 = "COP"
            goto L_0x02e3
        L_0x02db:
            java.lang.String r0 = "CLP"
            goto L_0x02e3
        L_0x02de:
            java.lang.String r0 = "ARS"
            goto L_0x02e3
        L_0x02e1:
            java.lang.String r0 = "AED"
        L_0x02e3:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x041a
            goto L_0x043a
        L_0x02eb:
            java.lang.String r3 = "BR"
        L_0x02ed:
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x0487
            goto L_0x006c
        L_0x02f5:
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L_0x006c
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0478
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x0328;
                case 65090: goto L_0x0325;
                case 66823: goto L_0x0322;
                case 66916: goto L_0x031f;
                case 71585: goto L_0x031c;
                case 72343: goto L_0x0319;
                case 72592: goto L_0x0316;
                case 76803: goto L_0x0313;
                case 79097: goto L_0x0310;
                case 83355: goto L_0x030d;
                case 84326: goto L_0x030a;
                default: goto L_0x0308;
            }
        L_0x0308:
            goto L_0x043a
        L_0x030a:
            java.lang.String r0 = "USD"
            goto L_0x032a
        L_0x030d:
            java.lang.String r0 = "TRY"
            goto L_0x032a
        L_0x0310:
            java.lang.String r0 = "PEN"
            goto L_0x032a
        L_0x0313:
            java.lang.String r0 = "MXN"
            goto L_0x032a
        L_0x0316:
            java.lang.String r0 = "ILS"
            goto L_0x032a
        L_0x0319:
            java.lang.String r0 = "IDR"
            goto L_0x032a
        L_0x031c:
            java.lang.String r0 = "HKD"
            goto L_0x032a
        L_0x031f:
            java.lang.String r0 = "COP"
            goto L_0x032a
        L_0x0322:
            java.lang.String r0 = "CLP"
            goto L_0x032a
        L_0x0325:
            java.lang.String r0 = "ARS"
            goto L_0x032a
        L_0x0328:
            java.lang.String r0 = "AED"
        L_0x032a:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x041f
            goto L_0x043a
        L_0x0332:
            java.lang.String r0 = "SGD"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = "SG"
            java.lang.Object r0 = r2.get(r0)
            goto L_0x049a
        L_0x0342:
            java.lang.String r0 = "USD"
            goto L_0x0372
        L_0x0345:
            java.lang.String r0 = "TRY"
            goto L_0x0372
        L_0x0348:
            java.lang.String r0 = "PEN"
            goto L_0x0372
        L_0x034b:
            java.lang.String r0 = "MXN"
            goto L_0x0372
        L_0x034e:
            java.lang.String r0 = "INR"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = "IN"
            java.lang.Object r0 = r2.get(r0)
            goto L_0x049a
        L_0x035e:
            java.lang.String r0 = "ILS"
            goto L_0x0372
        L_0x0361:
            java.lang.String r0 = "IDR"
            goto L_0x0372
        L_0x0364:
            java.lang.String r0 = "HKD"
            goto L_0x0372
        L_0x0367:
            java.lang.String r0 = "COP"
            goto L_0x0372
        L_0x036a:
            java.lang.String r0 = "CLP"
            goto L_0x0372
        L_0x036d:
            java.lang.String r0 = "ARS"
            goto L_0x0372
        L_0x0370:
            java.lang.String r0 = "AED"
        L_0x0372:
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x005a
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0424
            int r0 = r1.hashCode()
            switch(r0) {
                case 2084: goto L_0x03dd;
                case 2097: goto L_0x03d6;
                case 2153: goto L_0x03cf;
                case 2156: goto L_0x03c8;
                case 2206: goto L_0x03c1;
                case 2307: goto L_0x03ba;
                case 2331: goto L_0x03b3;
                case 2339: goto L_0x03ac;
                case 2475: goto L_0x03a5;
                case 2549: goto L_0x039e;
                case 2686: goto L_0x0397;
                case 2718: goto L_0x0390;
                default: goto L_0x0385;
            }
        L_0x0385:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentService/currency set/unmapped service for country="
            r2.append(r0)
            goto L_0x0448
        L_0x0390:
            boolean r0 = r1.equals(r11)
            if (r0 != 0) goto L_0x03e4
            goto L_0x0385
        L_0x0397:
            boolean r0 = r1.equals(r15)
            if (r0 != 0) goto L_0x03ea
            goto L_0x0385
        L_0x039e:
            boolean r0 = r1.equals(r14)
            if (r0 != 0) goto L_0x03f0
            goto L_0x0385
        L_0x03a5:
            boolean r0 = r1.equals(r13)
            if (r0 != 0) goto L_0x03f6
            goto L_0x0385
        L_0x03ac:
            boolean r0 = r1.equals(r10)
            if (r0 != 0) goto L_0x03fc
            goto L_0x0385
        L_0x03b3:
            boolean r0 = r1.equals(r9)
            if (r0 != 0) goto L_0x0402
            goto L_0x0385
        L_0x03ba:
            boolean r0 = r1.equals(r8)
            if (r0 != 0) goto L_0x0408
            goto L_0x0385
        L_0x03c1:
            boolean r0 = r1.equals(r7)
            if (r0 != 0) goto L_0x040e
            goto L_0x0385
        L_0x03c8:
            boolean r0 = r1.equals(r6)
            if (r0 != 0) goto L_0x0414
            goto L_0x0385
        L_0x03cf:
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L_0x041a
            goto L_0x0385
        L_0x03d6:
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L_0x041f
            goto L_0x0385
        L_0x03dd:
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x0487
            goto L_0x0385
        L_0x03e4:
            java.lang.Object r0 = r2.get(r11)
            goto L_0x049a
        L_0x03ea:
            java.lang.Object r0 = r2.get(r15)
            goto L_0x049a
        L_0x03f0:
            java.lang.Object r0 = r2.get(r14)
            goto L_0x049a
        L_0x03f6:
            java.lang.Object r0 = r2.get(r13)
            goto L_0x049a
        L_0x03fc:
            java.lang.Object r0 = r2.get(r10)
            goto L_0x049a
        L_0x0402:
            java.lang.Object r0 = r2.get(r9)
            goto L_0x049a
        L_0x0408:
            java.lang.Object r0 = r2.get(r8)
            goto L_0x049a
        L_0x040e:
            java.lang.Object r0 = r2.get(r7)
            goto L_0x049a
        L_0x0414:
            java.lang.Object r0 = r2.get(r6)
            goto L_0x049a
        L_0x041a:
            java.lang.Object r0 = r2.get(r5)
            goto L_0x049a
        L_0x041f:
            java.lang.Object r0 = r2.get(r4)
            goto L_0x049a
        L_0x0424:
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentService/currency set/requires country but is empty"
            goto L_0x044c
        L_0x0427:
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L_0x006c
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0478
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x046f;
                case 65090: goto L_0x046c;
                case 66823: goto L_0x0469;
                case 66916: goto L_0x0466;
                case 71585: goto L_0x0463;
                case 72343: goto L_0x0460;
                case 72592: goto L_0x045d;
                case 76803: goto L_0x045a;
                case 79097: goto L_0x0457;
                case 83355: goto L_0x0454;
                case 84326: goto L_0x0451;
                default: goto L_0x043a;
            }
        L_0x043a:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentService/country="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r1 = "/unmapped service for currency"
        L_0x0448:
            java.lang.String r0 = X.AnonymousClass000.A0y(r1, r2)
        L_0x044c:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x0451:
            java.lang.String r0 = "USD"
            goto L_0x0471
        L_0x0454:
            java.lang.String r0 = "TRY"
            goto L_0x0471
        L_0x0457:
            java.lang.String r0 = "PEN"
            goto L_0x0471
        L_0x045a:
            java.lang.String r0 = "MXN"
            goto L_0x0471
        L_0x045d:
            java.lang.String r0 = "ILS"
            goto L_0x0471
        L_0x0460:
            java.lang.String r0 = "IDR"
            goto L_0x0471
        L_0x0463:
            java.lang.String r0 = "HKD"
            goto L_0x0471
        L_0x0466:
            java.lang.String r0 = "COP"
            goto L_0x0471
        L_0x0469:
            java.lang.String r0 = "CLP"
            goto L_0x0471
        L_0x046c:
            java.lang.String r0 = "ARS"
            goto L_0x0471
        L_0x046f:
            java.lang.String r0 = "AED"
        L_0x0471:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0487
            goto L_0x043a
        L_0x0478:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentService/country="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r1 = "/requires currency but is empty"
            goto L_0x0448
        L_0x0487:
            java.lang.Object r0 = r2.get(r3)
            goto L_0x049a
        L_0x048c:
            java.lang.String r0 = "BRL"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = "BR"
            java.lang.Object r0 = r2.get(r0)
        L_0x049a:
            X.0vp r0 = (X.C18140vp) r0
            r0.getClass()
            java.lang.Object r0 = r0.get()
            X.BD1 r0 = (X.BD1) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.PaymentConfiguration.A02(java.lang.String, java.lang.String):X.BD1");
    }

    public PaymentConfiguration(C19880zA r1, AnonymousClass1QJ r2, AnonymousClass00H r3) {
        C18070vi.A0j(r3, r2);
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = r1;
    }
}
