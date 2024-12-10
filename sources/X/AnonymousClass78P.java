package X;

import android.view.View;
import com.whatsapp.stickers.thirdpartystickers.AddThirdPartyStickerPackActivity;

/* renamed from: X.78P  reason: invalid class name */
public class AnonymousClass78P implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass78P(AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment, int i) {
        this.A00 = i;
        switch (i) {
            case 32:
            case 33:
                this.A01 = addStickerPackDialogFragment;
                return;
            default:
                this.A01 = addStickerPackDialogFragment;
                return;
        }
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass78P(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: X.61q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v73, resolved type: X.2HA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: X.61q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v266, resolved type: com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: X.61q} */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02c1, code lost:
        r0.A00.A04(r1);
        r3 = r2.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02c8, code lost:
        if (r3 == null) goto L_0x07a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02ca, code lost:
        r2 = r3.A04;
        r0 = r2.A0T().A01;
        r2.A0U(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02da, code lost:
        if (r0.isEmpty() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02dc, code lost:
        r3.A00 = true;
        r3.A00(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02e1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0447, code lost:
        r0.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x044a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0705, code lost:
        r0.CC7(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0708, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x077d, code lost:
        r0.A00.A04(r1);
        r1 = r2.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0784, code lost:
        if (r1 == null) goto L_0x07a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0786, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x079c, code lost:
        r1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x079f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x07a0, code lost:
        r0 = "shareSheetController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x07a5, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x07a9, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01bc, code lost:
        if (r3.A01 == 1) goto L_0x01be;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r16) {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x02e2;
                case 1: goto L_0x0788;
                case 2: goto L_0x02b7;
                case 3: goto L_0x0773;
                case 4: goto L_0x0759;
                case 5: goto L_0x02ac;
                case 6: goto L_0x074e;
                case 7: goto L_0x057f;
                case 8: goto L_0x0576;
                case 9: goto L_0x0548;
                case 10: goto L_0x0540;
                case 11: goto L_0x0239;
                case 12: goto L_0x0535;
                case 13: goto L_0x052a;
                case 14: goto L_0x04d8;
                case 15: goto L_0x04cd;
                case 16: goto L_0x04c4;
                case 17: goto L_0x04bc;
                case 18: goto L_0x0737;
                case 19: goto L_0x0220;
                case 20: goto L_0x0492;
                case 21: goto L_0x0457;
                case 22: goto L_0x044b;
                case 23: goto L_0x0443;
                case 24: goto L_0x0709;
                case 25: goto L_0x043b;
                case 26: goto L_0x0210;
                case 27: goto L_0x0416;
                case 28: goto L_0x0410;
                case 29: goto L_0x06dd;
                case 30: goto L_0x01ec;
                case 31: goto L_0x0410;
                case 32: goto L_0x0408;
                case 33: goto L_0x03ec;
                case 34: goto L_0x03b6;
                case 35: goto L_0x03ae;
                case 36: goto L_0x01cf;
                case 37: goto L_0x00fa;
                case 38: goto L_0x00fa;
                case 39: goto L_0x03a6;
                case 40: goto L_0x01a5;
                case 41: goto L_0x0396;
                case 42: goto L_0x0005;
                case 43: goto L_0x0005;
                case 44: goto L_0x0410;
                case 45: goto L_0x06bc;
                case 46: goto L_0x0368;
                case 47: goto L_0x0645;
                case 48: goto L_0x0127;
                case 49: goto L_0x000b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A01
            X.C108945cZ.A1P(r0)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r2 = r15.A01
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r2 = (com.whatsapp.textstatuscomposer.voice.VoiceRecordingView) r2
            com.whatsapp.WaImageButton r1 = r2.A05
            X.00H r0 = r2.getSystemServicesLazy()
            java.lang.Object r0 = r0.get()
            X.11C r0 = (X.AnonymousClass11C) r0
            X.AnonymousClass4a5.A01(r1, r0)
            X.862 r3 = r2.A0B
            if (r3 == 0) goto L_0x000a
            X.7Mv r3 = (X.C145847Mv) r3
            X.1DT r0 = r3.A08
            java.lang.Object r1 = r0.A06()
            if (r1 == 0) goto L_0x05c3
            X.6Tz r1 = (X.C123326Tz) r1
            boolean r0 = r1 instanceof X.AnonymousClass6Iw
            if (r0 == 0) goto L_0x0052
            X.6Iw r1 = (X.AnonymousClass6Iw) r1
            X.7Mv r0 = r1.A00
            X.C145847Mv.A00(r0)
        L_0x0039:
            X.1hg r0 = r3.A0F
            X.2tc r1 = X.C108965cb.A0Y(r0)
            boolean r0 = X.C63742tc.A03(r1)
            if (r0 == 0) goto L_0x000a
            X.2HA r2 = X.C63742tc.A00(r1)
            r0 = 31
            X.C108995ce.A1C(r2, r0)
            X.18K r0 = r1.A01
            goto L_0x0705
        L_0x0052:
            boolean r0 = r1 instanceof X.AnonymousClass6Iv
            if (r0 == 0) goto L_0x0087
            X.6Iv r1 = (X.AnonymousClass6Iv) r1
            X.7Mv r2 = r1.A00
            X.70T r1 = r2.A02
            if (r1 == 0) goto L_0x006d
            X.1DT r0 = r2.A07
            java.lang.Object r0 = r0.A06()
            if (r0 == 0) goto L_0x05be
            int r0 = X.AnonymousClass000.A0M(r0)
            r1.A0A(r0)
        L_0x006d:
            X.70T r0 = r2.A02
            if (r0 == 0) goto L_0x0074
            r0.A07()
        L_0x0074:
            X.6uN r0 = r2.A0I
            r0.A01()
            r0.A02()
            X.1DT r1 = r2.A08
            X.6Iw r0 = new X.6Iw
            r0.<init>(r2)
        L_0x0083:
            r1.A0F(r0)
            goto L_0x0039
        L_0x0087:
            boolean r0 = r1 instanceof X.AnonymousClass6Iu
            if (r0 == 0) goto L_0x0039
            X.6Iu r1 = (X.AnonymousClass6Iu) r1
            X.7Mv r5 = r1.A00
            X.118 r6 = r5.A0D     // Catch:{ IOException -> 0x00b4 }
            java.io.File r4 = r5.A0K     // Catch:{ IOException -> 0x00b4 }
            X.0ve r2 = r5.A0E     // Catch:{ IOException -> 0x00b4 }
            X.00H r0 = r5.A0J     // Catch:{ IOException -> 0x00b4 }
            java.lang.Object r1 = r0.get()     // Catch:{ IOException -> 0x00b4 }
            X.6gC r1 = (X.AnonymousClass6gC) r1     // Catch:{ IOException -> 0x00b4 }
            r0 = 3
            X.70T r1 = X.AnonymousClass70T.A00(r6, r2, r1, r4, r0)     // Catch:{ IOException -> 0x00b4 }
            r1.A05()     // Catch:{ IOException | IllegalStateException -> 0x00a6 }
            goto L_0x00b9
        L_0x00a6:
            r6 = move-exception
            X.190 r4 = r5.A0B     // Catch:{ IOException -> 0x00b4 }
            java.lang.String r2 = r6.toString()     // Catch:{ IOException -> 0x00b4 }
            r1 = 1
            java.lang.String r0 = "VoiceRecordingPreviewController/failed to prepare audio player"
            r4.A0G(r0, r2, r1)     // Catch:{ IOException -> 0x00b4 }
            throw r6     // Catch:{ IOException -> 0x00b4 }
        L_0x00b4:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r1 = 0
        L_0x00b9:
            r5.A02 = r1
            if (r1 == 0) goto L_0x00ef
            X.1DT r0 = r5.A07     // Catch:{ IOException -> 0x00eb }
            java.lang.Object r0 = r0.A06()     // Catch:{ IOException -> 0x00eb }
            if (r0 == 0) goto L_0x00e6
            int r0 = X.AnonymousClass000.A0M(r0)     // Catch:{ IOException -> 0x00eb }
            r1.A0A(r0)     // Catch:{ IOException -> 0x00eb }
            r1.A08()     // Catch:{ IOException -> 0x00eb }
            X.6uN r2 = r5.A0I     // Catch:{ IOException -> 0x00eb }
            r2.A01()     // Catch:{ IOException -> 0x00eb }
            android.os.Handler r1 = r5.A04     // Catch:{ IOException -> 0x00eb }
            java.lang.Runnable r0 = r5.A03     // Catch:{ IOException -> 0x00eb }
            r1.post(r0)     // Catch:{ IOException -> 0x00eb }
            r2.A02()
            X.1DT r1 = r5.A08
            X.6Iw r0 = new X.6Iw
            r0.<init>(r5)
            goto L_0x0083
        L_0x00e6:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()     // Catch:{ IOException -> 0x00eb }
            throw r0     // Catch:{ IOException -> 0x00eb }
        L_0x00eb:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x00ef:
            X.1KB r2 = r5.A0C
            r1 = 2131890601(0x7f1211a9, float:1.9415898E38)
            r0 = 0
            r2.A08(r1, r0)
            goto L_0x0039
        L_0x00fa:
            java.lang.Object r5 = r15.A01
            X.85y r5 = (X.C1598085y) r5
            java.util.List r0 = X.C42011xT.A0I
            com.whatsapp.storage.StorageUsageActivity r5 = (com.whatsapp.storage.StorageUsageActivity) r5
            r5.onSearchRequested()
            X.00H r0 = r5.A0O
            if (r0 == 0) goto L_0x05e0
            X.1c4 r1 = X.C108955ca.A0W(r0)
            boolean r0 = r1.A08()
            if (r0 == 0) goto L_0x000a
            X.0ve r2 = r1.A02
            r1 = 8174(0x1fee, float:1.1454E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x000a
            java.lang.String r4 = r5.A0T
            if (r4 != 0) goto L_0x05c8
            java.lang.String r0 = "storageManagementEventSessionId"
            goto L_0x07a5
        L_0x0127:
            java.lang.Object r0 = r15.A01
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r0 = (com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r0
            X.860 r2 = r0.A08
            if (r2 == 0) goto L_0x000a
            X.7J1 r2 = (X.AnonymousClass7J1) r2
            X.6lX r0 = r2.A07
            java.lang.Integer r0 = r0.A00
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x0172
            r0 = 3
            if (r1 != r0) goto L_0x000a
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r3 = r2.A06
            if (r3 == 0) goto L_0x000a
            X.00H r0 = r3.A27()
            boolean r0 = X.C108975cc.A1H(r0)
            if (r0 != 0) goto L_0x05e4
            X.1DT r0 = r3.A1J
            java.lang.Object r1 = r0.A06()
            X.77K r1 = (X.AnonymousClass77K) r1
            if (r1 == 0) goto L_0x015e
            X.1hg r0 = r3.A26()
            r0.A08(r1)
        L_0x015e:
            X.1hg r2 = r3.A26()
            java.lang.Integer r1 = X.C17880vN.A0i()
            java.lang.String r0 = "default_share"
            r2.A0G(r1, r0)
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0D(r3)
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0E(r3)
            return
        L_0x0172:
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r3 = r2.A06
            if (r3 == 0) goto L_0x000a
            X.00H r0 = r3.A27()
            boolean r0 = X.C108975cc.A1H(r0)
            if (r0 != 0) goto L_0x05e4
            X.1DT r0 = r3.A1J
            java.lang.Object r1 = r0.A06()
            X.77K r1 = (X.AnonymousClass77K) r1
            if (r1 == 0) goto L_0x0191
            X.1hg r0 = r3.A26()
            r0.A08(r1)
        L_0x0191:
            X.1hg r2 = r3.A26()
            java.lang.Integer r1 = X.AnonymousClass3MY.A0f()
            java.lang.String r0 = r3.A19
            r2.A0G(r1, r0)
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0D(r3)
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0C(r3)
            return
        L_0x01a5:
            java.lang.Object r3 = r15.A01
            com.whatsapp.storage.StorageUsageGalleryActivity r3 = (com.whatsapp.storage.StorageUsageGalleryActivity) r3
            com.whatsapp.storage.StorageUsageMediaGalleryFragment r0 = r3.A0M
            if (r0 == 0) goto L_0x000a
            int r2 = r0.A03
            X.18O r1 = r3.A06
            X.18R r0 = X.AnonymousClass18O.A0g
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x01cd
            int r1 = r3.A01
            r0 = 1
            if (r1 != r0) goto L_0x01cd
        L_0x01be:
            com.whatsapp.storage.StorageUsageGallerySortBottomSheet r1 = com.whatsapp.storage.StorageUsageGallerySortBottomSheet.A00(r2, r0)
            X.4M4 r0 = new X.4M4
            r0.<init>(r3)
            r1.A00 = r0
            r3.CMl(r1)
            return
        L_0x01cd:
            r0 = 0
            goto L_0x01be
        L_0x01cf:
            java.lang.Object r2 = r15.A01
            X.85y r2 = (X.C1598085y) r2
            java.util.List r0 = X.C42011xT.A0I
            if (r2 == 0) goto L_0x000a
            com.whatsapp.storage.StorageUsageActivity r2 = (com.whatsapp.storage.StorageUsageActivity) r2
            X.10I r1 = r2.A05
            r0 = 36
            X.7RI r0 = X.AnonymousClass7RI.A00(r2, r0)
            r1.CGN(r0)
            X.5lJ r0 = r2.A0H
            if (r0 != 0) goto L_0x0626
            java.lang.String r0 = "storageUsageAdapter"
            goto L_0x07a5
        L_0x01ec:
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r3 = r0.A1B()
            boolean r0 = r3 instanceof com.whatsapp.stickers.store.StickerStoreActivity
            if (r0 == 0) goto L_0x000a
            com.whatsapp.stickers.store.StickerStoreActivity r3 = (com.whatsapp.stickers.store.StickerStoreActivity) r3
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r1 = r3.A05
            X.5ho r0 = r3.A04
            if (r0 == 0) goto L_0x000a
            java.util.List r0 = r0.A00
            int r2 = r0.indexOf(r1)
            r0 = -1
            if (r2 == r0) goto L_0x000a
            androidx.viewpager.widget.ViewPager r1 = r3.A00
            r0 = 1
            r1.A0J(r2, r0)
            return
        L_0x0210:
            java.lang.Object r0 = r15.A01
            X.6Hy r0 = (X.C121156Hy) r0
            X.6uX r1 = r0.A09
            boolean r0 = r1 instanceof X.AnonymousClass6CF
            if (r0 == 0) goto L_0x000a
            X.6CF r1 = (X.AnonymousClass6CF) r1
            r1.A07()
            return
        L_0x0220:
            java.lang.Object r1 = r15.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r1 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r1
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0H(r1)
            X.74J r0 = X.C108975cc.A0G(r1)
            boolean r0 = r0.A0U()
            if (r0 == 0) goto L_0x000a
            X.74J r0 = X.C108975cc.A0G(r1)
            r0.A0D()
            return
        L_0x0239:
            java.lang.Object r0 = r15.A01
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r0
            X.00H r1 = r0.A0n
            if (r1 == 0) goto L_0x0638
            java.lang.Object r2 = X.C18070vi.A0E(r1)
            X.17x r2 = (X.C219217x) r2
            r1 = 33
            boolean r1 = X.AnonymousClass74O.A0R(r0, r2, r1)
            if (r1 == 0) goto L_0x000a
            X.1Lc r1 = r0.A2C()
            X.0ve r3 = r1.A01
            r2 = 7558(0x1d86, float:1.0591E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r1, r3, r2)
            r9 = 4
            X.00H r1 = r0.A0m
            if (r1 == 0) goto L_0x0634
            android.content.Context r3 = X.C108955ca.A0A(r0, r1)
            X.1cg r1 = X.C29671cg.A00
            if (r2 == 0) goto L_0x0294
            java.lang.String r8 = r1.getRawString()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r7 = X.C17880vN.A0l()
            r4 = 0
            r10 = 1
            r11 = 24
            r12 = 58
            r6 = r5
            r9 = r4
            android.content.Intent r2 = X.AnonymousClass1LU.A0S(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0282:
            X.00H r1 = r0.A0X
            if (r1 == 0) goto L_0x062e
            java.lang.Object r1 = r1.get()
            X.1L9 r1 = (X.AnonymousClass1L9) r1
            android.content.Context r0 = r0.A14()
            r1.A0A(r0, r2)
            return
        L_0x0294:
            java.lang.String r7 = r1.getRawString()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r4 = 0
            r12 = 0
            r10 = 24
            r11 = 58
            r5 = r3
            r8 = r4
            android.content.Intent r2 = X.AnonymousClass1LU.A1I(r5, r6, r7, r8, r9, r10, r11, r12)
            X.C18070vi.A0b(r2)
            goto L_0x0282
        L_0x02ac:
            java.lang.Object r2 = r15.A01
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r2 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r2
            X.6ex r0 = X.C108985cd.A0Z(r2)
            java.lang.String r1 = "tap_only_share"
            goto L_0x02c1
        L_0x02b7:
            java.lang.Object r2 = r15.A01
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r2 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r2
            X.6ex r0 = X.C108985cd.A0Z(r2)
            java.lang.String r1 = "tap_selected"
        L_0x02c1:
            X.2nU r0 = r0.A00
            r0.A04(r1)
            X.6pz r3 = r2.A0F
            if (r3 == 0) goto L_0x07a0
            X.5iV r2 = r3.A04
            X.77K r0 = r2.A0T()
            java.util.List r0 = r0.A01
            r1 = 1
            r2.A0U(r1)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000a
            r3.A00 = r1
            r3.A00(r1)
            return
        L_0x02e2:
            java.lang.Object r2 = r15.A01
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r2 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r2
            X.5iV r0 = r2.A0G
            java.lang.String r3 = "viewModel"
            if (r0 == 0) goto L_0x0640
            X.77K r0 = r0.A0T()
            int r0 = r0.A00
            r1 = 1
            if (r0 != r1) goto L_0x032d
            X.5iV r0 = r2.A0G
            if (r0 == 0) goto L_0x0640
            X.77K r0 = r0.A0T()
            java.util.List r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x032d
            X.6pz r4 = r2.A0F
            if (r4 == 0) goto L_0x07a0
            android.content.Context r0 = r4.A01
            r1 = 0
            X.3Ri r3 = X.C73193Ri.A00(r0)
            r0 = 2131896314(0x7f1227fa, float:1.9427486E38)
            r3.A0U(r0)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            r3.A0W(r1, r0)
            r2 = 2131896313(0x7f1227f9, float:1.9427484E38)
            r1 = 18
            X.758 r0 = new X.758
            r0.<init>(r4, r1)
            r3.A0X(r0, r2)
            X.AnonymousClass3MY.A1G(r3)
            return
        L_0x032d:
            boolean r0 = r2.A0O
            if (r0 == 0) goto L_0x0335
            r2.A28()
            return
        L_0x0335:
            r2.A0O = r1
            X.00H r0 = r2.A0N
            if (r0 == 0) goto L_0x063c
            java.lang.Object r1 = r0.get()
            X.1hg r1 = (X.C32741hg) r1
            X.5iV r0 = r2.A0G
            if (r0 == 0) goto L_0x0640
            X.77K r0 = r0.A0T()
            r1.A08(r0)
            X.6ex r0 = X.C108985cd.A0Z(r2)
            java.lang.String r1 = "tap_share_button"
            X.2nU r0 = r0.A00
            r0.A04(r1)
            r2.A28()
            java.lang.ref.WeakReference r0 = r2.A0P
            java.lang.Object r0 = r0.get()
            X.8AT r0 = (X.AnonymousClass8AT) r0
            if (r0 == 0) goto L_0x000a
            r0.C6e()
            return
        L_0x0368:
            java.lang.Object r4 = r15.A01
            com.whatsapp.textstatus.AddTextStatusActivity r4 = (com.whatsapp.textstatus.AddTextStatusActivity) r4
            r3 = 0
            com.whatsapp.WaEditText r0 = r4.A01
            r2 = 0
            if (r0 != 0) goto L_0x0378
            java.lang.String r0 = "textEntry"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0378:
            X.AnonymousClass3MW.A1S(r0)
            r1 = 2131232116(0x7f080574, float:1.8080332E38)
            r0 = 2131101210(0x7f06061a, float:1.7814823E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r4, r1, r0)
            X.C18070vi.A0X(r0)
            com.whatsapp.textstatus.AddTextStatusActivity.A03(r0, r4)
            r4.A0D = r2
            com.whatsapp.textstatus.AddTextStatusActivity.A0Q(r4)
            r0 = r16
            r0.setEnabled(r3)
            return
        L_0x0396:
            java.lang.Object r0 = r15.A01
            com.whatsapp.support.DescribeProblemActivity r0 = (com.whatsapp.support.DescribeProblemActivity) r0
            androidx.appcompat.widget.AppCompatCheckBox r1 = r0.A03
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
        L_0x03a6:
            java.lang.Object r0 = r15.A01
            com.whatsapp.storage.StorageUsageGalleryActivity r0 = (com.whatsapp.storage.StorageUsageGalleryActivity) r0
            r0.onBackPressed()
            return
        L_0x03ae:
            java.lang.Object r0 = r15.A01
            com.whatsapp.storage.StorageUsageActivity r0 = (com.whatsapp.storage.StorageUsageActivity) r0
            r0.onBackPressed()
            return
        L_0x03b6:
            java.lang.Object r6 = r15.A01
            com.whatsapp.stickers.thirdpartystickers.AddThirdPartyStickerPackActivity$AddStickerPackDialogFragment r6 = (com.whatsapp.stickers.thirdpartystickers.AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment) r6
            r4 = 2131896515(0x7f1228c3, float:1.9427893E38)
            java.lang.Object[] r3 = X.AnonymousClass3MW.A1b()
            java.lang.String r0 = r6.A05
            r2 = 0
            r3[r2] = r0
            r0 = 2131899103(0x7f1232df, float:1.9433143E38)
            java.lang.String r1 = r6.A1H(r0)
            r0 = 1
            java.lang.String r1 = X.AnonymousClass3MX.A16(r6, r1, r3, r0, r4)
            r0 = 8
            com.whatsapp.stickers.thirdpartystickers.AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment.A00(r6, r1, r2, r0, r0)
            X.6ha r0 = r6.A01
            java.lang.String r5 = r6.A02
            java.lang.String r4 = r6.A03
            X.1SB r3 = r0.A02
            X.10I r2 = r3.A0C
            r1 = 19
            X.7Pq r0 = new X.7Pq
            r0.<init>(r3, r5, r4, r1)
            r2.CGF(r0)
            return
        L_0x03ec:
            java.lang.Object r4 = r15.A01
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            X.1FL r3 = r4.A1B()
            if (r3 == 0) goto L_0x0404
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = "user_cancelled"
            r0 = 1
            r2.putExtra(r1, r0)
            r0 = 0
            r3.setResult(r0, r2)
        L_0x0404:
            r4.A29()
            return
        L_0x0408:
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A29()
            return
        L_0x0410:
            java.lang.Object r0 = r15.A01
            X.AnonymousClass3MW.A1U(r0)
            return
        L_0x0416:
            java.lang.Object r4 = r15.A01
            X.6Hw r4 = (X.C121136Hw) r4
            X.725 r0 = r4.A04
            java.lang.String r3 = r0.A04
            android.os.Bundle r2 = X.C17880vN.A0D()
            com.whatsapp.stickers.picker.pages.ThirdPartyPackPage$StickerBlockedDialogFragment r1 = new com.whatsapp.stickers.picker.pages.ThirdPartyPackPage$StickerBlockedDialogFragment
            r1.<init>()
            java.lang.String r0 = "sticker_pack_name"
            r2.putString(r0, r3)
            r1.A1R(r2)
            android.content.Context r0 = r4.A0B
            android.app.Activity r0 = X.AnonymousClass1L9.A00(r0)
            X.1FU r0 = (X.AnonymousClass1FU) r0
            r0.CMl(r1)
            return
        L_0x043b:
            java.lang.Object r0 = r15.A01
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet r0 = (com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet) r0
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet.A00(r0)
            goto L_0x0447
        L_0x0443:
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
        L_0x0447:
            r0.A28()
            return
        L_0x044b:
            java.lang.Object r1 = r15.A01
            X.6HK r1 = (X.AnonymousClass6HK) r1
            java.util.List r0 = X.C42011xT.A0I
            X.0vk r0 = r1.A00
            r0.invoke()
            return
        L_0x0457:
            java.lang.Object r6 = r15.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r6 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r6
            int r2 = r6.A01
            int[] r5 = X.AnonymousClass74F.A02
            r4 = 8
            r1 = 0
        L_0x0462:
            r0 = r5[r1]
            if (r0 == r2) goto L_0x046b
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x0462
            r1 = -1
        L_0x046b:
            int r0 = r1 + 1
            int r0 = r0 % r4
            r0 = r5[r0]
            r6.A01 = r0
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0I(r6)
            int r0 = r6.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0M(r6, r0)
            int[] r3 = com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A1R
            int r2 = r6.A01
            r1 = 0
        L_0x047f:
            r0 = r5[r1]
            if (r0 == r2) goto L_0x0488
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x047f
            r1 = -1
        L_0x0488:
            r0 = r3[r1]
            java.lang.String r0 = X.AnonymousClass3MY.A0n(r6, r0)
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0e(r6, r0)
            return
        L_0x0492:
            java.lang.Object r6 = r15.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r6 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r6
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0B(r6)
            int[] r5 = com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A1Q
            int r4 = r6.A00
            int[] r3 = X.AnonymousClass74F.A01
            r2 = 21
            r1 = 0
        L_0x04a2:
            r0 = r3[r1]
            if (r0 == r4) goto L_0x04ab
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x04a2
            r1 = -1
        L_0x04ab:
            r0 = r5[r1]
            java.lang.String r0 = X.AnonymousClass3MY.A0n(r6, r0)
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0e(r6, r0)
            X.1hg r0 = r6.A26()
            r0.A03()
            return
        L_0x04bc:
            java.lang.Object r0 = r15.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r0 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r0
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A08(r0)
            return
        L_0x04c4:
            java.lang.Object r1 = r15.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r1 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r1
            r0 = 0
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0j(r1, r0)
            return
        L_0x04cd:
            java.lang.Object r0 = r15.A01
            X.6Gp r0 = (X.AnonymousClass6Gp) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.A01
            r0 = 4
            r1.A0W(r0)
            return
        L_0x04d8:
            java.lang.Object r1 = r15.A01
            X.6Gl r1 = (X.C120896Gl) r1
            r1.A0P()
            X.00H r0 = r1.A0B
            java.lang.Object r4 = r0.get()
            X.6ws r4 = (X.C138316ws) r4
            android.content.Context r6 = r1.A0J()
            X.206 r5 = r1.A07
            X.6cp r3 = new X.6cp
            r3.<init>(r1)
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            android.app.Activity r1 = X.AnonymousClass1L9.A00(r6)
            boolean r0 = r1 instanceof X.AnonymousClass1FL
            if (r0 == 0) goto L_0x0519
            X.1FL r1 = (X.AnonymousClass1FL) r1
            if (r1 == 0) goto L_0x0519
            X.1GP r2 = r1.getSupportFragmentManager()
            if (r2 == 0) goto L_0x0519
            r1 = 0
            r0 = 2131891797(0x7f121655, float:1.9418324E38)
            com.whatsapp.dialogs.ProgressDialogFragment r1 = com.whatsapp.dialogs.ProgressDialogFragment.A00(r1, r0)
            r4.A00 = r1
            java.lang.String r0 = X.C17890vO.A0U(r4)
            r1.A2C(r2, r0)
        L_0x0519:
            java.lang.ref.WeakReference r7 = X.AnonymousClass3MW.A0z(r6)
            X.10I r0 = r4.A03
            r8 = 30
            X.AkZ r2 = new X.AkZ
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.CGF(r2)
            return
        L_0x052a:
            java.lang.Object r2 = r15.A01
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r2 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r2
            r1 = 9
            r0 = 5
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0C(r2, r1, r0)
            return
        L_0x0535:
            java.lang.Object r2 = r15.A01
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r2 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r2
            r1 = 8
            r0 = 4
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0D(r2, r1, r0)
            return
        L_0x0540:
            java.lang.Object r0 = r15.A01
            com.whatsapp.status.playback.StatusPlaybackActivity r0 = (com.whatsapp.status.playback.StatusPlaybackActivity) r0
            r0.onBackPressed()
            return
        L_0x0548:
            java.lang.Object r4 = r15.A01
            com.whatsapp.status.playback.MessageReplyActivity r4 = (com.whatsapp.status.playback.MessageReplyActivity) r4
            X.00H r0 = r4.A1D
            java.lang.Object r3 = r0.get()
            X.6w8 r3 = (X.C137856w8) r3
            X.00H r0 = r4.A1C
            java.lang.Object r0 = r0.get()
            com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration r0 = (com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration) r0
            X.6RP r2 = r0.A00()
            X.6RS r1 = X.AnonymousClass6RS.STATUS_REPLY
            r0 = 2
            X.C137856w8.A00(r2, r3, r1, r0)
            X.00H r0 = r4.A18
            java.lang.Object r2 = r0.get()
            X.73V r2 = (X.AnonymousClass73V) r2
            java.lang.String r1 = "avatar_sticker_upsell"
            java.lang.String r0 = "whatsapp://avatar/edit/update"
            r2.A04(r4, r1, r0)
            return
        L_0x0576:
            java.lang.Object r1 = r15.A01
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            r0 = 0
            com.whatsapp.status.playback.MessageReplyActivity.A13(r1, r0)
            return
        L_0x057f:
            java.lang.Object r3 = r15.A01
            com.whatsapp.status.crossposting.privacy.ShareToFacebookActivity r3 = (com.whatsapp.status.crossposting.privacy.ShareToFacebookActivity) r3
            X.3Rj r2 = X.AnonymousClass4a6.A00(r3)
            r0 = 2131896115(0x7f122733, float:1.9427082E38)
            r2.A0D(r0)
            r0 = 2131896116(0x7f122734, float:1.9427084E38)
            r2.A0E(r0)
            r1 = 11
            X.74o r0 = new X.74o
            r0.<init>(r3, r1)
            r2.A0G(r0)
            r1 = 2131896114(0x7f122732, float:1.942708E38)
            r0 = 21
            X.AnonymousClass758.A01(r2, r3, r0, r1)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 22
            X.AnonymousClass758.A00(r2, r3, r0, r1)
            X.05w r0 = r2.A0C()
            X.C18070vi.A0X(r0)
            X.1dR r1 = r3.A4b()
            java.lang.String r0 = "SEE_UNLINK_DIALOG"
            r1.A04(r0)
            return
        L_0x05be:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        L_0x05c3:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        L_0x05c8:
            int r3 = r5.A01
            X.18K r2 = r5.A0E
            if (r2 == 0) goto L_0x05dc
            X.3za r1 = new X.3za
            r1.<init>()
            r0 = 11
            X.C83964Hi.A00(r1, r4, r0, r3)
            r2.CC7(r1)
            return
        L_0x05dc:
            java.lang.String r0 = "wamRuntime"
            goto L_0x07a5
        L_0x05e0:
            java.lang.String r0 = "newsletterConfig"
            goto L_0x07a5
        L_0x05e4:
            X.74J r0 = X.C108975cc.A0G(r3)
            boolean r0 = r0.A0U()
            if (r0 == 0) goto L_0x05f5
            X.74J r0 = X.C108975cc.A0G(r3)
            r0.A0D()
        L_0x05f5:
            X.00H r0 = r3.A12
            if (r0 == 0) goto L_0x0622
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.727 r2 = (X.AnonymousClass727) r2
            X.6RU r1 = X.AnonymousClass6RU.TEXT_STATUS_COMPOSER
            X.1DT r0 = r3.A1J
            java.lang.Object r0 = r0.A06()
            X.77K r0 = (X.AnonymousClass77K) r0
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r1 = X.AnonymousClass6XW.A00(r0, r2, r3, r1)
            X.1FU r0 = X.C108985cd.A0M(r3)
            r0.CMl(r1)
            X.1hg r0 = r3.A26()
            X.2nU r1 = X.C108985cd.A0X(r0)
            java.lang.String r0 = "tap_share_sheet_entry"
            r1.A04(r0)
            return
        L_0x0622:
            java.lang.String r0 = "statusAudienceRepository"
            goto L_0x07a5
        L_0x0626:
            X.6RN r1 = X.AnonymousClass6RN.ALL
            X.5ku r0 = r0.A0C
            r0.A0U(r1)
            return
        L_0x062e:
            java.lang.String r0 = "activityUtils"
            X.C18070vi.A11(r0)
            throw r4
        L_0x0634:
            java.lang.String r0 = "waIntents"
            goto L_0x07a5
        L_0x0638:
            java.lang.String r0 = "waPermissionsHelper"
            goto L_0x07a5
        L_0x063c:
            java.lang.String r0 = "statusesStatsManagerLazy"
            goto L_0x07a5
        L_0x0640:
            X.C18070vi.A11(r3)
            goto L_0x07a8
        L_0x0645:
            java.lang.Object r10 = r15.A01
            com.whatsapp.textstatus.AddTextStatusActivity r10 = (com.whatsapp.textstatus.AddTextStatusActivity) r10
            r12 = 0
            com.whatsapp.WaEditText r0 = r10.A01
            if (r0 != 0) goto L_0x0652
            java.lang.String r0 = "textEntry"
            goto L_0x07a5
        L_0x0652:
            java.lang.String r6 = X.AnonymousClass3MZ.A17(r0)
            boolean r0 = X.AnonymousClass1YF.A0T(r6)
            r0 = r0 ^ 1
            r2 = 0
            if (r0 != 0) goto L_0x0675
            java.lang.String r0 = r10.A0D
            if (r0 != 0) goto L_0x0675
            r13 = 0
        L_0x0666:
            X.10I r0 = r10.A05
            X.7Pp r9 = new X.7Pp
            r11 = r6
            r9.<init>(r10, r11, r12, r13)
            r0.CGN(r9)
            r10.finish()
            return
        L_0x0675:
            long[] r1 = X.C124486Yn.A00
            int r0 = r10.A00
            r13 = r1[r0]
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0666
            java.util.List r2 = r10.A0L
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0699
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0699
        L_0x068b:
            java.lang.String r9 = r10.A0D
            r4 = 0
            X.6sf r3 = new X.6sf
            r7 = r4
            r3.<init>(r4, r6, r7, r9)
            r2.add(r12, r3)
            goto L_0x0666
        L_0x0699:
            java.util.Iterator r3 = r2.iterator()
        L_0x069d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x068b
            java.lang.Object r1 = r3.next()
            X.6sf r1 = (X.C135726sf) r1
            java.lang.String r0 = r1.A03
            boolean r0 = X.C18070vi.A18(r0, r6)
            if (r0 == 0) goto L_0x069d
            java.lang.String r1 = r1.A02
            java.lang.String r0 = r10.A0D
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x069d
            goto L_0x0666
        L_0x06bc:
            java.lang.Object r2 = r15.A01
            com.whatsapp.textstatus.AddTextStatusActivity r2 = (com.whatsapp.textstatus.AddTextStatusActivity) r2
            java.lang.String[] r0 = r2.A0F
            if (r0 != 0) goto L_0x06c8
            java.lang.String r0 = "durationOptions"
            goto L_0x07a5
        L_0x06c8:
            android.os.Bundle r0 = com.whatsapp.SingleSelectionDialogFragment.A02(r0)
            com.whatsapp.SingleSelectionDialogFragment r1 = new com.whatsapp.SingleSelectionDialogFragment
            r1.<init>()
            r1.A1R(r0)
            java.lang.String r0 = "durationSelection"
            r2.CMk(r1, r0)
            com.whatsapp.textstatus.AddTextStatusActivity.A0Q(r2)
            return
        L_0x06dd:
            java.lang.Object r3 = r15.A01
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r3 = (com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment) r3
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r2 = X.C108945cZ.A0G(r0)
            java.lang.String r0 = "http://play.google.com/store/search?q=WASticker&c=apps"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.setData(r0)
            java.lang.String r0 = "com.android.vending"
            r2.setPackage(r0)
            X.1L9 r1 = r3.A03
            android.content.Context r0 = r3.A1n()
            r1.A08(r0, r2)
            X.61q r2 = new X.61q
            r2.<init>()
            X.18K r0 = r3.A04
        L_0x0705:
            r0.CC7(r2)
            return
        L_0x0709:
            java.lang.Object r4 = r15.A01
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet r4 = (com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet) r4
            X.00H r0 = r4.A0F
            if (r0 == 0) goto L_0x0734
            java.lang.Object r3 = r0.get()
            X.6w8 r3 = (X.C137856w8) r3
            X.00H r0 = r4.A0E
            if (r0 == 0) goto L_0x0731
            java.lang.Object r0 = r0.get()
            com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration r0 = (com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration) r0
            X.6RP r2 = r0.A00()
            X.6RS r1 = X.AnonymousClass6RS.STICKER_RECEIVED
            r0 = 2
            X.C137856w8.A00(r2, r3, r1, r0)
            java.lang.String r0 = "whatsapp://avatar/edit/update"
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet.A02(r4, r0)
            return
        L_0x0731:
            java.lang.String r0 = "avatarSquidConfiguration"
            goto L_0x07a5
        L_0x0734:
            java.lang.String r0 = "avatarSquidLogger"
            goto L_0x07a5
        L_0x0737:
            java.lang.Object r0 = r15.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r0 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r0
            X.00H r0 = r0.A11
            if (r0 == 0) goto L_0x07a3
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.74J r2 = (X.AnonymousClass74J) r2
            java.lang.Integer r1 = X.C17880vN.A0l()
            r0 = 0
            r2.A0O(r1, r0)
            return
        L_0x074e:
            java.lang.Object r2 = r15.A01
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r2 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r2
            X.6ex r0 = X.C108985cd.A0Z(r2)
            java.lang.String r1 = "tap_only_share_entry"
            goto L_0x077d
        L_0x0759:
            java.lang.Object r2 = r15.A01
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r2 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r2
            X.6ex r0 = X.C108985cd.A0Z(r2)
            java.lang.String r1 = "tap_my_contacts"
            X.2nU r0 = r0.A00
            r0.A04(r1)
            X.6pz r0 = r2.A0F
            if (r0 == 0) goto L_0x07a0
            X.5iV r1 = r0.A04
            r0 = 0
            r1.A0U(r0)
            return
        L_0x0773:
            java.lang.Object r2 = r15.A01
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r2 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r2
            X.6ex r0 = X.C108985cd.A0Z(r2)
            java.lang.String r1 = "tap_selected_status_audience_selector_entry"
        L_0x077d:
            X.2nU r0 = r0.A00
            r0.A04(r1)
            X.6pz r1 = r2.A0F
            if (r1 == 0) goto L_0x07a0
            r0 = 1
            goto L_0x079c
        L_0x0788:
            java.lang.Object r2 = r15.A01
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r2 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r2
            X.6ex r0 = X.C108985cd.A0Z(r2)
            java.lang.String r1 = "tap_contacts_status_audience_selector_entry"
            X.2nU r0 = r0.A00
            r0.A04(r1)
            X.6pz r1 = r2.A0F
            if (r1 == 0) goto L_0x07a0
            r0 = 2
        L_0x079c:
            r1.A00(r0)
            return
        L_0x07a0:
            java.lang.String r0 = "shareSheetController"
            goto L_0x07a5
        L_0x07a3:
            java.lang.String r0 = "expressionsTrayController"
        L_0x07a5:
            X.C18070vi.A11(r0)
        L_0x07a8:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78P.onClick(android.view.View):void");
    }

    public AnonymousClass78P(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
