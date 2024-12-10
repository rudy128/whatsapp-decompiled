package X;

/* renamed from: X.9Bd  reason: invalid class name and case insensitive filesystem */
public class C177929Bd extends A34 {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177929Bd(AnonymousClass1F9 r2, A5G a5g) {
        super(r2, true);
        this.A00 = 14;
        this.A01 = a5g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009d, code lost:
        if (r7 != 1) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0H(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0166;
                case 1: goto L_0x0138;
                case 2: goto L_0x0222;
                case 3: goto L_0x010d;
                case 4: goto L_0x020e;
                case 5: goto L_0x0031;
                case 6: goto L_0x01f9;
                case 7: goto L_0x01e7;
                case 8: goto L_0x0005;
                case 9: goto L_0x0006;
                case 10: goto L_0x01cd;
                case 11: goto L_0x019e;
                case 12: goto L_0x018e;
                case 13: goto L_0x018e;
                case 14: goto L_0x0184;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.util.Iterator r3 = X.AnonymousClass8BR.A13(r9)
        L_0x000a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0005
            X.AEs r0 = X.AnonymousClass8BR.A0P(r3)
            X.8pb r1 = r0.A08
            X.C17960vV.A07(r1)
            X.8pS r1 = (X.AnonymousClass8pS) r1
            java.lang.Object r2 = r8.A01
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r2 = (com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r2
            X.A6g r0 = r2.A06
            java.lang.String r1 = r1.A0A
            if (r1 == 0) goto L_0x002d
            java.util.Set r0 = r0.A04
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x000a
        L_0x002d:
            r0 = 1
            r2.A0M = r0
            return
        L_0x0031:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            java.lang.Object r4 = r8.A01
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r4 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel) r4
            X.1vo r1 = r4.A0Y
            java.lang.CharSequence r0 = r1.A01
            boolean r0 = X.AnonymousClass8BR.A1S(r0)
            r3 = 5
            r2 = 1
            if (r0 == 0) goto L_0x00a0
            java.util.ArrayList r0 = r4.A0E
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a0
            r7 = 5
        L_0x004c:
            X.1DT r5 = r4.A0M
            java.lang.Object r0 = r5.A06()
            if (r0 == 0) goto L_0x009d
            int r0 = X.C72463Mc.A0A(r5)
            if (r0 != r7) goto L_0x009d
            if (r7 != r3) goto L_0x0005
        L_0x005c:
            java.util.ArrayList r1 = r4.A0E
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0097
            r1.clear()
            X.2yF r2 = r4.A02
            if (r2 == 0) goto L_0x007a
            X.0ve r1 = r4.A0h
            X.11S r0 = r4.A0O
            boolean r0 = X.C40811vJ.A0E(r0, r1)
            if (r0 != 0) goto L_0x007a
            java.util.ArrayList r0 = r4.A0E
            r0.add(r2)
        L_0x007a:
            X.2yG r1 = r4.A03
            if (r1 == 0) goto L_0x0083
            java.util.ArrayList r0 = r4.A0E
            r0.add(r1)
        L_0x0083:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel.A05(r4)
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel.A04(r4)
            r0 = 0
            r4.A04 = r0
        L_0x008c:
            X.1vp r1 = r4.A0k
            java.util.ArrayList r0 = r4.A0E
            r1.A0F(r0)
        L_0x0093:
            X.AnonymousClass3MX.A1J(r5, r7)
            return
        L_0x0097:
            java.lang.String r0 = "CallsHistoryFragmentV2ViewModel/clearCallLog no items registered"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x008c
        L_0x009d:
            if (r7 == r2) goto L_0x0093
            goto L_0x005c
        L_0x00a0:
            java.util.LinkedHashMap r0 = r4.A0r
            int r0 = r0.size()
            if (r0 > 0) goto L_0x00d4
            java.util.ArrayList r0 = r4.A0p
            int r0 = r0.size()
            if (r0 > 0) goto L_0x00d4
            X.0ve r5 = r4.A0h
            X.11S r6 = r4.A0O
            boolean r0 = X.C40811vJ.A0D(r6, r5)
            if (r0 == 0) goto L_0x00c4
            java.util.List r0 = r4.A0G
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00d4
        L_0x00c4:
            java.lang.CharSequence r0 = r1.A01
            boolean r0 = X.AnonymousClass8BR.A1S(r0)
            if (r0 == 0) goto L_0x00d7
            java.util.ArrayList r0 = r4.A0E
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00d7
        L_0x00d4:
            r7 = 1
            goto L_0x004c
        L_0x00d7:
            X.1vb r1 = r4.A0R
            X.2Pk r0 = r1.A03
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r7 = 0
            if (r0 != 0) goto L_0x004c
            boolean r0 = X.C40811vJ.A0D(r6, r5)
            if (r0 == 0) goto L_0x00ee
            X.2PJ r0 = r1.A04
            if (r0 == 0) goto L_0x00ee
            goto L_0x004c
        L_0x00ee:
            r1 = 5868(0x16ec, float:8.223E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 != 0) goto L_0x0103
            X.00H r0 = r4.A0m
            boolean r0 = X.C72463Mc.A1W(r0)
            if (r0 != 0) goto L_0x0103
            r7 = 4
            goto L_0x004c
        L_0x0103:
            boolean r0 = r9.booleanValue()
            r7 = 2
            if (r0 != 0) goto L_0x004c
            r7 = 3
            goto L_0x004c
        L_0x010d:
            java.util.Collection r9 = (java.util.Collection) r9
            r4 = 0
            X.C18070vi.A0d(r9, r4)
            java.lang.Object r3 = r8.A01
            X.1pj r3 = (X.C37551pj) r3
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A0L     // Catch:{ all -> 0x02e3 }
            r2 = 0
            r0.set(r4)     // Catch:{ all -> 0x02e3 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A0M     // Catch:{ all -> 0x02e3 }
            r0 = 1
            boolean r0 = r1.compareAndSet(r4, r0)     // Catch:{ all -> 0x02e3 }
            if (r0 == 0) goto L_0x012d
            java.util.Set r0 = r3.A0K     // Catch:{ all -> 0x02e3 }
            r0.addAll(r9)     // Catch:{ all -> 0x02e3 }
            r2 = 1
        L_0x012d:
            monitor-exit(r3)
            if (r2 == 0) goto L_0x0005
            java.util.Set r0 = r3.A0A()
            X.C37551pj.A07(r3, r0)
            return
        L_0x0138:
            android.util.Pair r9 = (android.util.Pair) r9
            java.lang.Object r0 = r9.first
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            r4 = 1
            if (r0 == 0) goto L_0x014e
            java.lang.String r0 = "HomeActivity/show badge"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r8.A01
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            r0.A27 = r4
        L_0x014e:
            java.lang.Object r0 = r9.second
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x0005
            java.lang.Object r3 = r8.A01
            X.1FU r3 = (X.AnonymousClass1FU) r3
            X.190 r2 = r3.A03
            java.lang.String r1 = "asyncRefreshAccountSwitchingData/invalidate menu options"
            r0 = 0
            r2.A0G(r1, r0, r4)
            r3.invalidateOptionsMenu()
            return
        L_0x0166:
            boolean r0 = X.AnonymousClass000.A1Y(r9)
            if (r0 == 0) goto L_0x0005
            java.lang.String r0 = "HomeActivity/show badge for me tab"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r8.A01
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            X.00H r0 = r1.A12
            r0.get()
            X.1bI r1 = r1.A0z
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.A04(r0)
            return
        L_0x0184:
            X.1E7 r9 = (X.AnonymousClass1E7) r9
            java.lang.Object r0 = r8.A01
            X.A5G r0 = (X.A5G) r0
            X.A5G.A00(r9, r0)
            return
        L_0x018e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            java.lang.Object r0 = r8.A01
            X.A5V r0 = (X.A5V) r0
            X.BBX r1 = r0.A0D
            boolean r0 = r9.booleanValue()
            r1.CHl(r0)
            return
        L_0x019e:
            X.AEs r9 = (X.C20284AEs) r9
            if (r9 == 0) goto L_0x01b4
            java.lang.Object r0 = r8.A01
            X.91M r0 = (X.AnonymousClass91M) r0
            X.8pN r9 = (X.AnonymousClass8pN) r9
            r0.A00 = r9
            r0.A0A = r9
            android.content.Context r1 = r0.getApplicationContext()
            r0 = 1
            X.C24211Jh.A03(r1, r0)
        L_0x01b4:
            java.lang.Object r3 = r8.A01
            X.91M r3 = (X.AnonymousClass91M) r3
            r3.CEx()
            r3.A4o()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = "extra_bank_account"
            X.8pN r0 = r3.A00
            r2.putExtra(r1, r0)
            X.C72453Mb.A16(r3, r2)
            return
        L_0x01cd:
            X.AEs r9 = (X.C20284AEs) r9
            java.lang.Object r0 = r8.A01
            X.AXN r0 = (X.AXN) r0
            java.lang.Object r0 = r0.A01
            if (r9 == 0) goto L_0x01e1
            X.91M r0 = (X.AnonymousClass91M) r0
            X.8pN r9 = (X.AnonymousClass8pN) r9
            r0.A00 = r9
            r0.A5F()
            return
        L_0x01e1:
            X.91S r0 = (X.AnonymousClass91S) r0
            r0.A56()
            return
        L_0x01e7:
            int r2 = X.AnonymousClass000.A0M(r9)
            java.lang.Object r0 = r8.A01
            X.9yP r0 = (X.C198479yP) r0
            X.1Di r1 = r0.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.invoke(r0)
            return
        L_0x01f9:
            android.util.Pair r9 = (android.util.Pair) r9
            java.lang.Object r2 = r8.A01
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r2 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel) r2
            java.lang.Object r1 = r9.first
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r9.second
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel.A08(r2, r0, r1)
            r2.A0X()
            return
        L_0x020e:
            android.util.Pair r9 = (android.util.Pair) r9
            java.lang.Object r0 = r8.A01
            X.1vh r0 = (X.C41031vh) r0
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r2 = r0.A00
            java.lang.Object r1 = r9.first
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r9.second
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r2.A0a(r0, r1)
            return
        L_0x0222:
            java.util.List r9 = (java.util.List) r9
            r2 = 0
            X.C18070vi.A0d(r9, r2)
            java.lang.Object r4 = r8.A01
            com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet r4 = (com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet) r4
            boolean r0 = r4.A0j
            if (r0 == 0) goto L_0x0236
            java.lang.String r0 = "AccountSwitchingBottomSheet/onViewCreated/onPostExecute/isRemoving"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0236:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0255
            X.1KB r1 = r4.A05
            if (r1 == 0) goto L_0x02d2
            r0 = 2131896261(0x7f1227c5, float:1.9427378E38)
            r1.A08(r0, r2)
            X.190 r3 = r4.A04
            if (r3 == 0) goto L_0x02cf
            r2 = 0
            r1 = 1
            java.lang.String r0 = "AccountSwitchingBottomSheet/accounts is empty"
            r3.A0G(r0, r2, r1)
            r4.A29()
            return
        L_0x0255:
            android.view.View r3 = r4.A01
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x02de
            boolean r0 = X.AnonymousClass000.A1a(r9)
            if (r0 == 0) goto L_0x0280
            int r1 = r9.size()
            r0 = 2
            if (r1 >= r0) goto L_0x0280
            r0 = 2131427444(0x7f0b0074, float:1.8476504E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r3, r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r4.A02 = r0
            if (r0 == 0) goto L_0x0280
            android.view.View r1 = r0.inflate()
            if (r1 == 0) goto L_0x0280
            r0 = 43
            X.AnonymousClass3MZ.A1N(r1, r4, r0)
        L_0x0280:
            android.view.View r1 = r4.A01
            if (r1 == 0) goto L_0x02d9
            android.content.Context r2 = r4.A14()
            r0 = 2131427453(0x7f0b007d, float:1.8476523E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.BottomSheetListView r0 = (com.whatsapp.BottomSheetListView) r0
            r4.A03 = r0
            X.190 r1 = r4.A04
            if (r1 == 0) goto L_0x02cf
            X.0vb r0 = r4.A09
            if (r0 == 0) goto L_0x02cc
            X.8D8 r3 = new X.8D8
            r3.<init>(r2, r1, r0, r9)
            com.whatsapp.BottomSheetListView r0 = r4.A03
            if (r0 == 0) goto L_0x02a7
            r0.setAdapter(r3)
        L_0x02a7:
            com.whatsapp.BottomSheetListView r2 = r4.A03
            if (r2 == 0) goto L_0x02b4
            r1 = 1
            X.AFt r0 = new X.AFt
            r0.<init>(r4, r9, r1)
            r2.setOnItemClickListener(r0)
        L_0x02b4:
            X.8f6 r0 = new X.8f6
            r0.<init>(r3, r4)
            r4.A07 = r0
            X.00H r0 = r4.A0G
            X.10T r2 = X.C17880vN.A0V(r0)
            X.1cO r1 = r4.A07
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.accountswitching.notifications.InactiveAccountBadgingObservers.InactiveAccountBadgingObserver"
            X.C18070vi.A0z(r1, r0)
            r2.registerObserver(r1)
            return
        L_0x02cc:
            java.lang.String r0 = "whatsAppLocale"
            goto L_0x02d4
        L_0x02cf:
            java.lang.String r0 = "crashLogs"
            goto L_0x02d4
        L_0x02d2:
            java.lang.String r0 = "globalUI"
        L_0x02d4:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x02d9:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r2)
            throw r0
        L_0x02de:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r2)
            throw r0
        L_0x02e3:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177929Bd.A0H(java.lang.Object):void");
    }

    public C177929Bd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
