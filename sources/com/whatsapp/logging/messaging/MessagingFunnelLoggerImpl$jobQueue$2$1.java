package com.whatsapp.logging.messaging;

import X.AnonymousClass1OS;
import X.C108485bm;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.logging.messaging.MessagingFunnelLoggerImpl$jobQueue$2$1", f = "MessagingFunnelLoggerImpl.kt", i = {}, l = {65, 66}, m = "invokeSuspend", n = {}, s = {})
public final class MessagingFunnelLoggerImpl$jobQueue$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C108485bm $channel;
    public Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessagingFunnelLoggerImpl$jobQueue$2$1(C30391dr r2, C108485bm r3) {
        super(2, r2);
        this.$channel = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MessagingFunnelLoggerImpl$jobQueue$2$1(r4, this.$channel);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MessagingFunnelLoggerImpl$jobQueue$2$1((C30391dr) obj2, this.$channel).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x001e
            if (r0 != r3) goto L_0x0046
            java.lang.Object r1 = r5.L$0
            X.DXm r1 = (X.C27177DXm) r1
            X.C30691eM.A01(r6)
        L_0x0013:
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r6 = r1.A01(r5)
            if (r6 != r4) goto L_0x0025
            return r4
        L_0x001e:
            java.lang.Object r1 = r5.L$0
            X.DXm r1 = (X.C27177DXm) r1
            X.C30691eM.A01(r6)
        L_0x0025:
            boolean r0 = X.AnonymousClass000.A1Y(r6)
            if (r0 == 0) goto L_0x004b
            java.lang.Object r0 = r1.A00()
            X.1OB r0 = (X.AnonymousClass1OB) r0
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r0 = r0.BhB(r5)
            if (r0 != r4) goto L_0x0013
            return r4
        L_0x003c:
            X.C30691eM.A01(r6)
            X.5bm r0 = r5.$channel
            X.DXm r1 = r0.Bh9()
            goto L_0x0013
        L_0x0046:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x004b:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.logging.messaging.MessagingFunnelLoggerImpl$jobQueue$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
