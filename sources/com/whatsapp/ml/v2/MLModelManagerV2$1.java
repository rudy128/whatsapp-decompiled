package com.whatsapp.ml.v2;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass8Ak;
import X.C122716Rq;
import X.C131606lN;
import X.C1407873b;
import X.C19810z2;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C88604aC;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.MLModelManagerV2$1", f = "MLModelManagerV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MLModelManagerV2$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C1407873b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelManagerV2$1(C1407873b r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        MLModelManagerV2$1 mLModelManagerV2$1 = new MLModelManagerV2$1(this.this$0, r4);
        mLModelManagerV2$1.L$0 = obj;
        return mLModelManagerV2$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1OX r3 = (AnonymousClass1OX) this.L$0;
            C19810z2<C122716Rq> r2 = C122716Rq.A00;
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                it.next();
            }
            C131606lN r5 = this.this$0.A01;
            ArrayList A0D = C29351c6.A0D(r2);
            for (C122716Rq A00 : r2) {
                A0D.add(r5.A00(A00, false));
            }
            C1407873b r6 = this.this$0;
            ArrayList<AnonymousClass8Ak> A13 = AnonymousClass000.A13();
            for (Object next : A0D) {
                AnonymousClass8Ak r1 = (AnonymousClass8Ak) next;
                if (r1.isEnabled() && !r6.A08(r1.BV1().A02)) {
                    A13.add(next);
                }
            }
            Iterator it2 = A13.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            C1407873b r22 = this.this$0;
            for (AnonymousClass8Ak BV1 : A13) {
                C88604aC.A03(r3, r22.A05(BV1.BV1().A02));
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MLModelManagerV2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
