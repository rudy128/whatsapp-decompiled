package com.whatsapp.flows.webview.bridge.factory.impl;

import X.A5U;
import X.AnonymousClass122;
import X.AnonymousClass206;
import X.C136716uH;
import X.C18030ve;
import X.C18070vi;
import X.C195719tn;
import X.C196109uT;
import X.C22821Di;
import X.C33251iW;
import X.C822444b;

public final class FlowsComplete extends C136716uH {
    public final C33251iW A00;
    public final C196109uT A01;
    public final C822444b A02;
    public final AnonymousClass122 A03;
    public final C18030ve A04;
    public final C195719tn A05;
    public final AnonymousClass206 A06;
    public final A5U A07;
    public final C22821Di A08;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A04(X.C30391dr r16) {
        /*
            r15 = this;
            r4 = r16
            boolean r0 = r4 instanceof X.C21645Ana
            if (r0 == 0) goto L_0x0101
            r3 = r4
            X.Ana r3 = (X.C21645Ana) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0101
            int r2 = r2 - r1
            r3.label = r2
        L_0x0014:
            java.lang.Object r4 = r3.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r3.label
            r0 = 1
            if (r1 == 0) goto L_0x00d8
            if (r1 != r0) goto L_0x0108
            java.lang.Object r3 = r3.L$0
            com.whatsapp.flows.webview.bridge.factory.impl.FlowsComplete r3 = (com.whatsapp.flows.webview.bridge.factory.impl.FlowsComplete) r3
            X.C30691eM.A01(r4)
        L_0x0026:
            X.1D6 r4 = (X.AnonymousClass1D6) r4
            java.lang.Object r1 = r4.first
            boolean r1 = X.AnonymousClass000.A1Y(r1)
            X.1Di r2 = r3.A08
            if (r1 == 0) goto L_0x00d0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r2.invoke(r1)
            X.9tn r5 = r3.A05
            long r13 = r5.A01
            java.lang.String r12 = r5.A05
            org.json.JSONObject r2 = r3.A00
            java.lang.String r1 = "data"
            org.json.JSONObject r2 = r2.optJSONObject(r1)
            java.lang.String r1 = "extension_message_response"
            org.json.JSONObject r2 = r2.optJSONObject(r1)
            r4 = 0
            if (r2 == 0) goto L_0x00cd
            java.lang.String r1 = "body"
            java.lang.String r9 = r2.optString(r1)
            java.lang.String r1 = "params"
            org.json.JSONObject r4 = r2.optJSONObject(r1)
            if (r4 == 0) goto L_0x00ce
            java.lang.String r6 = "response_message"
            boolean r1 = r4.has(r6)
            if (r1 == 0) goto L_0x00ce
            X.0ve r7 = r3.A04
            r2 = 9157(0x23c5, float:1.2832E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r7, r2)
            if (r1 == 0) goto L_0x00ce
            X.B0n r1 = new X.B0n
            r1.<init>(r3, r4)
            X.84U r2 = X.AnonymousClass84U.A00(r1)
            java.lang.String r1 = "wa_flow_response_params"
            r4.put(r1, r2)
            r4.remove(r6)
            r1 = 3
        L_0x0084:
            com.whatsapp.jid.UserJid r7 = r5.A02
            X.1iW r6 = r3.A00
            if (r9 != 0) goto L_0x008c
            java.lang.String r9 = ""
        L_0x008c:
            java.lang.String r11 = java.lang.String.valueOf(r4)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            java.lang.String r10 = "galaxy_message"
            r6.A0U(r7, r8, r9, r10, r11, r12, r13)
            X.206 r2 = r3.A06
            X.122 r1 = r3.A03
            X.C181329Qb.A00(r1, r2)
            X.44b r4 = r3.A02
            java.lang.Object r3 = r4.A04(r7)
            X.4FP r3 = (X.AnonymousClass4FP) r3
            if (r2 != 0) goto L_0x00c8
            if (r3 == 0) goto L_0x00cb
            java.lang.String r2 = r3.A08
        L_0x00ae:
            java.lang.String r1 = r5.A04
            boolean r1 = X.C18070vi.A18(r2, r1)
            if (r1 == 0) goto L_0x00c8
            com.whatsapp.jid.UserJid r1 = r3.A01
            java.lang.Object r1 = r4.A04(r1)
            X.4FP r1 = (X.AnonymousClass4FP) r1
            if (r1 == 0) goto L_0x00c8
            r1.A0C = r0
            r4.A08(r1)
            X.C822444b.A00(r4)
        L_0x00c8:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00cb:
            r2 = 0
            goto L_0x00ae
        L_0x00cd:
            r9 = r4
        L_0x00ce:
            r1 = 2
            goto L_0x0084
        L_0x00d0:
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            r2.invoke(r0)
            goto L_0x00c8
        L_0x00d8:
            X.C30691eM.A01(r4)
            X.A5U r4 = r15.A07
            X.9tn r1 = r15.A05
            java.lang.String r6 = r1.A04
            com.whatsapp.jid.UserJid r5 = r1.A02
            java.lang.String r7 = r1.A07
            java.lang.String r8 = r1.A08
            r3.L$0 = r15
            r3.label = r0
            X.3Dp r1 = X.C108975cc.A0k(r3)
            X.B3W r9 = new X.B3W
            r9.<init>(r1)
            r4.A06(r5, r6, r7, r8, r9)
            java.lang.Object r4 = r1.A00()
            if (r4 != r2) goto L_0x00fe
            return r2
        L_0x00fe:
            r3 = r15
            goto L_0x0026
        L_0x0101:
            X.Ana r3 = new X.Ana
            r3.<init>(r15, r4)
            goto L_0x0014
        L_0x0108:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.webview.bridge.factory.impl.FlowsComplete.A04(X.1dr):java.lang.Object");
    }

    public FlowsComplete(C33251iW r2, C196109uT r3, C822444b r4, AnonymousClass122 r5, C18030ve r6, A5U a5u, C195719tn r8, AnonymousClass206 r9, C22821Di r10) {
        C18070vi.A0q(a5u, r4, r3);
        C18070vi.A0d(r10, 9);
        this.A05 = r8;
        this.A04 = r6;
        this.A00 = r2;
        this.A06 = r9;
        this.A03 = r5;
        this.A07 = a5u;
        this.A02 = r4;
        this.A01 = r3;
        this.A08 = r10;
    }
}
