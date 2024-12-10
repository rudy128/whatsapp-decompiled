package X;

/* renamed from: X.8vR  reason: invalid class name and case insensitive filesystem */
public final class C173638vR extends C178039Bo {
    public final C183229Xl A00;

    public C173638vR(B8J b8j, C183229Xl r2, C18600wl r3, AnonymousClass1OX r4) {
        super(b8j, r3, r4);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            super.run()
            X.9Xl r0 = r5.A00     // Catch:{ IOException -> 0x0054 }
            int r0 = r0.A00     // Catch:{ IOException -> 0x0054 }
            java.net.ServerSocket r1 = new java.net.ServerSocket     // Catch:{ IOException -> 0x0054 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0054 }
            r5.A00 = r1     // Catch:{ IOException -> 0x0054 }
            java.lang.String r0 = "p2p/GetIpThread/Waiting for client socket accept..."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0054 }
            java.net.Socket r4 = r1.accept()     // Catch:{ IOException -> 0x0054 }
            java.lang.String r0 = "p2p/GetIpThread/Client connected, obtaining IP address"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x004d }
            java.net.InetAddress r0 = r4.getInetAddress()     // Catch:{ all -> 0x004d }
            java.lang.String r3 = r0.getHostAddress()     // Catch:{ all -> 0x004d }
            if (r3 == 0) goto L_0x003f
            X.B8J r2 = r5.A01     // Catch:{ all -> 0x004d }
            X.AWC r2 = (X.AWC) r2     // Catch:{ all -> 0x004d }
            int r0 = r2.A00     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0039
            r1 = 0
            java.lang.Object r0 = r2.A01     // Catch:{ all -> 0x004d }
            com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler r0 = (com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler) r0     // Catch:{ all -> 0x004d }
            X.9kP r0 = r0.A08     // Catch:{ all -> 0x004d }
            r0.A00(r3, r1)     // Catch:{ all -> 0x004d }
            goto L_0x0049
        L_0x0039:
            java.lang.String r0 = "p2p/WifiDirectCreatorConnectionHandler/ Successfully sent IP address"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x004d }
            goto L_0x0049
        L_0x003f:
            java.lang.String r0 = "p2p/GetIpThread/Unable to get host address"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x004d }
            X.B8J r0 = r5.A01     // Catch:{ all -> 0x004d }
            r0.Bsl()     // Catch:{ all -> 0x004d }
        L_0x0049:
            r4.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x005f
        L_0x004d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ IOException -> 0x0054 }
            throw r0     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            java.lang.String r0 = "p2p/GetIpThread/Error connecting with client or server socket closed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0063 }
            X.B8J r0 = r5.A01     // Catch:{ all -> 0x0063 }
            r0.Bsl()     // Catch:{ all -> 0x0063 }
        L_0x005f:
            r5.A00()
            return
        L_0x0063:
            r0 = move-exception
            r5.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173638vR.run():void");
    }
}
