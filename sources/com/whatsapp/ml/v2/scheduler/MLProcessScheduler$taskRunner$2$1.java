package com.whatsapp.ml.v2.scheduler;

import X.C22821Di;
import X.C25749ClJ;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.scheduler.MLProcessScheduler$taskRunner$2$1", f = "MLProcessScheduler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MLProcessScheduler$taskRunner$2$1 extends C30431dv implements C22821Di {
    public int label;
    public final /* synthetic */ C25749ClJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLProcessScheduler$taskRunner$2$1(C25749ClJ clJ, C30391dr r3) {
        super(1, r3);
        this.this$0 = clJ;
    }

    public final C30391dr create(C30391dr r3) {
        return new MLProcessScheduler$taskRunner$2$1(this.this$0, r3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new MLProcessScheduler$taskRunner$2$1(this.this$0, (C30391dr) obj).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (r1 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        return new com.whatsapp.ml.v2.scheduler.MLProcessScheduler$getNextTask$1(r2, r1, (X.C30391dr) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            if (r0 != 0) goto L_0x0090
            X.C30691eM.A01(r8)
            X.ClJ r2 = r7.this$0
            X.00H r0 = r2.A02
            java.lang.Object r0 = r0.get()
            X.195 r0 = (X.AnonymousClass195) r0
            boolean r0 = r0.A00
            r3 = 1
            if (r0 != 0) goto L_0x0038
            X.00H r0 = r2.A06
            java.lang.Object r0 = r0.get()
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            boolean r0 = r0.isPowerSaveMode()
            if (r0 != 0) goto L_0x0037
            X.00H r0 = r2.A03
            java.lang.Object r1 = r0.get()
            android.os.BatteryManager r1 = (android.os.BatteryManager) r1
            r0 = 4
            int r1 = r1.getIntProperty(r0)
            if (r3 > r1) goto L_0x0038
            r0 = 20
            if (r1 >= r0) goto L_0x0038
        L_0x0037:
            r3 = 0
        L_0x0038:
            r5 = 0
            if (r3 == 0) goto L_0x008f
            X.0vl r0 = r2.A0B
            java.lang.Object r4 = r0.getValue()
            X.Cij r4 = (X.C25604Cij) r4
            monitor-enter(r4)
            X.C25604Cij.A00(r4)     // Catch:{ all -> 0x008c }
            java.util.LinkedList r0 = r4.A03     // Catch:{ all -> 0x008c }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x008c }
            X.C18070vi.A0X(r6)     // Catch:{ all -> 0x008c }
        L_0x0050:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x008a
            java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x008c }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x008c }
            X.C5I r3 = (X.C5I) r3     // Catch:{ all -> 0x008c }
            X.1Di r1 = r4.A05     // Catch:{ all -> 0x008c }
            X.C6h r0 = r3.A01     // Catch:{ all -> 0x008c }
            X.6Rq r0 = r0.A01()     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r1.invoke(r0)     // Catch:{ all -> 0x008c }
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0050
            r6.remove()     // Catch:{ all -> 0x008c }
            java.util.Map r1 = r4.A04     // Catch:{ all -> 0x008c }
            X.C6h r0 = r3.A01     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.A02()     // Catch:{ all -> 0x008c }
            r1.remove(r0)     // Catch:{ all -> 0x008c }
            X.C6h r1 = r3.A01     // Catch:{ all -> 0x008c }
            monitor-exit(r4)
            if (r1 == 0) goto L_0x008f
            com.whatsapp.ml.v2.scheduler.MLProcessScheduler$getNextTask$1 r0 = new com.whatsapp.ml.v2.scheduler.MLProcessScheduler$getNextTask$1
            r0.<init>(r2, r1, r5)
            return r0
        L_0x008a:
            monitor-exit(r4)
            return r5
        L_0x008c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x008f:
            return r5
        L_0x0090:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ml.v2.scheduler.MLProcessScheduler$taskRunner$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
