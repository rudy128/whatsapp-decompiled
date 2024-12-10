package X;

import android.content.DialogInterface;

/* renamed from: X.4aw  reason: invalid class name and case insensitive filesystem */
public class C88854aw implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C88854aw(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.whatsapp.contact.picker.PhoneNumberSelectionDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.whatsapp.registration.SelectPhoneNumberDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.whatsapp.contact.picker.PhoneNumberSelectionDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.whatsapp.contact.picker.PhoneNumberSelectionDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: com.whatsapp.contact.picker.PhoneNumberSelectionDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: com.whatsapp.contact.picker.PhoneNumberSelectionDialog} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (r3.isChecked() == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ac, code lost:
        if (r5.A0J.getActivityUtils().A0D(X.C94604kt.A00(r5), r3, 41) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ae, code lost:
        X.AnonymousClass3MW.A0m(r5.A0y).A06(r4, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0152, code lost:
        r2.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0155, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01a7, code lost:
        r1.A0U(r0);
        r4.A0D.CGF(new X.AnonymousClass7RL(r4, r3, 47));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01b6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r14, int r15) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x01b7;
                case 1: goto L_0x019c;
                case 2: goto L_0x018f;
                case 3: goto L_0x0156;
                case 4: goto L_0x0135;
                case 5: goto L_0x00b9;
                case 6: goto L_0x006a;
                case 7: goto L_0x0054;
                case 8: goto L_0x00db;
                case 9: goto L_0x0018;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r13.A01
            X.10I r4 = (X.AnonymousClass10I) r4
            java.lang.Object r3 = r13.A02
            java.lang.Object r2 = r13.A03
            r1 = 39
            X.7RD r0 = new X.7RD
            r0.<init>(r3, r2, r1)
            r4.CGF(r0)
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r5 = r13.A01
            com.whatsapp.settings.SettingsContactsDeleteDialogFragment r5 = (com.whatsapp.settings.SettingsContactsDeleteDialogFragment) r5
            java.lang.Object r4 = r13.A02
            X.4cX r4 = (X.C89484cX) r4
            java.lang.Object r3 = r13.A03
            android.widget.CheckBox r3 = (android.widget.CheckBox) r3
            android.app.Activity r6 = r5.A00
            boolean r0 = r6 instanceof com.whatsapp.settings.SettingsContactsActivity
            if (r0 == 0) goto L_0x0017
            com.whatsapp.settings.SettingsContactsActivity r6 = (com.whatsapp.settings.SettingsContactsActivity) r6
            if (r6 == 0) goto L_0x0017
            boolean r9 = r4.A02
            boolean r10 = r4.A04
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x003d
            boolean r0 = r3.isChecked()
            r11 = 0
            if (r0 != 0) goto L_0x003e
        L_0x003d:
            r11 = 1
        L_0x003e:
            X.0ve r2 = r5.A02
            r1 = 12767(0x31df, float:1.789E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r12 = X.C18020vd.A05(r0, r2, r1)
            r8 = 2131893360(0x7f121c70, float:1.9421494E38)
            X.5VU r7 = new X.5VU
            r7.<init>(r3, r4, r5)
            r6.A4b(r7, r8, r9, r10, r11, r12)
            return
        L_0x0054:
            java.lang.Object r5 = r13.A01
            X.4kt r5 = (X.C94604kt) r5
            java.lang.Object r2 = r13.A02
            X.73C r2 = (X.AnonymousClass73C) r2
            java.lang.Object r1 = r13.A03
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            X.1FY r0 = X.C94604kt.A00(r5)
            r4 = 0
            android.content.Intent r3 = X.AnonymousClass700.A00(r0, r1, r2, r4)
            goto L_0x009c
        L_0x006a:
            java.lang.Object r5 = r13.A01
            X.4kt r5 = (X.C94604kt) r5
            java.lang.Object r6 = r13.A02
            X.73C r6 = (X.AnonymousClass73C) r6
            java.lang.Object r1 = r13.A03
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            X.00H r0 = r5.A0x
            X.0vd r0 = X.C17880vN.A0P(r0)
            boolean r0 = X.AnonymousClass3MX.A1W(r0)
            if (r0 == 0) goto L_0x0093
            X.1pJ r3 = r5.A0F
            X.1FY r2 = X.C94604kt.A00(r5)
            r0 = 1
            X.4kN r1 = new X.4kN
            r1.<init>(r6, r5, r0)
            r0 = 4
            r3.A01(r2, r1, r0)
            return
        L_0x0093:
            X.1FY r0 = X.C94604kt.A00(r5)
            r4 = 1
            android.content.Intent r3 = X.AnonymousClass700.A00(r0, r1, r6, r4)
        L_0x009c:
            X.5c6 r0 = r5.A0J
            X.1L9 r2 = r0.getActivityUtils()
            X.1FY r1 = X.C94604kt.A00(r5)
            r0 = 41
            boolean r0 = r2.A0D(r1, r3, r0)
            if (r0 == 0) goto L_0x0017
            X.00H r0 = r5.A0y
            X.1q1 r1 = X.AnonymousClass3MW.A0m(r0)
            r0 = 6
            r1.A06(r4, r0)
            return
        L_0x00b9:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.Object r3 = r13.A02
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r13.A03
            X.1BI r2 = (X.AnonymousClass1BI) r2
            X.1FL r1 = r0.A1B()
            boolean r0 = r1 instanceof X.C23241Fg
            if (r0 == 0) goto L_0x0017
            X.1Fg r1 = (X.C23241Fg) r1
            java.lang.Object r0 = r3.get(r15)
            X.4XI r0 = (X.AnonymousClass4XI) r0
            int r0 = r0.A00
            r1.Bpu(r2, r0)
            return
        L_0x00db:
            java.lang.Object r3 = r13.A01
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r1 = r13.A02
            X.3Oe r1 = (X.AnonymousClass3Oe) r1
            java.lang.Object r2 = r13.A03
            com.whatsapp.registration.SelectPhoneNumberDialog r2 = (com.whatsapp.registration.SelectPhoneNumberDialog) r2
            r5 = 1
            X.C18070vi.A0d(r1, r5)
            java.lang.String r0 = "SelectPhoneNumberDialog/use-clicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r1.A00
            java.lang.Object r4 = r3.get(r0)
            X.4cN r4 = (X.C89384cN) r4
            X.5YK r3 = r2.A01
            if (r3 == 0) goto L_0x0152
            com.whatsapp.registration.phonenumberentry.RegisterPhone r3 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r3
            X.9gO r1 = r3.A1B
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.A02 = r0
            java.lang.String r0 = r4.A00
            r3.A0v = r0
            java.lang.String r1 = r4.A02
            r3.A0w = r1
            X.9gv r0 = r3.A0L
            android.widget.EditText r0 = r0.A03
            r0.setText(r1)
            X.9gv r0 = r3.A0L
            android.widget.EditText r1 = r0.A02
            java.lang.String r0 = r3.A0v
            r1.setText(r0)
            X.9gv r0 = r3.A0L
            android.widget.EditText r1 = r0.A03
            android.text.Editable r0 = r1.getText()
            java.lang.String r0 = X.C17900vP.A08(r0)
            X.C17960vV.A07(r0)
            int r0 = r0.length()
            r1.setSelection(r0)
            goto L_0x0152
        L_0x0135:
            java.lang.Object r2 = r13.A01
            com.whatsapp.contact.picker.PhoneNumberSelectionDialog r2 = (com.whatsapp.contact.picker.PhoneNumberSelectionDialog) r2
            java.lang.Object r3 = r13.A02
            java.util.AbstractList r3 = (java.util.AbstractList) r3
            java.lang.Object r0 = r13.A03
            X.3Oc r0 = (X.AnonymousClass3Oc) r0
            X.1Fr r1 = r2.A00
            if (r1 == 0) goto L_0x0152
            int r0 = r0.A00
            java.lang.Object r0 = r3.get(r0)
            X.4cK r0 = (X.C89354cK) r0
            java.lang.String r0 = r0.A00
            r1.BzM(r0)
        L_0x0152:
            r2.A28()
            return
        L_0x0156:
            java.lang.Object r5 = r13.A01
            X.3vd r5 = (X.AnonymousClass3vd) r5
            java.lang.Object r6 = r13.A02
            X.206 r6 = (X.AnonymousClass206) r6
            java.lang.Object r7 = r13.A03
            android.content.Context r7 = (android.content.Context) r7
            r0 = 3
            X.C18070vi.A0d(r14, r0)
            long r3 = X.AnonymousClass25A.A02(r6)
            long r1 = X.AnonymousClass25A.A03(r6)
            X.1LU r5 = r5.A01
            X.205 r6 = r6.A0v
            X.1BI r0 = r6.A00
            android.content.Intent r5 = X.AnonymousClass3MY.A06(r7, r5, r0)
            X.C18070vi.A0X(r5)
            java.lang.String r0 = "row_id"
            r5.putExtra(r0, r3)
            java.lang.String r0 = "sort_id"
            r5.putExtra(r0, r1)
            X.AnonymousClass4aU.A00(r5, r6)
            r7.startActivity(r5)
            r14.dismiss()
            return
        L_0x018f:
            java.lang.Object r4 = r13.A01
            com.whatsapp.community.CommunityExitDialogFragment r4 = (com.whatsapp.community.CommunityExitDialogFragment) r4
            java.lang.Object r1 = r13.A02
            X.8GM r1 = (X.AnonymousClass8GM) r1
            java.lang.Object r3 = r13.A03
            boolean r0 = r4.A0G
            goto L_0x01a7
        L_0x019c:
            java.lang.Object r4 = r13.A01
            com.whatsapp.community.CommunityExitDialogFragment r4 = (com.whatsapp.community.CommunityExitDialogFragment) r4
            java.lang.Object r1 = r13.A02
            X.8GM r1 = (X.AnonymousClass8GM) r1
            java.lang.Object r3 = r13.A03
            r0 = 1
        L_0x01a7:
            r1.A0U(r0)
            X.10I r2 = r4.A0D
            r1 = 47
            X.7RL r0 = new X.7RL
            r0.<init>(r4, r3, r1)
            r2.CGF(r0)
            return
        L_0x01b7:
            java.lang.Object r0 = r13.A01
            X.4jc r0 = (X.C93834jc) r0
            java.lang.Object r4 = r13.A02
            X.1FY r4 = (X.AnonymousClass1FY) r4
            java.lang.Object r3 = r13.A03
            X.4jX r3 = (X.C93784jX) r3
            X.1fA r2 = r0.A01
            X.3oa r1 = X.C76883oa.A00
            r0 = 5
            r2.A0A(r4, r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88854aw.onClick(android.content.DialogInterface, int):void");
    }
}
