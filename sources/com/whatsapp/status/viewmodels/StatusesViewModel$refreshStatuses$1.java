package com.whatsapp.status.viewmodels;

import X.AnonymousClass1OS;
import X.C111255jJ;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.viewmodels.StatusesViewModel$refreshStatuses$1", f = "StatusesViewModel.kt", i = {0, 1, 2, 3, 3, 3, 3}, l = {319, 332, 334, 562}, m = "invokeSuspend", n = {"$this$launch", "refreshStatusesDeferred", "result", "result", "statuses", "mutedStatuses", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$2", "L$3"})
public final class StatusesViewModel$refreshStatuses$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $shouldThrottle;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ C111255jJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusesViewModel$refreshStatuses$1(C111255jJ r2, C30391dr r3, boolean z) {
        super(2, r3);
        this.$shouldThrottle = z;
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        StatusesViewModel$refreshStatuses$1 statusesViewModel$refreshStatuses$1 = new StatusesViewModel$refreshStatuses$1(this.this$0, r5, this.$shouldThrottle);
        statusesViewModel$refreshStatuses$1.L$0 = obj;
        return statusesViewModel$refreshStatuses$1;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        if (X.C62882s9.A00(r12, (long) X.C18020vd.A00(X.C18040vf.A01, r2, 8126)) == r8) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c7 A[LOOP:0: B:27:0x00c1->B:29:0x00c7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ef A[Catch:{ all -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0109 A[LOOP:1: B:39:0x0103->B:41:0x0109, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r8 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r9 = 4
            r10 = 3
            r7 = 2
            r3 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0037
            if (r0 == r3) goto L_0x005e
            if (r0 == r7) goto L_0x009f
            if (r0 == r10) goto L_0x002f
            if (r0 != r9) goto L_0x002a
            java.lang.Object r10 = r12.L$4
            X.5jJ r10 = (X.C111255jJ) r10
            java.lang.Object r2 = r12.L$3
            X.1n2 r2 = (X.C35911n2) r2
            java.lang.Object r7 = r12.L$2
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r4 = r12.L$1
            java.lang.Object r6 = r12.L$0
            X.6f4 r6 = (X.C127866f4) r6
            X.C30691eM.A01(r13)
            goto L_0x00e6
        L_0x002a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002f:
            java.lang.Object r6 = r12.L$0
            X.6f4 r6 = (X.C127866f4) r6
            X.C30691eM.A01(r13)
            goto L_0x00b4
        L_0x0037:
            X.C30691eM.A01(r13)
            java.lang.Object r11 = r12.L$0
            X.1OX r11 = (X.AnonymousClass1OX) r11
            boolean r0 = r12.$shouldThrottle
            if (r0 == 0) goto L_0x0065
            X.5jJ r0 = r12.this$0
            X.00H r0 = r0.A0B
            X.0ve r2 = X.C108955ca.A0R(r0)
            X.0vf r1 = X.C18040vf.A01
            r0 = 8126(0x1fbe, float:1.1387E-41)
            int r0 = X.C18020vd.A00(r1, r2, r0)
            long r0 = (long) r0
            r12.L$0 = r11
            r12.label = r3
            java.lang.Object r0 = X.C62882s9.A00(r12, r0)
            if (r0 != r8) goto L_0x0065
        L_0x005d:
            return r8
        L_0x005e:
            java.lang.Object r11 = r12.L$0
            X.1OX r11 = (X.AnonymousClass1OX) r11
            X.C30691eM.A01(r13)
        L_0x0065:
            X.5jJ r0 = r12.this$0
            boolean r0 = X.C111255jJ.A07(r0)
            if (r0 == 0) goto L_0x007a
            X.5jJ r0 = r12.this$0
            X.00H r0 = r0.A0C
            java.lang.Object r0 = r0.get()
            X.1TG r0 = (X.AnonymousClass1TG) r0
            r0.A05()
        L_0x007a:
            X.5jJ r1 = r12.this$0
            com.whatsapp.status.viewmodels.StatusesViewModel$refreshStatuses$1$refreshStatusesDeferred$1 r0 = new com.whatsapp.status.viewmodels.StatusesViewModel$refreshStatuses$1$refreshStatusesDeferred$1
            r0.<init>(r1, r5)
            X.1OR r6 = X.AnonymousClass1OR.A00
            java.lang.Integer r4 = X.AnonymousClass00R.A00
            X.5WH r0 = X.C30451dy.A01(r4, r6, r0, r11)
            X.5jJ r2 = r12.this$0
            com.whatsapp.status.viewmodels.StatusesViewModel$refreshStatuses$1$fetchStatusUpdatesMapDeferred$1 r1 = new com.whatsapp.status.viewmodels.StatusesViewModel$refreshStatuses$1$fetchStatusUpdatesMapDeferred$1
            r1.<init>(r2, r5)
            X.5WH r1 = X.C30451dy.A01(r4, r6, r1, r11)
            r12.L$0 = r0
            r12.label = r7
            java.lang.Object r13 = r1.BCp(r12)
            if (r13 != r8) goto L_0x00a6
            return r8
        L_0x009f:
            java.lang.Object r0 = r12.L$0
            X.EEF r0 = (X.EEF) r0
            X.C30691eM.A01(r13)
        L_0x00a6:
            X.6f4 r13 = (X.C127866f4) r13
            r12.L$0 = r13
            r12.label = r10
            java.lang.Object r0 = r0.BCp(r12)
            if (r0 == r8) goto L_0x005d
            r6 = r13
            r13 = r0
        L_0x00b4:
            r4 = r13
            X.6yN r4 = (X.C139186yN) r4
            java.util.List r0 = r4.A01
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00c1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cb
            X.C108985cd.A1N(r2, r1)
            goto L_0x00c1
        L_0x00cb:
            java.util.Set r7 = X.C29431cG.A12(r2)
            X.5jJ r10 = r12.this$0
            X.1n2 r2 = r10.A0L
            r12.L$0 = r6
            r12.L$1 = r4
            r12.L$2 = r7
            r12.L$3 = r2
            r12.L$4 = r10
            r12.label = r9
            java.lang.Object r0 = r2.Bhx(r12)
            if (r0 != r8) goto L_0x00e6
            return r8
        L_0x00e6:
            java.util.concurrent.atomic.AtomicBoolean r1 = r10.A0I     // Catch:{ all -> 0x011c }
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r3)     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x00f4
            java.util.Set r0 = r6.A01     // Catch:{ all -> 0x011c }
            X.C111255jJ.A05(r10, r0)     // Catch:{ all -> 0x011c }
        L_0x00f4:
            X.1Wu r3 = X.C27621Wu.A00     // Catch:{ all -> 0x011c }
            r2.CQ9(r5)
            java.util.Map r0 = r6.A00
            java.util.LinkedHashMap r2 = X.C108995ce.A0b(r0)
            java.util.Iterator r1 = X.AnonymousClass000.A15(r0)
        L_0x0103:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x010d
            X.C139106yE.A00(r1, r2, r7)
            goto L_0x0103
        L_0x010d:
            X.5jJ r0 = r12.this$0
            X.1DT r0 = r0.A04
            r0.A0E(r2)
            X.5jJ r0 = r12.this$0
            X.1DT r0 = r0.A05
            r0.A0E(r4)
            return r3
        L_0x011c:
            r0 = move-exception
            r2.CQ9(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.viewmodels.StatusesViewModel$refreshStatuses$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StatusesViewModel$refreshStatuses$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
