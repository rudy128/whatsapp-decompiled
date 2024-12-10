package com.whatsapp.companionmode.registration;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass8oG;
import X.C18020vd;
import X.C18040vf;
import X.C191849nI;
import X.C21907AuX;
import X.C22174Ayq;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$prepare$1", f = "KeyAttestationLifetimeManager.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
public final class KeyAttestationLifetimeManager$prepare$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C191849nI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyAttestationLifetimeManager$prepare$1(C191849nI r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new KeyAttestationLifetimeManager$prepare$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new KeyAttestationLifetimeManager$prepare$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            int A00 = C18020vd.A00(C18040vf.A02, this.this$0.A08, 6433);
            C191849nI r2 = this.this$0;
            C22174Ayq ayq = new C22174Ayq(r2);
            C21907AuX auX = new C21907AuX(r2);
            this.label = 1;
            if (KeyAttestationLifetimeManagerKt.A00(this, auX, ayq, A00) == r5) {
                return r5;
            }
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
            } catch (Exception unused) {
                C191849nI r0 = this.this$0;
                r0.A06.A00(AnonymousClass8oG.A00, String.valueOf(C18020vd.A00(C18040vf.A02, r0.A08, 6433)));
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
