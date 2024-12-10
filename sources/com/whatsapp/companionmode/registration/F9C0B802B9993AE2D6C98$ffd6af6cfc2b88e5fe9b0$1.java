package com.whatsapp.companionmode.registration;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4Z5;
import X.AnonymousClass8BR;
import X.C191839nH;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companionmode.registration.F9C0B802B9993AE2D6C98$ffd6af6cfc2b88e5fe9b0$1", f = "F9C0B802B9993AE2D6C98.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
public final class F9C0B802B9993AE2D6C98$ffd6af6cfc2b88e5fe9b0$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C191839nH this$0;

    @DebugMetadata(c = "com.whatsapp.companionmode.registration.F9C0B802B9993AE2D6C98$ffd6af6cfc2b88e5fe9b0$1$1", f = "F9C0B802B9993AE2D6C98.kt", i = {}, l = {178, 179}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.companionmode.registration.F9C0B802B9993AE2D6C98$ffd6af6cfc2b88e5fe9b0$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0055 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
                int r0 = r7.label
                r2 = 2
                r1 = 1
                if (r0 == 0) goto L_0x0010
                if (r0 == r1) goto L_0x0022
                if (r0 != r2) goto L_0x0056
                X.C30691eM.A01(r8)
            L_0x000f:
                return r8
            L_0x0010:
                X.C30691eM.A01(r8)
                X.9nH r0 = X.C191839nH.this
                X.1OB r0 = r0.A01
                if (r0 == 0) goto L_0x0025
                r7.label = r1
                java.lang.Object r0 = r0.BhB(r7)
                if (r0 != r6) goto L_0x0025
                return r6
            L_0x0022:
                X.C30691eM.A01(r8)
            L_0x0025:
                X.9nH r5 = X.C191839nH.this
                r7.L$0 = r5
                r7.label = r2
                X.3Dp r4 = X.C108975cc.A0k(r7)
                X.00H r0 = r5.A07
                java.lang.Object r3 = r0.get()
                X.A2f r3 = (X.C19992A2f) r3
                X.1Cw r0 = r5.A03
                byte[] r1 = r0.A0J()
                r0 = 3
                java.lang.String r2 = android.util.Base64.encodeToString(r1, r0)
                X.C18070vi.A0X(r2)
                X.AVP r1 = new X.AVP
                r1.<init>(r5, r4)
                java.lang.String r0 = "md-pairing"
                r3.A03(r1, r2, r0)
                java.lang.Object r8 = r4.A00()
                if (r8 != r6) goto L_0x000f
                return r6
            L_0x0056:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companionmode.registration.F9C0B802B9993AE2D6C98$ffd6af6cfc2b88e5fe9b0$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public F9C0B802B9993AE2D6C98$ffd6af6cfc2b88e5fe9b0$1(C191839nH r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new F9C0B802B9993AE2D6C98$ffd6af6cfc2b88e5fe9b0$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new F9C0B802B9993AE2D6C98$ffd6af6cfc2b88e5fe9b0$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            long A05 = AnonymousClass8BR.A05(this.this$0.A06, 7010);
            final C191839nH r2 = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            obj = AnonymousClass4Z5.A01(this, r0, A05);
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }
}
