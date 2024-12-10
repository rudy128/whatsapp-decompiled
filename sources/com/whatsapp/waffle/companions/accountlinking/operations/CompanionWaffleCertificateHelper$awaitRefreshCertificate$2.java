package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass000;
import X.AnonymousClass1OR;
import X.AnonymousClass1OS;
import X.AnonymousClass4GT;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C34881lE;
import X.C35021lW;
import X.C35031lX;
import X.C72473Md;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.CompanionWaffleCertificateHelper$awaitRefreshCertificate$2", f = "CompanionWaffleCertificateHelper.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
public final class CompanionWaffleCertificateHelper$awaitRefreshCertificate$2 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public int label;
    public final /* synthetic */ C34881lE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompanionWaffleCertificateHelper$awaitRefreshCertificate$2(C34881lE r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CompanionWaffleCertificateHelper$awaitRefreshCertificate$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CompanionWaffleCertificateHelper$awaitRefreshCertificate$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C34881lE r3 = this.this$0;
            this.L$0 = r3;
            this.label = 1;
            C31781g7 A0m = C72473Md.A0m(this);
            ((C35031lX) r3.A00.get()).A03(C35021lW.A09);
            A0m.resumeWith(AnonymousClass4GT.A00(AnonymousClass1OR.A00, new CompanionWaffleCertificateHelper$awaitRefreshCertificate$2$1$1(r3, (C30391dr) null)));
            obj = A0m.A0C();
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }
}
