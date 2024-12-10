package X;

/* renamed from: X.7Pl  reason: invalid class name and case insensitive filesystem */
public class C146527Pl implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C146527Pl(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: X.6Ev} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: X.6Ev} */
    /* JADX WARNING: type inference failed for: r1v72, types: [com.whatsapp.report.Hilt_ShareReportConfirmationDialogFragment, com.whatsapp.report.ShareReportConfirmationDialogFragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x05a0, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x05a1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0708, code lost:
        r3.A0J(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x070b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x079d, code lost:
        r0 = "abProps";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x087e, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0882, code lost:
        throw null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x05cb  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0122 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0114 A[Catch:{ FileNotFoundException -> 0x05d6, all -> 0x05f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011a A[Catch:{ FileNotFoundException -> 0x05d6, all -> 0x05f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0124 A[Catch:{ FileNotFoundException -> 0x05d6, all -> 0x05f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r30 = this;
            r4 = r30
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x02a7;
                case 1: goto L_0x02cc;
                case 2: goto L_0x02db;
                case 3: goto L_0x0630;
                case 4: goto L_0x02ea;
                case 5: goto L_0x0015;
                case 6: goto L_0x02f6;
                case 7: goto L_0x004d;
                case 8: goto L_0x030f;
                case 9: goto L_0x031b;
                case 10: goto L_0x064e;
                case 11: goto L_0x0335;
                case 12: goto L_0x036b;
                case 13: goto L_0x0380;
                case 14: goto L_0x03aa;
                case 15: goto L_0x006e;
                case 16: goto L_0x03bf;
                case 17: goto L_0x03cd;
                case 18: goto L_0x03d9;
                case 19: goto L_0x0080;
                case 20: goto L_0x060d;
                case 21: goto L_0x0716;
                case 22: goto L_0x073f;
                case 23: goto L_0x0769;
                case 24: goto L_0x03e7;
                case 25: goto L_0x00b4;
                case 26: goto L_0x0007;
                case 27: goto L_0x0007;
                case 28: goto L_0x0438;
                case 29: goto L_0x044c;
                case 30: goto L_0x045e;
                case 31: goto L_0x00d3;
                case 32: goto L_0x046a;
                case 33: goto L_0x0484;
                case 34: goto L_0x04a1;
                case 35: goto L_0x04ad;
                case 36: goto L_0x07a1;
                case 37: goto L_0x07cc;
                case 38: goto L_0x04b9;
                case 39: goto L_0x04d1;
                case 40: goto L_0x04e9;
                case 41: goto L_0x016c;
                case 42: goto L_0x01ac;
                case 43: goto L_0x01cf;
                case 44: goto L_0x0206;
                case 45: goto L_0x07eb;
                case 46: goto L_0x04fb;
                case 47: goto L_0x0230;
                case 48: goto L_0x0262;
                case 49: goto L_0x0513;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r4.A01
            X.1Nb r0 = (X.AnonymousClass1Nb) r0
            java.lang.Object r1 = r4.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1NN r0 = r0.A0D
            r0.A02(r1)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r10 = r4.A01
            com.whatsapp.report.ReportActivity r10 = (com.whatsapp.report.ReportActivity) r10
            java.lang.Object r5 = r4.A02
            X.7Fd r5 = (X.C143877Fd) r5
            X.1KB r0 = r10.A05
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0014
            java.lang.Integer r1 = r5.A07
            r0 = 2
            com.whatsapp.report.ReportActivity.A0c(r10, r1, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x051f
            long r3 = r5.A02()
            int r0 = r5.A01
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x051f
            long r2 = r5.A02()
            X.7vB r0 = new X.7vB
            r0.<init>(r5, r10)
            com.whatsapp.report.DownloadLargeNewsletterReportFileConfirmationDialogFragment r1 = new com.whatsapp.report.DownloadLargeNewsletterReportFileConfirmationDialogFragment
            r1.<init>(r0, r2)
            r0 = 0
            r10.CMk(r1, r0)
            return
        L_0x004d:
            java.lang.Object r0 = r4.A01
            X.7LR r0 = (X.AnonymousClass7LR) r0
            java.lang.Object r4 = r4.A02
            X.76s r4 = (X.C1417276s) r4
            X.6cV r0 = r0.A00
            if (r0 == 0) goto L_0x0014
            com.whatsapp.report.BusinessActivityReportViewModel r3 = r0.A00
            X.1nU r2 = r3.A05
            int r1 = r2.A00()
            r0 = 4
            if (r1 == r0) goto L_0x05a9
            r2.A03(r4)
            X.1DT r1 = r3.A02
            r0 = 2
            X.AnonymousClass3MX.A1J(r1, r0)
            return
        L_0x006e:
            java.lang.Object r0 = r4.A01
            X.5jU r0 = (X.C111295jU) r0
            java.lang.Object r2 = r4.A02
            X.1Dg r1 = r0.A0h
            java.lang.Object r0 = r1.A06()
            if (r0 != 0) goto L_0x0014
            r1.A0F(r2)
            return
        L_0x0080:
            java.lang.Object r5 = r4.A01
            com.whatsapp.settings.SettingsChat r5 = (com.whatsapp.settings.SettingsChat) r5
            java.lang.Object r3 = r4.A02
            X.00H r0 = r5.A0N
            java.lang.Object r1 = r0.get()
            X.73b r1 = (X.C1407873b) r1
            X.6Rq r0 = X.C122716Rq.TRANSCRIPTION
            boolean r0 = r1.A08(r0)
            if (r0 != 0) goto L_0x0014
            X.1DS r0 = r5.A03
            int r0 = r0.A00
            if (r0 > 0) goto L_0x0014
            r0 = 2131896064(0x7f122700, float:1.9426979E38)
            java.lang.String r2 = r5.getString(r0)
            r0 = 1
            X.4fn r1 = new X.4fn
            r1.<init>(r3, r5, r2, r0)
            X.1KB r3 = r5.A05
            r0 = 18
            X.7Pl r2 = new X.7Pl
            r2.<init>(r5, r1, r0)
            goto L_0x0708
        L_0x00b4:
            java.lang.Object r2 = r4.A01
            com.whatsapp.settings.SettingsUserProxyActivity r2 = (com.whatsapp.settings.SettingsUserProxyActivity) r2
            java.lang.Object r0 = r4.A02
            android.widget.EditText r0 = (android.widget.EditText) r0
            com.whatsapp.settings.SettingsUserProxyViewModel r1 = r2.A0A
            java.lang.String r0 = X.AnonymousClass3Ma.A12(r0)
            boolean r0 = r1.A0Z(r0)
            if (r0 == 0) goto L_0x0014
            com.whatsapp.settings.SettingsUserProxyViewModel r2 = r2.A0A
            r1 = 1
            r0 = 0
            r2.A0W(r1, r0)
            r2.A0U()
            return
        L_0x00d3:
            java.lang.Object r5 = r4.A01
            com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview r5 = (com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview) r5
            java.lang.Object r8 = r4.A02
            java.lang.String r7 = "io-error"
            android.net.Uri r0 = r5.A01
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = "GalleryWallpaperPreview/saveWallpaperForChat/no uri found to save to. generating our own"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4aW r0 = r5.A03
            android.net.Uri r0 = r0.A0C()
            r5.A01 = r0
        L_0x00ec:
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L_0x0014
            android.net.Uri r0 = r5.A01
            java.lang.String r0 = r0.getPath()
            java.io.File r13 = X.C108945cZ.A17(r0)
            com.whatsapp.mediaview.PhotoView r1 = r5.A02
            android.graphics.drawable.BitmapDrawable r0 = r1.A0I
            android.graphics.Bitmap r12 = r1.A08(r0)
            X.C17960vV.A07(r12)
            r4 = 0
            r11 = 90
        L_0x010a:
            r6 = 1
            r3 = 0
            X.11C r0 = r5.A08     // Catch:{ FileNotFoundException -> 0x05d6 }
            X.11B r1 = r0.A0O()     // Catch:{ FileNotFoundException -> 0x05d6 }
            if (r1 != 0) goto L_0x011a
            java.lang.String r0 = "GalleryWallpaperPreview/saveWallpaperForChat/save cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x05d6 }
            goto L_0x0120
        L_0x011a:
            android.net.Uri r0 = r5.A01     // Catch:{ FileNotFoundException -> 0x05d6 }
            java.io.OutputStream r4 = r1.A08(r0)     // Catch:{ FileNotFoundException -> 0x05d6 }
        L_0x0120:
            if (r4 != 0) goto L_0x0124
            goto L_0x05ad
        L_0x0124:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x05d6 }
            r12.compress(r0, r11, r4)     // Catch:{ FileNotFoundException -> 0x05d6 }
            int r11 = r11 + -10
            X.AnonymousClass1EY.A02(r4)
            int r0 = r5.A00
            if (r0 <= 0) goto L_0x0145
            if (r11 <= 0) goto L_0x0145
            boolean r0 = r13.exists()
            if (r0 == 0) goto L_0x0145
            long r9 = r13.length()
            int r0 = r5.A00
            long r0 = (long) r0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x010a
        L_0x0145:
            long r1 = r13.length()
            r9 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x05cb
            X.00H r0 = r5.A0C
            long r1 = X.C108975cc.A07(r0)
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x05cb
            java.lang.String r0 = "GalleryWallpaperPreview/saveWallpaperForChat/no space to save compressed image"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r0 = "no-space"
            android.content.Intent r0 = r1.putExtra(r0, r6)
            r5.setResult(r3, r0)
            return
        L_0x016c:
            java.lang.Object r5 = r4.A01
            X.01E r5 = (X.AnonymousClass01E) r5
            java.lang.Object r4 = r4.A02
            X.6zR r4 = (X.C139786zR) r4
            r3 = 1
            r0 = 2131435679(0x7f0b209f, float:1.8493207E38)
            android.view.View r1 = r5.findViewById(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0191
            r0 = 2131427923(0x7f0b0253, float:1.8477476E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r4.A00
            boolean r0 = X.AnonymousClass000.A1T(r0, r3)
            r1.setChecked(r0)
        L_0x0191:
            r0 = 2131435680(0x7f0b20a0, float:1.849321E38)
            android.view.View r1 = r5.findViewById(r0)
            if (r1 == 0) goto L_0x0014
            r0 = 2131427923(0x7f0b0253, float:1.8477476E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r4.A01
            if (r0 != r3) goto L_0x01a8
            r2 = 1
        L_0x01a8:
            r1.setChecked(r2)
            return
        L_0x01ac:
            java.lang.Object r5 = r4.A01
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r5 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r5
            java.lang.Object r3 = r4.A02
            X.77S r3 = (X.AnonymousClass77S) r3
            r0 = 2131435679(0x7f0b209f, float:1.8493207E38)
            android.view.View r0 = r5.findViewById(r0)
            if (r0 == 0) goto L_0x0014
            X.00H r0 = r5.A0H
            if (r0 == 0) goto L_0x0609
            java.lang.Object r2 = r0.get()
            X.71y r2 = (X.C1405571y) r2
            X.02n r1 = r5.A00
            if (r1 != 0) goto L_0x05fd
            java.lang.String r0 = "crosspostAccountUnlinkingActivityResultLauncher"
            goto L_0x087e
        L_0x01cf:
            java.lang.Object r5 = r4.A01
            X.7FX r5 = (X.AnonymousClass7FX) r5
            java.lang.Object r1 = r4.A02
            X.206 r1 = (X.AnonymousClass206) r1
            X.00H r0 = r5.A02
            java.lang.Object r0 = r0.get()
            X.1wv r0 = (X.C41701wv) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0014
            boolean r0 = r1 instanceof X.AnonymousClass23N
            if (r0 != 0) goto L_0x01f6
            android.os.Handler r3 = r5.A00
            r0 = 44
            X.7Pl r2 = new X.7Pl
            r2.<init>(r5, r1, r0)
        L_0x01f2:
            r3.post(r2)
            return
        L_0x01f6:
            X.23N r1 = (X.AnonymousClass23N) r1
            java.lang.String r1 = r1.A01
            if (r1 == 0) goto L_0x0014
            android.os.Handler r3 = r5.A00
            r0 = 15
            X.7RS r2 = new X.7RS
            r2.<init>(r0, r1, r5)
            goto L_0x01f2
        L_0x0206:
            java.lang.Object r5 = r4.A01
            X.7FX r5 = (X.AnonymousClass7FX) r5
            java.lang.Object r3 = r4.A02
            X.206 r3 = (X.AnonymousClass206) r3
            java.util.LinkedHashMap r2 = r5.A03
            X.205 r0 = r3.A0v
            java.lang.String r1 = r0.A01
            boolean r0 = r2.containsKey(r1)
            if (r0 != 0) goto L_0x0014
            X.C18070vi.A0X(r1)
            r2.put(r1, r3)
            X.00H r0 = r5.A01
            X.10T r2 = X.C17880vN.A0V(r0)
            X.1IX r1 = r5.A01()
            r0 = 19
            X.AnonymousClass7KY.A00(r2, r1, r0)
            return
        L_0x0230:
            java.lang.Object r1 = r4.A01
            X.7Ji r1 = (X.C144957Ji) r1
            java.lang.Object r0 = r4.A02
            X.2sw r0 = (X.C63362sw) r0
            X.71A r5 = r1.A00
            X.206 r3 = r0.A0A
            java.lang.String r10 = r0.A0h
            com.whatsapp.jid.UserJid r4 = r0.A05()
            r2 = 1
            if (r3 == 0) goto L_0x0014
            r0 = 262144(0x40000, double:1.295163E-318)
            boolean r0 = r3.A11(r0)
            if (r0 != r2) goto L_0x0014
            r6 = 0
            r8 = r6
            r9 = r6
            r7 = r6
            X.642 r1 = X.AnonymousClass71A.A00(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A06 = r0
            X.18K r0 = r5.A01
            X.C108965cb.A1E(r1, r0)
            return
        L_0x0262:
            java.lang.Object r1 = r4.A01
            X.7Ji r1 = (X.C144957Ji) r1
            java.lang.Object r0 = r4.A02
            X.2sw r0 = (X.C63362sw) r0
            X.1hg r4 = r1.A01
            X.206 r3 = r0.A0A
            X.0ve r2 = r4.A0B
            r1 = 11724(0x2dcc, float:1.6429E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r3 instanceof X.AnonymousClass227
            if (r0 == 0) goto L_0x0014
            X.212 r3 = (X.AnonymousClass212) r3
            if (r3 == 0) goto L_0x0014
            X.00H r0 = r4.A0G
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.1W6 r0 = (X.AnonymousClass1W6) r0
            X.206 r3 = X.C63792th.A00(r3, r0)
            if (r3 == 0) goto L_0x0014
            X.18K r2 = r4.A0C
            X.626 r1 = new X.626
            r1.<init>()
            X.00H r0 = r4.A0I
            int r0 = X.C62242r5.A00(r3, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            r2.CC7(r1)
            return
        L_0x02a7:
            java.lang.Object r1 = r4.A01
            X.Ad7 r1 = (X.C21015Ad7) r1
            java.lang.Object r0 = r4.A02
            X.6tX r0 = (X.C136266tX) r0
            java.lang.Object r1 = r1.A01
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r1 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r1
            java.lang.String r2 = r1.A1H
            java.lang.String r3 = r1.A1J
            java.lang.String r4 = r0.A02
            boolean r6 = r0.A05
            boolean r7 = r0.A04
            boolean r0 = r1.A1T
            r5 = 6
            if (r0 == 0) goto L_0x02c3
            r5 = 5
        L_0x02c3:
            r0 = 0
            r8 = 0
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1P(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1l(r1)
            return
        L_0x02cc:
            java.lang.Object r0 = r4.A01
            X.7Fd r0 = (X.C143877Fd) r0
            java.lang.Object r2 = r4.A02
            X.206 r2 = (X.AnonymousClass206) r2
            X.1Lg r1 = r0.A06
            r0 = -1
            r1.A02(r2, r0)
            return
        L_0x02db:
            java.lang.Object r0 = r4.A01
            X.1gT r0 = (X.C32001gT) r0
            java.lang.Object r2 = r4.A02
            X.206 r2 = (X.AnonymousClass206) r2
            X.1Lg r1 = r0.A02
            r0 = -1
            r1.A02(r2, r0)
            return
        L_0x02ea:
            java.lang.Object r1 = r4.A01
            com.whatsapp.report.ReportActivity r1 = (com.whatsapp.report.ReportActivity) r1
            java.lang.Object r0 = r4.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            com.whatsapp.report.ReportActivity.A0q(r1, r0)
            return
        L_0x02f6:
            java.lang.Object r3 = r4.A01
            com.whatsapp.report.ReportActivity r3 = (com.whatsapp.report.ReportActivity) r3
            java.lang.Object r2 = r4.A02
            java.lang.Integer r2 = (java.lang.Integer) r2
            com.whatsapp.report.ShareReportConfirmationDialogFragment r1 = new com.whatsapp.report.ShareReportConfirmationDialogFragment
            r1.<init>()
            X.7Lv r0 = new X.7Lv
            r0.<init>(r3, r2)
            r1.A00 = r0
            r0 = 0
            r3.CMk(r1, r0)
            return
        L_0x030f:
            java.lang.Object r1 = r4.A01
            X.3LG r1 = (X.AnonymousClass3LG) r1
            java.lang.Object r0 = r4.A02
            X.2mw r0 = (X.C59822mw) r0
            r1.C4Q(r0)
            return
        L_0x031b:
            java.lang.Object r0 = r4.A01
            X.1m1 r0 = (X.C35311m1) r0
            java.lang.Object r1 = r4.A02
            X.206 r1 = (X.AnonymousClass206) r1
            X.00H r0 = r0.A0A
            X.10T r4 = X.C17880vN.A0V(r0)
            long r2 = r1.A0x
            r1 = 0
            X.7KR r0 = new X.7KR
            r0.<init>(r2, r1)
            r4.notifyAllObservers(r0)
            return
        L_0x0335:
            java.lang.Object r5 = r4.A01
            X.6ua r5 = (X.C136896ua) r5
            java.lang.Object r4 = r4.A02
            X.6qB r4 = (X.C134186qB) r4
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            r5.A00()
            X.1DS r0 = r4.A07
            java.lang.String r3 = X.C108945cZ.A1F(r0)
            if (r3 == 0) goto L_0x0363
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0363
            java.lang.Long r0 = X.AnonymousClass1YD.A04(r3)
            if (r0 != 0) goto L_0x0363
            X.1OX r2 = r4.A0J
            r1 = 0
            com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$fireRequest$1 r0 = new com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$fireRequest$1
            r0.<init>(r4, r5, r3, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
        L_0x0363:
            java.lang.Object r5 = r4.A0H
            monitor-enter(r5)
            r0 = 0
            r4.A00 = r0     // Catch:{ all -> 0x05a2 }
            goto L_0x05a0
        L_0x036b:
            java.lang.Object r2 = r4.A01
            com.whatsapp.search.SearchFragment r2 = (com.whatsapp.search.SearchFragment) r2
            java.lang.Object r0 = r4.A02
            java.lang.Number r0 = (java.lang.Number) r0
            androidx.recyclerview.widget.RecyclerView r1 = r2.A05
            int r0 = r0.intValue()
            r1.A0f(r0)
            com.whatsapp.search.SearchFragment.A09(r2)
            return
        L_0x0380:
            java.lang.Object r3 = r4.A01
            com.whatsapp.search.SearchFragment r3 = (com.whatsapp.search.SearchFragment) r3
            java.lang.Object r2 = r4.A02
            X.1BI r2 = (X.AnonymousClass1BI) r2
            X.5jU r0 = r3.A0b
            int r1 = r0.A0W(r2)
            r0 = 5
            if (r1 != r0) goto L_0x03a7
            java.lang.String r5 = "business_search"
        L_0x0393:
            X.1eX r3 = r3.A0S
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A00(r2)
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "whatsapp"
            r3.A05(r4, r5, r6, r7, r9)
            return
        L_0x03a7:
            java.lang.String r5 = "global_search_new_chat"
            goto L_0x0393
        L_0x03aa:
            java.lang.Object r0 = r4.A01
            X.7FG r0 = (X.AnonymousClass7FG) r0
            java.lang.Object r1 = r4.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            java.lang.Object r0 = r0.A01
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            com.whatsapp.search.SearchFragment.A03(r1, r0)
            X.5jU r0 = r0.A0b
            r0.A0c()
            return
        L_0x03bf:
            java.lang.Object r0 = r4.A01
            com.whatsapp.service.RestoreChatConnectionWorker r0 = (com.whatsapp.service.RestoreChatConnectionWorker) r0
            java.lang.Object r1 = r4.A02
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            android.os.Handler r0 = r0.A00
            r0.removeCallbacks(r1)
            return
        L_0x03cd:
            java.lang.Object r0 = r4.A01
            com.whatsapp.service.RestoreChatConnectionWorker r0 = (com.whatsapp.service.RestoreChatConnectionWorker) r0
            java.lang.Object r1 = r4.A02
            X.1Hc r0 = r0.A03
            r0.unregisterObserver(r1)
            return
        L_0x03d9:
            java.lang.Object r2 = r4.A01
            com.whatsapp.settings.SettingsChat r2 = (com.whatsapp.settings.SettingsChat) r2
            java.lang.Object r1 = r4.A02
            X.1Dl r1 = (X.C22851Dl) r1
            X.1DS r0 = r2.A03
            r0.A0A(r2, r1)
            return
        L_0x03e7:
            java.lang.Object r0 = r4.A01
            com.whatsapp.settings.SettingsSetupUserProxyActivity r0 = (com.whatsapp.settings.SettingsSetupUserProxyActivity) r0
            java.lang.Object r1 = r4.A02
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            X.0vl r0 = r0.A05
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.settings.SettingsSetupUserProxyViewModel r3 = (com.whatsapp.settings.SettingsSetupUserProxyViewModel) r3
            java.lang.Object r2 = r1.second
            X.4Yf r2 = (X.C88074Yf) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.00H r1 = r3.A03
            r1.get()
            boolean r0 = X.C31311fM.A00(r2)
            if (r0 != 0) goto L_0x0410
            java.lang.String r0 = "SettingsSetupUserProxyViewModel/saveUserProxySettings/Unable to save proxy setting"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0410:
            java.lang.String r5 = r2.A02
            java.lang.String r6 = r2.A05
            int r7 = r2.A00
            int r8 = r2.A01
            boolean r9 = r2.A06
            X.4Yf r4 = new X.4Yf
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A01 = r4
            java.lang.Object r0 = r1.get()
            X.1fM r0 = (X.C31311fM) r0
            r0.A03(r2)
            X.1DT r1 = r3.A02
            java.lang.Integer r0 = X.C17880vN.A0i()
            X.1D6 r0 = X.AnonymousClass1D6.A01(r0, r2)
            r1.A0E(r0)
            return
        L_0x0438:
            java.lang.Object r0 = r4.A01
            X.1Nb r0 = (X.AnonymousClass1Nb) r0
            java.lang.Object r1 = r4.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.00H r0 = r0.A0M
            java.lang.Object r0 = r0.get()
            X.1mk r0 = (X.C35751mk) r0
            r0.A00(r1)
            return
        L_0x044c:
            java.lang.Object r0 = r4.A01
            X.1Nb r0 = (X.AnonymousClass1Nb) r0
            java.lang.Object r2 = r4.A02
            X.00H r0 = r0.A0O
            X.10T r1 = X.C17880vN.A0V(r0)
            r0 = 18
            X.AnonymousClass7KY.A00(r1, r2, r0)
            return
        L_0x045e:
            java.lang.Object r1 = r4.A01
            X.1Nh r1 = (X.C25201Nh) r1
            java.lang.Object r0 = r4.A02
            X.1Ev r0 = (X.C23141Ev) r0
            r1.A0Q(r0)
            return
        L_0x046a:
            java.lang.Object r3 = r4.A01
            com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview r3 = (com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview) r3
            java.lang.Object r2 = r4.A02
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            android.content.Intent r1 = X.C17880vN.A0A()
            android.net.Uri r0 = r3.A01
            r1.setData(r0)
            java.lang.String r0 = "chat_jid"
            X.AnonymousClass3MY.A13(r1, r2, r0)
            X.C72453Mb.A16(r3, r1)
            return
        L_0x0484:
            java.lang.Object r2 = r4.A01
            X.2fs r2 = (X.C55502fs) r2
            java.lang.Object r1 = r4.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            boolean r0 = r1 instanceof X.AnonymousClass1E9
            if (r0 == 0) goto L_0x049e
            X.1MZ r0 = r2.A01
            X.1E9 r1 = (X.AnonymousClass1E9) r1
            X.1MW r0 = r0.A08
            int r0 = r0.A0A(r1)
            long r0 = (long) r0
        L_0x049b:
            r2.A00 = r0
            return
        L_0x049e:
            r0 = 0
            goto L_0x049b
        L_0x04a1:
            java.lang.Object r1 = r4.A01
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel r1 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel) r1
            java.lang.Object r0 = r4.A02
            X.1BI r0 = (X.AnonymousClass1BI) r0
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel.A00(r0, r1)
            return
        L_0x04ad:
            java.lang.Object r1 = r4.A01
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity r1 = (com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity) r1
            java.lang.Object r0 = r4.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity.A0Q(r1, r0)
            return
        L_0x04b9:
            java.lang.Object r5 = r4.A01
            X.5nA r5 = (X.C113485nA) r5
            java.lang.Object r3 = r4.A02
            X.206 r3 = (X.AnonymousClass206) r3
            X.00c r0 = r5.A0C
            X.10E r0 = (X.AnonymousClass10E) r0
            X.1gV r2 = X.C108955ca.A0b(r0)
            android.widget.ImageView r1 = r5.A0A
            X.7NF r0 = r5.A0G
            r2.A0D(r1, r3, r0)
            return
        L_0x04d1:
            java.lang.Object r5 = r4.A01
            X.5nA r5 = (X.C113485nA) r5
            java.lang.Object r3 = r4.A02
            X.206 r3 = (X.AnonymousClass206) r3
            X.00c r0 = r5.A0C
            X.10E r0 = (X.AnonymousClass10E) r0
            X.1gV r2 = X.C108955ca.A0b(r0)
            android.widget.ImageView r1 = r5.A0A
            X.7NF r0 = r5.A0G
            r2.A0E(r1, r3, r0)
            return
        L_0x04e9:
            java.lang.Object r2 = r4.A01
            X.1u7 r2 = (X.C40071u7) r2
            java.lang.Object r1 = r4.A02
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            android.widget.ImageView r0 = r2.A02
            r0.setImageBitmap(r1)
            return
        L_0x04fb:
            java.lang.Object r1 = r4.A01
            X.71y r1 = (X.C1405571y) r1
            java.lang.Object r0 = r4.A02
            android.view.View r0 = (android.view.View) r0
            X.6pB r4 = r1.A03
            android.content.Context r3 = X.AnonymousClass3MY.A04(r0)
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            java.lang.String r0 = "status_privacy_settings"
            r4.A01(r3, r2, r1, r0)
            return
        L_0x0513:
            java.lang.Object r1 = r4.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r4.A02
            android.content.Intent r0 = (android.content.Intent) r0
            r1.startActivity(r0)
            return
        L_0x051f:
            boolean r0 = r5 instanceof X.C120676Ev
            if (r0 == 0) goto L_0x05a5
            X.6Ev r5 = (X.C120676Ev) r5
            X.7pK r9 = new X.7pK
            r9.<init>(r10)
            X.7pL r8 = new X.7pL
            r8.<init>(r10)
            monitor-enter(r5)
            r11 = 2
            java.lang.String r0 = "gdpr/download-report"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05a2 }
            X.6tr r2 = X.C120676Ev.A00(r5)     // Catch:{ all -> 0x05a2 }
            if (r2 != 0) goto L_0x0542
            java.lang.String r0 = "gdpr/download/no-message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05a2 }
            goto L_0x05a0
        L_0x0542:
            X.1KB r7 = r5.A02     // Catch:{ all -> 0x05a2 }
            X.18K r6 = r5.A06     // Catch:{ all -> 0x05a2 }
            X.11Z r4 = r5.A05     // Catch:{ all -> 0x05a2 }
            X.1Me r3 = r5.A03     // Catch:{ all -> 0x05a2 }
            X.1NM r1 = r5.A04     // Catch:{ all -> 0x05a2 }
            X.10I r0 = r5.A08     // Catch:{ all -> 0x05a2 }
            X.68N r13 = new X.68N     // Catch:{ all -> 0x05a2 }
            r14 = r10
            r15 = r7
            r16 = r3
            r17 = r1
            r18 = r4
            r19 = r6
            r20 = r5
            r21 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x05a2 }
            X.1nT r12 = r5.A07     // Catch:{ all -> 0x05a2 }
            X.1So r14 = X.C26551So.A0B     // Catch:{ all -> 0x05a2 }
            java.lang.String r10 = r2.A05     // Catch:{ all -> 0x05a2 }
            java.lang.String r7 = r2.A03     // Catch:{ all -> 0x05a2 }
            java.lang.String r6 = r2.A02     // Catch:{ all -> 0x05a2 }
            java.lang.String r4 = r2.A06     // Catch:{ all -> 0x05a2 }
            java.lang.String r3 = r2.A01     // Catch:{ all -> 0x05a2 }
            java.lang.String r0 = r2.A04     // Catch:{ all -> 0x05a2 }
            byte[] r23 = android.util.Base64.decode(r0, r11)     // Catch:{ all -> 0x05a2 }
            long r0 = r2.A00     // Catch:{ all -> 0x05a2 }
            r24 = 7
            r2 = 28
            X.7Ne r15 = new X.7Ne     // Catch:{ all -> 0x05a2 }
            r15.<init>(r8, r5, r2)     // Catch:{ all -> 0x05a2 }
            r8 = 29
            X.7Ne r2 = new X.7Ne     // Catch:{ all -> 0x05a2 }
            r2.<init>(r9, r5, r8)     // Catch:{ all -> 0x05a2 }
            r27 = 0
            r22 = 0
            r25 = 8
            r26 = 6
            r28 = r0
            r17 = r10
            r18 = r7
            r19 = r6
            r20 = r4
            r21 = r3
            r16 = r2
            r12.A0A(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x05a2 }
        L_0x05a0:
            monitor-exit(r5)
            return
        L_0x05a2:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x05a5:
            r5.A0G(r10)
            return
        L_0x05a9:
            com.whatsapp.report.BusinessActivityReportViewModel.A00(r3)
            return
        L_0x05ad:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ FileNotFoundException -> 0x05d6 }
            java.lang.String r0 = "GalleryWallpaperPreview/saveWallpaperForChat/failed to open output stream for "
            r1.append(r0)     // Catch:{ FileNotFoundException -> 0x05d6 }
            android.net.Uri r0 = r5.A01     // Catch:{ FileNotFoundException -> 0x05d6 }
            java.lang.String r0 = r0.getPath()     // Catch:{ FileNotFoundException -> 0x05d6 }
            X.C17890vO.A1A(r1, r0)     // Catch:{ FileNotFoundException -> 0x05d6 }
            android.content.Intent r0 = X.C17880vN.A0A()     // Catch:{ FileNotFoundException -> 0x05d6 }
            android.content.Intent r0 = r0.putExtra(r7, r6)     // Catch:{ FileNotFoundException -> 0x05d6 }
            r5.setResult(r3, r0)     // Catch:{ FileNotFoundException -> 0x05d6 }
            goto L_0x05f4
        L_0x05cb:
            X.1KB r3 = r5.A05
            r0 = 32
            X.7Pl r2 = new X.7Pl
            r2.<init>(r5, r8, r0)
            goto L_0x0708
        L_0x05d6:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x05f8 }
            java.lang.String r0 = "GalleryWallpaperPreview/saveWallpaperForChat/file not found at "
            r1.append(r0)     // Catch:{ all -> 0x05f8 }
            android.net.Uri r0 = r5.A01     // Catch:{ all -> 0x05f8 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x05f8 }
            X.C108985cd.A1M(r0, r1, r2)     // Catch:{ all -> 0x05f8 }
            android.content.Intent r0 = X.C17880vN.A0A()     // Catch:{ all -> 0x05f8 }
            android.content.Intent r0 = r0.putExtra(r7, r6)     // Catch:{ all -> 0x05f8 }
            r5.setResult(r3, r0)     // Catch:{ all -> 0x05f8 }
        L_0x05f4:
            X.AnonymousClass1EY.A02(r4)
            return
        L_0x05f8:
            r0 = move-exception
            X.AnonymousClass1EY.A02(r4)
            throw r0
        L_0x05fd:
            X.89c r0 = r5.A0A
            if (r0 != 0) goto L_0x0605
            java.lang.String r0 = "crosspostAccountLinkingResultListener"
            goto L_0x087e
        L_0x0605:
            r2.A02(r1, r5, r3, r0)
            return
        L_0x0609:
            java.lang.String r0 = "statusPrivacyCrosspostingSettingHandler"
            goto L_0x087e
        L_0x060d:
            java.lang.Object r2 = r4.A01
            X.6pm r2 = (X.C133956pm) r2
            java.lang.Object r1 = r4.A02
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.1M9 r0 = r2.A00
            if (r0 != 0) goto L_0x0621
            java.lang.String r0 = "contactManager"
            goto L_0x087e
        L_0x0621:
            r0.A0w(r1)
            X.12E r0 = r2.A02
            if (r0 != 0) goto L_0x062c
            java.lang.String r0 = "contactSyncMethods"
            goto L_0x087e
        L_0x062c:
            r0.A0A()
            return
        L_0x0630:
            java.lang.Object r2 = r4.A01
            com.whatsapp.report.ReportActivity r2 = (com.whatsapp.report.ReportActivity) r2
            java.lang.Object r1 = r4.A02
            java.lang.Integer r1 = (java.lang.Integer) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r2.A0K
            if (r0 == 0) goto L_0x064a
            java.lang.Object r0 = r0.get()
            X.2kU r0 = (X.C58312kU) r0
            r0.A01(r2, r1)
            return
        L_0x064a:
            java.lang.String r0 = "reportLinkUtil"
            goto L_0x087e
        L_0x064e:
            java.lang.Object r10 = r4.A01
            X.1m1 r10 = (X.C35311m1) r10
            java.lang.Object r4 = r4.A02
            X.23j r4 = (X.C444223j) r4
            java.lang.String r0 = "scheduled-call/onScheduledCallMessageAdded execute on worker thread"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Uq r6 = r10.A06
            X.205 r9 = r4.A0v
            X.1BI r7 = r9.A00
            java.lang.String r0 = "chat jid shouldn't be null"
            X.C17960vV.A08(r7, r0)
            boolean r13 = r9.A02
            if (r13 == 0) goto L_0x067c
            X.11S r0 = r6.A00
            com.whatsapp.jid.PhoneUserJid r3 = X.AnonymousClass11S.A00(r0)
        L_0x0670:
            java.lang.String r0 = "sender jid shouldn't be null"
            X.C17960vV.A08(r3, r0)
            X.1Cd r0 = r6.A03
            X.1au r8 = r0.A05()
            goto L_0x0681
        L_0x067c:
            com.whatsapp.jid.UserJid r3 = r4.A0I()
            goto L_0x0670
        L_0x0681:
            r0 = 9
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x070c }
            r5.<init>(r0)     // Catch:{ all -> 0x070c }
            java.lang.String r2 = "creation_message_row_id"
            long r0 = r4.A0x     // Catch:{ all -> 0x070c }
            X.C17880vN.A19(r5, r2, r0)     // Catch:{ all -> 0x070c }
            java.lang.String r1 = "key_id"
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x070c }
            r5.put(r1, r0)     // Catch:{ all -> 0x070c }
            java.lang.String r1 = "key_from_me"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x070c }
            r5.put(r1, r0)     // Catch:{ all -> 0x070c }
            java.lang.String r2 = "key_chat_row_id"
            X.1LW r0 = r6.A01     // Catch:{ all -> 0x070c }
            long r0 = r0.A09(r7)     // Catch:{ all -> 0x070c }
            X.C17880vN.A19(r5, r2, r0)     // Catch:{ all -> 0x070c }
            java.lang.String r1 = "call_type"
            int r0 = r4.A00     // Catch:{ all -> 0x070c }
            X.C17880vN.A18(r5, r1, r0)     // Catch:{ all -> 0x070c }
            java.lang.String r2 = "scheduled_timestamp"
            long r0 = r4.A01     // Catch:{ all -> 0x070c }
            X.C17880vN.A19(r5, r2, r0)     // Catch:{ all -> 0x070c }
            java.lang.String r1 = "call_title"
            java.lang.String r0 = r4.A02     // Catch:{ all -> 0x070c }
            r5.put(r1, r0)     // Catch:{ all -> 0x070c }
            java.lang.String r2 = "creator_jid_row_id"
            X.1DL r0 = r6.A02     // Catch:{ all -> 0x070c }
            long r0 = r0.A09(r3)     // Catch:{ all -> 0x070c }
            X.C17880vN.A19(r5, r2, r0)     // Catch:{ all -> 0x070c }
            java.lang.String r1 = "is_upcoming"
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()     // Catch:{ all -> 0x070c }
            r5.put(r1, r0)     // Catch:{ all -> 0x070c }
            java.lang.String r0 = "call_log_row_id"
            r5.putNull(r0)     // Catch:{ all -> 0x070c }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x070c }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x070c }
            java.lang.String r2 = "scheduled_calls"
            java.lang.String r1 = "ScheduledCallsStore/insert"
            r0 = 5
            r3.A09(r2, r1, r5, r0)     // Catch:{ all -> 0x070c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x070c }
            java.lang.String r0 = "ScheduledCallsStore/insertOnCurrentThread/inserted; messageScheduledCall.row_id="
            X.AnonymousClass206.A06(r4, r0, r1)     // Catch:{ all -> 0x070c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x070c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x070c }
            r8.close()
            long r11 = r4.A0x
            long r14 = r4.A01
            r10.A02(r11, r13, r14)
            X.1KB r3 = r10.A00
            r0 = 9
            X.7Pl r2 = new X.7Pl
            r2.<init>(r10, r4, r0)
        L_0x0708:
            r3.A0J(r2)
            return
        L_0x070c:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0711 }
            throw r1
        L_0x0711:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0716:
            java.lang.Object r1 = r4.A01
            com.whatsapp.settings.SettingsPasskeysDisabledFragment r1 = (com.whatsapp.settings.SettingsPasskeysDisabledFragment) r1
            java.lang.Object r3 = r4.A02
            X.9MT r3 = (X.AnonymousClass9MT) r3
            X.C18070vi.A0h(r1, r3)
            X.00H r0 = r1.A02
            if (r0 == 0) goto L_0x073b
            java.lang.Object r2 = r0.get()
            X.6y0 r2 = (X.C138976y0) r2
            android.content.Context r1 = r1.A14()
            X.8yY r3 = (X.C175338yY) r3
            java.lang.Object r0 = r3.A00
            X.A1b r0 = (X.C19966A1b) r0
            java.lang.Integer r0 = r0.A01
            r2.A01(r1, r0)
            return
        L_0x073b:
            java.lang.String r0 = "passkeyRemedyPresenter"
            goto L_0x087e
        L_0x073f:
            java.lang.Object r0 = r4.A01
            com.whatsapp.settings.SettingsPasskeysEnabledFragment r0 = (com.whatsapp.settings.SettingsPasskeysEnabledFragment) r0
            java.lang.Object r3 = r4.A02
            X.1FU r3 = (X.AnonymousClass1FU) r3
            X.C18070vi.A0h(r0, r3)
            X.0ve r2 = r0.A00
            if (r2 == 0) goto L_0x079d
            r1 = 9168(0x23d0, float:1.2847E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            X.9zE r2 = new X.9zE
            r2.<init>(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0765
            r0 = 2131893546(0x7f121d2a, float:1.9421872E38)
        L_0x0761:
            X.C198979zE.A00(r2, r1, r0)
            return
        L_0x0765:
            r0 = 2131893550(0x7f121d2e, float:1.942188E38)
            goto L_0x0761
        L_0x0769:
            java.lang.Object r0 = r4.A01
            com.whatsapp.settings.SettingsPasskeysEnabledFragment r0 = (com.whatsapp.settings.SettingsPasskeysEnabledFragment) r0
            java.lang.Object r3 = r4.A02
            X.1FU r3 = (X.AnonymousClass1FU) r3
            boolean r4 = X.C18070vi.A15(r0, r3)
            X.0ve r2 = r0.A00
            if (r2 == 0) goto L_0x079d
            r1 = 9168(0x23d0, float:1.2847E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            X.9zE r0 = new X.9zE
            if (r1 == 0) goto L_0x0796
            r0.<init>(r3)
            r3 = 2131893545(0x7f121d29, float:1.942187E38)
        L_0x078b:
            X.1FU r2 = r0.A00
            r1 = 2131893547(0x7f121d2b, float:1.9421874E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r2.BhU(r0, r1, r3)
            return
        L_0x0796:
            r0.<init>(r3)
            r3 = 2131893549(0x7f121d2d, float:1.9421878E38)
            goto L_0x078b
        L_0x079d:
            java.lang.String r0 = "abProps"
            goto L_0x087e
        L_0x07a1:
            java.lang.Object r3 = r4.A01
            com.whatsapp.spamreport.ReportSpamDialogFragment r3 = (com.whatsapp.spamreport.ReportSpamDialogFragment) r3
            java.lang.Object r2 = r4.A02
            X.1EC r2 = (X.AnonymousClass1EC) r2
            X.00H r0 = r3.A0G
            if (r0 == 0) goto L_0x07c8
            X.1kb r0 = X.AnonymousClass3MW.A0Z(r0)
            java.util.HashSet r1 = r0.A08(r2)
            r0 = 1
            com.whatsapp.community.CommunityExitDialogFragment r2 = com.whatsapp.community.CommunityExitDialogFragment.A00(r2, r1, r0)
            X.1FL r0 = r3.A1B()
            X.1FU r1 = X.C108985cd.A0L(r0)
            java.lang.String r0 = "CommunityExitDialogFragment"
            r1.CMk(r2, r0)
            return
        L_0x07c8:
            java.lang.String r0 = "communityChatManager"
            goto L_0x087e
        L_0x07cc:
            java.lang.Object r3 = r4.A01
            com.whatsapp.spamreport.ReportSpamDialogFragment r3 = (com.whatsapp.spamreport.ReportSpamDialogFragment) r3
            java.lang.Object r1 = r4.A02
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            X.4Xn r2 = r3.A0C
            if (r2 == 0) goto L_0x07e7
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass3MZ.A0w(r1)
            X.0vl r0 = r3.A0T
            r0.getValue()
            r2.A01(r1)
            return
        L_0x07e7:
            java.lang.String r0 = "shareReportOrBlockToMetaHelper"
            goto L_0x087e
        L_0x07eb:
            java.lang.Object r5 = r4.A01
            com.whatsapp.status.crossposting.privacy.ShareToFacebookActivity r5 = (com.whatsapp.status.crossposting.privacy.ShareToFacebookActivity) r5
            java.lang.Object r1 = r4.A02
            X.6p4 r1 = (X.C133616p4) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r5.A03
            if (r0 == 0) goto L_0x087c
            java.lang.Object r2 = r0.get()
            X.6gq r2 = (X.C128886gq) r2
            java.lang.Integer r6 = com.whatsapp.status.crossposting.privacy.ShareToFacebookActivity.A07
            X.6oz r3 = new X.6oz
            r3.<init>(r5, r1)
            r5 = 0
            X.C18070vi.A0d(r6, r5)
            r8 = 2
            X.00H r7 = r2.A01
            X.1mM r0 = X.C108945cZ.A11(r7)
            X.6qd r1 = r0.A00(r6)
            if (r1 == 0) goto L_0x0878
            X.7vq r0 = new X.7vq
            r0.<init>(r2, r1)
            java.lang.Object r4 = X.C20017A3j.A00(r0, r8)
            X.6iF r4 = (X.C129716iF) r4
            int r1 = r4.A02
            r0 = -1
            r2 = 0
            if (r1 == r0) goto L_0x0862
            if (r1 == 0) goto L_0x086c
            java.lang.String r2 = "Generic exception"
            if (r1 == r8) goto L_0x083e
            java.lang.String r0 = "AccountLinkingLoginManager/unlinkCurrentFbUserEntity failed to logout, Generic error"
            X.C18070vi.A0d(r0, r5)
            X.6Sn r0 = new X.6Sn
            r0.<init>((java.lang.String) r2)
            r3.A01(r0)
            return
        L_0x083e:
            int r1 = r4.A00
            r0 = 190(0xbe, float:2.66E-43)
            if (r1 != r0) goto L_0x0854
            java.lang.String r0 = "AccountLinkingLoginManager/unlinkCurrentFbUserEntity already invalidated at server"
            X.C18070vi.A0d(r0, r5)
            X.1mM r0 = X.C108945cZ.A11(r7)
            r0.A04(r6, r5)
            r3.A00()
            return
        L_0x0854:
            java.lang.String r0 = "AccountLinkingLoginManager/unlinkCurrentFbUserEntity failed to logout"
            X.C18070vi.A0d(r0, r5)
            X.6Sn r0 = new X.6Sn
            r0.<init>((java.lang.String) r2)
            r3.A01(r0)
            return
        L_0x0862:
            r1 = 3
            X.6Q9 r0 = new X.6Q9
            r0.<init>(r2, r2, r2, r1)
            r3.A01(r0)
            return
        L_0x086c:
            java.lang.String r0 = "AccountLinkingLoginManager/unlinkCurrentFbUserEntity success"
            X.C18070vi.A0d(r0, r5)
            X.1mM r0 = X.C108945cZ.A11(r7)
            r0.A04(r6, r5)
        L_0x0878:
            r3.A00()
            return
        L_0x087c:
            java.lang.String r0 = "accountLinkingLoginManagerLazy"
        L_0x087e:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146527Pl.run():void");
    }
}
