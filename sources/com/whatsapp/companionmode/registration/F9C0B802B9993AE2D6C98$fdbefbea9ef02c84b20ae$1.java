package com.whatsapp.companionmode.registration;

import X.AVN;
import X.AnonymousClass000;
import X.AnonymousClass11P;
import X.AnonymousClass1OS;
import X.AnonymousClass8oG;
import X.C108975cc;
import X.C18020vd;
import X.C18040vf;
import X.C191839nH;
import X.C19992A2f;
import X.C22173Ayp;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C71053Dp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companionmode.registration.F9C0B802B9993AE2D6C98$fdbefbea9ef02c84b20ae$1", f = "F9C0B802B9993AE2D6C98.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
public final class F9C0B802B9993AE2D6C98$fdbefbea9ef02c84b20ae$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C191839nH this$0;

    @DebugMetadata(c = "com.whatsapp.companionmode.registration.F9C0B802B9993AE2D6C98$fdbefbea9ef02c84b20ae$1$2", f = "F9C0B802B9993AE2D6C98.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.companionmode.registration.F9C0B802B9993AE2D6C98$fdbefbea9ef02c84b20ae$1$2  reason: invalid class name */
    public final class AnonymousClass2 extends C30431dv implements C22821Di {
        public Object L$0;
        public int label;

        public final C30391dr create(C30391dr r3) {
            return new AnonymousClass2(r3);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return new AnonymousClass2((C30391dr) obj).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                C191839nH r0 = C191839nH.this;
                this.L$0 = r0;
                this.label = 1;
                C71053Dp A0k = C108975cc.A0k(this);
                ((C19992A2f) r0.A07.get()).A02(new AVN(A0k, 0), "md-pairing");
                if (A0k.A00() == r4) {
                    return r4;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            C191839nH r2 = C191839nH.this;
            r2.A00 = AnonymousClass11P.A01(r2.A04);
            return C27621Wu.A00;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public F9C0B802B9993AE2D6C98$fdbefbea9ef02c84b20ae$1(C191839nH r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new F9C0B802B9993AE2D6C98$fdbefbea9ef02c84b20ae$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new F9C0B802B9993AE2D6C98$fdbefbea9ef02c84b20ae$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            int A00 = C18020vd.A00(C18040vf.A02, this.this$0.A06, 7009);
            final C191839nH r3 = this.this$0;
            C22173Ayp ayp = new C22173Ayp(r3);
            AnonymousClass2 r0 = new AnonymousClass2((C30391dr) null);
            this.label = 1;
            if (F9C0B802B9993AE2D6C98Kt.A00(this, ayp, r0, A00) == r6) {
                return r6;
            }
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
            } catch (Exception e) {
                C191839nH r02 = this.this$0;
                r02.A05.A01(AnonymousClass8oG.A01, String.valueOf(C18020vd.A00(C18040vf.A02, r02.A06, 7009)), e);
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
