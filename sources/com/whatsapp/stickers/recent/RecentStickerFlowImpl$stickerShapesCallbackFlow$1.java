package com.whatsapp.stickers.recent;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass4W9;
import X.AnonymousClass7GJ;
import X.AnonymousClass7vW;
import X.C108475bl;
import X.C131016kN;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C72453Mb;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.recent.RecentStickerFlowImpl$stickerShapesCallbackFlow$1", f = "RecentStickerFlowImpl.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
public final class RecentStickerFlowImpl$stickerShapesCallbackFlow$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass00H $recentShapesEventObservers;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C131016kN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentStickerFlowImpl$stickerShapesCallbackFlow$1(C131016kN r2, AnonymousClass00H r3, C30391dr r4) {
        super(2, r4);
        this.$recentShapesEventObservers = r3;
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        RecentStickerFlowImpl$stickerShapesCallbackFlow$1 recentStickerFlowImpl$stickerShapesCallbackFlow$1 = new RecentStickerFlowImpl$stickerShapesCallbackFlow$1(this.this$0, this.$recentShapesEventObservers, r5);
        recentStickerFlowImpl$stickerShapesCallbackFlow$1.L$0 = obj;
        return recentStickerFlowImpl$stickerShapesCallbackFlow$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108475bl r5 = (C108475bl) this.L$0;
            AnonymousClass7GJ r4 = new AnonymousClass7GJ(this.this$0, r5, 1);
            C72453Mb.A1Q(this.$recentShapesEventObservers, r4);
            C131016kN r3 = this.this$0;
            AnonymousClass3MW.A1X(r3.A04, new RecentStickerFlowImpl$updateShapeStickerList$1(r3, (C30391dr) null, r5), r5);
            AnonymousClass7vW r0 = new AnonymousClass7vW(r4, this.$recentShapesEventObservers);
            this.label = 1;
            if (AnonymousClass4W9.A00(this, r0, r5) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RecentStickerFlowImpl$stickerShapesCallbackFlow$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
