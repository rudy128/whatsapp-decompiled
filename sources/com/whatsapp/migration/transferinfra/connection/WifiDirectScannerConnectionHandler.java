package com.whatsapp.migration.transferinfra.connection;

import X.A2G;
import X.AAD;
import X.AAG;
import X.AAH;
import X.AWE;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass112;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass1OX;
import X.AnonymousClass4Z5;
import X.AnonymousClass5WJ;
import X.AnonymousClass8BV;
import X.AnonymousClass8CP;
import X.C173638vR;
import X.C173658vT;
import X.C175248yO;
import X.C17880vN;
import X.C18070vi;
import X.C18090vk;
import X.C183259Xo;
import X.C18600wl;
import X.C190119kP;
import X.C20113A7w;
import X.C20276AEj;
import X.C21356Ail;
import X.C21528Alb;
import X.C29831cw;
import X.C30391dr;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;
import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceRequest;
import com.whatsapp.migration.transferinfra.service.WifiGroupScannerP2pTransferService;
import com.whatsapp.util.Log;

public final class WifiDirectScannerConnectionHandler {
    public int A00;
    public ConnectivityManager.NetworkCallback A01;
    public C173638vR A02;
    public C173658vT A03;
    public Runnable A04;
    public final AnonymousClass11C A05;
    public final C175248yO A06;
    public final C20276AEj A07;
    public final C190119kP A08;
    public final AnonymousClass10I A09;
    public final Object A0A = C17880vN.A0p();
    public final C18600wl A0B;
    public final AnonymousClass1OX A0C;
    public final C29831cw A0D;
    public final AnonymousClass118 A0E;
    public final C183259Xo A0F;

    public WifiDirectScannerConnectionHandler(C29831cw r2, AnonymousClass11C r3, AnonymousClass118 r4, C175248yO r5, C20276AEj aEj, C183259Xo r7, C190119kP r8, AnonymousClass10I r9, C18600wl r10, AnonymousClass1OX r11) {
        C18070vi.A0g(r4, 4, r9);
        C18070vi.A0x(r3, r5, r2, r10, r11);
        this.A07 = aEj;
        this.A0F = r7;
        this.A08 = r8;
        this.A0E = r4;
        this.A09 = r9;
        this.A05 = r3;
        this.A06 = r5;
        this.A0D = r2;
        this.A0B = r10;
        this.A0C = r11;
    }

    public final class Api29Utils {
        public static final Api29Utils INSTANCE = new Object();

        public final void connectUsingNetworkSpecifier(String str, String str2, ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
            boolean A16 = C18070vi.A16(str, str2);
            C18070vi.A0d(networkCallback, 3);
            WifiNetworkSpecifier build = new WifiNetworkSpecifier.Builder().setSsid(str).setWpa2Passphrase(str2).build();
            C18070vi.A0X(build);
            NetworkRequest build2 = new NetworkRequest.Builder().addTransportType(A16 ? 1 : 0).setNetworkSpecifier(build).build();
            if (connectivityManager != null) {
                connectivityManager.requestNetwork(build2, networkCallback);
            }
        }

        public final void disconnectUsingNetworkSpecifier(ConnectivityManager.NetworkCallback networkCallback, AnonymousClass11C r4) {
            C18070vi.A0h(networkCallback, r4);
            ConnectivityManager A0E = r4.A0E();
            if (A0E != null) {
                A0E.unregisterNetworkCallback(networkCallback);
                A0E.bindProcessToNetwork((Network) null);
                Log.i("p2p/WifiDirectScannerConnectionHandler/ disconnectFromHotspotApi29AndAbove/success");
            }
        }
    }

    public static final Object A00(WifiDirectScannerConnectionHandler wifiDirectScannerConnectionHandler, String str, String str2, C30391dr r9) {
        ConnectivityManager.NetworkCallback networkCallback;
        Log.i("p2p/WifiDirectScannerConnectionHandler/ connectUsingNetworkSpecifier");
        AnonymousClass5WJ r4 = new AnonymousClass5WJ();
        ConnectivityManager A0E2 = wifiDirectScannerConnectionHandler.A05.A0E();
        AnonymousClass8CP r0 = new AnonymousClass8CP(A0E2, r4);
        Object obj = wifiDirectScannerConnectionHandler.A0A;
        synchronized (obj) {
            wifiDirectScannerConnectionHandler.A01 = r0;
        }
        synchronized (obj) {
            networkCallback = wifiDirectScannerConnectionHandler.A01;
        }
        if (networkCallback != null) {
            Api29Utils.INSTANCE.connectUsingNetworkSpecifier(str, str2, A0E2, networkCallback);
        }
        return AnonymousClass4Z5.A01(r9, new WifiDirectScannerConnectionHandler$connectUsingNetworkSpecifier$4((C30391dr) null, r4), C20113A7w.A0L);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler r14, java.lang.String r15, java.lang.String r16, X.C30391dr r17) {
        /*
            r3 = r17
            boolean r0 = r3 instanceof X.C21685AoE
            if (r0 == 0) goto L_0x002a
            r4 = r3
            X.AoE r4 = (X.C21685AoE) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002a
            int r2 = r2 - r1
            r4.label = r2
        L_0x0014:
            java.lang.Object r1 = r4.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r13 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 != r5) goto L_0x0030
            java.lang.Object r9 = r4.L$1
            android.content.BroadcastReceiver r9 = (android.content.BroadcastReceiver) r9
            java.lang.Object r14 = r4.L$0
            com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler r14 = (com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler) r14
            goto L_0x00b9
        L_0x002a:
            X.AoE r4 = new X.AoE
            r4.<init>(r14, r3)
            goto L_0x0014
        L_0x0030:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0l()
            throw r1
        L_0x0035:
            X.C30691eM.A01(r1)
            java.lang.String r0 = "p2p/WifiDirectScannerConnectionHandler/ connectUsingWifiManager"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11C r0 = r14.A05
            android.net.wifi.WifiManager r6 = r0.A0F()
            android.net.wifi.WifiConfiguration r7 = new android.net.wifi.WifiConfiguration
            r7.<init>()
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            r1 = 34
            r0.append(r1)
            java.lang.String r0 = X.AnonymousClass8BW.A0l(r15, r0, r1)
            r7.SSID = r0
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            r0.append(r1)
            r2 = r16
            java.lang.String r0 = X.AnonymousClass8BW.A0l(r2, r0, r1)
            r7.preSharedKey = r0
            if (r6 == 0) goto L_0x0078
            int r2 = r6.addNetwork(r7)
            r0 = -1
            if (r2 != r0) goto L_0x007d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "p2p/WifiDirectScannerConnectionHandler/ Failed to add network configuration for "
            X.C17900vP.A0e(r0, r15, r1)
        L_0x0078:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            return r0
        L_0x007d:
            r12 = 0
            X.5WJ r1 = new X.5WJ
            r1.<init>()
            X.8Bx r9 = new X.8Bx
            r9.<init>(r7, r15, r1)
            X.1cw r7 = r14.A0D     // Catch:{ Exception -> 0x00bf }
            X.118 r0 = r14.A0E     // Catch:{ Exception -> 0x00bf }
            android.content.Context r8 = X.C108945cZ.A0E(r0)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r0 = "android.net.wifi.STATE_CHANGE"
            android.content.IntentFilter r10 = new android.content.IntentFilter     // Catch:{ Exception -> 0x00bf }
            r10.<init>(r0)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r11 = X.C19620yd.A0B     // Catch:{ Exception -> 0x00bf }
            r7.A00(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00bf }
            r6.disconnect()     // Catch:{ Exception -> 0x00bf }
            r6.enableNetwork(r2, r5)     // Catch:{ Exception -> 0x00bf }
            r6.reconnect()     // Catch:{ Exception -> 0x00bf }
            com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler$connectUsingWifiManager$2 r2 = new com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler$connectUsingWifiManager$2     // Catch:{ Exception -> 0x00bf }
            r2.<init>(r12, r1)     // Catch:{ Exception -> 0x00bf }
            r4.L$0 = r14     // Catch:{ Exception -> 0x00bf }
            r4.L$1 = r9     // Catch:{ Exception -> 0x00bf }
            r4.label = r5     // Catch:{ Exception -> 0x00bf }
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r1 = X.AnonymousClass4Z5.A01(r4, r2, r0)     // Catch:{ Exception -> 0x00bf }
            if (r1 != r3) goto L_0x00bc
            return r3
        L_0x00b9:
            X.C30691eM.A01(r1)     // Catch:{ Exception -> 0x00bf }
        L_0x00bc:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x00bf }
            goto L_0x00c9
        L_0x00bf:
            r1 = move-exception
            java.lang.String r0 = "p2p/WifiDirectScannerConnectionHandler/ Failed to manage WiFi connection"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00d1 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x00d1 }
        L_0x00c9:
            X.118 r0 = r14.A0E
            android.content.Context r0 = r0.A00
            r0.unregisterReceiver(r9)
            return r1
        L_0x00d1:
            r1 = move-exception
            X.118 r0 = r14.A0E
            android.content.Context r0 = r0.A00
            r0.unregisterReceiver(r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler.A01(com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler, java.lang.String, java.lang.String, X.1dr):java.lang.Object");
    }

    public static final void A03(WifiDirectScannerConnectionHandler wifiDirectScannerConnectionHandler) {
        WifiP2pManager.Channel channel;
        WifiP2pManager wifiP2pManager;
        C173658vT r0 = wifiDirectScannerConnectionHandler.A03;
        if (!(r0 == null || (channel = r0.A00) == null || (wifiP2pManager = r0.A01) == null)) {
            wifiP2pManager.clearServiceRequests(channel, new AAD("clearServiceRequests"));
        }
        Runnable runnable = wifiDirectScannerConnectionHandler.A04;
        if (runnable != null) {
            wifiDirectScannerConnectionHandler.A09.CEz(runnable);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.A2G, X.8vT] */
    public static final void A04(WifiDirectScannerConnectionHandler wifiDirectScannerConnectionHandler, C18090vk r6) {
        String str;
        String str2;
        C183259Xo r1 = wifiDirectScannerConnectionHandler.A0F;
        IntentFilter intentFilter = A2G.A08;
        WifiGroupScannerP2pTransferService wifiGroupScannerP2pTransferService = r1.A00;
        AnonymousClass118 r3 = wifiGroupScannerP2pTransferService.A01;
        if (r3 != null) {
            AnonymousClass00H r0 = wifiGroupScannerP2pTransferService.A05;
            if (r0 != null) {
                C29831cw r12 = (C29831cw) C18070vi.A0E(r0);
                C18070vi.A0d(r12, 2);
                ? a2g = new A2G(r12, r3);
                wifiDirectScannerConnectionHandler.A03 = a2g;
                a2g.A03(new AWE(wifiDirectScannerConnectionHandler), wifiDirectScannerConnectionHandler.A07.A09);
                C173658vT r4 = wifiDirectScannerConnectionHandler.A03;
                if (r4 != null) {
                    if (r4.A00 != null) {
                        Log.w("p2p/WifiDirectScannerManager/ Discover service already called and active.");
                    } else {
                        WifiP2pManager wifiP2pManager = r4.A01;
                        if (wifiP2pManager == null) {
                            str2 = "p2p/WifiDirectScannerManager/ Trying to start service discovery without manager";
                        } else {
                            WifiP2pManager.Channel channel = r4.A00;
                            if (channel == null) {
                                str2 = "p2p/WifiDirectScannerManager/ Trying to start service discovery with uninitialized channel";
                            } else {
                                wifiP2pManager.setDnsSdResponseListeners(channel, new AAG(r4), new AAH());
                                r4.A00 = WifiP2pDnsSdServiceRequest.newInstance();
                                AAD aad = new AAD("add service request");
                                WifiP2pManager wifiP2pManager2 = r4.A01;
                                if (wifiP2pManager2 != null) {
                                    wifiP2pManager2.addServiceRequest(r4.A00, r4.A00, aad);
                                }
                                AAD aad2 = new AAD("discover services");
                                WifiP2pManager wifiP2pManager3 = r4.A01;
                                if (wifiP2pManager3 != null) {
                                    wifiP2pManager3.discoverServices(r4.A00, aad2);
                                }
                                if (aad.A00() && aad2.A00()) {
                                    wifiDirectScannerConnectionHandler.A04 = wifiDirectScannerConnectionHandler.A09.CGv(new C21356Ail(r6, 4), 15000);
                                    Log.i("p2p/WifiDirectScannerConnectionHandler/ started service discovery and scheduled pending restart");
                                    wifiDirectScannerConnectionHandler.A06.A01(AnonymousClass00R.A01, (Integer) null);
                                    return;
                                }
                            }
                        }
                        Log.e(str2);
                    }
                }
                A03(wifiDirectScannerConnectionHandler);
                C173658vT r2 = wifiDirectScannerConnectionHandler.A03;
                if (r2 != null) {
                    Log.i("p2p/WifiDirectScannerConnectionHandler/ stopping WifiDirect");
                    r2.A01();
                    wifiDirectScannerConnectionHandler.A03 = null;
                }
                A02(wifiDirectScannerConnectionHandler);
                C173638vR r02 = wifiDirectScannerConnectionHandler.A02;
                if (r02 != null) {
                    r02.A00();
                }
                wifiDirectScannerConnectionHandler.A06.A00(602, "failure to start service discovery");
                return;
            }
            str = "runtimeReceiverCompat";
        } else {
            str = "waContext";
        }
        C18070vi.A11(str);
        throw null;
    }

    public final void A05() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i > 10) {
            Log.i("p2p/WifiDirectScannerConnectionHandler/ retryServiceDiscovery/maximum retries reached, reporting error");
            this.A06.A00(603, (String) null);
            return;
        }
        Log.i("p2p/WifiDirectScannerConnectionHandler/ retryServiceDiscovery/restarting WiFiDirect since peer has not been discovered");
        C173658vT r2 = this.A03;
        if (r2 != null) {
            Log.i("p2p/WifiDirectScannerConnectionHandler/ stopping WifiDirect");
            r2.A01();
            this.A03 = null;
        }
        A04(this, new C21528Alb(this, 32));
    }

    public static final void A02(WifiDirectScannerConnectionHandler wifiDirectScannerConnectionHandler) {
        String str;
        WifiInfo connectionInfo;
        String ssid;
        ConnectivityManager.NetworkCallback networkCallback;
        if (AnonymousClass112.A06()) {
            synchronized (wifiDirectScannerConnectionHandler.A0A) {
                networkCallback = wifiDirectScannerConnectionHandler.A01;
            }
            if (networkCallback != null) {
                Api29Utils.INSTANCE.disconnectUsingNetworkSpecifier(networkCallback, wifiDirectScannerConnectionHandler.A05);
                return;
            }
            return;
        }
        WifiManager A0F2 = wifiDirectScannerConnectionHandler.A05.A0F();
        if (A0F2 == null || (connectionInfo = A0F2.getConnectionInfo()) == null || (ssid = connectionInfo.getSSID()) == null) {
            str = null;
        } else {
            str = AnonymousClass8BV.A0s(ssid, "\"");
        }
        if (C18070vi.A18(str, wifiDirectScannerConnectionHandler.A07.A03) && A0F2 != null) {
            A0F2.disconnect();
            A0F2.removeNetwork(A0F2.getConnectionInfo().getNetworkId());
            A0F2.saveConfiguration();
            Log.i("p2p/WifiDirectScannerConnectionHandler/ disconnectUsingWifiManager/success");
        }
    }
}
