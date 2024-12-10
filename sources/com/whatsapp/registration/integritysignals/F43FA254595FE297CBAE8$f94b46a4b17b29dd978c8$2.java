package com.whatsapp.registration.integritysignals;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4Z5;
import X.AnonymousClass8BR;
import X.AnonymousClass8oF;
import X.C188119gu;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C99814tV;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.integritysignals.F43FA254595FE297CBAE8$f94b46a4b17b29dd978c8$2", f = "F43FA254595FE297CBAE8.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
public final class F43FA254595FE297CBAE8$f94b46a4b17b29dd978c8$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $location;
    public final /* synthetic */ String $nonce;
    public int label;
    public final /* synthetic */ C188119gu this$0;

    @DebugMetadata(c = "com.whatsapp.registration.integritysignals.F43FA254595FE297CBAE8$f94b46a4b17b29dd978c8$2$1", f = "F43FA254595FE297CBAE8.kt", i = {}, l = {116, 118}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.registration.integritysignals.F43FA254595FE297CBAE8$f94b46a4b17b29dd978c8$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(str, str2, r6);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0062 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
                int r0 = r6.label
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L_0x0010
                if (r0 == r3) goto L_0x0038
                if (r0 != r2) goto L_0x0063
                X.C30691eM.A01(r7)
            L_0x000f:
                return r7
            L_0x0010:
                X.C30691eM.A01(r7)
                X.9gu r0 = X.C188119gu.this
                X.00H r0 = r0.A05
                java.lang.Object r0 = r0.get()
                X.A2f r0 = (X.C19992A2f) r0
                boolean r0 = r0.A04()
                if (r0 != 0) goto L_0x003b
                X.9gu r0 = X.C188119gu.this
                X.00H r0 = r0.A05
                java.lang.Object r1 = r0.get()
                X.A2f r1 = (X.C19992A2f) r1
                java.lang.String r0 = r5
                r6.label = r3
                java.lang.Object r0 = r1.A01(r0, r6)
                if (r0 != r5) goto L_0x003b
                return r5
            L_0x0038:
                X.C30691eM.A01(r7)
            L_0x003b:
                X.9gu r0 = X.C188119gu.this
                java.lang.String r4 = r2
                java.lang.String r3 = r5
                r6.label = r2
                X.1g7 r2 = X.AnonymousClass8BX.A0s(r6)
                X.00H r0 = r0.A05
                java.lang.Object r1 = r0.get()
                X.A2f r1 = (X.C19992A2f) r1
                X.AVO r0 = new X.AVO
                r0.<init>(r2)
                r1.A03(r0, r4, r3)
                X.B3M r0 = X.B3M.A00
                r2.Bdu(r0)
                java.lang.Object r7 = r2.A0C()
                if (r7 != r5) goto L_0x000f
                return r5
            L_0x0063:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.integritysignals.F43FA254595FE297CBAE8$f94b46a4b17b29dd978c8$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public F43FA254595FE297CBAE8$f94b46a4b17b29dd978c8$2(C188119gu r2, String str, String str2, C30391dr r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$location = str;
        this.$nonce = str2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new F43FA254595FE297CBAE8$f94b46a4b17b29dd978c8$2(this.this$0, this.$location, this.$nonce, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r8 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            long A05 = AnonymousClass8BR.A05(this.this$0.A03, 4263);
            final C188119gu r6 = this.this$0;
            final String str = this.$location;
            final String str2 = this.$nonce;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            Object A00 = AnonymousClass4Z5.A00(this, r0, A05);
            if (A00 == r8) {
                return r8;
            }
            return A00;
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
                return obj;
            } catch (C99814tV e) {
                this.this$0.A02.A01(AnonymousClass8oF.A01, "on_failure_exception/1004", e);
                throw e;
            }
        } else {
            throw AnonymousClass000.A0l();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((F43FA254595FE297CBAE8$f94b46a4b17b29dd978c8$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
