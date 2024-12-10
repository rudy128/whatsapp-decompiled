package com.whatsapp.consent.common;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C143427Dj;
import X.C25671Pd;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.consent.common.CommonAgeCollector$sendAgeVerification$3", f = "CommonAgeCollector.kt", i = {}, l = {294}, m = "invokeSuspend", n = {}, s = {})
public final class CommonAgeCollector$sendAgeVerification$3 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C143427Dj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonAgeCollector$sendAgeVerification$3(C143427Dj r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CommonAgeCollector$sendAgeVerification$3(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommonAgeCollector$sendAgeVerification$3(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C143427Dj r0 = this.this$0;
            C25671Pd r3 = r0.A08;
            int i2 = r0.A02;
            int i3 = r0.A01;
            int i4 = r0.A00;
            this.label = 1;
            obj = r3.CRm(this, i2, i3, i4);
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }
}
