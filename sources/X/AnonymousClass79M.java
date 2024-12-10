package X;

import android.widget.AdapterView;

/* renamed from: X.79M  reason: invalid class name */
public class AnonymousClass79M implements AdapterView.OnItemLongClickListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass79M(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ba, code lost:
        if (r0.A09 == false) goto L_0x00bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onItemLongClick(android.widget.AdapterView r11, android.view.View r12, int r13, long r14) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x006f;
                case 1: goto L_0x0102;
                case 2: goto L_0x0028;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r10.A01
            com.whatsapp.status.playback.MyStatusesActivity r2 = (com.whatsapp.status.playback.MyStatusesActivity) r2
            r0 = 2
            X.C18070vi.A0d(r12, r0)
            X.5f9 r0 = r2.A0W
            java.lang.String r1 = "myStatusesAdapter"
            if (r0 == 0) goto L_0x0160
            int r0 = r0.getCount()
            if (r13 >= r0) goto L_0x015e
            X.5f9 r0 = r2.A0W
            if (r0 == 0) goto L_0x0160
            java.util.List r0 = r0.A00
            X.206 r0 = X.AnonymousClass3MW.A0k(r0, r13)
            r2.A4d(r12, r0)
        L_0x0026:
            r0 = 1
            return r0
        L_0x0028:
            java.lang.Object r3 = r10.A01
            com.whatsapp.status.StatusesFragment r3 = (com.whatsapp.status.StatusesFragment) r3
            java.lang.Object r4 = r12.getTag()
            X.5nA r4 = (X.C113485nA) r4
            X.1FL r2 = r3.A1B()
            X.C17960vV.A07(r2)
            if (r4 == 0) goto L_0x015e
            com.whatsapp.jid.UserJid r1 = r4.A04
            X.1E5 r0 = X.AnonymousClass1E5.A00
            if (r1 == r0) goto L_0x015e
            X.1GP r0 = r2.getSupportFragmentManager()
            boolean r0 = r0.A0z()
            if (r0 != 0) goto L_0x015e
            X.1Nb r0 = r3.A0b
            X.C17960vV.A07(r1)
            X.1yM r0 = r0.A0a(r1)
            boolean r0 = r0.A0U
            com.whatsapp.jid.UserJid r4 = r4.A04
            java.lang.String r8 = com.whatsapp.status.StatusesFragment.A01(r3)
            r9 = 1
            r5 = 0
            r7 = r5
            r6 = r5
            if (r0 == 0) goto L_0x006a
            com.whatsapp.status.StatusConfirmUnmuteDialogFragment r0 = X.AnonymousClass6XU.A00(r4, r5, r6, r7, r8, r9)
        L_0x0066:
            X.C137086ut.A01(r0, r3)
            goto L_0x0026
        L_0x006a:
            com.whatsapp.status.StatusConfirmMuteDialogFragment r0 = X.AnonymousClass6XT.A00(r4, r5, r6, r7, r8, r9)
            goto L_0x0066
        L_0x006f:
            java.lang.Object r4 = r10.A01
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            android.widget.ListView r0 = r4.A0D
            android.widget.ListAdapter r2 = r0.getAdapter()
            boolean r0 = r2 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x0083
            android.widget.HeaderViewListAdapter r2 = (android.widget.HeaderViewListAdapter) r2
            android.widget.ListAdapter r2 = r2.getWrappedAdapter()
        L_0x0083:
            X.5yK r2 = (X.C116625yK) r2
            android.widget.ListView r0 = r4.A0D
            android.widget.ListAdapter r1 = r0.getAdapter()
            boolean r0 = r1 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x0096
            android.widget.HeaderViewListAdapter r1 = (android.widget.HeaderViewListAdapter) r1
            int r0 = r1.getHeadersCount()
            int r13 = r13 - r0
        L_0x0096:
            if (r13 < 0) goto L_0x0026
            X.5yK r0 = r4.A0q
            int r0 = r0.getCount()
            if (r13 >= r0) goto L_0x0026
            java.util.List r0 = r2.A02
            java.lang.Object r0 = r0.get(r13)
            X.86p r0 = (X.C1599786p) r0
            X.1E7 r5 = r0.getContact()
            r3 = 0
            if (r5 == 0) goto L_0x015e
            boolean r0 = r5.A10
            if (r0 == 0) goto L_0x015e
            X.1yf r0 = r5.A0G
            if (r0 == 0) goto L_0x00bc
            boolean r0 = r0.A09
            r2 = 1
            if (r0 != 0) goto L_0x00bd
        L_0x00bc:
            r2 = 0
        L_0x00bd:
            X.00H r0 = r4.A24
            X.1pj r1 = X.AnonymousClass3MW.A0V(r0)
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3MZ.A0x(r5)
            boolean r0 = r1.A0P(r0)
            if (r0 != 0) goto L_0x015e
            boolean r0 = r4.A2h()
            if (r0 == 0) goto L_0x00f5
            X.1VD r0 = X.C108965cb.A0W(r4)
            boolean r0 = r0.A01(r5, r3)
            if (r0 == 0) goto L_0x00f5
            X.1VD r2 = X.C108965cb.A0W(r4)
            X.1FL r0 = r4.A1B()
            X.1GP r1 = r0.getSupportFragmentManager()
            X.C18070vi.A0d(r1, r3)
            com.whatsapp.reachouttimelock.ReachoutTimelockInfoBottomSheet r0 = r2.A00()
            X.C20098A7b.A01(r0, r1)
            goto L_0x0026
        L_0x00f5:
            if (r2 != 0) goto L_0x015e
            boolean r0 = r4.A2i()
            if (r0 == 0) goto L_0x0026
            com.whatsapp.contact.picker.ContactPickerFragment.A0G(r12, r4, r5)
            goto L_0x0026
        L_0x0102:
            java.lang.Object r7 = r10.A01
            com.whatsapp.documentpicker.DocumentPickerActivity r7 = (com.whatsapp.documentpicker.DocumentPickerActivity) r7
            r8 = 0
            android.widget.ListView r0 = r7.getListView()
            int r0 = r0.getHeaderViewsCount()
            int r13 = r13 - r0
            r6 = 1
            if (r13 < 0) goto L_0x0026
            java.util.List r0 = r7.A0S
            if (r0 == 0) goto L_0x0026
            java.lang.Object r1 = r0.get(r13)
            X.6pJ r1 = (X.C133676pJ) r1
            if (r1 == 0) goto L_0x0026
            X.02B r0 = r7.A04
            if (r0 == 0) goto L_0x0128
            com.whatsapp.documentpicker.DocumentPickerActivity.A14(r7, r1)
            goto L_0x0026
        L_0x0128:
            java.util.List r5 = r7.A0a
            r5.clear()
            r5.add(r1)
            X.11C r4 = r7.A08
            android.content.res.Resources r3 = r7.getResources()
            r2 = 2131755256(0x7f1000f8, float:1.9141386E38)
            int r1 = r5.size()
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.C108985cd.A1S(r5, r0, r8)
            java.lang.String r0 = r3.getQuantityString(r2, r1, r0)
            X.AnonymousClass1Y5.A00(r7, r4, r0)
            X.02H r0 = r7.A0Z
            X.02B r0 = r7.COJ(r0)
            r7.A04 = r0
            X.5fD r0 = r7.A0G
            if (r0 != 0) goto L_0x0159
            X.AnonymousClass3MW.A1B()
            goto L_0x0163
        L_0x0159:
            r0.notifyDataSetChanged()
            goto L_0x0026
        L_0x015e:
            r0 = 0
            return r0
        L_0x0160:
            X.C18070vi.A11(r1)
        L_0x0163:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass79M.onItemLongClick(android.widget.AdapterView, android.view.View, int, long):boolean");
    }
}
