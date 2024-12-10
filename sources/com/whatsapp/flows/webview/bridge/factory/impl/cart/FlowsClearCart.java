package com.whatsapp.flows.webview.bridge.factory.impl.cart;

import X.A8S;
import X.C136716uH;
import X.C18070vi;
import X.C18600wl;
import com.whatsapp.jid.UserJid;

public final class FlowsClearCart extends C136716uH {
    public final A8S A00;
    public final UserJid A01;
    public final C18600wl A02;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A04(X.C30391dr r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C21646Anb
            if (r0 == 0) goto L_0x0044
            r5 = r7
            X.Anb r5 = (X.C21646Anb) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0044
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r3) goto L_0x004a
            java.lang.Object r0 = r5.L$0
            X.6uH r0 = (X.C136716uH) r0
            X.C30691eM.A01(r1)
        L_0x0024:
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            r0.A03(r1)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002c:
            X.C30691eM.A01(r1)
            X.0wl r2 = r6.A02
            r1 = 0
            com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsClearCart$execute$response$1 r0 = new com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsClearCart$execute$response$1
            r0.<init>(r6, r1)
            r5.L$0 = r6
            r5.label = r3
            java.lang.Object r1 = X.C30451dy.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x0042
            return r4
        L_0x0042:
            r0 = r6
            goto L_0x0024
        L_0x0044:
            X.Anb r5 = new X.Anb
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x004a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsClearCart.A04(X.1dr):java.lang.Object");
    }

    public FlowsClearCart(A8S a8s, UserJid userJid, C18600wl r3) {
        C18070vi.A0k(r3, a8s);
        this.A01 = userJid;
        this.A02 = r3;
        this.A00 = a8s;
    }
}
