package com.whatsapp.biz;

import X.AnonymousClass000;
import X.AnonymousClass1FY;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30551e8;
import X.C30691eM;
import X.C31751g4;
import X.C62882s9;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.BusinessProfileLinkifier$fetchAndOpenShimmedUrl$loadingJob$1", f = "BusinessProfileLinkifier.kt", i = {0}, l = {256, 259}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class BusinessProfileLinkifier$fetchAndOpenShimmedUrl$loadingJob$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1FY $activity;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessProfileLinkifier$fetchAndOpenShimmedUrl$loadingJob$1(AnonymousClass1FY r2, C30391dr r3) {
        super(2, r3);
        this.$activity = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        BusinessProfileLinkifier$fetchAndOpenShimmedUrl$loadingJob$1 businessProfileLinkifier$fetchAndOpenShimmedUrl$loadingJob$1 = new BusinessProfileLinkifier$fetchAndOpenShimmedUrl$loadingJob$1(this.$activity, r4);
        businessProfileLinkifier$fetchAndOpenShimmedUrl$loadingJob$1.L$0 = obj;
        return businessProfileLinkifier$fetchAndOpenShimmedUrl$loadingJob$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1OX r2;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            r2 = (AnonymousClass1OX) this.L$0;
            this.L$0 = r2;
            this.label = 1;
            if (C62882s9.A00(this, 300) == r4) {
                return r4;
            }
        } else if (i == 1) {
            r2 = (AnonymousClass1OX) this.L$0;
            C30691eM.A01(obj);
        } else if (i == 2) {
            try {
                C30691eM.A01(obj);
                this.$activity.CEx();
                return C27621Wu.A00;
            } catch (Throwable th) {
                this.$activity.CEx();
                throw th;
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        this.$activity.CNA(2131891797);
        AnonymousClass1OB A02 = C30551e8.A02(r2.getCoroutineContext());
        this.L$0 = null;
        this.label = 2;
        if (A02.BhB(this) == r4) {
            return r4;
        }
        this.$activity.CEx();
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BusinessProfileLinkifier$fetchAndOpenShimmedUrl$loadingJob$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
