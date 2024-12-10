package com.whatsapp.calling.banner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.C27581Wq;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel$effectiveVisibilityState$1", f = "MinimizedCallBannerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MinimizedCallBannerViewModel$effectiveVisibilityState$1 extends C30431dv implements C36001nB {
    public /* synthetic */ int I$0;
    public /* synthetic */ Object L$0;
    public int label;

    public MinimizedCallBannerViewModel$effectiveVisibilityState$1(C30391dr r2) {
        super(3, r2);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            int i = this.I$0;
            if (this.L$0 != C27581Wq.ON_RESUME) {
                i = 8;
            }
            return AnonymousClass3MW.A0v(i);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int A0M = AnonymousClass000.A0M(obj);
        MinimizedCallBannerViewModel$effectiveVisibilityState$1 minimizedCallBannerViewModel$effectiveVisibilityState$1 = new MinimizedCallBannerViewModel$effectiveVisibilityState$1((C30391dr) obj3);
        minimizedCallBannerViewModel$effectiveVisibilityState$1.I$0 = A0M;
        minimizedCallBannerViewModel$effectiveVisibilityState$1.L$0 = obj2;
        return minimizedCallBannerViewModel$effectiveVisibilityState$1.invokeSuspend(C27621Wu.A00);
    }
}
