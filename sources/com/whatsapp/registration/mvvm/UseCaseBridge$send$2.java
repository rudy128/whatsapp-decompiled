package com.whatsapp.registration.mvvm;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108485bm;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C86374Rj;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.mvvm.UseCaseBridge$send$2", f = "UseCaseBridge.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
public final class UseCaseBridge$send$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Object $action;
    public int label;
    public final /* synthetic */ C86374Rj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UseCaseBridge$send$2(C86374Rj r2, Object obj, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$action = obj;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new UseCaseBridge$send$2(this.this$0, this.$action, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108485bm r1 = this.this$0.A00;
            Object obj2 = this.$action;
            this.label = 1;
            if (r1.CHH(obj2, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UseCaseBridge$send$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
