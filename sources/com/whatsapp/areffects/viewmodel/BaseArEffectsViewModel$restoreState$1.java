package com.whatsapp.areffects.viewmodel;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$restoreState$1", f = "BaseArEffectsViewModel.kt", i = {0}, l = {629}, m = "invokeSuspend", n = {"destination$iv$iv"}, s = {"L$1"})
public final class BaseArEffectsViewModel$restoreState$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ BaseArEffectsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseArEffectsViewModel$restoreState$1(BaseArEffectsViewModel baseArEffectsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = baseArEffectsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new BaseArEffectsViewModel$restoreState$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new BaseArEffectsViewModel$restoreState$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r14.label
            r12 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 != r12) goto L_0x00ee
            java.lang.Object r4 = r14.L$2
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r3 = r14.L$1
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r2 = r14.L$0
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r2 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r2
            X.C30691eM.A01(r15)
        L_0x0018:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            X.C29401cD.A0J(r15, r3)
        L_0x001d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r1 = r4.next()
            X.5bJ r1 = (X.C108205bJ) r1
            java.lang.String r0 = r2.A0Y()
            r14.L$0 = r2
            r14.L$1 = r3
            r14.L$2 = r4
            r14.label = r12
            java.lang.Object r15 = r1.BZe(r0, r14)
            if (r15 != r5) goto L_0x0018
            return r5
        L_0x003c:
            X.C30691eM.A01(r15)
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r2 = r14.this$0
            boolean r0 = r2 instanceof com.whatsapp.calling.areffects.CallArEffectsViewModel
            if (r0 == 0) goto L_0x0053
            r0 = r2
            com.whatsapp.calling.areffects.CallArEffectsViewModel r0 = (com.whatsapp.calling.areffects.CallArEffectsViewModel) r0
            java.util.List r0 = r0.A0A
        L_0x004a:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r0.iterator()
            goto L_0x001d
        L_0x0053:
            java.util.List r0 = r2.A08
            goto L_0x004a
        L_0x0056:
            java.util.Set r0 = X.C29431cG.A12(r3)
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r7 = r14.this$0
            java.util.Iterator r6 = r0.iterator()
        L_0x0060:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r4 = r6.next()
            X.4cZ r4 = (X.C89504cZ) r4
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x00ce
            X.0vl r0 = r7.A0C
            java.lang.Object r0 = r0.getValue()
            X.4Ul r0 = (X.C87144Ul) r0
            java.util.List r0 = r0.A04
            java.util.Iterator r5 = r0.iterator()
        L_0x007e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r3 = r5.next()
            r2 = r3
            X.4V6 r2 = (X.AnonymousClass4V6) r2
            X.4DE r1 = r2.A01
            X.4DE r0 = r4.A00
            if (r1 != r0) goto L_0x007e
            X.5aj r0 = r2.A02
            X.5cD r0 = r0.BUq()
            X.4cF r1 = r0.BSi()
            X.4cF r0 = r4.A01
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x007e
        L_0x00a3:
            X.4V6 r3 = (X.AnonymousClass4V6) r3
            if (r3 == 0) goto L_0x0060
            X.5aj r9 = r3.A02
            X.4DE r8 = r4.A00
            boolean r0 = r7.A0k(r8, r9)
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = "BaseArEffectsViewModel/restoreButtonEffect Restoring directly"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Float r10 = r4.A02
            r13 = 0
            java.lang.String r11 = r7.A0Y()
            r7.A0g(r8, r9, r10, r11, r12, r13)
            goto L_0x0060
        L_0x00c1:
            java.lang.String r0 = "BaseArEffectsViewModel/restoreButtonEffect Restoring as suspended"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Float r0 = r4.A02
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel.A03(r8, r9, r7, r0, r12)
            goto L_0x0060
        L_0x00cc:
            r3 = 0
            goto L_0x00a3
        L_0x00ce:
            X.0vl r0 = r7.A0J
            java.util.Map r1 = X.AnonymousClass3MW.A12(r0)
            X.4DE r0 = r4.A00
            java.lang.Object r3 = r1.get(r0)
            X.4S8 r3 = (X.AnonymousClass4S8) r3
            if (r3 == 0) goto L_0x0060
            X.1OX r2 = r7.A0N
            r1 = 0
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$restoreTrayEffect$1 r0 = new com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$restoreTrayEffect$1
            r0.<init>(r7, r4, r3, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            goto L_0x0060
        L_0x00eb:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00ee:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$restoreState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
