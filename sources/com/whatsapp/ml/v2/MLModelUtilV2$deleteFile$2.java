package com.whatsapp.ml.v2;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass708;
import X.C108945cZ;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C64062u9;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.MLModelUtilV2$deleteFile$2", f = "MLModelUtilV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MLModelUtilV2$deleteFile$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass708 $model;
    public int label;
    public final /* synthetic */ MLModelUtilV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelUtilV2$deleteFile$2(MLModelUtilV2 mLModelUtilV2, AnonymousClass708 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = mLModelUtilV2;
        this.$model = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MLModelUtilV2$deleteFile$2(this.this$0, this.$model, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return Boolean.valueOf(C64062u9.A0Q(C108945cZ.A17(this.this$0.A03(this.$model))));
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MLModelUtilV2$deleteFile$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
