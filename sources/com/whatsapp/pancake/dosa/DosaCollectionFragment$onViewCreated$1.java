package com.whatsapp.pancake.dosa;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C143427Dj;
import X.C17880vN;
import X.C25681Pe;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.consent.common.CommonAgeCollector$fetchAgeCollectionStatusIfNeverFetched$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.pancake.dosa.DosaCollectionFragment$onViewCreated$1", f = "DosaCollectionFragment.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
public final class DosaCollectionFragment$onViewCreated$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ DosaCollectionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DosaCollectionFragment$onViewCreated$1(DosaCollectionFragment dosaCollectionFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = dosaCollectionFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new DosaCollectionFragment$onViewCreated$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new DosaCollectionFragment$onViewCreated$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.label = 1;
            C143427Dj r3 = ((DosaCollectionViewModel) this.this$0.A01.getValue()).A00;
            if (!C17880vN.A1W(((C25681Pe) r3.A08).A02(), "age_verification_status_fetched") && C30451dy.A00(this, r3.A0E, new CommonAgeCollector$fetchAgeCollectionStatusIfNeverFetched$2(r3, (C30391dr) null)) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
