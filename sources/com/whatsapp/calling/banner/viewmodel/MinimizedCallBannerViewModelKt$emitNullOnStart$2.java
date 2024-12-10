package com.whatsapp.calling.banner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModelKt$emitNullOnStart$2", f = "MinimizedCallBannerViewModel.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
public final class MinimizedCallBannerViewModelKt$emitNullOnStart$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;

    public MinimizedCallBannerViewModelKt$emitNullOnStart$2(C30391dr r2) {
        super(2, r2);
    }

    public final C30391dr create(Object obj, C30391dr r3) {
        MinimizedCallBannerViewModelKt$emitNullOnStart$2 minimizedCallBannerViewModelKt$emitNullOnStart$2 = new MinimizedCallBannerViewModelKt$emitNullOnStart$2(r3);
        minimizedCallBannerViewModelKt$emitNullOnStart$2.L$0 = obj;
        return minimizedCallBannerViewModelKt$emitNullOnStart$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        MinimizedCallBannerViewModelKt$emitNullOnStart$2 minimizedCallBannerViewModelKt$emitNullOnStart$2 = new MinimizedCallBannerViewModelKt$emitNullOnStart$2((C30391dr) obj2);
        minimizedCallBannerViewModelKt$emitNullOnStart$2.L$0 = obj;
        return minimizedCallBannerViewModelKt$emitNullOnStart$2.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.label = 1;
            if (((AnonymousClass1G2) this.L$0).BJt((Object) null, this) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
