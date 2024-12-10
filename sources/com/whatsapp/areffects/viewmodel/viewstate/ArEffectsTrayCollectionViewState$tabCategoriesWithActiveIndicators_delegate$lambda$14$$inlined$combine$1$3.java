package com.whatsapp.areffects.viewmodel.viewstate;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1G2;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C36001nB;
import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.viewstate.ArEffectsTrayCollectionViewState$tabCategoriesWithActiveIndicators_delegate$lambda$14$$inlined$combine$1$3", f = "ArEffectsTrayCollectionViewState.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsTrayCollectionViewState$tabCategoriesWithActiveIndicators_delegate$lambda$14$$inlined$combine$1$3 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public ArEffectsTrayCollectionViewState$tabCategoriesWithActiveIndicators_delegate$lambda$14$$inlined$combine$1$3(C30391dr r2) {
        super(3, r2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ArEffectsTrayCollectionViewState$tabCategoriesWithActiveIndicators_delegate$lambda$14$$inlined$combine$1$3 arEffectsTrayCollectionViewState$tabCategoriesWithActiveIndicators_delegate$lambda$14$$inlined$combine$1$3 = new ArEffectsTrayCollectionViewState$tabCategoriesWithActiveIndicators_delegate$lambda$14$$inlined$combine$1$3((C30391dr) obj3);
        arEffectsTrayCollectionViewState$tabCategoriesWithActiveIndicators_delegate$lambda$14$$inlined$combine$1$3.L$0 = obj;
        arEffectsTrayCollectionViewState$tabCategoriesWithActiveIndicators_delegate$lambda$14$$inlined$combine$1$3.L$1 = obj2;
        return arEffectsTrayCollectionViewState$tabCategoriesWithActiveIndicators_delegate$lambda$14$$inlined$combine$1$3.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G2 r5 = (AnonymousClass1G2) this.L$0;
            AnonymousClass1D6[] r8 = (AnonymousClass1D6[]) ((Object[]) this.L$1);
            ArrayList<AnonymousClass1D6> A13 = AnonymousClass000.A13();
            for (AnonymousClass1D6 r1 : r8) {
                if (AnonymousClass000.A1Y(r1.second)) {
                    A13.add(r1);
                }
            }
            ArrayList A0D = C29351c6.A0D(A13);
            for (AnonymousClass1D6 r0 : A13) {
                A0D.add(r0.first);
            }
            Set A12 = C29431cG.A12(A0D);
            this.label = 1;
            if (r5.BJt(A12, this) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
