package com.whatsapp.consent.common;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108495bn;
import X.C143427Dj;
import X.C143547Dv;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.consent.common.CommonAgeCollector$onYearSelected$1", f = "CommonAgeCollector.kt", i = {}, l = {239}, m = "invokeSuspend", n = {}, s = {})
public final class CommonAgeCollector$onYearSelected$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C143427Dj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonAgeCollector$onYearSelected$1(C143427Dj r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CommonAgeCollector$onYearSelected$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommonAgeCollector$onYearSelected$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C143547Dv r0 = C143547Dv.A00;
            this.label = 1;
            if (((C108495bn) this.this$0.A0D.getValue()).CHH(r0, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
