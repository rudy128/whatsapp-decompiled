package com.whatsapp.ml.v2.repo;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass708;
import X.C108975cc;
import X.C122716Rq;
import X.C134406qX;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C18090vk;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C35911n2;
import com.whatsapp.ml.v2.MLModelUtilV2;
import com.whatsapp.ml.v2.MLModelUtilV2$deleteFile$2;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.repo.MLModelRepository$removeModel$2", f = "MLModelRepository.kt", i = {0, 1}, l = {202, 99}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
public final class MLModelRepository$removeModel$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass708 $model;
    public final /* synthetic */ C18090vk $onDeletionComplete;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ MLModelRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelRepository$removeModel$2(AnonymousClass708 r2, MLModelRepository mLModelRepository, C30391dr r4, C18090vk r5) {
        super(2, r4);
        this.this$0 = mLModelRepository;
        this.$model = r2;
        this.$onDeletionComplete = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new MLModelRepository$removeModel$2(this.$model, this.this$0, r6, this.$onDeletionComplete);
    }

    public final Object invokeSuspend(Object obj) {
        C35911n2 r3;
        MLModelRepository mLModelRepository;
        AnonymousClass708 r6;
        C18090vk r4;
        C31751g4 r8 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            mLModelRepository = this.this$0;
            r3 = mLModelRepository.A05;
            r6 = this.$model;
            r4 = this.$onDeletionComplete;
            this.L$0 = r3;
            this.L$1 = mLModelRepository;
            this.L$2 = r6;
            this.L$3 = r4;
            this.label = 1;
            if (r3.Bhx(this) == r8) {
                return r8;
            }
        } else if (i == 1) {
            r4 = (C18090vk) this.L$3;
            r6 = (AnonymousClass708) this.L$2;
            mLModelRepository = (MLModelRepository) this.L$1;
            r3 = (C35911n2) this.L$0;
            C30691eM.A01(obj);
        } else if (i == 2) {
            r4 = (C18090vk) this.L$3;
            r6 = (AnonymousClass708) this.L$2;
            mLModelRepository = (MLModelRepository) this.L$1;
            r3 = (C35911n2) this.L$0;
            try {
                C30691eM.A01(obj);
                C134406qX r2 = mLModelRepository.A01;
                String A01 = MLModelRepository.A01(r6);
                C18070vi.A0d(A01, 0);
                C17880vN.A1B(C17890vO.A0A(r2.A00.A01), A01);
                r2.A02(MLModelUtilV2.A00(r6));
                r4.invoke();
                C27621Wu r82 = C27621Wu.A00;
                r3.CQ9((Object) null);
                return r82;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        try {
            C134406qX r9 = mLModelRepository.A01;
            C122716Rq r22 = r6.A02;
            ArrayList A0m = C29431cG.A0m(r9.A00(r22));
            if (A0m.remove(r6)) {
                r9.A01(r22, A0m);
            }
            MLModelUtilV2 mLModelUtilV2 = mLModelRepository.A00;
            if (C108975cc.A1M(mLModelUtilV2.A03(r6))) {
                this.L$0 = r3;
                this.L$1 = mLModelRepository;
                this.L$2 = r6;
                this.L$3 = r4;
                this.label = 2;
                if (C30451dy.A00(this, mLModelUtilV2.A03, new MLModelUtilV2$deleteFile$2(mLModelUtilV2, r6, (C30391dr) null)) == r8) {
                    return r8;
                }
            }
            C134406qX r23 = mLModelRepository.A01;
            String A012 = MLModelRepository.A01(r6);
            C18070vi.A0d(A012, 0);
            C17880vN.A1B(C17890vO.A0A(r23.A00.A01), A012);
            r23.A02(MLModelUtilV2.A00(r6));
            r4.invoke();
            C27621Wu r822 = C27621Wu.A00;
            r3.CQ9((Object) null);
            return r822;
        } catch (Throwable th2) {
            th = th2;
            r3.CQ9((Object) null);
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MLModelRepository$removeModel$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
