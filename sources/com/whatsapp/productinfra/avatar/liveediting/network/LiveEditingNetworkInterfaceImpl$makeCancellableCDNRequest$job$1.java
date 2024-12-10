package com.whatsapp.productinfra.avatar.liveediting.network;

import X.AnonymousClass1OS;
import X.C22821Di;
import X.C26652D8b;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.network.LiveEditingNetworkInterfaceImpl$makeCancellableCDNRequest$job$1", f = "LiveEditingNetworkInterfaceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LiveEditingNetworkInterfaceImpl$makeCancellableCDNRequest$job$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $onFailure;
    public final /* synthetic */ C22821Di $onSuccess;
    public final /* synthetic */ String $url;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C26652D8b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveEditingNetworkInterfaceImpl$makeCancellableCDNRequest$job$1(C26652D8b d8b, String str, C30391dr r4, C22821Di r5, C22821Di r6) {
        super(2, r4);
        this.this$0 = d8b;
        this.$url = str;
        this.$onSuccess = r5;
        this.$onFailure = r6;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        LiveEditingNetworkInterfaceImpl$makeCancellableCDNRequest$job$1 liveEditingNetworkInterfaceImpl$makeCancellableCDNRequest$job$1 = new LiveEditingNetworkInterfaceImpl$makeCancellableCDNRequest$job$1(this.this$0, this.$url, r8, this.$onSuccess, this.$onFailure);
        liveEditingNetworkInterfaceImpl$makeCancellableCDNRequest$job$1.L$0 = obj;
        return liveEditingNetworkInterfaceImpl$makeCancellableCDNRequest$job$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064 A[Catch:{ all -> 0x0079 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.label
            if (r0 != 0) goto L_0x0080
            X.C30691eM.A01(r10)
            java.lang.Object r6 = r9.L$0
            X.1OX r6 = (X.AnonymousClass1OX) r6
            X.D8b r0 = r9.this$0
            X.6eg r2 = r0.A01
            java.lang.String r1 = r9.$url
            X.1Di r8 = r9.$onSuccess
            X.1Di r4 = r9.$onFailure
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.String r0 = "Starting request"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = 0
            X.1D9 r0 = r2.A01     // Catch:{ all -> 0x0057 }
            X.AUZ r3 = r0.A07(r7, r1, r7)     // Catch:{ all -> 0x0057 }
            java.net.HttpURLConnection r0 = r3.A01     // Catch:{ all -> 0x0055 }
            int r5 = r0.getResponseCode()     // Catch:{ all -> 0x0055 }
            X.181 r1 = r2.A00     // Catch:{ all -> 0x0055 }
            r0 = 35
            X.9Hb r0 = X.C108955ca.A0N(r1, r3, r7, r0)     // Catch:{ all -> 0x0055 }
            byte[] r2 = X.AnonymousClass1EY.A04(r0)     // Catch:{ all -> 0x0055 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x0055 }
            int r0 = r2.length     // Catch:{ all -> 0x0055 }
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ all -> 0x0055 }
            r1.put(r2)     // Catch:{ all -> 0x0055 }
            boolean r0 = X.AnonymousClass1OW.A05(r6)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x004b
            r8.invoke(r1)     // Catch:{ all -> 0x0055 }
        L_0x004b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "Success with code: "
            X.C17900vP.A0j(r0, r1, r5)     // Catch:{ all -> 0x0055 }
            goto L_0x0073
        L_0x0055:
            r2 = move-exception
            goto L_0x0059
        L_0x0057:
            r2 = move-exception
            r3 = r7
        L_0x0059:
            java.lang.String r0 = "Error occurred"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0079 }
            boolean r0 = X.AnonymousClass1OW.A05(r6)     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0071
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = "download failed: "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)     // Catch:{ all -> 0x0079 }
            r4.invoke(r0)     // Catch:{ all -> 0x0079 }
        L_0x0071:
            if (r3 == 0) goto L_0x0076
        L_0x0073:
            r3.close()
        L_0x0076:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0079:
            r0 = move-exception
            if (r3 == 0) goto L_0x007f
            r3.close()
        L_0x007f:
            throw r0
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.liveediting.network.LiveEditingNetworkInterfaceImpl$makeCancellableCDNRequest$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LiveEditingNetworkInterfaceImpl$makeCancellableCDNRequest$job$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
