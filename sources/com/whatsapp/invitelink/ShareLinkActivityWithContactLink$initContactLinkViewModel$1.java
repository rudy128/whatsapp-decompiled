package com.whatsapp.invitelink;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass687;
import X.C111115iL;
import X.C147277Sn;
import X.C147317Sr;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.invitelink.ShareLinkActivityWithContactLink$initContactLinkViewModel$1", f = "ShareLinkActivityWithContactLink.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
public final class ShareLinkActivityWithContactLink$initContactLinkViewModel$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C111115iL $viewModel;
    public int label;
    public final /* synthetic */ AnonymousClass687 this$0;

    @DebugMetadata(c = "com.whatsapp.invitelink.ShareLinkActivityWithContactLink$initContactLinkViewModel$1$1", f = "ShareLinkActivityWithContactLink.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.invitelink.ShareLinkActivityWithContactLink$initContactLinkViewModel$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(r4, r5);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AnonymousClass1G1 r3 = C111115iL.this.A08;
                C147277Sn r0 = new C147277Sn(r4, 27);
                this.label = 1;
                if (r3.BFC(this, r0) == r5) {
                    return r5;
                }
            } else if (i != 1) {
                throw AnonymousClass000.A0l();
            } else {
                C30691eM.A01(obj);
            }
            throw new C147317Sr();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareLinkActivityWithContactLink$initContactLinkViewModel$1(C111115iL r2, AnonymousClass687 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$viewModel = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ShareLinkActivityWithContactLink$initContactLinkViewModel$1(this.$viewModel, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final AnonymousClass687 r4 = this.this$0;
            C23401Fx r3 = C23401Fx.STARTED;
            final C111115iL r2 = this.$viewModel;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A01(r3, r4, this, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ShareLinkActivityWithContactLink$initContactLinkViewModel$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
