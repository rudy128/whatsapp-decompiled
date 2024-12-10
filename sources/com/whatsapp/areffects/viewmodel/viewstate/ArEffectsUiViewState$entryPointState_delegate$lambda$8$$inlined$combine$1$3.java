package com.whatsapp.areffects.viewmodel.viewstate;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass4VF;
import X.C106575Wj;
import X.C108335bX;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C36001nB;
import X.C87144Ul;
import X.C92724hn;
import X.C92734ho;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.viewstate.ArEffectsUiViewState$entryPointState_delegate$lambda$8$$inlined$combine$1$3", f = "ArEffectsUiViewState.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsUiViewState$entryPointState_delegate$lambda$8$$inlined$combine$1$3 extends C30431dv implements C36001nB {
    public final /* synthetic */ C87144Ul $buttonHeaderConfiguration$inlined;
    public final /* synthetic */ AnonymousClass4VF $trayCollectionConfiguration$inlined;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsUiViewState$entryPointState_delegate$lambda$8$$inlined$combine$1$3(C87144Ul r2, AnonymousClass4VF r3, C30391dr r4) {
        super(3, r4);
        this.$trayCollectionConfiguration$inlined = r3;
        this.$buttonHeaderConfiguration$inlined = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass4VF r2 = this.$trayCollectionConfiguration$inlined;
        ArEffectsUiViewState$entryPointState_delegate$lambda$8$$inlined$combine$1$3 arEffectsUiViewState$entryPointState_delegate$lambda$8$$inlined$combine$1$3 = new ArEffectsUiViewState$entryPointState_delegate$lambda$8$$inlined$combine$1$3(this.$buttonHeaderConfiguration$inlined, r2, (C30391dr) obj3);
        arEffectsUiViewState$entryPointState_delegate$lambda$8$$inlined$combine$1$3.L$0 = obj;
        arEffectsUiViewState$entryPointState_delegate$lambda$8$$inlined$combine$1$3.L$1 = obj2;
        return arEffectsUiViewState$entryPointState_delegate$lambda$8$$inlined$combine$1$3.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object r0;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G2 r4 = (AnonymousClass1G2) this.L$0;
            C106575Wj[] r7 = (C106575Wj[]) ((Object[]) this.L$1);
            if (!this.$trayCollectionConfiguration$inlined.A05.isEmpty() || !this.$buttonHeaderConfiguration$inlined.A04.isEmpty()) {
                int length = r7.length;
                boolean z = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (r7[i2] instanceof C108335bX) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                r0 = new C92734ho(z);
            } else {
                r0 = C92724hn.A00;
            }
            this.label = 1;
            if (r4.BJt(r0, this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
