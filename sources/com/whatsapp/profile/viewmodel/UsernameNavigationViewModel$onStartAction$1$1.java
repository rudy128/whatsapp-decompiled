package com.whatsapp.profile.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.C18070vi;
import X.C23421Fz;
import X.C26067Crh;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C36001nB;
import X.C97424pS;
import X.C97444pU;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.viewmodel.UsernameNavigationViewModel$onStartAction$1$1", f = "UsernameNavigationViewModel.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameNavigationViewModel$onStartAction$1$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ UsernameNavigationViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.profile.viewmodel.UsernameNavigationViewModel$onStartAction$1$1$1", f = "UsernameNavigationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.profile.viewmodel.UsernameNavigationViewModel$onStartAction$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements C36001nB {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 r1 = new AnonymousClass1((C30391dr) obj3);
            r1.L$0 = obj;
            r1.L$1 = obj2;
            return r1.invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            if (this.label == 0) {
                C30691eM.A01(obj);
                Object obj3 = this.L$0;
                String str = (String) this.L$1;
                if (!C18070vi.A18(obj3, str)) {
                    int length = str.length();
                    UsernameNavigationViewModel usernameNavigationViewModel = UsernameNavigationViewModel.this;
                    if (length == 0) {
                        obj2 = C97424pS.A00;
                    } else {
                        obj2 = C97444pU.A00;
                    }
                    usernameNavigationViewModel.A0T(obj2);
                }
                return str;
            }
            throw AnonymousClass000.A0l();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameNavigationViewModel$onStartAction$1$1(UsernameNavigationViewModel usernameNavigationViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = usernameNavigationViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new UsernameNavigationViewModel$onStartAction$1$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new UsernameNavigationViewModel$onStartAction$1$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23421Fz A18 = AnonymousClass3MX.A18(this.this$0.A01.A05);
            final UsernameNavigationViewModel usernameNavigationViewModel = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C26067Crh.A01(this, r0, A18) == r5) {
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
