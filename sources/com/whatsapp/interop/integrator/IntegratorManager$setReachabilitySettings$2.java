package com.whatsapp.interop.integrator;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.AnonymousClass9FQ;
import X.C17880vN;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C33971jg;
import X.C34651kr;
import X.C96544o1;
import X.C96554o2;
import X.C96564o3;
import com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interop.integrator.IntegratorManager$setReachabilitySettings$2", f = "IntegratorManager.kt", i = {}, l = {326}, m = "invokeSuspend", n = {}, s = {})
public final class IntegratorManager$setReachabilitySettings$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ List $integratorIds;
    public final /* synthetic */ List $reachableIntegrators;
    public final /* synthetic */ String $smaxEnabled;
    public int label;
    public final /* synthetic */ C34651kr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntegratorManager$setReachabilitySettings$2(C34651kr r2, String str, List list, List list2, C30391dr r6, boolean z) {
        super(2, r6);
        this.this$0 = r2;
        this.$smaxEnabled = str;
        this.$reachableIntegrators = list;
        this.$enabled = z;
        this.$integratorIds = list2;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new IntegratorManager$setReachabilitySettings$2(this.this$0, this.$smaxEnabled, this.$reachableIntegrators, this.$integratorIds, r9, this.$enabled);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            String str = this.$smaxEnabled;
            List list = this.$reachableIntegrators;
            this.label = 1;
            obj = ((DmaInteropRPCManager) this.this$0.A02.get()).A01(str, list, this, 458);
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        if (!(obj instanceof AnonymousClass9FQ) || ((AnonymousClass9FQ) obj).A00 != 2) {
            return C96564o3.A00;
        }
        C33971jg A0k = AnonymousClass3MX.A0k(this.this$0.A03);
        C17880vN.A1F(C33971jg.A00(A0k).edit(), "interop_reach_enabled", this.$enabled);
        if (!this.$enabled) {
            return C96554o2.A00;
        }
        AnonymousClass3MX.A0k(this.this$0.A03).A03(this.$integratorIds);
        return new C96544o1(this.$integratorIds);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IntegratorManager$setReachabilitySettings$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
