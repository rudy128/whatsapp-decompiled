package com.whatsapp.ml.v2;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6TT;
import X.AnonymousClass708;
import X.C137336vI;
import X.C1407873b;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.ml.v2.repo.MLModelRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.MLModelManagerV2$getFlow$1$3", f = "MLModelManagerV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MLModelManagerV2$getFlow$1$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass708 $mlModel;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C1407873b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelManagerV2$getFlow$1$3(C1407873b r2, AnonymousClass708 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$mlModel = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        MLModelManagerV2$getFlow$1$3 mLModelManagerV2$getFlow$1$3 = new MLModelManagerV2$getFlow$1$3(this.this$0, this.$mlModel, r5);
        mLModelManagerV2$getFlow$1$3.L$0 = obj;
        return mLModelManagerV2$getFlow$1$3;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            ((MLModelRepository) this.this$0.A02.get()).A04(this.$mlModel, C137336vI.A01((AnonymousClass6TT) this.L$0));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MLModelManagerV2$getFlow$1$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
