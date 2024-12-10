package com.whatsapp.calling.banner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass20G;
import X.AnonymousClass4Ck;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C86534Sa;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel$viewState$1", f = "MinimizedCallBannerViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
public final class MinimizedCallBannerViewModel$viewState$1 extends C30431dv implements AnonymousClass20G {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ MinimizedCallBannerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MinimizedCallBannerViewModel$viewState$1(MinimizedCallBannerViewModel minimizedCallBannerViewModel, C30391dr r3) {
        super(4, r3);
        this.this$0 = minimizedCallBannerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Object obj2 = this.L$0;
            boolean z = this.Z$0;
            MinimizedCallBannerUseCase minimizedCallBannerUseCase = (MinimizedCallBannerUseCase) this.this$0.A04.get();
            boolean A1Z = AnonymousClass000.A1Z(obj2, AnonymousClass4Ck.ActionMode);
            boolean A1Z2 = AnonymousClass000.A1Z(obj2, AnonymousClass4Ck.VoiceChatUi);
            this.L$0 = null;
            this.label = 1;
            obj = minimizedCallBannerUseCase.A01((C86534Sa) this.L$1, this, A1Z, A1Z2, z);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1Y = AnonymousClass000.A1Y(obj2);
        MinimizedCallBannerViewModel$viewState$1 minimizedCallBannerViewModel$viewState$1 = new MinimizedCallBannerViewModel$viewState$1(this.this$0, (C30391dr) obj4);
        minimizedCallBannerViewModel$viewState$1.L$0 = obj;
        minimizedCallBannerViewModel$viewState$1.Z$0 = A1Y;
        minimizedCallBannerViewModel$viewState$1.L$1 = obj3;
        return minimizedCallBannerViewModel$viewState$1.invokeSuspend(C27621Wu.A00);
    }
}
