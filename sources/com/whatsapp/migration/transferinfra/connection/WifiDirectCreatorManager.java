package com.whatsapp.migration.transferinfra.connection;

import X.A2G;

public final class WifiDirectCreatorManager extends A2G {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00df A[Catch:{ SecurityException -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0137 A[Catch:{ SecurityException -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015b A[Catch:{ SecurityException -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C175248yO r14, com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorManager r15, java.lang.String r16, X.C30391dr r17, int r18) {
        /*
            r3 = r17
            r6 = r18
            boolean r0 = r3 instanceof X.C21716Aoj
            if (r0 == 0) goto L_0x0045
            r12 = r3
            X.Aoj r12 = (X.C21716Aoj) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0045
            int r2 = r2 - r1
            r12.label = r2
        L_0x0016:
            java.lang.Object r1 = r12.result
            X.1g4 r11 = X.C31751g4.COROUTINE_SUSPENDED
            int r2 = r12.label
            r0 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 != r0) goto L_0x004b
            int r10 = r12.I$3
            int r9 = r12.I$2
            int r8 = r12.I$1
            int r6 = r12.I$0
            java.lang.Object r7 = r12.L$6
            android.net.wifi.p2p.WifiP2pManager$Channel r7 = (android.net.wifi.p2p.WifiP2pManager.Channel) r7
            java.lang.Object r5 = r12.L$5
            android.net.wifi.p2p.WifiP2pManager r5 = (android.net.wifi.p2p.WifiP2pManager) r5
            java.lang.Object r4 = r12.L$4
            X.5cY r4 = (X.C108935cY) r4
            java.lang.Object r3 = r12.L$3
            X.5cY r3 = (X.C108935cY) r3
            java.lang.Object r2 = r12.L$2
            X.5cY r2 = (X.C108935cY) r2
            java.lang.Object r14 = r12.L$1
            X.10T r14 = (X.AnonymousClass10T) r14
            java.lang.Object r15 = r12.L$0
            goto L_0x012a
        L_0x0045:
            X.Aoj r12 = new X.Aoj
            r12.<init>(r15, r3)
            goto L_0x0016
        L_0x004b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0050:
            X.C30691eM.A01(r1)
            X.5WJ r2 = new X.5WJ
            r2.<init>()
            X.5WJ r3 = new X.5WJ
            r3.<init>()
            X.5WJ r4 = new X.5WJ
            r4.<init>()
            android.net.wifi.p2p.WifiP2pManager r5 = r15.A01
            if (r5 != 0) goto L_0x0070
            java.lang.String r0 = "p2p/WifiDirectCreatorManager/createGroup/Trying to start service without manager"
        L_0x0068:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x006b:
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            return r0
        L_0x0070:
            android.net.wifi.p2p.WifiP2pManager$Channel r7 = r15.A00
            if (r7 != 0) goto L_0x0077
            java.lang.String r0 = "p2p/WifiDirectCreatorManager/createGroup/Trying to start service with channel uninitialized"
            goto L_0x0068
        L_0x0077:
            java.lang.String r0 = "p2p/WifiDirectCreatorManager/createGroup/Starting createGroup API"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SecurityException -> 0x015e }
            java.lang.String r0 = "create group"
            X.AAD r9 = new X.AAD     // Catch:{ SecurityException -> 0x015e }
            r9.<init>(r0)     // Catch:{ SecurityException -> 0x015e }
            boolean r0 = X.AnonymousClass112.A06()     // Catch:{ SecurityException -> 0x015e }
            if (r0 == 0) goto L_0x00d5
            android.net.wifi.p2p.WifiP2pConfig$Builder r8 = new android.net.wifi.p2p.WifiP2pConfig$Builder     // Catch:{ SecurityException -> 0x015e }
            r8.<init>()     // Catch:{ SecurityException -> 0x015e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ SecurityException -> 0x015e }
            java.lang.String r0 = "DIRECT-"
            r10 = r16
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r10, r1)     // Catch:{ SecurityException -> 0x015e }
            android.net.wifi.p2p.WifiP2pConfig$Builder r1 = r8.setNetworkName(r0)     // Catch:{ SecurityException -> 0x015e }
            r0 = 16
            java.lang.String r0 = X.C181799Rw.A00(r0)     // Catch:{ SecurityException -> 0x015e }
            android.net.wifi.p2p.WifiP2pConfig$Builder r0 = r1.setPassphrase(r0)     // Catch:{ SecurityException -> 0x015e }
            android.net.wifi.p2p.WifiP2pConfig r0 = r0.build()     // Catch:{ SecurityException -> 0x015e }
            X.C18070vi.A0X(r0)     // Catch:{ SecurityException -> 0x015e }
            r5.createGroup(r7, r0, r9)     // Catch:{ SecurityException -> 0x015e }
        L_0x00b2:
            java.lang.String r8 = r15.A04     // Catch:{ SecurityException -> 0x015e }
            java.lang.String r1 = "_presence._tcp"
            X.1CQ r0 = X.AnonymousClass1D7.A0I()     // Catch:{ SecurityException -> 0x015e }
            android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo r8 = android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo.newInstance(r8, r1, r0)     // Catch:{ SecurityException -> 0x015e }
            java.lang.String r0 = "add local service"
            X.AAD r1 = new X.AAD     // Catch:{ SecurityException -> 0x015e }
            r1.<init>(r0)     // Catch:{ SecurityException -> 0x015e }
            r5.addLocalService(r7, r8, r1)     // Catch:{ SecurityException -> 0x015e }
            boolean r0 = r9.A00()     // Catch:{ SecurityException -> 0x015e }
            if (r0 == 0) goto L_0x006b
            boolean r0 = r1.A00()     // Catch:{ SecurityException -> 0x015e }
            if (r0 == 0) goto L_0x006b
            goto L_0x00d9
        L_0x00d5:
            r5.createGroup(r7, r9)     // Catch:{ SecurityException -> 0x015e }
            goto L_0x00b2
        L_0x00d9:
            r10 = 0
            r9 = 10
            r8 = 3
        L_0x00dd:
            if (r10 >= r9) goto L_0x006b
            boolean r0 = r2.Be2()     // Catch:{ SecurityException -> 0x015e }
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r3.Be2()     // Catch:{ SecurityException -> 0x015e }
            if (r0 == 0) goto L_0x00f3
            X.AAI r0 = new X.AAI     // Catch:{ SecurityException -> 0x015e }
            r0.<init>(r2, r3)     // Catch:{ SecurityException -> 0x015e }
            r5.requestGroupInfo(r7, r0)     // Catch:{ SecurityException -> 0x015e }
        L_0x00f3:
            boolean r0 = r4.Be2()     // Catch:{ SecurityException -> 0x015e }
            if (r0 == 0) goto L_0x0102
            r1 = 0
            X.AAF r0 = new X.AAF     // Catch:{ SecurityException -> 0x015e }
            r0.<init>(r4, r1)     // Catch:{ SecurityException -> 0x015e }
            r5.requestConnectionInfo(r7, r0)     // Catch:{ SecurityException -> 0x015e }
        L_0x0102:
            r0 = 0
            com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorManager$createGroup$2$result$1 r13 = new com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorManager$createGroup$2$result$1     // Catch:{ SecurityException -> 0x015e }
            r13.<init>(r0, r2, r3, r4)     // Catch:{ SecurityException -> 0x015e }
            r12.L$0 = r15     // Catch:{ SecurityException -> 0x015e }
            r12.L$1 = r14     // Catch:{ SecurityException -> 0x015e }
            r12.L$2 = r2     // Catch:{ SecurityException -> 0x015e }
            r12.L$3 = r3     // Catch:{ SecurityException -> 0x015e }
            r12.L$4 = r4     // Catch:{ SecurityException -> 0x015e }
            r12.L$5 = r5     // Catch:{ SecurityException -> 0x015e }
            r12.L$6 = r7     // Catch:{ SecurityException -> 0x015e }
            r12.I$0 = r6     // Catch:{ SecurityException -> 0x015e }
            r12.I$1 = r8     // Catch:{ SecurityException -> 0x015e }
            r12.I$2 = r9     // Catch:{ SecurityException -> 0x015e }
            r12.I$3 = r10     // Catch:{ SecurityException -> 0x015e }
            r0 = 1
            r12.label = r0     // Catch:{ SecurityException -> 0x015e }
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r1 = X.AnonymousClass4Z5.A01(r12, r13, r0)     // Catch:{ SecurityException -> 0x015e }
            if (r1 != r11) goto L_0x012d
            goto L_0x0166
        L_0x012a:
            X.C30691eM.A01(r1)     // Catch:{ SecurityException -> 0x015e }
        L_0x012d:
            java.util.List r1 = (java.util.List) r1     // Catch:{ SecurityException -> 0x015e }
            if (r1 == 0) goto L_0x015b
            int r0 = r1.size()     // Catch:{ SecurityException -> 0x015e }
            if (r0 != r8) goto L_0x015b
            java.lang.Object r4 = X.C108955ca.A0p(r1)     // Catch:{ SecurityException -> 0x015e }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ SecurityException -> 0x015e }
            r3 = 1
            java.lang.String r2 = X.C17880vN.A0w(r1, r3)     // Catch:{ SecurityException -> 0x015e }
            r0 = 2
            java.lang.String r1 = X.C17880vN.A0w(r1, r0)     // Catch:{ SecurityException -> 0x015e }
            r0 = 0
            X.C18070vi.A0d(r4, r0)     // Catch:{ SecurityException -> 0x015e }
            X.C18070vi.A0e(r2, r3, r1)     // Catch:{ SecurityException -> 0x015e }
            X.AWo r0 = new X.AWo     // Catch:{ SecurityException -> 0x015e }
            r0.<init>(r4, r2, r1, r6)     // Catch:{ SecurityException -> 0x015e }
            r14.notifyAllObservers(r0)     // Catch:{ SecurityException -> 0x015e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ SecurityException -> 0x015e }
            return r0
        L_0x015b:
            int r10 = r10 + 1
            goto L_0x00dd
        L_0x015e:
            r1 = move-exception
            java.lang.String r0 = "p2p/WifiDirectCreatorManager/createGroup/SecurityException encountered"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x006b
        L_0x0166:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorManager.A00(X.8yO, com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorManager, java.lang.String, X.1dr, int):java.lang.Object");
    }
}
