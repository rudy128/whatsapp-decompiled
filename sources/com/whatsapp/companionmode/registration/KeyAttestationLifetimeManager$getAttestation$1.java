package com.whatsapp.companionmode.registration;

import X.AnonymousClass000;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.AnonymousClass4Z5;
import X.AnonymousClass8BR;
import X.C191849nI;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$getAttestation$1", f = "KeyAttestationLifetimeManager.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
public final class KeyAttestationLifetimeManager$getAttestation$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C191849nI this$0;

    @DebugMetadata(c = "com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$getAttestation$1$1", f = "KeyAttestationLifetimeManager.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$getAttestation$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AnonymousClass1OB r0 = C191849nI.this.A01;
                if (r0 == null) {
                    return null;
                }
                this.label = 1;
                if (r0.BhB(this) == r2) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyAttestationLifetimeManager$getAttestation$1(C191849nI r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new KeyAttestationLifetimeManager$getAttestation$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new KeyAttestationLifetimeManager$getAttestation$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            long A05 = AnonymousClass8BR.A05(this.this$0.A08, 6434);
            final C191849nI r2 = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (AnonymousClass4Z5.A01(this, r0, A05) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return this.this$0.A02;
    }
}
