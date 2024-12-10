package com.whatsapp.calling.banner.viewmodel;

import X.A99;
import X.AnonymousClass000;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import X.C93634jI;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel$uiState$2", f = "MinimizedCallBannerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MinimizedCallBannerViewModel$uiState$2 extends C30431dv implements C36001nB {
    public int label;
    public final /* synthetic */ MinimizedCallBannerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MinimizedCallBannerViewModel$uiState$2(MinimizedCallBannerViewModel minimizedCallBannerViewModel, C30391dr r3) {
        super(3, r3);
        this.this$0 = minimizedCallBannerViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new MinimizedCallBannerViewModel$uiState$2(this.this$0, (C30391dr) obj3).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C93634jI.A00(MinimizedCallBannerUseCase.A00(this.this$0.A04), (A99) null);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
