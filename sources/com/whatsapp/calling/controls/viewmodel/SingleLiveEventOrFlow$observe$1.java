package com.whatsapp.calling.controls.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.controls.viewmodel.SingleLiveEventOrFlow$observe$1", f = "SingleLiveEventOrFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SingleLiveEventOrFlow$observe$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $callback;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleLiveEventOrFlow$observe$1(C30391dr r2, C22821Di r3) {
        super(2, r2);
        this.$callback = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        SingleLiveEventOrFlow$observe$1 singleLiveEventOrFlow$observe$1 = new SingleLiveEventOrFlow$observe$1(r4, this.$callback);
        singleLiveEventOrFlow$observe$1.L$0 = obj;
        return singleLiveEventOrFlow$observe$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.$callback.invoke(this.L$0);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SingleLiveEventOrFlow$observe$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
