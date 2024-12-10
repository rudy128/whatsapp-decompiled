package X;

import com.whatsapp.biz.cart.view.fragment.CartFragment;

/* renamed from: X.Axa  reason: case insensitive filesystem */
public final class C22096Axa extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CartFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22096Axa(CartFragment cartFragment) {
        super(1);
        this.this$0 = cartFragment;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.9Wb, java.lang.Object, X.8i7] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (r9.booleanValue() == false) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            java.util.List r11 = (java.util.List) r11
            r2 = 0
            X.C18070vi.A0d(r11, r2)
            com.whatsapp.biz.cart.view.fragment.CartFragment r4 = r10.this$0
            boolean r0 = com.whatsapp.biz.cart.view.fragment.CartFragment.A1B
            if (r0 == 0) goto L_0x003d
            com.whatsapp.biz.cart.view.fragment.CartFragment.A1B = r2
            X.A8Q r3 = r4.A0N
            if (r3 == 0) goto L_0x0048
            X.A7D r1 = X.A8Q.A00(r3)
            X.A8Q.A04(r1, r3)
            X.A8Q r0 = r4.A0N
            if (r0 == 0) goto L_0x0048
            X.A8Q.A02(r1, r0)
            X.A8Q.A03(r1, r0)
            r0 = 37
            X.A7D.A01(r1, r0)
            r0 = 52
            X.A7D.A02(r1, r0)
            com.whatsapp.jid.UserJid r0 = r4.A0b
            r1.A00 = r0
            X.8G8 r0 = r4.A2K()
            X.1DT r0 = r0.A03
            X.A7D.A00(r0, r1)
            r3.A09(r1)
        L_0x003d:
            X.8Hz r7 = r4.A0J
            if (r7 != 0) goto L_0x004b
            java.lang.String r0 = "cartItemsAdapter"
        L_0x0043:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0048:
            java.lang.String r0 = "catalogAnalyticManager"
            goto L_0x0043
        L_0x004b:
            X.8G8 r0 = r4.A2K()
            X.1DT r0 = r0.A07
            java.lang.Object r9 = r0.A06()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r7.A01 = r0
            java.util.List r6 = r7.A0C
            int r5 = X.AnonymousClass3MX.A01(r6)
            if (r5 < 0) goto L_0x00c5
        L_0x0066:
            int r3 = r5 + -1
            java.lang.Object r1 = r6.get(r5)
            boolean r0 = r1 instanceof X.C168038iB
            if (r0 != 0) goto L_0x0076
            boolean r0 = r1 instanceof X.C168018i9
            if (r0 == 0) goto L_0x00c2
            int r5 = r5 + 1
        L_0x0076:
            java.lang.Object r8 = X.C29431cG.A0f(r6, r5)
            boolean r0 = r8 instanceof X.C168038iB
            if (r0 != 0) goto L_0x007f
            r8 = 0
        L_0x007f:
            int r0 = X.C161848Hz.A00(r7)
            java.lang.Object r5 = X.C29431cG.A0f(r6, r0)
            boolean r0 = r5 instanceof X.C168048iC
            if (r0 != 0) goto L_0x008c
            r5 = 0
        L_0x008c:
            r6.clear()
            if (r9 == 0) goto L_0x0098
            boolean r0 = r9.booleanValue()
            r1 = 1
            if (r0 != 0) goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            X.8i7 r0 = new X.8i7
            r0.<init>(r2)
            r0.A01 = r1
            r6.add(r0)
            java.util.Iterator r3 = r11.iterator()
        L_0x00a7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c7
            X.9rM r2 = X.AnonymousClass8BR.A0J(r3)
            X.AEv r0 = r2.A01
            int r0 = r0.A00
            if (r0 != 0) goto L_0x00a7
            java.util.Date r1 = r7.A01
            X.8i9 r0 = new X.8i9
            r0.<init>(r2, r1)
            r6.add(r0)
            goto L_0x00a7
        L_0x00c2:
            r5 = r3
            if (r3 >= 0) goto L_0x0066
        L_0x00c5:
            r5 = -1
            goto L_0x0076
        L_0x00c7:
            if (r8 == 0) goto L_0x00cc
            r6.add(r8)
        L_0x00cc:
            if (r5 == 0) goto L_0x00d1
            r6.add(r5)
        L_0x00d1:
            r7.notifyDataSetChanged()
            X.8G8 r0 = r4.A2K()
            X.9yv r3 = r0.A0I
            X.1DT r0 = r3.A00
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r0 = r0.A06()
            if (r0 == 0) goto L_0x00f5
            X.1DT r1 = r3.A00
            if (r1 == 0) goto L_0x00ef
            java.lang.Object r0 = r1.A06()
            r1.A0E(r0)
        L_0x00ef:
            com.whatsapp.biz.cart.view.fragment.CartFragment.A02(r4)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00f5:
            X.1Ty r2 = r3.A0C
            com.whatsapp.jid.UserJid r1 = r3.A0K
            r0 = 2
            X.C20478AMp.A00(r2, r1, r3, r0)
            goto L_0x00ef
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22096Axa.invoke(java.lang.Object):java.lang.Object");
    }
}
