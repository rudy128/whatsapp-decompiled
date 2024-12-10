package X;

import android.widget.AdapterView;

/* renamed from: X.4ee  reason: invalid class name and case insensitive filesystem */
public class C90794ee implements AdapterView.OnItemClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C90794ee(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e6, code lost:
        if (r1.longValue() == 2) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onItemClick(android.widget.AdapterView r10, android.view.View r11, int r12, long r13) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0105;
                case 1: goto L_0x00b2;
                case 2: goto L_0x005b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r9.A01
            com.whatsapp.registration.EULA r3 = (com.whatsapp.registration.EULA) r3
            java.lang.Object r0 = r9.A02
            android.widget.ListView r0 = (android.widget.ListView) r0
            android.widget.ListAdapter r0 = r0.getAdapter()
            java.lang.Object r0 = r0.getItem(r12)
            X.4To r0 = (X.C86914To) r0
            java.lang.String r4 = r0.A01
            X.0vb r0 = r3.A0C
            r0.A0Q(r4)
            java.lang.String r2 = "language_selector"
            X.00H r0 = r3.A0h
            java.lang.Object r1 = r0.get()
            X.A29 r1 = (X.A29) r1
            java.lang.String r0 = "language_selected"
            r1.A03(r2, r0, r4)
            X.0z4 r0 = r3.A0A
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "is_ls_shown_during_reg"
            X.C17880vN.A1F(r1, r0, r2)
            X.4Qk r0 = r3.A0H
            X.0z4 r2 = r0.A02
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r2)
            java.lang.String r1 = "language_selector_clicked_count"
            int r0 = X.C17890vO.A00(r0, r1)
            int r0 = r0 + 1
            X.C17900vP.A0M(r2, r1, r0)
            X.4Qk r0 = r3.A0H
            r0.A00()
            boolean r0 = X.AnonymousClass112.A08()
            if (r0 == 0) goto L_0x00f6
            r3.recreate()
        L_0x005a:
            return
        L_0x005b:
            java.lang.Object r2 = r9.A01
            com.whatsapp.languageselector.LanguageSelectorBottomSheet r2 = (com.whatsapp.languageselector.LanguageSelectorBottomSheet) r2
            java.lang.Object r1 = r9.A02
            X.3Og r1 = (X.C72933Og) r1
            com.whatsapp.BottomSheetListView r0 = r2.A01
            android.widget.ListAdapter r0 = r0.getAdapter()
            java.lang.Object r0 = r0.getItem(r12)
            X.4To r0 = (X.C86914To) r0
            java.lang.String r3 = r0.A01
            boolean r0 = r1 instanceof X.AnonymousClass42U
            if (r0 == 0) goto L_0x00a8
            r0 = r1
            X.42U r0 = (X.AnonymousClass42U) r0
            r0.A00 = r12
        L_0x007a:
            r1.notifyDataSetChanged()
            X.5Y2 r4 = r2.A05
            if (r4 == 0) goto L_0x005a
            X.4o8 r4 = (X.C96614o8) r4
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x013a;
                case 1: goto L_0x014f;
                default: goto L_0x0088;
            }
        L_0x0088:
            java.lang.Object r1 = r4.A01
            com.whatsapp.settings.SettingsTabActivity r1 = (com.whatsapp.settings.SettingsTabActivity) r1
            java.lang.Object r4 = r4.A02
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            X.0vb r0 = r1.A00
            r0.A0Q(r3)
            X.00H r0 = r1.A15
            java.lang.Object r0 = r0.get()
            X.4aF r0 = (X.C88624aF) r0
            java.util.Map r0 = r0.A00
            if (r0 != 0) goto L_0x0120
            java.lang.String r0 = "allSettingsMap"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x00a8:
            boolean r0 = r1 instanceof X.AnonymousClass42T
            if (r0 == 0) goto L_0x007a
            r0 = r1
            X.42T r0 = (X.AnonymousClass42T) r0
            r0.A00 = r12
            goto L_0x007a
        L_0x00b2:
            java.lang.Object r2 = r9.A01
            X.4RQ r2 = (X.AnonymousClass4RQ) r2
            java.lang.Object r8 = r9.A02
            X.0SF r8 = (X.AnonymousClass0SF) r8
            r0 = 1
            X.C18070vi.A0d(r8, r0)
            java.util.List r0 = r2.A08
            java.lang.Object r0 = r0.get(r12)
            X.4UY r0 = (X.AnonymousClass4UY) r0
            X.4CU r1 = r0.A02
            X.4CU r0 = X.AnonymousClass4CU.OPTION
            if (r1 != r0) goto L_0x005a
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r2.A00(r1)
            X.4LD r0 = r2.A02
            if (r0 == 0) goto L_0x00f2
            com.whatsapp.conversation.ConversationEntryActionButton r7 = r0.A00
            X.3V4 r6 = r7.A04
            if (r1 == 0) goto L_0x00e8
            long r4 = r1.longValue()
            r2 = 2
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x00e9
        L_0x00e8:
            r0 = 1
        L_0x00e9:
            r6.A0U(r0)
            X.3V4 r1 = r7.A04
            r0 = 2
            r1.A0V(r0)
        L_0x00f2:
            r8.dismiss()
            return
        L_0x00f6:
            r3.finish()
            android.content.Intent r0 = r3.getIntent()
            r3.startActivity(r0)
            r0 = 0
            r3.overridePendingTransition(r0, r0)
            return
        L_0x0105:
            java.lang.Object r1 = r9.A01
            X.4RO r1 = (X.AnonymousClass4RO) r1
            java.lang.Object r2 = r9.A02
            X.0SF r2 = (X.AnonymousClass0SF) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.1Di r1 = r1.A04
            if (r1 == 0) goto L_0x011c
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r1.invoke(r0)
        L_0x011c:
            r2.dismiss()
            return
        L_0x0120:
            java.util.Iterator r2 = X.C17890vO.A0l(r0)
        L_0x0124:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0136
            java.lang.Object r1 = r2.next()
            X.5c2 r1 = (X.C108635c2) r1
            java.lang.String r0 = ""
            r1.CJs(r0)
            goto L_0x0124
        L_0x0136:
            r4.A29()
            return
        L_0x013a:
            java.lang.Object r2 = r4.A01
            X.1FP r2 = (X.AnonymousClass1FP) r2
            java.lang.Object r1 = r4.A02
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.0vb r0 = r2.A00
            r0.A0Q(r3)
            r1.A29()
            return
        L_0x014f:
            java.lang.Object r0 = r4.A01
            X.6LF r0 = (X.AnonymousClass6LF) r0
            java.lang.Object r1 = r0.A01
            com.whatsapp.registration.EULA r1 = (com.whatsapp.registration.EULA) r1
            X.0vb r0 = r1.A0C
            r0.A0Q(r3)
            java.lang.String r2 = "eula_screen"
            X.00H r0 = r1.A0h
            java.lang.Object r1 = r0.get()
            X.A29 r1 = (X.A29) r1
            java.lang.String r0 = "language_selected"
            r1.A03(r2, r0, r3)
            java.lang.Object r0 = r4.A02
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A29()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90794ee.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
