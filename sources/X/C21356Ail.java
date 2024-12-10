package X;

/* renamed from: X.Ail  reason: case insensitive filesystem */
public class C21356Ail implements Runnable {
    public final int A00;
    public final Object A01;

    public C21356Ail(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.whatsapp.migration.transferinfra.service.WifiGroupCreatorP2pTransferService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.whatsapp.migration.transferinfra.service.WifiGroupScannerP2pTransferService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: com.whatsapp.migration.transferinfra.service.WifiGroupCreatorP2pTransferService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: com.whatsapp.migration.transferinfra.service.WifiGroupCreatorP2pTransferService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: com.whatsapp.migration.transferinfra.service.WifiGroupCreatorP2pTransferService} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        com.whatsapp.util.Log.i("p2p/WifiDirectManager/ Network connected, requesting network info");
        r3 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02f7, code lost:
        X.C88634aG.A03(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02fa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0350, code lost:
        r2.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0353, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r2 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0366, code lost:
        r0 = "contextualHelpHandler";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x037c, code lost:
        r0 = 2131896261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0397, code lost:
        r0 = 2131889065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x039a, code lost:
        r1.BhQ(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x039d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        r2.requestConnectionInfo(r3, new X.AAF(r4, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x041c, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0420, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x042e, code lost:
        r1.A08(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0431, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x017c, code lost:
        r0 = X.C181519Qu.A00(X.AnonymousClass9IF.A02, r3, (java.lang.String) null, r2);
        r0.A00 = r5;
        X.C20098A7b.A00(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0188, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0189;
                case 1: goto L_0x000f;
                case 2: goto L_0x0029;
                case 3: goto L_0x01cc;
                case 4: goto L_0x01da;
                case 5: goto L_0x001e;
                case 6: goto L_0x01e2;
                case 7: goto L_0x025e;
                case 8: goto L_0x0268;
                case 9: goto L_0x0052;
                case 10: goto L_0x0078;
                case 11: goto L_0x0085;
                case 12: goto L_0x0270;
                case 13: goto L_0x0276;
                case 14: goto L_0x027e;
                case 15: goto L_0x0284;
                case 16: goto L_0x0290;
                case 17: goto L_0x02a0;
                case 18: goto L_0x02be;
                case 19: goto L_0x02d5;
                case 20: goto L_0x0375;
                case 21: goto L_0x02d5;
                case 22: goto L_0x02dd;
                case 23: goto L_0x02e3;
                case 24: goto L_0x02f2;
                case 25: goto L_0x02fb;
                case 26: goto L_0x01da;
                case 27: goto L_0x0335;
                case 28: goto L_0x009f;
                case 29: goto L_0x009f;
                case 30: goto L_0x033e;
                case 31: goto L_0x0107;
                case 32: goto L_0x0354;
                case 33: goto L_0x0005;
                case 34: goto L_0x013f;
                case 35: goto L_0x0005;
                case 36: goto L_0x0005;
                case 37: goto L_0x0005;
                case 38: goto L_0x036a;
                case 39: goto L_0x0380;
                case 40: goto L_0x0375;
                case 41: goto L_0x0375;
                case 42: goto L_0x0380;
                case 43: goto L_0x038b;
                case 44: goto L_0x0421;
                case 45: goto L_0x0390;
                case 46: goto L_0x039e;
                case 47: goto L_0x014b;
                case 48: goto L_0x015f;
                case 49: goto L_0x03a8;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            X.4Qm r0 = (X.C86164Qm) r0
            X.1KB r0 = r0.A01
        L_0x000b:
            r0.A04()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r1 = r10.A01
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r1 = (com.whatsapp.migration.transfer.ui.ChatTransferViewModel) r1
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x000e
            X.AMY r2 = r1.A0F
            r2.A01()
            goto L_0x03e6
        L_0x001e:
            java.lang.Object r0 = r10.A01
            com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler r0 = (com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler) r0
            X.8vT r4 = r0.A03
            if (r4 != 0) goto L_0x003b
            java.lang.String r0 = "p2p/WifiDirectScannerConnectionHandler/ WifiDirect is not initialized, we shouldn't be here."
            goto L_0x0037
        L_0x0029:
            java.lang.Object r1 = r10.A01
            X.9gk r1 = (X.C188019gk) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorManager r4 = r1.A01
            if (r4 != 0) goto L_0x003b
            java.lang.String r0 = "p2p/WifiDirectCreatorConnectionHandler/ WifiDirect is not initialized, we shouldn't be here."
        L_0x0037:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x003b:
            java.lang.String r0 = "p2p/WifiDirectManager/ Network connected, requesting network info"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.net.wifi.p2p.WifiP2pManager$Channel r3 = r4.A00
            if (r3 == 0) goto L_0x000e
            android.net.wifi.p2p.WifiP2pManager r2 = r4.A01
            if (r2 == 0) goto L_0x000e
            r1 = 1
            X.AAF r0 = new X.AAF
            r0.<init>(r4, r1)
            r2.requestConnectionInfo(r3, r0)
            return
        L_0x0052:
            java.lang.Object r1 = r10.A01
            com.whatsapp.music.ui.MusicBrowseFragment r1 = (com.whatsapp.music.ui.MusicBrowseFragment) r1
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x000e
            boolean r0 = r1.A1e()
            if (r0 == 0) goto L_0x000e
            boolean r0 = r1.A0Z
            if (r0 != 0) goto L_0x000e
            boolean r0 = r1.A0j
            if (r0 != 0) goto L_0x000e
            r2 = 1
            r1.A06 = r2
            X.00H r0 = r1.A04
            if (r0 == 0) goto L_0x0411
            X.1KB r1 = X.C108945cZ.A0a(r0)
            r0 = 2131892347(0x7f12187b, float:1.941944E38)
            goto L_0x042e
        L_0x0078:
            java.lang.Object r0 = r10.A01
            com.whatsapp.mute.ui.MuteDialogViewModel r0 = (com.whatsapp.mute.ui.MuteDialogViewModel) r0
            X.1NN r1 = r0.A08
            if (r1 == 0) goto L_0x000e
            r0 = 1
            r1.A01(r0)
            return
        L_0x0085:
            java.lang.Object r0 = r10.A01
            com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment r0 = (com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment) r0
            com.whatsapp.phonematching.MatchPhoneNumberFragment r1 = com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment.A00(r0)
            if (r1 == 0) goto L_0x000e
            com.whatsapp.WaEditText r0 = r1.A06
            if (r0 == 0) goto L_0x0096
            r0.requestFocus()
        L_0x0096:
            com.whatsapp.WaEditText r1 = r1.A06
            if (r1 == 0) goto L_0x000e
            r0 = 0
            r1.A0I(r0)
            return
        L_0x009f:
            java.lang.Object r4 = r10.A01
            X.AMB r4 = (X.AMB) r4
            boolean r0 = r4.A03()
            if (r0 == 0) goto L_0x00c0
            X.1PY r0 = r4.A03
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x00c0
            X.8xu r2 = new X.8xu
            r2.<init>()
        L_0x00b6:
            r1 = 0
            X.A6Z r0 = new X.A6Z
            r0.<init>(r2, r1)
            r4.A04(r0)
            return
        L_0x00c0:
            X.1PY r1 = r4.A03
            X.5WY r0 = r4.A00()
            X.A2g r1 = r1.A01(r0)
            X.AzD r0 = new X.AzD
            r0.<init>(r1)
            X.8ty r3 = new X.8ty
            r3.<init>(r0)
            r4.A00 = r3
            r1 = 32000(0x7d00, double:1.581E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Object r3 = r3.A06(r1, r0)
            boolean r0 = r3 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00f6
            r1 = r3
            X.8tz r1 = (X.C172768tz) r1
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x00fd
            org.json.JSONArray r2 = r1.A01
            r1 = 0
            X.A6Z r0 = new X.A6Z
            r0.<init>(r1, r2)
            r4.A04(r0)
        L_0x00f6:
            java.lang.Throwable r2 = X.C30671eK.A00(r3)
            if (r2 == 0) goto L_0x000e
            goto L_0x00b6
        L_0x00fd:
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x00f6
            X.A8k r0 = r1.A00
            r4.A02(r0)
            goto L_0x00f6
        L_0x0107:
            java.lang.Object r5 = r10.A01
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector r5 = (com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector) r5
            X.0vl r0 = r5.A09
            java.lang.Object r4 = r0.getValue()
            X.1ch r4 = (X.C29681ch) r4
            if (r4 == 0) goto L_0x000e
            X.00H r0 = r5.A05
            if (r0 == 0) goto L_0x0414
            java.lang.Object r0 = r0.get()
            X.9p0 r0 = (X.C192799p0) r0
            X.9IV r3 = X.AnonymousClass9IV.FULL
            java.util.List r0 = r0.A01(r3, r4)
            java.util.List r0 = r5.A5D(r0)
            r5.A06 = r0
            X.00H r0 = r5.A05
            if (r0 == 0) goto L_0x0414
            java.lang.Object r2 = r0.get()
            X.9p0 r2 = (X.C192799p0) r2
            X.AWU r1 = new X.AWU
            r1.<init>(r5)
            r0 = 1
            r2.A00(r3, r4, r1, r0)
            return
        L_0x013f:
            java.lang.Object r1 = r10.A01
            X.4Qm r1 = (X.C86164Qm) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.1KB r0 = r1.A01
            goto L_0x000b
        L_0x014b:
            java.lang.Object r5 = r10.A01
            com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet r5 = (com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet) r5
            X.1FL r4 = X.AnonymousClass8BY.A0F(r5)
            if (r4 == 0) goto L_0x000e
            r0 = 2131886175(0x7f12005f, float:1.9406921E38)
            java.lang.String r3 = r5.A1H(r0)
            X.0wS r2 = X.C18460wS.A00
            goto L_0x017c
        L_0x015f:
            java.lang.Object r5 = r10.A01
            com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet r5 = (com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet) r5
            X.1FL r4 = X.AnonymousClass8BY.A0F(r5)
            if (r4 == 0) goto L_0x000e
            r0 = 2131886174(0x7f12005e, float:1.940692E38)
            java.lang.String r3 = r5.A1H(r0)
            X.11S r0 = r5.A01
            if (r0 == 0) goto L_0x0417
            X.1E2 r0 = r0.A0A()
            java.util.List r2 = X.C18070vi.A0M(r0)
        L_0x017c:
            X.9IF r1 = X.AnonymousClass9IF.ACCEPT_INVITE
            r0 = 0
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r0 = X.C181519Qu.A00(r1, r3, r0, r2)
            r0.A00 = r5
            X.C20098A7b.A00(r0, r4)
            return
        L_0x0189:
            java.lang.Object r6 = r10.A01
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r6 = (com.whatsapp.migration.transfer.ui.ChatTransferViewModel) r6
            r5 = 0
            X.AMY r1 = r6.A0F     // Catch:{ IOException -> 0x01a0, OperationCanceledException -> 0x0199 }
            android.os.CancellationSignal r0 = r6.A09     // Catch:{ IOException -> 0x01a0, OperationCanceledException -> 0x0199 }
            r1.A02(r0)     // Catch:{ IOException -> 0x01a0, OperationCanceledException -> 0x0199 }
            r6.A0X()     // Catch:{ IOException -> 0x01a0, OperationCanceledException -> 0x0199 }
            goto L_0x01c5
        L_0x0199:
            r1 = move-exception
            java.lang.String r0 = "p2p/fpm/ChatTransferViewModel/exportDataAndLaunchScanner/exportData cancelled"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x01c8 }
            goto L_0x01c5
        L_0x01a0:
            r4 = move-exception
            boolean r0 = r4 instanceof X.B8K     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x01c3
            r0 = r4
            X.B8K r0 = (X.B8K) r0     // Catch:{ all -> 0x01c8 }
            int r3 = r0.BUv()     // Catch:{ all -> 0x01c8 }
        L_0x01ac:
            X.AW8 r2 = r6.A0J     // Catch:{ all -> 0x01c8 }
            java.lang.String r1 = r4.getMessage()     // Catch:{ all -> 0x01c8 }
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r2.A00     // Catch:{ all -> 0x01c8 }
            X.A7P r0 = r0.A0H     // Catch:{ all -> 0x01c8 }
            r0.A04 = r1     // Catch:{ all -> 0x01c8 }
            r2.onError(r3)     // Catch:{ all -> 0x01c8 }
            java.lang.String r0 = "p2p/fpm/ChatTransferViewModel/exportDataAndLaunchScanner/exportData failed"
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x01c8 }
            r6.A06 = r5     // Catch:{ all -> 0x01c8 }
            goto L_0x01c5
        L_0x01c3:
            r3 = 1
            goto L_0x01ac
        L_0x01c5:
            r6.A00 = r5
            return
        L_0x01c8:
            r0 = move-exception
            r6.A00 = r5
            throw r0
        L_0x01cc:
            java.lang.Object r0 = r10.A01
            X.9Bn r0 = (X.C178029Bn) r0
            X.8yO r2 = r0.A02
            r1 = 603(0x25b, float:8.45E-43)
            java.lang.String r0 = "creator waited 300000 ms with no connection"
            r2.A00(r1, r0)
            return
        L_0x01da:
            java.lang.Object r0 = r10.A01
            X.0vk r0 = (X.C18090vk) r0
            r0.invoke()
            return
        L_0x01e2:
            java.lang.Object r3 = r10.A01
            X.8va r3 = (X.C173698va) r3
            boolean r0 = r3 instanceof com.whatsapp.migration.transferinfra.service.WifiGroupScannerP2pTransferService
            if (r0 == 0) goto L_0x0225
            com.whatsapp.migration.transferinfra.service.WifiGroupScannerP2pTransferService r3 = (com.whatsapp.migration.transferinfra.service.WifiGroupScannerP2pTransferService) r3
            X.9Bl r1 = r3.A03
            r4 = 0
            if (r1 == 0) goto L_0x0200
            java.net.Socket r0 = r1.A00
            X.AnonymousClass1EY.A02(r0)
            r1.interrupt()
            java.lang.String r0 = "p2p/WifiDirectScannerNetworkingThread/ socket closed and thread interrupted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3.A03 = r4
        L_0x0200:
            com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler r2 = r3.A02
            if (r2 == 0) goto L_0x0221
            com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler.A03(r2)
            X.8vT r1 = r2.A03
            if (r1 == 0) goto L_0x0215
            java.lang.String r0 = "p2p/WifiDirectScannerConnectionHandler/ stopping WifiDirect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A01()
            r2.A03 = r4
        L_0x0215:
            com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler.A02(r2)
            X.8vR r0 = r2.A02
            if (r0 == 0) goto L_0x021f
            r0.A00()
        L_0x021f:
            r3.A02 = r4
        L_0x0221:
            r3.stopSelf()
            return
        L_0x0225:
            com.whatsapp.migration.transferinfra.service.WifiGroupCreatorP2pTransferService r3 = (com.whatsapp.migration.transferinfra.service.WifiGroupCreatorP2pTransferService) r3
            X.9Bn r2 = r3.A04
            if (r2 == 0) goto L_0x0246
            java.lang.Runnable r1 = r2.A00
            if (r1 == 0) goto L_0x0234
            X.10I r0 = r2.A03
            r0.CEz(r1)
        L_0x0234:
            java.net.Socket r0 = r2.A01
            X.AnonymousClass1EY.A02(r0)
            java.net.ServerSocket r0 = r2.A04
            X.AnonymousClass1EY.A02(r0)
            r2.interrupt()
            java.lang.String r0 = "p2p/WifiDirectCreatorNetworkingThread/ sockets closed and thread interrupted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0246:
            r2 = 0
            r3.A04 = r2
            X.9gk r1 = r3.A03
            if (r1 == 0) goto L_0x025b
            com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorManager r0 = r1.A01
            if (r0 == 0) goto L_0x0254
            r0.A01()
        L_0x0254:
            X.8vS r0 = r1.A00
            if (r0 == 0) goto L_0x025b
            r0.A00()
        L_0x025b:
            r3.A03 = r2
            goto L_0x0221
        L_0x025e:
            java.lang.Object r1 = r10.A01
            X.5nD r1 = (X.C113515nD) r1
            java.util.List r0 = X.C42011xT.A0I
            r1.A0B()
            return
        L_0x0268:
            java.lang.Object r0 = r10.A01
            X.7K6 r0 = (X.AnonymousClass7K6) r0
            X.AnonymousClass7K6.A01(r0)
            return
        L_0x0270:
            java.lang.Object r1 = r10.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            goto L_0x037c
        L_0x0276:
            java.lang.Object r1 = r10.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            r0 = 0
            r1.A0p = r0
            return
        L_0x027e:
            java.lang.Object r0 = r10.A01
            X.AnonymousClass3MW.A1U(r0)
            return
        L_0x0284:
            java.lang.Object r1 = r10.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            com.whatsapp.newsletter.NewsletterInfoActivity.A1F(r1)
            r0 = 0
            com.whatsapp.newsletter.NewsletterInfoActivity.A1P(r1, r0, r0)
            return
        L_0x0290:
            java.lang.Object r2 = r10.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r2 = (com.whatsapp.newsletter.NewsletterInfoActivity) r2
            r0 = 2131895342(0x7f12242e, float:1.9425514E38)
            java.lang.String r1 = X.C18070vi.A0F(r2, r0)
            r0 = 1
            com.whatsapp.newsletter.NewsletterInfoActivity.A1J(r2, r1, r0)
            return
        L_0x02a0:
            java.lang.Object r5 = r10.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r5 = (com.whatsapp.newsletter.NewsletterInfoActivity) r5
            r1 = 0
            X.0vb r4 = r5.A00
            r3 = 2131755197(0x7f1000bd, float:1.9141266E38)
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            X.C17880vN.A1T(r2, r0, r1)
            r0 = 1
            java.lang.String r1 = r4.A0K(r2, r3, r0)
            X.C18070vi.A0X(r1)
            r0 = 1
            com.whatsapp.newsletter.NewsletterInfoActivity.A1J(r5, r1, r0)
            return
        L_0x02be:
            java.lang.Object r3 = r10.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r3 = (com.whatsapp.newsletter.NewsletterInfoActivity) r3
            X.3oU r2 = r3.A0g
            r1 = 0
            if (r2 != 0) goto L_0x02cd
            java.lang.String r0 = "newsletterInfoViewModel"
            X.C18070vi.A11(r0)
            throw r1
        L_0x02cd:
            r0 = 1
            r2.A0Z(r0)
            r3.CEx()
            return
        L_0x02d5:
            java.lang.Object r0 = r10.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            r0.CEx()
            return
        L_0x02dd:
            java.lang.Object r1 = r10.A01
            X.4aG r1 = (X.C88634aG) r1
            r0 = 1
            goto L_0x02f7
        L_0x02e3:
            java.lang.Object r1 = r10.A01
            X.4aG r1 = (X.C88634aG) r1
            r0 = 1
            X.C88634aG.A02(r1, r0)
            r0 = 0
            r1.A01 = r0
            X.C88634aG.A01(r1)
            return
        L_0x02f2:
            java.lang.Object r1 = r10.A01
            X.4aG r1 = (X.C88634aG) r1
            r0 = 0
        L_0x02f7:
            X.C88634aG.A03(r1, r0)
            return
        L_0x02fb:
            java.lang.Object r1 = r10.A01
            com.whatsapp.newsletter.insights.fragment.NewsletterInsightsInfoSheet r1 = (com.whatsapp.newsletter.insights.fragment.NewsletterInsightsInfoSheet) r1
            X.74D r2 = r1.A04
            if (r2 == 0) goto L_0x0331
            X.0vl r0 = r1.A08
            java.lang.Object r3 = r0.getValue()
            X.1ch r3 = (X.C29681ch) r3
            X.0vl r0 = r1.A09
            long r8 = X.C72453Mb.A0K(r0)
            X.0vl r0 = r1.A0A
            int r6 = X.C72453Mb.A0I(r0)
            java.lang.Integer r4 = X.AnonymousClass3MY.A0g()
            r5 = 0
            r7 = 5
            r2.A0E(r3, r4, r5, r6, r7, r8)
            X.1o3 r2 = r1.A01
            if (r2 == 0) goto L_0x032b
            X.1FL r1 = r1.A1D()
            java.lang.String r0 = "newsletter-insights-metrics-in-development"
            goto L_0x0350
        L_0x032b:
            java.lang.String r0 = "contextualHelpHandler"
            X.C18070vi.A11(r0)
            throw r5
        L_0x0331:
            java.lang.String r0 = "newsletterLogging"
            goto L_0x041c
        L_0x0335:
            java.lang.Object r1 = r10.A01
            X.AW1 r1 = (X.AW1) r1
            r0 = 0
            X.AW1.A00(r0, r1)
            return
        L_0x033e:
            java.lang.Object r1 = r10.A01
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminMessageFragment r1 = (com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminMessageFragment) r1
            X.00H r0 = r1.A0B
            if (r0 == 0) goto L_0x0366
            X.1o3 r2 = X.AnonymousClass3MW.A0a(r0)
            X.1FL r1 = r1.A1D()
            java.lang.String r0 = "newsletter-about-channel-admin-controls"
        L_0x0350:
            r2.A01(r1, r0)
            return
        L_0x0354:
            java.lang.Object r2 = r10.A01
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector r2 = (com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector) r2
            X.00H r0 = r2.A02
            if (r0 == 0) goto L_0x0366
            X.1o3 r1 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r0 = "newsletter-about-channel-admin-controls"
            r1.A01(r2, r0)
            return
        L_0x0366:
            java.lang.String r0 = "contextualHelpHandler"
            goto L_0x041c
        L_0x036a:
            java.lang.Object r1 = r10.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r1.CEx()
            r0 = 2131892550(0x7f121946, float:1.9419851E38)
            goto L_0x039a
        L_0x0375:
            java.lang.Object r1 = r10.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r1.CEx()
        L_0x037c:
            r0 = 2131896261(0x7f1227c5, float:1.9427378E38)
            goto L_0x039a
        L_0x0380:
            java.lang.Object r0 = r10.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            r0.CEx()
            X.C72453Mb.A14(r0)
            return
        L_0x038b:
            java.lang.Object r1 = r10.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            goto L_0x0397
        L_0x0390:
            java.lang.Object r1 = r10.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r1.CEx()
        L_0x0397:
            r0 = 2131889065(0x7f120ba9, float:1.9412783E38)
        L_0x039a:
            r1.BhQ(r0)
            return
        L_0x039e:
            java.lang.Object r2 = r10.A01
            X.6BJ r2 = (X.AnonymousClass6BJ) r2
            r1 = 0
            r0 = 0
            r2.A4m(r1, r0)
            return
        L_0x03a8:
            java.lang.Object r3 = r10.A01
            X.8yK r3 = (X.C175208yK) r3
            X.1PM r1 = r3.A01
            if (r1 == 0) goto L_0x041a
            X.11S r0 = r3.A02
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
            X.1yf r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x03dd
            java.lang.String r0 = r0.A08
            if (r0 == 0) goto L_0x03dd
            r3.A05 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            r0 = 32
            java.lang.String r0 = X.C17890vO.A0c(r1, r0)
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            r3.A04 = r0
            X.1KB r1 = r3.A05
            X.Ajs r0 = new X.Ajs
            r0.<init>((java.lang.Object) r3, (int) r2)
            r1.A0J(r0)
            return
        L_0x03dd:
            java.lang.String r0 = "NewsletterBaseCreateEditMVActivity - failed to load verifiedName"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3.finish()
            return
        L_0x03e6:
            X.9uZ r1 = r2.A0A     // Catch:{ IOException -> 0x03f9 }
            android.os.CancellationSignal r0 = new android.os.CancellationSignal     // Catch:{ IOException -> 0x03f9 }
            r0.<init>()     // Catch:{ IOException -> 0x03f9 }
            r1.A02(r0)     // Catch:{ IOException -> 0x03f9 }
            r1.A00()     // Catch:{ IOException -> 0x03f9 }
            java.lang.String r0 = "p2p/fpm/ExportHelper/copyKey()/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x03f9 }
            return
        L_0x03f9:
            r3 = move-exception
            X.00H r0 = r2.A0H
            java.lang.Object r2 = r0.get()
            X.8yO r2 = (X.C175248yO) r2
            r1 = 1
            r0 = 0
            r2.A00(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "p2p/fpm/ExportHelper/copyKey()/failure: "
            X.C17900vP.A0X(r3, r0, r1)
            return
        L_0x0411:
            java.lang.String r0 = "globalUI"
            goto L_0x041c
        L_0x0414:
            java.lang.String r0 = "newsletterFollowersManager"
            goto L_0x041c
        L_0x0417:
            java.lang.String r0 = "meManager"
            goto L_0x041c
        L_0x041a:
            java.lang.String r0 = "verifiedNameManager"
        L_0x041c:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0421:
            java.lang.Object r0 = r10.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            r2 = 0
            r0.CEx()
            X.1KB r1 = r0.A05
            r0 = 2131892554(0x7f12194a, float:1.941986E38)
        L_0x042e:
            r1.A08(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21356Ail.run():void");
    }
}
