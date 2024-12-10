package com.whatsapp.ml.v2.scheduler;

import X.AnonymousClass1OS;
import X.C24964CRo;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.scheduler.SequentialTaskRunner$start$1$1", f = "SequentialTaskRunner.kt", i = {0, 1, 2, 2, 2, 3, 3}, l = {41, 42, 71, 45}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch", "nextTask", "$this$withLock_u24default$iv", "$this$launch", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0", "L$0", "L$1", "L$2", "L$0", "L$1"})
public final class SequentialTaskRunner$start$1$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ C24964CRo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequentialTaskRunner$start$1$1(C24964CRo cRo, C30391dr r3) {
        super(2, r3);
        this.this$0 = cRo;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        SequentialTaskRunner$start$1$1 sequentialTaskRunner$start$1$1 = new SequentialTaskRunner$start$1$1(this.this$0, r4);
        sequentialTaskRunner$start$1$1.L$0 = obj;
        return sequentialTaskRunner$start$1$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00aa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e A[Catch:{ Exception -> 0x009f, all -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00aa A[ExcHandler: all (th java.lang.Throwable), PHI: r10 
      PHI: (r10v1 X.1n2) = (r10v4 X.1n2), (r10v9 X.1n2), (r10v9 X.1n2) binds: [B:29:0x008e, B:7:0x001b, B:8:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:7:0x001b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r11.label
            r6 = 4
            r5 = 3
            r4 = 2
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x0057
            if (r0 == r4) goto L_0x006d
            if (r0 == r5) goto L_0x0027
            if (r0 != r6) goto L_0x0022
            java.lang.Object r10 = r11.L$1
            X.1n2 r10 = (X.C35911n2) r10
            java.lang.Object r1 = r11.L$0
            X.1OX r1 = (X.AnonymousClass1OX) r1
            X.C30691eM.A01(r12)     // Catch:{ Exception -> 0x0020, all -> 0x00aa }
            goto L_0x00a5
        L_0x0020:
            r8 = move-exception
            goto L_0x00a0
        L_0x0022:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0027:
            java.lang.Object r9 = r11.L$3
            java.lang.Object r10 = r11.L$2
            X.1n2 r10 = (X.C35911n2) r10
            java.lang.Object r8 = r11.L$1
            X.1Di r8 = (X.C22821Di) r8
            java.lang.Object r1 = r11.L$0
            X.1OX r1 = (X.AnonymousClass1OX) r1
            X.C30691eM.A01(r12)
            goto L_0x008e
        L_0x0039:
            X.C30691eM.A01(r12)
            java.lang.Object r1 = r11.L$0
            X.1OX r1 = (X.AnonymousClass1OX) r1
        L_0x0040:
            boolean r0 = X.AnonymousClass1OW.A05(r1)
            if (r0 == 0) goto L_0x00b1
            r11.L$0 = r1
            r11.L$1 = r2
            r11.L$2 = r2
            r11.L$3 = r2
            r11.label = r3
            java.lang.Object r0 = X.AnonymousClass2VI.A00(r11)
            if (r0 != r7) goto L_0x005e
            return r7
        L_0x0057:
            java.lang.Object r1 = r11.L$0
            X.1OX r1 = (X.AnonymousClass1OX) r1
            X.C30691eM.A01(r12)
        L_0x005e:
            X.CRo r0 = r11.this$0
            X.1Di r0 = r0.A01
            r11.L$0 = r1
            r11.label = r4
            java.lang.Object r12 = r0.invoke(r11)
            if (r12 != r7) goto L_0x0074
            return r7
        L_0x006d:
            java.lang.Object r1 = r11.L$0
            X.1OX r1 = (X.AnonymousClass1OX) r1
            X.C30691eM.A01(r12)
        L_0x0074:
            r8 = r12
            X.1Di r8 = (X.C22821Di) r8
            if (r8 == 0) goto L_0x00b1
            X.CRo r9 = r11.this$0
            X.1n2 r10 = r9.A03
            r11.L$0 = r1
            r11.L$1 = r8
            r11.L$2 = r10
            r11.L$3 = r9
            r11.label = r5
            java.lang.Object r0 = r10.Bhx(r11)
            if (r0 != r7) goto L_0x008e
            return r7
        L_0x008e:
            r11.L$0 = r1     // Catch:{ Exception -> 0x009f, all -> 0x00aa }
            r11.L$1 = r10     // Catch:{ Exception -> 0x009f, all -> 0x00aa }
            r11.L$2 = r9     // Catch:{ Exception -> 0x009f, all -> 0x00aa }
            r11.L$3 = r2     // Catch:{ Exception -> 0x009f, all -> 0x00aa }
            r11.label = r6     // Catch:{ Exception -> 0x009f, all -> 0x00aa }
            java.lang.Object r0 = r8.invoke(r11)     // Catch:{ Exception -> 0x009f, all -> 0x00aa }
            if (r0 != r7) goto L_0x00a5
            goto L_0x00a9
        L_0x009f:
            r8 = move-exception
        L_0x00a0:
            java.lang.String r0 = "SequentialTaskRunner/handleException A task raised an exception"
            com.whatsapp.util.Log.e(r0, r8)     // Catch:{ all -> 0x00ac }
        L_0x00a5:
            r10.CQ9(r2)
            goto L_0x0040
        L_0x00a9:
            return r7
        L_0x00aa:
            r0 = move-exception
            goto L_0x00ad
        L_0x00ac:
            r0 = move-exception
        L_0x00ad:
            r10.CQ9(r2)
            throw r0
        L_0x00b1:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ml.v2.scheduler.SequentialTaskRunner$start$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SequentialTaskRunner$start$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
