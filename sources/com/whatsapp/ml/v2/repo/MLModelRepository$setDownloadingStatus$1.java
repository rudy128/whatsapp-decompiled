package com.whatsapp.ml.v2.repo;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass708;
import X.C134406qX;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.repo.MLModelRepository$setDownloadingStatus$1", f = "MLModelRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MLModelRepository$setDownloadingStatus$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass708 $model;
    public final /* synthetic */ String $status;
    public int label;
    public final /* synthetic */ MLModelRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelRepository$setDownloadingStatus$1(AnonymousClass708 r2, MLModelRepository mLModelRepository, String str, C30391dr r5) {
        super(2, r5);
        this.this$0 = mLModelRepository;
        this.$model = r2;
        this.$status = str;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new MLModelRepository$setDownloadingStatus$1(this.$model, this.this$0, this.$status, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C134406qX r3 = this.this$0.A01;
            String A01 = MLModelRepository.A01(this.$model);
            String str = this.$status;
            C18070vi.A0h(A01, str);
            C17880vN.A1E(C17890vO.A0A(r3.A00.A01), A01, str);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MLModelRepository$setDownloadingStatus$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
