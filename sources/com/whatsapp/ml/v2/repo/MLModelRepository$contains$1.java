package com.whatsapp.ml.v2.repo;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass708;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.repo.MLModelRepository$contains$1", f = "MLModelRepository.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
public final class MLModelRepository$contains$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass708 $model;
    public int label;
    public final /* synthetic */ MLModelRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelRepository$contains$1(AnonymousClass708 r2, MLModelRepository mLModelRepository, C30391dr r4) {
        super(2, r4);
        this.this$0 = mLModelRepository;
        this.$model = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MLModelRepository$contains$1(this.$model, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            MLModelRepository mLModelRepository = this.this$0;
            AnonymousClass708 r0 = this.$model;
            this.label = 1;
            if (mLModelRepository.A02(r0, this) == r3) {
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
        return ((MLModelRepository$contains$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
