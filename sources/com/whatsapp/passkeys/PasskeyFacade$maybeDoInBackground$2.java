package com.whatsapp.passkeys;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.passkeys.PasskeyFacade$maybeDoInBackground$2", f = "PasskeyFacade.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class PasskeyFacade$maybeDoInBackground$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $block;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasskeyFacade$maybeDoInBackground$2(C30391dr r2, C22821Di r3) {
        super(2, r2);
        this.$block = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new PasskeyFacade$maybeDoInBackground$2(r4, this.$block);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new PasskeyFacade$maybeDoInBackground$2((C30391dr) obj2, this.$block).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C22821Di r0 = this.$block;
            this.label = 1;
            obj = r0.invoke(this);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }
}
