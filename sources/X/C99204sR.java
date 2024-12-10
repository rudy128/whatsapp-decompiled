package X;

/* renamed from: X.4sR  reason: invalid class name and case insensitive filesystem */
public class C99204sR implements C18080vj, C22821Di {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010e, code lost:
        if (r11.A01 != false) goto L_0x0110;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            r11 = r15
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0196;
                case 1: goto L_0x0113;
                case 2: goto L_0x00dc;
                case 3: goto L_0x00fc;
                case 4: goto L_0x008b;
                case 5: goto L_0x005d;
                case 6: goto L_0x002a;
                case 7: goto L_0x01bb;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r3 = r14.A01
            com.whatsapp.wds.components.search.WDSSearchView r3 = (com.whatsapp.wds.components.search.WDSSearchView) r3
            java.lang.Object r2 = r14.A02
            X.5ab r2 = (X.C107795ab) r2
            if (r15 == 0) goto L_0x0016
            java.lang.String r1 = r15.toString()
            if (r1 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r1 = ""
        L_0x0018:
            java.lang.String r0 = r3.A04
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 != 0) goto L_0x0027
            r3.A04 = r1
            if (r2 == 0) goto L_0x0027
            r2.C2O(r1)
        L_0x0027:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002a:
            java.lang.Object r7 = r14.A01
            X.01n r7 = (X.C003401n) r7
            java.lang.Object r1 = r14.A02
            X.1FP r1 = (X.AnonymousClass1FP) r1
            java.lang.Number r11 = (java.lang.Number) r11
            r6 = 0
            r5 = 1
            if (r11 == 0) goto L_0x0049
            int r0 = r11.intValue()
            if (r0 != 0) goto L_0x0049
            r0 = 2131896648(0x7f122948, float:1.9428163E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0045:
            r7.A0R(r0)
            goto L_0x0027
        L_0x0049:
            X.0vb r4 = r1.A00
            r3 = 2131755420(0x7f10019c, float:1.9141719E38)
            int r0 = r11.intValue()
            long r1 = (long) r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.AnonymousClass3MX.A1S(r0, r6, r1)
            java.lang.String r0 = r4.A0K(r0, r3, r1)
            goto L_0x0045
        L_0x005d:
            java.lang.Object r3 = r14.A01
            X.3WQ r3 = (X.AnonymousClass3WQ) r3
            java.lang.Object r2 = r14.A02
            X.01E r2 = (X.AnonymousClass01E) r2
            java.util.List r11 = (java.util.List) r11
            r1 = 0
            X.C18070vi.A0d(r3, r1)
            X.C18070vi.A0d(r11, r1)
            r3.A00 = r11
            r3.notifyDataSetChanged()
            java.util.List r0 = r3.A00
            r0.size()
            java.util.List r0 = r3.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0027
            r0 = 2131428594(0x7f0b04f2, float:1.8478837E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r2, r0)
            r0.setEnabled(r1)
            goto L_0x0027
        L_0x008b:
            java.lang.Object r5 = r14.A01
            X.4Yk r5 = (X.C88124Yk) r5
            java.lang.Object r4 = r14.A02
            X.1Di r4 = (X.C22821Di) r4
            X.23z r11 = (X.C445823z) r11
            r1 = 0
            r0 = 2
            X.C18070vi.A0d(r11, r0)
            X.25F r0 = r11.A0A
            X.C18070vi.A0d(r0, r1)
            X.229 r0 = r0.A02
            X.36q r0 = (X.C692936q) r0
            if (r0 == 0) goto L_0x00d7
            java.util.Map r0 = r0.A00
            X.10w r3 = X.C201110w.copyOf((java.util.Map) r0)
            r2 = 0
            if (r3 == 0) goto L_0x00d7
            X.11S r0 = r5.A00
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass11S.A00(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r1, r0)
            java.lang.Object r0 = r3.get(r1)
            X.24H r0 = (X.AnonymousClass24H) r0
            if (r0 == 0) goto L_0x00d5
            X.2Qx r1 = r0.A02
        L_0x00c3:
            X.2Qx r0 = X.C49552Qx.GOING
            if (r1 == r0) goto L_0x00cb
            X.2Qx r0 = X.C49552Qx.MAYBE
            if (r1 != r0) goto L_0x00cc
        L_0x00cb:
            r2 = 1
        L_0x00cc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L_0x00d0:
            r4.invoke(r0)
            goto L_0x0027
        L_0x00d5:
            r1 = 0
            goto L_0x00c3
        L_0x00d7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x00d0
        L_0x00dc:
            java.lang.Object r3 = r14.A01
            X.1KB r3 = (X.AnonymousClass1KB) r3
            java.lang.Object r2 = r14.A02
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            X.4V2 r11 = (X.AnonymousClass4V2) r11
            r1 = 1
            X.C18070vi.A0e(r2, r1, r11)
            r3.A0I(r2)
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x0027
            int r0 = r11.A01
            if (r0 != r1) goto L_0x0110
            r0 = 7000(0x1b58, double:3.4585E-320)
        L_0x00f7:
            r3.A0K(r2, r0)
            goto L_0x0027
        L_0x00fc:
            java.lang.Object r3 = r14.A01
            X.1KB r3 = (X.AnonymousClass1KB) r3
            java.lang.Object r2 = r14.A02
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            X.4TW r11 = (X.AnonymousClass4TW) r11
            X.C18070vi.A0j(r2, r11)
            r3.A0I(r2)
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x0027
        L_0x0110:
            r0 = 3500(0xdac, double:1.729E-320)
            goto L_0x00f7
        L_0x0113:
            java.lang.Object r2 = r14.A01
            com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment r2 = (com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment) r2
            java.lang.Object r3 = r14.A02
            android.os.BaseBundle r3 = (android.os.BaseBundle) r3
            java.util.List r11 = (java.util.List) r11
            r0 = 2
            X.C18070vi.A0d(r11, r0)
            X.0ve r9 = r2.A02
            X.C18070vi.A0W(r9)
            X.1KW r8 = r2.A08
            if (r8 == 0) goto L_0x0193
            X.11C r5 = r2.A06
            if (r5 == 0) goto L_0x0190
            X.0vb r6 = r2.A01
            X.C18070vi.A0W(r6)
            X.0vc r10 = r2.A0B
            if (r10 == 0) goto L_0x018d
            X.1L2 r7 = r2.A07
            if (r7 == 0) goto L_0x018a
            boolean r13 = r2.A0H
            X.4sV r12 = X.C99244sV.A00(r2, r0)
            X.3XH r4 = new X.3XH
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2.A03 = r4
            if (r3 == 0) goto L_0x0173
            java.lang.String r0 = "selectedItem"
            int r4 = r3.getInt(r0)
            java.lang.String r1 = "text"
            java.lang.String r0 = ""
            java.lang.String r0 = r3.getString(r1, r0)
            X.C18070vi.A0X(r0)
            X.3XH r3 = r2.A03
            if (r3 == 0) goto L_0x0187
            r3.A00 = r4
            r3.A01 = r0
            java.util.List r0 = r3.A02
            java.lang.Object r1 = X.C29431cG.A0f(r0, r4)
            if (r1 == 0) goto L_0x0170
            X.1Di r0 = r3.A03
            r0.invoke(r1)
        L_0x0170:
            r3.notifyDataSetChanged()
        L_0x0173:
            androidx.recyclerview.widget.RecyclerView r1 = r2.A01
            if (r1 != 0) goto L_0x017e
            java.lang.String r0 = "recyclerView"
        L_0x0179:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x017e:
            X.3XH r0 = r2.A03
            if (r0 == 0) goto L_0x0187
            r1.setAdapter(r0)
            goto L_0x0027
        L_0x0187:
            java.lang.String r0 = "adapter"
            goto L_0x0179
        L_0x018a:
            java.lang.String r0 = "emojiRichFormatterStaticCaller"
            goto L_0x0179
        L_0x018d:
            java.lang.String r0 = "sharedPreferencesFactory"
            goto L_0x0179
        L_0x0190:
            java.lang.String r0 = "systemServices"
            goto L_0x0179
        L_0x0193:
            java.lang.String r0 = "emojiLoader"
            goto L_0x0179
        L_0x0196:
            java.lang.Object r3 = r14.A01
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r2 = r14.A02
            com.whatsapp.account.remove.RemoveAccountActivity r2 = (com.whatsapp.account.remove.RemoveAccountActivity) r2
            java.util.List r11 = (java.util.List) r11
            r1 = 0
            X.C18070vi.A0d(r3, r1)
            if (r11 == 0) goto L_0x0027
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0027
            r3.setVisibility(r1)
            r0 = 2131895105(0x7f122341, float:1.9425034E38)
            java.lang.String r0 = X.C18070vi.A0F(r2, r0)
            X.C72483Me.A0d(r2, r3, r0)
            goto L_0x0027
        L_0x01bb:
            java.lang.Object r1 = r14.A01
            X.5jJ r1 = (X.C111255jJ) r1
            java.lang.Object r0 = r14.A02
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            X.6yE r0 = r1.A0T(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99204sR.invoke(java.lang.Object):java.lang.Object");
    }

    public C99204sR(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }
}
