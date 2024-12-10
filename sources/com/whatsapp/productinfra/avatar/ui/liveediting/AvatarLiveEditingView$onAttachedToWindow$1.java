package com.whatsapp.productinfra.avatar.ui.liveediting;

import X.AnonymousClass000;
import X.AnonymousClass1F9;
import X.AnonymousClass1OS;
import X.BIG;
import X.C18070vi;
import X.C22699BLb;
import X.C23401Fx;
import X.C23421Fz;
import X.C27189DXz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.ui.liveediting.AvatarLiveEditingView$onAttachedToWindow$1", f = "AvatarLiveEditingView.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarLiveEditingView$onAttachedToWindow$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1F9 $viewTreeOwner;
    public int label;
    public final /* synthetic */ BIG this$0;

    @DebugMetadata(c = "com.whatsapp.productinfra.avatar.ui.liveediting.AvatarLiveEditingView$onAttachedToWindow$1$1", f = "AvatarLiveEditingView.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.productinfra.avatar.ui.liveediting.AvatarLiveEditingView$onAttachedToWindow$1$1  reason: invalid class name */
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
                BIG big = BIG.this;
                C22699BLb bLb = big.A00;
                if (bLb == null) {
                    C18070vi.A11("viewModel");
                    throw null;
                }
                C23421Fz r2 = bLb.A0F;
                C27189DXz dXz = new C27189DXz(big, 17);
                this.label = 1;
                if (r2.BFC(this, dXz) == r5) {
                    return r5;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return C27621Wu.A00;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarLiveEditingView$onAttachedToWindow$1(AnonymousClass1F9 r2, BIG big, C30391dr r4) {
        super(2, r4);
        this.$viewTreeOwner = r2;
        this.this$0 = big;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarLiveEditingView$onAttachedToWindow$1(this.$viewTreeOwner, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1F9 r4 = this.$viewTreeOwner;
            C23401Fx r3 = C23401Fx.STARTED;
            final BIG big = this.this$0;
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
        return ((AvatarLiveEditingView$onAttachedToWindow$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
