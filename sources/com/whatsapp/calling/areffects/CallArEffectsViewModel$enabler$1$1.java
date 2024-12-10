package com.whatsapp.calling.areffects;

import X.AnonymousClass1OS;
import X.BCO;
import X.C107855aj;
import X.C27621Wu;
import X.C28596E9n;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C92384hD;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.areffects.CallArEffectsViewModel$enabler$1$1", f = "CallArEffectsViewModel.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
public final class CallArEffectsViewModel$enabler$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ BCO $callback;
    public final /* synthetic */ C28596E9n $cameraProcessor;
    public final /* synthetic */ C107855aj $effect;
    public final /* synthetic */ C92384hD $params;
    public int label;
    public final /* synthetic */ CallArEffectsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallArEffectsViewModel$enabler$1$1(C107855aj r2, BCO bco, C92384hD r4, C28596E9n e9n, CallArEffectsViewModel callArEffectsViewModel, C30391dr r7) {
        super(2, r7);
        this.$cameraProcessor = e9n;
        this.$effect = r2;
        this.$params = r4;
        this.$callback = bco;
        this.this$0 = callArEffectsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        C28596E9n e9n = this.$cameraProcessor;
        return new CallArEffectsViewModel$enabler$1$1(this.$effect, this.$callback, this.$params, e9n, this.this$0, r9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        r8.$callback.Btl(r1);
        com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel.A06(r8.this$0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 != r6) goto L_0x000d
            X.C30691eM.A01(r9)     // Catch:{ 4tK -> 0x0053 }
            goto L_0x005e
        L_0x000d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0012:
            X.C30691eM.A01(r9)
            X.E9n r5 = r8.$cameraProcessor     // Catch:{ 4tK -> 0x0053 }
            X.5aj r4 = r8.$effect     // Catch:{ 4tK -> 0x0053 }
            X.4hD r3 = r8.$params     // Catch:{ 4tK -> 0x0053 }
            X.BCO r2 = r8.$callback     // Catch:{ 4tK -> 0x0053 }
            X.DOf r5 = (X.C26983DOf) r5     // Catch:{ 4tK -> 0x0053 }
            monitor-enter(r5)     // Catch:{ 4tK -> 0x0053 }
            r0 = 0
            X.C18070vi.A0d(r4, r0)     // Catch:{ all -> 0x0050 }
            X.C18070vi.A0e(r3, r6, r2)     // Catch:{ all -> 0x0050 }
            r5.A05 = r6     // Catch:{ all -> 0x0050 }
            X.4DE r1 = r3.A00     // Catch:{ all -> 0x0050 }
            X.4DE r0 = X.AnonymousClass4DE.LOW_LIGHT     // Catch:{ all -> 0x0050 }
            if (r1 != r0) goto L_0x0039
            X.0vl r0 = r5.A0G     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0050 }
            X.DDm r0 = (X.DDm) r0     // Catch:{ all -> 0x0050 }
            r0.A04 = r6     // Catch:{ all -> 0x0050 }
        L_0x0039:
            X.0vl r0 = r5.A0C     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0050 }
            X.9so r0 = (X.C195109so) r0     // Catch:{ all -> 0x0050 }
            r0.A00(r4, r2, r3)     // Catch:{ all -> 0x0050 }
            monitor-exit(r5)     // Catch:{ 4tK -> 0x0053 }
            com.whatsapp.calling.areffects.CallArEffectsViewModel r0 = r8.this$0     // Catch:{ 4tK -> 0x0053 }
            r8.label = r6     // Catch:{ 4tK -> 0x0053 }
            java.lang.Object r0 = com.whatsapp.calling.areffects.CallArEffectsViewModel.A09(r0, r8)     // Catch:{ 4tK -> 0x0053 }
            if (r0 != r7) goto L_0x005e
            return r7
        L_0x0050:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ 4tK -> 0x0053 }
            throw r0     // Catch:{ 4tK -> 0x0053 }
        L_0x0053:
            r1 = move-exception
            X.BCO r0 = r8.$callback
            r0.Btl(r1)
            com.whatsapp.calling.areffects.CallArEffectsViewModel r0 = r8.this$0
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel.A06(r0)
        L_0x005e:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.areffects.CallArEffectsViewModel$enabler$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallArEffectsViewModel$enabler$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
