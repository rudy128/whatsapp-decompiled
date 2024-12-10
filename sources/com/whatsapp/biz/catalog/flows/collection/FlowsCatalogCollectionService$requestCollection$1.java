package com.whatsapp.biz.catalog.flows.collection;

import X.A5Q;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass9M2;
import X.BAH;
import X.C168408io;
import X.C168418ip;
import X.C187179fO;
import X.C195689tk;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.flows.collection.FlowsCatalogCollectionService$requestCollection$1", f = "FlowsCatalogCollectionService.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsCatalogCollectionService$requestCollection$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C195689tk $collectionRequest;
    public final /* synthetic */ BAH $extensionsListener;
    public final /* synthetic */ Object $extensionsRequest;
    public int label;
    public final /* synthetic */ C187179fO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsCatalogCollectionService$requestCollection$1(C187179fO r2, BAH bah, C195689tk r4, Object obj, C30391dr r6) {
        super(2, r6);
        this.this$0 = r2;
        this.$collectionRequest = r4;
        this.$extensionsListener = bah;
        this.$extensionsRequest = obj;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new FlowsCatalogCollectionService$requestCollection$1(this.this$0, this.$extensionsListener, this.$collectionRequest, this.$extensionsRequest, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C195689tk r0 = this.$collectionRequest;
            this.label = 1;
            obj = ((A5Q) this.this$0.A01.get()).A02(r0, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass9M2 r5 = (AnonymousClass9M2) obj;
        if (r5 instanceof C168418ip) {
            this.$extensionsListener.C7i(((C168418ip) r5).A01);
        } else if (r5 instanceof C168408io) {
            this.$extensionsListener.Btw();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsCatalogCollectionService$requestCollection$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
