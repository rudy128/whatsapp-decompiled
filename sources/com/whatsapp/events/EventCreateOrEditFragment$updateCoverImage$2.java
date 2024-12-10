package com.whatsapp.events;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C86784Tb;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditFragment$updateCoverImage$2", f = "EventCreateOrEditFragment.kt", i = {}, l = {465, 468}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreateOrEditFragment$updateCoverImage$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C86784Tb $state;
    public int label;
    public final /* synthetic */ EventCreateOrEditFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreateOrEditFragment$updateCoverImage$2(EventCreateOrEditFragment eventCreateOrEditFragment, C86784Tb r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = eventCreateOrEditFragment;
        this.$state = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new EventCreateOrEditFragment$updateCoverImage$2(this.this$0, this.$state, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 0
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0013
            if (r0 == r3) goto L_0x002c
            if (r0 != r4) goto L_0x0047
            X.C30691eM.A01(r8)
        L_0x0010:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0013:
            X.C30691eM.A01(r8)
            com.whatsapp.events.EventCreateOrEditFragment r0 = r7.this$0
            X.0wl r2 = r0.A0i
            if (r2 == 0) goto L_0x0050
            X.4Tb r1 = r7.$state
            com.whatsapp.events.EventCreateOrEditFragment$updateCoverImage$2$bitmap$1 r0 = new com.whatsapp.events.EventCreateOrEditFragment$updateCoverImage$2$bitmap$1
            r0.<init>(r1, r5)
            r7.label = r3
            java.lang.Object r8 = X.C30451dy.A00(r7, r2, r0)
            if (r8 != r6) goto L_0x002f
            return r6
        L_0x002c:
            X.C30691eM.A01(r8)
        L_0x002f:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 == 0) goto L_0x0010
            com.whatsapp.events.EventCreateOrEditFragment r2 = r7.this$0
            X.0wl r1 = r2.A0j
            if (r1 == 0) goto L_0x004c
            com.whatsapp.events.EventCreateOrEditFragment$updateCoverImage$2$1 r0 = new com.whatsapp.events.EventCreateOrEditFragment$updateCoverImage$2$1
            r0.<init>(r8, r2, r5)
            r7.label = r4
            java.lang.Object r0 = X.C30451dy.A00(r7, r1, r0)
            if (r0 != r6) goto L_0x0010
            return r6
        L_0x0047:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x004c:
            X.AnonymousClass3MW.A1L()
            throw r5
        L_0x0050:
            X.AnonymousClass3MW.A1K()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.events.EventCreateOrEditFragment$updateCoverImage$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventCreateOrEditFragment$updateCoverImage$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
