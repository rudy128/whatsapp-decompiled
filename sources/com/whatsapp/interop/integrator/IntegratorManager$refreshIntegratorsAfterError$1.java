package com.whatsapp.interop.integrator;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C34651kr;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interop.integrator.IntegratorManager$refreshIntegratorsAfterError$1", f = "IntegratorManager.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
public final class IntegratorManager$refreshIntegratorsAfterError$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C34651kr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntegratorManager$refreshIntegratorsAfterError$1(C34651kr r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new IntegratorManager$refreshIntegratorsAfterError$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new IntegratorManager$refreshIntegratorsAfterError$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 1
            if (r0 == 0) goto L_0x000f
            if (r0 != r6) goto L_0x0064
            X.C30691eM.A01(r9)
        L_0x000c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x000f:
            X.C30691eM.A01(r9)
            X.1kr r0 = r8.this$0
            X.00H r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.2cM r0 = (X.C53332cM) r0
            X.1Cd r0 = r0.A00     // Catch:{ SQLException -> 0x004b }
            X.1au r7 = r0.A05()     // Catch:{ SQLException -> 0x004b }
            X.1xA r5 = r7.BD0()     // Catch:{ all -> 0x0044 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x003d }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "integrator_display_name"
            java.lang.String r1 = "InteropIntegratorStoreDELETE_INTEGRATOR_INFO"
            r0 = 0
            r3.A04(r2, r0, r1, r0)     // Catch:{ all -> 0x003d }
            r5.A00()     // Catch:{ all -> 0x003d }
            r5.close()     // Catch:{ all -> 0x0044 }
            r7.close()     // Catch:{ SQLException -> 0x004b }
            goto L_0x0051
        L_0x003d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0044 }
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ SQLException -> 0x004b }
            throw r0     // Catch:{ SQLException -> 0x004b }
        L_0x004b:
            r1 = move-exception
            java.lang.String r0 = "InteropIntegratorStore/deleteIntegratorInfo"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0051:
            X.1kr r3 = r8.this$0
            r8.label = r6
            X.0wl r2 = r3.A04
            r1 = 0
            com.whatsapp.interop.integrator.IntegratorManager$refreshIntegrators$2 r0 = new com.whatsapp.interop.integrator.IntegratorManager$refreshIntegrators$2
            r0.<init>(r3, r1)
            java.lang.Object r0 = X.C30451dy.A00(r8, r2, r0)
            if (r0 != r4) goto L_0x000c
            return r4
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interop.integrator.IntegratorManager$refreshIntegratorsAfterError$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
