package com.whatsapp.areffects.viewmodel.viewstate;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.C106575Wj;
import X.C108335bX;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.viewstate.ArEffectsButtonHeaderViewState$isRemoveAllEffectsButtonEnabled_delegate$lambda$3$$inlined$combine$1$3", f = "ArEffectsButtonHeaderViewState.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsButtonHeaderViewState$isRemoveAllEffectsButtonEnabled_delegate$lambda$3$$inlined$combine$1$3 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public ArEffectsButtonHeaderViewState$isRemoveAllEffectsButtonEnabled_delegate$lambda$3$$inlined$combine$1$3(C30391dr r2) {
        super(3, r2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ArEffectsButtonHeaderViewState$isRemoveAllEffectsButtonEnabled_delegate$lambda$3$$inlined$combine$1$3 arEffectsButtonHeaderViewState$isRemoveAllEffectsButtonEnabled_delegate$lambda$3$$inlined$combine$1$3 = new ArEffectsButtonHeaderViewState$isRemoveAllEffectsButtonEnabled_delegate$lambda$3$$inlined$combine$1$3((C30391dr) obj3);
        arEffectsButtonHeaderViewState$isRemoveAllEffectsButtonEnabled_delegate$lambda$3$$inlined$combine$1$3.L$0 = obj;
        arEffectsButtonHeaderViewState$isRemoveAllEffectsButtonEnabled_delegate$lambda$3$$inlined$combine$1$3.L$1 = obj2;
        return arEffectsButtonHeaderViewState$isRemoveAllEffectsButtonEnabled_delegate$lambda$3$$inlined$combine$1$3.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G2 r5 = (AnonymousClass1G2) this.L$0;
            C106575Wj[] r4 = (C106575Wj[]) ((Object[]) this.L$1);
            int length = r4.length;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (r4[i2] instanceof C108335bX) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            Boolean valueOf = Boolean.valueOf(z);
            this.label = 1;
            if (r5.BJt(valueOf, this) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
