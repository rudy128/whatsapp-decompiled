package com.whatsapp.areffects.viewmodel.viewstate;

import X.AnonymousClass000;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.viewstate.ArEffectsTrayCollectionViewState$1", f = "ArEffectsTrayCollectionViewState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsTrayCollectionViewState$1 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;

    public ArEffectsTrayCollectionViewState$1(C30391dr r2) {
        super(3, r2);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            boolean z = this.Z$0;
            Object A0e = C29431cG.A0e((List) this.L$0);
            if (!(!z)) {
                return null;
            }
            return A0e;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1Y = AnonymousClass000.A1Y(obj);
        ArEffectsTrayCollectionViewState$1 arEffectsTrayCollectionViewState$1 = new ArEffectsTrayCollectionViewState$1((C30391dr) obj3);
        arEffectsTrayCollectionViewState$1.Z$0 = A1Y;
        arEffectsTrayCollectionViewState$1.L$0 = obj2;
        return arEffectsTrayCollectionViewState$1.invokeSuspend(C27621Wu.A00);
    }
}
