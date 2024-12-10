package X;

import android.widget.Filter;

/* renamed from: X.1rC  reason: invalid class name and case insensitive filesystem */
public class C38381rC extends Filter {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ C38371rB A02;

    public C38381rC(C38371rB r1) {
        this.A02 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0313, code lost:
        if (((X.C28391a8) r6.A3D.get()).A03() != false) goto L_0x0315;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r15) {
        /*
            r14 = this;
            X.1rB r10 = r14.A02
            com.whatsapp.conversationslist.ConversationsFragment r6 = r10.A08
            X.1pG r1 = r6.A2L
            boolean r0 = X.C37281pG.A00(r1)
            if (r0 == 0) goto L_0x0016
            X.19U r2 = r1.A01
            r1 = 269615107(0x10120003, float:2.8793432E-29)
            java.lang.String r0 = "perform_filtering_start"
            r2.markerPoint(r1, r0)
        L_0x0016:
            java.lang.String r0 = "conversations/filter/performFiltering"
            X.1Ez r5 = new X.1Ez
            r5.<init>((java.lang.String) r0)
            X.1Gk r0 = r10.A01
            X.1Gk r7 = r0.A00()
            r3 = 1
            r14.A00 = r3
            java.lang.Integer r4 = r7.A01
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            r2 = 0
            r0 = 0
            if (r4 != r1) goto L_0x002f
            r0 = 1
        L_0x002f:
            r14.A01 = r0
            boolean r0 = r7.A03()
            if (r0 != 0) goto L_0x0079
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 == 0) goto L_0x0079
            java.util.List r1 = r6.A28()
            r3 = 0
        L_0x0042:
            X.274 r4 = new X.274
            r4.<init>(r7, r14, r3)
            r4.values = r1
            if (r1 != 0) goto L_0x0072
            r4.count = r2
        L_0x004d:
            r5.A02()
            X.1pG r3 = r6.A2L
            boolean r0 = X.C37281pG.A00(r3)
            if (r0 == 0) goto L_0x0062
            X.19U r2 = r3.A01
            r1 = 269615107(0x10120003, float:2.8793432E-29)
            java.lang.String r0 = "perform_filtering_done"
            r2.markerPoint(r1, r0)
        L_0x0062:
            boolean r0 = X.C37281pG.A00(r3)
            if (r0 == 0) goto L_0x0071
            X.19U r2 = r3.A01
            r1 = 269615107(0x10120003, float:2.8793432E-29)
            r0 = 2
            r2.markerEnd(r1, r0)
        L_0x0071:
            return r4
        L_0x0072:
            int r0 = r1.size()
            r4.count = r0
            goto L_0x004d
        L_0x0079:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            X.00H r0 = r6.A3I
            java.lang.Object r0 = r0.get()
            X.1rO r0 = (X.C38501rO) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x00d8
            X.1Gk r0 = r10.A01
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00d8
            X.00H r11 = r6.A3I
            X.1NH r4 = r6.A20
            X.1Gk r0 = r10.A01
            java.util.List r0 = r0.A03
            if (r0 != 0) goto L_0x00a5
            X.0wS r0 = X.C18460wS.A00
        L_0x00a5:
            java.util.HashSet r0 = r4.A01(r0)
            X.2zH r8 = new X.2zH
            r8.<init>(r11, r0)
            X.1Gk r0 = r10.A01
            java.util.List r0 = r0.A03
            if (r0 != 0) goto L_0x00b6
            X.0wS r0 = X.C18460wS.A00
        L_0x00b6:
            r0.size()
            X.00H r0 = r6.A3I
            java.lang.Object r0 = r0.get()
            X.1rO r0 = (X.C38501rO) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x00d5
            X.00H r0 = r6.A3V
            java.lang.Object r0 = r0.get()
            X.2qo r0 = (X.C62112qo) r0
            r4 = 6
            java.util.Map r0 = r0.A01
            X.C17880vN.A1O(r8, r0, r4)
        L_0x00d5:
            r9.add(r8)
        L_0x00d8:
            X.00H r0 = r6.A3D
            java.lang.Object r0 = r0.get()
            X.1a8 r0 = (X.C28391a8) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0122
            X.1Gk r0 = r10.A01
            java.util.List r0 = r0.A04
            if (r0 == 0) goto L_0x0122
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0122
            r14.A01 = r2
            X.1Gk r0 = r10.A01
            java.util.List r0 = r0.A04
            if (r0 != 0) goto L_0x00fc
            X.0wS r0 = X.C18460wS.A00
        L_0x00fc:
            java.util.Iterator r11 = r0.iterator()
        L_0x0100:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0122
            java.lang.Object r8 = r11.next()
            java.lang.String r8 = (java.lang.String) r8
            X.00H r0 = r6.A34
            java.lang.Object r4 = r0.get()
            X.2kA r4 = (X.C58112kA) r4
            X.C18070vi.A0d(r8, r2)
            r0 = 0
            X.88w r0 = r4.A00(r8, r0)
            if (r0 == 0) goto L_0x0100
            r9.add(r0)
            goto L_0x0100
        L_0x0122:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 == 0) goto L_0x01f8
            X.1Nb r0 = r10.A04
            java.util.Set r12 = r0.A0f()
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            X.1Nd r0 = r6.A1K
            java.util.ArrayList r0 = r0.A06()
            java.util.Iterator r13 = r0.iterator()
        L_0x013d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0191
            java.lang.Object r8 = r13.next()
            X.1BI r8 = (X.AnonymousClass1BI) r8
            boolean r0 = X.C25181Nf.A00(r8, r9)
            if (r0 == 0) goto L_0x013d
            r11.add(r8)
            boolean r0 = r12.contains(r8)
            if (r0 == 0) goto L_0x0162
            r4 = 2
            X.1tO r0 = new X.1tO
            r0.<init>((X.AnonymousClass1BI) r8, (int) r4)
            r1.add(r2, r0)
            goto L_0x013d
        L_0x0162:
            X.1CJ r0 = r6.A1v
            boolean r0 = r0.A0Q(r8)
            if (r0 != 0) goto L_0x013d
            X.1CJ r0 = r6.A1v
            boolean r0 = r0.A0S(r8)
            if (r0 != 0) goto L_0x013d
            boolean r0 = r14.A01
            if (r0 == 0) goto L_0x0187
            r0 = 2131895518(0x7f1224de, float:1.9425871E38)
            java.lang.String r4 = r6.A1H(r0)
            X.1xW r0 = new X.1xW
            r0.<init>(r4)
            r1.add(r0)
            r14.A01 = r2
        L_0x0187:
            r4 = 2
            X.1tO r0 = new X.1tO
            r0.<init>((X.AnonymousClass1BI) r8, (int) r4)
            r1.add(r0)
            goto L_0x013d
        L_0x0191:
            r5.A01()
            X.00H r0 = r6.A3D
            java.lang.Object r0 = r0.get()
            X.1a8 r0 = (X.C28391a8) r0
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x01f5
            X.1Nf r0 = r6.A1w
            java.util.List r0 = r0.A03()
            java.util.Iterator r12 = r0.iterator()
        L_0x01ac:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01f5
            java.lang.Object r8 = r12.next()
            X.1E7 r8 = (X.AnonymousClass1E7) r8
            X.2lf r0 = r8.A0H
            if (r0 == 0) goto L_0x01ac
            java.lang.Class<X.1BI> r4 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r0 = r8.A06(r4)
            boolean r0 = r11.contains(r0)
            if (r0 != 0) goto L_0x01ac
            com.whatsapp.jid.Jid r0 = r8.A06(r4)
            X.C17960vV.A07(r0)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            boolean r0 = X.C25181Nf.A00(r0, r9)
            if (r0 == 0) goto L_0x01ac
            boolean r0 = r14.A00
            if (r0 == 0) goto L_0x01ec
            r0 = 2131895519(0x7f1224df, float:1.9425873E38)
            java.lang.String r4 = r6.A1H(r0)
            X.1xW r0 = new X.1xW
            r0.<init>(r4)
            r1.add(r0)
            r14.A00 = r2
        L_0x01ec:
            X.2Na r0 = new X.2Na
            r0.<init>(r8)
            r1.add(r0)
            goto L_0x01ac
        L_0x01f5:
            r5.A01()
        L_0x01f8:
            r4 = r15
            java.lang.String r4 = (java.lang.String) r4
            X.0vb r0 = r10.A03
            java.util.ArrayList r11 = X.C20103A7h.A03(r0, r4)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x022a
            X.00H r0 = r6.A3H
            java.lang.Object r10 = r0.get()
            X.2bJ r10 = (X.C52682bJ) r10
            X.1Nf r8 = r6.A1w
            X.1Me r4 = r6.A1A
            X.2zJ r0 = new X.2zJ
            r0.<init>(r4, r8, r10, r11)
            r9.add(r0)
            X.1jz r4 = r6.A4Q
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r9)
            r4.A09 = r0
            r4.A05(r15)
            r4.A06(r11)
        L_0x022a:
            X.1jz r8 = r6.A4Q
            java.util.List r0 = r7.A03
            if (r0 != 0) goto L_0x0232
            X.0wS r0 = X.C18460wS.A00
        L_0x0232:
            r8.A0D = r0
            r8.A00 = r2
            r0 = 100
            r8.A01 = r0
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.Integer r4 = r7.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r4 == r0) goto L_0x0253
            X.1QB r4 = r6.A1y
            r0 = 0
            android.util.Pair r0 = r4.A08(r0, r8, r0)
            java.lang.Object r0 = r0.second
            java.util.Collection r0 = (java.util.Collection) r0
            r11.addAll(r0)
        L_0x0253:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0261:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0279
            java.lang.Object r4 = r11.next()
            X.206 r4 = (X.AnonymousClass206) r4
            boolean r0 = r4.A0q
            if (r0 == 0) goto L_0x0275
            r10.add(r4)
            goto L_0x0261
        L_0x0275:
            r8.add(r4)
            goto L_0x0261
        L_0x0279:
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x02a7
            r0 = 2131895524(0x7f1224e4, float:1.9425883E38)
            java.lang.String r4 = r6.A1H(r0)
            X.1xW r0 = new X.1xW
            r0.<init>(r4)
            r1.add(r0)
            java.util.Iterator r10 = r10.iterator()
        L_0x0292:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02a7
            java.lang.Object r4 = r10.next()
            X.206 r4 = (X.AnonymousClass206) r4
            X.2NZ r0 = new X.2NZ
            r0.<init>(r4)
            r1.add(r0)
            goto L_0x0292
        L_0x02a7:
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x02d5
            r0 = 2131895521(0x7f1224e1, float:1.9425877E38)
            java.lang.String r4 = r6.A1H(r0)
            X.1xW r0 = new X.1xW
            r0.<init>(r4)
            r1.add(r0)
            java.util.Iterator r8 = r8.iterator()
        L_0x02c0:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x02d5
            java.lang.Object r4 = r8.next()
            X.206 r4 = (X.AnonymousClass206) r4
            X.2NZ r0 = new X.2NZ
            r0.<init>(r4)
            r1.add(r0)
            goto L_0x02c0
        L_0x02d5:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x031a
            java.util.Iterator r8 = r9.iterator()
        L_0x02df:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x031a
            java.lang.Object r4 = r8.next()
            X.88w r4 = (X.C1605388w) r4
            boolean r0 = r4 instanceof X.C67072zC
            if (r0 == 0) goto L_0x02df
            X.2zC r4 = (X.C67072zC) r4
            com.whatsapp.favorite.FavoriteManager r0 = r4.A00
            X.0vl r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            java.util.Set r0 = X.C29431cG.A12(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x02df
            X.00H r0 = r6.A3D
            java.lang.Object r0 = r0.get()
            X.1a8 r0 = (X.C28391a8) r0
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x031a
        L_0x0315:
            r5.A01()
            goto L_0x0042
        L_0x031a:
            r3 = 0
            goto L_0x0315
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38381rC.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r1 != false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void publishResults(java.lang.CharSequence r11, android.widget.Filter.FilterResults r12) {
        /*
            r10 = this;
            X.274 r12 = (X.AnonymousClass274) r12
            X.1rB r6 = r10.A02
            com.whatsapp.conversationslist.ConversationsFragment r5 = r6.A08
            android.view.View r2 = r5.A0B
            if (r2 == 0) goto L_0x0134
            int r0 = r12.count
            r1 = 8
            r4 = 0
            if (r0 != 0) goto L_0x01ae
            X.1Gk r0 = r6.A01
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x01b2
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x01b2
            r0 = 2131434939(0x7f0b1dbb, float:1.8491706E38)
            android.view.View r0 = r2.findViewById(r0)
            r0.setVisibility(r1)
            com.whatsapp.conversationslist.ConversationsFragment.A0d(r5)
        L_0x002c:
            java.lang.Object r0 = r12.values
            java.util.List r0 = (java.util.List) r0
            r5.A3h = r0
            if (r0 != 0) goto L_0x003a
            java.util.List r0 = r5.A28()
            r5.A3h = r0
        L_0x003a:
            X.1Gk r0 = r6.A01
            java.lang.String r11 = (java.lang.String) r11
            r0.A02 = r11
            X.1Gk r0 = r12.A00
            X.1Gk r0 = r0.A00()
            r6.A00 = r0
            X.1Gk r0 = r6.A01
            java.lang.String r1 = r0.A02
            X.0vb r0 = r6.A03
            java.util.ArrayList r0 = X.C20103A7h.A03(r0, r1)
            r0.clear()
            r0.addAll(r0)
            X.1Gk r0 = r6.A01
            java.lang.String r0 = r0.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x006a
            X.1Gk r0 = r6.A01
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0080
        L_0x006a:
            X.00H r0 = r5.A3D
            java.lang.Object r0 = r0.get()
            X.1a8 r0 = (X.C28391a8) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x01ab
            java.util.List r0 = r5.A3h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01ab
        L_0x0080:
            r2 = 1
        L_0x0081:
            java.util.List r0 = r5.A3h
            if (r0 == 0) goto L_0x008c
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x008d
        L_0x008c:
            r0 = 1
        L_0x008d:
            if (r2 != 0) goto L_0x009c
            if (r0 == 0) goto L_0x009c
            X.1Gk r8 = r6.A01
            android.view.View r2 = r5.A0B
            if (r2 != 0) goto L_0x016f
            java.lang.String r0 = "conversations/view/null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x009c:
            X.00H r0 = r5.A3D
            java.lang.Object r0 = r0.get()
            X.1a8 r0 = (X.C28391a8) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x016c
            boolean r0 = com.whatsapp.conversationslist.ConversationsFragment.A10(r5)
            if (r0 == 0) goto L_0x016c
            java.util.List r0 = r5.A3h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x016c
            X.1Gk r0 = r6.A01
            java.util.List r0 = r0.A04
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00d2
        L_0x00c4:
            X.00H r0 = r5.A3I
            java.lang.Object r0 = r0.get()
            X.1rO r0 = (X.C38501rO) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x016c
        L_0x00d2:
            boolean r0 = r12.A01
            java.util.List r3 = r5.A3h
            if (r0 == 0) goto L_0x0135
            X.1xX r2 = new X.1xX
            r2.<init>()
        L_0x00dd:
            r3.add(r2)
            r2 = 1
        L_0x00e1:
            X.1rA r0 = r5.A1V
            if (r0 == 0) goto L_0x00e8
            r0.notifyDataSetChanged()
        L_0x00e8:
            com.whatsapp.conversationslist.ConversationsFragment.A0e(r5)
            com.whatsapp.conversationslist.ConversationsFragment.A0H(r5)
            X.02B r0 = r5.A0M
            if (r0 == 0) goto L_0x00f5
            r0.A06()
        L_0x00f5:
            boolean r0 = r5.A3o
            if (r0 != 0) goto L_0x010a
            X.1qw r0 = r5.A1m
            android.view.ViewGroup r1 = r0.BbU()
            boolean r0 = r1 instanceof com.whatsapp.collections.observablelistview.ObservableListView
            if (r0 == 0) goto L_0x010a
            com.whatsapp.collections.observablelistview.ObservableListView r1 = (com.whatsapp.collections.observablelistview.ObservableListView) r1
            r0 = r2 ^ 1
            r1.setScrollable(r0)
        L_0x010a:
            X.1qw r0 = r5.A1m
            if (r0 == 0) goto L_0x011f
            int r0 = r0.getCount()
            if (r0 <= 0) goto L_0x011f
            boolean r0 = com.whatsapp.conversationslist.ConversationsFragment.A10(r5)
            if (r0 != 0) goto L_0x011f
            X.1qw r0 = r5.A1m
            r0.CKh()
        L_0x011f:
            long r8 = r5.A05
            r6 = 0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0134
            X.1ni r3 = r5.A2Y
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r8
            r0 = 5
            r3.A00(r0, r1)
            r5.A05 = r6
        L_0x0134:
            return
        L_0x0135:
            X.1Gk r0 = r6.A01
            boolean r1 = r0.A02()
            X.1Gk r0 = r6.A01
            if (r1 == 0) goto L_0x0153
            java.util.List r0 = r0.A03
            if (r0 != 0) goto L_0x0145
            X.0wS r0 = X.C18460wS.A00
        L_0x0145:
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "CUSTOM_LIST_FILTER"
            X.1wZ r2 = new X.1wZ
            r2.<init>(r0, r1)
            goto L_0x00dd
        L_0x0153:
            java.util.List r0 = r0.A04
            if (r0 != 0) goto L_0x0159
            X.0wS r0 = X.C18460wS.A00
        L_0x0159:
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            java.lang.String r0 = ""
            X.1wZ r2 = new X.1wZ
            r2.<init>(r1, r0)
            goto L_0x00dd
        L_0x016c:
            r2 = 0
            goto L_0x00e1
        L_0x016f:
            android.view.ViewGroup r1 = r5.A0G
            r0 = 8
            r1.setVisibility(r0)
            r5.A2H(r4)
            r7 = 1
            java.lang.String r0 = r8.A02
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 2131434939(0x7f0b1dbb, float:1.8491706E38)
            if (r1 != 0) goto L_0x019d
            android.view.View r3 = r2.findViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2 = 2131895497(0x7f1224c9, float:1.9425829E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r8.A02
            r1[r4] = r0
            java.lang.String r0 = r5.A1I(r2, r1)
            r3.setText(r0)
            goto L_0x009c
        L_0x019d:
            android.view.View r1 = r2.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131895496(0x7f1224c8, float:1.9425827E38)
            r1.setText(r0)
            goto L_0x009c
        L_0x01ab:
            r2 = 0
            goto L_0x0081
        L_0x01ae:
            r0 = 2131434939(0x7f0b1dbb, float:1.8491706E38)
            goto L_0x01ea
        L_0x01b2:
            r0 = 2131434939(0x7f0b1dbb, float:1.8491706E38)
            android.view.View r3 = r2.findViewById(r0)
            r3.setVisibility(r4)
            X.1qw r0 = r5.A1m
            if (r0 == 0) goto L_0x01d3
            X.00H r0 = r5.A3D
            java.lang.Object r0 = r0.get()
            X.1a8 r0 = (X.C28391a8) r0
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x01d3
            X.1qw r0 = r5.A1m
            r0.CIn(r3)
        L_0x01d3:
            r0 = 2131429626(0x7f0b08fa, float:1.848093E38)
            android.view.View r0 = r2.findViewById(r0)
            r0.setVisibility(r1)
            r0 = 2131429628(0x7f0b08fc, float:1.8480934E38)
            android.view.View r0 = r2.findViewById(r0)
            r0.setVisibility(r1)
            r0 = 2131429627(0x7f0b08fb, float:1.8480932E38)
        L_0x01ea:
            android.view.View r0 = r2.findViewById(r0)
            r0.setVisibility(r1)
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38381rC.publishResults(java.lang.CharSequence, android.widget.Filter$FilterResults):void");
    }
}
