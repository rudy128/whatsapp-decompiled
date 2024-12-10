package com.whatsapp.ml.v2;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108945cZ;
import X.C122716Rq;
import X.C17890vO;
import X.C17930vS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C64062u9;
import java.io.File;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.MLModelUtilV2$deleteDirectory$2", f = "MLModelUtilV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MLModelUtilV2$deleteDirectory$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122716Rq $feature;
    public int label;
    public final /* synthetic */ MLModelUtilV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelUtilV2$deleteDirectory$2(C122716Rq r2, MLModelUtilV2 mLModelUtilV2, C30391dr r4) {
        super(2, r4);
        this.this$0 = mLModelUtilV2;
        this.$feature = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MLModelUtilV2$deleteDirectory$2(this.$feature, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            MLModelUtilV2 mLModelUtilV2 = this.this$0;
            C122716Rq r2 = this.$feature;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(((C17930vS) mLModelUtilV2.A01.get()).A01().getCanonicalPath());
            A10.append("/ML_MODEL/");
            A10.append(r2);
            File A17 = C108945cZ.A17(C17890vO.A0c(A10, '/'));
            if (A17.exists()) {
                C64062u9.A0K(A17, (Set) null);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MLModelUtilV2$deleteDirectory$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
