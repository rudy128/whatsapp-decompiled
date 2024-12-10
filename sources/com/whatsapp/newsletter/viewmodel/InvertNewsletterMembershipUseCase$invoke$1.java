package com.whatsapp.newsletter.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7K8;
import X.AnonymousClass7w6;
import X.AnonymousClass82U;
import X.C108975cc;
import X.C132876nm;
import X.C179509Ig;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30551e8;
import X.C30691eM;
import X.C31751g4;
import X.C35681md;
import X.C46162Dk;
import X.C71053Dp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.viewmodel.InvertNewsletterMembershipUseCase$invoke$1", f = "InvertNewsletterMembershipUseCase.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
public final class InvertNewsletterMembershipUseCase$invoke$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Integer $logInstanceKey;
    public final /* synthetic */ C46162Dk $newsletterInfo;
    public final /* synthetic */ C22821Di $onComplete;
    public Object L$0;
    public int label;
    public final /* synthetic */ C132876nm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvertNewsletterMembershipUseCase$invoke$1(C46162Dk r2, C132876nm r3, Integer num, C30391dr r5, C22821Di r6) {
        super(2, r5);
        this.$onComplete = r6;
        this.this$0 = r3;
        this.$newsletterInfo = r2;
        this.$logInstanceKey = num;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C22821Di r5 = this.$onComplete;
        return new InvertNewsletterMembershipUseCase$invoke$1(this.$newsletterInfo, this.this$0, this.$logInstanceKey, r8, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C22821Di r4;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            r4 = this.$onComplete;
            C132876nm r7 = this.this$0;
            C46162Dk r6 = this.$newsletterInfo;
            Integer num = this.$logInstanceKey;
            this.L$0 = r4;
            this.label = 1;
            C71053Dp A0k = C108975cc.A0k(this);
            AnonymousClass7K8 r8 = new AnonymousClass7K8(r6, r7, A0k);
            r7.A00.registerObserver(r8);
            C30551e8.A02(r7.A02.getCoroutineContext()).Bdy(new AnonymousClass82U(r8, r7));
            boolean A1Z = AnonymousClass000.A1Z(r6.A02, C179509Ig.GUEST);
            C35681md r1 = r7.A01;
            if (A1Z) {
                r1.A03(r6, new AnonymousClass7w6(r6, r7, num));
            } else {
                r1.A0E(r6.A0M(), num);
            }
            obj = A0k.A00();
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            r4 = (C22821Di) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        r4.invoke(obj);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InvertNewsletterMembershipUseCase$invoke$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
