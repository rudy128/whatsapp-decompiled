package com.whatsapp.calling.controls.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass20G;
import X.AnonymousClass4E9;
import X.AnonymousClass4U2;
import X.AnonymousClass4aL;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C86534Sa;
import X.C93624jH;
import com.whatsapp.voipcalling.CallState;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.controls.viewmodel.CallControlStateHolder$uiState$1", f = "CallControlStateHolder.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
public final class CallControlStateHolder$uiState$1 extends C30431dv implements AnonymousClass20G {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;
    public final /* synthetic */ AnonymousClass4aL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallControlStateHolder$uiState$1(AnonymousClass4aL r2, C30391dr r3) {
        super(4, r3);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        CallControlStateHolder$uiState$1 callControlStateHolder$uiState$1 = new CallControlStateHolder$uiState$1(this.this$0, (C30391dr) obj4);
        callControlStateHolder$uiState$1.L$0 = obj;
        callControlStateHolder$uiState$1.L$1 = obj2;
        callControlStateHolder$uiState$1.L$2 = obj3;
        return callControlStateHolder$uiState$1.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G2 r3 = (AnonymousClass1G2) this.L$0;
            C86534Sa r7 = (C86534Sa) this.L$1;
            AnonymousClass4U2 r6 = (AnonymousClass4U2) this.L$2;
            if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(this.this$0.A0B), 11360)) {
                C93624jH r1 = this.this$0.A05;
                CallState callState = r7.A0B;
                C18070vi.A0W(callState);
                r1.A00(callState);
            }
            AnonymousClass4E9 A01 = AnonymousClass4aL.A01(r7, this.this$0, r6);
            if (A01 != null) {
                this.L$0 = A01;
                this.L$1 = null;
                this.label = 1;
                if (r3.BJt(A01, this) == r4) {
                    return r4;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
