package X;

import android.view.View;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;

/* renamed from: X.4dX  reason: invalid class name and case insensitive filesystem */
public class C90104dX implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C90104dX(VerifyPhoneNumber verifyPhoneNumber, int i) {
        this.A00 = i;
        this.A02 = verifyPhoneNumber;
        this.A01 = 47;
    }

    public static void A00(View view, Object obj, int i, int i2) {
        view.setOnClickListener(new C90104dX(obj, i, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x036c, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0435, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0438, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0489, code lost:
        if (X.C72483Me.A1C(r2) == false) goto L_0x0495;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x048b, code lost:
        X.AnonymousClass4Yv.A01(X.AnonymousClass3MW.A0P(r2), 603);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0494, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0495, code lost:
        X.C87684Wn.A00(r2.A4G, 4);
        X.AnonymousClass4aY.A1L(r2, r3);
        r2.A24.A0H("payment", "payment_composer_icon", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x057a, code lost:
        r0 = "viewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x057f, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0583, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r4 == 1) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x021f, code lost:
        if (r0.length() == 0) goto L_0x0221;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0547;
                case 1: goto L_0x053b;
                case 2: goto L_0x01c0;
                case 3: goto L_0x018e;
                case 4: goto L_0x018e;
                case 5: goto L_0x017a;
                case 6: goto L_0x0137;
                case 7: goto L_0x0106;
                case 8: goto L_0x052f;
                case 9: goto L_0x0523;
                case 10: goto L_0x00e4;
                case 11: goto L_0x0508;
                case 12: goto L_0x04f7;
                case 13: goto L_0x04b4;
                case 14: goto L_0x04a8;
                case 15: goto L_0x047f;
                case 16: goto L_0x0474;
                case 17: goto L_0x046a;
                case 18: goto L_0x0439;
                case 19: goto L_0x0427;
                case 20: goto L_0x0414;
                case 21: goto L_0x0408;
                case 22: goto L_0x00a4;
                case 23: goto L_0x0005;
                case 24: goto L_0x0005;
                case 25: goto L_0x03fb;
                case 26: goto L_0x0390;
                case 27: goto L_0x0372;
                case 28: goto L_0x0364;
                case 29: goto L_0x034e;
                case 30: goto L_0x0343;
                case 31: goto L_0x02b2;
                case 32: goto L_0x0298;
                case 33: goto L_0x027c;
                case 34: goto L_0x0074;
                case 35: goto L_0x0025;
                case 36: goto L_0x0272;
                case 37: goto L_0x024c;
                case 38: goto L_0x023a;
                case 39: goto L_0x01fd;
                case 40: goto L_0x0015;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r12.A02
            X.3Om r2 = (X.C72973Om) r2
            int r1 = r12.A01
            int r0 = r2.A00
            if (r0 == r1) goto L_0x0014
            r2.A00 = r1
            r2.notifyDataSetChanged()
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r0 = r12.A02
            org.npci.upi.security.pinactivitycomponent.Keypad r0 = (org.npci.upi.security.pinactivitycomponent.Keypad) r0
            X.88l r1 = r0.A04
            if (r1 == 0) goto L_0x0014
            int r0 = r12.A01
            int r0 = r0 + 7
            r1.BAK(r0)
            return
        L_0x0025:
            java.lang.Object r2 = r12.A02
            com.whatsapp.storage.StorageUsageGallerySortBottomSheet r2 = (com.whatsapp.storage.StorageUsageGallerySortBottomSheet) r2
            int r4 = r12.A01
            r2.A28()
            X.3Qe r13 = (X.AnonymousClass3Qe) r13
            com.whatsapp.WaImageView r0 = r13.A00
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0014
            X.3Qe r0 = r2.A01
            r1 = 0
            r0.setChecked(r1)
            X.3Qe r0 = r2.A02
            r0.setChecked(r1)
            X.3Qe r0 = r2.A03
            r0.setChecked(r1)
            r3 = 1
            r13.setChecked(r3)
            X.4M4 r0 = r2.A00
            if (r0 == 0) goto L_0x0014
            com.whatsapp.storage.StorageUsageGalleryActivity r0 = r0.A00
            com.whatsapp.storage.StorageUsageMediaGalleryFragment r2 = r0.A0M
            if (r2 == 0) goto L_0x0014
            int r0 = r2.A03
            if (r0 == r4) goto L_0x0014
            r2.A03 = r4
            com.whatsapp.scroller.RecyclerFastScroller r1 = r2.A0I
            if (r1 == 0) goto L_0x006a
            if (r4 == 0) goto L_0x0066
            r0 = 8
            if (r4 != r3) goto L_0x0067
        L_0x0066:
            r0 = 0
        L_0x0067:
            r1.setVisibility(r0)
        L_0x006a:
            r0 = 0
            r2.A01 = r0
            r2.A2B()
            r2.A2F(r0, r3)
            return
        L_0x0074:
            java.lang.Object r3 = r12.A02
            X.5lK r3 = (X.C112345lK) r3
            int r2 = r12.A01
            java.util.List r1 = r3.A03
            if (r1 != 0) goto L_0x0082
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
        L_0x0082:
            if (r2 < 0) goto L_0x0014
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0014
            java.lang.Object r0 = r1.get(r2)
            X.6sx r0 = (X.C135906sx) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0014
            X.725 r0 = r3.A01
            if (r0 == 0) goto L_0x0014
            java.util.List r0 = r0.A07
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0014
            X.C112345lK.A06(r3, r2)
            return
        L_0x00a4:
            java.lang.Object r0 = r12.A02
            X.3Wu r0 = (X.C73653Wu) r0
            int r2 = r12.A01
            X.4Ls r1 = r0.A00
            if (r1 == 0) goto L_0x0014
            java.util.List r0 = r0.A01
            java.lang.Object r5 = r0.get(r2)
            X.4V4 r5 = (X.AnonymousClass4V4) r5
            com.whatsapp.ml.v2.storageusage.MLModelStorageUsageActivity r4 = r1.A00
            X.C18070vi.A0h(r4, r5)
            X.4Mi r0 = new X.4Mi
            r0.<init>(r5, r4)
            com.whatsapp.ml.v2.storageusage.MLRemoveModelDialog r3 = new com.whatsapp.ml.v2.storageusage.MLRemoveModelDialog
            r3.<init>(r4)
            r3.A00 = r0
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r1 = "ml_scope_storage_dialog_title"
            java.lang.String r0 = r5.A02
            r2.putString(r1, r0)
            java.lang.String r1 = "ml_scope_storage_dialog_message"
            java.lang.String r0 = r5.A01
            r2.putString(r1, r0)
            r3.A1R(r2)
            X.1GP r0 = r4.getSupportFragmentManager()
            X.C20098A7b.A01(r3, r0)
            return
        L_0x00e4:
            java.lang.Object r5 = r12.A02
            com.whatsapp.calling.dialer.DialerActivity r5 = (com.whatsapp.calling.dialer.DialerActivity) r5
            int r0 = r12.A01
            char r4 = (char) r0
            java.util.ArrayList r0 = com.whatsapp.calling.dialer.DialerActivity.A0I
            com.whatsapp.calling.dialer.DialerViewModel r3 = X.AnonymousClass3MZ.A0X(r5)
            java.lang.StringBuilder r2 = r3.A0C
            int r1 = r2.length()
            r0 = 32
            if (r1 >= r0) goto L_0x0014
            r2.append(r4)
            com.whatsapp.calling.dialer.DialerViewModel.A03(r3)
            r0 = 0
            com.whatsapp.calling.dialer.DialerActivity.A0c(r5, r0)
            return
        L_0x0106:
            java.lang.Object r0 = r12.A02
            X.3WR r0 = (X.AnonymousClass3WR) r0
            int r4 = r12.A01
            com.whatsapp.bot.prompts.BonsaiPromptsViewModel r1 = r0.A00
            if (r4 < 0) goto L_0x0014
            X.1vp r3 = r1.A05
            java.util.List r0 = X.AnonymousClass3MW.A10(r3)
            int r0 = X.AnonymousClass1ZU.A04(r0)
            if (r4 > r0) goto L_0x0014
            X.1BI r2 = r1.A00
            if (r2 == 0) goto L_0x0014
            java.util.List r0 = X.AnonymousClass3MW.A10(r3)
            java.lang.Object r0 = r0.get(r4)
            X.24Z r0 = (X.AnonymousClass24Z) r0
            X.1iW r1 = r1.A02
            java.lang.String r0 = r0.A01
            r1.A0W(r2, r0)
            X.0wS r0 = X.C18460wS.A00
            r3.A0F(r0)
            return
        L_0x0137:
            java.lang.Object r0 = r12.A02
            X.3Wb r0 = (X.AnonymousClass3Wb) r0
            int r1 = r12.A01
            X.6bM r2 = r0.A00
            java.util.List r0 = r0.A02
            java.lang.Object r1 = r0.get(r1)
            X.6se r1 = (X.C135716se) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.String r6 = r1.A02
            com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet r5 = r2.A00
            X.5jD r4 = r5.A0J
            if (r4 == 0) goto L_0x057a
            r3 = 0
            X.00H r0 = r4.A0o
            X.1UD r0 = X.AnonymousClass3MW.A0X(r0)
            X.0ve r2 = r0.A00
            X.0vf r1 = X.C18040vf.A01
            r0 = 10851(0x2a63, float:1.5205E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0168
            r4.A06 = r6
        L_0x0168:
            X.1Pp r1 = r4.A0Z
            r0 = 1
            r1.A06(r0, r3)
            com.whatsapp.imagine.InputPrompt r1 = r5.A0Q
            if (r1 == 0) goto L_0x0014
            android.text.SpannableStringBuilder r0 = X.AnonymousClass3MW.A09(r6)
            r1.setText(r0)
            return
        L_0x017a:
            java.lang.Object r4 = r12.A02
            X.7CW r4 = (X.AnonymousClass7CW) r4
            int r3 = r12.A01
            int r0 = r4.A00
            if (r0 == r3) goto L_0x0014
            X.77B r2 = r4.A07
            X.ADd r1 = r4.A05
            X.86T r0 = r4.A06
            r0.Bds(r1, r2, r3)
            return
        L_0x018e:
            java.lang.Object r0 = r12.A02
            com.whatsapp.backup.google.RestoreTransferSelectorActivity r0 = (com.whatsapp.backup.google.RestoreTransferSelectorActivity) r0
            int r5 = r12.A01
            X.3TP r4 = r0.A00
            if (r4 == 0) goto L_0x057a
            X.1DT r3 = r4.A02
            java.lang.Object r0 = r3.A06()
            if (r0 == 0) goto L_0x0014
            java.util.List r2 = X.C41681wt.A01(r0)
            int r0 = X.AnonymousClass001.A0n(r2, r5)
            if (r0 != 0) goto L_0x0014
            java.lang.Integer r0 = X.C17880vN.A0h()
            r2.set(r5, r0)
            int r1 = r4.A00
            java.lang.Integer r0 = X.AnonymousClass3MY.A0f()
            r2.set(r1, r0)
            r4.A00 = r5
            r3.A0E(r2)
            return
        L_0x01c0:
            java.lang.Object r6 = r12.A02
            com.whatsapp.backup.google.RestoreFromBackupActivity r6 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r6
            r3 = 15
            X.00H r0 = r6.A0C
            java.lang.Object r0 = r0.get()
            X.11Z r0 = (X.AnonymousClass11Z) r0
            long r4 = r0.A01()
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            r0 = 0
            X.C17880vN.A1T(r1, r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r3 = 1
            r1[r3] = r0
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error/%d free space:%d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            X.9ug r1 = r6.A0C
            r0 = 10
            r1.A05(r0)
            com.whatsapp.backup.google.RestoreFromBackupActivity.A14(r6, r3)
            return
        L_0x01fd:
            java.lang.Object r3 = r12.A02
            com.whatsapp.twofactor.AddEmailActivity r3 = (com.whatsapp.twofactor.AddEmailActivity) r3
            int r4 = r12.A01
            X.00H r0 = r3.A05
            if (r0 == 0) goto L_0x0236
            java.lang.Object r5 = r0.get()
            X.9kJ r5 = (X.C190059kJ) r5
            java.lang.String r6 = r3.A06
            int r8 = r3.A00
            X.0z4 r0 = r3.A0A
            java.lang.String r0 = r0.A0o()
            if (r0 == 0) goto L_0x0221
            int r0 = r0.length()
            r10 = 9
            if (r0 != 0) goto L_0x0222
        L_0x0221:
            r10 = 1
        L_0x0222:
            r11 = 3
            r7 = 0
            r9 = 5
            r5.A00(r6, r7, r8, r9, r10, r11)
            X.1L9 r2 = r3.A01
            int r1 = r3.A00
            java.lang.String r0 = r3.A06
            android.content.Intent r0 = X.AnonymousClass1LU.A1Q(r3, r0, r4, r1)
            r2.A08(r3, r0)
            return
        L_0x0236:
            java.lang.String r0 = "emailVerificationLogger"
            goto L_0x057f
        L_0x023a:
            java.lang.Object r0 = r12.A02
            X.4qG r0 = (X.C97914qG) r0
            int r1 = r12.A01
            X.5bu r0 = r0.A03
            if (r1 == 0) goto L_0x0248
            r0.BzJ()
            return
        L_0x0248:
            r0.Bl0()
            return
        L_0x024c:
            java.lang.Object r3 = r12.A02
            X.4qG r3 = (X.C97914qG) r3
            int r2 = r12.A01
            if (r2 == 0) goto L_0x026b
            r1 = 1
            if (r2 == r1) goto L_0x0265
            r0 = 2
            if (r2 == r0) goto L_0x025e
            r3.Bd0()
            return
        L_0x025e:
            X.5bu r1 = r3.A03
            r0 = 1
            r1.Bta(r0)
            return
        L_0x0265:
            X.5bu r0 = r3.A03
            r0.Bmg(r1)
            return
        L_0x026b:
            X.5bu r1 = r3.A03
            r0 = 1
            r1.C60(r0)
            return
        L_0x0272:
            java.lang.Object r1 = r12.A02
            com.whatsapp.support.DescribeProblemActivity r1 = (com.whatsapp.support.DescribeProblemActivity) r1
            int r0 = r12.A01
            com.whatsapp.support.DescribeProblemActivity.A0s(r1, r0)
            return
        L_0x027c:
            java.lang.Object r1 = r12.A02
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            int r7 = r12.A01
            X.5tO r2 = r1.A0R
            boolean r0 = r1.A1Y
            r6 = 2
            if (r0 == 0) goto L_0x028a
            r6 = 5
        L_0x028a:
            X.1BI r0 = r1.A0h
            java.lang.Integer r3 = X.AnonymousClass6WK.A00(r0)
            r4 = 0
            r8 = 9
            r5 = r4
            r2.A0F(r3, r4, r5, r6, r7, r8)
            return
        L_0x0298:
            java.lang.Object r0 = r12.A02
            X.3Wg r0 = (X.C73513Wg) r0
            int r2 = r12.A01
            com.whatsapp.shareselection.ShareActionsViewModel r0 = r0.A02
            X.1wy r1 = r0.A01
            java.util.List r0 = r0.A00
            if (r0 != 0) goto L_0x02aa
            java.lang.String r0 = "shareActions"
            goto L_0x057f
        L_0x02aa:
            java.lang.Object r0 = r0.get(r2)
            r1.A0F(r0)
            return
        L_0x02b2:
            java.lang.Object r1 = r12.A02
            X.3Yj r1 = (X.C74063Yj) r1
            int r2 = r12.A01
            r0 = 2
            int[] r8 = new int[r0]
            r13.getLocationOnScreen(r8)
            X.3Wz r0 = r1.A00
            com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper r3 = r0.A02
            X.0ve r0 = r3.A01
            boolean r1 = X.AnonymousClass1J8.A01(r0)
            int[] r0 = r3.A03
            if (r1 == 0) goto L_0x02f6
            r7 = r0[r2]
            X.1BI r6 = X.C88594aB.A03(r3)
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r5 = "is_using_global_wallpaper"
            boolean r4 = X.AnonymousClass3MY.A1a(r0, r5)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.theme.preview.ThemesSolidColorWallpaperPreview"
            X.C72473Md.A0s(r2, r6, r1, r0)
            r2.putExtra(r5, r4)
            java.lang.String r0 = "scw_preview_color"
            r2.putExtra(r0, r7)
        L_0x02f1:
            r0 = 1
            r3.startActivityForResult(r2, r0)
            return
        L_0x02f6:
            r10 = r0[r2]
            X.1BI r9 = X.C88594aB.A03(r3)
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r7 = "is_using_global_wallpaper"
            r6 = 0
            boolean r5 = r0.getBooleanExtra(r7, r6)
            r4 = 1
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview"
            X.C72473Md.A0s(r2, r9, r1, r0)
            r2.putExtra(r7, r5)
            java.lang.String r0 = "scw_preview_color"
            r2.putExtra(r0, r10)
            java.lang.String r0 = "wallpaper_preview_intent_extra_animate"
            r2.putExtra(r0, r4)
            r1 = r8[r6]
            java.lang.String r0 = "wallpaper_preview_intent_extra_x"
            r2.putExtra(r0, r1)
            r1 = r8[r4]
            java.lang.String r0 = "wallpaper_preview_intent_extra_y"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "wallpaper_preview_intent_extra_width"
            int r0 = r13.getWidth()
            r2.putExtra(r1, r0)
            java.lang.String r1 = "wallpaper_preview_intent_extra_height"
            int r0 = r13.getHeight()
            r2.putExtra(r1, r0)
            goto L_0x02f1
        L_0x0343:
            java.lang.Object r1 = r12.A02
            X.3WF r1 = (X.AnonymousClass3WF) r1
            int r0 = r12.A01
            X.1Di r1 = r1.A07
            int r0 = r0 + -2
            goto L_0x036c
        L_0x034e:
            java.lang.Object r0 = r12.A02
            X.3Wv r0 = (X.C73663Wv) r0
            int r2 = r12.A01
            X.1Di r1 = r0.A01
            java.util.List r0 = r0.A00
            java.lang.Object r0 = r0.get(r2)
            X.4UC r0 = (X.AnonymousClass4UC) r0
            java.lang.String r0 = r0.A01
            r1.invoke(r0)
            return
        L_0x0364:
            java.lang.Object r1 = r12.A02
            X.BLp r1 = (X.C22705BLp) r1
            int r0 = r12.A01
            X.1Di r1 = r1.A01
        L_0x036c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0435
        L_0x0372:
            java.lang.Object r3 = r12.A02
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r3 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r3
            r0 = 47
            X.AnonymousClass4Yv.A00(r3, r0)
            X.00H r0 = r3.A18
            java.lang.Object r2 = r0.get()
            X.A8V r2 = (X.A8V) r2
            java.lang.String r1 = "flash_call_retry_dialog"
            java.lang.String r0 = "verify_with_sms"
            r2.A0H(r1, r0)
            int r0 = r3.A03
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1m(r3, r0)
            return
        L_0x0390:
            java.lang.Object r6 = r12.A02
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r6 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r6
            r0 = 47
            X.AnonymousClass4Yv.A00(r6, r0)
            r0 = 1
            r6.A1P = r0
            X.1jT r2 = r6.A0j
            r1 = 8
            r0 = 0
            X.C33841jT.A03(r2, r1, r0)
            X.00H r0 = r6.A18
            java.lang.Object r2 = r0.get()
            X.A8V r2 = (X.A8V) r2
            java.lang.String r1 = "flash_call_retry_dialog"
            java.lang.String r0 = "try_again"
            r2.A0H(r1, r0)
            X.A5R r1 = r6.A0v
            java.lang.String r0 = "sms"
            r3 = -1
            long r0 = r1.A02(r0, r3)
            X.A5R r5 = r6.A0v
            java.lang.String r2 = "voice"
            long r4 = r5.A02(r2, r3)
            r2 = 0
            r7 = 1
            android.content.Intent r10 = X.C17880vN.A0A()
            java.lang.String r9 = r6.getPackageName()
            java.lang.String r8 = "com.whatsapp.registration.verifyphone.VerifyPhoneNumber"
            android.content.Intent r9 = r10.setClassName(r9, r8)
            java.lang.String r8 = "sms_retry_time"
            android.content.Intent r1 = r9.putExtra(r8, r0)
            java.lang.String r0 = "voice_retry_time"
            android.content.Intent r1 = r1.putExtra(r0, r4)
            java.lang.String r0 = "wa_old_retry_time"
            android.content.Intent r1 = r1.putExtra(r0, r2)
            java.lang.String r0 = "has_retried_flash_call"
            android.content.Intent r1 = r1.putExtra(r0, r7)
            java.lang.String r0 = "should_request_flash_call"
            android.content.Intent r0 = r1.putExtra(r0, r7)
            r6.finish()
            r6.startActivity(r0)
            return
        L_0x03fb:
            java.lang.Object r2 = r12.A02
            X.8Hl r2 = (X.C161718Hl) r2
            int r1 = r12.A01
            r0 = 1
            r2.A02 = r0
            r2.A0G(r1)
            return
        L_0x0408:
            java.lang.Object r0 = r12.A02
            X.5l1 r0 = (X.C112155l1) r0
            int r1 = r12.A01
            X.87N r0 = r0.A0F
            r0.C8c(r1)
            return
        L_0x0414:
            java.lang.Object r4 = r12.A02
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r4 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r4
            int r3 = r12.A01
            X.4Po r2 = X.C72473Md.A0V(r4)
            r1 = 0
            r0 = 4
            r2.A00(r0, r1)
            com.whatsapp.inappbugreporting.InAppBugReportingActivity.A0c(r4, r3)
            return
        L_0x0427:
            java.lang.Object r0 = r12.A02
            X.3XN r0 = (X.AnonymousClass3XN) r0
            int r2 = r12.A01
            X.1Di r1 = r0.A02
            java.util.List r0 = r0.A00
            java.lang.Object r0 = r0.get(r2)
        L_0x0435:
            r1.invoke(r0)
            return
        L_0x0439:
            java.lang.Object r5 = r12.A02
            com.whatsapp.favorites.FavoriteEducationBottomSheetFragment r5 = (com.whatsapp.favorites.FavoriteEducationBottomSheetFragment) r5
            int r4 = r12.A01
            X.00H r0 = r5.A00
            if (r0 == 0) goto L_0x0466
            r0.get()
            X.1FL r0 = r5.A1D()
            r3 = 1
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.favorites.FavoritesActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "IS_EDIT"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "ENTRY_POINT"
            r2.putExtra(r0, r4)
            r5.A1k(r2)
            return
        L_0x0466:
            java.lang.String r0 = "waIntents"
            goto L_0x057f
        L_0x046a:
            java.lang.Object r1 = r12.A02
            X.28H r1 = (X.AnonymousClass28H) r1
            int r0 = r12.A01
            r1.A0V(r0)
            return
        L_0x0474:
            java.lang.Object r0 = r12.A02
            X.49i r0 = (X.C826849i) r0
            int r3 = r12.A01
            java.lang.Object r2 = r0.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            goto L_0x0485
        L_0x047f:
            java.lang.Object r2 = r12.A02
            X.4aY r2 = (X.AnonymousClass4aY) r2
            int r3 = r12.A01
        L_0x0485:
            boolean r0 = X.C72483Me.A1C(r2)
            if (r0 == 0) goto L_0x0495
            X.1FY r1 = X.AnonymousClass3MW.A0P(r2)
            r0 = 603(0x25b, float:8.45E-43)
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x0495:
            X.4Wn r1 = r2.A4G
            r0 = 4
            X.C87684Wn.A00(r1, r0)
            X.AnonymousClass4aY.A1L(r2, r3)
            X.5tO r2 = r2.A24
            java.lang.String r1 = "payment_composer_icon"
            java.lang.String r0 = "payment"
            r2.A0H(r0, r1, r3)
            return
        L_0x04a8:
            java.lang.Object r0 = r12.A02
            X.4Ns r0 = (X.C85524Ns) r0
            int r1 = r12.A01
            X.5ZL r0 = r0.A01
            r0.Bn2(r1)
            return
        L_0x04b4:
            java.lang.Object r7 = r12.A02
            com.whatsapp.conversation.EditMessageActivity r7 = (com.whatsapp.conversation.EditMessageActivity) r7
            int r6 = r12.A01
            X.00H r0 = r7.A0L
            if (r0 == 0) goto L_0x057d
            java.lang.Object r5 = r0.get()
            X.74J r5 = (X.AnonymousClass74J) r5
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r5.A0E
            boolean r4 = X.AnonymousClass000.A1W(r0)
            java.lang.String r3 = "editMessageViewModel"
            r0 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 0
            if (r4 != 0) goto L_0x04dd
            r5.A0K(r6)
            X.5ai r0 = r7.A0O
            r5.A0N(r0)
        L_0x04dd:
            X.3U2 r0 = r7.A0A
            if (r0 != 0) goto L_0x04e5
            X.C18070vi.A11(r3)
            throw r1
        L_0x04e5:
            X.206 r0 = r0.A0B
            if (r0 == 0) goto L_0x04ef
            X.205 r0 = r0.A0v
            if (r0 == 0) goto L_0x04ef
            X.1BI r1 = r0.A00
        L_0x04ef:
            java.lang.Integer r0 = X.A3P.A00(r1)
            r5.A0O(r2, r0)
            return
        L_0x04f7:
            java.lang.Object r0 = r12.A02
            X.5yK r0 = (X.C116625yK) r0
            int r2 = r12.A01
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r0.A04
            X.1GP r1 = r0.A1E()
            r0 = 2
            com.whatsapp.ephemeral.ChangeEphemeralSettingsDialog.A00(r1, r2, r0)
            return
        L_0x0508:
            java.lang.Object r4 = r12.A02
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            int r3 = r12.A01
            X.3zj r1 = r4.A16
            r2 = 1
            if (r1 == 0) goto L_0x0519
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A04 = r0
        L_0x0519:
            X.4Q5 r1 = r4.A0t
            com.whatsapp.jid.UserJid r0 = r4.A4l()
            r1.A00(r4, r0, r3, r2)
            return
        L_0x0523:
            java.lang.Object r1 = r12.A02
            com.whatsapp.calling.callgrid.view.MenuBottomSheet r1 = (com.whatsapp.calling.callgrid.view.MenuBottomSheet) r1
            int r0 = r12.A01
            r1.A00 = r0
            r1.A29()
            return
        L_0x052f:
            java.lang.Object r2 = r12.A02
            X.BCq r2 = (X.C22557BCq) r2
            int r1 = r12.A01
            java.util.List r0 = X.C42011xT.A0I
            r2.Boe(r1)
            return
        L_0x053b:
            java.lang.Object r0 = r12.A02
            com.whatsapp.PagerSlidingTabStrip r0 = (com.whatsapp.PagerSlidingTabStrip) r0
            int r1 = r12.A01
            androidx.viewpager.widget.ViewPager r0 = r0.A04
            r0.setCurrentItem(r1)
            return
        L_0x0547:
            int r1 = r12.A01
            java.lang.Object r0 = r12.A02
            X.8HY r0 = (X.AnonymousClass8HY) r0
            com.google.android.material.datepicker.MaterialCalendar r5 = r0.A00
            X.Aie r0 = r5.A09
            int r0 = r0.A03
            X.Aie r4 = X.C21349Aie.A00(r1, r0)
            X.ADU r3 = r5.A06
            X.Aie r1 = r3.A06
            java.util.Calendar r2 = r4.A06
            java.util.Calendar r0 = r1.A06
            int r0 = r2.compareTo(r0)
            if (r0 < 0) goto L_0x0571
            X.Aie r1 = r3.A05
            java.util.Calendar r0 = r1.A06
            int r0 = r2.compareTo(r0)
            if (r0 <= 0) goto L_0x0570
            r4 = r1
        L_0x0570:
            r1 = r4
        L_0x0571:
            r5.A25(r1)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r5.A26(r0)
            return
        L_0x057a:
            java.lang.String r0 = "viewModel"
            goto L_0x057f
        L_0x057d:
            java.lang.String r0 = "expressionsTrayController"
        L_0x057f:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90104dX.onClick(android.view.View):void");
    }

    public C90104dX(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public C90104dX(RestoreFromBackupActivity restoreFromBackupActivity) {
        this.A00 = 2;
        this.A02 = restoreFromBackupActivity;
        this.A01 = 15;
    }
}
