package androidx.work.impl.constraints;

import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", i = {}, l = {292}, m = "invokeSuspend", n = {}, s = {})
public final class WorkConstraintsTracker$track$$inlined$combine$1$3 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public WorkConstraintsTracker$track$$inlined$combine$1$3(C30391dr r2) {
        super(3, r2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        WorkConstraintsTracker$track$$inlined$combine$1$3 workConstraintsTracker$track$$inlined$combine$1$3 = new WorkConstraintsTracker$track$$inlined$combine$1$3((C30391dr) obj3);
        workConstraintsTracker$track$$inlined$combine$1$3.L$0 = obj;
        workConstraintsTracker$track$$inlined$combine$1$3.L$1 = obj2;
        return workConstraintsTracker$track$$inlined$combine$1$3.invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r1 == null) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 1
            if (r0 == 0) goto L_0x000f
            if (r0 != r6) goto L_0x003c
            X.C30691eM.A01(r9)
        L_0x000c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x000f:
            X.C30691eM.A01(r9)
            java.lang.Object r5 = r8.L$0
            X.1G2 r5 = (X.AnonymousClass1G2) r5
            java.lang.Object r4 = r8.L$1
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            X.9Lj[] r4 = (X.C180159Lj[]) r4
            int r3 = r4.length
            r2 = 0
        L_0x001e:
            if (r2 >= r3) goto L_0x002e
            r1 = r4[r2]
            X.8KC r0 = X.AnonymousClass8KC.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0039
            if (r1 != 0) goto L_0x0030
        L_0x002e:
            X.8KC r1 = X.AnonymousClass8KC.A00
        L_0x0030:
            r8.label = r6
            java.lang.Object r0 = r5.BJt(r1, r8)
            if (r0 != r7) goto L_0x000c
            return r7
        L_0x0039:
            int r2 = r2 + 1
            goto L_0x001e
        L_0x003c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
