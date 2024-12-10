package com.whatsapp.infra.graphql.mex.argo;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C173038uQ;
import X.C18070vi;
import X.C180759Nu;
import X.C181389Qh;
import X.C21488Akx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30691eM;
import X.C31751g4;
import X.C71433Fg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.infra.graphql.mex.argo.JsonValue$Array$iterator$1", f = "JsonValue.kt", i = {0}, l = {46}, m = "invokeSuspend", n = {"$this$iterator"}, s = {"L$0"})
public final class JsonValue$Array$iterator$1 extends C71433Fg implements AnonymousClass1OS {
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C173038uQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonValue$Array$iterator$1(C173038uQ r1, C30391dr r2) {
        super(r2);
        this.this$0 = r1;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        JsonValue$Array$iterator$1 jsonValue$Array$iterator$1 = new JsonValue$Array$iterator$1(this.this$0, r4);
        jsonValue$Array$iterator$1.L$0 = obj;
        return jsonValue$Array$iterator$1;
    }

    public final Object invokeSuspend(Object obj) {
        C21488Akx akx;
        int length;
        C173038uQ r3;
        int i;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C30691eM.A01(obj);
            akx = (C21488Akx) this.L$0;
            length = this.this$0.A00.length();
            r3 = this.this$0;
            i = 0;
        } else if (i2 == 1) {
            int i3 = this.I$1;
            length = this.I$0;
            r3 = (C173038uQ) this.L$1;
            akx = (C21488Akx) this.L$0;
            C30691eM.A01(obj);
            i = i3 + 1;
        } else {
            throw AnonymousClass000.A0l();
        }
        if (i >= length) {
            return C27621Wu.A00;
        }
        Object obj2 = r3.A00.get(i);
        C18070vi.A0X(obj2);
        C180759Nu A00 = C181389Qh.A00(obj2);
        this.L$0 = akx;
        this.L$1 = r3;
        this.I$0 = length;
        this.I$1 = i;
        this.label = 1;
        akx.A00(A00, this);
        return r6;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((JsonValue$Array$iterator$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
