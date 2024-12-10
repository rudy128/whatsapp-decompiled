package com.whatsapp.productinfra.avatar.liveediting.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62882s9;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.viewmodel.BloksObservable$platformEvents$1", f = "BloksObservable.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
public final class BloksObservable$platformEvents$1 extends C30431dv implements AnonymousClass1OS {
    public int label;

    public BloksObservable$platformEvents$1(C30391dr r2) {
        super(2, r2);
    }

    public final C30391dr create(Object obj, C30391dr r3) {
        return new BloksObservable$platformEvents$1(r3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new BloksObservable$platformEvents$1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.label = 1;
            if (C62882s9.A00(this, 3000) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
