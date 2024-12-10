package com.whatsapp.flows.webview.bridge.factory.impl.cart;

import X.A8S;
import X.AnonymousClass9XU;
import X.C136716uH;
import X.C18070vi;
import X.C18600wl;
import com.whatsapp.jid.UserJid;

public final class FlowsGetCart extends C136716uH {
    public final A8S A00;
    public final AnonymousClass9XU A01;
    public final UserJid A02;
    public final C18600wl A03;

    public FlowsGetCart(A8S a8s, AnonymousClass9XU r3, UserJid userJid, C18600wl r5) {
        C18070vi.A0f(a8s, 2, r5);
        this.A02 = userJid;
        this.A00 = a8s;
        this.A01 = r3;
        this.A03 = r5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A04(X.C30391dr r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C21647Anc
            if (r0 == 0) goto L_0x004d
            r5 = r7
            X.Anc r5 = (X.C21647Anc) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004d
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 != r3) goto L_0x0053
            java.lang.Object r1 = r5.L$0
            X.6uH r1 = (X.C136716uH) r1
            X.C30691eM.A01(r2)
        L_0x0024:
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            X.Az5 r0 = new X.Az5
            r0.<init>(r2)
            X.84U r0 = X.AnonymousClass84U.A00(r0)
            r1.A03(r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0035:
            X.C30691eM.A01(r2)
            X.0wl r2 = r6.A03
            r1 = 0
            com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsGetCart$execute$cartJson$1 r0 = new com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsGetCart$execute$cartJson$1
            r0.<init>(r6, r1)
            r5.L$0 = r6
            r5.label = r3
            java.lang.Object r2 = X.C30451dy.A00(r5, r2, r0)
            if (r2 != r4) goto L_0x004b
            return r4
        L_0x004b:
            r1 = r6
            goto L_0x0024
        L_0x004d:
            X.Anc r5 = new X.Anc
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x0053:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsGetCart.A04(X.1dr):java.lang.Object");
    }
}
