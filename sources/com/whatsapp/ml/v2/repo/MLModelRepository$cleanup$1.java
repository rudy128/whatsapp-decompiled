package com.whatsapp.ml.v2.repo;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1YE;
import X.AnonymousClass708;
import X.AnonymousClass7x8;
import X.C122716Rq;
import X.C124426Yh;
import X.C134406qX;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C18100vl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C35901n1;
import com.whatsapp.ml.v2.MLModelUtilV2;
import com.whatsapp.ml.v2.MLModelUtilV2$deleteDirectory$2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.repo.MLModelRepository$cleanup$1", f = "MLModelRepository.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
public final class MLModelRepository$cleanup$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122716Rq $feature;
    public int label;
    public final /* synthetic */ MLModelRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelRepository$cleanup$1(C122716Rq r2, MLModelRepository mLModelRepository, C30391dr r4) {
        super(2, r4);
        this.this$0 = mLModelRepository;
        this.$feature = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MLModelRepository$cleanup$1(this.$feature, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            List<AnonymousClass708> A00 = this.this$0.A01.A00(this.$feature);
            MLModelRepository mLModelRepository = this.this$0;
            for (AnonymousClass708 A05 : A00) {
                mLModelRepository.A05(A05, AnonymousClass7x8.A00);
            }
            if (Math.max(C35901n1.A01.get(C124426Yh.A00), 0) != 0) {
                MLModelUtilV2 mLModelUtilV2 = this.this$0.A00;
                C122716Rq r3 = this.$feature;
                this.label = 1;
                if (C30451dy.A00(this, mLModelUtilV2.A03, new MLModelUtilV2$deleteDirectory$2(r3, mLModelUtilV2, (C30391dr) null)) == r5) {
                    return r5;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C134406qX r0 = this.this$0.A01;
        C122716Rq r7 = this.$feature;
        C18070vi.A0d(r7, 0);
        C18100vl r52 = r0.A00.A01;
        Set<String> keySet = C17880vN.A0C(r52).getAll().keySet();
        ArrayList A13 = AnonymousClass000.A13();
        for (String next : keySet) {
            String str = next;
            C18070vi.A0b(str);
            if (AnonymousClass1YE.A0A(str, r7.name(), false)) {
                A13.add(next);
            }
        }
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            C17880vN.A1B(C17890vO.A0A(r52), C17880vN.A0v(it));
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MLModelRepository$cleanup$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
