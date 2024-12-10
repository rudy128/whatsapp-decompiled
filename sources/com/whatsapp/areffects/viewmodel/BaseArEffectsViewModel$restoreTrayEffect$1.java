package com.whatsapp.areffects.viewmodel;

import X.AnonymousClass1OS;
import X.AnonymousClass4S8;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C89504cZ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$restoreTrayEffect$1", f = "BaseArEffectsViewModel.kt", i = {}, l = {657}, m = "invokeSuspend", n = {}, s = {})
public final class BaseArEffectsViewModel$restoreTrayEffect$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C89504cZ $savedState;
    public final /* synthetic */ AnonymousClass4S8 $trayViewState;
    public int label;
    public final /* synthetic */ BaseArEffectsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseArEffectsViewModel$restoreTrayEffect$1(BaseArEffectsViewModel baseArEffectsViewModel, C89504cZ r3, AnonymousClass4S8 r4, C30391dr r5) {
        super(2, r5);
        this.$trayViewState = r4;
        this.$savedState = r3;
        this.this$0 = baseArEffectsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        AnonymousClass4S8 r3 = this.$trayViewState;
        return new BaseArEffectsViewModel$restoreTrayEffect$1(this.this$0, this.$savedState, r3, r6);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.4hH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.4hH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: X.4hH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.4hH} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r10.label
            r5 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r2) goto L_0x00a1
            X.C30691eM.A01(r11)
        L_0x000d:
            X.4S8 r0 = r10.$trayViewState
            X.1G4 r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x001f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C92424hH
            if (r0 == 0) goto L_0x001f
            r3.add(r1)
            goto L_0x001f
        L_0x0031:
            X.C30691eM.A01(r11)
            X.4S8 r0 = r10.$trayViewState
            X.1G4 r1 = r0.A03
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$restoreTrayEffect$1$1 r0 = new com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$restoreTrayEffect$1$1
            r0.<init>(r5)
            r10.label = r2
            java.lang.Object r0 = X.C26067Crh.A00(r10, r0, r1)
            if (r0 != r3) goto L_0x000d
            return r3
        L_0x0046:
            X.4cZ r4 = r10.$savedState
            java.util.Iterator r3 = r3.iterator()
        L_0x004c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.4hH r0 = (X.C92424hH) r0
            X.5aj r0 = r0.A00
            X.5cD r0 = r0.BUq()
            X.4cF r1 = r0.BSi()
            X.4cF r0 = r4.A01
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x004c
            r5 = r2
        L_0x006c:
            X.4hH r5 = (X.C92424hH) r5
            if (r5 == 0) goto L_0x0090
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r3 = r10.this$0
            X.4cZ r1 = r10.$savedState
            X.4DE r0 = r1.A00
            X.5aj r5 = r5.A00
            boolean r0 = r3.A0k(r0, r5)
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = "BaseArEffectsViewModel/restoreTrayEffect Restoring directly"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4DE r4 = r1.A00
            java.lang.Float r6 = r1.A02
            r8 = 0
            java.lang.String r7 = r3.A0Y()
            r9 = r8
            r3.A0g(r4, r5, r6, r7, r8, r9)
        L_0x0090:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0093:
            java.lang.String r0 = "BaseArEffectsViewModel/restoreTrayEffect Restoring as suspended"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4DE r2 = r1.A00
            java.lang.Float r1 = r1.A02
            r0 = 0
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel.A03(r2, r5, r3, r1, r0)
            goto L_0x0090
        L_0x00a1:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$restoreTrayEffect$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BaseArEffectsViewModel$restoreTrayEffect$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
