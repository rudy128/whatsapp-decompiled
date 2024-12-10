package com.whatsapp.calling.incallnotifbanner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass20H;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$viewState$1", f = "InCallBannerViewModelV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class InCallBannerViewModelV2$viewState$1 extends C30431dv implements AnonymousClass20H {
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public /* synthetic */ boolean Z$2;
    public int label;

    public InCallBannerViewModelV2$viewState$1(C30391dr r2) {
        super(5, r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r0 == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r3 = r20
            int r0 = r3.label
            if (r0 != 0) goto L_0x0048
            X.C30691eM.A01(r21)
            boolean r2 = r3.Z$0
            boolean r1 = r3.Z$1
            boolean r0 = r3.Z$2
            java.lang.Object r3 = r3.L$0
            X.7C7 r3 = (X.AnonymousClass7C7) r3
            r4 = 0
            if (r2 != 0) goto L_0x0047
            if (r3 == 0) goto L_0x0047
            if (r1 != 0) goto L_0x001e
            r19 = 0
            if (r0 != 0) goto L_0x0020
        L_0x001e:
            r19 = 1
        L_0x0020:
            X.6Rd r7 = r3.A04
            X.4ZN r9 = r3.A09
            X.4ZN r10 = r3.A08
            java.util.List r14 = r3.A0B
            X.5Zi r8 = r3.A05
            int r15 = r3.A00
            android.widget.ImageView$ScaleType r6 = r3.A03
            boolean r2 = r3.A0F
            boolean r1 = r3.A0G
            boolean r0 = r3.A0C
            X.4ZN r11 = r3.A06
            X.4ZN r12 = r3.A07
            android.view.View$OnClickListener r5 = r3.A02
            java.lang.Long r13 = r3.A0A
            X.7C7 r4 = new X.7C7
            r16 = r2
            r17 = r1
            r18 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0047:
            return r4
        L_0x0048:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$viewState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean A1Y = AnonymousClass000.A1Y(obj);
        boolean A1Y2 = AnonymousClass000.A1Y(obj2);
        boolean A1Y3 = AnonymousClass000.A1Y(obj3);
        InCallBannerViewModelV2$viewState$1 inCallBannerViewModelV2$viewState$1 = new InCallBannerViewModelV2$viewState$1((C30391dr) obj5);
        inCallBannerViewModelV2$viewState$1.Z$0 = A1Y;
        inCallBannerViewModelV2$viewState$1.Z$1 = A1Y2;
        inCallBannerViewModelV2$viewState$1.Z$2 = A1Y3;
        inCallBannerViewModelV2$viewState$1.L$0 = obj4;
        return inCallBannerViewModelV2$viewState$1.invokeSuspend(C27621Wu.A00);
    }
}
