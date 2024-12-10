package X;

public class AWF implements B8L {
    public final int A00;
    public final Object A01;

    public AWF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0073, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        X.AnonymousClass3MX.A1K(r0.A07, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CPr() {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0069;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0010;
                case 4: goto L_0x0031;
                case 5: goto L_0x0019;
                case 6: goto L_0x0043;
                case 7: goto L_0x0088;
                case 8: goto L_0x009c;
                case 9: goto L_0x00a8;
                case 10: goto L_0x00b0;
                case 11: goto L_0x0005;
                case 12: goto L_0x009c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r4.A01
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r0 = (com.whatsapp.migration.transfer.ui.P2pTransferViewModel) r0
            r1 = 0
        L_0x000a:
            X.1DT r0 = r0.A07
            X.AnonymousClass3MX.A1K(r0, r1)
        L_0x000f:
            return
        L_0x0010:
            java.lang.Object r0 = r4.A01
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = (com.whatsapp.migration.transfer.ui.ChatTransferViewModel) r0
            r1 = 0
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel.A07(r0)
            goto L_0x000a
        L_0x0019:
            java.lang.Object r2 = r4.A01
            X.8vP r2 = (X.C173628vP) r2
            boolean r0 = X.AnonymousClass112.A06()
            java.lang.String r1 = "android.settings.WIFI_SETTINGS"
            if (r0 == 0) goto L_0x002d
            com.whatsapp.migration.transfer.ui.P2pTransferActivity$Api29Utils r0 = com.whatsapp.migration.transfer.ui.P2pTransferActivity$Api29Utils.INSTANCE
            boolean r0 = r0.openWifiSettings(r2)
            if (r0 != 0) goto L_0x000f
        L_0x002d:
            X.C173628vP.A0d(r2, r1)
            return
        L_0x0031:
            java.lang.Object r1 = r4.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r0 = X.C108945cZ.A0G(r0)     // Catch:{ ActivityNotFoundException -> 0x003f }
            r1.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x003f }
            return
        L_0x003f:
            r1 = move-exception
            java.lang.String r0 = "p2p/P2pTransferActivity/No location settings"
            goto L_0x0062
        L_0x0043:
            java.lang.Object r3 = r4.A01
            X.8vP r3 = (X.C173628vP) r3
            X.00H r0 = r3.A07
            if (r0 == 0) goto L_0x0066
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r0 = "android.intent.action.MAIN"
            r2.setAction(r0)
            java.lang.String r1 = "com.android.settings"
            java.lang.String r0 = "com.android.settings.TetherSettings"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x005f }
            return
        L_0x005f:
            r1 = move-exception
            java.lang.String r0 = "p2p/P2pTransferActivity/No hotspot settings"
        L_0x0062:
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x0066:
            java.lang.String r0 = "waIntents"
            goto L_0x0073
        L_0x0069:
            java.lang.Object r3 = r4.A01
            com.whatsapp.migration.transfer.ui.ChatTransferActivity r3 = (com.whatsapp.migration.transfer.ui.ChatTransferActivity) r3
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r2 = r3.A06
            if (r2 != 0) goto L_0x0078
            java.lang.String r0 = "chatTransferViewModel"
        L_0x0073:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0078:
            X.1DT r1 = r2.A0D
            r0 = 0
            X.AnonymousClass3MX.A1J(r1, r0)
            r0 = 1
            r2.A0d(r0)
            com.whatsapp.migration.transfer.ui.P2pTransferActivity$Api29Utils r0 = com.whatsapp.migration.transfer.ui.P2pTransferActivity$Api29Utils.INSTANCE
            r0.openNetworkSettings(r3)
            return
        L_0x0088:
            java.lang.Object r3 = r4.A01
            X.8vP r3 = (X.C173628vP) r3
            r2 = 0
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r1 = r3.A4b()
            r0 = 1
            r1.A0k(r0)
            r3.setResult(r2)
            r3.finish()
            return
        L_0x009c:
            java.lang.Object r1 = r4.A01
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r1 = (com.whatsapp.migration.transfer.ui.P2pTransferViewModel) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.A0c()
            return
        L_0x00a8:
            java.lang.Object r0 = r4.A01
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r0 = (com.whatsapp.migration.transfer.ui.P2pTransferViewModel) r0
            r0.A0X()
            return
        L_0x00b0:
            java.lang.Object r0 = r4.A01
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r0 = (com.whatsapp.migration.transfer.ui.P2pTransferViewModel) r0
            r0.A0c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AWF.CPr():void");
    }
}
