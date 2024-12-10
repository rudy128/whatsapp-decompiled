package com.whatsapp.flows.webview.bridge.factory.impl.cart;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass84U;
import X.AnonymousClass9XU;
import X.C18460wS;
import X.C22261B0p;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C72453Mb;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsGetCart$execute$cartJson$1", f = "FlowsGetCart.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsGetCart$execute$cartJson$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ FlowsGetCart this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsGetCart$execute$cartJson$1(FlowsGetCart flowsGetCart, C30391dr r3) {
        super(2, r3);
        this.this$0 = flowsGetCart;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new FlowsGetCart$execute$cartJson$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FlowsGetCart$execute$cartJson$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        List list;
        if (this.label == 0) {
            C30691eM.A01(obj);
            FlowsGetCart flowsGetCart = this.this$0;
            try {
                list = (List) flowsGetCart.A00.A08(flowsGetCart.A02).get();
            } catch (ExecutionException e) {
                Log.e("FlowsGetCart/execute/ExecutionException", e);
                list = C18460wS.A00;
            }
            AnonymousClass9XU r1 = this.this$0.A01;
            C72453Mb.A1R(list);
            return AnonymousClass84U.A00(new C22261B0p(r1, list));
        }
        throw AnonymousClass000.A0l();
    }
}
