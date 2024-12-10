package X;

/* renamed from: X.2vi  reason: invalid class name and case insensitive filesystem */
public class C65022vi implements C22851Dl {
    public final int A00;
    public final Object A01;

    public C65022vi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a4, code lost:
        if (X.C40811vJ.A0E(r4.A0O, r4.A0h) == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0108, code lost:
        if (r1.A0E.isEmpty() != false) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bo9(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0191;
                case 1: goto L_0x0187;
                case 2: goto L_0x011d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r10.A01
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r2 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragment) r2
            int r3 = X.AnonymousClass000.A0M(r11)
            android.view.View r0 = r2.A0B
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "callsHistory/refreshView failed to get fragment view"
        L_0x0013:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0016:
            return
        L_0x0017:
            r6 = 1
            if (r3 == 0) goto L_0x0040
            if (r3 == r6) goto L_0x0034
            r0 = 2
            if (r3 == r0) goto L_0x0031
            r0 = 3
            if (r3 == r0) goto L_0x002e
            r0 = 4
            if (r3 == r0) goto L_0x002b
            r0 = 5
            if (r3 == r0) goto L_0x0043
            java.lang.String r0 = "callsHistory/refreshView failed to determine screen to be shown"
            goto L_0x0013
        L_0x002b:
            X.1bI r0 = r2.A0a
            goto L_0x0045
        L_0x002e:
            X.1bI r0 = r2.A0Z
            goto L_0x0045
        L_0x0031:
            X.1bI r0 = r2.A0e
            goto L_0x0045
        L_0x0034:
            androidx.recyclerview.widget.RecyclerView r5 = r2.A03
            r1 = -1
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r1, r1)
            r5.setLayoutParams(r0)
            goto L_0x0049
        L_0x0040:
            X.1bI r0 = r2.A0b
            goto L_0x0045
        L_0x0043:
            X.1bI r0 = r2.A0d
        L_0x0045:
            android.view.View r5 = r0.A02()
        L_0x0049:
            android.view.View r0 = r2.A01
            boolean r0 = X.C42171xk.A00(r0, r5)
            if (r0 != 0) goto L_0x008c
            X.1bI[] r9 = r2.A0w
            int r8 = r9.length
            r7 = 0
        L_0x0055:
            r4 = 8
            if (r7 >= r8) goto L_0x0071
            r1 = r9[r7]
            int r0 = r1.A01()
            if (r0 != 0) goto L_0x006e
            android.view.View r0 = r1.A02()
            boolean r0 = X.C42171xk.A00(r5, r0)
            if (r0 != 0) goto L_0x006e
            r1.A04(r4)
        L_0x006e:
            int r7 = r7 + 1
            goto L_0x0055
        L_0x0071:
            androidx.recyclerview.widget.RecyclerView r0 = r2.A03
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0086
            androidx.recyclerview.widget.RecyclerView r0 = r2.A03
            boolean r0 = X.C42171xk.A00(r5, r0)
            if (r0 != 0) goto L_0x0086
            androidx.recyclerview.widget.RecyclerView r0 = r2.A03
            r0.setVisibility(r4)
        L_0x0086:
            r0 = 0
            r5.setVisibility(r0)
            r2.A01 = r5
        L_0x008c:
            if (r3 == r6) goto L_0x00b8
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r4 = r2.A0C
            X.2yF r0 = r4.A02
            if (r0 == 0) goto L_0x00e1
            java.util.ArrayList r0 = r4.A0E
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00e1
            X.0ve r1 = r4.A0h
            X.11S r0 = r4.A0O
            boolean r0 = X.C40811vJ.A0E(r0, r1)
            if (r0 != 0) goto L_0x00e1
        L_0x00a6:
            androidx.recyclerview.widget.RecyclerView r5 = r2.A03
            r4 = -1
            r1 = -2
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r4, r1)
            r5.setLayoutParams(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r2.A03
            r0 = 0
            r1.setVisibility(r0)
        L_0x00b8:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A09(r2, r3)
            r5 = -1
            r4 = 8
            r1 = 5
            X.1bI r0 = r2.A0c
            int r0 = r0.A01()
            if (r3 != r1) goto L_0x010b
            if (r0 != r4) goto L_0x0016
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r0 = r2.A0C
            X.2yH r0 = r0.A04
            if (r0 == 0) goto L_0x0016
            android.view.View r3 = r2.A00
            r1 = -2
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r5, r1)
            r3.setLayoutParams(r0)
            X.1bI r1 = r2.A0c
            r0 = 0
            r1.A04(r0)
            return
        L_0x00e1:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r0 = r2.A0C
            X.2yK r1 = r0.A05
            if (r1 == 0) goto L_0x00f0
            java.util.ArrayList r0 = r0.A0E
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00f0
            goto L_0x00a6
        L_0x00f0:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r0 = r2.A0C
            boolean r0 = r0.A0c()
            if (r0 != 0) goto L_0x00a6
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r1 = r2.A0C
            X.2yH r0 = r1.A04
            if (r0 != 0) goto L_0x00a6
            X.2yG r0 = r1.A03
            if (r0 == 0) goto L_0x00b8
            java.util.ArrayList r0 = r1.A0E
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b8
            goto L_0x00a6
        L_0x010b:
            if (r0 == r4) goto L_0x0016
            android.view.View r1 = r2.A00
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r5, r5)
            r1.setLayoutParams(r0)
            X.1bI r0 = r2.A0c
            r0.A04(r4)
            return
        L_0x011d:
            java.lang.Object r5 = r10.A01
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r5 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragment) r5
            java.util.AbstractCollection r11 = (java.util.AbstractCollection) r11
            X.00H r0 = r5.A0m
            java.lang.Object r1 = r0.get()
            X.1w3 r1 = (X.C41251w3) r1
            java.util.ArrayList r0 = X.C17880vN.A10(r11)
            r1.A0W(r0)
            boolean r1 = r11.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x013a
            r0 = 2
        L_0x013a:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A09(r5, r0)
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r0 = r5.A0C
            X.1vo r0 = r0.A0Y
            java.lang.CharSequence r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0016
            X.11C r0 = r5.A0L
            android.view.accessibility.AccessibilityManager r0 = r0.A0M()
            boolean r0 = X.AnonymousClass1Y5.A0D(r0)
            if (r0 == 0) goto L_0x0016
            r0 = 2131886286(0x7f1200ce, float:1.9407147E38)
            java.lang.String r2 = r5.A1H(r0)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x01a4
            java.util.Iterator r6 = r11.iterator()
            r4 = 0
            r3 = 0
        L_0x016a:
            boolean r0 = r6.hasNext()
            r2 = 1
            if (r0 == 0) goto L_0x019b
            java.lang.Object r0 = r6.next()
            X.1vq r0 = (X.C41121vq) r0
            int r1 = r0.BTW()
            r0 = 2
            if (r1 == r0) goto L_0x0184
            if (r1 == r2) goto L_0x0184
            r0 = 8
            if (r1 != r0) goto L_0x016a
        L_0x0184:
            int r3 = r3 + 1
            goto L_0x016a
        L_0x0187:
            java.lang.Object r0 = r10.A01
            X.1FY r0 = (X.AnonymousClass1FY) r0
            java.lang.Integer r11 = (java.lang.Integer) r11
            r0.A4R(r11)
            return
        L_0x0191:
            java.lang.Object r0 = r10.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            java.lang.Integer r11 = (java.lang.Integer) r11
            r0.A3z(r11)
            return
        L_0x019b:
            if (r3 != r2) goto L_0x01b4
            r0 = 2131886288(0x7f1200d0, float:1.940715E38)
            java.lang.String r2 = r5.A1H(r0)
        L_0x01a4:
            X.00H r0 = r5.A0p
            java.lang.Object r1 = r0.get()
            X.6mp r1 = (X.C132446mp) r1
            android.content.Context r0 = r5.A1n()
            r1.A00(r0, r2)
            return
        L_0x01b4:
            r1 = 2131886287(0x7f1200cf, float:1.9407149E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            X.C17880vN.A1T(r0, r3, r4)
            java.lang.String r2 = r5.A1I(r1, r0)
            goto L_0x01a4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65022vi.Bo9(java.lang.Object):void");
    }
}
