package com.whatsapp.conversation.conversationrow.components.contextcard;

import X.AnonymousClass000;
import X.AnonymousClass1F9;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass6Ph;
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

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.components.contextcard.InviteViaLinkButton$onAttachedToWindow$1$1", f = "InviteViaLinkButton.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
public final class InviteViaLinkButton$onAttachedToWindow$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1F9 $owner;
    public int label;
    public final /* synthetic */ AnonymousClass6Ph this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.conversationrow.components.contextcard.InviteViaLinkButton$onAttachedToWindow$1$1$1", f = "InviteViaLinkButton.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.conversationrow.components.contextcard.InviteViaLinkButton$onAttachedToWindow$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AnonymousClass1G1 r3 = AnonymousClass6Ph.this.getViewModel().A03;
                C147277Sn r0 = new C147277Sn(AnonymousClass6Ph.this, 13);
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
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteViaLinkButton$onAttachedToWindow$1$1(AnonymousClass1F9 r2, AnonymousClass6Ph r3, C30391dr r4) {
        super(2, r4);
        this.$owner = r2;
        this.this$0 = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new InviteViaLinkButton$onAttachedToWindow$1$1(this.$owner, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1F9 r4 = this.$owner;
            C23401Fx r3 = C23401Fx.STARTED;
            final AnonymousClass6Ph r2 = this.this$0;
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
        return ((InviteViaLinkButton$onAttachedToWindow$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
