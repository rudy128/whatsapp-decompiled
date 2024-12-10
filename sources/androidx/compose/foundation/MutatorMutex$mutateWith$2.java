package androidx.compose.foundation;

import X.AnonymousClass0CH;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C04320Ms;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {220, 173}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class MutatorMutex$mutateWith$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $block;
    public final /* synthetic */ AnonymousClass0CH $priority;
    public final /* synthetic */ Object $receiver;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ C04320Ms this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutateWith$2(AnonymousClass0CH r2, C04320Ms r3, Object obj, C30391dr r5, AnonymousClass1OS r6) {
        super(2, r5);
        this.$priority = r2;
        this.this$0 = r3;
        this.$block = r6;
        this.$receiver = obj;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((MutatorMutex$mutateWith$2) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$receiver, r8, this.$block);
        mutatorMutex$mutateWith$2.L$0 = obj;
        return mutatorMutex$mutateWith$2;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x00b0=Splitter:B:29:0x00b0, B:34:0x00ba=Splitter:B:34:0x00ba} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1g4 r8 = X.AnonymousClass3F6.A03()
            int r0 = r10.label
            r7 = 2
            r9 = 1
            r5 = 0
            if (r0 == 0) goto L_0x003a
            if (r0 == r9) goto L_0x0026
            if (r0 != r7) goto L_0x0021
            java.lang.Object r4 = r10.L$2
            X.0Ms r4 = (X.C04320Ms) r4
            java.lang.Object r3 = r10.L$1
            X.1n2 r3 = (X.C35911n2) r3
            java.lang.Object r6 = r10.L$0
            X.C30691eM.A01(r11)     // Catch:{ all -> 0x001e }
            goto L_0x00b0
        L_0x001e:
            r1 = move-exception
            goto L_0x00ba
        L_0x0021:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0026:
            java.lang.Object r4 = r10.L$4
            X.0Ms r4 = (X.C04320Ms) r4
            java.lang.Object r2 = r10.L$3
            java.lang.Object r1 = r10.L$2
            X.1OS r1 = (X.AnonymousClass1OS) r1
            java.lang.Object r3 = r10.L$1
            X.1n2 r3 = (X.C35911n2) r3
            java.lang.Object r6 = r10.L$0
            X.C30691eM.A01(r11)
            goto L_0x009d
        L_0x003a:
            X.C30691eM.A01(r11)
            java.lang.Object r0 = r10.L$0
            X.1OX r0 = (X.AnonymousClass1OX) r0
            X.0CH r2 = r10.$priority
            X.0wh r1 = r0.getCoroutineContext()
            X.1OU r0 = X.AnonymousClass1OB.A00
            X.0wi r0 = r1.get(r0)
            X.C18070vi.A0b(r0)
            X.1OB r0 = (X.AnonymousClass1OB) r0
            X.0IC r6 = new X.0IC
            r6.<init>(r2, r0)
            X.0Ms r4 = r10.this$0
        L_0x0059:
            java.util.concurrent.atomic.AtomicReference r3 = r4.A00
            java.lang.Object r2 = r3.get()
            X.0IC r2 = (X.AnonymousClass0IC) r2
            if (r2 == 0) goto L_0x0075
            X.0CH r1 = r6.A00
            X.0CH r0 = r2.A00
            int r0 = r1.compareTo(r0)
            if (r0 >= 0) goto L_0x0075
            java.lang.String r1 = "Current mutation had a higher priority"
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            throw r0
        L_0x0075:
            boolean r0 = X.AnonymousClass00N.A00(r2, r6, r3)
            if (r0 == 0) goto L_0x0059
            if (r2 == 0) goto L_0x0080
            r2.A00()
        L_0x0080:
            X.0Ms r4 = r10.this$0
            X.1n2 r3 = r4.A01
            X.1OS r1 = r10.$block
            java.lang.Object r2 = r10.$receiver
            r10.L$0 = r6
            r10.L$1 = r3
            r10.L$2 = r1
            r10.L$3 = r2
            r10.L$4 = r4
            r10.label = r9
            java.lang.Object r0 = r3.Bhx(r10)
            if (r0 != r8) goto L_0x009d
            return r8
        L_0x009d:
            r10.L$0 = r6     // Catch:{ all -> 0x00b9 }
            r10.L$1 = r3     // Catch:{ all -> 0x00b9 }
            r10.L$2 = r4     // Catch:{ all -> 0x00b9 }
            r10.L$3 = r5     // Catch:{ all -> 0x00b9 }
            r10.L$4 = r5     // Catch:{ all -> 0x00b9 }
            r10.label = r7     // Catch:{ all -> 0x00b9 }
            java.lang.Object r11 = r1.invoke(r2, r10)     // Catch:{ all -> 0x00b9 }
            if (r11 != r8) goto L_0x00b0
            return r8
        L_0x00b0:
            java.util.concurrent.atomic.AtomicReference r0 = r4.A00     // Catch:{ all -> 0x00c0 }
            X.AnonymousClass00N.A00(r6, r5, r0)     // Catch:{ all -> 0x00c0 }
            r3.CQ9(r5)
            return r11
        L_0x00b9:
            r1 = move-exception
        L_0x00ba:
            java.util.concurrent.atomic.AtomicReference r0 = r4.A00     // Catch:{ all -> 0x00c0 }
            X.AnonymousClass00N.A00(r6, r5, r0)     // Catch:{ all -> 0x00c0 }
            throw r1     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r0 = move-exception
            r3.CQ9(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MutatorMutex$mutateWith$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
