package com.whatsapp.flows.webview.bridge.factory.impl;

import X.C136716uH;
import X.C18070vi;
import com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository;

public final class FlowsGetPublicKey extends C136716uH {
    public final FlowsWebViewDataRepository A00;
    public final boolean A01;

    public FlowsGetPublicKey(FlowsWebViewDataRepository flowsWebViewDataRepository, boolean z) {
        C18070vi.A0d(flowsWebViewDataRepository, 1);
        this.A00 = flowsWebViewDataRepository;
        this.A01 = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A04(X.C30391dr r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C21696AoP
            if (r0 == 0) goto L_0x0080
            r8 = r10
            X.AoP r8 = (X.C21696AoP) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0080
            int r2 = r2 - r1
            r8.label = r2
        L_0x0012:
            java.lang.Object r4 = r8.result
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r1 = 1
            if (r0 == 0) goto L_0x0056
            if (r0 != r1) goto L_0x0086
            java.lang.Object r6 = r8.L$2
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            java.lang.Object r3 = r8.L$0
            X.6uH r3 = (X.C136716uH) r3
            X.C30691eM.A01(r4)
        L_0x0028:
            X.9MM r4 = (X.AnonymousClass9MM) r4
            boolean r0 = r4 instanceof X.C172078sk
            java.lang.String r2 = "responseData"
            if (r0 == 0) goto L_0x0047
            X.8sk r4 = (X.C172078sk) r4
            java.lang.Object r1 = r4.A00
            java.lang.String r0 = "public_key"
        L_0x0036:
            org.json.JSONObject r0 = X.C108965cb.A0x(r1, r0, r6)
            org.json.JSONObject r0 = r0.put(r2, r6)
            X.C18070vi.A0b(r0)
            r3.A03(r0)
        L_0x0044:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0047:
            boolean r0 = r4 instanceof X.C172068sj
            if (r0 == 0) goto L_0x0044
            X.8sj r4 = (X.C172068sj) r4
            java.lang.String r1 = r4.A00
            if (r1 != 0) goto L_0x0053
            java.lang.String r1 = "UNKNOWN"
        L_0x0053:
            java.lang.String r0 = "error_key"
            goto L_0x0036
        L_0x0056:
            X.C30691eM.A01(r4)
            com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository r5 = r9.A00
            X.9tn r0 = r5.A00
            if (r0 == 0) goto L_0x0044
            org.json.JSONObject r6 = X.C17880vN.A15()
            com.whatsapp.jid.UserJid r4 = r0.A02
            boolean r3 = r9.A01
            r8.L$0 = r9
            r8.L$1 = r0
            r8.L$2 = r6
            r8.label = r1
            X.0wl r2 = r5.A0D
            r1 = 0
            com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository$getPublicKey$2 r0 = new com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository$getPublicKey$2
            r0.<init>(r5, r4, r1, r3)
            java.lang.Object r4 = X.C30451dy.A00(r8, r2, r0)
            if (r4 != r7) goto L_0x007e
            return r7
        L_0x007e:
            r3 = r9
            goto L_0x0028
        L_0x0080:
            X.AoP r8 = new X.AoP
            r8.<init>(r9, r10)
            goto L_0x0012
        L_0x0086:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.webview.bridge.factory.impl.FlowsGetPublicKey.A04(X.1dr):java.lang.Object");
    }
}
