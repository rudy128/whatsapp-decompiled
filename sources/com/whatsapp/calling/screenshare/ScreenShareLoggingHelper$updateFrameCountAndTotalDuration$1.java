package com.whatsapp.calling.screenshare;

import X.A1P;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.screenshare.ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1", f = "ScreenShareLoggingHelper.kt", i = {}, l = {266, 267}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ A1P this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1(A1P a1p, C30391dr r3) {
        super(2, r3);
        this.this$0 = a1p;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r6.label
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0012
            if (r1 == r0) goto L_0x0020
            if (r1 != r4) goto L_0x0036
            X.C30691eM.A01(r7)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r7)
            r6.label = r0
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = X.C62882s9.A00(r6, r0)
            if (r0 != r5) goto L_0x0023
            return r5
        L_0x0020:
            X.C30691eM.A01(r7)
        L_0x0023:
            X.A1P r3 = r6.this$0
            X.0wl r2 = r3.A0S
            r1 = 0
            com.whatsapp.calling.screenshare.ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1$1 r0 = new com.whatsapp.calling.screenshare.ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1$1
            r0.<init>(r1)
            r6.label = r4
            java.lang.Object r0 = X.C30451dy.A00(r6, r2, r0)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x0036:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.screenshare.ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
