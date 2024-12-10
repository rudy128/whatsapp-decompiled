package X;

/* renamed from: X.1bH  reason: invalid class name and case insensitive filesystem */
public final class C28921bH implements C28911bG {
    public final /* synthetic */ C23281Fk A00;
    public final /* synthetic */ Integer A01;

    public C28921bH(C23281Fk r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0105, code lost:
        if (r1 != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0149, code lost:
        if (r1 != false) goto L_0x014b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bvv(android.view.View r17, android.view.ViewGroup r18, java.lang.String r19, int r20) {
        /*
            r16 = this;
            r1 = r16
            X.1Fk r0 = r1.A00
            java.lang.Integer r2 = r1.A01
            X.1bm r4 = r0.A4g()
            if (r4 == 0) goto L_0x0016
            X.1Zk r3 = r0.A03
            if (r3 == 0) goto L_0x01c3
            r1 = 1
            r3.A05 = r1
            X.C28221Zk.A03(r4, r3)
        L_0x0016:
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            if (r2 != r1) goto L_0x014f
            X.1LF r1 = r0.A06
            if (r1 == 0) goto L_0x01bd
            X.1bJ r3 = r1.A01
            java.lang.String r1 = "null cannot be cast to non-null type com.google.android.material.navigationrail.NavigationRailView"
            X.C18070vi.A0z(r3, r1)
            com.google.android.material.navigationrail.NavigationRailView r3 = (com.google.android.material.navigationrail.NavigationRailView) r3
            android.view.View r1 = r3.A00
            if (r1 == 0) goto L_0x0064
            X.11P r9 = r0.A05
            X.0ve r12 = r0.A0E
            X.0vb r11 = r0.A00
            X.1LE r13 = r0.A05
            if (r13 == 0) goto L_0x01c0
            X.00H r1 = r0.A0B
            if (r1 == 0) goto L_0x01c6
            java.lang.Object r14 = r1.get()
            X.11A r14 = (X.AnonymousClass11A) r14
            X.10I r15 = r0.A05
            X.0z4 r10 = r0.A0A
            r1 = 2131431371(0x7f0b0fcb, float:1.848447E38)
            android.view.View r7 = r0.findViewById(r1)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r1 = 2131431372(0x7f0b0fcc, float:1.8484471E38)
            android.view.View r8 = r0.findViewById(r1)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r4 = 0
            r6 = r4
            X.1Zk r3 = new X.1Zk
            r5 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = -1
            r3.A00 = r1
            r3.A04 = r2
            r0.A03 = r3
        L_0x0064:
            X.1bm r3 = r0.A4g()
            if (r3 == 0) goto L_0x0074
            X.1Zk r2 = r0.A03
            if (r2 == 0) goto L_0x01c3
            r1 = 0
            r2.A05 = r1
            X.C28221Zk.A03(r3, r2)
        L_0x0074:
            r3 = r0
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            X.1LF r1 = r3.A06
            X.1bJ r4 = r1.A01
            android.view.View r1 = r3.A00
            if (r4 == 0) goto L_0x01b9
            if (r1 == 0) goto L_0x01b9
            X.1bM r6 = r4.A03
            boolean r1 = r6.hasVisibleItems()
            if (r1 != 0) goto L_0x019d
            java.util.List r1 = com.whatsapp.HomeActivity.A2Y
            java.util.Iterator r10 = r1.iterator()
        L_0x008f:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x019d
            java.lang.Object r2 = r10.next()
            java.lang.Number r2 = (java.lang.Number) r2
            X.1bB r1 = r3.A0b
            int r8 = r2.intValue()
            java.lang.String r2 = r1.A0K(r8)
            r1 = 0
            android.view.MenuItem r5 = r6.add(r1, r8, r1, r2)
            X.0ve r2 = r3.A0E
            r1 = 11822(0x2e2e, float:1.6566E-41)
            X.0vf r7 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r7, r2, r1)
            X.1LF r9 = r3.A06
            r1 = 200(0xc8, float:2.8E-43)
            if (r2 == 0) goto L_0x010b
            r2 = 2131231599(0x7f08036f, float:1.8079284E38)
            if (r8 == r1) goto L_0x00d8
            r1 = 300(0x12c, float:4.2E-43)
            if (r8 == r1) goto L_0x00e6
            r1 = 400(0x190, float:5.6E-43)
            r2 = 2131231597(0x7f08036d, float:1.807928E38)
            if (r8 == r1) goto L_0x00d8
            r1 = 600(0x258, float:8.41E-43)
            r2 = 2131231601(0x7f080371, float:1.8079288E38)
            if (r8 == r1) goto L_0x00d8
            r1 = 700(0x2bc, float:9.81E-43)
            if (r8 != r1) goto L_0x008f
            r2 = 2131231595(0x7f08036b, float:1.8079275E38)
        L_0x00d8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            if (r1 == 0) goto L_0x008f
            int r1 = r1.intValue()
            r5.setIcon(r1)
            goto L_0x008f
        L_0x00e6:
            X.00H r2 = r9.A07
            java.lang.Object r1 = r2.get()
            X.1c4 r1 = (X.AnonymousClass1c4) r1
            boolean r1 = r1.A08()
            if (r1 == 0) goto L_0x0107
            java.lang.Object r1 = r2.get()
            X.1c4 r1 = (X.AnonymousClass1c4) r1
            X.0ve r2 = r1.A02
            r1 = 10996(0x2af4, float:1.5409E-41)
            boolean r1 = X.C18020vd.A05(r7, r2, r1)
            r2 = 2131231605(0x7f080375, float:1.8079296E38)
            if (r1 == 0) goto L_0x00d8
        L_0x0107:
            r2 = 2131231603(0x7f080373, float:1.8079292E38)
            goto L_0x00d8
        L_0x010b:
            r2 = 2131231598(0x7f08036e, float:1.8079282E38)
            if (r8 == r1) goto L_0x00d8
            r1 = 300(0x12c, float:4.2E-43)
            if (r8 == r1) goto L_0x012a
            r1 = 400(0x190, float:5.6E-43)
            r2 = 2131231596(0x7f08036c, float:1.8079277E38)
            if (r8 == r1) goto L_0x00d8
            r1 = 600(0x258, float:8.41E-43)
            r2 = 2131231600(0x7f080370, float:1.8079286E38)
            if (r8 == r1) goto L_0x00d8
            r1 = 700(0x2bc, float:9.81E-43)
            if (r8 != r1) goto L_0x008f
            r2 = 2131231594(0x7f08036a, float:1.8079273E38)
            goto L_0x00d8
        L_0x012a:
            X.00H r2 = r9.A07
            java.lang.Object r1 = r2.get()
            X.1c4 r1 = (X.AnonymousClass1c4) r1
            boolean r1 = r1.A08()
            if (r1 == 0) goto L_0x014b
            java.lang.Object r1 = r2.get()
            X.1c4 r1 = (X.AnonymousClass1c4) r1
            X.0ve r2 = r1.A02
            r1 = 10996(0x2af4, float:1.5409E-41)
            boolean r1 = X.C18020vd.A05(r7, r2, r1)
            r2 = 2131231604(0x7f080374, float:1.8079294E38)
            if (r1 == 0) goto L_0x00d8
        L_0x014b:
            r2 = 2131231602(0x7f080372, float:1.807929E38)
            goto L_0x00d8
        L_0x014f:
            X.11P r7 = r0.A05
            X.0ve r10 = r0.A0E
            X.0vb r9 = r0.A00
            X.1LE r11 = r0.A05
            if (r11 == 0) goto L_0x01c0
            X.00H r1 = r0.A0B
            if (r1 == 0) goto L_0x01c6
            java.lang.Object r12 = r1.get()
            X.11A r12 = (X.AnonymousClass11A) r12
            X.10I r13 = r0.A05
            X.0z4 r8 = r0.A0A
            r1 = 2131430767(0x7f0b0d6f, float:1.8483244E38)
            android.view.View r5 = r0.findViewById(r1)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1 = 2131430769(0x7f0b0d71, float:1.8483248E38)
            android.view.View r6 = r0.findViewById(r1)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1 = 2131430755(0x7f0b0d63, float:1.848322E38)
            android.view.View r2 = r0.findViewById(r1)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r1 = 2131430771(0x7f0b0d73, float:1.8483252E38)
            android.view.View r3 = r0.findViewById(r1)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            r1 = 2131434994(0x7f0b1df2, float:1.8491818E38)
            android.view.View r4 = r0.findViewById(r1)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            X.1Zk r1 = new X.1Zk
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0.A03 = r1
            goto L_0x0064
        L_0x019d:
            X.1Gw r1 = r3.A2K
            r4.A01 = r1
            X.1H0 r1 = r3.A2J
            r4.A00 = r1
            r1 = 0
            r3.A4q(r1)
            com.whatsapp.TabsPager r1 = r3.A0a
            java.util.List r1 = r1.A0F
            if (r1 == 0) goto L_0x01b2
            r1.clear()
        L_0x01b2:
            com.whatsapp.TabsPager r2 = r3.A0a
            X.1Gr r1 = r3.A2L
            r2.A0K(r1)
        L_0x01b9:
            r0.A4i()
            return
        L_0x01bd:
            java.lang.String r0 = "navBarHelper"
            goto L_0x01c8
        L_0x01c0:
            java.lang.String r0 = "bottomNavHelper"
            goto L_0x01c8
        L_0x01c3:
            java.lang.String r0 = "homeFabManager"
            goto L_0x01c8
        L_0x01c6:
            java.lang.String r0 = "mainThreadHandler"
        L_0x01c8:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28921bH.Bvv(android.view.View, android.view.ViewGroup, java.lang.String, int):void");
    }
}
