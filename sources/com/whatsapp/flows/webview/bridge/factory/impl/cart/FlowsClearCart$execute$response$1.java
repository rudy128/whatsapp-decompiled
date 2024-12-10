package com.whatsapp.flows.webview.bridge.factory.impl.cart;

import X.AnonymousClass000;
import X.AnonymousClass1IU;
import X.AnonymousClass1OS;
import X.AnonymousClass84U;
import X.C108945cZ;
import X.C22188Az4;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsClearCart$execute$response$1", f = "FlowsClearCart.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsClearCart$execute$response$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ FlowsClearCart this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsClearCart$execute$response$1(FlowsClearCart flowsClearCart, C30391dr r3) {
        super(2, r3);
        this.this$0 = flowsClearCart;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        FlowsClearCart$execute$response$1 flowsClearCart$execute$response$1 = new FlowsClearCart$execute$response$1(this.this$0, r4);
        flowsClearCart$execute$response$1.L$0 = obj;
        return flowsClearCart$execute$response$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        if (this.label == 0) {
            C30691eM.A01(obj);
            FlowsClearCart flowsClearCart = this.this$0;
            try {
                flowsClearCart.A00.A0C(flowsClearCart.A01);
                obj2 = C27621Wu.A00;
            } catch (Throwable th) {
                obj2 = C108945cZ.A1J(th);
            }
            if (obj2 instanceof AnonymousClass1IU) {
                Log.e("FlowsClearCart/execute", C30671eK.A00(obj2));
            }
            return AnonymousClass84U.A00(new C22188Az4(obj2));
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsClearCart$execute$response$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
