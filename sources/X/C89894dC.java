package X;

import android.view.View;

/* renamed from: X.4dC  reason: invalid class name and case insensitive filesystem */
public class C89894dC implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C89894dC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C89894dC(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.whatsapp.chatlock.ChatLockSettingsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.whatsapp.chatlock.HideLockedChatsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: com.whatsapp.community.CommunityHomeActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: com.whatsapp.chatlock.ChatLockSettingsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: com.whatsapp.chatlock.ChatLockSettingsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: com.whatsapp.community.CommunityNUXActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: com.whatsapp.chatlock.ChatLockSettingsActivity} */
    /* JADX WARNING: type inference failed for: r0v28, types: [com.whatsapp.chatlock.dialogs.Hilt_ChatLockForgotSecretCodeUnlockClearDialog, com.whatsapp.chatlock.dialogs.ChatLockForgotSecretCodeUnlockClearDialog, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0375, code lost:
        X.C72463Mc.A11(X.C17880vN.A0D(), r2, r3, "EXTRA_PARENT_GROUP_JID");
        r4.CMl(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0381, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03c9, code lost:
        r1.A01(r3, "community-examples-article");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03ce, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0451, code lost:
        r0 = "viewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x050d, code lost:
        r3.startActivityForResult(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0510, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0511, code lost:
        r0 = "waIntents";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0513, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0517, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00af, code lost:
        r1.A09.A0U(r5, r1.A0B.A0T(), ((X.AnonymousClass1HV) r1.A0B.A09.get()).A00.A04(X.AnonymousClass18O.A0r), r1.A0A.A05.A05());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r2.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01ae, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01b1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x030b, code lost:
        r4.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x030e, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x04e5;
                case 1: goto L_0x04c5;
                case 2: goto L_0x0499;
                case 3: goto L_0x0499;
                case 4: goto L_0x006c;
                case 5: goto L_0x0455;
                case 6: goto L_0x042e;
                case 7: goto L_0x0428;
                case 8: goto L_0x0032;
                case 9: goto L_0x041c;
                case 10: goto L_0x03d7;
                case 11: goto L_0x03cf;
                case 12: goto L_0x03bf;
                case 13: goto L_0x03ae;
                case 14: goto L_0x0428;
                case 15: goto L_0x0382;
                case 16: goto L_0x0362;
                case 17: goto L_0x034e;
                case 18: goto L_0x0025;
                case 19: goto L_0x0342;
                case 20: goto L_0x032b;
                case 21: goto L_0x0286;
                case 22: goto L_0x02ba;
                case 23: goto L_0x027e;
                case 24: goto L_0x0243;
                case 25: goto L_0x022f;
                case 26: goto L_0x0223;
                case 27: goto L_0x020b;
                case 28: goto L_0x0203;
                case 29: goto L_0x01d9;
                case 30: goto L_0x01ca;
                case 31: goto L_0x01c2;
                case 32: goto L_0x01ba;
                case 33: goto L_0x01b2;
                case 34: goto L_0x01a6;
                case 35: goto L_0x0190;
                case 36: goto L_0x0005;
                case 37: goto L_0x0005;
                case 38: goto L_0x0187;
                case 39: goto L_0x017d;
                case 40: goto L_0x0159;
                case 41: goto L_0x001c;
                case 42: goto L_0x0129;
                case 43: goto L_0x0428;
                case 44: goto L_0x0013;
                case 45: goto L_0x0106;
                case 46: goto L_0x0100;
                case 47: goto L_0x00d5;
                case 48: goto L_0x00a2;
                case 49: goto L_0x009b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r10.A01
            X.4V8 r1 = (X.AnonymousClass4V8) r1
            java.util.List r0 = X.C42011xT.A0I
            X.1Di r2 = r1.A03
            com.whatsapp.jid.GroupJid r0 = r1.A02
        L_0x000f:
            r2.invoke(r0)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r0 = r10.A01
            X.4jz r0 = (X.C94064jz) r0
            X.1Di r2 = r0.A03
            X.1E7 r0 = r0.A01
            goto L_0x000f
        L_0x001c:
            java.lang.Object r0 = r10.A01
            X.4UX r0 = (X.AnonymousClass4UX) r0
            X.1Di r2 = r0.A03
            X.1EC r0 = r0.A02
            goto L_0x000f
        L_0x0025:
            java.lang.Object r1 = r10.A01
            X.4U3 r1 = (X.AnonymousClass4U3) r1
            java.util.List r0 = X.C42011xT.A0I
            X.1Di r2 = r1.A01
            X.A2B r0 = r1.A00
            com.whatsapp.jid.GroupJid r0 = r0.A02
            goto L_0x000f
        L_0x0032:
            java.lang.Object r3 = r10.A01
            com.whatsapp.community.CommunityHomeActivity r3 = (com.whatsapp.community.CommunityHomeActivity) r3
            X.3Un r0 = r3.A0X
            X.1wy r0 = r0.A02
            java.lang.Object r1 = r0.A06()
            if (r1 != 0) goto L_0x0042
            X.4Cw r1 = X.C82974Cw.NOT_ENFORCED
        L_0x0042:
            X.4Cw r0 = X.C82974Cw.NOT_ENFORCED
            if (r1 != r0) goto L_0x0012
            X.1MZ r1 = r3.A0a
            X.1EC r0 = r3.A0j
            boolean r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x04bb
            android.content.Context r0 = r11.getContext()
            X.1EC r2 = r3.A0j
            android.content.Intent r4 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.community.EditCommunityActivity"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "extra_community_jid"
            X.AnonymousClass3MY.A13(r4, r2, r0)
            r0 = 123(0x7b, float:1.72E-43)
            goto L_0x050d
        L_0x006c:
            java.lang.Object r3 = r10.A01
            com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet r3 = (com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet) r3
            X.4Np r2 = r3.A01
            if (r2 == 0) goto L_0x0012
            java.lang.String r1 = r3.A04
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.Af0 r5 = new X.Af0
            r5.<init>()
            X.4jc r8 = r2.A03
            X.00H r0 = r8.A03
            java.lang.Object r0 = r0.get()
            com.whatsapp.chatlock.passcode.ChatLockPasscodeManager r0 = (com.whatsapp.chatlock.passcode.ChatLockPasscodeManager) r0
            X.4Q2 r6 = r2.A02
            X.1FY r7 = r2.A01
            r9 = 0
            X.4sT r4 = new X.4sT
            r4.<init>(r5, r6, r7, r8, r9)
            r0.A04(r1, r4)
            r0 = 1
            X.C98334qx.A00(r5, r3, r0)
            return
        L_0x009b:
            java.lang.Object r1 = r10.A01
            com.whatsapp.companiondevice.LinkedDevicesActivity r1 = (com.whatsapp.companiondevice.LinkedDevicesActivity) r1
            java.lang.Integer r5 = X.AnonymousClass00R.A00
            goto L_0x00af
        L_0x00a2:
            java.lang.Object r0 = r10.A01
            X.3Zf r0 = (X.C74283Zf) r0
            X.AnonymousClass3MX.A1O(r0)
            X.4L4 r0 = r0.A02
            java.lang.Integer r5 = X.AnonymousClass00R.A00
            com.whatsapp.companiondevice.LinkedDevicesActivity r1 = r0.A00
        L_0x00af:
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r4 = r1.A09
            X.4RW r0 = r1.A0A
            X.3xb r0 = r0.A05
            boolean r3 = r0.A05()
            com.whatsapp.companiondevice.LinkedDevicesViewModel r0 = r1.A0B
            int r2 = r0.A0T()
            com.whatsapp.companiondevice.LinkedDevicesViewModel r0 = r1.A0B
            X.00H r0 = r0.A09
            java.lang.Object r0 = r0.get()
            X.1HV r0 = (X.AnonymousClass1HV) r0
            X.18O r1 = r0.A00
            X.18Q r0 = X.AnonymousClass18O.A0r
            int r0 = r1.A04(r0)
            r4.A0U(r5, r2, r0, r3)
            return
        L_0x00d5:
            java.lang.Object r3 = r10.A01
            com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity r3 = (com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity) r3
            com.whatsapp.jid.DeviceJid r0 = r3.A05
            if (r0 != 0) goto L_0x00e1
            java.lang.String r0 = "deviceJid"
            goto L_0x0513
        L_0x00e1:
            X.3Rj r4 = X.AnonymousClass4a6.A00(r3)
            r0 = 2131891662(0x7f1215ce, float:1.941805E38)
            r4.A0D(r0)
            r2 = 2131891819(0x7f12166b, float:1.9418369E38)
            r1 = 0
            X.4fz r0 = new X.4fz
            r0.<init>(r3, r1)
            r4.A0g(r3, r0, r2)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 1
            X.C73203Rj.A05(r3, r4, r0, r1)
            goto L_0x030b
        L_0x0100:
            java.lang.Object r0 = r10.A01
            X.AnonymousClass3MW.A1U(r0)
            return
        L_0x0106:
            java.lang.Object r1 = r10.A01
            com.whatsapp.companiondevice.CompanionHelloConfirmationActivity r1 = (com.whatsapp.companiondevice.CompanionHelloConfirmationActivity) r1
            X.0zA r0 = r1.A00
            if (r0 == 0) goto L_0x0125
            X.00H r0 = r1.A02
            if (r0 == 0) goto L_0x0121
            r0.get()
            r0 = 5
            android.content.Intent r0 = X.C87404Vl.A01(r1, r0)
            r1.startActivity(r0)
            r1.finish()
            return
        L_0x0121:
            java.lang.String r0 = "smbMDExtensionUtils"
            goto L_0x0513
        L_0x0125:
            java.lang.String r0 = "smbActivities"
            goto L_0x0513
        L_0x0129:
            java.lang.Object r2 = r10.A01
            X.3PX r2 = (X.AnonymousClass3PX) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r2.getWaIntents()
            android.content.Context r1 = r2.getContext()
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            android.content.Context r3 = r2.getContext()
            java.lang.String r0 = "com.whatsapp.contact.picker.ContactPicker"
            android.content.Intent r2 = X.C72473Md.A0B(r1, r0)
            java.lang.String r1 = "source_surface"
            r0 = 3
            r2.putExtra(r1, r0)
            java.lang.String r0 = "show_new_chat_and_community"
            r2.putExtra(r0, r4)
            r3.startActivity(r2)
            return
        L_0x0159:
            java.lang.Object r4 = r10.A01
            X.279 r4 = (X.AnonymousClass279) r4
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.1L9 r3 = r4.getActivityUtils$app_product_community_community()
            android.content.Context r2 = r4.getContext()
            android.content.Context r1 = r4.getContext()
            X.1EC r0 = r4.A02
            if (r0 != 0) goto L_0x0175
            java.lang.String r0 = "parentJid"
            goto L_0x0513
        L_0x0175:
            android.content.Intent r0 = X.AnonymousClass1LU.A19(r1, r0)
            r3.A08(r2, r0)
            return
        L_0x017d:
            java.lang.Object r0 = r10.A01
            X.3QY r0 = (X.AnonymousClass3QY) r0
            X.8GM r0 = r0.A0I
            r0.A0T()
            return
        L_0x0187:
            java.lang.Object r1 = r10.A01
            X.4FK r1 = (X.AnonymousClass4FK) r1
            java.util.List r0 = X.C42011xT.A0I
            X.0vk r0 = r1.A01
            goto L_0x01ae
        L_0x0190:
            java.lang.Object r2 = r10.A01
            X.28m r2 = (X.C453228m) r2
            android.view.View r0 = r2.A01
            android.content.Context r1 = r0.getContext()
            java.lang.Class<X.1FL> r0 = X.AnonymousClass1FL.class
            android.app.Activity r3 = X.AnonymousClass1L9.A01(r1, r0)
            X.1FL r3 = (X.AnonymousClass1FL) r3
            X.1o3 r1 = r2.A05
            goto L_0x03c9
        L_0x01a6:
            java.lang.Object r1 = r10.A01
            X.4FL r1 = (X.AnonymousClass4FL) r1
            java.util.List r0 = X.C42011xT.A0I
            X.0vk r0 = r1.A00
        L_0x01ae:
            r0.invoke()
            return
        L_0x01b2:
            java.lang.Object r0 = r10.A01
            X.4Uz r0 = (X.C87284Uz) r0
            X.AnonymousClass3SG.setupButtons$lambda$11(r0, r11)
            return
        L_0x01ba:
            java.lang.Object r0 = r10.A01
            X.4Uz r0 = (X.C87284Uz) r0
            X.AnonymousClass3SG.setupButtons$lambda$10(r0, r11)
            return
        L_0x01c2:
            java.lang.Object r0 = r10.A01
            X.4Uz r0 = (X.C87284Uz) r0
            X.AnonymousClass3SG.setupButtons$lambda$9(r0, r11)
            return
        L_0x01ca:
            java.lang.Object r0 = r10.A01
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r2 = X.AnonymousClass3Ma.A0Q(r0)
            X.4Cp r1 = X.C82904Cp.APPROVE
            r0 = 0
            r2.A0T(r1, r0)
            return
        L_0x01d9:
            java.lang.Object r3 = r10.A01
            X.1FB r3 = (X.AnonymousClass1FB) r3
            X.3Rj r4 = X.AnonymousClass4a6.A00(r3)
            r0 = 2131895086(0x7f12232e, float:1.9424995E38)
            r4.A0E(r0)
            r0 = 2131895085(0x7f12232d, float:1.9424993E38)
            r4.A0D(r0)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 0
            r4.A0e(r3, r0, r1)
            r2 = 2131891953(0x7f1216f1, float:1.941864E38)
            r1 = 46
            X.4fv r0 = new X.4fv
            r0.<init>(r3, r1)
            r4.A0g(r3, r0, r2)
            goto L_0x030b
        L_0x0203:
            java.lang.Object r0 = r10.A01
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r0 = (com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity) r0
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity.A03(r0)
            return
        L_0x020b:
            java.lang.Object r0 = r10.A01
            com.whatsapp.community.communitymedia.CommunityMediaActivity r0 = (com.whatsapp.community.communitymedia.CommunityMediaActivity) r0
            X.3Vg r0 = X.AnonymousClass3Ma.A0R(r0)
            X.1G4 r2 = r0.A0p
            java.lang.Object r1 = r2.getValue()
            X.4Cq r0 = X.C82914Cq.IDLE
            if (r1 != r0) goto L_0x021f
            X.4Cq r0 = X.C82914Cq.SEARCH
        L_0x021f:
            r2.setValue(r0)
            return
        L_0x0223:
            java.lang.Object r0 = r10.A01
            com.whatsapp.community.communitymedia.CommunityMediaActivity r0 = (com.whatsapp.community.communitymedia.CommunityMediaActivity) r0
            X.3Vg r0 = X.AnonymousClass3Ma.A0R(r0)
            r0.A0V()
            return
        L_0x022f:
            java.lang.Object r1 = r10.A01
            X.3dF r1 = (X.C74993dF) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.4SE r0 = r1.A01
            if (r0 != 0) goto L_0x023f
            java.lang.String r0 = "mediaVisibilityInfoUpdateHelper"
            goto L_0x0513
        L_0x023f:
            r0.A00()
            return
        L_0x0243:
            java.lang.Object r1 = r10.A01
            com.whatsapp.community.TransferCommunityOwnershipActivity r1 = (com.whatsapp.community.TransferCommunityOwnershipActivity) r1
            X.0vl r0 = r1.A09
            java.lang.Object r6 = r0.getValue()
            X.3To r6 = (X.AnonymousClass3To) r6
            X.0vl r0 = r1.A06
            java.lang.Object r5 = r0.getValue()
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.1G4 r4 = r6.A05
        L_0x025d:
            java.lang.Object r2 = r4.getValue()
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            r3 = 0
            X.4Zc r0 = new X.4Zc
            r0.<init>(r3, r1, r3)
            boolean r0 = r4.BFK(r2, r0)
            if (r0 == 0) goto L_0x025d
            X.1OX r2 = X.C41561wd.A00(r6)
            X.0wl r1 = r6.A04
            com.whatsapp.community.TransferCommunityOwnershipViewModel$onTransferOwnershipConfirmed$2 r0 = new com.whatsapp.community.TransferCommunityOwnershipViewModel$onTransferOwnershipConfirmed$2
            r0.<init>(r6, r5, r3)
            X.AnonymousClass3MW.A1X(r1, r0, r2)
            return
        L_0x027e:
            java.lang.Object r0 = r10.A01
            com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity r0 = (com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity) r0
            com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity.A0V(r0)
            return
        L_0x0286:
            java.lang.Object r1 = r10.A01
            X.3pI r1 = (X.C77063pI) r1
            boolean r0 = r1 instanceof com.whatsapp.community.NewCommunityActivity
            if (r0 == 0) goto L_0x02b4
            r0 = r1
            com.whatsapp.community.NewCommunityActivity r0 = (com.whatsapp.community.NewCommunityActivity) r0
            X.3qe r2 = r0.A02
        L_0x0293:
            com.whatsapp.WaEditText r0 = r1.A08
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x02a5
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r2.A0R = r0
        L_0x02a5:
            X.1Up r0 = r1.A0D
            r4 = 64206(0xface, float:8.9972E-41)
            r5 = 2
            r7 = 1
            r8 = 0
            r6 = -1
            r3 = 0
            r9 = r8
            r0.A08(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x02b4:
            r0 = r1
            com.whatsapp.community.EditCommunityActivity r0 = (com.whatsapp.community.EditCommunityActivity) r0
            X.1E7 r2 = r0.A06
            goto L_0x0293
        L_0x02ba:
            java.lang.Object r3 = r10.A01
            com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity r3 = (com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity) r3
            X.3Uh r0 = r3.A03
            if (r0 == 0) goto L_0x0451
            java.util.Set r0 = r0.A01
            int r4 = r0.size()
            if (r4 <= 0) goto L_0x030f
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r3)
            r0 = 2131625544(0x7f0e0648, float:1.8878299E38)
            android.view.View r5 = X.AnonymousClass3MY.A0D(r1, r0)
            r0 = 2131431443(0x7f0b1013, float:1.8484615E38)
            android.widget.TextView r2 = X.AnonymousClass3Ma.A0E(r5, r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131755191(0x7f1000b7, float:1.9141254E38)
            java.lang.String r0 = X.C72483Me.A0W(r1, r4, r0)
            r2.setText(r0)
            X.3Rj r4 = X.AnonymousClass4a6.A00(r3)
            r4.A0R(r5)
            r0 = 2131891196(0x7f1213fc, float:1.9417105E38)
            r4.A0D(r0)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 43
            X.4fv r0 = new X.4fv
            r0.<init>(r3, r1)
            r4.A0g(r3, r0, r2)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 0
            X.C73203Rj.A05(r3, r4, r0, r1)
        L_0x030b:
            r4.A0C()
            return
        L_0x030f:
            android.content.Intent r2 = X.C17880vN.A0A()
            X.3Uh r0 = r3.A03
            if (r0 != 0) goto L_0x031c
            X.AnonymousClass3MW.A1H()
            goto L_0x0516
        L_0x031c:
            java.util.Set r0 = r0.A01
            java.util.ArrayList r1 = X.C22971Dz.A0B(r0)
            java.lang.String r0 = "result_groups_to_be_hidden"
            r2.putStringArrayListExtra(r0, r1)
            X.C72453Mb.A16(r3, r2)
            return
        L_0x032b:
            java.lang.Object r0 = r10.A01
            com.whatsapp.community.NewCommunityAdminBottomSheetFragment r0 = (com.whatsapp.community.NewCommunityAdminBottomSheetFragment) r0
            X.00H r0 = r0.A03
            if (r0 == 0) goto L_0x0451
            java.lang.Object r1 = r0.get()
            X.3V5 r1 = (X.AnonymousClass3V5) r1
            X.AnonymousClass3V5.A03(r1)
            X.4Co r0 = X.C82894Co.DISMISS
            X.AnonymousClass3V5.A00(r0, r1)
            return
        L_0x0342:
            java.lang.Object r0 = r10.A01
            com.whatsapp.community.NewCommunityActivity r0 = (com.whatsapp.community.NewCommunityActivity) r0
            X.10I r1 = r0.A05
            java.lang.Runnable r0 = r0.A0S
            r1.CGF(r0)
            return
        L_0x034e:
            java.lang.Object r4 = r10.A01
            com.whatsapp.community.CommunitySettingsActivity r4 = (com.whatsapp.community.CommunitySettingsActivity) r4
            X.0vl r0 = r4.A07
            com.whatsapp.jid.Jid r3 = X.AnonymousClass3MW.A0h(r0)
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet r2 = new com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet
            r2.<init>()
            goto L_0x0375
        L_0x0362:
            java.lang.Object r4 = r10.A01
            com.whatsapp.community.CommunitySettingsActivity r4 = (com.whatsapp.community.CommunitySettingsActivity) r4
            X.0vl r0 = r4.A07
            com.whatsapp.jid.Jid r3 = X.AnonymousClass3MW.A0h(r0)
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet r2 = new com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet
            r2.<init>()
        L_0x0375:
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "EXTRA_PARENT_GROUP_JID"
            X.C72463Mc.A11(r1, r2, r3, r0)
            r4.CMl(r2)
            return
        L_0x0382:
            java.lang.Object r4 = r10.A01
            com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet r4 = (com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet) r4
            X.00H r0 = r4.A0J
            if (r0 == 0) goto L_0x03aa
            X.1gf r3 = X.AnonymousClass3MX.A0b(r0)
            android.content.Context r1 = r4.A1n()
            java.lang.Class<X.01E> r0 = X.AnonymousClass01E.class
            android.app.Activity r2 = X.AnonymousClass1L9.A01(r1, r0)
            X.01E r2 = (X.AnonymousClass01E) r2
            X.0vl r0 = r4.A0O
            X.1EC r1 = X.AnonymousClass3MX.A0p(r0)
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.BBX(r2, r1, r0)
            return
        L_0x03aa:
            java.lang.String r0 = "communityNavigator"
            goto L_0x0513
        L_0x03ae:
            java.lang.Object r3 = r10.A01
            com.whatsapp.community.CommunityNavigationActivity r3 = (com.whatsapp.community.CommunityNavigationActivity) r3
            X.00H r0 = r3.A0g
            X.1gf r2 = X.AnonymousClass3MX.A0b(r0)
            X.1EC r1 = r3.A0X
            r0 = 0
            r2.BBX(r3, r1, r0)
            return
        L_0x03bf:
            java.lang.Object r3 = r10.A01
            com.whatsapp.community.CommunityNUXActivity r3 = (com.whatsapp.community.CommunityNUXActivity) r3
            X.00H r0 = r3.A08
            X.1o3 r1 = X.AnonymousClass3MW.A0a(r0)
        L_0x03c9:
            java.lang.String r0 = "community-examples-article"
            r1.A01(r3, r0)
            return
        L_0x03cf:
            java.lang.Object r0 = r10.A01
            com.whatsapp.community.CommunityNUXActivity r0 = (com.whatsapp.community.CommunityNUXActivity) r0
            r0.A4b()
            return
        L_0x03d7:
            java.lang.Object r5 = r10.A01
            com.whatsapp.community.CommunityNUXActivity r5 = (com.whatsapp.community.CommunityNUXActivity) r5
            X.00H r0 = r5.A05
            java.lang.String r3 = X.C72463Mc.A0o(r0)
            java.lang.Integer r2 = X.AnonymousClass3MY.A0j(r0)
            X.00H r0 = r5.A07
            java.lang.Object r1 = r0.get()
            X.1ub r1 = (X.C40371ub) r1
            r4 = 3
            r0 = 2
            r1.A0E(r2, r3, r0, r4)
            boolean r1 = X.AnonymousClass000.A1W(r2)
            java.lang.String r0 = "Creation Entrypoint should not be null"
            X.C17960vV.A0F(r1, r0)
            X.00H r0 = r5.A06
            X.1gf r3 = X.AnonymousClass3MX.A0b(r0)
            int r2 = r2.intValue()
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "CommunityNUXActivity_group_to_be_added"
            java.lang.String r1 = r1.getStringExtra(r0)
            X.1yz r0 = X.AnonymousClass1EC.A01
            X.1EC r0 = r0.A02(r1)
            r3.CNv(r5, r0, r4, r2)
            r5.finish()
            return
        L_0x041c:
            java.lang.Object r1 = r10.A01
            X.3ZW r1 = (X.AnonymousClass3ZW) r1
            java.util.List r0 = X.C42011xT.A0I
            android.view.ViewGroup r0 = r1.A00
            r0.showContextMenu()
            return
        L_0x0428:
            java.lang.Object r0 = r10.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x042e:
            java.lang.Object r5 = r10.A01
            com.whatsapp.chatlock.dialogs.helperflow.ChatLockHelperBottomSheet r5 = (com.whatsapp.chatlock.dialogs.helperflow.ChatLockHelperBottomSheet) r5
            com.whatsapp.chatlock.dialogs.helperflow.ChatLockHelperBottomSheetViewModel r1 = r5.A04
            if (r1 == 0) goto L_0x0451
            r0 = 1
            r1.A04 = r0
            X.00H r0 = r1.A06
            X.4VV r4 = X.AnonymousClass3MX.A0a(r0)
            X.1BI r3 = r1.A03
            int r0 = r1.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 0
            r0 = 12
            r4.A04(r3, r2, r1, r0)
            r5.A28()
            return
        L_0x0451:
            java.lang.String r0 = "viewModel"
            goto L_0x0513
        L_0x0455:
            java.lang.Object r6 = r10.A01
            com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet r6 = (com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet) r6
            X.4Np r0 = r6.A01
            if (r0 == 0) goto L_0x0489
            X.4jc r5 = r0.A03
            X.1FY r4 = r0.A01
            int r3 = r0.A00
            X.4jX r2 = new X.4jX
            r2.<init>(r4, r5, r3)
            r0 = 0
            X.4aw r1 = new X.4aw
            r1.<init>(r2, r5, r4, r0)
            com.whatsapp.chatlock.dialogs.ChatLockForgotSecretCodeUnlockClearDialog r0 = new com.whatsapp.chatlock.dialogs.ChatLockForgotSecretCodeUnlockClearDialog
            r0.<init>()
            r0.A00 = r3
            r0.A01 = r1
            r4.CMl(r0)
            r5.BEO()
            X.00H r0 = r5.A02
            X.4VV r2 = X.AnonymousClass3MX.A0a(r0)
            r1 = 0
            r0 = 15
            r2.A04(r1, r1, r1, r0)
        L_0x0489:
            X.4VV r2 = r6.A02
            if (r2 == 0) goto L_0x0496
            java.lang.Integer r1 = X.C17880vN.A0i()
            r0 = 0
            r2.A05(r0, r1)
            return
        L_0x0496:
            java.lang.String r0 = "chatLockLogger"
            goto L_0x0513
        L_0x0499:
            java.lang.Object r4 = r10.A01
            com.whatsapp.chatlock.HideLockedChatsActivity r4 = (com.whatsapp.chatlock.HideLockedChatsActivity) r4
            X.00H r0 = r4.A03
            if (r0 == 0) goto L_0x0511
            r0.get()
            r3 = 0
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entrypoint"
            r2.putExtra(r0, r3)
            r4.startActivityForResult(r2, r3)
            return
        L_0x04bb:
            X.1KB r2 = r3.A05
            r1 = 2131890324(0x7f121094, float:1.9415337E38)
            r0 = 0
            r2.A08(r1, r0)
            return
        L_0x04c5:
            java.lang.Object r3 = r10.A01
            com.whatsapp.chatlock.HideLockedChatsActivity r3 = (com.whatsapp.chatlock.HideLockedChatsActivity) r3
            X.00H r0 = r3.A03
            if (r0 == 0) goto L_0x0511
            r0.get()
            r2 = 0
            android.content.Intent r4 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.chatlock.ChatLockConfirmSecretCodeActivity"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "entrypoint"
            r4.putExtra(r0, r2)
            r0 = 1
            goto L_0x050d
        L_0x04e5:
            java.lang.Object r3 = r10.A01
            com.whatsapp.chatlock.ChatLockSettingsActivity r3 = (com.whatsapp.chatlock.ChatLockSettingsActivity) r3
            X.1fA r0 = r3.A4b()
            X.00H r0 = r0.A0B
            java.lang.Object r0 = r0.get()
            X.1TK r0 = (X.AnonymousClass1TK) r0
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0518
            X.00H r0 = r3.A05
            if (r0 == 0) goto L_0x0511
            android.content.Intent r4 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.chatlock.HideLockedChatsActivity"
            r4.setClassName(r1, r0)
            r0 = 2
        L_0x050d:
            r3.startActivityForResult(r4, r0)
            return
        L_0x0511:
            java.lang.String r0 = "waIntents"
        L_0x0513:
            X.C18070vi.A11(r0)
        L_0x0516:
            r0 = 0
            throw r0
        L_0x0518:
            X.3Ri r4 = X.C73193Ri.A00(r3)
            r0 = 2131897154(0x7f122b42, float:1.942919E38)
            r4.A0V(r0)
            r0 = 2131897153(0x7f122b41, float:1.9429187E38)
            r4.A0U(r0)
            r2 = 2131897152(0x7f122b40, float:1.9429185E38)
            r1 = 43
            X.4aq r0 = new X.4aq
            r0.<init>(r3, r1)
            r4.A0X(r0, r2)
            r1 = 2131888156(0x7f12081c, float:1.941094E38)
            r0 = 12
            X.C73193Ri.A01(r4, r0, r1)
            X.AnonymousClass3MY.A1G(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89894dC.onClick(android.view.View):void");
    }
}
