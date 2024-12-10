package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.C18600wl;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.RegistrationUpsellProtocolHelper$canShowEmailUpsell$1", f = "RegistrationUpsellProtocolHelper.kt", i = {0}, l = {78}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class RegistrationUpsellProtocolHelper$canShowEmailUpsell$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $callback;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RegistrationUpsellProtocolHelper this$0;

    @DebugMetadata(c = "com.whatsapp.registration.RegistrationUpsellProtocolHelper$canShowEmailUpsell$1$1", f = "RegistrationUpsellProtocolHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.registration.RegistrationUpsellProtocolHelper$canShowEmailUpsell$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(r5, r22, A1Y);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                r22.invoke(Boolean.valueOf(A1Y));
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegistrationUpsellProtocolHelper$canShowEmailUpsell$1(RegistrationUpsellProtocolHelper registrationUpsellProtocolHelper, C30391dr r3, C22821Di r4) {
        super(2, r3);
        this.this$0 = registrationUpsellProtocolHelper;
        this.$callback = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        RegistrationUpsellProtocolHelper$canShowEmailUpsell$1 registrationUpsellProtocolHelper$canShowEmailUpsell$1 = new RegistrationUpsellProtocolHelper$canShowEmailUpsell$1(this.this$0, r5, this.$callback);
        registrationUpsellProtocolHelper$canShowEmailUpsell$1.L$0 = obj;
        return registrationUpsellProtocolHelper$canShowEmailUpsell$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1OX r5;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            r5 = (AnonymousClass1OX) this.L$0;
            RegistrationUpsellProtocolHelper registrationUpsellProtocolHelper = this.this$0;
            this.L$0 = r5;
            this.label = 1;
            obj = RegistrationUpsellProtocolHelper.A01(registrationUpsellProtocolHelper, this);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            r5 = (AnonymousClass1OX) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        final boolean A1Y = AnonymousClass000.A1Y(obj);
        C18600wl r3 = this.this$0.A02;
        final C22821Di r22 = this.$callback;
        AnonymousClass3MW.A1X(r3, new AnonymousClass1((C30391dr) null), r5);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RegistrationUpsellProtocolHelper$canShowEmailUpsell$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
