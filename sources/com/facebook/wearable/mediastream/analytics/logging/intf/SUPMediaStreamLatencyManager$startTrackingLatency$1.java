package com.facebook.wearable.mediastream.analytics.logging.intf;

import X.AnonymousClass1OS;
import X.C18090vk;
import X.C24865CNj;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.wearable.mediastream.analytics.logging.intf.SUPMediaStreamLatencyManager$startTrackingLatency$1", f = "SUPMediaStreamLatencyManager.kt", i = {0}, l = {38}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class SUPMediaStreamLatencyManager$startTrackingLatency$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C18090vk $getLatencyCallback;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C24865CNj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SUPMediaStreamLatencyManager$startTrackingLatency$1(C24865CNj cNj, C30391dr r3, C18090vk r4) {
        super(2, r3);
        this.this$0 = cNj;
        this.$getLatencyCallback = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        SUPMediaStreamLatencyManager$startTrackingLatency$1 sUPMediaStreamLatencyManager$startTrackingLatency$1 = new SUPMediaStreamLatencyManager$startTrackingLatency$1(this.this$0, r5, this.$getLatencyCallback);
        sUPMediaStreamLatencyManager$startTrackingLatency$1.L$0 = obj;
        return sUPMediaStreamLatencyManager$startTrackingLatency$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r8 = 1
            if (r0 == 0) goto L_0x0089
            if (r0 != r8) goto L_0x0094
            java.lang.Object r7 = r12.L$0
            X.1OX r7 = (X.AnonymousClass1OX) r7
            X.C30691eM.A01(r13)
        L_0x0010:
            X.0vk r0 = r12.$getLatencyCallback
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x007f
            X.CNj r10 = r12.this$0
            long r5 = r0.longValue()
            long r3 = java.lang.System.currentTimeMillis()
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004e
            X.Cn1 r3 = X.C24712CGy.A01
            java.lang.String r2 = "sup:SUPMediaStreamLatencyManager"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid latency value "
            java.lang.String r0 = X.C17890vO.A0a(r0, r1, r5)
            r3.A01(r2, r0)
        L_0x003b:
            boolean r0 = X.AnonymousClass1OW.A05(r7)
            if (r0 == 0) goto L_0x0091
            r0 = 1000(0x3e8, double:4.94E-321)
            r12.L$0 = r7
            r12.label = r8
            java.lang.Object r0 = X.C62882s9.A00(r12, r0)
            if (r0 != r9) goto L_0x0010
            return r9
        L_0x004e:
            r11 = r10
            X.BWQ r11 = (X.BWQ) r11
            org.json.JSONArray r0 = r11.A00
            if (r0 != 0) goto L_0x005b
            org.json.JSONArray r0 = X.AnonymousClass8BR.A1A()
            r11.A00 = r0
        L_0x005b:
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0067
            long r1 = r10.A00
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x003b
        L_0x0067:
            org.json.JSONArray r2 = r11.A00
            if (r2 == 0) goto L_0x007c
            org.json.JSONObject r1 = X.C17880vN.A15()
            java.lang.String r0 = "latency_ms"
            r1.put(r0, r5)
            java.lang.String r0 = "start_time_ms"
            r1.put(r0, r3)
            r2.put(r1)
        L_0x007c:
            r10.A00 = r5
            goto L_0x003b
        L_0x007f:
            X.Cn1 r2 = X.C24712CGy.A01
            java.lang.String r1 = "sup:SUPMediaStreamLatencyManager"
            java.lang.String r0 = "Could not obtain latency info, callback invocation null"
            r2.A01(r1, r0)
            goto L_0x003b
        L_0x0089:
            X.C30691eM.A01(r13)
            java.lang.Object r7 = r12.L$0
            X.1OX r7 = (X.AnonymousClass1OX) r7
            goto L_0x003b
        L_0x0091:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0094:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.mediastream.analytics.logging.intf.SUPMediaStreamLatencyManager$startTrackingLatency$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SUPMediaStreamLatencyManager$startTrackingLatency$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
