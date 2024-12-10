package com.whatsapp.events;

import X.AnonymousClass1OS;
import X.AnonymousClass3R3;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C445823z;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventDetailsView$setUpCoverImage$1", f = "EventDetailsView.kt", i = {0}, l = {110, 112}, m = "invokeSuspend", n = {"coverBitmap"}, s = {"L$0"})
public final class EventDetailsView$setUpCoverImage$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C445823z $message;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AnonymousClass3R3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventDetailsView$setUpCoverImage$1(C445823z r2, AnonymousClass3R3 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$message = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new EventDetailsView$setUpCoverImage$1(this.$message, this.this$0, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0094, code lost:
        if (X.C30451dy.A00(r9, r2, r0) != r5) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r6 = 2
            r7 = 1
            r4 = 0
            if (r0 == 0) goto L_0x001f
            if (r0 == r7) goto L_0x0013
            if (r0 != r6) goto L_0x0099
            X.C30691eM.A01(r10)
        L_0x0010:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0013:
            java.lang.Object r3 = r9.L$1
            X.4rF r3 = (X.C98494rF) r3
            java.lang.Object r0 = r9.L$0
            X.4rF r0 = (X.C98494rF) r0
            X.C30691eM.A01(r10)
            goto L_0x007a
        L_0x001f:
            X.C30691eM.A01(r10)
            X.3R3 r0 = r9.this$0
            X.1Qe r3 = r0.getFMessageLazyManager()
            X.25F[] r2 = new X.AnonymousClass25F[r7]
            X.23z r0 = r9.$message
            X.25F r1 = r0.A09
            r0 = 0
            r2[r0] = r1
            r3.A0A(r2)
            X.23z r0 = r9.$message
            X.21d r0 = r0.A17()
            if (r0 == 0) goto L_0x0097
            X.2rc r0 = r0.A02
            if (r0 == 0) goto L_0x0097
            java.io.File r8 = r0.A0G
        L_0x0042:
            X.4rF r3 = X.C98494rF.A00()
            if (r8 == 0) goto L_0x007d
            X.3R3 r0 = r9.this$0
            X.2il r0 = r0.getEventMessageUtils()
            X.0ve r2 = r0.A01
            r0 = 8783(0x224f, float:1.2308E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x007d
            r0 = 8792(0x2258, float:1.232E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x007d
            X.3R3 r0 = r9.this$0
            X.0wl r1 = r0.getIoDispatcher()
            com.whatsapp.events.EventDetailsView$setUpCoverImage$1$1 r0 = new com.whatsapp.events.EventDetailsView$setUpCoverImage$1$1
            r0.<init>(r8, r4)
            r9.L$0 = r3
            r9.L$1 = r3
            r9.label = r7
            java.lang.Object r10 = X.C30451dy.A00(r9, r1, r0)
            if (r10 == r5) goto L_0x0096
            r0 = r3
        L_0x007a:
            r3.element = r10
            r3 = r0
        L_0x007d:
            X.3R3 r0 = r9.this$0
            X.0wl r2 = r0.getMainDispatcher()
            X.3R3 r1 = r9.this$0
            com.whatsapp.events.EventDetailsView$setUpCoverImage$1$2 r0 = new com.whatsapp.events.EventDetailsView$setUpCoverImage$1$2
            r0.<init>(r1, r4, r3)
            r9.L$0 = r4
            r9.L$1 = r4
            r9.label = r6
            java.lang.Object r0 = X.C30451dy.A00(r9, r2, r0)
            if (r0 != r5) goto L_0x0010
        L_0x0096:
            return r5
        L_0x0097:
            r8 = r4
            goto L_0x0042
        L_0x0099:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.events.EventDetailsView$setUpCoverImage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventDetailsView$setUpCoverImage$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
