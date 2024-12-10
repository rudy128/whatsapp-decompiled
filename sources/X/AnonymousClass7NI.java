package X;

/* renamed from: X.7NI  reason: invalid class name */
public class AnonymousClass7NI implements B9W {
    public final int A00;
    public final Object A01;

    public AnonymousClass7NI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(A2X a2x, Class cls, Object obj, int i) {
        a2x.A01(new AnonymousClass7NI(obj, i), cls, obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.whatsapp.flows.phoenix.PhoenixFlowsBottomSheetActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.whatsapp.flows.phoenix.PhoenixFlowsBottomSheetActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: X.6NY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: com.whatsapp.flows.phoenix.PhoenixFlowsBottomSheetActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: com.whatsapp.flows.phoenix.PhoenixFlowsBottomSheetActivity} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void BtO(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x02bd;
                case 1: goto L_0x023d;
                case 2: goto L_0x0166;
                case 3: goto L_0x0146;
                case 4: goto L_0x00f9;
                case 5: goto L_0x00cc;
                case 6: goto L_0x02b5;
                case 7: goto L_0x02a3;
                case 8: goto L_0x029c;
                case 9: goto L_0x00b1;
                case 10: goto L_0x028d;
                case 11: goto L_0x0073;
                case 12: goto L_0x0273;
                case 13: goto L_0x005f;
                case 14: goto L_0x0045;
                case 15: goto L_0x0264;
                case 16: goto L_0x0255;
                case 17: goto L_0x0024;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A01
            com.whatsapp.wabloks.ui.WaBloksActivity r0 = (com.whatsapp.wabloks.ui.WaBloksActivity) r0
            X.7NV r10 = (X.AnonymousClass7NV) r10
            java.lang.String r6 = r10.A01
            java.lang.String r8 = r10.A00
            X.5tM r1 = r0.A05
            X.6Nq r1 = (X.AnonymousClass6Nq) r1
            r7 = 0
            X.6po r2 = r1.A00
            com.whatsapp.wabloks.ui.WaBloksActivity r3 = r1.A03
            androidx.appcompat.widget.Toolbar r4 = r1.A00
            r0 = 1
            X.7OZ r5 = new X.7OZ
            r5.<init>(r1, r0)
            r2.A01(r3, r4, r5, r6, r7, r8)
        L_0x0023:
            return
        L_0x0024:
            java.lang.Object r3 = r9.A01
            com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity r3 = (com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity) r3
            X.AeV r10 = (X.C21101AeV) r10
            java.util.List r2 = r10.A00
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "fds_state_name"
            java.lang.String r0 = r1.getStringExtra(r0)
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x0023
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r1 = r3.A02
            r0 = 0
            r1.A0M = r0
            r3.finish()
            return
        L_0x0045:
            java.lang.Object r2 = r9.A01
            X.6NY r2 = (X.AnonymousClass6NY) r2
            X.AeV r10 = (X.C21101AeV) r10
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            java.util.List r1 = r10.A00
            java.lang.String r0 = r2.A04
            if (r0 != 0) goto L_0x0059
            java.lang.String r0 = "stateName"
            goto L_0x02c7
        L_0x0059:
            boolean r0 = r1.contains(r0)
            goto L_0x024f
        L_0x005f:
            java.lang.Object r1 = r9.A01
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r1 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r1
            X.7NS r10 = (X.AnonymousClass7NS) r10
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            com.whatsapp.WaTextView r1 = r1.A05
            if (r1 == 0) goto L_0x0023
            java.lang.String r0 = r10.A00
            r1.setText(r0)
            return
        L_0x0073:
            java.lang.Object r1 = r9.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.7NX r10 = (X.AnonymousClass7NX) r10
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            X.1FL r4 = r1.A1B()
            if (r4 == 0) goto L_0x0023
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x0023
            X.3Rj r3 = X.AnonymousClass4a6.A00(r4)
            java.lang.String r0 = r10.A00
            r3.A0S(r0)
            java.lang.String r2 = r10.A02
            r1 = 23
            X.7AM r0 = new X.7AM
            r0.<init>(r10, r1)
            r3.A0i(r4, r0, r2)
            java.lang.String r2 = r10.A01
            r1 = 24
            X.7AM r0 = new X.7AM
            r0.<init>(r10, r1)
            r3.A0h(r4, r0, r2)
            r3.create()
            r3.A0C()
            return
        L_0x00b1:
            java.lang.Object r3 = r9.A01
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r3 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r3
            X.7NQ r10 = (X.AnonymousClass7NQ) r10
            boolean r2 = X.C72453Mb.A1Z(r10)
            com.whatsapp.WaTextView r1 = r3.A06
            if (r1 == 0) goto L_0x00c4
            java.lang.String r0 = r10.A00
            r1.setText(r0)
        L_0x00c4:
            android.view.ViewGroup r0 = r3.A00
            if (r0 == 0) goto L_0x0023
            r0.setVisibility(r2)
            return
        L_0x00cc:
            java.lang.Object r2 = r9.A01
            com.whatsapp.wabloks.base.FdsContentFragmentManager r2 = (com.whatsapp.wabloks.base.FdsContentFragmentManager) r2
            X.7NO r10 = (X.AnonymousClass7NO) r10
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            java.lang.String r1 = r10.A00
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x00e4
            X.1GP r0 = r2.A1E()
            X.AnonymousClass1GP.A0J(r0, r1)
            return
        L_0x00e4:
            X.1FL r0 = r2.A1D()
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0023
            java.util.Queue r7 = r2.A03
            r0 = 32
            X.7RS r6 = new X.7RS
            r6.<init>(r0, r1, r2)
            goto L_0x02d5
        L_0x00f9:
            java.lang.Object r5 = r9.A01
            com.whatsapp.wabloks.base.FdsContentFragmentManager r5 = (com.whatsapp.wabloks.base.FdsContentFragmentManager) r5
            X.7NU r10 = (X.AnonymousClass7NU) r10
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            androidx.fragment.app.Fragment r4 = r10.A00
            if (r4 == 0) goto L_0x0023
            java.lang.String r3 = r10.A01
            if (r3 == 0) goto L_0x0023
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0113
            com.whatsapp.wabloks.base.FdsContentFragmentManager.A00(r4, r5, r3)
            return
        L_0x0113:
            X.1FL r0 = r5.A1D()
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0023
            X.1FL r0 = r5.A1D()
            boolean r2 = r0 instanceof com.whatsapp.wabloks.ui.WaFcsModalActivity
            X.0vl r0 = r5.A04
            java.lang.String r1 = X.AnonymousClass3MW.A0y(r0)
            if (r1 == 0) goto L_0x013b
            X.00H r0 = r5.A00
            if (r0 == 0) goto L_0x02c5
            X.A2X r1 = X.C108985cd.A0c(r0, r1)
            X.AeX r0 = new X.AeX
            r0.<init>(r2)
            r1.A02(r0)
        L_0x013b:
            java.util.Queue r7 = r5.A03
            r0 = 26
            X.7Qz r6 = new X.7Qz
            r6.<init>(r5, r4, r3, r0)
            goto L_0x02d5
        L_0x0146:
            java.lang.Object r2 = r9.A01
            com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment r2 = (com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment) r2
            X.7NW r10 = (X.AnonymousClass7NW) r10
            java.util.Map r0 = r2.A04
            if (r0 == 0) goto L_0x0023
            java.lang.String r1 = r10.A01
            X.0vl r0 = r2.A0A
            java.lang.String r0 = X.AnonymousClass3MW.A0y(r0)
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x0023
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x02cc
            com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment.A00(r2, r10)
            return
        L_0x0166:
            java.lang.Object r1 = r9.A01
            X.6gR r1 = (X.C128636gR) r1
            X.7NT r10 = (X.AnonymousClass7NT) r10
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            X.6Bq r3 = r1.A00
            int r1 = r10.A00
            android.os.Bundle r5 = r10.A01
            java.util.HashMap r4 = X.C17880vN.A11()
            r0 = -1
            java.lang.String r8 = "failure"
            java.lang.String r7 = "PAY: FcsBRActivityResultResource/onDeeplinkActivityResult - response is NULL"
            java.lang.String r6 = "stepupresponse"
            if (r1 != r0) goto L_0x01ff
            if (r5 == 0) goto L_0x01aa
            java.lang.String r1 = "STEP_UP_RESPONSE"
            r2 = 0
            java.lang.String r0 = r5.getString(r1, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01df
            java.lang.String r0 = r5.getString(r1)
            r4.put(r6, r0)
            java.lang.String r2 = "STEP_UP_AUTH_CODE"
            boolean r0 = r5.containsKey(r2)
            if (r0 == 0) goto L_0x01aa
            java.lang.String r1 = "stepupauthcode"
            java.lang.String r0 = r5.getString(r2)
        L_0x01a7:
            r4.put(r1, r0)
        L_0x01aa:
            X.9gp r8 = r3.A01
            java.lang.String r7 = "br_p2p_verify_card"
            java.lang.String r6 = "verify_deeplink"
            java.lang.String r5 = "pay_verify_card"
            java.lang.String r3 = "domain"
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.String r2 = "config"
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            java.lang.String r1 = "action"
            r0 = 2
            X.C18070vi.A0d(r6, r0)
            org.json.JSONObject r0 = X.C17880vN.A15()
            r0.put(r1, r6)
            r0.put(r2, r7)
            r0.put(r3, r5)
            java.lang.String r5 = X.C18070vi.A0H(r0)
            X.00H r0 = r8.A05
            java.lang.Object r1 = r0.get()
            X.9jQ r1 = (X.C189549jQ) r1
            monitor-enter(r1)
            goto L_0x0206
        L_0x01df:
            java.lang.String r1 = "issuerMobileAppAuthResponse"
            java.lang.String r0 = r5.getString(r1, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01ff
            java.lang.String r0 = r5.getString(r1, r2)
            r4.put(r1, r0)
            java.lang.String r1 = "TAV"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x01aa
            java.lang.String r0 = r5.getString(r1)
            goto L_0x01a7
        L_0x01ff:
            com.whatsapp.util.Log.e((java.lang.String) r7)
            r4.put(r6, r8)
            goto L_0x01aa
        L_0x0206:
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x02d9 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x02d9 }
            monitor-exit(r1)
            java.util.Iterator r3 = r0.iterator()
        L_0x0211:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r3.next()
            X.A8q r0 = (X.C20130A8q) r0
            X.A8p r2 = r0.A00
            if (r2 == 0) goto L_0x0211
            X.9ba r1 = r2.A04
            boolean r0 = r1 instanceof X.AnonymousClass90N
            if (r0 == 0) goto L_0x0211
            X.90N r1 = (X.AnonymousClass90N) r1
            java.lang.String r0 = r1.A03
            X.B5m r1 = r2.A0A(r0)
            X.8BF r1 = (X.AnonymousClass8BF) r1
            if (r1 == 0) goto L_0x0211
            boolean r0 = r1.BAd(r5)
            if (r0 == 0) goto L_0x0211
            r1.BcA(r5, r4)
            return
        L_0x023d:
            java.lang.Object r2 = r9.A01
            com.whatsapp.flows.phoenix.PhoenixFlowsBottomSheetActivity r2 = (com.whatsapp.flows.phoenix.PhoenixFlowsBottomSheetActivity) r2
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "extra_error_message"
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 != 0) goto L_0x0251
            boolean r0 = r2.A01
        L_0x024f:
            if (r0 != 0) goto L_0x0023
        L_0x0251:
            r2.finish()
            return
        L_0x0255:
            java.lang.Object r1 = r9.A01
            X.6NY r1 = (X.AnonymousClass6NY) r1
            X.7NR r10 = (X.AnonymousClass7NR) r10
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            java.lang.String r0 = r10.A00
            r1.A03 = r0
            return
        L_0x0264:
            java.lang.Object r1 = r9.A01
            X.6NY r1 = (X.AnonymousClass6NY) r1
            X.AeW r10 = (X.C21102AeW) r10
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            boolean r0 = r10.A00
            r1.A05 = r0
            return
        L_0x0273:
            java.lang.Object r3 = r9.A01
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r3 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r3
            X.7NV r10 = (X.AnonymousClass7NV) r10
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            java.lang.String r2 = r10.A01
            java.lang.String r1 = r10.A00
            java.lang.String r0 = r10.A02
            r3.A0H = r2
            r3.A0G = r1
            r3.A0J = r0
            r3.A2K()
            return
        L_0x028d:
            java.lang.Object r1 = r9.A01
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r1 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r1
            X.7NP r10 = (X.AnonymousClass7NP) r10
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            boolean r0 = r10.A00
            r1.A0L = r0
            return
        L_0x029c:
            java.lang.Object r0 = r9.A01
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r0 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r0
            android.widget.FrameLayout r0 = r0.A01
            goto L_0x02b1
        L_0x02a3:
            java.lang.Object r2 = r9.A01
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r2 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r2
            r1 = 0
            android.widget.FrameLayout r0 = r2.A01
            if (r0 == 0) goto L_0x02af
            r0.setVisibility(r1)
        L_0x02af:
            android.view.ViewGroup r0 = r2.A00
        L_0x02b1:
            X.C72453Mb.A1D(r0)
            return
        L_0x02b5:
            java.lang.Object r0 = r9.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A28()
            return
        L_0x02bd:
            java.lang.Object r1 = r9.A01
            com.whatsapp.flows.phoenix.PhoenixFlowsBottomSheetActivity r1 = (com.whatsapp.flows.phoenix.PhoenixFlowsBottomSheetActivity) r1
            r0 = 1
            r1.A01 = r0
            return
        L_0x02c5:
            java.lang.String r0 = "uiObserverFactory"
        L_0x02c7:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x02cc:
            java.util.Queue r7 = r2.A09
            r0 = 16
            X.7RN r6 = new X.7RN
            r6.<init>(r2, r10, r0)
        L_0x02d5:
            r7.add(r6)
            return
        L_0x02d9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7NI.BtO(java.lang.Object):void");
    }
}
