package X;

import android.view.View;

/* renamed from: X.4dN  reason: invalid class name and case insensitive filesystem */
public class C90004dN implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C90004dN(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new C90004dN(obj, obj2, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v55, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX WARNING: type inference failed for: r0v102, types: [com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment, com.whatsapp.companiondevice.Hilt_LinkedDevicesDetailDialogFragment] */
    /* JADX WARNING: type inference failed for: r0v110, types: [com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment, com.whatsapp.companiondevice.Hilt_LinkedDevicesDetailDialogFragment] */
    /* JADX WARNING: type inference failed for: r0v143, types: [com.whatsapp.chatlock.dialogs.ChatLockPrivacySettingsUnlockClearDialog, com.whatsapp.chatlock.dialogs.Hilt_ChatLockPrivacySettingsUnlockClearDialog, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: type inference failed for: r0v217, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x039f, code lost:
        if (X.AnonymousClass3MX.A0i(r5.A07).A00(r5.A02.A0H(r5.A05)) != false) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03a6, code lost:
        r3.CMl(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x045d, code lost:
        r0.A04 = r2;
        r3.A08 = r0;
        r0.A00 = r3;
        X.C72453Mb.A1I(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0466, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04a2, code lost:
        r5.A08(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04a5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04c5, code lost:
        r2.putExtra(r1, r0);
        r4.A04.A2R(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x073c, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0740, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x074d, code lost:
        r1.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0750, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014f, code lost:
        if (r1 != 10) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0258, code lost:
        r0.invoke(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x025b, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0243;
                case 1: goto L_0x024e;
                case 2: goto L_0x025c;
                case 3: goto L_0x02ad;
                case 4: goto L_0x02e4;
                case 5: goto L_0x0018;
                case 6: goto L_0x004c;
                case 7: goto L_0x004c;
                case 8: goto L_0x02fb;
                case 9: goto L_0x0322;
                case 10: goto L_0x0339;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x0345;
                case 15: goto L_0x0370;
                case 16: goto L_0x03aa;
                case 17: goto L_0x03cc;
                case 18: goto L_0x00b5;
                case 19: goto L_0x03e3;
                case 20: goto L_0x03ef;
                case 21: goto L_0x0400;
                case 22: goto L_0x0416;
                case 23: goto L_0x00d3;
                case 24: goto L_0x0467;
                case 25: goto L_0x0467;
                case 26: goto L_0x047c;
                case 27: goto L_0x048a;
                case 28: goto L_0x04a6;
                case 29: goto L_0x04b6;
                case 30: goto L_0x04ce;
                case 31: goto L_0x0503;
                case 32: goto L_0x053d;
                case 33: goto L_0x0568;
                case 34: goto L_0x058d;
                case 35: goto L_0x00ee;
                case 36: goto L_0x059b;
                case 37: goto L_0x0100;
                case 38: goto L_0x05d4;
                case 39: goto L_0x05e2;
                case 40: goto L_0x0110;
                case 41: goto L_0x060f;
                case 42: goto L_0x0621;
                case 43: goto L_0x062d;
                case 44: goto L_0x06a6;
                case 45: goto L_0x0621;
                case 46: goto L_0x06bf;
                case 47: goto L_0x0741;
                case 48: goto L_0x01e9;
                case 49: goto L_0x021f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r12.A01
            X.1gf r2 = (X.C32111gf) r2
            java.lang.Object r1 = r12.A02
            android.view.View r1 = (android.view.View) r1
            java.util.List r0 = X.C42011xT.A0I
            android.content.Context r1 = r1.getContext()
            r0 = 2
            r2.CNu(r1, r0, r0)
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r1 = r12.A01
            com.whatsapp.community.CommunityAddMembersBottomSheet r1 = (com.whatsapp.community.CommunityAddMembersBottomSheet) r1
            java.lang.Object r4 = r12.A02
            X.1EC r4 = (X.AnonymousClass1EC) r4
            android.content.Context r0 = r1.A1n()
            android.app.Activity r3 = X.AnonymousClass1L9.A00(r0)
            boolean r0 = r3 instanceof X.AnonymousClass01E
            if (r0 == 0) goto L_0x0017
            X.1FL r3 = (X.AnonymousClass1FL) r3
            if (r3 == 0) goto L_0x0017
            X.1GP r2 = X.AnonymousClass3MX.A0O(r3)
            X.0vl r0 = r1.A0G
            X.1EC r5 = X.AnonymousClass3MX.A0p(r0)
            r0 = 13
            X.5Af r7 = new X.5Af
            r7.<init>(r1, r0)
            r9 = 1
            X.0wS r6 = X.C18460wS.A00
            X.5Vw r8 = X.C106445Vw.A00
            r10 = 6
            r11 = r9
            X.C83744Gm.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x004c:
            java.lang.Object r1 = r12.A01
            X.5XB r1 = (X.AnonymousClass5XB) r1
            java.lang.Object r6 = r12.A02
            X.A2B r6 = (X.A2B) r6
            java.util.List r0 = X.C42011xT.A0I
            X.4jm r1 = (X.C93934jm) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x008e
            java.lang.Object r4 = r1.A01
            com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity r4 = (com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity) r4
            boolean r0 = r4.Bed()
            if (r0 != 0) goto L_0x0017
            X.02n r3 = r4.A0B
            X.00H r0 = r4.A09
            if (r0 == 0) goto L_0x0737
            r0.get()
            com.whatsapp.jid.GroupJid r2 = r6.A02
            X.0vl r0 = r4.A0E
            boolean r1 = X.C72453Mb.A1a(r0)
            r0 = 9
            if (r1 == 0) goto L_0x007d
            r0 = 8
        L_0x007d:
            android.content.Intent r2 = X.AnonymousClass1LU.A0o(r4, r2, r0)
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "setting_values"
            r2.putExtra(r0, r1)
            r3.A03(r2)
            return
        L_0x008e:
            java.lang.Object r5 = r1.A01
            com.whatsapp.community.ManageGroupsInCommunityActivity r5 = (com.whatsapp.community.ManageGroupsInCommunityActivity) r5
            boolean r0 = r5.Bed()
            if (r0 != 0) goto L_0x0017
            X.3p1 r1 = r5.A0A
            r0 = 22
            X.4rk r4 = new X.4rk
            r4.<init>(r6, r1, r0)
            java.lang.String r3 = r6.A06
            X.2hM r2 = r5.A08
            X.1M9 r1 = r5.A0D
            com.whatsapp.jid.GroupJid r0 = r6.A02
            X.1E7 r0 = r1.A0E(r0)
            X.A4i r0 = r2.A00(r5, r0, r4, r3)
            r0.A02()
            return
        L_0x00b5:
            java.lang.Object r2 = r12.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r12.A02
            X.3PW r1 = (X.AnonymousClass3PW) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            boolean r0 = r2 instanceof X.AnonymousClass1FL
            if (r0 == 0) goto L_0x0017
            X.00H r0 = r1.getContextualHelpHandler()
            X.1o3 r1 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r0 = "events"
            X.1FL r2 = (X.AnonymousClass1FL) r2
            goto L_0x074d
        L_0x00d3:
            java.lang.Object r0 = r12.A01
            X.7EL r0 = (X.AnonymousClass7EL) r0
            java.lang.Object r2 = r12.A02
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            android.app.Activity r1 = r0.A04
            X.2lf r0 = r2.A0H
            if (r0 == 0) goto L_0x0017
            X.1LU r0 = new X.1LU
            r0.<init>()
            android.content.Intent r0 = r0.A1u(r1, r2)
            r1.startActivity(r0)
            return
        L_0x00ee:
            java.lang.Object r2 = r12.A01
            X.5kd r2 = (X.C111915kd) r2
            java.lang.Object r1 = r12.A02
            X.25N r1 = (X.AnonymousClass25N) r1
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0017
            com.whatsapp.contact.picker.PhoneContactsSelector r0 = r2.A00
            com.whatsapp.contact.picker.PhoneContactsSelector.A10(r1, r0)
            return
        L_0x0100:
            java.lang.Object r0 = r12.A01
            com.whatsapp.contact.picker.dialogs.StatusMentionsPosterNuxDialog r0 = (com.whatsapp.contact.picker.dialogs.StatusMentionsPosterNuxDialog) r0
            java.lang.Object r1 = r12.A02
            android.view.View r1 = (android.view.View) r1
            android.view.View$OnClickListener r0 = r0.A00
            if (r0 == 0) goto L_0x0017
            r0.onClick(r1)
            return
        L_0x0110:
            java.lang.Object r5 = r12.A01
            X.3rW r5 = (X.AnonymousClass3rW) r5
            java.lang.Object r9 = r12.A02
            android.app.Activity r9 = (android.app.Activity) r9
            boolean r0 = r5.A0M
            if (r0 != 0) goto L_0x01e6
            r1 = 2131436426(0x7f0b238a, float:1.8494722E38)
            X.01E r0 = r5.A0U
            android.view.View r1 = r0.findViewById(r1)
            X.4ZR r0 = r5.A0Y
            android.os.Bundle r8 = X.AnonymousClass4ZR.A00(r9, r1, r0)
        L_0x012b:
            X.1E7 r0 = r5.A0H
            com.whatsapp.jid.Jid r3 = X.C72453Mb.A0m(r0)
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            android.content.Intent r2 = r9.getIntent()
            java.lang.String r1 = "mat_entry_point"
            r0 = 0
            int r1 = r2.getIntExtra(r1, r0)
            X.0ve r7 = r5.A0d
            r0 = 5431(0x1537, float:7.61E-42)
            X.0vf r6 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r6, r7, r0)
            r4 = 2
            if (r0 == 0) goto L_0x0151
            r0 = 10
            r10 = 26
            if (r1 == r0) goto L_0x0152
        L_0x0151:
            r10 = 2
        L_0x0152:
            X.1E7 r0 = r5.A0H
            X.1yf r0 = r0.A0G
            if (r0 == 0) goto L_0x0172
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0172
            r0 = 11082(0x2b4a, float:1.5529E-41)
            boolean r0 = X.C18020vd.A05(r6, r7, r0)
            if (r0 == 0) goto L_0x0172
            X.10I r2 = r5.A0g
            r1 = 27
            X.7Pi r0 = new X.7Pi
            r0.<init>(r5, r3, r1)
            r2.CGF(r0)
        L_0x0172:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            boolean r0 = r5.A0M
            r1 = r0 ^ 1
            boolean r0 = X.AnonymousClass3rW.A08(r5)
            if (r0 != 0) goto L_0x018e
            boolean r0 = X.C84104Hw.A00(r7)
            if (r0 == 0) goto L_0x01e4
            X.1E7 r0 = r5.A0H
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x01e4
        L_0x018e:
            r0 = 1
        L_0x018f:
            android.content.Intent r3 = X.AnonymousClass1LU.A1D(r9, r3, r2, r1, r0)
            boolean r0 = X.AnonymousClass3MX.A1W(r7)
            if (r0 == 0) goto L_0x01e0
            X.1pJ r2 = r5.A0D
            r1 = 1
            X.4kO r0 = new X.4kO
            r0.<init>(r9, r3, r8, r1)
            r2.A01(r9, r0, r4)
        L_0x01a4:
            X.4aI r4 = r5.A0b
            if (r4 == 0) goto L_0x01b5
            X.1BI r0 = r5.A0f
            com.whatsapp.jid.UserJid r3 = X.C22941Dw.A00(r0)
            r2 = 0
            r1 = 11
            r0 = 1
            X.C88654aI.A03(r4, r3, r2, r1, r0)
        L_0x01b5:
            java.lang.String r0 = r5.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0017
            X.1E7 r0 = r5.A0H
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0017
            r0 = 9568(0x2560, float:1.3408E-41)
            boolean r0 = X.C18020vd.A05(r6, r7, r0)
            if (r0 == 0) goto L_0x0017
            X.00H r0 = r5.A05
            java.lang.Object r2 = r0.get()
            X.A4F r2 = (X.A4F) r2
            X.1BI r0 = r5.A0f
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A00(r0)
            r0 = 4
            X.A4F.A01(r2, r1, r0)
            return
        L_0x01e0:
            r9.startActivity(r3, r8)
            goto L_0x01a4
        L_0x01e4:
            r0 = 0
            goto L_0x018f
        L_0x01e6:
            r8 = 0
            goto L_0x012b
        L_0x01e9:
            java.lang.Object r5 = r12.A01
            X.3s0 r5 = (X.AnonymousClass3s0) r5
            java.lang.Object r1 = r12.A02
            android.view.View r1 = (android.view.View) r1
            r4 = 1
            X.9Bw r0 = r5.A08
            if (r0 == 0) goto L_0x020f
            com.whatsapp.jid.GroupJid r0 = r0.A0C
            r5.A0A(r0)
            X.1VP r3 = r5.A0F
            X.9Bw r2 = r5.A08
            if (r2 == 0) goto L_0x0017
            android.content.Context r1 = r1.getContext()
            int r0 = r5.A00
            r3.BhC(r1, r2, r0, r4)
        L_0x020a:
            r0 = 9
            r5.A00 = r0
            return
        L_0x020f:
            X.2mw r3 = r5.A07
            if (r3 == 0) goto L_0x020a
            X.1VP r2 = r5.A0F
            android.content.Context r1 = r1.getContext()
            int r0 = r5.A00
            r2.CO2(r1, r3, r0)
            goto L_0x020a
        L_0x021f:
            java.lang.Object r5 = r12.A01
            X.3s0 r5 = (X.AnonymousClass3s0) r5
            java.lang.Object r1 = r12.A02
            android.view.View r1 = (android.view.View) r1
            r4 = 0
            X.9Bw r0 = r5.A08
            if (r0 == 0) goto L_0x0241
            com.whatsapp.jid.GroupJid r0 = r0.A0C
        L_0x022e:
            r5.A0A(r0)
            X.1VP r3 = r5.A0F
            X.9Bw r2 = r5.A08
            if (r2 == 0) goto L_0x0017
            android.content.Context r1 = r1.getContext()
            int r0 = r5.A00
            r3.BhC(r1, r2, r0, r4)
            return
        L_0x0241:
            r0 = 0
            goto L_0x022e
        L_0x0243:
            java.lang.Object r1 = r12.A01
            X.8lj r1 = (X.C169488lj) r1
            java.lang.Object r2 = r12.A02
            java.util.List r0 = X.C42011xT.A0I
            X.1Di r0 = r1.A02
            goto L_0x0258
        L_0x024e:
            java.lang.Object r1 = r12.A01
            X.8lg r1 = (X.C169458lg) r1
            java.lang.Object r2 = r12.A02
            java.util.List r0 = X.C42011xT.A0I
            X.1Di r0 = r1.A03
        L_0x0258:
            r0.invoke(r2)
            return
        L_0x025c:
            java.lang.Object r4 = r12.A01
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            java.lang.Object r5 = r12.A02
            X.4Wp r5 = (X.AnonymousClass4Wp) r5
            X.00H r0 = r4.A26
            X.C72453Mb.A1P(r0)
            X.3oT r2 = r4.A0k
            r1 = 2
            X.76t r0 = r4.A0X
            r2.A0W(r0, r1)
            X.1E7 r3 = r5.A00
            if (r3 == 0) goto L_0x027f
            X.1VP r2 = r4.A0c
            r1 = 6
            X.1VQ r2 = (X.AnonymousClass1VQ) r2
            r0 = 0
            r2.CNw(r4, r3, r1, r0)
            return
        L_0x027f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "tel:"
            r1.append(r0)
            java.lang.String r0 = r5.A02
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r2 = "android.intent.action.DIAL"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r1)
            r4.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x029d }
            return
        L_0x029d:
            r1 = move-exception
            java.lang.String r0 = "contact_info/dial dialer app not found"
            com.whatsapp.util.Log.w(r0, r1)
            X.1KB r2 = r4.A05
            r1 = 2131897878(0x7f122e16, float:1.9430658E38)
            r0 = 0
            r2.A08(r1, r0)
            return
        L_0x02ad:
            java.lang.Object r3 = r12.A01
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            java.lang.Object r2 = r12.A02
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.3zj r1 = r3.A16
            if (r1 == 0) goto L_0x02bf
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A00 = r0
        L_0x02bf:
            X.5jJ r0 = r3.A1P
            if (r0 == 0) goto L_0x02d6
            X.6yE r0 = r0.A0T(r2)
            if (r0 == 0) goto L_0x02d6
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x02d6
            com.whatsapp.chatinfo.ViewPhotoOrStatusDialogFragment r0 = new com.whatsapp.chatinfo.ViewPhotoOrStatusDialogFragment
            r0.<init>()
            goto L_0x03a6
        L_0x02d6:
            boolean r0 = X.C72453Mb.A1V(r3)
            if (r0 == 0) goto L_0x02e0
            com.whatsapp.chatinfo.ContactInfoActivity.A11(r3)
            return
        L_0x02e0:
            com.whatsapp.chatinfo.ContactInfoActivity.A13(r3)
            return
        L_0x02e4:
            java.lang.Object r2 = r12.A01
            X.1FU r2 = (X.AnonymousClass1FU) r2
            java.lang.Object r1 = r12.A02
            android.content.DialogInterface$OnClickListener r1 = (android.content.DialogInterface.OnClickListener) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.chatlock.dialogs.ChatLockPrivacySettingsUnlockClearDialog r0 = new com.whatsapp.chatlock.dialogs.ChatLockPrivacySettingsUnlockClearDialog
            r0.<init>()
            r0.A00 = r1
            r2.CMl(r0)
            return
        L_0x02fb:
            java.lang.Object r2 = r12.A01
            com.whatsapp.community.NewCommunityActivity r2 = (com.whatsapp.community.NewCommunityActivity) r2
            r0 = 0
            r2.A0D = r0
            java.lang.Object r1 = r12.A02
            X.1bI r1 = (X.C28931bI) r1
            r0 = 8
            r1.A04(r0)
            X.1ub r1 = X.AnonymousClass3MZ.A0c(r2)
            X.00H r0 = r1.A05
            java.lang.String r4 = X.C72463Mc.A0o(r0)
            java.lang.Integer r2 = X.AnonymousClass3MY.A0j(r0)
            r3 = 0
            r6 = 9
            r7 = 4
            r5 = r3
            r1.A0D(r2, r3, r4, r5, r6, r7)
            return
        L_0x0322:
            java.lang.Object r4 = r12.A01
            X.3Z7 r4 = (X.AnonymousClass3Z7) r4
            java.lang.Object r3 = r12.A02
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            java.util.List r0 = X.C42011xT.A0I
            X.11t r2 = r4.A02
            android.content.Context r1 = r4.A00
            X.C18070vi.A0W(r1)
            android.view.View r0 = r4.A01
            r2.CAr(r1, r0, r3)
            return
        L_0x0339:
            java.lang.Object r1 = r12.A01
            X.3SG r1 = (X.AnonymousClass3SG) r1
            java.lang.Object r0 = r12.A02
            X.4Uz r0 = (X.C87284Uz) r0
            X.AnonymousClass3SG.setupPopupMenu$lambda$2(r1, r0, r13)
            return
        L_0x0345:
            java.lang.Object r1 = r12.A01
            X.3QY r1 = (X.AnonymousClass3QY) r1
            java.lang.Object r0 = r12.A02
            X.01E r4 = r1.A0H
            X.1FU r4 = (X.AnonymousClass1FU) r4
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.community.CommunityDeleteDialogFragment r3 = new com.whatsapp.community.CommunityDeleteDialogFragment
            r3.<init>()
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.util.ArrayList r1 = X.C22971Dz.A0B(r1)
            java.lang.String r0 = "selectedParentJids"
            r2.putStringArrayList(r0, r1)
            r3.A1R(r2)
            r4.CMl(r3)
            return
        L_0x0370:
            java.lang.Object r5 = r12.A01
            X.3QY r5 = (X.AnonymousClass3QY) r5
            java.lang.Object r4 = r12.A02
            X.1EC r4 = (X.AnonymousClass1EC) r4
            android.content.Context r0 = r5.A0B
            android.app.Activity r3 = X.AnonymousClass1L9.A00(r0)
            X.1FU r3 = (X.AnonymousClass1FU) r3
            X.0ve r2 = r5.A04
            r1 = 2818(0xb02, float:3.949E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x03a1
            X.1M9 r1 = r5.A02
            X.1EC r0 = r5.A05
            X.1E7 r1 = r1.A0H(r0)
            X.00H r0 = r5.A07
            X.1xo r0 = X.AnonymousClass3MX.A0i(r0)
            boolean r0 = r0.A00(r1)
            r1 = 1
            if (r0 == 0) goto L_0x03a2
        L_0x03a1:
            r1 = 0
        L_0x03a2:
            com.whatsapp.community.CommunitySpamReportDialogFragment r0 = com.whatsapp.community.CommunitySpamReportDialogFragment.A00(r4, r1)
        L_0x03a6:
            r3.CMl(r0)
            return
        L_0x03aa:
            java.lang.Object r0 = r12.A01
            X.3QY r0 = (X.AnonymousClass3QY) r0
            java.lang.Object r2 = r12.A02
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            X.1L9 r5 = r0.A00
            android.content.Context r4 = r0.A0B
            X.00H r0 = r0.A08
            android.content.Intent r3 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "parent_group_jid"
            X.AnonymousClass3MY.A12(r3, r2, r0)
            goto L_0x04a2
        L_0x03cc:
            java.lang.Object r0 = r12.A01
            X.3QY r0 = (X.AnonymousClass3QY) r0
            java.lang.Object r1 = r12.A02
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            X.1L9 r5 = r0.A00
            android.content.Context r4 = r0.A0B
            X.00H r0 = r0.A08
            r0.get()
            android.content.Intent r3 = X.AnonymousClass1LU.A0m(r4, r1)
            goto L_0x04a2
        L_0x03e3:
            java.lang.Object r1 = r12.A01
            com.whatsapp.community.subgroup.views.CommunityViewGroupsView r1 = (com.whatsapp.community.subgroup.views.CommunityViewGroupsView) r1
            java.lang.Object r0 = r12.A02
            X.01E r0 = (X.AnonymousClass01E) r0
            com.whatsapp.community.subgroup.views.CommunityViewGroupsView.setViewClickListener$lambda$0(r1, r0, r13)
            return
        L_0x03ef:
            java.lang.Object r1 = r12.A01
            X.0vk r1 = (X.C18090vk) r1
            java.lang.Object r0 = r12.A02
            X.5bM r0 = (X.C108235bM) r0
            if (r1 == 0) goto L_0x03fc
            r1.invoke()
        L_0x03fc:
            r0.CBU()
            return
        L_0x0400:
            java.lang.Object r0 = r12.A01
            X.3ZT r0 = (X.AnonymousClass3ZT) r0
            java.lang.Object r1 = r12.A02
            X.4O6 r1 = (X.AnonymousClass4O6) r1
            X.4L4 r0 = r0.A05
            com.whatsapp.companiondevice.LinkedDevicesActivity r3 = r0.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r2 = r3.A09
            com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment r0 = new com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment
            r0.<init>()
            r0.A0A = r1
            goto L_0x045d
        L_0x0416:
            java.lang.Object r0 = r12.A01
            X.3ZT r0 = (X.AnonymousClass3ZT) r0
            java.lang.Object r5 = r12.A02
            X.4Zh r5 = (X.C88344Zh) r5
            X.4L4 r6 = r0.A05
            long r3 = r5.A01
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1R(r0)
            if (r0 != 0) goto L_0x0452
            com.whatsapp.companiondevice.LinkedDevicesActivity r4 = r6.A00
            X.0ve r2 = r4.A0E
            r1 = 4757(0x1295, float:6.666E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0452
            com.whatsapp.jid.DeviceJid r3 = r5.A08
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "device_jid_raw_string"
            X.AnonymousClass3MY.A12(r2, r3, r0)
            r4.startActivity(r2)
            return
        L_0x0452:
            com.whatsapp.companiondevice.LinkedDevicesActivity r3 = r6.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r2 = r3.A09
            com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment r0 = new com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment
            r0.<init>()
            r0.A07 = r5
        L_0x045d:
            r0.A04 = r2
            r3.A08 = r0
            r0.A00 = r3
            X.C72453Mb.A1I(r0, r3)
            return
        L_0x0467:
            java.lang.Object r1 = r12.A01
            X.5yK r1 = (X.C116625yK) r1
            java.lang.Object r0 = r12.A02
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            com.whatsapp.contact.picker.ContactPickerFragment r1 = r1.A04
            java.lang.String r0 = X.AnonymousClass17K.A02(r0)
            r0.getClass()
            com.whatsapp.contact.picker.ContactPickerFragment.A0i(r1, r0)
            return
        L_0x047c:
            java.lang.Object r0 = r12.A01
            X.5yK r0 = (X.C116625yK) r0
            java.lang.Object r1 = r12.A02
            X.7EF r1 = (X.AnonymousClass7EF) r1
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r0.A04
            r0.A2V(r1)
            return
        L_0x048a:
            java.lang.Object r0 = r12.A01
            X.5yK r0 = (X.C116625yK) r0
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r0.A04
            java.lang.String r1 = "515115256843064"
            X.1L9 r5 = r0.A0J
            android.content.Context r4 = r0.A14()
            X.129 r0 = r0.A1p
            android.net.Uri r0 = r0.A03(r1)
            android.content.Intent r3 = X.AnonymousClass1LU.A1p(r0)
        L_0x04a2:
            r5.A08(r4, r3)
            return
        L_0x04a6:
            java.lang.Object r4 = r12.A01
            X.5yK r4 = (X.C116625yK) r4
            java.lang.Object r3 = r12.A02
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = "call_type"
            r0 = 2
            goto L_0x04c5
        L_0x04b6:
            java.lang.Object r4 = r12.A01
            X.5yK r4 = (X.C116625yK) r4
            java.lang.Object r3 = r12.A02
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = "call_type"
            r0 = 1
        L_0x04c5:
            r2.putExtra(r1, r0)
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r4.A04
            r0.A2R(r2, r3)
            return
        L_0x04ce:
            java.lang.Object r1 = r12.A01
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            java.lang.Object r3 = r12.A02
            com.whatsapp.wds.components.search.WDSSearchView r3 = (com.whatsapp.wds.components.search.WDSSearchView) r3
            X.00H r0 = r1.A2V
            r0.get()
            android.view.View r0 = r1.A07
            boolean r0 = X.AnonymousClass1L4.A00(r0)
            if (r0 == 0) goto L_0x04fb
            com.whatsapp.wds.components.edittext.WDSEditText r1 = r3.A09
            X.11C r0 = r3.A00
            if (r0 == 0) goto L_0x04f7
            android.view.inputmethod.InputMethodManager r2 = r0.A0N()
            if (r2 == 0) goto L_0x04f7
            android.os.IBinder r1 = r1.getWindowToken()
            r0 = 0
            r2.hideSoftInputFromWindow(r1, r0)
        L_0x04f7:
            r3.clearFocus()
            return
        L_0x04fb:
            X.1FL r0 = r1.A1D()
            r0.onBackPressed()
            return
        L_0x0503:
            java.lang.Object r4 = r12.A01
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            java.lang.Object r3 = r12.A02
            android.content.Intent r3 = (android.content.Intent) r3
            X.A17 r2 = r4.A1e
            java.util.Random r0 = r2.A02
            if (r0 != 0) goto L_0x0518
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2.A02 = r0
        L_0x0518:
            long r0 = r0.nextLong()
            java.lang.String r0 = java.lang.Long.toHexString(r0)
            r2.A01 = r0
            X.8rz r1 = new X.8rz
            r1.<init>()
            java.lang.Integer r0 = X.AnonymousClass3MY.A0f()
            r1.A01 = r0
            X.A17.A00(r1, r2)
            X.1L9 r1 = r4.A0J
            android.content.Context r0 = r4.A14()
            r1.A08(r0, r3)
            r4.A2F()
            return
        L_0x053d:
            java.lang.Object r4 = r12.A01
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            java.lang.Object r3 = r12.A02
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            X.00H r0 = r4.A22
            X.1q1 r2 = X.AnonymousClass3MW.A0m(r0)
            r0 = 6
            r1 = 0
            r2.A03(r0)
            X.00H r0 = r4.A22
            X.C72453Mb.A1O(r0)
            boolean r0 = r4.A3M
            if (r0 == 0) goto L_0x0564
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = "call_type"
            r0 = 1
            android.content.Intent r1 = r2.putExtra(r1, r0)
        L_0x0564:
            r4.A2R(r1, r3)
            return
        L_0x0568:
            java.lang.Object r2 = r12.A01
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            java.lang.Object r1 = r12.A02
            android.content.Intent r1 = (android.content.Intent) r1
            X.00H r0 = r2.A22
            X.C72453Mb.A1O(r0)
            X.733 r4 = r2.A0u
            X.1FL r3 = r2.A1D()
            java.lang.String r0 = "newly_added_contact_phone_number_key"
            java.lang.String r2 = r1.getStringExtra(r0)
            r0 = 29
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "sms:"
            r4.A04(r3, r1, r2, r0)
            return
        L_0x058d:
            java.lang.Object r0 = r12.A01
            X.4kJ r0 = (X.C94244kJ) r0
            java.lang.Object r1 = r12.A02
            java.util.List r1 = (java.util.List) r1
            X.3gf r0 = r0.A01
            r0.A56(r1)
            return
        L_0x059b:
            java.lang.Object r6 = r12.A01
            X.5ko r6 = (X.C112025ko) r6
            java.lang.Object r5 = r12.A02
            X.1E7 r5 = (X.AnonymousClass1E7) r5
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            com.whatsapp.contact.picker.SelectedListContactPickerFragment r4 = r6.A01
            java.util.Map r3 = r4.A4G
            java.util.Iterator r2 = X.C17890vO.A0l(r3)
        L_0x05af:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x05d2
            java.lang.Object r1 = r2.next()
            boolean r0 = X.C18070vi.A18(r1, r5)
            if (r0 == 0) goto L_0x05af
        L_0x05bf:
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            if (r1 == 0) goto L_0x05ce
            X.1BI r0 = r1.A0J
            r3.remove(r0)
            r4.A2N()
            r4.A2J()
        L_0x05ce:
            r6.A0U(r5)
            return
        L_0x05d2:
            r1 = 0
            goto L_0x05bf
        L_0x05d4:
            java.lang.Object r0 = r12.A01
            X.5yL r0 = (X.C116635yL) r0
            java.lang.Object r1 = r12.A02
            X.7EH r1 = (X.AnonymousClass7EH) r1
            com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity r0 = r0.A07
            r0.A4b(r1)
            return
        L_0x05e2:
            java.lang.Object r3 = r12.A01
            com.whatsapp.conversation.CommentsBottomSheet r3 = (com.whatsapp.conversation.CommentsBottomSheet) r3
            java.lang.Object r2 = r12.A02
            com.whatsapp.mentions.MentionableEntry r2 = (com.whatsapp.mentions.MentionableEntry) r2
            X.0vl r0 = r3.A0W
            java.lang.Object r1 = r0.getValue()
            X.3VA r1 = (X.AnonymousClass3VA) r1
            java.lang.String r0 = r2.getStringText()
            X.C18070vi.A0X(r0)
            r1.A0T(r0)
            android.content.Context r2 = r3.A14()
            X.11C r1 = r3.A07
            if (r1 == 0) goto L_0x073a
            r0 = 2131888477(0x7f12095d, float:1.941159E38)
            java.lang.String r0 = r3.A1H(r0)
            X.AnonymousClass1Y5.A00(r2, r1, r0)
            return
        L_0x060f:
            java.lang.Object r3 = r12.A01
            com.whatsapp.conversation.ConversationEntryActionButton r3 = (com.whatsapp.conversation.ConversationEntryActionButton) r3
            java.lang.Object r2 = r12.A02
            X.5br r2 = (X.C108535br) r2
            long r0 = java.lang.System.currentTimeMillis()
            r3.A01 = r0
            r2.C56()
            return
        L_0x0621:
            java.lang.Object r1 = r12.A01
            X.3hT r1 = (X.C75423hT) r1
            java.lang.Object r0 = r12.A02
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            r1.Bze(r0)
            return
        L_0x062d:
            java.lang.Object r6 = r12.A01
            X.3rV r6 = (X.C77803rV) r6
            java.lang.Object r5 = r12.A02
            android.app.Activity r5 = (android.app.Activity) r5
            X.1kb r0 = r6.A06
            X.1EC r1 = r6.A0F
            X.1EC r2 = r0.A05(r1)
            X.1CJ r0 = r6.A0B
            boolean r0 = r0.A0R(r1)
            if (r0 == 0) goto L_0x0657
            if (r2 == 0) goto L_0x0657
            X.11t r1 = r6.A07
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r5.findViewById(r0)
            boolean r0 = r1.CAq(r5, r0, r2)
            if (r0 == 0) goto L_0x0657
            return
        L_0x0657:
            X.1E7 r0 = r6.A0H
            X.1BI r2 = r0.A0J
            boolean r0 = r6.A0M
            r7 = 1
            r1 = r0 ^ 1
            r0 = 0
            android.content.Intent r4 = X.AnonymousClass1LU.A13(r5, r2, r1, r0, r0)
            boolean r0 = r6.A0M
            if (r0 != 0) goto L_0x06a4
            r1 = 2131436426(0x7f0b238a, float:1.8494722E38)
            X.01E r0 = r6.A0U
            android.view.View r1 = r0.findViewById(r1)
            X.4ZR r0 = r6.A0Y
            android.os.Bundle r3 = X.AnonymousClass4ZR.A00(r5, r1, r0)
        L_0x0678:
            X.0ve r2 = r6.A0d
            r0 = 12061(0x2f1d, float:1.6901E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0693
            r0 = 10862(0x2a6e, float:1.5221E-41)
            int r0 = X.C18020vd.A00(r1, r2, r0)
            if (r0 < r7) goto L_0x0693
            X.0z4 r1 = r6.A0A
            java.lang.String r0 = "last_tapped_for_group_info_timestamp"
            r1.A1i(r0)
        L_0x0693:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r1 = r0.getSimpleName()
            X.11P r0 = r6.A09
            X.C60442o2.A00(r4, r0, r1)
            r5.startActivity(r4, r3)
            return
        L_0x06a4:
            r3 = 0
            goto L_0x0678
        L_0x06a6:
            java.lang.Object r3 = r12.A01
            X.3hU r3 = (X.C75433hU) r3
            java.lang.Object r2 = r12.A02
            android.content.Context r2 = (android.content.Context) r2
            X.1E7 r0 = r3.A0H
            X.1BI r1 = r0.A0J
            boolean r0 = r3.A0M
            r0 = r0 ^ 1
            android.content.Intent r1 = X.AnonymousClass1LU.A12(r2, r1, r0)
            r0 = 0
            r2.startActivity(r1, r0)
            return
        L_0x06bf:
            java.lang.Object r3 = r12.A01
            X.3rX r3 = (X.C77813rX) r3
            java.lang.Object r5 = r12.A02
            android.app.Activity r5 = (android.app.Activity) r5
            android.content.Intent r2 = r5.getIntent()
            r1 = 0
            if (r2 == 0) goto L_0x0700
            java.lang.String r0 = "mat_entry_point"
            int r8 = r2.getIntExtra(r0, r1)
        L_0x06d4:
            android.content.Intent r2 = r5.getIntent()
            r1 = -1
            if (r2 == 0) goto L_0x06fe
            java.lang.String r0 = "extra_forwarded_message_thread_type"
            int r9 = r2.getIntExtra(r0, r1)
        L_0x06e1:
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "similar_newsletters_session_id"
            java.io.Serializable r7 = r1.getSerializableExtra(r0)
            boolean r0 = r7 instanceof java.lang.Long
            r2 = 0
            if (r0 == 0) goto L_0x06fc
            java.lang.Long r7 = (java.lang.Long) r7
        L_0x06f2:
            X.2Dk r0 = r3.A00
            if (r0 != 0) goto L_0x0702
            java.lang.String r0 = "newsletterInfo"
            X.C18070vi.A11(r0)
            throw r2
        L_0x06fc:
            r7 = r2
            goto L_0x06f2
        L_0x06fe:
            r9 = -1
            goto L_0x06e1
        L_0x0700:
            r8 = 0
            goto L_0x06d4
        L_0x0702:
            X.1BI r6 = r0.A08()
            boolean r0 = r3.A0M
            r10 = r0 ^ 1
            android.content.Intent r4 = X.AnonymousClass1LU.A10(r5, r6, r7, r8, r9, r10)
            java.lang.String r1 = r3.A0i
            if (r1 == 0) goto L_0x0717
            java.lang.String r0 = "wamo_pc_id"
            r4.putExtra(r0, r1)
        L_0x0717:
            r1 = 2131436426(0x7f0b238a, float:1.8494722E38)
            X.01E r0 = r3.A0U
            android.view.View r1 = r0.findViewById(r1)
            boolean r0 = r3.A0M
            if (r0 != 0) goto L_0x072a
            X.4ZR r0 = r3.A0Y
            android.os.Bundle r2 = X.AnonymousClass4ZR.A00(r5, r1, r0)
        L_0x072a:
            java.lang.String r1 = X.C72463Mc.A0p(r5)
            X.11P r0 = r3.A05
            X.C60442o2.A00(r4, r0, r1)
            r5.startActivity(r4, r2)
            return
        L_0x0737:
            java.lang.String r0 = "waIntents"
            goto L_0x073c
        L_0x073a:
            java.lang.String r0 = "systemServices"
        L_0x073c:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0741:
            java.lang.Object r0 = r12.A01
            X.3rr r0 = (X.C77943rr) r0
            java.lang.Object r2 = r12.A02
            X.1FL r2 = (X.AnonymousClass1FL) r2
            X.1o3 r1 = r0.A03
            java.lang.String r0 = "events"
        L_0x074d:
            r1.A01(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90004dN.onClick(android.view.View):void");
    }
}
