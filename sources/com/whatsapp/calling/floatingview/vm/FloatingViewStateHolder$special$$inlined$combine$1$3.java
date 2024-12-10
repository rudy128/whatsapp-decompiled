package com.whatsapp.calling.floatingview.vm;

import X.C131136kZ;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.floatingview.vm.FloatingViewStateHolder$special$$inlined$combine$1$3", f = "FloatingViewStateHolder.kt", i = {}, l = {330, 234}, m = "invokeSuspend", n = {}, s = {})
public final class FloatingViewStateHolder$special$$inlined$combine$1$3 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ C131136kZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatingViewStateHolder$special$$inlined$combine$1$3(C131136kZ r2, C30391dr r3) {
        super(3, r3);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        FloatingViewStateHolder$special$$inlined$combine$1$3 floatingViewStateHolder$special$$inlined$combine$1$3 = new FloatingViewStateHolder$special$$inlined$combine$1$3(this.this$0, (C30391dr) obj3);
        floatingViewStateHolder$special$$inlined$combine$1$3.L$0 = obj;
        floatingViewStateHolder$special$$inlined$combine$1$3.L$1 = obj2;
        return floatingViewStateHolder$special$$inlined$combine$1$3.invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0100 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r4 = r19
            X.1g4 r1 = X.C31751g4.COROUTINE_SUSPENDED
            r12 = r18
            int r0 = r12.label
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0016
            if (r0 == r3) goto L_0x0094
            if (r0 != r5) goto L_0x0101
            X.C30691eM.A01(r4)
        L_0x0013:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0016:
            X.C30691eM.A01(r4)
            java.lang.Object r2 = r12.L$0
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            java.lang.Object r4 = r12.L$1
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            X.6kZ r0 = r12.this$0
            com.whatsapp.calling.floatingview.usecase.FloatingViewUseCase r6 = r0.A06
            r0 = 0
            r9 = r4[r0]
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.calling.calldatasource.CallStateModel"
            X.C18070vi.A0z(r9, r0)
            X.4Sa r9 = (X.C86534Sa) r9
            r0 = r4[r3]
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Int"
            X.C18070vi.A0z(r0, r3)
            int r13 = X.AnonymousClass000.A0M(r0)
            r7 = r4[r5]
            java.lang.String r0 = "null cannot be cast to non-null type android.graphics.Point"
            X.C18070vi.A0z(r7, r0)
            android.graphics.Point r7 = (android.graphics.Point) r7
            r0 = 3
            r10 = r4[r0]
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.calling.floatingview.ui.FloatingViewBehavior"
            X.C18070vi.A0z(r10, r0)
            X.6Ri r10 = (X.C122686Ri) r10
            r0 = 4
            r0 = r4[r0]
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Boolean"
            X.C18070vi.A0z(r0, r5)
            boolean r15 = X.AnonymousClass000.A1Y(r0)
            r0 = 5
            r11 = r4[r0]
            X.6qm r11 = (X.C134556qm) r11
            r0 = 6
            r0 = r4[r0]
            X.C18070vi.A0z(r0, r5)
            boolean r16 = X.AnonymousClass000.A1Y(r0)
            r0 = 7
            r8 = r4[r0]
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.areffects.viewmodel.viewstate.ArEffectsUiViewState.EntryPointState"
            X.C18070vi.A0z(r8, r0)
            X.5Wl r8 = (X.C106595Wl) r8
            r0 = 8
            r0 = r4[r0]
            X.C18070vi.A0z(r0, r5)
            boolean r17 = X.AnonymousClass000.A1Y(r0)
            r0 = 9
            r0 = r4[r0]
            X.C18070vi.A0z(r0, r3)
            int r14 = X.AnonymousClass000.A0M(r0)
            r12.L$0 = r2
            r0 = 1
            r12.label = r0
            java.lang.Object r4 = r6.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r4 != r1) goto L_0x009b
            return r1
        L_0x0094:
            java.lang.Object r2 = r12.L$0
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            X.C30691eM.A01(r4)
        L_0x009b:
            X.6kZ r3 = r12.this$0
            com.whatsapp.calling.floatingview.usecase.FloatingViewUseCase r0 = r3.A06
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x00b3
            X.1G4 r3 = r3.A0H
            java.lang.Object r0 = r3.getValue()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x00b3
            r0 = 0
            X.AnonymousClass3MY.A1Y(r3, r0)
        L_0x00b3:
            X.6kZ r0 = r12.this$0
            X.1DT r6 = r0.A03
            java.lang.Object r5 = r6.A06()
            com.whatsapp.calling.floatingview.usecase.FloatingViewUseCase r3 = r0.A06
            X.6sX r0 = r3.A02
            boolean r0 = X.C18070vi.A18(r5, r0)
            if (r0 != 0) goto L_0x00ca
            X.6sX r0 = r3.A02
            r6.A0E(r0)
        L_0x00ca:
            X.6kZ r5 = r12.this$0
            X.6Ri r3 = r5.A02
            X.6Ri r0 = X.C122686Ri.FOCUS
            if (r3 != r0) goto L_0x00f4
            boolean r0 = r4 instanceof X.AnonymousClass7DN
            if (r0 == 0) goto L_0x00f4
            X.6Ri r0 = X.C122686Ri.CONTROLS_SHOWN
            r5.A02 = r0
            X.1G4 r3 = r5.A0F
            r0 = 0
            r3.setValue(r0)
            X.1G4 r3 = r5.A0E
            X.6Ri r0 = r5.A02
            r3.setValue(r0)
            X.1G4 r3 = r5.A0F
            r0 = 0
            r3.setValue(r0)
            X.1wy r3 = r5.A08
            X.6Qw r0 = X.C122566Qw.DISMISS_FOCUS
            r3.A0E(r0)
        L_0x00f4:
            r0 = 0
            r12.L$0 = r0
            r0 = 2
            r12.label = r0
            java.lang.Object r0 = r2.BJt(r4, r12)
            if (r0 != r1) goto L_0x0013
            return r1
        L_0x0101:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.floatingview.vm.FloatingViewStateHolder$special$$inlined$combine$1$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
