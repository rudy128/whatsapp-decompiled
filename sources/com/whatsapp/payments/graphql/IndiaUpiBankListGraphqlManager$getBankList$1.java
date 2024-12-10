package com.whatsapp.payments.graphql;

import X.AZ7;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass67D;
import X.AnonymousClass67E;
import X.AnonymousClass67F;
import X.AnonymousClass6TR;
import X.AnonymousClass7IB;
import X.B5T;
import X.C186119dg;
import X.C23761Hn;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.payments.graphql.IndiaUpiBankListGraphqlManager$getBankList$1", f = "IndiaUpiBankListGraphqlManager.kt", i = {0}, l = {41}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class IndiaUpiBankListGraphqlManager$getBankList$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ B5T $callback;
    public final /* synthetic */ AnonymousClass7IB $request;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndiaUpiBankListGraphqlManager$getBankList$1(AnonymousClass7IB r2, B5T b5t, C30391dr r4) {
        super(2, r4);
        this.$request = r2;
        this.$callback = b5t;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        IndiaUpiBankListGraphqlManager$getBankList$1 indiaUpiBankListGraphqlManager$getBankList$1 = new IndiaUpiBankListGraphqlManager$getBankList$1(this.$request, this.$callback, r5);
        indiaUpiBankListGraphqlManager$getBankList$1.L$0 = obj;
        return indiaUpiBankListGraphqlManager$getBankList$1;
    }

    public final Object invokeSuspend(Object obj) {
        C186119dg r1;
        Throwable th;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Object obj2 = this.L$0;
            AnonymousClass7IB r12 = this.$request;
            this.L$0 = obj2;
            this.label = 1;
            obj = r12.CBy(this, C23761Hn.A01);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass6TR r6 = (AnonymousClass6TR) obj;
        if (r6 instanceof AnonymousClass67D) {
            th = ((AnonymousClass67D) r6).A00;
        } else if (r6 instanceof AnonymousClass67E) {
            th = ((AnonymousClass67E) r6).A00;
        } else {
            if ((r6 instanceof AnonymousClass67F) && (r1 = (C186119dg) ((AnonymousClass67F) r6).A00.A03.A00) != null) {
                ((AZ7) this.$callback).A00.BmQ(r1.A00, r1.A01, r1.A02, false);
            }
            return C27621Wu.A00;
        }
        th.getMessage();
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IndiaUpiBankListGraphqlManager$getBankList$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
