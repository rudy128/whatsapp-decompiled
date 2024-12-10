package com.whatsapp.calling.incallnotifbanner.viewmodel;

import X.AnonymousClass1OS;
import X.C136336te;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$onNetworkHealthChanged$1", f = "InCallBannerViewModelV2.kt", i = {2}, l = {468, 471, 474, 477}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240"}, s = {"L$1"})
public final class InCallBannerViewModelV2$onNetworkHealthChanged$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isVideo;
    public final /* synthetic */ C136336te $networkHealthEvent;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ InCallBannerViewModelV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InCallBannerViewModelV2$onNetworkHealthChanged$1(InCallBannerViewModelV2 inCallBannerViewModelV2, C136336te r3, C30391dr r4, boolean z) {
        super(2, r4);
        this.$networkHealthEvent = r3;
        this.this$0 = inCallBannerViewModelV2;
        this.$isVideo = z;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new InCallBannerViewModelV2$onNetworkHealthChanged$1(this.this$0, this.$networkHealthEvent, r6, this.$isVideo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r4 = 4
            r8 = 3
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0017
            if (r0 == r6) goto L_0x0086
            if (r0 == r7) goto L_0x0086
            if (r0 == r8) goto L_0x0069
            if (r0 == r4) goto L_0x0086
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0017:
            X.C30691eM.A01(r10)
            X.6te r0 = r9.$networkHealthEvent
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2 r2 = r9.this$0
            boolean r5 = r9.$isVideo
            int r1 = r0.A00
            if (r1 != r7) goto L_0x0041
            boolean r1 = r0.A06
            if (r1 == 0) goto L_0x0074
            com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue r4 = com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2.A03(r2)
            X.00H r1 = r2.A08
            java.lang.Object r1 = r1.get()
            X.6oq r1 = (X.C133486oq) r1
            X.7C7 r0 = r1.A01(r0, r5)
            r9.label = r6
        L_0x003a:
            java.lang.Object r0 = r4.A02(r0, r9)
        L_0x003e:
            if (r0 != r3) goto L_0x0089
            return r3
        L_0x0041:
            if (r1 != r6) goto L_0x005a
            boolean r1 = r0.A05
            if (r1 == 0) goto L_0x005a
            com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue r4 = com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2.A03(r2)
            X.00H r1 = r2.A08
            java.lang.Object r1 = r1.get()
            X.6oq r1 = (X.C133486oq) r1
            X.7C7 r0 = r1.A00(r0, r5)
            r9.label = r7
            goto L_0x003a
        L_0x005a:
            X.6Rd r1 = X.C122636Rd.A0D
            r9.L$0 = r2
            r9.L$1 = r0
            r9.label = r8
            java.lang.Object r1 = com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2.A04(r1, r2, r9)
            if (r1 != r3) goto L_0x0074
            return r3
        L_0x0069:
            java.lang.Object r0 = r9.L$1
            X.6te r0 = (X.C136336te) r0
            java.lang.Object r2 = r9.L$0
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2 r2 = (com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2) r2
            X.C30691eM.A01(r10)
        L_0x0074:
            int r0 = r0.A00
            if (r0 == r6) goto L_0x0089
            X.6Rd r1 = X.C122636Rd.A0B
            r0 = 0
            r9.L$0 = r0
            r9.L$1 = r0
            r9.label = r4
            java.lang.Object r0 = com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2.A04(r1, r2, r9)
            goto L_0x003e
        L_0x0086:
            X.C30691eM.A01(r10)
        L_0x0089:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$onNetworkHealthChanged$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InCallBannerViewModelV2$onNetworkHealthChanged$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
