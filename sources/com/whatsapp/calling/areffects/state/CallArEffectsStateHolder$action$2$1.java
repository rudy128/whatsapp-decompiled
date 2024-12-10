package com.whatsapp.calling.areffects.state;

import X.AnonymousClass20G;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C85794Ot;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.areffects.state.CallArEffectsStateHolder$action$2$1", f = "CallArEffectsStateHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallArEffectsStateHolder$action$2$1 extends C30431dv implements AnonymousClass20G {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;
    public final /* synthetic */ C85794Ot this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallArEffectsStateHolder$action$2$1(C85794Ot r2, C30391dr r3) {
        super(4, r3);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        CallArEffectsStateHolder$action$2$1 callArEffectsStateHolder$action$2$1 = new CallArEffectsStateHolder$action$2$1(this.this$0, (C30391dr) obj4);
        callArEffectsStateHolder$action$2$1.L$0 = obj;
        callArEffectsStateHolder$action$2$1.L$1 = obj2;
        callArEffectsStateHolder$action$2$1.L$2 = obj3;
        return callArEffectsStateHolder$action$2$1.invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (X.C18070vi.A18(r1, r0) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0080, code lost:
        if (r0.A01 == false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            if (r0 != 0) goto L_0x0090
            X.C30691eM.A01(r9)
            java.lang.Object r0 = r8.L$0
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            java.lang.Object r6 = r8.L$1
            X.4Cj r6 = (X.C82864Cj) r6
            java.lang.Object r7 = r8.L$2
            X.4YJ r7 = (X.AnonymousClass4YJ) r7
            java.lang.Object r4 = r0.second
            X.4Y4 r4 = (X.AnonymousClass4Y4) r4
            java.lang.Object r0 = r0.first
            X.4Y4 r0 = (X.AnonymousClass4Y4) r0
            java.lang.String r1 = r0.A01
            java.lang.String r2 = r4.A01
            int r0 = r1.length()
            r3 = 1
            r5 = 0
            if (r0 <= 0) goto L_0x004b
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x004b
            X.4Ot r0 = r8.this$0
            java.lang.String r0 = r0.A00
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 != 0) goto L_0x004b
            X.4Ot r0 = r8.this$0
            r0.A00 = r2
            X.4T2 r0 = r4.A00
            if (r0 == 0) goto L_0x0046
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0067
            X.4iW r0 = X.C93154iW.A00
            return r0
        L_0x0046:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x004b:
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x006f
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x0059
            X.4iU r0 = new X.4iU
            r0.<init>(r5, r2)
            return r0
        L_0x0059:
            java.lang.String r1 = r7.A00
            X.4T2 r0 = r4.A00
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r0.A00
        L_0x0061:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x006f
        L_0x0067:
            X.4iU r0 = new X.4iU
            r0.<init>(r3, r2)
            return r0
        L_0x006d:
            r0 = 0
            goto L_0x0061
        L_0x006f:
            int r1 = r6.ordinal()
            if (r1 == r5) goto L_0x008a
            r0 = 2
            if (r1 == r0) goto L_0x0082
            if (r1 != r3) goto L_0x0085
            X.4T2 r0 = r4.A00
            if (r0 == 0) goto L_0x008a
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x008a
        L_0x0082:
            X.4iV r0 = X.C93144iV.A00
            return r0
        L_0x0085:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x008a:
            X.4iT r0 = new X.4iT
            r0.<init>(r2)
            return r0
        L_0x0090:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.areffects.state.CallArEffectsStateHolder$action$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
