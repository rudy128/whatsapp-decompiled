package com.whatsapp.camera.litecamera;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.camera.litecamera.LiteCameraGarbageCollector$startGarbageCollectorProcess$1", f = "LiteCameraGarbageCollector.kt", i = {0}, l = {44}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class LiteCameraGarbageCollector$startGarbageCollectorProcess$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;

    public LiteCameraGarbageCollector$startGarbageCollectorProcess$1(C30391dr r2) {
        super(2, r2);
    }

    public final C30391dr create(Object obj, C30391dr r3) {
        LiteCameraGarbageCollector$startGarbageCollectorProcess$1 liteCameraGarbageCollector$startGarbageCollectorProcess$1 = new LiteCameraGarbageCollector$startGarbageCollectorProcess$1(r3);
        liteCameraGarbageCollector$startGarbageCollectorProcess$1.L$0 = obj;
        return liteCameraGarbageCollector$startGarbageCollectorProcess$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        LiteCameraGarbageCollector$startGarbageCollectorProcess$1 liteCameraGarbageCollector$startGarbageCollectorProcess$1 = new LiteCameraGarbageCollector$startGarbageCollectorProcess$1((C30391dr) obj2);
        liteCameraGarbageCollector$startGarbageCollectorProcess$1.L$0 = obj;
        return liteCameraGarbageCollector$startGarbageCollectorProcess$1.invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b A[Catch:{ CancellationException -> 0x0038 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0013
            if (r0 != r3) goto L_0x000e
            java.lang.Object r2 = r5.L$0
            X.1OX r2 = (X.AnonymousClass1OX) r2
            goto L_0x001b
        L_0x000e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0013:
            X.C30691eM.A01(r6)
            java.lang.Object r2 = r5.L$0
            X.1OX r2 = (X.AnonymousClass1OX) r2
            goto L_0x0025
        L_0x001b:
            X.C30691eM.A01(r6)     // Catch:{ CancellationException -> 0x0038 }
        L_0x001e:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ CancellationException -> 0x0038 }
            r0.gc()     // Catch:{ CancellationException -> 0x0038 }
        L_0x0025:
            boolean r0 = X.AnonymousClass1OW.A05(r2)     // Catch:{ CancellationException -> 0x0038 }
            if (r0 == 0) goto L_0x0038
            r5.L$0 = r2     // Catch:{ CancellationException -> 0x0038 }
            r5.label = r3     // Catch:{ CancellationException -> 0x0038 }
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r0 = X.C62882s9.A00(r5, r0)     // Catch:{ CancellationException -> 0x0038 }
            if (r0 != r4) goto L_0x001e
            return r4
        L_0x0038:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.litecamera.LiteCameraGarbageCollector$startGarbageCollectorProcess$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
