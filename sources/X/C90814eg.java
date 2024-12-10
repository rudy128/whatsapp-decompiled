package X;

import android.widget.AdapterView;

/* renamed from: X.4eg  reason: invalid class name and case insensitive filesystem */
public class C90814eg implements AdapterView.OnItemClickListener {
    public final int A00;
    public final Object A01;

    public C90814eg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AdapterView adapterView, Object obj, int i) {
        adapterView.setOnItemClickListener(new C90814eg(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.3Os} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: X.3Oe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: X.3Os} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: X.3Os} */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fb, code lost:
        r7.showContextMenu();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012b, code lost:
        r1.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012e, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onItemClick(android.widget.AdapterView r6, android.view.View r7, int r8, long r9) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x00ff;
                case 1: goto L_0x00eb;
                case 2: goto L_0x00be;
                case 3: goto L_0x00a6;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0085;
                case 7: goto L_0x0070;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r5.A01
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            java.lang.Object r0 = r7.getTag()
            X.4FH r0 = (X.AnonymousClass4FH) r0
            X.5Zw r1 = r0.A00
            boolean r0 = r1 instanceof X.C96234nW
            if (r0 == 0) goto L_0x003a
            X.4nW r1 = (X.C96234nW) r1
            X.1E7 r4 = r1.A00
            X.3VF r2 = r3.A18
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r4.A06(r1)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r2.A0U(r0)
            if (r0 == 0) goto L_0x0036
            com.whatsapp.jid.Jid r0 = r4.A06(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r0 = 2
            com.whatsapp.group.GroupChatInfoActivity.A1K(r3, r1, r0)
        L_0x0035:
            return
        L_0x0036:
            r3.A0v = r4
            goto L_0x00fb
        L_0x003a:
            boolean r0 = r1 instanceof X.C96224nV
            if (r0 == 0) goto L_0x0043
            r0 = 0
            com.whatsapp.group.GroupChatInfoActivity.A1L(r3, r0)
            return
        L_0x0043:
            boolean r0 = r1 instanceof X.C96214nU
            if (r0 == 0) goto L_0x0035
            X.3oH r1 = r3.A0W
            r0 = 4
            r1.setImportantForAccessibility(r0)
            X.1jj r2 = X.AnonymousClass3Ma.A0H(r3)
            com.whatsapp.group.GroupParticipantsSearchFragment r1 = new com.whatsapp.group.GroupParticipantsSearchFragment
            r1.<init>()
            r0 = 2131434873(0x7f0b1d79, float:1.8491572E38)
            r2.A09(r1, r0)
            X.3oH r0 = r3.A0W
            r1.A01 = r0
            r0 = 1
            r1.A00 = r0
            r0 = 0
            r1.A09 = r0
            r1.A0B = r0
            r0 = 0
            r2.A0H(r0)
            r2.A01()
            return
        L_0x0070:
            java.lang.Object r1 = r5.A01
            X.3Oe r1 = (X.AnonymousClass3Oe) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.String r0 = "SelectPhoneNumberDialog/phone-number-selected"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r1.A00
            if (r0 == r8) goto L_0x0035
            r1.A00 = r8
            goto L_0x012b
        L_0x0085:
            java.lang.Object r3 = r5.A01
            com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageActivity r3 = (com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageActivity) r3
            X.0vl r0 = r3.A07
            java.lang.Object r0 = r0.getValue()
            android.widget.ListView r0 = (android.widget.ListView) r0
            int r0 = r0.getHeaderViewsCount()
            int r8 = r8 - r0
            if (r8 < 0) goto L_0x0035
            X.1pm r2 = X.AnonymousClass3MZ.A0H(r3)
            r1 = 0
            com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageActivity$setUpListView$1$1 r0 = new com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageActivity$setUpListView$1$1
            r0.<init>(r3, r1, r8)
            X.AnonymousClass3MX.A1Q(r0, r2)
            return
        L_0x00a6:
            java.lang.Object r2 = r5.A01
            com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity r2 = (com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity) r2
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            java.lang.Object r1 = r6.getItemAtPosition(r8)
            boolean r0 = r1 instanceof X.AnonymousClass7EH
            if (r0 == 0) goto L_0x0035
            X.7EH r1 = (X.AnonymousClass7EH) r1
            if (r1 == 0) goto L_0x0035
            r2.A4b(r1)
            return
        L_0x00be:
            java.lang.Object r4 = r5.A01
            X.3gf r4 = (X.AnonymousClass3gf) r4
            r0 = 2131435130(0x7f0b1e7a, float:1.8492093E38)
            android.view.View r0 = r7.findViewById(r0)
            if (r0 == 0) goto L_0x0035
            java.lang.Object r3 = r0.getTag()
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            boolean r0 = r4 instanceof com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker
            if (r0 == 0) goto L_0x012f
            r2 = r4
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker r2 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker) r2
            X.00H r0 = r2.A0G
            java.lang.Object r1 = r0.get()
            X.1VD r1 = (X.AnonymousClass1VD) r1
            r0 = 0
            boolean r0 = r1.A01(r3, r0)
            if (r0 == 0) goto L_0x012f
            X.C74803cp.A0x(r2)
            return
        L_0x00eb:
            java.lang.Object r1 = r5.A01
            com.whatsapp.chatinfo.ListChatInfoActivity r1 = (com.whatsapp.chatinfo.ListChatInfoActivity) r1
            java.lang.Object r0 = r7.getTag()
            X.4Nn r0 = (X.C85474Nn) r0
            X.1E7 r0 = r0.A03
            if (r0 == 0) goto L_0x0035
            r1.A0J = r0
        L_0x00fb:
            r7.showContextMenu()
            return
        L_0x00ff:
            java.lang.Object r3 = r5.A01
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            r4 = 1
            int r8 = r8 - r4
            if (r8 < 0) goto L_0x0035
            X.3Os r0 = r3.A0h
            int r0 = r0.getCount()
            if (r8 >= r0) goto L_0x0035
            X.3Os r2 = r3.A0h
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x013d
            java.util.List r0 = r2.A02
            int r1 = X.C72463Mc.A0C(r0)
            int r0 = r2.A00
            if (r1 <= r0) goto L_0x013d
            int r0 = r2.A01
            if (r8 != r0) goto L_0x013d
            X.3Os r1 = r3.A0h
            boolean r0 = r1.A03
            if (r0 == r4) goto L_0x0035
            r1.A03 = r4
        L_0x012b:
            r1.notifyDataSetChanged()
            return
        L_0x012f:
            boolean r0 = r4.A5C(r3)
            if (r0 == 0) goto L_0x0139
            r4.A51(r3)
            return
        L_0x0139:
            r4.BEb(r3)
            return
        L_0x013d:
            X.3Os r0 = r3.A0h
            java.util.List r0 = r0.A02
            if (r0 != 0) goto L_0x0155
            r0 = 0
        L_0x0144:
            X.1L9 r2 = r3.A01
            X.1LU r1 = new X.1LU
            r1.<init>()
            X.1BI r0 = r0.A0J
            android.content.Intent r0 = X.AnonymousClass3MY.A06(r3, r1, r0)
            r2.A09(r3, r0)
            return
        L_0x0155:
            java.lang.Object r0 = r0.get(r8)
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            goto L_0x0144
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90814eg.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
