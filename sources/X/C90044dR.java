package X;

import android.view.View;
import com.whatsapp.group.view.custom.GroupDetailsCard;

/* renamed from: X.4dR  reason: invalid class name and case insensitive filesystem */
public class C90044dR implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C90044dR(GroupDetailsCard groupDetailsCard, int i) {
        this.A00 = i;
        switch (i) {
            case 32:
            case 33:
                this.A01 = groupDetailsCard;
                return;
            default:
                this.A01 = groupDetailsCard;
                return;
        }
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C90044dR(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x021f, code lost:
        r2.A00(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0222, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02ad, code lost:
        r3 = "waIntents";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02c2, code lost:
        X.C18070vi.A11(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02c6, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r2.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r3 = "contextualHelpHandler";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0495, code lost:
        r4 = new X.C21355Aik(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x049c, code lost:
        if (r5.A0S == null) goto L_0x04d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04a0, code lost:
        if (r5.A0m == false) goto L_0x04d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04a2, code lost:
        r3 = X.AnonymousClass4a6.A00(r5);
        r3.A0R(X.AnonymousClass3MY.A0D(android.view.LayoutInflater.from(r5), 2131625544));
        r3.A0D(2131891196);
        r3.A0g(r5, new X.C91604fx(r4, 41), 2131899286);
        r3.A0e(r5, new X.AnonymousClass7AL(0), 2131898766);
        r3.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04d6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04d7, code lost:
        r4.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04da, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0513, code lost:
        com.whatsapp.group.newgroup.GroupVisibilitySettingDialog.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0516, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0606, code lost:
        r0.CFY();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0609, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        r3 = "communityWamEventHelper";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fe, code lost:
        if (r0 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r0 == null) goto L_0x02c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x05fc;
                case 1: goto L_0x05e3;
                case 2: goto L_0x05da;
                case 3: goto L_0x05b5;
                case 4: goto L_0x0381;
                case 5: goto L_0x0595;
                case 6: goto L_0x057d;
                case 7: goto L_0x0575;
                case 8: goto L_0x056d;
                case 9: goto L_0x0565;
                case 10: goto L_0x055d;
                case 11: goto L_0x0555;
                case 12: goto L_0x054d;
                case 13: goto L_0x0533;
                case 14: goto L_0x0362;
                case 15: goto L_0x0276;
                case 16: goto L_0x052d;
                case 17: goto L_0x0083;
                case 18: goto L_0x0053;
                case 19: goto L_0x052d;
                case 20: goto L_0x0039;
                case 21: goto L_0x0523;
                case 22: goto L_0x0517;
                case 23: goto L_0x050e;
                case 24: goto L_0x0508;
                case 25: goto L_0x0223;
                case 26: goto L_0x04fe;
                case 27: goto L_0x04db;
                case 28: goto L_0x048f;
                case 29: goto L_0x0479;
                case 30: goto L_0x0472;
                case 31: goto L_0x052d;
                case 32: goto L_0x046a;
                case 33: goto L_0x0462;
                case 34: goto L_0x02b0;
                case 35: goto L_0x052d;
                case 36: goto L_0x045a;
                case 37: goto L_0x044a;
                case 38: goto L_0x0442;
                case 39: goto L_0x045a;
                case 40: goto L_0x00ba;
                case 41: goto L_0x043a;
                case 42: goto L_0x0013;
                case 43: goto L_0x01ff;
                case 44: goto L_0x03ba;
                case 45: goto L_0x0134;
                case 46: goto L_0x0109;
                case 47: goto L_0x052d;
                case 48: goto L_0x0026;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r12.A01
            com.whatsapp.inappsupport.ui.ContactUsActivity r1 = (com.whatsapp.inappsupport.ui.ContactUsActivity) r1
            boolean r0 = X.AnonymousClass3MW.A1Y(r1)
            if (r0 != 0) goto L_0x03a0
            com.whatsapp.inappsupport.ui.ContactUsActivity.A0Q(r1)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r1 = r12.A01
            com.whatsapp.identity.ScanQrCodeActivity r1 = (com.whatsapp.identity.ScanQrCodeActivity) r1
            com.whatsapp.qrcode.WaQrScannerView r0 = r1.A0B
            java.lang.String r3 = "qrScannerView"
            if (r0 == 0) goto L_0x02c2
            r0.CNk()
            com.whatsapp.qrcode.WaQrScannerView r0 = r1.A0B
            if (r0 != 0) goto L_0x0606
            goto L_0x02c2
        L_0x0026:
            java.lang.Object r1 = r12.A01
            com.whatsapp.inappsupport.ui.AboutAiSupportAssistantBottomSheet r1 = (com.whatsapp.inappsupport.ui.AboutAiSupportAssistantBottomSheet) r1
            X.00H r0 = r1.A00
            if (r0 == 0) goto L_0x004f
            X.1o3 r2 = X.AnonymousClass3MW.A0a(r0)
            X.1FL r1 = r1.A1D()
            java.lang.String r0 = "saga-help-article"
            goto L_0x004b
        L_0x0039:
            java.lang.Object r1 = r12.A01
            com.whatsapp.group.hosted.ui.GroupSecureMessageFragment r1 = (com.whatsapp.group.hosted.ui.GroupSecureMessageFragment) r1
            X.00H r0 = r1.A04
            if (r0 == 0) goto L_0x004f
            X.1o3 r2 = X.AnonymousClass3MW.A0a(r0)
            X.1FL r1 = r1.A1D()
            java.lang.String r0 = "privacy-and-security-for-business-messages"
        L_0x004b:
            r2.A01(r1, r0)
            return
        L_0x004f:
            java.lang.String r3 = "contextualHelpHandler"
            goto L_0x02c2
        L_0x0053:
            java.lang.Object r3 = r12.A01
            com.whatsapp.group.SelectOrCreateCommunityBottomSheetFragment r3 = (com.whatsapp.group.SelectOrCreateCommunityBottomSheetFragment) r3
            X.1ub r4 = r3.A01
            if (r4 == 0) goto L_0x00b6
            X.00H r0 = r4.A05
            java.lang.String r7 = X.C72463Mc.A0o(r0)
            java.lang.Integer r5 = X.AnonymousClass3MY.A0j(r0)
            r6 = 0
            r9 = 16
            r10 = 10
            r8 = r6
            r4.A0D(r5, r6, r7, r8, r9, r10)
            r3.A28()
            X.11t r2 = r3.A00
            if (r2 == 0) goto L_0x03ae
            X.1FL r1 = r3.A1D()
            X.0vl r0 = r3.A04
            X.1EC r0 = X.AnonymousClass3MX.A0p(r0)
            r2.COG(r1, r0)
            return
        L_0x0083:
            java.lang.Object r1 = r12.A01
            com.whatsapp.group.SelectOrCreateCommunityBottomSheetFragment r1 = (com.whatsapp.group.SelectOrCreateCommunityBottomSheetFragment) r1
            X.1ub r3 = r1.A01
            if (r3 == 0) goto L_0x00b6
            X.00H r0 = r3.A05
            java.lang.String r6 = X.C72463Mc.A0o(r0)
            java.lang.Integer r4 = X.AnonymousClass3MY.A0j(r0)
            r5 = 0
            r8 = 15
            r9 = 10
            r7 = r5
            r3.A0D(r4, r5, r6, r7, r8, r9)
            r1.A28()
            X.11t r4 = r1.A00
            if (r4 == 0) goto L_0x03b4
            X.1FL r3 = r1.A1D()
            r2 = 3
            X.0vl r0 = r1.A04
            X.1EC r1 = X.AnonymousClass3MX.A0p(r0)
            r0 = 8
            r4.CNv(r3, r1, r0, r2)
            return
        L_0x00b6:
            java.lang.String r3 = "communityWamEventHelper"
            goto L_0x02c2
        L_0x00ba:
            java.lang.Object r4 = r12.A01
            com.whatsapp.identity.ScanQrCodeActivity r4 = (com.whatsapp.identity.ScanQrCodeActivity) r4
            com.whatsapp.qrcode.WaQrScannerView r0 = r4.A0B
            if (r0 != 0) goto L_0x00c6
            java.lang.String r3 = "qrScannerView"
            goto L_0x02c2
        L_0x00c6:
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0012
            X.1Vi r0 = r4.A04
            if (r0 == 0) goto L_0x0105
            X.17x r0 = r0.A00
            java.lang.String r5 = "android.permission.CAMERA"
            int r0 = r0.A02(r5)
            if (r0 != 0) goto L_0x060a
            com.whatsapp.qrcode.QrScannerOverlay r0 = r4.A0A
            if (r0 != 0) goto L_0x00e2
            java.lang.String r3 = "qrScannerOverlay"
            goto L_0x02c2
        L_0x00e2:
            r1 = 0
            r0.setVisibility(r1)
            com.whatsapp.qrcode.WaQrScannerView r0 = r4.A0B
            java.lang.String r2 = "qrScannerView"
            if (r0 == 0) goto L_0x0100
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r1 = r4.A02
            if (r1 != 0) goto L_0x00f7
            java.lang.String r3 = "errorIndicatorView"
            goto L_0x02c2
        L_0x00f7:
            r0 = 8
            r1.setVisibility(r0)
            com.whatsapp.qrcode.WaQrScannerView r0 = r4.A0B
            if (r0 != 0) goto L_0x0606
        L_0x0100:
            X.C18070vi.A11(r2)
            goto L_0x02c5
        L_0x0105:
            java.lang.String r3 = "cameraPermissionsHelper"
            goto L_0x02c2
        L_0x0109:
            java.lang.Object r1 = r12.A01
            X.3RY r1 = (X.AnonymousClass3RY) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.setRetryLayoutVisibility(r0)
            X.5Xz r1 = r1.A04
            if (r1 == 0) goto L_0x0012
            X.4nz r1 = (X.C96524nz) r1
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r3 = r1.A01
            android.net.Uri[] r0 = r3.A0P
            int r2 = r1.A00
            r1 = r0[r2]
            if (r1 == 0) goto L_0x012b
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = X.AnonymousClass3MZ.A0v(r3)
            r0.A0T(r1, r2)
        L_0x012b:
            X.4Po r2 = X.C72473Md.A0V(r3)
            r1 = 0
            r0 = 15
            goto L_0x021f
        L_0x0134:
            java.lang.Object r2 = r12.A01
            X.3RY r2 = (X.AnonymousClass3RY) r2
            r7 = 0
            X.C18070vi.A0d(r2, r7)
            X.3zK r1 = new X.3zK
            r1.<init>()
            java.lang.Integer r0 = X.C17880vN.A0l()
            r1.A01 = r0
            X.18K r0 = r2.getWamRuntime()
            r0.CC4(r1)
            com.whatsapp.inappsupport.ui.AddScreenshotImageView r1 = r2.getAddScreenshotImageView()
            android.graphics.Bitmap r0 = r1.A02
            if (r0 == 0) goto L_0x015c
            r0.recycle()
            r0 = 0
            r1.A02 = r0
        L_0x015c:
            com.whatsapp.inappsupport.ui.AddScreenshotImageView.A02(r1)
            r2.setRemoveButtonVisibility(r7)
            r2.setRetryLayoutVisibility(r7)
            X.5Xy r0 = r2.A03
            if (r0 == 0) goto L_0x0012
            X.4ny r0 = (X.C96514ny) r0
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r2 = r0.A01
            android.net.Uri[] r1 = r2.A0P
            int r5 = r0.A00
            r0 = 0
            r1[r5] = r0
            X.0vl r4 = r2.A0R
            java.lang.Object r1 = r4.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r1 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r1
            if (r5 != 0) goto L_0x01f6
            X.1DT r0 = r1.A02
        L_0x0180:
            java.lang.Object r1 = r0.A06()
            X.41U r0 = X.AnonymousClass41U.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            java.lang.Object r6 = r4.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r6 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r6
            if (r0 == 0) goto L_0x01db
            X.00H r0 = r6.A0B
            java.lang.Object r0 = r0.get()
            X.6oC r0 = (X.C133116oC) r0
            java.util.HashMap r3 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x01b4
            java.lang.Object r0 = r3.get(r1)
            X.34B r0 = (X.AnonymousClass34B) r0
            if (r0 == 0) goto L_0x01b1
            r0.A08(r7)
        L_0x01b1:
            r3.remove(r1)
        L_0x01b4:
            X.41S r0 = X.AnonymousClass41S.A00
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel.A00(r0, r6, r5)
        L_0x01b9:
            java.lang.Object r0 = r4.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r0
            X.1DS r0 = r0.A05
            java.lang.Object r0 = r0.A06()
            boolean r0 = X.C72463Mc.A1Y(r0)
            java.lang.String r3 = "mediaUploadErrorMessageViewStubHolder"
            X.1bI r1 = r2.A0J
            if (r0 == 0) goto L_0x01d6
            if (r1 == 0) goto L_0x02c2
            r0 = 0
        L_0x01d2:
            r1.A04(r0)
            return
        L_0x01d6:
            if (r1 == 0) goto L_0x02c2
            r0 = 8
            goto L_0x01d2
        L_0x01db:
            X.4Ut[] r1 = r6.A04
            r0 = 0
            r1[r5] = r0
            if (r5 == 0) goto L_0x01f3
            r0 = 1
            if (r5 == r0) goto L_0x01f0
            r0 = 2
            if (r5 != r0) goto L_0x01b9
            X.1DT r1 = r6.A01
        L_0x01ea:
            X.41S r0 = X.AnonymousClass41S.A00
            r1.A0F(r0)
            goto L_0x01b9
        L_0x01f0:
            X.1DT r1 = r6.A00
            goto L_0x01ea
        L_0x01f3:
            X.1DT r1 = r6.A02
            goto L_0x01ea
        L_0x01f6:
            r0 = 1
            if (r5 != r0) goto L_0x01fc
            X.1DT r0 = r1.A00
            goto L_0x0180
        L_0x01fc:
            X.1DT r0 = r1.A01
            goto L_0x0180
        L_0x01ff:
            java.lang.Object r3 = r12.A01
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r3 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r3
            X.00H r0 = r3.A0N
            if (r0 == 0) goto L_0x02ad
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.inappbugreporting.BugReportingCategoriesActivity"
            r2.setClassName(r1, r0)
            r0 = 3
            r3.startActivityForResult(r2, r0)
            X.4Po r2 = X.C72473Md.A0V(r3)
            r1 = 0
            r0 = 21
        L_0x021f:
            r2.A00(r0, r1)
            return
        L_0x0223:
            java.lang.Object r8 = r12.A01
            com.whatsapp.group.newgroup.NewGroup r8 = (com.whatsapp.group.newgroup.NewGroup) r8
            X.00H r0 = r8.A0c
            java.lang.Object r1 = r0.get()
            X.4Zv r1 = (X.C88474Zv) r1
            r0 = 14
            X.C88474Zv.A01(r1, r0)
            android.os.Bundle r0 = r8.A03
            if (r0 == 0) goto L_0x0012
            X.02n r7 = r8.A0v
            X.00H r0 = r8.A0g
            r0.get()
            android.os.Bundle r6 = r8.A03
            com.whatsapp.WaEditText r0 = r8.A08
            java.lang.String r5 = X.AnonymousClass3Ma.A12(r0)
            X.1EC r4 = r8.A0S
            boolean r3 = r8.A0n
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r8.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupPermissionsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "setting_values"
            r2.putExtra(r0, r6)
            r1 = 0
            if (r3 == 0) goto L_0x0261
            r1 = 7
        L_0x0261:
            java.lang.String r0 = "entry_point"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "group_subject"
            r2.putExtra(r0, r5)
            if (r4 == 0) goto L_0x0272
            java.lang.String r0 = "parent_gid"
            X.AnonymousClass3MY.A12(r2, r4, r0)
        L_0x0272:
            r7.A03(r2)
            return
        L_0x0276:
            java.lang.Object r4 = r12.A01
            com.whatsapp.group.ReportGroupPrivacyTipDialogFragment r4 = (com.whatsapp.group.ReportGroupPrivacyTipDialogFragment) r4
            r0 = 2
            r4.A00 = r0
            r4.A28()
            X.1LU r0 = r4.A02
            if (r0 == 0) goto L_0x02ad
            X.1FL r0 = r4.A1D()
            android.content.Context r0 = r0.getApplicationContext()
            X.C18070vi.A0X(r0)
            java.lang.String r3 = "privacy_groupadd"
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsPrivacy"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "target_setting"
            r2.putExtra(r0, r3)
            X.1FL r0 = r4.A1B()
            if (r0 == 0) goto L_0x0012
            r0.startActivity(r2)
            return
        L_0x02ad:
            java.lang.String r3 = "waIntents"
            goto L_0x02c2
        L_0x02b0:
            r5 = 0
            X.C18070vi.A0d(r13, r5)
            java.lang.Object r4 = r12.A01
            com.whatsapp.group.view.custom.GroupDetailsCard r4 = (com.whatsapp.group.view.custom.GroupDetailsCard) r4
            X.4fi r3 = r4.A0G
            if (r3 == 0) goto L_0x0012
            X.3zh r1 = r4.A0F
            if (r1 != 0) goto L_0x02c7
            java.lang.String r3 = "wamGroupInfo"
        L_0x02c2:
            X.C18070vi.A11(r3)
        L_0x02c5:
            r0 = 0
            throw r0
        L_0x02c7:
            r11 = 1
            r2 = 4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r1.A02 = r0
            java.lang.Integer r0 = r4.A0O
            if (r0 == 0) goto L_0x0012
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x030b
            r0 = 3
            if (r1 == r0) goto L_0x033c
            if (r1 == r11) goto L_0x0635
            r0 = 2
            if (r1 == r0) goto L_0x02e5
            r0 = 5
            if (r1 == r0) goto L_0x02e5
            return
        L_0x02e5:
            X.1VP r5 = r4.getCallsManager()
            X.1E7 r3 = r4.A0C
            if (r3 != 0) goto L_0x02f0
            java.lang.String r3 = "groupChat"
            goto L_0x02c2
        L_0x02f0:
            X.1MZ r2 = r4.getGroupParticipantsManager()
            X.11S r1 = r4.getMeManager()
            X.1M9 r0 = r4.getContactManager()
            java.util.List r3 = X.C63982u1.A04(r1, r0, r2, r3)
            android.content.Context r2 = r4.getContext()
            X.1EC r1 = r4.A0I
            if (r1 != 0) goto L_0x062f
            java.lang.String r3 = "gid"
            goto L_0x02c2
        L_0x030b:
            android.content.Context r0 = r4.getContext()
            boolean r0 = r0 instanceof X.AnonymousClass1FL
            if (r0 == 0) goto L_0x0012
            android.content.Context r1 = r4.getContext()
            java.lang.Class<X.1FL> r0 = X.AnonymousClass1FL.class
            android.app.Activity r5 = X.AnonymousClass1L9.A01(r1, r0)
            X.1FL r5 = (X.AnonymousClass1FL) r5
            X.1M9 r6 = r4.getContactManager()
            X.1EC r7 = r4.A0I
            java.lang.String r3 = "gid"
            if (r7 == 0) goto L_0x02c2
            X.1MZ r1 = r4.getGroupParticipantsManager()
            X.11S r0 = r4.getMeManager()
            java.util.ArrayList r8 = X.C63982u1.A03(r0, r1, r7)
            r10 = 24
            r9 = 0
            X.AnonymousClass74H.A09(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x033c:
            X.9Bw r5 = r3.A06
            X.2mw r2 = r3.A02
            r3 = 11
            if (r5 == 0) goto L_0x0354
            X.1VP r2 = r4.getCallsManager()
            android.content.Context r1 = r4.getContext()
            boolean r0 = r5.A0W()
            r2.BhC(r1, r5, r3, r0)
            return
        L_0x0354:
            if (r2 == 0) goto L_0x0012
            X.1VP r1 = r4.getCallsManager()
            android.content.Context r0 = r4.getContext()
            r1.CO2(r0, r2, r3)
            return
        L_0x0362:
            java.lang.Object r1 = r12.A01
            com.whatsapp.WaEditText r1 = (com.whatsapp.WaEditText) r1
            r1.requestFocus()
            r0 = 0
            r1.A0I(r0)
            int r0 = r1.getSelectionStart()
            if (r0 <= 0) goto L_0x0379
            int r0 = r1.getSelectionEnd()
            if (r0 > 0) goto L_0x0012
        L_0x0379:
            int r0 = X.AnonymousClass3Ma.A03(r1)
            r1.setSelection(r0)
            return
        L_0x0381:
            java.lang.Object r1 = r12.A01
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            X.1EC r4 = r1.A4l()
            if (r4 == 0) goto L_0x0012
            X.00H r0 = r1.A20
            java.lang.Object r3 = r0.get()
            X.1rO r3 = (X.C38501rO) r3
            X.1GP r2 = r1.getSupportFragmentManager()
            java.lang.Integer r1 = X.C17880vN.A0i()
            r0 = 0
            r3.A05(r2, r4, r1, r0)
            return
        L_0x03a0:
            X.6uc r1 = r1.A0F
            boolean r0 = r1.A03()
            int r0 = X.C72453Mb.A03(r0)
            r1.A01(r0)
            return
        L_0x03ae:
            java.lang.String r0 = "communityNavigator"
            X.C18070vi.A11(r0)
            throw r6
        L_0x03b4:
            java.lang.String r0 = "communityNavigator"
            X.C18070vi.A11(r0)
            throw r5
        L_0x03ba:
            java.lang.Object r1 = r12.A01
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r1 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r1
            r7 = 0
            X.11C r0 = r1.A08
            android.view.inputmethod.InputMethodManager r2 = r0.A0N()
            if (r2 == 0) goto L_0x03da
            android.view.View r0 = r1.getCurrentFocus()
            if (r0 == 0) goto L_0x03da
            android.view.View r0 = r1.getCurrentFocus()
            if (r0 == 0) goto L_0x03fe
            android.os.IBinder r0 = r0.getWindowToken()
        L_0x03d7:
            r2.hideSoftInputFromWindow(r0, r7)
        L_0x03da:
            boolean r0 = X.AnonymousClass3MW.A1Y(r1)
            if (r0 != 0) goto L_0x0400
            X.1GP r1 = r1.getSupportFragmentManager()
            r0 = 2131892932(0x7f121ac4, float:1.9420626E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 2131888732(0x7f120a5c, float:1.9412108E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r9 = 2131899286(0x7f123396, float:1.9433514E38)
            r6 = r4
            r7 = r4
            r8 = r4
            r5 = r4
            X.AnonymousClass9P2.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x03fe:
            r0 = 0
            goto L_0x03d7
        L_0x0400:
            X.11S r0 = r1.A02
            r0.A0I()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x0436
            X.1CM r0 = r1.A07
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x0436
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r2 = X.AnonymousClass3MZ.A0v(r1)
            com.whatsapp.WaEditText r0 = r1.A0A
            r3 = 0
            if (r0 != 0) goto L_0x0420
            java.lang.String r0 = "titleEditText"
            X.C18070vi.A11(r0)
            throw r3
        L_0x0420:
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x042a
            java.lang.String r3 = r0.toString()
        L_0x042a:
            java.lang.String r4 = com.whatsapp.inappbugreporting.InAppBugReportingActivity.A03(r1)
            android.net.Uri[] r6 = r1.A0P
            java.lang.String r5 = r1.A0O
            r2.A0U(r3, r4, r5, r6, r7)
            return
        L_0x0436:
            com.whatsapp.inappbugreporting.InAppBugReportingActivity.A0V(r1)
            return
        L_0x043a:
            java.lang.Object r0 = r12.A01
            com.whatsapp.identity.ScanQrCodeActivity r0 = (com.whatsapp.identity.ScanQrCodeActivity) r0
            com.whatsapp.identity.ScanQrCodeActivity.A03(r0)
            return
        L_0x0442:
            java.lang.Object r0 = r12.A01
            com.whatsapp.identity.IdentityVerificationActivity r0 = (com.whatsapp.identity.IdentityVerificationActivity) r0
            com.whatsapp.identity.IdentityVerificationActivity.A0s(r0)
            return
        L_0x044a:
            java.lang.Object r3 = r12.A01
            X.1FU r3 = (X.AnonymousClass1FU) r3
            X.1KB r2 = r3.A05
            r1 = 4
            X.7Pd r0 = new X.7Pd
            r0.<init>(r3, r1)
            r2.A0J(r0)
            return
        L_0x045a:
            java.lang.Object r0 = r12.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            r0.onBackPressed()
            return
        L_0x0462:
            java.lang.Object r0 = r12.A01
            com.whatsapp.group.view.custom.GroupDetailsCard r0 = (com.whatsapp.group.view.custom.GroupDetailsCard) r0
            com.whatsapp.group.view.custom.GroupDetailsCard.setupClickListeners$lambda$2(r0, r13)
            return
        L_0x046a:
            java.lang.Object r0 = r12.A01
            com.whatsapp.group.view.custom.GroupDetailsCard r0 = (com.whatsapp.group.view.custom.GroupDetailsCard) r0
            com.whatsapp.group.view.custom.GroupDetailsCard.setupClickListeners$lambda$1(r0, r13)
            return
        L_0x0472:
            java.lang.Object r5 = r12.A01
            com.whatsapp.group.newgroup.NewGroup r5 = (com.whatsapp.group.newgroup.NewGroup) r5
            r0 = 35
            goto L_0x0495
        L_0x0479:
            java.lang.Object r2 = r12.A01
            X.1FB r2 = (X.AnonymousClass1FB) r2
            X.3Rj r1 = X.AnonymousClass4a6.A00(r2)
            r0 = 2131896614(0x7f122926, float:1.9428094E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A0S(r0)
            X.C73203Rj.A04(r2, r1)
            return
        L_0x048f:
            java.lang.Object r5 = r12.A01
            com.whatsapp.group.newgroup.NewGroup r5 = (com.whatsapp.group.newgroup.NewGroup) r5
            r0 = 40
        L_0x0495:
            X.Aik r4 = new X.Aik
            r4.<init>(r5, r0)
            X.1EC r0 = r5.A0S
            if (r0 == 0) goto L_0x04d7
            boolean r0 = r5.A0m
            if (r0 == 0) goto L_0x04d7
            X.3Rj r3 = X.AnonymousClass4a6.A00(r5)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r0 = 2131625544(0x7f0e0648, float:1.8878299E38)
            android.view.View r0 = X.AnonymousClass3MY.A0D(r1, r0)
            r3.A0R(r0)
            r0 = 2131891196(0x7f1213fc, float:1.9417105E38)
            r3.A0D(r0)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 41
            X.4fx r0 = new X.4fx
            r0.<init>(r4, r1)
            r3.A0g(r5, r0, r2)
            r2 = 2131898766(0x7f12318e, float:1.943246E38)
            r1 = 0
            X.7AL r0 = new X.7AL
            r0.<init>(r1)
            r3.A0e(r5, r0, r2)
            r3.A0C()
            return
        L_0x04d7:
            r4.run()
            return
        L_0x04db:
            java.lang.Object r3 = r12.A01
            com.whatsapp.group.newgroup.NewGroup r3 = (com.whatsapp.group.newgroup.NewGroup) r3
            X.00H r0 = r3.A0c
            java.lang.Object r1 = r0.get()
            X.4Zv r1 = (X.C88474Zv) r1
            r0 = 15
            X.C88474Zv.A01(r1, r0)
            X.1E7 r2 = r3.A0x
            com.whatsapp.WaEditText r0 = r3.A08
            java.lang.String r0 = X.AnonymousClass3Ma.A12(r0)
            r2.A0R = r0
            X.1Up r1 = r3.A0V
            r0 = 12
            r1.A07(r3, r2, r0)
            return
        L_0x04fe:
            java.lang.Object r0 = r12.A01
            com.whatsapp.group.newgroup.NewGroup r0 = (com.whatsapp.group.newgroup.NewGroup) r0
            com.whatsapp.WaEditText r0 = r0.A07
            r0.requestFocus()
            return
        L_0x0508:
            java.lang.Object r1 = r12.A01
            com.whatsapp.group.newgroup.GroupVisibilitySettingDialog r1 = (com.whatsapp.group.newgroup.GroupVisibilitySettingDialog) r1
            r0 = 1
            goto L_0x0513
        L_0x050e:
            java.lang.Object r1 = r12.A01
            com.whatsapp.group.newgroup.GroupVisibilitySettingDialog r1 = (com.whatsapp.group.newgroup.GroupVisibilitySettingDialog) r1
            r0 = 0
        L_0x0513:
            com.whatsapp.group.newgroup.GroupVisibilitySettingDialog.A00(r1, r0)
            return
        L_0x0517:
            java.lang.Object r0 = r12.A01
            X.4Ug r0 = (X.C87094Ug) r0
            X.1Di r1 = r0.A02
            X.1E7 r0 = r0.A01
            r1.invoke(r0)
            return
        L_0x0523:
            java.lang.Object r0 = r12.A01
            X.4Sn r0 = (X.AnonymousClass4Sn) r0
            X.0vk r0 = r0.A00
            r0.invoke()
            return
        L_0x052d:
            java.lang.Object r0 = r12.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x0533:
            java.lang.Object r0 = r12.A01
            com.whatsapp.group.HistorySettingActivity r0 = (com.whatsapp.group.HistorySettingActivity) r0
            X.0vl r0 = r0.A06
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.group.HistorySettingViewModel r3 = (com.whatsapp.group.HistorySettingViewModel) r3
            X.1OX r2 = X.C41561wd.A00(r3)
            r1 = 0
            com.whatsapp.group.HistorySettingViewModel$onEnabledClick$1 r0 = new com.whatsapp.group.HistorySettingViewModel$onEnabledClick$1
            r0.<init>(r3, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            return
        L_0x054d:
            java.lang.Object r0 = r12.A01
            com.whatsapp.group.GroupPermissionsLayout r0 = (com.whatsapp.group.GroupPermissionsLayout) r0
            com.whatsapp.group.GroupPermissionsLayout.setClickEventListener$lambda$4(r0, r13)
            return
        L_0x0555:
            java.lang.Object r0 = r12.A01
            com.whatsapp.group.GroupPermissionsLayout r0 = (com.whatsapp.group.GroupPermissionsLayout) r0
            com.whatsapp.group.GroupPermissionsLayout.setClickEventListener$lambda$3(r0, r13)
            return
        L_0x055d:
            java.lang.Object r0 = r12.A01
            com.whatsapp.group.GroupPermissionsLayout r0 = (com.whatsapp.group.GroupPermissionsLayout) r0
            com.whatsapp.group.GroupPermissionsLayout.setClickEventListener$lambda$2(r0, r13)
            return
        L_0x0565:
            java.lang.Object r0 = r12.A01
            com.whatsapp.group.GroupPermissionsLayout r0 = (com.whatsapp.group.GroupPermissionsLayout) r0
            com.whatsapp.group.GroupPermissionsLayout.setClickEventListener$lambda$1(r0, r13)
            return
        L_0x056d:
            java.lang.Object r0 = r12.A01
            com.whatsapp.group.GroupPermissionsLayout r0 = (com.whatsapp.group.GroupPermissionsLayout) r0
            com.whatsapp.group.GroupPermissionsLayout.setClickEventListener$lambda$0(r0, r13)
            return
        L_0x0575:
            java.lang.Object r0 = r12.A01
            com.whatsapp.group.GroupPermissionsActivity r0 = (com.whatsapp.group.GroupPermissionsActivity) r0
            r0.onBackPressed()
            return
        L_0x057d:
            java.lang.Object r0 = r12.A01
            X.48t r0 = (X.C825448t) r0
            com.whatsapp.group.GroupMembersSelector r2 = r0.A00
            X.00H r0 = r2.A08
            java.lang.Object r1 = r0.get()
            X.4Zv r1 = (X.C88474Zv) r1
            r0 = 10
            X.C88474Zv.A01(r1, r0)
            r0 = 1
            com.whatsapp.group.GroupMembersSelector.A0z(r2, r0)
            return
        L_0x0595:
            java.lang.Object r4 = r12.A01
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            android.content.Context r0 = r4.getApplicationContext()
            X.1EC r3 = r4.A1K
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupPendingParticipantsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "gid"
            X.AnonymousClass3MY.A12(r2, r3, r0)
            r4.startActivity(r2)
            return
        L_0x05b5:
            java.lang.Object r6 = r12.A01
            com.whatsapp.group.GroupChatInfoActivity r6 = (com.whatsapp.group.GroupChatInfoActivity) r6
            X.1EC r5 = r6.A4l()
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
        L_0x05da:
            java.lang.Object r1 = r12.A01
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            r0 = 0
            com.whatsapp.group.GroupChatInfoActivity.A1H(r1, r0)
            return
        L_0x05e3:
            java.lang.Object r2 = r12.A01
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            X.00H r0 = r2.A1z
            java.lang.Object r0 = r0.get()
            X.0zA r0 = (X.C19880zA) r0
            r0.A03()
            com.whatsapp.group.hosted.ui.GroupSecureMessageFragment r1 = new com.whatsapp.group.hosted.ui.GroupSecureMessageFragment
            r1.<init>()
            r0 = 0
            r2.CMk(r1, r0)
            return
        L_0x05fc:
            java.lang.Object r0 = r12.A01
            X.3o2 r0 = (X.C76733o2) r0
            X.4SE r0 = r0.A0A
            r0.A00()
            return
        L_0x0606:
            r0.CFY()
            return
        L_0x060a:
            r3 = 1
            X.6q5 r2 = new X.6q5
            r2.<init>(r4)
            r0 = 2131232198(0x7f0805c6, float:1.8080498E38)
            r2.A01 = r0
            r0 = 2131894287(0x7f12200f, float:1.9423375E38)
            r2.A02 = r0
            r0 = 2131894286(0x7f12200e, float:1.9423372E38)
            r2.A03 = r0
            java.lang.String[] r1 = new java.lang.String[r3]
            r0 = 0
            r1[r0] = r5
            r2.A01(r1)
            android.content.Intent r0 = r2.A00()
            r4.startActivityForResult(r0, r3)
            return
        L_0x062f:
            r0 = 10
            r5.BjS(r2, r1, r3, r0)
            return
        L_0x0635:
            com.whatsapp.group.view.custom.GroupDetailsCard.A02(r13, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90044dR.onClick(android.view.View):void");
    }

    public C90044dR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
