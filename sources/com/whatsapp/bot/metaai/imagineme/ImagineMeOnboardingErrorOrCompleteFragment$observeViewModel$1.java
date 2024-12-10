package com.whatsapp.bot.metaai.imagineme;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C37801q9;
import X.C87334Ve;
import X.C99624tC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingErrorOrCompleteFragment$observeViewModel$1", f = "ImagineMeOnboardingErrorOrCompleteFragment.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
public final class ImagineMeOnboardingErrorOrCompleteFragment$observeViewModel$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ImagineMeOnboardingErrorOrCompleteFragment this$0;

    @DebugMetadata(c = "com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingErrorOrCompleteFragment$observeViewModel$1$1", f = "ImagineMeOnboardingErrorOrCompleteFragment.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingErrorOrCompleteFragment$observeViewModel$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AnonymousClass1G1 r2 = ((ImagineMeOnboardingViewModel) ImagineMeOnboardingErrorOrCompleteFragment.this.A01.getValue()).A0O;
                C99624tC A00 = C99624tC.A00(ImagineMeOnboardingErrorOrCompleteFragment.this, 19);
                this.label = 1;
                if (r2.BFC(this, A00) == r4) {
                    return r4;
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
    public ImagineMeOnboardingErrorOrCompleteFragment$observeViewModel$1(ImagineMeOnboardingErrorOrCompleteFragment imagineMeOnboardingErrorOrCompleteFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = imagineMeOnboardingErrorOrCompleteFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ImagineMeOnboardingErrorOrCompleteFragment$observeViewModel$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ImagineMeOnboardingErrorOrCompleteFragment$observeViewModel$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C37801q9 A1G = this.this$0.A1G();
            C23401Fx r3 = C23401Fx.STARTED;
            final ImagineMeOnboardingErrorOrCompleteFragment imagineMeOnboardingErrorOrCompleteFragment = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A01(r3, A1G, this, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
