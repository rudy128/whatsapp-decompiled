package X;

import android.net.Uri;
import com.whatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.7SO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7SO implements C22821Di {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ ContactPickerFragment A01;
    public final /* synthetic */ C140036zq A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009f A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r29) {
        /*
            r28 = this;
            r0 = r28
            com.whatsapp.contact.picker.ContactPickerFragment r15 = r0.A01
            X.6zq r5 = r0.A02
            java.lang.String r9 = r0.A03
            android.net.Uri r14 = r0.A00
            boolean r8 = r0.A04
            boolean r0 = X.AnonymousClass000.A1Y(r29)
            r26 = 0
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "handledeeplink/network-unavailable"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 2131889437(0x7f120d1d, float:1.9413538E38)
        L_0x001c:
            com.whatsapp.contact.picker.ContactPickerFragment.A0f(r15, r0)
            return r26
        L_0x0020:
            java.lang.String r7 = r5.A05
            boolean r13 = X.AnonymousClass1EG.A0H(r7)
            if (r13 == 0) goto L_0x0079
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x0032
            X.C108955ca.A1M(r15)
            return r26
        L_0x0032:
            if (r9 == 0) goto L_0x0079
            java.util.List r0 = r14.getPathSegments()
            boolean r0 = r0.isEmpty()
            r3 = 0
            if (r0 == 0) goto L_0x0067
            r1 = 0
        L_0x0040:
            java.lang.String r0 = "ais"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0079
            X.2qw r0 = X.C42711yc.A01
            X.1yc r25 = r0.A01(r9)
            if (r25 == 0) goto L_0x0070
            com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel r2 = r15.A0x
            X.1OX r1 = X.C41561wd.A00(r2)
            com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel$validateBot$1 r0 = new com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel$validateBot$1
            r22 = r0
            r23 = r14
            r24 = r2
            r27 = r3
            r22.<init>(r23, r24, r25, r26, r27)
            X.AnonymousClass3MX.A1Q(r0, r1)
            return r26
        L_0x0067:
            java.util.List r0 = r14.getPathSegments()
            java.lang.String r1 = X.C17880vN.A0w(r0, r3)
            goto L_0x0040
        L_0x0070:
            java.lang.String r0 = "lookupFbidBotDeeplink/null bot jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 2131889436(0x7f120d1c, float:1.9413536E38)
            goto L_0x001c
        L_0x0079:
            java.lang.String r3 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r2 = r9.replaceAll(r3, r0)
            int r1 = r2.length()
            r10 = 1
            r6 = 0
            r12 = 5
            if (r1 >= r12) goto L_0x00a2
            java.lang.String r0 = "contactpicker/converttointlformat/too-short-no-cc"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.7Bn r3 = r15.A0r
            r1 = 2131889447(0x7f120d27, float:1.9413558E38)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r6] = r9
        L_0x0098:
            r3.BhU(r0, r6, r1)
        L_0x009b:
            r20 = r26
        L_0x009d:
            if (r13 == 0) goto L_0x01aa
            if (r20 != 0) goto L_0x01aa
            return r26
        L_0x00a2:
            java.lang.String r1 = "^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r4 = r1.matcher(r2)
            boolean r1 = r4.find()
            if (r1 == 0) goto L_0x009b
            java.lang.String r4 = r4.group(r10)
            int r1 = r4.length()
            java.lang.String r2 = r2.substring(r1)
            X.1LA r1 = r15.A0K
            int r1 = X.C63942tw.A01(r1, r4, r2)
            if (r1 != r10) goto L_0x00f1
            int r9 = java.lang.Integer.parseInt(r4)
            X.1LA r1 = r15.A0K     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r0 = r2.replaceAll(r3, r0)     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r2 = r1.A03(r9, r0)     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00e3
        L_0x00d5:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "contactpicker/converttointlformat/trim/error "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r9)
            com.whatsapp.util.Log.w(r0, r3)
        L_0x00e3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "+"
            X.C17890vO.A10(r0, r4, r2, r1)
            java.lang.String r20 = r1.toString()
            goto L_0x009d
        L_0x00f1:
            java.lang.String r3 = " cc="
            r11 = 3
            if (r1 == r11) goto L_0x018d
            r0 = 4
            r2 = 2
            if (r1 == r0) goto L_0x015d
            if (r1 == r12) goto L_0x015d
            r0 = 6
            if (r1 == r0) goto L_0x0133
            r0 = 7
            if (r1 != r0) goto L_0x009b
            java.lang.String r12 = X.AnonymousClass1K3.A00(r4)
            if (r12 != 0) goto L_0x012a
            r12 = 0
        L_0x0109:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "contactpicker/converttointlformat/invalid-length/"
            r1.append(r0)
            r1.append(r9)
            X.C17900vP.A0g(r3, r4, r1)
            X.7Bn r3 = r15.A0r
            r1 = 2131889441(0x7f120d21, float:1.9413546E38)
            if (r12 == 0) goto L_0x0187
            r1 = 2131889440(0x7f120d20, float:1.9413544E38)
        L_0x0122:
            java.lang.Object[] r0 = X.C108945cZ.A1a(r9, r4, r11, r10)
            r0[r2] = r12
            goto L_0x0098
        L_0x012a:
            X.1K3 r1 = r15.A1s
            X.0vb r0 = r15.A19
            java.lang.String r12 = r1.A03(r0, r12)
            goto L_0x0109
        L_0x0133:
            java.lang.String r12 = X.AnonymousClass1K3.A00(r4)
            if (r12 != 0) goto L_0x0154
            r12 = 0
        L_0x013a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "contactpicker/converttointlformat/too-long/"
            r1.append(r0)
            r1.append(r9)
            X.C17900vP.A0g(r3, r4, r1)
            X.7Bn r3 = r15.A0r
            r1 = 2131889445(0x7f120d25, float:1.9413554E38)
            if (r12 == 0) goto L_0x0187
            r1 = 2131889444(0x7f120d24, float:1.9413552E38)
            goto L_0x0122
        L_0x0154:
            X.1K3 r1 = r15.A1s
            X.0vb r0 = r15.A19
            java.lang.String r12 = r1.A03(r0, r12)
            goto L_0x013a
        L_0x015d:
            java.lang.String r12 = X.AnonymousClass1K3.A00(r4)
            if (r12 != 0) goto L_0x017e
            r12 = 0
        L_0x0164:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "contactpicker/converttointlformat/too-short/"
            r1.append(r0)
            r1.append(r9)
            X.C17900vP.A0g(r3, r4, r1)
            X.7Bn r3 = r15.A0r
            r1 = 2131889448(0x7f120d28, float:1.941356E38)
            if (r12 == 0) goto L_0x0187
            r1 = 2131889446(0x7f120d26, float:1.9413556E38)
            goto L_0x0122
        L_0x017e:
            X.1K3 r1 = r15.A1s
            X.0vb r0 = r15.A19
            java.lang.String r12 = r1.A03(r0, r12)
            goto L_0x0164
        L_0x0187:
            java.lang.Object[] r0 = X.C108945cZ.A1a(r9, r4, r2, r10)
            goto L_0x0098
        L_0x018d:
            X.7Bn r2 = r15.A0r
            r1 = 2131889442(0x7f120d22, float:1.9413548E38)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r6] = r9
            r2.BhU(r0, r6, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "contactpicker/converttointlformat/invalid-cc/"
            r1.append(r0)
            r1.append(r9)
            X.C17900vP.A0g(r3, r4, r1)
            goto L_0x009b
        L_0x01aa:
            java.lang.String r5 = r5.A06
            X.00H r0 = r15.A2d
            X.1OZ r18 = X.C17880vN.A0U(r0)
            X.00H r4 = r15.A27
            java.lang.String r3 = r15.A2w
            X.31f r2 = r15.A0z
            java.lang.String r1 = r15.A2x
            X.4Xd r0 = r15.A1D
            X.6MR r13 = new X.6MR
            r19 = r4
            r21 = r7
            r22 = r5
            r23 = r3
            r24 = r1
            r25 = r8
            r16 = r2
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r15.A0t = r13
            X.10I r0 = r15.A1y
            X.AnonymousClass3MW.A1T(r13, r0, r6)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7SO.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ AnonymousClass7SO(Uri uri, ContactPickerFragment contactPickerFragment, C140036zq r3, String str, boolean z) {
        this.A01 = contactPickerFragment;
        this.A02 = r3;
        this.A03 = str;
        this.A00 = uri;
        this.A04 = z;
    }
}
