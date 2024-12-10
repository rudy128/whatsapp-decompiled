package X;

import android.content.DialogInterface;

/* renamed from: X.4aq  reason: invalid class name */
public class AnonymousClass4aq implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass4aq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: com.whatsapp.calling.backwardcompat.BackwardCompatDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v77, resolved type: com.whatsapp.community.CommunityConfirmLinkDialogFragment} */
    /* JADX WARNING: type inference failed for: r2v4, types: [com.whatsapp.base.WaDialogFragment, com.whatsapp.chatlock.dialogs.Hilt_ChatLockConfirmUnlockClearDialog, com.whatsapp.chatlock.dialogs.ChatLockConfirmUnlockClearDialog] */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01bc, code lost:
        r11 = X.C72463Mc.A0g(r5.A0L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01c2, code lost:
        if (r2 == false) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r1 = r5.A0O.A02(r5.A0L, r11, r2);
        r0 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01cf, code lost:
        if (r2 == false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01d1, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01d3, code lost:
        r5.startActivityForResult(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01dd, code lost:
        if (X.AnonymousClass3Ma.A1Y(r5.A0O) == false) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01df, code lost:
        r4 = r5.A0O;
        r6 = r5.getSupportFragmentManager();
        r10 = r5.A0L;
        r4.A05(r5, r6, (X.C30191dX) r5.A0V.get(), (X.C219217x) r5.A0c.get(), r5.A0A, r10, r11);
        r5.getSupportFragmentManager().A0t(new X.C91374fa(r5, 1), r5, "request_bottom_sheet_fragment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x020b, code lost:
        X.AnonymousClass3MW.A0m(r5.A0Q).A06(r2, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0215, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0216, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0217, code lost:
        com.whatsapp.util.Log.w("calllog/opt system contact list could not found", r1);
        X.AnonymousClass4Yv.A01(r5, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0220, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02dd, code lost:
        X.AnonymousClass4Yv.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02e0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02f2, code lost:
        r1.A1k(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x037c, code lost:
        r0 = "callback";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x037f, code lost:
        r0 = "twoFactorAuthManager";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0381, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0385, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03fb, code lost:
        r14.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03fe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        r1.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0075, code lost:
        r4 = r1.A01.A0u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0079, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007b, code lost:
        r4.A1E.execute(new X.AnonymousClass7RF(r4, r1.A00, 20, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x010c, code lost:
        r0 = "onConfirmLinkSubgroupListener";
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r14, int r15) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x030e;
                case 1: goto L_0x0237;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x00eb;
                case 5: goto L_0x0306;
                case 6: goto L_0x02fe;
                case 7: goto L_0x02f6;
                case 8: goto L_0x02e1;
                case 9: goto L_0x02d8;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x03b9;
                case 13: goto L_0x02ab;
                case 14: goto L_0x026e;
                case 15: goto L_0x02ab;
                case 16: goto L_0x0257;
                case 17: goto L_0x00df;
                case 18: goto L_0x023f;
                case 19: goto L_0x00d1;
                case 20: goto L_0x0237;
                case 21: goto L_0x0221;
                case 22: goto L_0x01b4;
                case 23: goto L_0x01aa;
                case 24: goto L_0x01a3;
                case 25: goto L_0x0058;
                case 26: goto L_0x008a;
                case 27: goto L_0x0058;
                case 28: goto L_0x006e;
                case 29: goto L_0x0066;
                case 30: goto L_0x0058;
                case 31: goto L_0x0195;
                case 32: goto L_0x004a;
                case 33: goto L_0x017c;
                case 34: goto L_0x016b;
                case 35: goto L_0x0157;
                case 36: goto L_0x0150;
                case 37: goto L_0x013b;
                case 38: goto L_0x0134;
                case 39: goto L_0x0031;
                case 40: goto L_0x012e;
                case 41: goto L_0x0125;
                case 42: goto L_0x0110;
                case 43: goto L_0x03a1;
                case 44: goto L_0x0386;
                case 45: goto L_0x0337;
                case 46: goto L_0x0322;
                case 47: goto L_0x000f;
                case 48: goto L_0x0100;
                case 49: goto L_0x001b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A01
            X.0vk r0 = (X.C18090vk) r0
            if (r0 == 0) goto L_0x000e
            r0.invoke()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r1 = r13.A01
            com.whatsapp.community.CommunityConfirmLinkDialogFragment r1 = (com.whatsapp.community.CommunityConfirmLinkDialogFragment) r1
            X.5au r0 = r1.A00
            if (r0 == 0) goto L_0x010c
            r0.Bnj()
            goto L_0x0054
        L_0x001b:
            java.lang.Object r0 = r13.A01
            com.whatsapp.community.CommunityExitDialogFragment r0 = (com.whatsapp.community.CommunityExitDialogFragment) r0
            android.content.Context r2 = r0.A1n()
            if (r2 == 0) goto L_0x000e
            X.1L9 r1 = r0.A01
            X.1EC r0 = r0.A0A
            android.content.Intent r0 = X.AnonymousClass1LU.A0m(r2, r0)
            r1.A08(r2, r0)
            return
        L_0x0031:
            java.lang.Object r1 = r13.A01
            com.whatsapp.chatinfo.ViewPhotoOrStatusDialogFragment r1 = (com.whatsapp.chatinfo.ViewPhotoOrStatusDialogFragment) r1
            if (r15 == 0) goto L_0x0042
            r0 = 1
            if (r15 != r0) goto L_0x000e
            X.5ar r0 = r1.A00
            if (r0 == 0) goto L_0x000e
            r0.CAD()
            return
        L_0x0042:
            X.5ar r0 = r1.A00
            if (r0 == 0) goto L_0x000e
            r0.CAC()
            return
        L_0x004a:
            java.lang.Object r1 = r13.A01
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A1b()
            if (r0 == 0) goto L_0x000e
        L_0x0054:
            r1.A28()
            return
        L_0x0058:
            java.lang.Object r1 = r13.A01
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A1b()
            if (r0 == 0) goto L_0x000e
            r1.A29()
            return
        L_0x0066:
            java.lang.Object r1 = r13.A01
            X.4cC r1 = (X.C89274cC) r1
            if (r1 == 0) goto L_0x000e
            r5 = 1
            goto L_0x0075
        L_0x006e:
            java.lang.Object r1 = r13.A01
            X.4cC r1 = (X.C89274cC) r1
            if (r1 == 0) goto L_0x000e
            r5 = 0
        L_0x0075:
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r1.A01
            X.A99 r4 = r0.A0u
            if (r4 == 0) goto L_0x000e
            com.whatsapp.jid.UserJid r3 = r1.A00
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r4.A1E
            r1 = 20
            X.7RF r0 = new X.7RF
            r0.<init>(r4, r3, r1, r5)
            r2.execute(r0)
            return
        L_0x008a:
            java.lang.Object r3 = r13.A01
            com.whatsapp.calling.dialogs.E2EEInfoDialogFragment r3 = (com.whatsapp.calling.dialogs.E2EEInfoDialogFragment) r3
            X.1nr r2 = r3.A03
            if (r2 == 0) goto L_0x031f
            int r1 = r3.A00
            r0 = 2
            r2.A00(r1, r0)
            X.0ve r2 = r3.A02
            r1 = 8926(0x22de, float:1.2508E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00bb
            X.1o3 r2 = r3.A02
            if (r2 == 0) goto L_0x0316
            X.1FL r1 = r3.A1D()
            java.lang.String r0 = "about-e2e-encryption"
            r2.A01(r1, r0)
        L_0x00b1:
            boolean r0 = r3.A1b()
            if (r0 == 0) goto L_0x000e
            r3.A29()
            return
        L_0x00bb:
            X.129 r1 = r3.A04
            if (r1 == 0) goto L_0x031c
            java.lang.String r0 = "28030015"
            android.content.Intent r2 = X.C72473Md.A0C(r1, r0)
            X.1L9 r1 = r3.A01
            if (r1 == 0) goto L_0x0319
            android.content.Context r0 = r3.A14()
            r1.A08(r0, r2)
            goto L_0x00b1
        L_0x00d1:
            java.lang.Object r0 = r13.A01
            X.0vk r0 = (X.C18090vk) r0
            X.AnonymousClass3MX.A1O(r0)
            r0.invoke()
            if (r14 == 0) goto L_0x000e
            goto L_0x03fb
        L_0x00df:
            java.lang.Object r0 = r13.A01
            com.whatsapp.blocklist.UnblockDialogFragment r0 = (com.whatsapp.blocklist.UnblockDialogFragment) r0
            X.5Yk r0 = r0.A00
            if (r0 == 0) goto L_0x000e
            r0.CQ7()
            return
        L_0x00eb:
            java.lang.Object r1 = r13.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = "invitelink/revoke/confirmation/ok"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1FL r0 = r1.A1B()
            X.5YZ r0 = (X.AnonymousClass5YZ) r0
            if (r0 == 0) goto L_0x000e
            r0.CG6()
            return
        L_0x0100:
            java.lang.Object r0 = r13.A01
            com.whatsapp.community.CommunityConfirmLinkDialogFragment r0 = (com.whatsapp.community.CommunityConfirmLinkDialogFragment) r0
            X.5au r0 = r0.A00
            if (r0 == 0) goto L_0x010c
            r0.Bpb()
            return
        L_0x010c:
            java.lang.String r0 = "onConfirmLinkSubgroupListener"
            goto L_0x0381
        L_0x0110:
            java.lang.Object r4 = r13.A01
            com.whatsapp.chatlock.ChatLockPrivacySettingsActivity r4 = (com.whatsapp.chatlock.ChatLockPrivacySettingsActivity) r4
            X.1fA r3 = r4.A01
            if (r3 == 0) goto L_0x0121
            X.3oa r2 = X.C76883oa.A00
            r1 = 5
            X.1kA r0 = r4.A05
            r3.A0A(r4, r2, r0, r1)
            return
        L_0x0121:
            java.lang.String r0 = "chatLockManager"
            goto L_0x0381
        L_0x0125:
            java.lang.Object r1 = r13.A01
            com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity r1 = (com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity) r1
            r0 = 1
            com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity.A03(r1, r0)
            return
        L_0x012e:
            java.lang.Object r0 = r13.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x0134:
            java.lang.Object r1 = r13.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 4
            goto L_0x02dd
        L_0x013b:
            java.lang.Object r3 = r13.A01
            X.1FP r3 = (X.AnonymousClass1FP) r3
            r0 = 6
            X.AnonymousClass4Yv.A00(r3, r0)
            X.10I r2 = r3.A05
            r1 = 40
            X.7R9 r0 = new X.7R9
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.CGF(r0)
            return
        L_0x0150:
            java.lang.Object r1 = r13.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 6
            goto L_0x02dd
        L_0x0157:
            java.lang.Object r2 = r13.A01
            X.1FY r2 = (X.AnonymousClass1FY) r2
            java.lang.String r0 = "https://faq.whatsapp.com/544265288316777"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r1 = X.AnonymousClass3MY.A07(r0)
            X.1L9 r0 = r2.A01
            r0.A08(r2, r1)
            return
        L_0x016b:
            java.lang.Object r2 = r13.A01
            com.whatsapp.chatinfo.ChatMediaVisibilityDialog r2 = (com.whatsapp.chatinfo.ChatMediaVisibilityDialog) r2
            r1 = 2
            r0 = 1
            if (r15 == r0) goto L_0x0176
            if (r15 == r1) goto L_0x0179
            r1 = 0
        L_0x0176:
            r2.A01 = r1
            return
        L_0x0179:
            r2.A01 = r0
            return
        L_0x017c:
            java.lang.Object r1 = r13.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = "voip/AppSettingsWarningDialogFragment/settings"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1FL r0 = r1.A1B()
            if (r0 != 0) goto L_0x0191
            java.lang.String r0 = "voip/AppSettingsWarningDialogFragment/settings activity is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0191:
            X.AnonymousClass4aU.A05(r0)
            return
        L_0x0195:
            java.lang.Object r2 = r13.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "switch_result"
            X.AnonymousClass3MY.A16(r1, r2, r0)
            return
        L_0x01a3:
            java.lang.Object r1 = r13.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2
            goto L_0x02dd
        L_0x01aa:
            java.lang.Object r5 = r13.A01
            com.whatsapp.calling.callhistory.CallLogActivity r5 = (com.whatsapp.calling.callhistory.CallLogActivity) r5
            r0 = 1
            X.AnonymousClass4Yv.A00(r5, r0)
            r2 = 0
            goto L_0x01bc
        L_0x01b4:
            java.lang.Object r5 = r13.A01
            com.whatsapp.calling.callhistory.CallLogActivity r5 = (com.whatsapp.calling.callhistory.CallLogActivity) r5
            r2 = 1
            X.AnonymousClass4Yv.A00(r5, r2)
        L_0x01bc:
            X.1E7 r0 = r5.A0L
            X.1BI r11 = X.C72463Mc.A0g(r0)
            if (r2 == 0) goto L_0x01c5
            goto L_0x01d7
        L_0x01c5:
            X.1nu r1 = r5.A0O     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            X.1E7 r0 = r5.A0L     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            android.content.Intent r1 = r1.A02(r0, r11, r2)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            r0 = 11
            if (r2 == 0) goto L_0x01d3
            r0 = 10
        L_0x01d3:
            r5.startActivityForResult(r1, r0)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            goto L_0x020b
        L_0x01d7:
            X.1nu r0 = r5.A0O     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            boolean r0 = X.AnonymousClass3Ma.A1Y(r0)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            if (r0 == 0) goto L_0x01c5
            X.1nu r4 = r5.A0O     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            X.1GP r6 = r5.getSupportFragmentManager()     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            X.1E7 r10 = r5.A0L     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            X.00H r0 = r5.A0c     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            java.lang.Object r8 = r0.get()     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            X.17x r8 = (X.C219217x) r8     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            X.00H r0 = r5.A0V     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            java.lang.Object r7 = r0.get()     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            X.1dX r7 = (X.C30191dX) r7     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            X.0z4 r9 = r5.A0A     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            r4.A05(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            X.1GP r4 = r5.getSupportFragmentManager()     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            java.lang.String r3 = "request_bottom_sheet_fragment"
            r1 = 1
            X.4fa r0 = new X.4fa     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            r0.<init>(r5, r1)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            r4.A0t(r0, r5, r3)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
        L_0x020b:
            X.00H r0 = r5.A0Q     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            X.1q1 r1 = X.AnonymousClass3MW.A0m(r0)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            r0 = 1
            r1.A06(r2, r0)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0216 }
            return
        L_0x0216:
            r1 = move-exception
            java.lang.String r0 = "calllog/opt system contact list could not found"
            com.whatsapp.util.Log.w(r0, r1)
            r0 = 2
            X.AnonymousClass4Yv.A01(r5, r0)
            return
        L_0x0221:
            java.lang.Object r1 = r13.A01
            com.whatsapp.calling.backwardcompat.BackwardCompatDialog r1 = (com.whatsapp.calling.backwardcompat.BackwardCompatDialog) r1
            X.1vD r0 = r1.A00
            if (r0 == 0) goto L_0x0233
            android.net.Uri r0 = r0.A03()
            android.content.Intent r0 = X.AnonymousClass3MY.A07(r0)
            goto L_0x02f2
        L_0x0233:
            java.lang.String r0 = "upgrade"
            goto L_0x0381
        L_0x0237:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A29()
            return
        L_0x023f:
            java.lang.Object r2 = r13.A01
            com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingCameraFragment r2 = (com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingCameraFragment) r2
            r0 = 1
            X.C18070vi.A0d(r14, r0)
            r14.dismiss()
            r1 = 0
            r2.A01 = r1
            com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel r0 = X.AnonymousClass3Ma.A0O(r2)
            X.1G4 r0 = r0.A0M
            r0.setValue(r1)
            return
        L_0x0257:
            java.lang.Object r0 = r13.A01
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoErrorDialog r0 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoErrorDialog) r0
            r14.dismiss()
            X.0vl r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r0 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r0
            X.1wy r1 = r0.A04
            X.6Qe r0 = X.C122416Qe.CLOSE_SCREEN
            r1.A0F(r0)
            return
        L_0x026e:
            java.lang.Object r6 = r13.A01
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r6 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r6
            r0 = 4
            r6.A00 = r0
            X.1eh r2 = r6.A05
            if (r2 == 0) goto L_0x037f
            android.content.SharedPreferences r1 = X.C30901eh.A00(r2)
            r0 = 0
            java.lang.String r5 = "two_factor_auth_nag_interval"
            int r1 = r1.getInt(r5, r0)
            r0 = 2
            int r4 = java.lang.Math.max(r1, r0)
            android.content.SharedPreferences r0 = X.C30901eh.A00(r2)
            android.content.SharedPreferences$Editor r3 = r0.edit()
            X.11P r0 = r2.A06
            long r1 = X.AnonymousClass11P.A01(r0)
            java.lang.String r0 = "two_factor_auth_nag_time"
            android.content.SharedPreferences$Editor r0 = r3.putLong(r0, r1)
            android.content.SharedPreferences$Editor r2 = r0.putInt(r5, r4)
            java.lang.String r1 = "two_factor_auth_last_code_correctness"
            r0 = 1
            X.C17880vN.A1F(r2, r1, r0)
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment.A00(r6)
            return
        L_0x02ab:
            java.lang.Object r4 = r13.A01
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r4 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r4
            r0 = 1
            r4.A00 = r0
            X.1KB r2 = r4.A2H()
            r1 = 0
            r0 = 2131897173(0x7f122b55, float:1.9429228E38)
            r2.A07(r1, r0)
            X.1KB r3 = r4.A2H()
            java.lang.Runnable r2 = r4.A08
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.A0K(r2, r0)
            X.1eh r2 = r4.A05
            if (r2 == 0) goto L_0x037f
            java.lang.String r0 = "TwoFactorAuthManager/disableTwoFactorAuth"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = ""
            r0 = 0
            r2.A05(r1, r0)
            return
        L_0x02d8:
            java.lang.Object r1 = r13.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 1
        L_0x02dd:
            X.AnonymousClass4Yv.A00(r1, r0)
            return
        L_0x02e1:
            java.lang.Object r1 = r13.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = "delete-account-feedback/changenumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1FL r0 = r1.A1B()
            android.content.Intent r0 = X.AnonymousClass1LU.A00(r0)
        L_0x02f2:
            r1.A1k(r0)
            return
        L_0x02f6:
            java.lang.Object r0 = r13.A01
            com.whatsapp.SingleSelectionDialogFragment r0 = (com.whatsapp.SingleSelectionDialogFragment) r0
            r0.A2J()
            return
        L_0x02fe:
            java.lang.Object r0 = r13.A01
            com.whatsapp.SingleSelectionDialogFragment r0 = (com.whatsapp.SingleSelectionDialogFragment) r0
            com.whatsapp.SingleSelectionDialogFragment.A04(r0)
            return
        L_0x0306:
            java.lang.Object r0 = r13.A01
            X.5Ya r0 = (X.C107005Ya) r0
            r0.C31()
            return
        L_0x030e:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.C72463Mc.A1A(r0)
            return
        L_0x0316:
            java.lang.String r0 = "contextualHelpHandler"
            goto L_0x0381
        L_0x0319:
            java.lang.String r0 = "activityUtils"
            goto L_0x0381
        L_0x031c:
            java.lang.String r0 = "faqLinkFactory"
            goto L_0x0381
        L_0x031f:
            java.lang.String r0 = "privacyHighlightDailyLogger"
            goto L_0x0381
        L_0x0322:
            java.lang.Object r2 = r13.A01
            com.whatsapp.community.CommunityAdminDialogFragment r2 = (com.whatsapp.community.CommunityAdminDialogFragment) r2
            r0 = 1
            X.C18070vi.A0d(r14, r0)
            com.whatsapp.jid.UserJid r1 = r2.A02
            if (r1 == 0) goto L_0x03fb
            X.4Kw r0 = r2.A01
            if (r0 == 0) goto L_0x037c
            X.AnonymousClass4XS.A00(r2, r0, r1)
            goto L_0x03fb
        L_0x0337:
            java.lang.Object r2 = r13.A01
            com.whatsapp.community.CommunityAdminDialogFragment r2 = (com.whatsapp.community.CommunityAdminDialogFragment) r2
            r0 = 1
            X.C18070vi.A0d(r14, r0)
            com.whatsapp.jid.UserJid r3 = r2.A02
            if (r3 == 0) goto L_0x03fb
            X.4Kw r1 = r2.A01
            if (r1 == 0) goto L_0x037c
            int r2 = r2.A00
            if (r2 == r0) goto L_0x0369
            r0 = 2
            if (r2 == r0) goto L_0x0369
            r0 = 3
            if (r2 == r0) goto L_0x0356
            r0 = 4
            if (r2 == r0) goto L_0x0356
            goto L_0x03fb
        L_0x0356:
            X.4XS r0 = r1.A00
            X.0vl r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            X.4VH r1 = (X.AnonymousClass4VH) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A01(r3, r0)
            goto L_0x03fb
        L_0x0369:
            X.4XS r0 = r1.A00
            X.0vl r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            X.4VH r1 = (X.AnonymousClass4VH) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A00(r3, r0)
            goto L_0x03fb
        L_0x037c:
            java.lang.String r0 = "callback"
            goto L_0x0381
        L_0x037f:
            java.lang.String r0 = "twoFactorAuthManager"
        L_0x0381:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0386:
            java.lang.Object r3 = r13.A01
            com.whatsapp.chatlock.dialogs.ChatLockForgotSecretCodeUnlockClearDialog r3 = (com.whatsapp.chatlock.dialogs.ChatLockForgotSecretCodeUnlockClearDialog) r3
            int r1 = r3.A00
            android.content.DialogInterface$OnClickListener r0 = r3.A01
            com.whatsapp.chatlock.dialogs.ChatLockConfirmUnlockClearDialog r2 = new com.whatsapp.chatlock.dialogs.ChatLockConfirmUnlockClearDialog
            r2.<init>()
            r2.A00 = r1
            r2.A01 = r0
            X.1GP r1 = r3.A1F()
            java.lang.String r0 = "continue"
            r2.A2F(r1, r0)
            goto L_0x03fb
        L_0x03a1:
            java.lang.Object r1 = r13.A01
            com.whatsapp.chatlock.ChatLockSettingsActivity r1 = (com.whatsapp.chatlock.ChatLockSettingsActivity) r1
            r0 = 0
            com.whatsapp.chatlock.ChatLockSettingsActivity.A0Q(r1, r0)
            r1.A4b()
            android.view.View r2 = r1.A00
            android.content.res.Resources r1 = X.C72463Mc.A0H(r1, r2)
            r0 = 2131897155(0x7f122b43, float:1.9429192E38)
            X.C31191fA.A00(r1, r2, r0)
            goto L_0x03fb
        L_0x03b9:
            java.lang.Object r2 = r13.A01
            X.4PE r2 = (X.AnonymousClass4PE) r2
            X.18K r12 = r2.A04
            X.2r5 r11 = r2.A07
            X.1Nl r10 = r2.A05
            java.util.Set r9 = r2.A0A
            X.4Wz r8 = r2.A08
            X.1iW r1 = r2.A03
            X.5ah r7 = r2.A02
            X.5ag r6 = r2.A01
            X.1BI r5 = r2.A06
            boolean r0 = r2.A0B
            java.lang.Integer r4 = r2.A09
            int r3 = r2.A00
            r2 = 1
            X.C88224Yu.A02(r12, r10, r11, r9, r2)
            r1.A0q(r9, r0)
            r1 = 4
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x03ef
            int r0 = r8.A00
            if (r0 != r1) goto L_0x03ef
            r0 = 5
            r8.A00 = r0
            r0 = 2
            if (r3 < r2) goto L_0x03ec
            r0 = 4
        L_0x03ec:
            X.C87794Wz.A00(r8, r0)
        L_0x03ef:
            r7.Br8()
            if (r4 == 0) goto L_0x03fb
            int r0 = r4.intValue()
            r6.C5c(r5, r0)
        L_0x03fb:
            r14.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aq.onClick(android.content.DialogInterface, int):void");
    }
}
