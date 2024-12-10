package com.whatsapp.areffects.viewmodel.viewstate;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass4DE;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C85624Oc;
import X.C86754Sx;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.viewstate.ArEffectsTrayCollectionViewState$3", f = "ArEffectsTrayCollectionViewState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsTrayCollectionViewState$3 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C85624Oc this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsTrayCollectionViewState$3(C85624Oc r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        ArEffectsTrayCollectionViewState$3 arEffectsTrayCollectionViewState$3 = new ArEffectsTrayCollectionViewState$3(this.this$0, r4);
        arEffectsTrayCollectionViewState$3.L$0 = obj;
        return arEffectsTrayCollectionViewState$3;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass4DE r3 = (AnonymousClass4DE) this.L$0;
            if (r3 != null) {
                AnonymousClass3MW.A17(this.this$0.A02).setValue(new C86754Sx(r3, true));
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArEffectsTrayCollectionViewState$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
