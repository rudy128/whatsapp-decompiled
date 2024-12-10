package com.whatsapp.conversation.banner.strategy;

import X.AnonymousClass000;
import X.AnonymousClass1FY;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C23381Fv;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import X.C94434kc;
import X.C99594t9;
import com.whatsapp.conversation.banner.viewmodel.ConversationBannersViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.banner.strategy.AsyncBannerStrategy$initStrategy$1$1", f = "AsyncBannerStrategy.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
public final class AsyncBannerStrategy$initStrategy$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1FY $this_apply;
    public int label;
    public final /* synthetic */ C94434kc this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.banner.strategy.AsyncBannerStrategy$initStrategy$1$1$1", f = "AsyncBannerStrategy.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.banner.strategy.AsyncBannerStrategy$initStrategy$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                ConversationBannersViewModel conversationBannersViewModel = C94434kc.this.A00;
                if (conversationBannersViewModel == null) {
                    C18070vi.A11("conversationBannersViewModel");
                    throw null;
                }
                AnonymousClass1G1 r1 = conversationBannersViewModel.A04;
                C99594t9 r0 = C99594t9.A00;
                this.label = 1;
                if (r1.BFC(this, r0) == r3) {
                    return r3;
                }
            } else if (i != 1) {
                throw AnonymousClass000.A0l();
            } else {
                C30691eM.A01(obj);
            }
            throw AnonymousClass3MW.A13();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncBannerStrategy$initStrategy$1$1(AnonymousClass1FY r2, C94434kc r3, C30391dr r4) {
        super(2, r4);
        this.$this_apply = r2;
        this.this$0 = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AsyncBannerStrategy$initStrategy$1$1(this.$this_apply, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23381Fv lifecycle = this.$this_apply.getLifecycle();
            C23401Fx r3 = C23401Fx.STARTED;
            final C94434kc r2 = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A00(r3, lifecycle, this, r0) == r6) {
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
        return ((AsyncBannerStrategy$initStrategy$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
