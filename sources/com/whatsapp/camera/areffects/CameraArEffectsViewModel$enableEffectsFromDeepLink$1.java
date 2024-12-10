package com.whatsapp.camera.areffects;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C75603ho;
import android.content.Context;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.camera.areffects.CameraArEffectsViewModel$enableEffectsFromDeepLink$1", f = "CameraArEffectsViewModel.kt", i = {0, 0, 0, 1}, l = {314, 327}, m = "invokeSuspend", n = {"allTraySessions", "allSeenSessions", "allEffectsToEnable", "allEffectsToEnable"}, s = {"L$0", "L$1", "L$2", "L$0"})
public final class CameraArEffectsViewModel$enableEffectsFromDeepLink$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Set $effectIds;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ C75603ho this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraArEffectsViewModel$enableEffectsFromDeepLink$1(Context context, C75603ho r3, Set set, C30391dr r5) {
        super(2, r5);
        this.this$0 = r3;
        this.$effectIds = set;
        this.$context = context;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new CameraArEffectsViewModel$enableEffectsFromDeepLink$1(this.$context, this.this$0, this.$effectIds, r6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0103, code lost:
        if (r6.equals(r8) == false) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0113 A[LOOP:1: B:43:0x010d->B:45:0x0113, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0149 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r5 = 2
            r9 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0079
            if (r0 == r9) goto L_0x00d5
            if (r0 != r5) goto L_0x014a
            java.lang.Object r2 = r12.L$0
            java.util.List r2 = (java.util.List) r2
            X.C30691eM.A01(r13)
        L_0x0014:
            java.lang.Object r0 = X.C29431cG.A0e(r2)
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            if (r0 == 0) goto L_0x003b
            java.lang.Object r4 = r0.first
            X.4DE r4 = (X.AnonymousClass4DE) r4
            if (r4 == 0) goto L_0x003b
            X.3ho r0 = r12.this$0
            X.0vl r0 = r0.A0I
            java.lang.Object r0 = r0.getValue()
            X.4Oc r0 = (X.C85624Oc) r0
            r3 = 1
            X.0vl r0 = r0.A02
            X.1G4 r1 = X.AnonymousClass3MW.A17(r0)
            X.4Sx r0 = new X.4Sx
            r0.<init>(r4, r3)
            r1.setValue(r0)
        L_0x003b:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0067
            X.3ho r1 = r12.this$0
            r0 = 2131886693(0x7f120265, float:1.9407972E38)
        L_0x0046:
            X.6IR r2 = X.AnonymousClass3MX.A0t(r0)
            X.0vl r0 = r1.A0B
            java.lang.Object r1 = r0.getValue()
            X.4Qt r1 = (X.C86214Qt) r1
            X.1G1 r0 = r1.A04
            boolean r0 = X.C72463Mc.A1a(r0)
            if (r0 == 0) goto L_0x0064
            X.1G4 r1 = r1.A03
            X.4he r0 = new X.4he
            r0.<init>(r2)
            r1.setValue(r0)
        L_0x0064:
            X.1Wu r4 = X.C27621Wu.A00
            return r4
        L_0x0067:
            java.util.Set r0 = r12.$effectIds
            int r1 = r0.size()
            int r0 = r2.size()
            if (r1 <= r0) goto L_0x0064
            X.3ho r1 = r12.this$0
            r0 = 2131886694(0x7f120266, float:1.9407974E38)
            goto L_0x0046
        L_0x0079:
            X.C30691eM.A01(r13)
            X.3ho r6 = r12.this$0
            X.0vl r0 = r6.A0H
            java.lang.Object r0 = r0.getValue()
            X.4VF r0 = (X.AnonymousClass4VF) r0
            java.util.List r0 = r0.A05
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x0090:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = r1.next()
            X.4DE r0 = (X.AnonymousClass4DE) r0
            com.whatsapp.areffects.viewmodel.session.ArEffectSession r0 = r6.A0V(r0)
            if (r0 == 0) goto L_0x0090
            r2.add(r0)
            goto L_0x0090
        L_0x00a6:
            java.util.Set r8 = X.C29431cG.A12(r2)
            java.util.LinkedHashSet r6 = X.C17880vN.A14()
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Set r0 = r12.$effectIds
            java.util.Iterator r7 = r0.iterator()
        L_0x00b8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.String r1 = X.C17880vN.A0v(r7)
            X.3ho r0 = r12.this$0
            r12.L$0 = r8
            r12.L$1 = r6
            r12.L$2 = r2
            r12.L$3 = r7
            r12.label = r9
            java.lang.Object r13 = r0.A0W(r1, r12)
            if (r13 != r4) goto L_0x00e6
            return r4
        L_0x00d5:
            java.lang.Object r7 = r12.L$3
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r12.L$2
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r6 = r12.L$1
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r8 = r12.L$0
            X.C30691eM.A01(r13)
        L_0x00e6:
            X.1D6 r13 = (X.AnonymousClass1D6) r13
            if (r13 == 0) goto L_0x00b8
            X.3ho r1 = r12.this$0
            java.lang.Object r0 = r13.first
            X.4DE r0 = (X.AnonymousClass4DE) r0
            com.whatsapp.areffects.viewmodel.session.ArEffectSession r0 = r1.A0V(r0)
            if (r0 == 0) goto L_0x00b8
            boolean r0 = r6.add(r0)
            if (r0 == 0) goto L_0x00b8
            r2.add(r13)
            boolean r0 = r6.equals(r8)
            if (r0 == 0) goto L_0x00b8
        L_0x0105:
            X.3ho r6 = r12.this$0
            android.content.Context r7 = r12.$context
            java.util.Iterator r1 = r2.iterator()
        L_0x010d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0130
            java.lang.Object r0 = r1.next()
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            java.lang.Object r8 = r0.first
            X.4DE r8 = (X.AnonymousClass4DE) r8
            java.lang.Object r0 = r0.second
            X.4hH r0 = (X.C92424hH) r0
            X.5aj r9 = r0.A00
            X.5cD r0 = r9.BUq()
            java.lang.Float r10 = r0.BUT()
            r11 = 0
            r6.A0d(r7, r8, r9, r10, r11)
            goto L_0x010d
        L_0x0130:
            X.3ho r0 = r12.this$0
            X.1G4 r1 = r0.A0O
            com.whatsapp.camera.areffects.CameraArEffectsViewModel$enableEffectsFromDeepLink$1$2 r0 = new com.whatsapp.camera.areffects.CameraArEffectsViewModel$enableEffectsFromDeepLink$1$2
            r0.<init>(r3)
            r12.L$0 = r2
            r12.L$1 = r3
            r12.L$2 = r3
            r12.L$3 = r3
            r12.label = r5
            java.lang.Object r0 = X.C26067Crh.A00(r12, r0, r1)
            if (r0 != r4) goto L_0x0014
            return r4
        L_0x014a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.areffects.CameraArEffectsViewModel$enableEffectsFromDeepLink$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CameraArEffectsViewModel$enableEffectsFromDeepLink$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
