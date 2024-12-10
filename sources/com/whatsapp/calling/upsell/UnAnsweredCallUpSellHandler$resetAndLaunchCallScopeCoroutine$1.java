package com.whatsapp.calling.upsell;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1IW;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.C27182DXr;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C36001nB;
import X.C88054Yd;
import X.C99624tC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.upsell.UnAnsweredCallUpSellHandler$resetAndLaunchCallScopeCoroutine$1", f = "UnAnsweredCallUpSellHandler.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
public final class UnAnsweredCallUpSellHandler$resetAndLaunchCallScopeCoroutine$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass1IW this$0;

    @DebugMetadata(c = "com.whatsapp.calling.upsell.UnAnsweredCallUpSellHandler$resetAndLaunchCallScopeCoroutine$1$1", f = "UnAnsweredCallUpSellHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.upsell.UnAnsweredCallUpSellHandler$resetAndLaunchCallScopeCoroutine$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements C36001nB {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 r1 = new AnonymousClass1((C30391dr) obj3);
            r1.L$0 = obj;
            r1.L$1 = obj2;
            return r1.invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                return AnonymousClass1D6.A01(((AnonymousClass1D6) this.L$0).second, this.L$1);
            }
            throw AnonymousClass000.A0l();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnAnsweredCallUpSellHandler$resetAndLaunchCallScopeCoroutine$1(AnonymousClass1IW r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new UnAnsweredCallUpSellHandler$resetAndLaunchCallScopeCoroutine$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new UnAnsweredCallUpSellHandler$resetAndLaunchCallScopeCoroutine$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C27182DXr dXr = new C27182DXr(new AnonymousClass1D6((Object) null, (Object) null), new AnonymousClass1((C30391dr) null), AnonymousClass3MX.A18(((C88054Yd) this.this$0.A09.get()).A06));
            C99624tC A00 = C99624tC.A00(this.this$0, 33);
            this.label = 1;
            if (dXr.BFC(this, A00) == r5) {
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
