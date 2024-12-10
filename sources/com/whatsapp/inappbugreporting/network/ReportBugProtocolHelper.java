package com.whatsapp.inappbugreporting.network;

import X.AnonymousClass00H;
import X.C18070vi;

public final class ReportBugProtocolHelper {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public ReportBugProtocolHelper(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.util.List r37, X.C30391dr r38) {
        /*
            r31 = this;
            r9 = 0
            r5 = 0
            r4 = 0
            r7 = r38
            boolean r0 = r7 instanceof X.C100414uT
            r1 = r31
            if (r0 == 0) goto L_0x0326
            r0 = r7
            X.4uT r0 = (X.C100414uT) r0
            int r6 = r0.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r6 & r3
            if (r2 == 0) goto L_0x0326
            int r6 = r6 - r3
            r0.label = r6
        L_0x0019:
            java.lang.Object r6 = r0.result
            X.1g4 r13 = X.C31751g4.COROUTINE_SUSPENDED
            int r2 = r0.label
            r7 = 1
            if (r2 == 0) goto L_0x00c2
            if (r2 != r7) goto L_0x0332
            java.lang.Object r1 = r0.L$0
            com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper r1 = (com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper) r1
            X.C30691eM.A01(r6)
        L_0x002b:
            X.9MQ r6 = (X.AnonymousClass9MQ) r6
            boolean r0 = r6 instanceof X.C173548vG
            if (r0 == 0) goto L_0x0072
            X.00H r0 = r1.A00
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.4Po r2 = (X.C85954Po) r2
            r1 = 0
            r0 = 10
            r2.A00(r0, r1)
            X.8vG r6 = (X.C173548vG) r6
            X.1ca r1 = r6.A00
            java.lang.String r0 = "task_id"
            X.1ca r0 = r1.A0K(r0)
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = "ReportBugProtocolHelper/onSuccess called with empty taskIdNode"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r1 = "onSuccess called with empty taskIdNode"
        L_0x0052:
            X.41W r0 = new X.41W
            r0.<init>(r1)
            return r0
        L_0x0058:
            java.lang.String r1 = r0.A0M()
            if (r1 == 0) goto L_0x006a
            int r0 = r1.length()
            if (r0 == 0) goto L_0x006a
            X.41X r0 = new X.41X
            r0.<init>(r1)
            return r0
        L_0x006a:
            java.lang.String r0 = "ReportBugProtocolHelper/onSuccess called with null task id"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r1 = "onSuccess called with null task id"
            goto L_0x0052
        L_0x0072:
            boolean r0 = r6 instanceof X.C173538vF
            r3 = 9
            if (r0 == 0) goto L_0x00a9
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ReportBugProtocolHelper/onError: "
            r2.append(r0)
            X.8vF r6 = (X.C173538vF) r6
            X.1ca r0 = r6.A00
            r2.append(r0)
            X.C17890vO.A0w(r2)
            android.util.Pair r2 = X.C60482o6.A01(r0)
            X.00H r0 = r1.A00
            java.lang.Object r1 = r0.get()
            X.4Po r1 = (X.C85954Po) r1
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r1.A00(r3, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "OnError: "
            java.lang.String r1 = X.AnonymousClass001.A1E(r2, r0, r1)
            goto L_0x0052
        L_0x00a9:
            boolean r0 = r6 instanceof X.C173558vH
            if (r0 == 0) goto L_0x032d
            java.lang.String r0 = "ReportBugProtocolHelper/onDeliveryFailure: Network Failure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.00H r0 = r1.A00
            java.lang.Object r1 = r0.get()
            X.4Po r1 = (X.C85954Po) r1
            java.lang.String r0 = "Network Failure"
            r1.A00(r3, r0)
            java.lang.String r1 = "onDeliveryFailure: Network Failure"
            goto L_0x0052
        L_0x00c2:
            X.C30691eM.A01(r6)
            X.00H r2 = r1.A01
            r30 = r2
            java.lang.String r19 = X.C17890vO.A0T(r30)
            r6 = r35
            if (r35 != 0) goto L_0x02b8
            r18 = 0
        L_0x00d3:
            r6 = r32
            if (r32 == 0) goto L_0x02b4
            int r2 = r6.length()
            if (r2 == 0) goto L_0x02b4
            r17 = 1
            java.lang.String r2 = "title"
            X.1cX r3 = new X.1cX
            r3.<init>((java.lang.String) r2)
            r21 = 1
            r23 = 1000(0x3e8, double:4.94E-321)
            r25 = 0
            r20 = r6
            boolean r2 = X.C29601cY.A04(r20, r21, r23, r25)
            if (r2 == 0) goto L_0x00f7
            r3.A07(r6)
        L_0x00f7:
            X.1ca r5 = r3.A03()
        L_0x00fb:
            r16 = 0
            r3 = r36
            if (r36 == 0) goto L_0x010e
            int r2 = r3.length()
            if (r2 == 0) goto L_0x010e
            int r2 = r3.hashCode()
            switch(r2) {
                case -2113777672: goto L_0x0210;
                case -1440008444: goto L_0x020d;
                case -1146830912: goto L_0x020a;
                case -744327095: goto L_0x0207;
                case -314498168: goto L_0x0204;
                case -123573497: goto L_0x0201;
                case 3600: goto L_0x01fe;
                case 100348368: goto L_0x01fb;
                case 106069776: goto L_0x01f8;
                case 146900954: goto L_0x01f5;
                case 361719548: goto L_0x01f2;
                case 492830541: goto L_0x01ef;
                case 548640964: goto L_0x01ec;
                case 594331785: goto L_0x01e9;
                case 631882908: goto L_0x01e6;
                case 719813996: goto L_0x01e3;
                case 814298977: goto L_0x01e0;
                case 815160638: goto L_0x01dd;
                case 1432626128: goto L_0x01da;
                case 1716507379: goto L_0x01d7;
                case 1777117080: goto L_0x01d4;
                case 2054222044: goto L_0x01d1;
                default: goto L_0x010e;
            }
        L_0x010e:
            boolean r2 = r37.isEmpty()
            if (r2 == 0) goto L_0x0196
            X.0wS r8 = X.C18460wS.A00
        L_0x0116:
            java.lang.String r10 = "id"
            r2 = 3
            r12 = r33
            r11 = r34
            X.C18070vi.A0f(r12, r2, r11)
            java.lang.String r2 = "iq"
            X.1cX r6 = new X.1cX
            r6.<init>((java.lang.String) r2)
            java.lang.String r3 = "xmlns"
            java.lang.String r2 = "fb:thrift_iq"
            X.C29591cX.A01(r6, r3, r2)
            java.lang.String r15 = "smax_id"
            r2 = 105(0x69, double:5.2E-322)
            X.1MD r14 = new X.1MD
            r14.<init>((java.lang.String) r15, (long) r2)
            r6.A04(r14)
            X.8v4 r14 = X.C173438v4.A00
            java.lang.String r3 = "to"
            X.1MD r2 = new X.1MD
            r2.<init>((com.whatsapp.jid.Jid) r14, (java.lang.String) r3)
            r6.A04(r2)
            java.lang.String r3 = "type"
            java.lang.String r2 = "set"
            X.C29591cX.A01(r6, r3, r2)
            r2 = 0
            r27 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r23 = 0
            r24 = r19
            r25 = r2
            r29 = r23
            boolean r14 = X.C29601cY.A04(r24, r25, r27, r29)
            if (r14 == 0) goto L_0x0167
            r14 = r19
            X.C29591cX.A01(r6, r10, r14)
        L_0x0167:
            if (r18 == 0) goto L_0x016c
            r6.A05(r4)
        L_0x016c:
            if (r17 == 0) goto L_0x0171
            r6.A05(r5)
        L_0x0171:
            if (r16 == 0) goto L_0x0176
            r6.A05(r9)
        L_0x0176:
            r4 = 10
            boolean r2 = X.C29601cY.A05(r8, r2, r4)
            if (r2 == 0) goto L_0x02d8
            java.util.Iterator r3 = r8.iterator()
        L_0x0182:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x02d8
            java.lang.Object r2 = r3.next()
            X.A8g r2 = (X.C20121A8g) r2
            X.1ca r2 = r2.BVP()
            r6.A05(r2)
            goto L_0x0182
        L_0x0196:
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r12 = r37.iterator()
        L_0x019e:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x0116
            java.lang.Object r2 = r12.next()
            X.4Ut r2 = (X.C87224Ut) r2
            java.lang.String r11 = r2.A04
            if (r11 == 0) goto L_0x019e
            java.lang.String r10 = r2.A03
            if (r10 == 0) goto L_0x019e
            java.lang.String r6 = r2.A02
            if (r6 == 0) goto L_0x019e
            java.lang.Integer r2 = r2.A01
            r3 = 0
            if (r2 == 0) goto L_0x01c5
            int r2 = r2.intValue()
            if (r2 == 0) goto L_0x01ce
            if (r2 != r7) goto L_0x01c5
            java.lang.String r3 = "video"
        L_0x01c5:
            X.9Ec r2 = new X.9Ec
            r2.<init>(r10, r6, r11, r3)
            r8.add(r2)
            goto L_0x019e
        L_0x01ce:
            java.lang.String r3 = "image"
            goto L_0x01c5
        L_0x01d1:
            java.lang.String r8 = "sharing"
            goto L_0x0212
        L_0x01d4:
            java.lang.String r8 = "whatsapp_ai_agents"
            goto L_0x0212
        L_0x01d7:
            java.lang.String r8 = "platforms_delivery"
            goto L_0x0212
        L_0x01da:
            java.lang.String r8 = "channels"
            goto L_0x0212
        L_0x01dd:
            java.lang.String r8 = "new_devices"
            goto L_0x0212
        L_0x01e0:
            java.lang.String r8 = "rich_messaging"
            goto L_0x0212
        L_0x01e3:
            java.lang.String r8 = "fishfooding"
            goto L_0x0212
        L_0x01e6:
            java.lang.String r8 = "cross_app_integrations"
            goto L_0x0212
        L_0x01e9:
            java.lang.String r8 = "whatsapp_vr"
            goto L_0x0212
        L_0x01ec:
            java.lang.String r8 = "calling"
            goto L_0x0212
        L_0x01ef:
            java.lang.String r8 = "integrity"
            goto L_0x0212
        L_0x01f2:
            java.lang.String r8 = "ui_redesign"
            goto L_0x0212
        L_0x01f5:
            java.lang.String r8 = "support_experience"
            goto L_0x0212
        L_0x01f8:
            java.lang.String r8 = "other"
            goto L_0x0212
        L_0x01fb:
            java.lang.String r8 = "infra"
            goto L_0x0212
        L_0x01fe:
            java.lang.String r8 = "qa"
            goto L_0x0212
        L_0x0201:
            java.lang.String r8 = "business_search"
            goto L_0x0212
        L_0x0204:
            java.lang.String r8 = "privacy"
            goto L_0x0212
        L_0x0207:
            java.lang.String r8 = "growth_broadcast"
            goto L_0x0212
        L_0x020a:
            java.lang.String r8 = "business"
            goto L_0x0212
        L_0x020d:
            java.lang.String r8 = "messaging"
            goto L_0x0212
        L_0x0210:
            java.lang.String r8 = "data_management"
        L_0x0212:
            boolean r2 = r3.equals(r8)
            if (r2 == 0) goto L_0x010e
            r16 = 1
            r2 = 23
            java.lang.String[] r6 = new java.lang.String[r2]
            r3 = 0
            java.lang.String r2 = "business"
            r6[r3] = r2
            java.lang.String r2 = "business_search"
            r6[r7] = r2
            r3 = 2
            java.lang.String r2 = "calling"
            r6[r3] = r2
            r3 = 3
            java.lang.String r2 = "channels"
            r6[r3] = r2
            r3 = 4
            java.lang.String r2 = "cross_app_integrations"
            r6[r3] = r2
            r3 = 5
            java.lang.String r2 = "data_management"
            r6[r3] = r2
            r3 = 6
            java.lang.String r2 = "dogfooder_diagnostics"
            r6[r3] = r2
            r3 = 7
            java.lang.String r2 = "fishfooding"
            r6[r3] = r2
            r3 = 8
            java.lang.String r2 = "growth_broadcast"
            r6[r3] = r2
            r3 = 9
            java.lang.String r2 = "infra"
            r6[r3] = r2
            r3 = 10
            java.lang.String r2 = "integrity"
            r6[r3] = r2
            r3 = 11
            java.lang.String r2 = "messaging"
            r6[r3] = r2
            r3 = 12
            java.lang.String r2 = "new_devices"
            r6[r3] = r2
            r3 = 13
            java.lang.String r2 = "other"
            r6[r3] = r2
            r3 = 14
            java.lang.String r2 = "platforms_delivery"
            r6[r3] = r2
            r3 = 15
            java.lang.String r2 = "privacy"
            r6[r3] = r2
            r3 = 16
            java.lang.String r2 = "qa"
            r6[r3] = r2
            r3 = 17
            java.lang.String r2 = "rich_messaging"
            r6[r3] = r2
            r3 = 18
            java.lang.String r2 = "sharing"
            r6[r3] = r2
            r3 = 19
            java.lang.String r2 = "support_experience"
            r6[r3] = r2
            r3 = 20
            java.lang.String r2 = "ui_redesign"
            r6[r3] = r2
            r3 = 21
            java.lang.String r2 = "whatsapp_ai_agents"
            r6[r3] = r2
            r3 = 22
            java.lang.String r2 = "whatsapp_vr"
            java.util.List r6 = X.C18070vi.A0O(r2, r6, r3)
            java.lang.String r3 = "category"
            X.1cX r2 = new X.1cX
            r2.<init>((java.lang.String) r3)
            X.C29591cX.A02(r8, r6)
            r2.A07(r8)
            X.1ca r9 = r2.A03()
            goto L_0x010e
        L_0x02b4:
            r17 = 0
            goto L_0x00fb
        L_0x02b8:
            java.lang.String r2 = "device_log_handle"
            X.1cX r3 = new X.1cX
            r3.<init>((java.lang.String) r2)
            r21 = 1
            r23 = 500(0x1f4, double:2.47E-321)
            r25 = 0
            r20 = r6
            boolean r2 = X.C29601cY.A04(r20, r21, r23, r25)
            if (r2 == 0) goto L_0x02d0
            r3.A07(r6)
        L_0x02d0:
            X.1ca r4 = r3.A03()
            r18 = 1
            goto L_0x00d3
        L_0x02d8:
            java.lang.String r2 = "description"
            X.1cX r3 = new X.1cX
            r3.<init>((java.lang.String) r2)
            r25 = 1
            r27 = 10000(0x2710, double:4.9407E-320)
            r24 = r12
            boolean r2 = X.C29601cY.A04(r24, r25, r27, r29)
            if (r2 == 0) goto L_0x02ee
            r3.A07(r12)
        L_0x02ee:
            X.1ca r2 = r3.A03()
            r6.A05(r2)
            java.lang.String r2 = "debug_information_json"
            X.1cX r3 = new X.1cX
            r3.<init>((java.lang.String) r2)
            r24 = r11
            boolean r2 = X.C29601cY.A04(r24, r25, r27, r29)
            if (r2 == 0) goto L_0x0307
            r3.A07(r11)
        L_0x0307:
            X.1ca r17 = X.C29591cX.A00(r3, r6)
            java.lang.Object r2 = X.C18070vi.A0E(r30)
            X.1OZ r2 = (X.AnonymousClass1OZ) r2
            r0.L$0 = r1
            r0.label = r7
            r20 = 350(0x15e, float:4.9E-43)
            r21 = 32000(0x7d00, double:1.581E-319)
            r18 = r19
            r19 = r0
            r16 = r2
            java.lang.Object r6 = r16.A0A(r17, r18, r19, r20, r21, r23)
            if (r6 != r13) goto L_0x002b
            return r13
        L_0x0326:
            X.4uT r0 = new X.4uT
            r0.<init>(r1, r7)
            goto L_0x0019
        L_0x032d:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0332:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.1dr):java.lang.Object");
    }
}
