package androidx.compose.ui.platform;

import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C108485bm;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", i = {0}, l = {67}, m = "invokeSuspend", n = {"$this$consume$iv$iv"}, s = {"L$0"})
public final class GlobalSnapshotManager$ensureStarted$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C108485bm $channel;
    public Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(C30391dr r2, C108485bm r3) {
        super(2, r2);
        this.$channel = r3;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new GlobalSnapshotManager$ensureStarted$1(r4, this.$channel);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[Catch:{ all -> 0x004d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1g4 r6 = X.AnonymousClass3F6.A03()
            int r0 = r7.label
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L_0x001d
            if (r0 != r4) goto L_0x0018
            java.lang.Object r3 = r7.L$1
            X.DXm r3 = (X.C27177DXm) r3
            java.lang.Object r2 = r7.L$0
            X.5bw r2 = (X.C108585bw) r2
            X.C30691eM.A01(r8)     // Catch:{ all -> 0x004f }
            goto L_0x0033
        L_0x0018:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x001d:
            X.C30691eM.A01(r8)
            X.5bm r2 = r7.$channel
            X.DXm r3 = r2.Bh9()     // Catch:{ all -> 0x004f }
        L_0x0026:
            r7.L$0 = r2     // Catch:{ all -> 0x004f }
            r7.L$1 = r3     // Catch:{ all -> 0x004f }
            r7.label = r4     // Catch:{ all -> 0x004f }
            java.lang.Object r8 = r3.A01(r7)     // Catch:{ all -> 0x004f }
            if (r8 != r6) goto L_0x0033
            goto L_0x0046
        L_0x0033:
            boolean r0 = X.AnonymousClass000.A1Y(r8)     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0047
            r3.A00()     // Catch:{ all -> 0x004d }
            java.util.concurrent.atomic.AtomicBoolean r1 = X.AnonymousClass0O6.A00     // Catch:{ all -> 0x004d }
            r0 = 0
            r1.set(r0)     // Catch:{ all -> 0x004d }
            X.C04790Ov.A03()     // Catch:{ all -> 0x004d }
            goto L_0x0026
        L_0x0046:
            return r6
        L_0x0047:
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x004d }
            X.AnonymousClass4I2.A00(r5, r2)
            return r0
        L_0x004d:
            r1 = move-exception
            goto L_0x0050
        L_0x004f:
            r1 = move-exception
        L_0x0050:
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            X.AnonymousClass4I2.A00(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
