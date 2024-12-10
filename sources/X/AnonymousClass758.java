package X;

import android.content.DialogInterface;

/* renamed from: X.758  reason: invalid class name */
public class AnonymousClass758 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass758(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C73203Rj r1, Object obj, int i, int i2) {
        r1.A0X(new AnonymousClass758(obj, i), i2);
    }

    public static void A01(C73203Rj r1, Object obj, int i, int i2) {
        r1.A0Z(new AnonymousClass758(obj, i), i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment$DiscardChangesConfirmationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: com.whatsapp.status.playback.MessageReplyActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02c2, code lost:
        if (r6.A05 != true) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02c5, code lost:
        if (r6 != null) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02c9, code lost:
        if (r6.A06 != true) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02cb, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02cc, code lost:
        r2.A04(new X.C139786zR(r1, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0347, code lost:
        r5.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x034a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0383, code lost:
        r0 = 17;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x040e, code lost:
        X.AnonymousClass4Yv.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0411, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0471, code lost:
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0474, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04ce, code lost:
        r0 = "xFamilyUserFlowLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04d3, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04d7, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0137, code lost:
        r1.C2Z(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0213, code lost:
        r0 = "waStartupSharedPreferences";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0217, code lost:
        r0 = "time";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x021b, code lost:
        r0 = "waSharedPreferences";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x021f, code lost:
        r0 = "activityUtils";
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r13, int r14) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0483;
                case 1: goto L_0x047b;
                case 2: goto L_0x0475;
                case 3: goto L_0x0475;
                case 4: goto L_0x0464;
                case 5: goto L_0x0454;
                case 6: goto L_0x042d;
                case 7: goto L_0x0412;
                case 8: goto L_0x0408;
                case 9: goto L_0x0402;
                case 10: goto L_0x03fa;
                case 11: goto L_0x03eb;
                case 12: goto L_0x03e3;
                case 13: goto L_0x00be;
                case 14: goto L_0x00b2;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x03da;
                case 19: goto L_0x03d3;
                case 20: goto L_0x03cc;
                case 21: goto L_0x03a2;
                case 22: goto L_0x0394;
                case 23: goto L_0x0387;
                case 24: goto L_0x037b;
                case 25: goto L_0x0376;
                case 26: goto L_0x0367;
                case 27: goto L_0x0005;
                case 28: goto L_0x0317;
                case 29: goto L_0x007f;
                case 30: goto L_0x0290;
                case 31: goto L_0x0249;
                case 32: goto L_0x00ca;
                case 33: goto L_0x0235;
                case 34: goto L_0x022b;
                case 35: goto L_0x0223;
                case 36: goto L_0x01db;
                case 37: goto L_0x006d;
                case 38: goto L_0x03e3;
                case 39: goto L_0x017a;
                case 40: goto L_0x015d;
                case 41: goto L_0x013b;
                case 42: goto L_0x0120;
                case 43: goto L_0x00ee;
                case 44: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A28()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r12.A01
            com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment r0 = (com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment) r0
            X.6hv r1 = r0.A02
            X.6yI r3 = r1.A01
            X.00H r0 = r3.A00
            java.lang.Object r6 = r0.get()
            X.730 r6 = (X.AnonymousClass730) r6
            java.lang.String r7 = r1.A02
            r9 = 0
            r4 = 0
            r8 = 2131889130(0x7f120bea, float:1.9412915E38)
            r5 = r4
            r10 = r9
            X.AnonymousClass730.A01(r4, r5, r6, r7, r8, r9, r10)
            X.00H r4 = r3.A04
            X.1dR r2 = X.C108945cZ.A13(r4)
            java.lang.String r1 = "is_auto_crosspost"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r2.A02(r0, r1)
            X.1dR r2 = X.C108945cZ.A13(r4)
            X.00H r0 = r3.A01
            X.1mM r1 = X.C108945cZ.A11(r0)
            java.lang.Integer r0 = X.C139146yI.A05
            X.C108995ce.A1G(r1, r2, r0)
            X.1dR r1 = X.C108945cZ.A13(r4)
            java.lang.String r0 = "TAP_NOT_NOW"
            r1.A03(r0)
            X.00H r0 = r3.A02
            java.lang.Object r3 = r0.get()
            X.6uW r3 = (X.C136856uW) r3
            r2 = 1
            X.6tC r1 = r3.A02
            if (r1 == 0) goto L_0x000c
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x000c
            r1.A02 = r9
            r1.A04 = r2
            X.89a r0 = r3.A00
            if (r0 == 0) goto L_0x000c
            r0.C9e(r1)
            return
        L_0x006d:
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r1 = r0.A1D()
            boolean r0 = r1 instanceof X.C22558BCr
            if (r0 == 0) goto L_0x000c
            X.BCr r1 = (X.C22558BCr) r1
            r1.finish()
            return
        L_0x007f:
            java.lang.Object r4 = r12.A01
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment$DiscardChangesConfirmationDialogFragment r4 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment.DiscardChangesConfirmationDialogFragment) r4
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x000c
            X.77K r0 = r4.A04
            if (r0 == 0) goto L_0x00b0
            boolean r0 = r0.A05
        L_0x008d:
            X.1dR r1 = r4.A02
            if (r1 == 0) goto L_0x04ce
            java.lang.Boolean r3 = X.C108945cZ.A1A(r0)
            java.lang.String r0 = "initial_auto_setting"
            r1.A02(r3, r0)
            X.1dR r1 = r4.A02
            if (r1 == 0) goto L_0x04ce
            r2 = 1
            java.lang.String r0 = "final_auto_setting"
            r1.A02(r3, r0)
            X.1dR r1 = r4.A02
            if (r1 == 0) goto L_0x04ce
            java.lang.String r0 = "TAP_CHANGES_DISCARD"
            r1.A03(r0)
            r4.A03 = r2
            return
        L_0x00b0:
            r0 = 0
            goto L_0x008d
        L_0x00b2:
            java.lang.Object r0 = r12.A01
            com.whatsapp.report.ShareReportConfirmationDialogFragment r0 = (com.whatsapp.report.ShareReportConfirmationDialogFragment) r0
            X.87q r0 = r0.A00
            if (r0 == 0) goto L_0x000c
            r0.CLd()
            return
        L_0x00be:
            java.lang.Object r0 = r12.A01
            com.whatsapp.report.DeleteReportConfirmationDialogFragment r0 = (com.whatsapp.report.DeleteReportConfirmationDialogFragment) r0
            X.87p r0 = r0.A00
            if (r0 == 0) goto L_0x000c
            r0.BIN()
            return
        L_0x00ca:
            java.lang.Object r0 = r12.A01
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet r0 = (com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet) r0
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r3 = X.C108965cb.A0c(r0)
            X.77d r2 = r0.A05
            if (r2 != 0) goto L_0x00da
            java.lang.String r0 = "sticker"
            goto L_0x04d3
        L_0x00da:
            X.6u8 r1 = r0.A06
            if (r1 != 0) goto L_0x00e2
            java.lang.String r0 = "stickerInfo"
            goto L_0x04d3
        L_0x00e2:
            X.6Ra r0 = r0.A07
            if (r0 != 0) goto L_0x00ea
            java.lang.String r0 = "origin"
            goto L_0x04d3
        L_0x00ea:
            r3.A0T(r2, r1, r0)
            return
        L_0x00ee:
            java.lang.Object r0 = r12.A01
            com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment r0 = (com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment) r0
            X.6hv r5 = r0.A02
            boolean r4 = r0.A01
            X.6yI r2 = r5.A01
            X.00H r0 = r2.A01
            X.1mM r1 = X.C108945cZ.A11(r0)
            java.lang.Integer r0 = X.C139146yI.A05
            r1.A05(r0, r4)
            X.00H r3 = r2.A04
            X.1dR r2 = X.C108945cZ.A13(r3)
            java.lang.String r1 = "is_auto_crosspost"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.A02(r0, r1)
            X.1dR r1 = X.C108945cZ.A13(r3)
            java.lang.String r0 = "TAP_SHARE_NOW"
            r1.A04(r0)
            X.89d r1 = r5.A00
            java.util.List r0 = r5.A03
            goto L_0x0137
        L_0x0120:
            java.lang.Object r0 = r12.A01
            com.whatsapp.xfamily.crossposting.ui.AudienceNuxDialogFragment r0 = (com.whatsapp.xfamily.crossposting.ui.AudienceNuxDialogFragment) r0
            X.6gs r2 = r0.A00
            X.6yI r0 = r2.A01
            X.00H r0 = r0.A04
            X.1dR r1 = X.C108945cZ.A13(r0)
            java.lang.String r0 = "TAP_SHARE_NOW"
            r1.A04(r0)
            X.89d r1 = r2.A00
            java.util.List r0 = r2.A02
        L_0x0137:
            r1.C2Z(r0)
            return
        L_0x013b:
            java.lang.Object r3 = r12.A01
            com.whatsapp.xfamily.crossposting.ui.AudienceNuxDialogFragment r3 = (com.whatsapp.xfamily.crossposting.ui.AudienceNuxDialogFragment) r3
            X.6gs r0 = r3.A00
            X.6yI r1 = r0.A01
            X.00H r0 = r1.A04
            X.1dR r2 = X.C108945cZ.A13(r0)
            X.00H r0 = r1.A01
            X.1mM r1 = X.C108945cZ.A11(r0)
            java.lang.Integer r0 = X.C139146yI.A05
            X.C108995ce.A1G(r1, r2, r0)
            java.lang.String r0 = "TAP_NOT_NOW"
            r2.A03(r0)
            r3.A28()
            return
        L_0x015d:
            java.lang.Object r1 = r12.A01
            com.whatsapp.webview.ui.WaInAppBrowsingActivity r1 = (com.whatsapp.webview.ui.WaInAppBrowsingActivity) r1
            r0 = 1
            X.C18070vi.A0d(r13, r0)
            r13.dismiss()
            X.5ey r0 = r1.A03
            if (r0 == 0) goto L_0x0176
            r0.canGoBack()
            X.5ey r0 = r1.A03
            if (r0 == 0) goto L_0x0176
            r0.goBack()
        L_0x0176:
            r0 = 0
            r1.A01 = r0
            return
        L_0x017a:
            java.lang.Object r4 = r12.A01
            com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment r4 = (com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment) r4
            java.lang.String r0 = "WfacBanBaseFragment/showRemoveAccountDialog/remove current account"
            X.C31081ez.A02(r0)
            X.1L9 r2 = r4.A00
            if (r2 == 0) goto L_0x021f
            X.1FL r1 = r4.A1D()
            X.1LU r0 = r4.A06
            if (r0 == 0) goto L_0x01d7
            X.1FL r5 = r4.A1D()
            X.0z4 r0 = r4.A03
            if (r0 == 0) goto L_0x021b
            int r8 = r0.A0E()
            X.11P r0 = r4.A02
            if (r0 == 0) goto L_0x0217
            long r10 = android.os.SystemClock.elapsedRealtime()
            X.11O r0 = r4.A04
            if (r0 == 0) goto L_0x0213
            java.lang.String r7 = r0.A01()
            r6 = 0
            r9 = 20
            android.content.Intent r0 = X.AnonymousClass1LU.A1X(r5, r6, r7, r8, r9, r10)
            r2.A08(r1, r0)
            X.6om r3 = X.C108975cc.A0Q(r4)
            com.whatsapp.waffle.wfac.ui.WfacBanViewModel r0 = r4.A08
            java.lang.String r1 = "viewModel"
            if (r0 != 0) goto L_0x01c3
            X.C18070vi.A11(r1)
            throw r6
        L_0x01c3:
            int r2 = r0.A0T()
            com.whatsapp.waffle.wfac.ui.WfacBanViewModel r0 = r4.A08
            if (r0 != 0) goto L_0x01cf
            X.C18070vi.A11(r1)
            throw r6
        L_0x01cf:
            int r1 = r0.A00
            java.lang.String r0 = "account_removed"
            r3.A01(r0, r2, r1)
            return
        L_0x01d7:
            java.lang.String r0 = "waIntents"
            goto L_0x04d3
        L_0x01db:
            java.lang.Object r3 = r12.A01
            com.whatsapp.userban.ui.fragment.BanAppealBaseFragment r3 = (com.whatsapp.userban.ui.fragment.BanAppealBaseFragment) r3
            java.lang.String r0 = "BanAppealBaseFragment/showRemoveAccountDialog/remove current account"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1L9 r2 = r3.A00
            if (r2 == 0) goto L_0x021f
            X.1FL r1 = r3.A1D()
            X.1FL r4 = r3.A1D()
            X.0z4 r0 = r3.A02
            if (r0 == 0) goto L_0x021b
            int r7 = r0.A0E()
            X.11P r0 = r3.A01
            if (r0 == 0) goto L_0x0217
            long r9 = android.os.SystemClock.elapsedRealtime()
            X.11O r0 = r3.A03
            if (r0 == 0) goto L_0x0213
            java.lang.String r6 = r0.A01()
            r5 = 0
            r8 = 16
            android.content.Intent r0 = X.AnonymousClass1LU.A1X(r4, r5, r6, r7, r8, r9)
            r2.A08(r1, r0)
            return
        L_0x0213:
            java.lang.String r0 = "waStartupSharedPreferences"
            goto L_0x04d3
        L_0x0217:
            java.lang.String r0 = "time"
            goto L_0x04d3
        L_0x021b:
            java.lang.String r0 = "waSharedPreferences"
            goto L_0x04d3
        L_0x021f:
            java.lang.String r0 = "activityUtils"
            goto L_0x04d3
        L_0x0223:
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A29()
            return
        L_0x022b:
            java.lang.Object r1 = r12.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            goto L_0x0471
        L_0x0235:
            java.lang.Object r0 = r12.A01
            com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment r0 = (com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment) r0
            X.00H r0 = r0.A01
            X.A59 r3 = X.C108945cZ.A0e(r0)
            r2 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 1
            r3.A03(r1, r0, r2)
            return
        L_0x0249:
            java.lang.Object r2 = r12.A01
            com.whatsapp.stickers.StarStickerFromPickerDialogFragment r2 = (com.whatsapp.stickers.StarStickerFromPickerDialogFragment) r2
            X.77d r6 = r2.A01
            java.lang.String r0 = r6.A0H
            if (r0 != 0) goto L_0x025d
            X.1SB r1 = r2.A02
            java.util.Set r0 = java.util.Collections.singleton(r6)
            r1.A0I(r0)
            return
        L_0x025d:
            android.os.Bundle r0 = r2.A15()
            java.lang.String r1 = "position"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x028e
            android.os.Bundle r0 = r2.A15()
            int r0 = r0.getInt(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x0275:
            X.1SB r1 = r2.A02
            X.1Ns r0 = r2.A00
            X.6LJ r4 = new X.6LJ
            r4.<init>(r0, r1)
            X.10I r3 = r2.A04
            r0 = 1
            android.util.Pair[] r2 = new android.util.Pair[r0]
            android.util.Pair r1 = X.C108945cZ.A0N(r6, r5)
            r0 = 0
            r2[r0] = r1
            r3.CGD(r4, r2)
            return
        L_0x028e:
            r5 = 0
            goto L_0x0275
        L_0x0290:
            java.lang.Object r5 = r12.A01
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment$DiscardChangesConfirmationDialogFragment r5 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment.DiscardChangesConfirmationDialogFragment) r5
            X.77K r6 = r5.A04
            if (r6 == 0) goto L_0x02a5
            java.lang.ref.WeakReference r0 = r5.A06
            java.lang.Object r0 = r0.get()
            X.883 r0 = (X.AnonymousClass883) r0
            if (r0 == 0) goto L_0x02a5
            r0.C6j(r6)
        L_0x02a5:
            boolean r0 = r5.A07
            r4 = 1
            if (r0 == 0) goto L_0x02d4
            X.6R1 r0 = r5.A05
            int r1 = r0.ordinal()
            r3 = 0
            if (r1 == r4) goto L_0x02d7
            r0 = 2
            if (r1 == r0) goto L_0x02d7
            r0 = 3
            if (r1 != r0) goto L_0x02d4
            com.whatsapp.bridge.wfal.WfalManager r2 = r5.A00
            if (r2 == 0) goto L_0x030f
            if (r6 == 0) goto L_0x02c4
            boolean r0 = r6.A05
            r1 = 1
            if (r0 == r4) goto L_0x02c7
        L_0x02c4:
            r1 = 0
            if (r6 == 0) goto L_0x02cc
        L_0x02c7:
            boolean r0 = r6.A06
            if (r0 != r4) goto L_0x02cc
            r3 = 1
        L_0x02cc:
            X.6zR r0 = new X.6zR
            r0.<init>(r1, r3)
            r2.A04(r0)
        L_0x02d4:
            r5.A03 = r4
            goto L_0x0347
        L_0x02d7:
            if (r6 == 0) goto L_0x02db
            boolean r3 = r6.A05
        L_0x02db:
            X.1dR r2 = r5.A02
            if (r2 == 0) goto L_0x04ce
            java.lang.Boolean r1 = X.C108945cZ.A1A(r3)
            java.lang.String r0 = "initial_auto_setting"
            r2.A02(r1, r0)
            java.lang.String r1 = "final_auto_setting"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.A02(r0, r1)
            java.lang.String r0 = "TAP_CHANGES_SAVE"
            r2.A04(r0)
            r2.A01()
            X.0ve r2 = r5.A02
            X.0vf r1 = X.C18040vf.A01
            r0 = 5584(0x15d0, float:7.825E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x02d4
            X.1mM r1 = r5.A01
            if (r1 == 0) goto L_0x0313
            java.lang.Integer r0 = com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment.A0Q
            r1.A05(r0, r3)
            goto L_0x02d4
        L_0x030f:
            java.lang.String r0 = "wfalManager"
            goto L_0x04d3
        L_0x0313:
            java.lang.String r0 = "fbAccountManager"
            goto L_0x04d3
        L_0x0317:
            java.lang.Object r5 = r12.A01
            com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment r5 = (com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment) r5
            r3 = 0
            X.1Le r0 = r5.A02
            if (r0 == 0) goto L_0x04d1
            boolean r0 = r0.A0I()
            r2 = 0
            if (r0 != 0) goto L_0x0340
            X.1Le r0 = r5.A02
            if (r0 == 0) goto L_0x0361
            r0.A0G(r2, r3)
            X.10I r1 = r5.A04
            r0 = 4
            X.AnonymousClass7RI.A01(r1, r5, r0)
            X.1Mm r1 = r5.A00
            if (r1 == 0) goto L_0x035b
            com.whatsapp.jobqueue.job.SendStatusPrivacyListJob r0 = new com.whatsapp.jobqueue.job.SendStatusPrivacyListJob
            r0.<init>(r2, r3)
            r1.A01(r0)
        L_0x0340:
            X.880 r0 = r5.A03
            if (r0 == 0) goto L_0x034b
            r0.C6k()
        L_0x0347:
            r5.A28()
            return
        L_0x034b:
            X.1FL r1 = r5.A1B()
            boolean r0 = r1 instanceof X.AnonymousClass880
            if (r0 == 0) goto L_0x0347
            X.880 r1 = (X.AnonymousClass880) r1
            if (r1 == 0) goto L_0x0347
            r1.C6k()
            goto L_0x0347
        L_0x035b:
            java.lang.String r0 = "waJobManager"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0361:
            java.lang.String r0 = "statusStore"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0367:
            java.lang.Object r1 = r12.A01
            com.whatsapp.status.playback.fragment.OpenLinkDialogFragment r1 = (com.whatsapp.status.playback.fragment.OpenLinkDialogFragment) r1
            X.89L r0 = r1.A04
            if (r0 == 0) goto L_0x0372
            r0.BrX()
        L_0x0372:
            r1.A29()
            return
        L_0x0376:
            java.lang.Object r1 = r12.A01
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x0383
        L_0x037b:
            java.lang.Object r1 = r12.A01
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            r0 = 1
            com.whatsapp.status.playback.MessageReplyActivity.A13(r1, r0)
        L_0x0383:
            r0 = 17
            goto L_0x040e
        L_0x0387:
            java.lang.Object r1 = r12.A01
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass4Yv.A00(r1, r0)
            com.whatsapp.status.playback.MessageReplyActivity.A0w(r1)
            return
        L_0x0394:
            java.lang.Object r0 = r12.A01
            com.whatsapp.status.crossposting.privacy.ShareToFacebookActivity r0 = (com.whatsapp.status.crossposting.privacy.ShareToFacebookActivity) r0
            X.1dR r1 = r0.A4b()
            java.lang.String r0 = "TAP_UNLINK_CANCEL"
            r1.A04(r0)
            return
        L_0x03a2:
            java.lang.Object r4 = r12.A01
            com.whatsapp.status.crossposting.privacy.ShareToFacebookActivity r4 = (com.whatsapp.status.crossposting.privacy.ShareToFacebookActivity) r4
            X.1KB r0 = r4.A05
            X.C18070vi.A0W(r0)
            X.6p4 r3 = new X.6p4
            r3.<init>(r0)
            r0 = 2131886431(0x7f12015f, float:1.940744E38)
            r3.A01(r0)
            X.1dR r1 = r4.A4b()
            java.lang.String r0 = "TAP_UNLINK_DISABLE"
            r1.A04(r0)
            X.10I r2 = r4.A05
            r1 = 45
            X.7Pl r0 = new X.7Pl
            r0.<init>(r4, r3, r1)
            r2.CGF(r0)
            return
        L_0x03cc:
            java.lang.Object r1 = r12.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 27
            goto L_0x040e
        L_0x03d3:
            java.lang.Object r1 = r12.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 26
            goto L_0x040e
        L_0x03da:
            java.lang.Object r1 = r12.A01
            X.6pz r1 = (X.C134086pz) r1
            r0 = 1
            r1.A00(r0)
            return
        L_0x03e3:
            java.lang.Object r0 = r12.A01
            X.0vk r0 = (X.C18090vk) r0
            X.AnonymousClass3Ma.A1Q(r0)
            return
        L_0x03eb:
            java.lang.Object r1 = r12.A01
            com.whatsapp.registration.sendsmstowa.SendSmsToWa r1 = (com.whatsapp.registration.sendsmstowa.SendSmsToWa) r1
            r0 = 1
            r1.A0W = r0
            java.lang.Long r0 = X.C17890vO.A0L()
            com.whatsapp.registration.sendsmstowa.SendSmsToWa.A0s(r1, r0)
            return
        L_0x03fa:
            java.lang.Object r0 = r12.A01
            X.87i r0 = (X.C1601587i) r0
            r0.Buc()
            return
        L_0x0402:
            java.lang.Object r0 = r12.A01
            X.C108945cZ.A1Q(r0)
            return
        L_0x0408:
            java.lang.Object r1 = r12.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 106(0x6a, float:1.49E-43)
        L_0x040e:
            X.AnonymousClass4Yv.A00(r1, r0)
            return
        L_0x0412:
            java.lang.Object r2 = r12.A01
            com.whatsapp.notification.PopupNotification r2 = (com.whatsapp.notification.PopupNotification) r2
            X.00H r0 = r2.A17
            X.1pj r1 = X.AnonymousClass3MW.A0V(r0)
            X.1E7 r0 = r2.A0i
            com.whatsapp.jid.Jid r0 = X.C72453Mb.A0m(r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r1.A0I(r2, r0)
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass4Yv.A00(r2, r0)
            return
        L_0x042d:
            java.lang.Object r3 = r12.A01
            com.whatsapp.migration.export.ui.ExportMigrationActivity r3 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r3
            X.9pX r2 = X.C108965cb.A0S(r3)
            java.lang.String r1 = r3.A0L
            r0 = 6
            r2.A00(r1, r0)
            X.18K r1 = r3.A0B
            r2 = 8
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            java.lang.String r1 = X.C83974Hj.A00(r1, r2)
            r0 = 0
            android.content.Intent r2 = X.AnonymousClass1LU.A1U(r3, r1, r0, r2)
            X.1L9 r1 = r3.A01
            r0 = 5000(0x1388, float:7.006E-42)
            r1.A0D(r3, r2, r0)
            return
        L_0x0454:
            java.lang.Object r0 = r12.A01
            com.whatsapp.migration.export.ui.ExportMigrationActivity r0 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r0
            X.9pX r2 = X.C108965cb.A0S(r0)
            java.lang.String r1 = r0.A0L
            r0 = 9
            r2.A00(r1, r0)
            return
        L_0x0464:
            java.lang.Object r1 = r12.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "ExportMigrationActivity/cancelMigrationAndReturn/unknown/resultCode: 0"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r1.setResult(r0)
        L_0x0471:
            r1.finish()
            return
        L_0x0475:
            java.lang.Object r0 = r12.A01
            X.C108945cZ.A1P(r0)
            return
        L_0x047b:
            java.lang.Object r0 = r12.A01
            com.whatsapp.mediaview.MediaViewBaseFragment r0 = (com.whatsapp.mediaview.MediaViewBaseFragment) r0
            r0.A2D()
            return
        L_0x0483:
            java.lang.Object r5 = r12.A01
            X.7JF r5 = (X.AnonymousClass7JF) r5
            r0 = 1
            X.C18070vi.A0d(r13, r0)
            X.70N r6 = r5.A0V
            java.util.List r4 = r6.A04
            java.util.List r3 = X.C108995ce.A0d(r4)
            java.util.Iterator r2 = r3.iterator()
        L_0x0497:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04ac
            java.lang.Object r1 = r2.next()
            r4.remove(r1)
            X.73u r0 = r6.A01
            if (r1 != r0) goto L_0x0497
            r0 = 0
            r6.A01 = r0
            goto L_0x0497
        L_0x04ac:
            X.6yr r4 = r6.A03
            java.util.Iterator r3 = r3.iterator()
        L_0x04b2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x04c7
            X.73u r2 = X.C108945cZ.A0k(r3)
            java.util.List r1 = r4.A00
            X.80F r0 = new X.80F
            r0.<init>(r2)
            X.C29401cD.A0N(r1, r0)
            goto L_0x04b2
        L_0x04c7:
            X.AnonymousClass7JF.A01(r5)
            r13.dismiss()
            return
        L_0x04ce:
            java.lang.String r0 = "xFamilyUserFlowLogger"
            goto L_0x04d3
        L_0x04d1:
            java.lang.String r0 = "statusStore"
        L_0x04d3:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass758.onClick(android.content.DialogInterface, int):void");
    }
}
