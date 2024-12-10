package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.7bQ  reason: invalid class name and case insensitive filesystem */
public final class C147927bQ extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C18090vk $block;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147927bQ(C30391dr r2, C18090vk r3) {
        super(2, r2);
        this.$block = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        C147927bQ r0 = new C147927bQ(r4, this.$block);
        r0.L$0 = obj;
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = r4.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        r3.A00();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            if (r0 != 0) goto L_0x0065
            X.C30691eM.A01(r6)
            java.lang.Object r0 = r5.L$0
            X.1OX r0 = (X.AnonymousClass1OX) r0
            X.0wh r1 = r0.getCoroutineContext()
            X.0vk r4 = r5.$block
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C147177Sc.A03     // Catch:{ InterruptedException -> 0x0058 }
            X.1OB r0 = X.C30551e8.A02(r1)     // Catch:{ InterruptedException -> 0x0058 }
            X.7Sc r3 = new X.7Sc     // Catch:{ InterruptedException -> 0x0058 }
            r3.<init>(r0)     // Catch:{ InterruptedException -> 0x0058 }
            X.1OB r1 = r3.A01     // Catch:{ InterruptedException -> 0x0058 }
            r0 = 1
            X.1OI r0 = X.C30551e8.A01(r3, r1, r0, r0)     // Catch:{ InterruptedException -> 0x0058 }
            r3.A00 = r0     // Catch:{ InterruptedException -> 0x0058 }
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = X.C147177Sc.A03     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0027:
            int r2 = r1.get(r3)     // Catch:{ InterruptedException -> 0x0058 }
            if (r2 == 0) goto L_0x002e
            goto L_0x0036
        L_0x002e:
            r0 = 0
            boolean r0 = r1.compareAndSet(r3, r2, r0)     // Catch:{ InterruptedException -> 0x0058 }
            if (r0 == 0) goto L_0x0027
            goto L_0x004b
        L_0x0036:
            r0 = 2
            if (r2 == r0) goto L_0x004b
            r0 = 3
            if (r2 == r0) goto L_0x004b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.String r0 = "Illegal state "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r2)     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0057
        L_0x004b:
            java.lang.Object r0 = r4.invoke()     // Catch:{ all -> 0x0053 }
            r3.A00()     // Catch:{ InterruptedException -> 0x0058 }
            return r0
        L_0x0053:
            r0 = move-exception
            r3.A00()     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0057:
            throw r0     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0058:
            r2 = move-exception
            java.lang.String r1 = "Blocking call was interrupted due to parent cancellation"
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            java.lang.Throwable r0 = r0.initCause(r2)
            throw r0
        L_0x0065:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147927bQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C147927bQ) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
