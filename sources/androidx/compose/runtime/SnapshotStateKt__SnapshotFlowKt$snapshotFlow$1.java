package androidx.compose.runtime;

import X.AnonymousClass1G2;
import X.AnonymousClass1OS;
import X.C05200Qx;
import X.C18090vk;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {144, 148, 170}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
public final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C18090vk $block;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(C30391dr r2, C18090vk r3) {
        super(2, r2);
        this.$block = r3;
    }

    /* renamed from: A01 */
    public final Object invoke(C30391dr r3, AnonymousClass1G2 r4) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(r4, this.$block);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.DXn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: X.DXn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: X.DXn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: X.DXn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: X.DXn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: X.DXn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: X.DXn} */
    /* JADX WARNING: type inference failed for: r4v2, types: [X.0NQ, X.071, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0105, code lost:
        if (r2 != 8) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010c, code lost:
        r22 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010f, code lost:
        if (r22 != false) goto L_0x0111;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6 A[Catch:{ all -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bf A[Catch:{ all -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0120 A[Catch:{ all -> 0x0166 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r14 = r25
            X.1g4 r9 = X.AnonymousClass3F6.A03()
            r8 = r24
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L_0x004b
            if (r1 == r2) goto L_0x0034
            r0 = 2
            if (r1 == r0) goto L_0x001a
            r0 = 3
            if (r1 == r0) goto L_0x0034
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x001a:
            int r1 = r8.I$0
            java.lang.Object r10 = r8.L$5
            java.lang.Object r6 = r8.L$4
            X.0s4 r6 = (X.C16320s4) r6
            java.lang.Object r7 = r8.L$3
            X.5bw r7 = (X.C108585bw) r7
            java.lang.Object r5 = r8.L$2
            X.1Di r5 = (X.C22821Di) r5
            java.lang.Object r4 = r8.L$1
            X.071 r4 = (X.AnonymousClass071) r4
            java.lang.Object r3 = r8.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            goto L_0x00b8
        L_0x0034:
            java.lang.Object r10 = r8.L$5
            java.lang.Object r6 = r8.L$4
            X.0s4 r6 = (X.C16320s4) r6
            java.lang.Object r7 = r8.L$3
            X.5bw r7 = (X.C108585bw) r7
            java.lang.Object r5 = r8.L$2
            X.1Di r5 = (X.C22821Di) r5
            java.lang.Object r4 = r8.L$1
            X.071 r4 = (X.AnonymousClass071) r4
            java.lang.Object r3 = r8.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            goto L_0x009b
        L_0x004b:
            X.C30691eM.A01(r14)
            java.lang.Object r3 = r8.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            X.071 r4 = new X.071
            r4.<init>()
            X.070 r0 = X.AnonymousClass0GO.A01
            r0 = 6
            X.AnonymousClass071.A02(r4, r0)
            X.0hO r5 = new X.0hO
            r5.<init>(r4)
            r0 = 2147483647(0x7fffffff, float:NaN)
            X.DXn r7 = X.AnonymousClass4W8.A01(X.C25691Pg.SUSPEND, r0)
            X.0mh r0 = new X.0mh
            r0.<init>(r7)
            X.0W4 r6 = X.C04790Ov.A01(r0)
            androidx.compose.runtime.snapshots.Snapshot r11 = A00(r5)     // Catch:{ all -> 0x0166 }
            X.0vk r0 = r8.$block     // Catch:{ all -> 0x0166 }
            androidx.compose.runtime.snapshots.Snapshot r1 = r11.A02()     // Catch:{ all -> 0x0161 }
            java.lang.Object r10 = r0.invoke()     // Catch:{ all -> 0x0158 }
            X.AnonymousClass0N4.A00(r1)     // Catch:{ all -> 0x0161 }
            r11.A0D()     // Catch:{ all -> 0x0166 }
            r8.L$0 = r3     // Catch:{ all -> 0x0166 }
            r8.L$1 = r4     // Catch:{ all -> 0x0166 }
            r8.L$2 = r5     // Catch:{ all -> 0x0166 }
            r8.L$3 = r7     // Catch:{ all -> 0x0166 }
            r8.L$4 = r6     // Catch:{ all -> 0x0166 }
            r8.L$5 = r10     // Catch:{ all -> 0x0166 }
            r8.label = r2     // Catch:{ all -> 0x0166 }
            java.lang.Object r0 = r3.BJt(r10, r8)     // Catch:{ all -> 0x0166 }
            if (r0 != r9) goto L_0x009e
            return r9
        L_0x009b:
            X.C30691eM.A01(r14)     // Catch:{ all -> 0x0166 }
        L_0x009e:
            r8.L$0 = r3     // Catch:{ all -> 0x0166 }
            r8.L$1 = r4     // Catch:{ all -> 0x0166 }
            r8.L$2 = r5     // Catch:{ all -> 0x0166 }
            r8.L$3 = r7     // Catch:{ all -> 0x0166 }
            r8.L$4 = r6     // Catch:{ all -> 0x0166 }
            r8.L$5 = r10     // Catch:{ all -> 0x0166 }
            r0 = 0
            r8.I$0 = r0     // Catch:{ all -> 0x0166 }
            r0 = 2
            r8.label = r0     // Catch:{ all -> 0x0166 }
            java.lang.Object r14 = r7.CDW(r8)     // Catch:{ all -> 0x0166 }
            if (r14 == r9) goto L_0x0157
            r1 = 0
            goto L_0x00bb
        L_0x00b8:
            X.C30691eM.A01(r14)     // Catch:{ all -> 0x0166 }
        L_0x00bb:
            java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x0166 }
        L_0x00bd:
            if (r1 != 0) goto L_0x0111
            java.lang.Object[] r0 = r4.A03     // Catch:{ all -> 0x0166 }
            r23 = r0
            long[] r15 = r4.A02     // Catch:{ all -> 0x0166 }
            int r0 = r15.length     // Catch:{ all -> 0x0166 }
            int r13 = r0 + -2
            r22 = 0
            if (r13 < 0) goto L_0x010e
            r12 = 0
        L_0x00cd:
            r20 = r15[r12]     // Catch:{ all -> 0x0166 }
            long r16 = X.AnonymousClass001.A0q(r20)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r16 = r16 & r1
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0107
            int r0 = X.AnonymousClass000.A0D(r12, r13)
            r11 = 8
            int r2 = 8 - r0
            r1 = 0
        L_0x00e7:
            if (r1 >= r2) goto L_0x0105
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r18 & r20
            r16 = 128(0x80, double:6.32E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0100
            r0 = r23
            java.lang.Object r0 = X.AnonymousClass000.A0x(r0, r12, r1)     // Catch:{ all -> 0x0166 }
            boolean r0 = r14.contains(r0)     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x0100
            goto L_0x010c
        L_0x0100:
            long r20 = r20 >> r11
            int r1 = r1 + 1
            goto L_0x00e7
        L_0x0105:
            if (r2 != r11) goto L_0x010e
        L_0x0107:
            if (r12 == r13) goto L_0x010e
            int r12 = r12 + 1
            goto L_0x00cd
        L_0x010c:
            r22 = 1
        L_0x010e:
            r1 = 0
            if (r22 == 0) goto L_0x0112
        L_0x0111:
            r1 = 1
        L_0x0112:
            java.lang.Object r0 = r7.CPy()     // Catch:{ all -> 0x0166 }
            java.lang.Object r14 = X.C26020Cqb.A00(r0)     // Catch:{ all -> 0x0166 }
            java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x0166 }
            if (r14 != 0) goto L_0x00bd
            if (r1 == 0) goto L_0x009e
            r4.A06()     // Catch:{ all -> 0x0166 }
            androidx.compose.runtime.snapshots.Snapshot r11 = A00(r5)     // Catch:{ all -> 0x0166 }
            X.0vk r0 = r8.$block     // Catch:{ all -> 0x0166 }
            androidx.compose.runtime.snapshots.Snapshot r2 = r11.A02()     // Catch:{ all -> 0x0161 }
            java.lang.Object r1 = r0.invoke()     // Catch:{ all -> 0x0155 }
            X.AnonymousClass0N4.A00(r2)     // Catch:{ all -> 0x0161 }
            r11.A0D()     // Catch:{ all -> 0x0166 }
            boolean r0 = X.C18070vi.A18(r1, r10)     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x009e
            r8.L$0 = r3     // Catch:{ all -> 0x0166 }
            r8.L$1 = r4     // Catch:{ all -> 0x0166 }
            r8.L$2 = r5     // Catch:{ all -> 0x0166 }
            r8.L$3 = r7     // Catch:{ all -> 0x0166 }
            r8.L$4 = r6     // Catch:{ all -> 0x0166 }
            r8.L$5 = r1     // Catch:{ all -> 0x0166 }
            r0 = 3
            r8.label = r0     // Catch:{ all -> 0x0166 }
            java.lang.Object r0 = r3.BJt(r1, r8)     // Catch:{ all -> 0x0166 }
            if (r0 == r9) goto L_0x0157
            r10 = r1
            goto L_0x009e
        L_0x0155:
            r0 = move-exception
            goto L_0x015d
        L_0x0157:
            return r9
        L_0x0158:
            r0 = move-exception
            X.AnonymousClass0N4.A00(r1)     // Catch:{ all -> 0x0161 }
            goto L_0x0160
        L_0x015d:
            X.AnonymousClass0N4.A00(r2)     // Catch:{ all -> 0x0161 }
        L_0x0160:
            throw r0     // Catch:{ all -> 0x0161 }
        L_0x0161:
            r0 = move-exception
            r11.A0D()     // Catch:{ all -> 0x0166 }
            throw r0     // Catch:{ all -> 0x0166 }
        L_0x0166:
            r0 = move-exception
            r6.dispose()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static final Snapshot A00(C22821Di r1) {
        return C05200Qx.A01().A09(r1);
    }
}
