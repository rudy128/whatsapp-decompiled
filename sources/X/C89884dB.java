package X;

import android.view.View;

/* renamed from: X.4dB  reason: invalid class name and case insensitive filesystem */
public class C89884dB implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C89884dB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C89884dB(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x026d, code lost:
        if (r0 == false) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0311, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x039f, code lost:
        r2.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03ed, code lost:
        r4.A05(r3, r2, X.C17880vN.A0h(), (X.AnonymousClass1OS) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x048f, code lost:
        if (((X.C88504Zz) r2.A1r.get()).A04(X.C22941Dw.A02(X.C72453Mb.A0u(r2))) == false) goto L_0x04c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0491, code lost:
        r3 = (X.AnonymousClass4QV) r2.A1q.get();
        r4 = r2.getSupportFragmentManager();
        r1 = (X.C88504Zz) r2.A1r.get();
        r0 = X.C22941Dw.A02(X.C72453Mb.A0u(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04ad, code lost:
        if (r0 == null) goto L_0x04c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04af, code lost:
        r0 = X.C88504Zz.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04b3, code lost:
        if (r0 == null) goto L_0x04c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04b5, code lost:
        r5 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04b7, code lost:
        r3.A00(r4, r5, r2.A0z, new X.C95544mP(r2, 2), r8, r9, X.AnonymousClass00R.A0N, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04c5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04c6, code lost:
        r5 = X.AnonymousClass4DN.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04c9, code lost:
        r8.Bkp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04cc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0526, code lost:
        r4.startActivityForResult(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0529, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x053b, code lost:
        r3.startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x053e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bc, code lost:
        r0 = "waIntents";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0101, code lost:
        r0 = "passcodeManager";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r1.A09(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0216, code lost:
        r2.CMk(r1, "SharePhoneNumberBottomSheet");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x021b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x05fb;
                case 1: goto L_0x02d6;
                case 2: goto L_0x02b2;
                case 3: goto L_0x05d7;
                case 4: goto L_0x02a1;
                case 5: goto L_0x023c;
                case 6: goto L_0x05c3;
                case 7: goto L_0x0232;
                case 8: goto L_0x05a7;
                case 9: goto L_0x0574;
                case 10: goto L_0x021c;
                case 11: goto L_0x0559;
                case 12: goto L_0x054f;
                case 13: goto L_0x053f;
                case 14: goto L_0x01fc;
                case 15: goto L_0x01ea;
                case 16: goto L_0x052a;
                case 17: goto L_0x0513;
                case 18: goto L_0x0509;
                case 19: goto L_0x04fa;
                case 20: goto L_0x04e1;
                case 21: goto L_0x04cd;
                case 22: goto L_0x046f;
                case 23: goto L_0x044a;
                case 24: goto L_0x0434;
                case 25: goto L_0x0427;
                case 26: goto L_0x041a;
                case 27: goto L_0x03f6;
                case 28: goto L_0x03c9;
                case 29: goto L_0x03c1;
                case 30: goto L_0x03b8;
                case 31: goto L_0x03a3;
                case 32: goto L_0x019e;
                case 33: goto L_0x0163;
                case 34: goto L_0x0145;
                case 35: goto L_0x0127;
                case 36: goto L_0x038e;
                case 37: goto L_0x037d;
                case 38: goto L_0x010a;
                case 39: goto L_0x0375;
                case 40: goto L_0x036d;
                case 41: goto L_0x00c0;
                case 42: goto L_0x007b;
                case 43: goto L_0x003d;
                case 44: goto L_0x0005;
                case 45: goto L_0x0005;
                case 46: goto L_0x0367;
                case 47: goto L_0x035f;
                case 48: goto L_0x0005;
                case 49: goto L_0x000e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r12.A01
            X.CtN r1 = (X.C26155CtN) r1
        L_0x0009:
            r0 = 3
            r1.A09(r0)
        L_0x000d:
            return
        L_0x000e:
            java.lang.Object r5 = r12.A01
            com.whatsapp.chatlock.ChatLockSettingsActivity r5 = (com.whatsapp.chatlock.ChatLockSettingsActivity) r5
            r4 = 0
            X.00H r0 = r5.A05
            if (r0 == 0) goto L_0x00bc
            r0.get()
            r3 = 1
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entrypoint"
            r2.putExtra(r0, r3)
            r5.startActivityForResult(r2, r4)
            X.00H r0 = r5.A03
            if (r0 == 0) goto L_0x0077
            X.4VV r1 = X.AnonymousClass3MX.A0a(r0)
            r0 = 3
            r1.A00(r0)
            return
        L_0x003d:
            java.lang.Object r3 = r12.A01
            com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity r3 = (com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity) r3
            X.00H r0 = r3.A01
            if (r0 == 0) goto L_0x0077
            X.4VV r2 = X.AnonymousClass3MX.A0a(r0)
            java.lang.Integer r1 = X.C17880vN.A0k()
            java.lang.Integer r0 = X.C17880vN.A0h()
            r2.A05(r1, r0)
            X.1fA r4 = r3.A02
            if (r4 == 0) goto L_0x0073
            r0 = 6
            X.4sV r3 = X.C99244sV.A00(r3, r0)
            X.00H r0 = r4.A0D
            java.lang.Object r0 = r0.get()
            X.1RK r0 = (X.AnonymousClass1RK) r0
            X.Af0 r2 = r0.A04()
            r1 = 0
            X.4qs r0 = new X.4qs
            r0.<init>(r4, r3, r1)
            r2.A09(r0)
            return
        L_0x0073:
            java.lang.String r0 = "chatLockManager"
            goto L_0x030d
        L_0x0077:
            java.lang.String r0 = "chatLockLogger"
            goto L_0x030d
        L_0x007b:
            java.lang.Object r4 = r12.A01
            com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity r4 = (com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity) r4
            X.00H r0 = r4.A05
            if (r0 == 0) goto L_0x0101
            java.lang.Object r1 = r0.get()
            com.whatsapp.chatlock.passcode.ChatLockPasscodeManager r1 = (com.whatsapp.chatlock.passcode.ChatLockPasscodeManager) r1
            java.lang.String r0 = r4.A4d()
            X.4EG r1 = r1.A02(r0)
            boolean r0 = r1 instanceof X.C76923oo
            if (r0 == 0) goto L_0x0312
            X.00H r0 = r4.A02
            if (r0 == 0) goto L_0x00bc
            r0.get()
            java.lang.String r3 = r4.A4d()
            int r2 = r4.A00
            android.content.Intent r5 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.chatlock.ChatLockConfirmSecretCodeActivity"
            r5.setClassName(r1, r0)
            java.lang.String r0 = "extra_secret_code"
            r5.putExtra(r0, r3)
            java.lang.String r0 = "entrypoint"
            r5.putExtra(r0, r2)
            r0 = 1
            goto L_0x0526
        L_0x00bc:
            java.lang.String r0 = "waIntents"
            goto L_0x030d
        L_0x00c0:
            java.lang.Object r3 = r12.A01
            com.whatsapp.chatlock.ChatLockConfirmSecretCodeActivity r3 = (com.whatsapp.chatlock.ChatLockConfirmSecretCodeActivity) r3
            java.lang.String r0 = r3.A03
            java.lang.String r2 = "correctSecretCode"
            if (r0 == 0) goto L_0x0105
            int r1 = r0.length()
            X.00H r0 = r3.A05
            if (r0 == 0) goto L_0x0101
            java.lang.Object r6 = r0.get()
            com.whatsapp.chatlock.passcode.ChatLockPasscodeManager r6 = (com.whatsapp.chatlock.passcode.ChatLockPasscodeManager) r6
            if (r1 <= 0) goto L_0x0352
            java.lang.String r5 = r3.A03
            if (r5 == 0) goto L_0x0105
            java.lang.String r1 = r3.A4d()
            r0 = 4
            X.4sV r4 = X.C99244sV.A00(r3, r0)
            java.lang.String r0 = "ChatLockPasscodeManager/setPasscode"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L_0x0344
            java.lang.String r0 = "ChatLockPasscodeManager/setPasscode: Passcodes don't match"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 3
            X.3om r0 = new X.3om
            r0.<init>(r1)
            r4.invoke(r0)
            return
        L_0x0101:
            java.lang.String r0 = "passcodeManager"
            goto L_0x030d
        L_0x0105:
            X.C18070vi.A11(r2)
            goto L_0x0310
        L_0x010a:
            java.lang.Object r1 = r12.A01
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r1 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r1
            com.whatsapp.pnh.RequestPhoneNumberViewModel r0 = r1.A0Z
            if (r0 == 0) goto L_0x000d
            X.4VP r2 = r1.A0Y
            if (r2 == 0) goto L_0x000d
            X.1E7 r0 = r1.A0O
            if (r0 == 0) goto L_0x000d
            X.1BI r1 = r0.A0J
            boolean r0 = r1 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x000d
            X.1E2 r1 = (X.AnonymousClass1E2) r1
            r0 = 2
            r2.A02(r1, r0)
            return
        L_0x0127:
            java.lang.Object r1 = r12.A01
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r1 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r1
            X.A0Q r2 = r1.A0V
            if (r2 == 0) goto L_0x000d
            X.1E7 r0 = r1.A0O
            if (r0 == 0) goto L_0x000d
            X.1BI r0 = r0.A0J
            com.whatsapp.jid.UserJid r3 = X.C22941Dw.A00(r0)
            int r7 = r1.A00
            r9 = 1
            r8 = -1
            r4 = 0
            java.lang.String r6 = "contact_card"
            r5 = r4
            r2.A01(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0145:
            java.lang.Object r2 = r12.A01
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r2 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r2
            X.1E7 r0 = r2.A0O
            if (r0 == 0) goto L_0x000d
            android.os.Bundle r0 = X.C17880vN.A0D()
            com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment r1 = new com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment
            r1.<init>()
            r1.A1R(r0)
            android.app.Activity r0 = X.C72453Mb.A0L(r2)
            X.1FU r0 = (X.AnonymousClass1FU) r0
            r0.CMl(r1)
            return
        L_0x0163:
            java.lang.Object r6 = r12.A01
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r6 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r6
            X.3zj r1 = r6.A0Q
            r5 = 1
            if (r1 == 0) goto L_0x0172
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.A09 = r0
        L_0x0172:
            X.1E7 r0 = r6.A0O
            if (r0 == 0) goto L_0x000d
            X.1L9 r4 = r6.A0E
            android.content.Context r3 = r6.getContext()
            X.1LU r2 = r6.A0R
            android.content.Context r1 = r6.getContext()
            X.1E7 r0 = r6.A0O
            X.1BI r0 = X.AnonymousClass1E7.A00(r0)
            android.content.Intent r1 = X.AnonymousClass3MY.A06(r1, r2, r0)
            java.lang.String r0 = "args_conversation_screen_entry_point"
            android.content.Intent r1 = r1.putExtra(r0, r5)
            java.lang.String r0 = "extra_show_search_on_create"
            android.content.Intent r1 = r1.putExtra(r0, r5)
            java.lang.String r0 = "ContactInfo"
            r4.A0B(r3, r1, r0)
            return
        L_0x019e:
            java.lang.Object r6 = r12.A01
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r6 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r6
            X.1E7 r0 = r6.A0O
            if (r0 == 0) goto L_0x000d
            X.4YE r1 = r6.A0a
            r0 = 6
            r1.A02(r0)
            X.1E7 r0 = r6.A0O
            X.1BI r5 = X.AnonymousClass1E7.A00(r0)
            X.0ve r0 = r6.A0P
            boolean r3 = X.C87484Vt.A01(r0)
            X.1LU r2 = r6.A0R
            android.content.Context r1 = r6.getContext()
            r0 = 0
            if (r3 == 0) goto L_0x01c3
            r0 = 33
        L_0x01c3:
            android.content.Intent r4 = r2.A1w(r1, r5, r0)
            if (r5 == 0) goto L_0x01d7
            X.1fA r0 = r6.A0M
            boolean r0 = r0.A0M(r5)
            if (r0 == 0) goto L_0x01d7
            java.lang.String r1 = "chatlockEntryPoint"
            r0 = 4
            r4.putExtra(r1, r0)
        L_0x01d7:
            X.1L9 r3 = r6.A0E
            android.content.Context r2 = r6.getContext()
            java.lang.String r1 = "args_conversation_screen_entry_point"
            r0 = 1
            android.content.Intent r1 = r4.putExtra(r1, r0)
            java.lang.String r0 = "ContactInfo"
            r3.A0B(r2, r1, r0)
            return
        L_0x01ea:
            java.lang.Object r2 = r12.A01
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            X.1E7 r0 = r2.A0z
            if (r0 == 0) goto L_0x000d
            X.1BI r1 = r0.A0J
            if (r1 == 0) goto L_0x000d
            r0 = 7
            com.whatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet r1 = X.AnonymousClass4G6.A00(r1, r0)
            goto L_0x0216
        L_0x01fc:
            java.lang.Object r2 = r12.A01
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            X.1E8 r0 = X.AnonymousClass3MY.A0P(r2)
            if (r0 == 0) goto L_0x000d
            java.lang.String r1 = X.AnonymousClass17K.A02(r0)
            if (r1 == 0) goto L_0x000d
            X.1E7 r0 = r2.A0z
            boolean r0 = r0.A0C()
            com.whatsapp.chatinfo.view.custom.PhoneNumberSharedBottomSheet r1 = X.AnonymousClass4G5.A00(r1, r0)
        L_0x0216:
            java.lang.String r0 = "SharePhoneNumberBottomSheet"
            r2.CMk(r1, r0)
            return
        L_0x021c:
            java.lang.Object r1 = r12.A01
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r1 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r1
            r0 = 1
            r1.A26(r0)
            X.1FL r1 = r1.A1D()
            boolean r0 = r1 instanceof X.B7J
            if (r0 == 0) goto L_0x000d
            X.B7J r1 = (X.B7J) r1
            r1.Bo1()
            return
        L_0x0232:
            java.lang.Object r1 = r12.A01
            X.CtN r1 = (X.C26155CtN) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            goto L_0x0009
        L_0x023c:
            java.lang.Object r4 = r12.A01
            X.8A5 r4 = (X.AnonymousClass8A5) r4
            X.7DY r4 = (X.AnonymousClass7DY) r4
            X.11C r0 = r4.A1B
            X.AnonymousClass4a5.A03(r0)
            boolean r0 = r4.A0t()
            if (r0 != 0) goto L_0x000d
            X.8Av r0 = r4.A0K
            java.lang.String r3 = "camera"
            if (r0 == 0) goto L_0x029d
            java.lang.String r2 = r0.getFlashMode()
            int r1 = r2.hashCode()
            r0 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 == r0) goto L_0x0282
            r0 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 != r0) goto L_0x026f
            java.lang.String r0 = "auto"
            boolean r0 = r2.equals(r0)
            r2 = 20
        L_0x026d:
            if (r0 != 0) goto L_0x0271
        L_0x026f:
            r2 = 21
        L_0x0271:
            X.A4v r1 = r4.A1L
            int r0 = X.AnonymousClass7DY.A01(r4)
            X.C72463Mc.A1F(r1, r2, r0)
            X.741 r1 = r4.A0M
            if (r1 != 0) goto L_0x028b
            java.lang.String r0 = "cameraActionsController"
            goto L_0x030d
        L_0x0282:
            java.lang.String r0 = "off"
            boolean r0 = r2.equals(r0)
            r2 = 22
            goto L_0x026d
        L_0x028b:
            X.8Av r0 = r4.A0K
            if (r0 == 0) goto L_0x029d
            java.lang.String r0 = r0.BkM()
            X.C18070vi.A0X(r0)
            r1.A0A(r0)
            X.AnonymousClass7DY.A0H(r4)
            return
        L_0x029d:
            X.C18070vi.A11(r3)
            goto L_0x0310
        L_0x02a1:
            java.lang.Object r1 = r12.A01
            X.741 r1 = (X.AnonymousClass741) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            boolean r0 = r1.A0B
            if (r0 != 0) goto L_0x000d
            r0 = 1
            X.AnonymousClass741.A04(r1, r0)
            return
        L_0x02b2:
            java.lang.Object r3 = r12.A01
            X.8A5 r3 = (X.AnonymousClass8A5) r3
            X.7DY r3 = (X.AnonymousClass7DY) r3
            X.A4v r2 = r3.A1L
            int r1 = X.AnonymousClass7DY.A01(r3)
            r0 = 12
            X.C72463Mc.A1F(r2, r0, r1)
            X.11C r0 = r3.A1B
            X.AnonymousClass4a5.A03(r0)
            boolean r0 = r3.A0t()
            if (r0 != 0) goto L_0x000d
            X.1FU r0 = r3.A0H
            if (r0 == 0) goto L_0x000d
            r0.onBackPressed()
            return
        L_0x02d6:
            java.lang.Object r4 = r12.A01
            X.8A5 r4 = (X.AnonymousClass8A5) r4
            X.7DY r4 = (X.AnonymousClass7DY) r4
            boolean r0 = r4.A0t()
            if (r0 != 0) goto L_0x000d
            boolean r0 = X.AnonymousClass7DY.A0g(r4)
            if (r0 == 0) goto L_0x02f7
            X.00H r0 = r4.A1R
            java.lang.Object r3 = r0.get()
            X.1Po r3 = (X.C25771Po) r3
            r2 = 0
            r1 = 33
            r0 = 1
            X.AnonymousClass3MY.A1P(r2, r3, r1, r0)
        L_0x02f7:
            X.A4v r2 = r4.A1L
            int r1 = X.AnonymousClass7DY.A01(r4)
            r0 = 26
            X.C72463Mc.A1F(r2, r0, r1)
            X.11C r0 = r4.A1B
            X.AnonymousClass4a5.A03(r0)
            X.701 r2 = r4.A0P
            if (r2 != 0) goto L_0x0607
            java.lang.String r0 = "cameraBottomSheetController"
        L_0x030d:
            X.C18070vi.A11(r0)
        L_0x0310:
            r0 = 0
            throw r0
        L_0x0312:
            boolean r0 = r1 instanceof X.C76903om
            if (r0 == 0) goto L_0x0335
            com.google.android.material.textfield.TextInputLayout r3 = r4.A4b()
            X.3om r1 = (X.C76903om) r1
            int r2 = r1.A00
            r0 = 5
            r1 = 2131889100(0x7f120bcc, float:1.9412854E38)
            if (r2 == r0) goto L_0x032d
            r0 = 6
            r1 = 2131889099(0x7f120bcb, float:1.9412852E38)
            if (r2 == r0) goto L_0x032d
            r1 = 2131889098(0x7f120bca, float:1.941285E38)
        L_0x032d:
            java.lang.String r0 = r4.getString(r1)
            r3.setError(r0)
            return
        L_0x0335:
            com.google.android.material.textfield.TextInputLayout r1 = r4.A4b()
            r0 = 2131889098(0x7f120bca, float:1.941285E38)
            java.lang.String r0 = r4.getString(r0)
            r1.setError(r0)
            return
        L_0x0344:
            X.1OX r3 = r6.A07
            X.0wl r2 = r6.A06
            r1 = 0
            com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$setPasscode$1 r0 = new com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$setPasscode$1
            r0.<init>(r6, r5, r1, r4)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x0352:
            java.lang.String r1 = r3.A4d()
            r0 = 4
            X.4sV r0 = X.C99244sV.A00(r3, r0)
            r6.A04(r1, r0)
            return
        L_0x035f:
            java.lang.Object r0 = r12.A01
            com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity r0 = (com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity) r0
            com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity.A03(r0)
            return
        L_0x0367:
            java.lang.Object r0 = r12.A01
            X.AnonymousClass3MW.A1U(r0)
            return
        L_0x036d:
            java.lang.Object r0 = r12.A01
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard r0 = (com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard) r0
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard.setSearchClickListener$lambda$0(r0, r13)
            return
        L_0x0375:
            java.lang.Object r0 = r12.A01
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard r0 = (com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard) r0
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard.setupMVEducationIfNeeded$lambda$3(r0, r13)
            return
        L_0x037d:
            java.lang.Object r2 = r12.A01
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r2 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r2
            X.00H r0 = r2.A0d
            X.C72453Mb.A1P(r0)
            X.4YE r1 = r2.A0a
            r0 = 7
            r1.A02(r0)
            r0 = 1
            goto L_0x039f
        L_0x038e:
            java.lang.Object r2 = r12.A01
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r2 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r2
            X.00H r0 = r2.A0d
            X.C72453Mb.A1P(r0)
            X.4YE r1 = r2.A0a
            r0 = 8
            r1.A02(r0)
            r0 = 0
        L_0x039f:
            r2.A04(r0)
            return
        L_0x03a3:
            java.lang.Object r1 = r12.A01
            com.whatsapp.chatinfo.ListChatInfoActivity r1 = (com.whatsapp.chatinfo.ListChatInfoActivity) r1
            X.00H r0 = r1.A0X
            java.lang.Object r4 = r0.get()
            X.1rO r4 = (X.C38501rO) r4
            X.1GP r3 = r1.getSupportFragmentManager()
            X.2Jo r2 = r1.A4l()
            goto L_0x03ed
        L_0x03b8:
            java.lang.Object r1 = r12.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x03c1:
            java.lang.Object r0 = r12.A01
            com.whatsapp.chatinfo.ListChatInfoActivity r0 = (com.whatsapp.chatinfo.ListChatInfoActivity) r0
            com.whatsapp.chatinfo.ListChatInfoActivity.A0y(r0)
            return
        L_0x03c9:
            java.lang.Object r1 = r12.A01
            com.whatsapp.chatinfo.ContactInfoActivity r1 = (com.whatsapp.chatinfo.ContactInfoActivity) r1
            boolean r0 = X.C72473Md.A1U(r1)
            if (r0 == 0) goto L_0x03dd
            X.1KB r2 = r1.A05
            r1 = 2131897280(0x7f122bc0, float:1.9429445E38)
            r0 = 0
            r2.A08(r1, r0)
            return
        L_0x03dd:
            X.00H r0 = r1.A1z
            java.lang.Object r4 = r0.get()
            X.1rO r4 = (X.C38501rO) r4
            X.1GP r3 = r1.getSupportFragmentManager()
            com.whatsapp.jid.UserJid r2 = r1.A4l()
        L_0x03ed:
            java.lang.Integer r1 = X.C17880vN.A0h()
            r0 = 0
            r4.A05(r3, r2, r1, r0)
            return
        L_0x03f6:
            java.lang.Object r3 = r12.A01
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            X.0ve r2 = r3.A0E
            r1 = 9944(0x26d8, float:1.3935E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            X.0zA r0 = r3.A08
            r0.A03()
            if (r1 == 0) goto L_0x0414
            com.whatsapp.inappsupport.ui.nux.SupportAIEmbodimentBottomSheet r0 = new com.whatsapp.inappsupport.ui.nux.SupportAIEmbodimentBottomSheet
            r0.<init>()
        L_0x0410:
            r3.CMl(r0)
            return
        L_0x0414:
            com.whatsapp.inappsupport.ui.AboutAiSupportAssistantBottomSheet r0 = new com.whatsapp.inappsupport.ui.AboutAiSupportAssistantBottomSheet
            r0.<init>()
            goto L_0x0410
        L_0x041a:
            java.lang.Object r2 = r12.A01
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            r0 = 5
            X.4mP r8 = new X.4mP
            r8.<init>(r2, r0)
            java.lang.Integer r9 = X.AnonymousClass00R.A08
            goto L_0x047b
        L_0x0427:
            java.lang.Object r2 = r12.A01
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            r0 = 3
            X.4mP r8 = new X.4mP
            r8.<init>(r2, r0)
            java.lang.Integer r9 = X.AnonymousClass00R.A05
            goto L_0x047b
        L_0x0434:
            java.lang.Object r2 = r12.A01
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            android.content.Context r1 = r2.getApplicationContext()
            com.whatsapp.jid.UserJid r0 = r2.A4l()
            android.content.Intent r1 = X.AnonymousClass1LU.A0t(r1, r0)
            r0 = 12
            r2.startActivityForResult(r1, r0)
            return
        L_0x044a:
            java.lang.Object r6 = r12.A01
            com.whatsapp.chatinfo.ContactInfoActivity r6 = (com.whatsapp.chatinfo.ContactInfoActivity) r6
            com.whatsapp.jid.UserJid r5 = r6.A4l()
            long r1 = r6.A00
            android.content.Intent r4 = X.C17880vN.A0A()
            java.lang.String r3 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversation.conversationrow.message.KeptMessagesActivity"
            r4.setClassName(r3, r0)
            java.lang.String r0 = "jid"
            X.AnonymousClass3MY.A13(r4, r5, r0)
            java.lang.String r0 = "keptMessageCount"
            r4.putExtra(r0, r1)
            r6.startActivity(r4)
            return
        L_0x046f:
            java.lang.Object r2 = r12.A01
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            r0 = 4
            X.4mP r8 = new X.4mP
            r8.<init>(r2, r0)
            java.lang.Integer r9 = X.AnonymousClass00R.A07
        L_0x047b:
            X.00H r0 = r2.A1r
            java.lang.Object r1 = r0.get()
            X.4Zz r1 = (X.C88504Zz) r1
            java.lang.String r0 = X.C72453Mb.A0u(r2)
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A02(r0)
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x04c9
            X.00H r0 = r2.A1q
            java.lang.Object r3 = r0.get()
            X.4QV r3 = (X.AnonymousClass4QV) r3
            X.1GP r4 = r2.getSupportFragmentManager()
            X.00H r0 = r2.A1r
            java.lang.Object r1 = r0.get()
            X.4Zz r1 = (X.C88504Zz) r1
            java.lang.String r0 = X.C72453Mb.A0u(r2)
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A02(r0)
            if (r0 == 0) goto L_0x04c6
            X.8oR r0 = X.C88504Zz.A00(r1, r0)
            if (r0 == 0) goto L_0x04c6
            X.4DN r5 = r0.A02
        L_0x04b7:
            X.1E7 r6 = r2.A0z
            r0 = 2
            X.4mP r7 = new X.4mP
            r7.<init>(r2, r0)
            r11 = 0
            java.lang.Integer r10 = X.AnonymousClass00R.A0N
            r3.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x04c6:
            X.4DN r5 = X.AnonymousClass4DN.DEFAULT
            goto L_0x04b7
        L_0x04c9:
            r8.Bkp()
            return
        L_0x04cd:
            java.lang.Object r4 = r12.A01
            X.1FP r4 = (X.AnonymousClass1FP) r4
            android.content.Intent r5 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.bot.metaai.premium.MetaAiPremiumModelSettingActivity"
            r5.setClassName(r1, r0)
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x0526
        L_0x04e1:
            java.lang.Object r3 = r12.A01
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.bot.botmemory.MemoryActivity"
            r2.setClassName(r1, r0)
            r1 = 21
            java.lang.String r0 = "extra_entry_point"
            r2.putExtra(r0, r1)
            goto L_0x053b
        L_0x04fa:
            java.lang.Object r2 = r12.A01
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            X.00H r0 = r2.A1h
            X.1Ps r1 = X.AnonymousClass3MW.A0W(r0)
            r0 = 1
            r1.A09(r2, r0)
            return
        L_0x0509:
            java.lang.Object r0 = r12.A01
            X.3o2 r0 = (X.C76733o2) r0
            X.4SE r0 = r0.A0A
            r0.A00()
            return
        L_0x0513:
            java.lang.Object r4 = r12.A01
            X.1FP r4 = (X.AnonymousClass1FP) r4
            android.content.Intent r5 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingActivity"
            r5.setClassName(r1, r0)
            r0 = 102(0x66, float:1.43E-43)
        L_0x0526:
            r4.startActivityForResult(r5, r0)
            return
        L_0x052a:
            java.lang.Object r3 = r12.A01
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.bot.metaai.imagineme.settings.ImagineMeSettingsActivity"
            r2.setClassName(r1, r0)
        L_0x053b:
            r3.startActivity(r2)
            return
        L_0x053f:
            java.lang.Object r2 = r12.A01
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            X.00H r0 = r2.A1v
            X.1o3 r1 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r0 = "managing-ai-chats-with-third_party"
            r1.A01(r2, r0)
            return
        L_0x054f:
            java.lang.Object r2 = r12.A01
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            r1 = 0
            r0 = 2
            com.whatsapp.chatinfo.ContactInfoActivity.A1C(r2, r0, r1)
            return
        L_0x0559:
            java.lang.Object r4 = r12.A01
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            X.00H r0 = r4.A26
            X.C72453Mb.A1P(r0)
            X.3oT r2 = r4.A0k
            r1 = 3
            X.76t r0 = r4.A0X
            r2.A0W(r0, r1)
            X.1VP r3 = r4.A0c
            X.1E7 r2 = r4.A0z
            r1 = 6
            r0 = 1
            r3.CNw(r4, r2, r1, r0)
            return
        L_0x0574:
            java.lang.Object r1 = r12.A01
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r1 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r1
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment.A02(r1)
            X.0vl r0 = r1.A0P
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r4 = (com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r4
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r0 = (com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r0
            X.1DS r0 = r0.A00
            java.lang.Object r3 = r0.A06()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0595
            java.lang.String r3 = ""
        L_0x0595:
            X.0vl r0 = r1.A0L
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.AEW r1 = r1.A09
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            r4.A0T(r1, r2, r3)
            return
        L_0x05a7:
            java.lang.Object r1 = r12.A01
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r1 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r1
            X.0vl r0 = r1.A0P
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r0 = (com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r0
            X.1DS r0 = r0.A00
            java.lang.Object r0 = r0.A06()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x05bf
            java.lang.String r0 = ""
        L_0x05bf:
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment.A03(r1, r0)
            return
        L_0x05c3:
            java.lang.Object r0 = r12.A01
            X.8lW r0 = (X.AnonymousClass8lW) r0
            X.0vl r0 = r0.A09
            java.lang.Object r0 = r0.getValue()
            X.8Fq r0 = (X.C161538Fq) r0
            X.1wy r1 = r0.A03
            X.8ls r0 = X.C169548ls.A00
            r1.A0F(r0)
            return
        L_0x05d7:
            java.lang.Object r3 = r12.A01
            X.8A5 r3 = (X.AnonymousClass8A5) r3
            X.7DY r3 = (X.AnonymousClass7DY) r3
            X.6u4 r0 = r3.A15
            java.util.Set r1 = r0.A09
            int r0 = r1.size()
            r2 = 0
            if (r0 != 0) goto L_0x05f7
            X.741 r1 = r3.A0M
            if (r1 != 0) goto L_0x05f2
            java.lang.String r0 = "cameraActionsController"
            X.C18070vi.A11(r0)
            throw r2
        L_0x05f2:
            r0 = 0
            r1.A0D(r0, r0)
            return
        L_0x05f7:
            X.AnonymousClass7DY.A0U(r3, r2, r1)
            return
        L_0x05fb:
            java.lang.Object r1 = r12.A01
            X.8J6 r1 = (X.AnonymousClass8J6) r1
            android.content.Context r0 = r13.getContext()
            X.AnonymousClass8J6.A00(r0, r1)
            return
        L_0x0607:
            com.whatsapp.camera.CameraBottomSheetBehavior r1 = r2.A0C
            r0 = 3
            r1.A0W(r0)
            r0 = 1
            r1.A00 = r0
            android.view.View r1 = r2.A06
            r0 = 0
            r1.setVisibility(r0)
            r2.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89884dB.onClick(android.view.View):void");
    }
}
