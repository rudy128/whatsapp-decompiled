package com.whatsapp.pininchat.expirationDialog;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C111195io;
import X.C147317Sr;
import X.C18070vi;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import X.C99544t2;
import android.view.View;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment$addDialogContent$2$1", f = "PinInChatExpirationDialogFragment.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
public final class PinInChatExpirationDialogFragment$addDialogContent$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ View $dialogContentCustomView;
    public final /* synthetic */ PinInChatExpirationDialogFragment $this_run;
    public int label;
    public final /* synthetic */ PinInChatExpirationDialogFragment this$0;

    @DebugMetadata(c = "com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment$addDialogContent$2$1$1", f = "PinInChatExpirationDialogFragment.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment$addDialogContent$2$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            AnonymousClass1 r0 = new AnonymousClass1(view, pinInChatExpirationDialogFragment2, pinInChatExpirationDialogFragment3, r6);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                Object obj2 = this.L$0;
                PinInChatExpirationDialogFragment pinInChatExpirationDialogFragment = pinInChatExpirationDialogFragment2;
                C111195io r0 = pinInChatExpirationDialogFragment.A03;
                if (r0 == null) {
                    AnonymousClass3MW.A1H();
                    throw null;
                }
                AnonymousClass1G1 r02 = r0.A0A;
                C99544t2 r3 = new C99544t2(view, pinInChatExpirationDialogFragment3, pinInChatExpirationDialogFragment, obj2, 2);
                this.label = 1;
                if (r02.BFC(this, r3) == r2) {
                    return r2;
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
    public PinInChatExpirationDialogFragment$addDialogContent$2$1(View view, PinInChatExpirationDialogFragment pinInChatExpirationDialogFragment, PinInChatExpirationDialogFragment pinInChatExpirationDialogFragment2, C30391dr r5) {
        super(2, r5);
        this.$this_run = pinInChatExpirationDialogFragment;
        this.this$0 = pinInChatExpirationDialogFragment2;
        this.$dialogContentCustomView = view;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new PinInChatExpirationDialogFragment$addDialogContent$2$1(this.$dialogContentCustomView, this.$this_run, this.this$0, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r8 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            PinInChatExpirationDialogFragment pinInChatExpirationDialogFragment = this.$this_run;
            C18070vi.A0X(pinInChatExpirationDialogFragment);
            C23401Fx r5 = C23401Fx.RESUMED;
            final PinInChatExpirationDialogFragment pinInChatExpirationDialogFragment2 = this.$this_run;
            final PinInChatExpirationDialogFragment pinInChatExpirationDialogFragment3 = this.this$0;
            final View view = this.$dialogContentCustomView;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A01(r5, pinInChatExpirationDialogFragment, this, r0) == r8) {
                return r8;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PinInChatExpirationDialogFragment$addDialogContent$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
