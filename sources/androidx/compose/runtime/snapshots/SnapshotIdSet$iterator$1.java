package androidx.compose.runtime.snapshots;

import X.AnonymousClass1OS;
import X.C06400Ye;
import X.C21488Akx;
import X.C27621Wu;
import X.C30391dr;
import X.C71433Fg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {295, 300, 307}, m = "invokeSuspend", n = {"$this$sequence", "belowBound", "$this$sequence", "index", "$this$sequence", "index"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
public final class SnapshotIdSet$iterator$1 extends C71433Fg implements AnonymousClass1OS {
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C06400Ye this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotIdSet$iterator$1(C06400Ye r1, C30391dr r2) {
        super(r2);
        this.this$0 = r1;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, C21488Akx akx) {
        return ((SnapshotIdSet$iterator$1) create(akx, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.this$0, r4);
        snapshotIdSet$iterator$1.L$0 = obj;
        return snapshotIdSet$iterator$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ba, code lost:
        if (r5 >= 64) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r5 < 64) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1g4 r13 = X.AnonymousClass3F6.A03()
            int r2 = r14.label
            r7 = 0
            r11 = 1
            r1 = 3
            r0 = 2
            r8 = 64
            r9 = 0
            r5 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x005d
            if (r2 == r0) goto L_0x00af
            if (r2 != r1) goto L_0x00ca
            int r5 = r14.I$0
            java.lang.Object r6 = r14.L$0
            X.Akx r6 = (X.C21488Akx) r6
            X.C30691eM.A01(r15)
        L_0x0021:
            int r5 = r5 + 1
            if (r5 >= r8) goto L_0x00cf
        L_0x0025:
            X.0Ye r4 = r14.this$0
            long r2 = r4.A02
            long r0 = r11 << r5
            long r2 = r2 & r0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0021
            int r2 = r5 + 64
            int r0 = r4.A00
            int r2 = r2 + r0
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r2)
            r14.L$0 = r6
            r14.L$1 = r7
            r14.I$0 = r5
            r0 = 3
        L_0x0045:
            r14.label = r0
            r6.A00(r1, r14)
            return r13
        L_0x004b:
            X.C30691eM.A01(r15)
            java.lang.Object r6 = r14.L$0
            X.Akx r6 = (X.C21488Akx) r6
            X.0Ye r0 = r14.this$0
            int[] r3 = r0.A03
            if (r3 == 0) goto L_0x0085
            int r4 = r3.length
            r2 = 0
            goto L_0x006e
        L_0x005d:
            int r4 = r14.I$1
            int r0 = r14.I$0
            java.lang.Object r3 = r14.L$1
            int[] r3 = (int[]) r3
            java.lang.Object r6 = r14.L$0
            X.Akx r6 = (X.C21488Akx) r6
            X.C30691eM.A01(r15)
            int r2 = r0 + 1
        L_0x006e:
            if (r2 >= r4) goto L_0x0085
            r1 = r3[r2]
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r14.L$0 = r6
            r14.L$1 = r3
            r14.I$0 = r2
            r14.I$1 = r4
            r14.label = r5
            r6.A00(r0, r14)
            return r13
        L_0x0085:
            X.0Ye r0 = r14.this$0
            long r1 = r0.A01
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00bd
            r5 = 0
        L_0x0090:
            X.0Ye r4 = r14.this$0
            long r2 = r4.A01
            long r0 = r11 << r5
            long r2 = r2 & r0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00b8
            int r0 = r4.A00
            int r0 = r0 + r5
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            r14.L$0 = r6
            r14.L$1 = r7
            r14.I$0 = r5
            r0 = 2
            goto L_0x0045
        L_0x00af:
            int r5 = r14.I$0
            java.lang.Object r6 = r14.L$0
            X.Akx r6 = (X.C21488Akx) r6
            X.C30691eM.A01(r15)
        L_0x00b8:
            int r5 = r5 + 1
            if (r5 >= r8) goto L_0x00bd
            goto L_0x0090
        L_0x00bd:
            X.0Ye r0 = r14.this$0
            long r1 = r0.A02
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00cf
            r5 = 0
            goto L_0x0025
        L_0x00ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00cf:
            X.1Wu r13 = X.C27621Wu.A00
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
