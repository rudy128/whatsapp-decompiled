package com.whatsapp.migration.transferinfra.connection;

import X.AnonymousClass1OS;
import X.C188019gk;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorConnectionHandler$startWifiDirect$1", f = "WifiDirectCreatorConnectionHandler.kt", i = {0, 0, 1}, l = {57, 67}, m = "invokeSuspend", n = {"manager", "i", "i"}, s = {"L$2", "I$0", "I$0"})
public final class WifiDirectCreatorConnectionHandler$startWifiDirect$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $networkNamePostfix;
    public final /* synthetic */ int $port;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ boolean $shouldCreateWifiDirectGroup;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ C188019gk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiDirectCreatorConnectionHandler$startWifiDirect$1(C188019gk r2, String str, String str2, C30391dr r5, int i, boolean z) {
        super(2, r5);
        this.this$0 = r2;
        this.$sessionId = str;
        this.$port = i;
        this.$shouldCreateWifiDirectGroup = z;
        this.$networkNamePostfix = str2;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new WifiDirectCreatorConnectionHandler$startWifiDirect$1(this.this$0, this.$sessionId, this.$networkNamePostfix, r9, this.$port, this.$shouldCreateWifiDirectGroup);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorManager} */
    /* JADX WARNING: type inference failed for: r0v22, types: [com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorManager, X.A2G] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        if (r3 != 0) goto L_0x0067;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036 A[Catch:{ InterruptedException -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00da A[Catch:{ InterruptedException -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r14.label
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 == r4) goto L_0x0018
            if (r0 != r5) goto L_0x0013
            int r3 = r14.I$0
            X.C30691eM.A01(r15)     // Catch:{ InterruptedException -> 0x0122 }
            goto L_0x0102
        L_0x0013:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0018:
            int r3 = r14.I$0
            java.lang.Object r8 = r14.L$2
            X.A2G r8 = (X.A2G) r8
            java.lang.Object r7 = r14.L$1
            X.9gk r7 = (X.C188019gk) r7
            java.lang.Object r9 = r14.L$0
            goto L_0x00c6
        L_0x0026:
            X.C30691eM.A01(r15)
            r3 = 0
        L_0x002a:
            X.9gk r7 = r14.this$0     // Catch:{ InterruptedException -> 0x0122 }
            X.9Xm r1 = r7.A03     // Catch:{ InterruptedException -> 0x0122 }
            android.content.IntentFilter r0 = X.A2G.A08     // Catch:{ InterruptedException -> 0x0122 }
            com.whatsapp.migration.transferinfra.service.WifiGroupCreatorP2pTransferService r0 = r1.A00     // Catch:{ InterruptedException -> 0x0122 }
            X.118 r2 = r0.A01     // Catch:{ InterruptedException -> 0x0122 }
            if (r2 == 0) goto L_0x0118
            X.00H r0 = r0.A05     // Catch:{ InterruptedException -> 0x0122 }
            if (r0 == 0) goto L_0x011b
            java.lang.Object r1 = X.C18070vi.A0E(r0)     // Catch:{ InterruptedException -> 0x0122 }
            X.1cw r1 = (X.C29831cw) r1     // Catch:{ InterruptedException -> 0x0122 }
            X.C18070vi.A0d(r1, r5)     // Catch:{ InterruptedException -> 0x0122 }
            com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorManager r0 = new com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorManager     // Catch:{ InterruptedException -> 0x0122 }
            r0.<init>(r1, r2)     // Catch:{ InterruptedException -> 0x0122 }
            r7.A01 = r0     // Catch:{ InterruptedException -> 0x0122 }
            X.9gk r7 = r14.this$0     // Catch:{ InterruptedException -> 0x0122 }
            com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorManager r8 = r7.A01     // Catch:{ InterruptedException -> 0x0122 }
            if (r8 == 0) goto L_0x0102
            java.lang.String r9 = r14.$sessionId     // Catch:{ InterruptedException -> 0x0122 }
            int r10 = r14.$port     // Catch:{ InterruptedException -> 0x0122 }
            boolean r2 = r14.$shouldCreateWifiDirectGroup     // Catch:{ InterruptedException -> 0x0122 }
            java.lang.String r1 = r14.$networkNamePostfix     // Catch:{ InterruptedException -> 0x0122 }
            X.AWD r0 = new X.AWD     // Catch:{ InterruptedException -> 0x0122 }
            r0.<init>(r7, r10)     // Catch:{ InterruptedException -> 0x0122 }
            r8.A03(r0, r9)     // Catch:{ InterruptedException -> 0x0122 }
            X.8yO r9 = r7.A02     // Catch:{ InterruptedException -> 0x0122 }
            if (r2 == 0) goto L_0x0067
            r0 = 1
            if (r3 == 0) goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            r14.L$0 = r8     // Catch:{ InterruptedException -> 0x0122 }
            r14.L$1 = r7     // Catch:{ InterruptedException -> 0x0122 }
            r14.L$2 = r8     // Catch:{ InterruptedException -> 0x0122 }
            r14.I$0 = r3     // Catch:{ InterruptedException -> 0x0122 }
            r14.label = r4     // Catch:{ InterruptedException -> 0x0122 }
            if (r0 == 0) goto L_0x0079
            java.lang.Object r15 = com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorManager.A00(r9, r8, r1, r14, r10)     // Catch:{ InterruptedException -> 0x0122 }
            goto L_0x00c2
        L_0x0079:
            android.net.wifi.p2p.WifiP2pManager r12 = r8.A01     // Catch:{ InterruptedException -> 0x0122 }
            r13 = 0
            if (r12 != 0) goto L_0x0088
            java.lang.String r0 = "p2p/WifiDirectCreatorManager/createDiscoverableService/Trying to start service without manager"
        L_0x0080:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0122 }
        L_0x0083:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r13)     // Catch:{ InterruptedException -> 0x0122 }
            goto L_0x00c2
        L_0x0088:
            android.net.wifi.p2p.WifiP2pManager$Channel r11 = r8.A00     // Catch:{ InterruptedException -> 0x0122 }
            if (r11 != 0) goto L_0x008f
            java.lang.String r0 = "p2p/WifiDirectCreatorManager/createDiscoverableService/Trying to start service with channel uninitialized"
            goto L_0x0080
        L_0x008f:
            java.lang.String r2 = r8.A04     // Catch:{ InterruptedException -> 0x0122 }
            java.lang.String r1 = "_presence._tcp"
            X.1CQ r0 = X.AnonymousClass1D7.A0I()     // Catch:{ InterruptedException -> 0x0122 }
            android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo r1 = android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo.newInstance(r2, r1, r0)     // Catch:{ InterruptedException -> 0x0122 }
            java.lang.String r0 = "add local service"
            X.AAD r2 = new X.AAD     // Catch:{ InterruptedException -> 0x0122 }
            r2.<init>(r0)     // Catch:{ InterruptedException -> 0x0122 }
            r12.addLocalService(r11, r1, r2)     // Catch:{ InterruptedException -> 0x0122 }
            java.lang.String r0 = "discoverPeers"
            X.AAD r1 = new X.AAD     // Catch:{ InterruptedException -> 0x0122 }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x0122 }
            r12.discoverPeers(r11, r1)     // Catch:{ InterruptedException -> 0x0122 }
            boolean r0 = r2.A00()     // Catch:{ InterruptedException -> 0x0122 }
            if (r0 == 0) goto L_0x0083
            boolean r0 = r1.A00()     // Catch:{ InterruptedException -> 0x0122 }
            if (r0 == 0) goto L_0x0083
            r13 = 1
            r0 = 11
            X.C20736AWr.A00(r9, r10, r0)     // Catch:{ InterruptedException -> 0x0122 }
            goto L_0x0083
        L_0x00c2:
            if (r15 == r6) goto L_0x0117
            r9 = r8
            goto L_0x00c9
        L_0x00c6:
            X.C30691eM.A01(r15)     // Catch:{ InterruptedException -> 0x0122 }
        L_0x00c9:
            boolean r0 = X.AnonymousClass000.A1Y(r15)     // Catch:{ InterruptedException -> 0x0122 }
            r2 = 0
            if (r0 == 0) goto L_0x00da
            X.8yO r1 = r7.A02     // Catch:{ InterruptedException -> 0x0122 }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ InterruptedException -> 0x0122 }
            r1.A01(r0, r2)     // Catch:{ InterruptedException -> 0x0122 }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ InterruptedException -> 0x0122 }
            return r0
        L_0x00da:
            r8.A01()     // Catch:{ InterruptedException -> 0x0122 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ InterruptedException -> 0x0122 }
            java.lang.String r0 = "p2p/WifiDirectCreatorConnectionHandler/ Unable to start discoverable service, attempt #"
            r1.append(r0)     // Catch:{ InterruptedException -> 0x0122 }
            int r0 = r3 + 1
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)     // Catch:{ InterruptedException -> 0x0122 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0122 }
            r14.L$0 = r9     // Catch:{ InterruptedException -> 0x0122 }
            r14.L$1 = r2     // Catch:{ InterruptedException -> 0x0122 }
            r14.L$2 = r2     // Catch:{ InterruptedException -> 0x0122 }
            r14.I$0 = r3     // Catch:{ InterruptedException -> 0x0122 }
            r14.label = r5     // Catch:{ InterruptedException -> 0x0122 }
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.C62882s9.A00(r14, r0)     // Catch:{ InterruptedException -> 0x0122 }
            if (r0 != r6) goto L_0x0102
            goto L_0x0116
        L_0x0102:
            int r3 = r3 + 1
            r0 = 10
            if (r3 < r0) goto L_0x002a
            X.9gk r0 = r14.this$0
            X.8yO r2 = r0.A02
            r1 = 602(0x25a, float:8.44E-43)
            java.lang.String r0 = "failure to start discoverable service"
            r2.A00(r1, r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0116:
            return r6
        L_0x0117:
            return r6
        L_0x0118:
            java.lang.String r0 = "waContext"
            goto L_0x011d
        L_0x011b:
            java.lang.String r0 = "runtimeReceiverCompat"
        L_0x011d:
            X.C18070vi.A11(r0)     // Catch:{ InterruptedException -> 0x0122 }
            r0 = 0
            throw r0     // Catch:{ InterruptedException -> 0x0122 }
        L_0x0122:
            java.lang.String r0 = "p2p/WifiDirectCreatorConnectionHandler/ interrupted while starting discoverable service"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorConnectionHandler$startWifiDirect$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WifiDirectCreatorConnectionHandler$startWifiDirect$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
