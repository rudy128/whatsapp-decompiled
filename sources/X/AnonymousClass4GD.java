package X;

/* renamed from: X.4GD  reason: invalid class name */
public abstract class AnonymousClass4GD {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
        if (r12.A2J() != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.app.Activity r7, X.AnonymousClass1KB r8, X.C30191dX r9, X.C37311pJ r10, X.C219217x r11, X.C19830z4 r12, X.C18030ve r13, X.AnonymousClass1LU r14, X.C37721q1 r15, int r16, int r17, int r18) {
        /*
            X.C18070vi.A0h(r13, r8)
            r0 = 3
            r5 = r15
            X.C18070vi.A0f(r15, r0, r14)
            r0 = 7
            X.C72483Me.A16(r10, r11, r9, r12, r0)
            java.lang.String r2 = "android.permission.GET_ACCOUNTS"
            int r0 = r11.A02(r2)
            if (r0 != 0) goto L_0x006d
            boolean r0 = r9.A00()
            if (r0 == 0) goto L_0x006d
        L_0x001a:
            r1 = 0
        L_0x001b:
            boolean r0 = X.AnonymousClass3MX.A1W(r13)
            r3 = r7
            if (r0 == 0) goto L_0x002e
            if (r1 == 0) goto L_0x002e
        L_0x0024:
            r1 = 2131894324(0x7f122034, float:1.942345E38)
            r0 = 2131894328(0x7f122038, float:1.9423458E38)
            X.C72453Mb.A15(r3, r1, r0)
            return
        L_0x002e:
            r1 = 913(0x391, float:1.28E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r13, r1)
            r6 = r16
            r7 = r17
            if (r0 == 0) goto L_0x007d
            android.content.Intent r4 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.contact.contactform.ContactFormActivity"
            r4.setClassName(r1, r0)
            boolean r0 = X.AnonymousClass3MX.A1W(r13)
            if (r0 == 0) goto L_0x0075
            int r0 = r11.A02(r2)
            if (r0 != 0) goto L_0x0066
            boolean r0 = r9.A00()
            if (r0 == 0) goto L_0x0066
        L_0x005b:
            X.4kQ r2 = new X.4kQ
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = r18
            r10.A01(r3, r2, r0)
            return
        L_0x0066:
            boolean r0 = r12.A2J()
            if (r0 != 0) goto L_0x005b
            goto L_0x0024
        L_0x006d:
            boolean r0 = r12.A2J()
            r1 = 1
            if (r0 == 0) goto L_0x001b
            goto L_0x001a
        L_0x0075:
            r3.startActivityForResult(r4, r6)
            r0 = 1
            r15.A06(r0, r7)
            return
        L_0x007d:
            java.lang.String r0 = "android.intent.action.INSERT"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            java.lang.String r0 = "vnd.android.cursor.dir/contact"
            r1.setType(r0)
            r3.startActivityForResult(r1, r6)     // Catch:{ ActivityNotFoundException -> 0x0091 }
            r0 = 1
            r15.A06(r0, r7)     // Catch:{ ActivityNotFoundException -> 0x0091 }
            return
        L_0x0091:
            r1 = move-exception
            java.lang.String r0 = "error opening add contact"
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 2131897310(0x7f122bde, float:1.9429506E38)
            r0 = 0
            r8.A08(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4GD.A00(android.app.Activity, X.1KB, X.1dX, X.1pJ, X.17x, X.0z4, X.0ve, X.1LU, X.1q1, int, int, int):void");
    }
}
