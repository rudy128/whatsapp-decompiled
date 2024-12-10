package X;

import android.widget.AdapterView;

/* renamed from: X.79J  reason: invalid class name */
public class AnonymousClass79J implements AdapterView.OnItemClickListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass79J(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0219, code lost:
        if (r3.A3R != false) goto L_0x021b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView r11, android.view.View r12, int r13, long r14) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0376;
                case 1: goto L_0x02bb;
                case 2: goto L_0x0085;
                case 3: goto L_0x006e;
                case 4: goto L_0x0043;
                case 5: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r10.A01
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r3 = r11.getItemAtPosition(r13)     // Catch:{ IndexOutOfBoundsException -> 0x0376 }
            X.6ne r3 = (X.C132826ne) r3     // Catch:{ IndexOutOfBoundsException -> 0x0376 }
            goto L_0x035a
        L_0x0011:
            java.lang.Object r2 = r10.A01
            com.whatsapp.location.LiveLocationPrivacyActivity r2 = (com.whatsapp.location.LiveLocationPrivacyActivity) r2
            int r1 = r13 + -1
            if (r1 < 0) goto L_0x0376
            X.5fA r0 = r2.A08
            int r0 = r0.getCount()
            if (r1 >= r0) goto L_0x0376
            X.5fA r0 = r2.A08
            com.whatsapp.location.LiveLocationPrivacyActivity r0 = r0.A00
            java.util.List r0 = r0.A0G
            java.lang.Object r0 = r0.get(r1)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.second
            X.205 r1 = (X.AnonymousClass205) r1
            X.00H r0 = r2.A0A
            X.206 r1 = X.AnonymousClass1W2.A01(r1, r0)
            X.1LU r0 = r2.A07
            android.content.Intent r1 = r0.A21(r2, r1)
            X.1L9 r0 = r2.A01
            r0.A09(r2, r1)
            return
        L_0x0043:
            java.lang.Object r2 = r10.A01
            com.whatsapp.documentpicker.DocumentPickerActivity r2 = (com.whatsapp.documentpicker.DocumentPickerActivity) r2
            android.widget.ListView r0 = r2.getListView()
            int r0 = r0.getHeaderViewsCount()
            int r13 = r13 - r0
            if (r13 < 0) goto L_0x0376
            java.util.List r0 = r2.A0S
            if (r0 == 0) goto L_0x0376
            java.lang.Object r1 = r0.get(r13)
            X.6pJ r1 = (X.C133676pJ) r1
            if (r1 == 0) goto L_0x0376
            X.02B r0 = r2.A04
            if (r0 == 0) goto L_0x0066
            com.whatsapp.documentpicker.DocumentPickerActivity.A14(r2, r1)
            return
        L_0x0066:
            java.util.List r0 = X.C18070vi.A0M(r1)
            com.whatsapp.documentpicker.DocumentPickerActivity.A15(r2, r0)
            return
        L_0x006e:
            java.lang.Object r1 = r10.A01
            com.whatsapp.contact.picker.PhoneContactsSelector r1 = (com.whatsapp.contact.picker.PhoneContactsSelector) r1
            r0 = 2131435130(0x7f0b1e7a, float:1.8492093E38)
            android.view.View r0 = r12.findViewById(r0)
            if (r0 == 0) goto L_0x0376
            java.lang.Object r0 = r0.getTag()
            X.25N r0 = (X.AnonymousClass25N) r0
            com.whatsapp.contact.picker.PhoneContactsSelector.A10(r0, r1)
            return
        L_0x0085:
            java.lang.Object r3 = r10.A01
            com.whatsapp.contact.picker.ContactPickerFragment r3 = (com.whatsapp.contact.picker.ContactPickerFragment) r3
            android.widget.ListView r0 = r3.A0D
            android.widget.ListAdapter r2 = r0.getAdapter()
            boolean r0 = r2 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x0099
            android.widget.HeaderViewListAdapter r2 = (android.widget.HeaderViewListAdapter) r2
            android.widget.ListAdapter r2 = r2.getWrappedAdapter()
        L_0x0099:
            X.5yK r2 = (X.C116625yK) r2
            android.widget.ListView r0 = r3.A0D
            android.widget.ListAdapter r1 = r0.getAdapter()
            boolean r0 = r1 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x00ac
            android.widget.HeaderViewListAdapter r1 = (android.widget.HeaderViewListAdapter) r1
            int r0 = r1.getHeadersCount()
            int r13 = r13 - r0
        L_0x00ac:
            if (r13 < 0) goto L_0x0376
            int r0 = r2.getCount()
            if (r13 >= r0) goto L_0x0376
            java.util.List r0 = r2.A02
            java.lang.Object r6 = r0.get(r13)
            X.86p r6 = (X.C1599786p) r6
            X.1E7 r5 = r6.getContact()
            if (r5 == 0) goto L_0x0283
            boolean r4 = r6 instanceof X.AnonymousClass7EG
            if (r4 == 0) goto L_0x0104
            java.lang.Class<com.whatsapp.jid.UserJid> r8 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r5.A06(r8)
            if (r0 == 0) goto L_0x00f7
            X.0z4 r9 = r3.A18
            java.lang.String r7 = r0.getRawString()
            if (r7 == 0) goto L_0x00f7
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r9)
            java.util.HashSet r0 = X.C17880vN.A12()
            java.lang.String r2 = "contactless_jids_store"
            java.util.Set r0 = r1.getStringSet(r2, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            r1.add(r7)
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r9)
            android.content.SharedPreferences$Editor r0 = r0.putStringSet(r2, r1)
            r0.apply()
        L_0x00f7:
            com.whatsapp.jid.Jid r2 = r5.A06(r8)
            if (r2 == 0) goto L_0x0104
            X.10I r1 = r3.A1y
            r0 = 46
            X.C108955ca.A1R(r1, r3, r2, r0)
        L_0x0104:
            boolean r0 = r3.A2h()
            r7 = 1
            r2 = 0
            if (r0 == 0) goto L_0x01ff
            X.1VD r0 = X.C108965cb.A0W(r3)
            boolean r0 = r0.A01(r5, r2)
            if (r0 == 0) goto L_0x01ff
            X.1VD r0 = X.C108965cb.A0W(r3)
            com.whatsapp.reachouttimelock.ReachoutTimelockInfoBottomSheet r1 = r0.A00()
            android.content.Context r0 = r3.A1n()
            X.1FU r0 = X.AnonymousClass1FU.A00(r0)
            r0.CMl(r1)
        L_0x0129:
            boolean r0 = r3.A3O
            if (r0 == 0) goto L_0x013b
            java.util.List r0 = r3.A39
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x01f2
            X.4YE r1 = r3.A1l
            r0 = 3
        L_0x0138:
            r1.A03(r0)
        L_0x013b:
            boolean r0 = r3.A3V
            if (r0 == 0) goto L_0x0376
            boolean r0 = r5.A10
            if (r0 == 0) goto L_0x0376
            X.63R r1 = new X.63R
            r1.<init>()
            java.util.List r0 = r3.A39
            boolean r0 = r0.contains(r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
            boolean r0 = r3.A2n()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            boolean r0 = r5.A0F()
            r6 = 3
            if (r0 == 0) goto L_0x01e4
            java.lang.Integer r0 = X.C17880vN.A0i()
        L_0x0169:
            r1.A02 = r0
            java.util.List r0 = r3.A36
            if (r0 == 0) goto L_0x01d5
            java.util.Iterator r4 = r0.iterator()
        L_0x0173:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r0 = r4.next()
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            java.lang.Object r0 = r0.second
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0173
            X.0ve r4 = r3.A1U
            X.C18070vi.A0d(r4, r2)
            r0 = 9906(0x26b2, float:1.3881E-41)
            X.0vf r8 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r8, r4, r0)
            if (r0 == 0) goto L_0x01ca
            r2 = 4
        L_0x0199:
            X.00H r0 = r3.A2o
            java.lang.Object r6 = r0.get()
            X.1pq r6 = (X.C37611pq) r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r2 = 0
            r0 = 88
            r6.A02(r5, r4, r0, r2)
            X.0ve r2 = r3.A1U
            r0 = 8726(0x2216, float:1.2228E-41)
            boolean r0 = X.C18020vd.A05(r8, r2, r0)
            if (r0 == 0) goto L_0x01bc
            int r13 = r13 - r7
            java.lang.Long r0 = X.C17880vN.A0n(r13)
            r1.A05 = r0
        L_0x01bc:
            r1.A03 = r4
        L_0x01be:
            java.lang.Integer r0 = X.C17880vN.A0k()
            r1.A04 = r0
            X.18K r0 = r3.A1W
            r0.CC7(r1)
            return
        L_0x01ca:
            r0 = 7746(0x1e42, float:1.0854E-41)
            int r0 = X.C18020vd.A00(r8, r4, r0)
            r2 = 1
            if (r0 != r7) goto L_0x0199
            r2 = 0
            goto L_0x0199
        L_0x01d5:
            java.util.List r0 = r3.A37
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x01be
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1.A03 = r0
            goto L_0x01be
        L_0x01e4:
            if (r4 == 0) goto L_0x01ec
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            goto L_0x0169
        L_0x01ec:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            goto L_0x0169
        L_0x01f2:
            java.util.List r0 = r3.A37
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x013b
            X.4YE r1 = r3.A1l
            r0 = 4
            goto L_0x0138
        L_0x01ff:
            X.00H r0 = r3.A24
            X.1pj r1 = X.AnonymousClass3MW.A0V(r0)
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3MZ.A0x(r5)
            boolean r0 = r1.A0P(r0)
            r8 = 0
            if (r0 == 0) goto L_0x023e
            boolean r0 = r3.A3M
            if (r0 != 0) goto L_0x021b
            boolean r0 = r3.A3R
            r6 = 2131897283(0x7f122bc3, float:1.9429451E38)
            if (r0 == 0) goto L_0x021e
        L_0x021b:
            r6 = 2131897282(0x7f122bc2, float:1.942945E38)
        L_0x021e:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.1Me r0 = r3.A0k
            X.AnonymousClass3MX.A1N(r0, r5, r1, r2)
            java.lang.String r6 = r3.A1I(r6, r1)
            X.7Cc r1 = new X.7Cc
            r1.<init>(r3, r5, r7)
            r0 = 2131887212(0x7f12046c, float:1.9409025E38)
            com.whatsapp.blocklist.UnblockDialogFragment r1 = X.C87374Vi.A01(r1, r6, r0, r2)
            X.1FL r0 = r3.A1B()
            X.AnonymousClass3MY.A1H(r1, r0, r8)
            goto L_0x0129
        L_0x023e:
            boolean r0 = r5.A10
            if (r0 == 0) goto L_0x0252
            boolean r0 = r3.A2p()
            if (r0 == 0) goto L_0x024d
            com.whatsapp.contact.picker.ContactPickerFragment.A0G(r12, r3, r5)
            goto L_0x0129
        L_0x024d:
            r3.A2R(r8, r5)
            goto L_0x0129
        L_0x0252:
            boolean r0 = r3.A3V
            if (r0 != 0) goto L_0x025e
            boolean r0 = r3.A3c
            if (r0 != 0) goto L_0x025e
            boolean r0 = r3.A3S
            if (r0 == 0) goto L_0x0277
        L_0x025e:
            boolean r0 = r6 instanceof X.C116555xy
            if (r0 == 0) goto L_0x0277
            X.5xy r6 = (X.C116555xy) r6
            java.util.List r1 = r6.A00
            int r0 = r1.size()
            if (r0 <= r7) goto L_0x0277
            X.1Me r0 = r3.A0k
            java.lang.String r0 = r0.A0I(r5)
            r3.A2e(r0, r1)
            goto L_0x0129
        L_0x0277:
            java.lang.String r0 = X.AnonymousClass17K.A02(r5)
            r0.getClass()
            com.whatsapp.contact.picker.ContactPickerFragment.A0i(r3, r0)
            goto L_0x0129
        L_0x0283:
            boolean r0 = r6 instanceof X.AnonymousClass7EI
            if (r0 == 0) goto L_0x0376
            X.0zA r1 = r3.A0I
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0299
            r1.A03()
            java.lang.String r0 = "logEntryPointTap"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0299:
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = "ad_creation_tapped"
            r0 = 1
            r2.putExtra(r1, r0)
            android.os.Bundle r1 = r3.A27()
            java.lang.String r0 = ""
            X.205 r0 = X.AnonymousClass4aU.A03(r1, r0)
            if (r0 == 0) goto L_0x02b2
            X.AnonymousClass4aU.A00(r2, r0)
        L_0x02b2:
            X.7Bn r0 = r3.A0r
            r0.A01(r2)
            r3.A2F()
            return
        L_0x02bb:
            java.lang.Object r4 = r10.A01
            X.5rQ r4 = (X.C114635rQ) r4
            java.lang.Object r0 = r12.getTag()
            boolean r0 = r0 instanceof X.C128936gv
            if (r0 == 0) goto L_0x0376
            java.lang.Object r0 = r12.getTag()
            X.6gv r0 = (X.C128936gv) r0
            com.whatsapp.jid.UserJid r3 = r0.A03
            X.00H r0 = r4.A0B
            boolean r0 = X.C72463Mc.A1U(r3, r0)
            if (r0 == 0) goto L_0x030c
            boolean r0 = r4 instanceof com.whatsapp.status.audienceselector.StatusRecipientsActivity
            if (r0 == 0) goto L_0x0303
            r2 = 2131897284(0x7f122bc4, float:1.9429453E38)
            X.1M9 r0 = r4.A05
            X.1E7 r5 = r0.A0H(r3)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            X.1Me r0 = r4.A07
            java.lang.String r0 = r0.A0I(r5)
            r3 = 0
            java.lang.String r2 = X.C17880vN.A0q(r4, r0, r1, r3, r2)
            X.7Cc r1 = new X.7Cc
            r1.<init>(r4, r5, r3)
            r0 = 2131887212(0x7f12046c, float:1.9409025E38)
            com.whatsapp.blocklist.UnblockDialogFragment r0 = X.C87374Vi.A01(r1, r2, r0, r3)
            X.C72453Mb.A1I(r0, r4)
            return
        L_0x0303:
            boolean r0 = r4 instanceof com.whatsapp.profile.ProfilePhotoBlockListPickerActivity
            if (r0 != 0) goto L_0x0376
            boolean r0 = r4 instanceof com.whatsapp.profile.PixBlockListPickerActivity
            if (r0 == 0) goto L_0x0376
            return
        L_0x030c:
            java.util.Set r1 = r4.A0S
            boolean r0 = r1.contains(r3)
            if (r0 == 0) goto L_0x0356
            r1.remove(r3)
        L_0x0317:
            java.lang.String r0 = r4.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x033c
            boolean r0 = r1.contains(r3)
            if (r0 == 0) goto L_0x033c
            X.4VZ r0 = r4.A0A
            androidx.appcompat.widget.SearchView r1 = r0.A00
            if (r1 == 0) goto L_0x033c
            r0 = 2131434969(0x7f0b1dd9, float:1.8491767E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1 = 0
            int r0 = r2.length()
            r2.setSelection(r1, r0)
        L_0x033c:
            java.util.Set r0 = r4.A0R
            r0.add(r3)
            android.os.Handler r3 = r4.A0N
            java.lang.Runnable r2 = r4.A0P
            r3.removeCallbacks(r2)
            r0 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r2, r0)
            r4.A4f()
            X.5fC r0 = r4.A0O
            r0.notifyDataSetChanged()
            return
        L_0x0356:
            r1.add(r3)
            goto L_0x0317
        L_0x035a:
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = "country_name"
            java.lang.String r0 = r3.A01
            r2.putExtra(r1, r0)
            java.lang.String r1 = "cc"
            java.lang.String r0 = r3.A00
            r2.putExtra(r1, r0)
            java.lang.String r1 = "iso"
            java.lang.String r0 = r3.A03
            r2.putExtra(r1, r0)
            X.C72453Mb.A16(r4, r2)
        L_0x0376:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass79J.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
