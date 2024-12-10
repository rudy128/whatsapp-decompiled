package com.whatsapp.ml.v2;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass1OS;
import X.AnonymousClass6TT;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.MLModelManagerV2$getFlow$1$4", f = "MLModelManagerV2.kt", i = {}, l = {307}, m = "invokeSuspend", n = {}, s = {})
public final class MLModelManagerV2$getFlow$1$4 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass6TT $latestStatus;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelManagerV2$getFlow$1$4(AnonymousClass6TT r2, C30391dr r3) {
        super(2, r3);
        this.$latestStatus = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        MLModelManagerV2$getFlow$1$4 mLModelManagerV2$getFlow$1$4 = new MLModelManagerV2$getFlow$1$4(this.$latestStatus, r4);
        mLModelManagerV2$getFlow$1$4.L$0 = obj;
        return mLModelManagerV2$getFlow$1$4;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass6TT r0 = this.$latestStatus;
            this.label = 1;
            if (((AnonymousClass1G2) this.L$0).BJt(r0, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MLModelManagerV2$getFlow$1$4) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
