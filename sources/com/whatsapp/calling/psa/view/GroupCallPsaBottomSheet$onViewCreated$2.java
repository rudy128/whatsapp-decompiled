package com.whatsapp.calling.psa.view;

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
import X.C87334Ve;
import X.C99624tC;
import com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet$onViewCreated$2", f = "GroupCallPsaBottomSheet.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
public final class GroupCallPsaBottomSheet$onViewCreated$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ GroupCallPsaBottomSheet this$0;

    @DebugMetadata(c = "com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet$onViewCreated$2$1", f = "GroupCallPsaBottomSheet.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet$onViewCreated$2$1  reason: invalid class name */
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
                AnonymousClass1G1 r2 = ((GroupCallPsaViewModel) GroupCallPsaBottomSheet.this.A04.getValue()).A05;
                C99624tC A00 = C99624tC.A00(GroupCallPsaBottomSheet.this, 32);
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
    public GroupCallPsaBottomSheet$onViewCreated$2(GroupCallPsaBottomSheet groupCallPsaBottomSheet, C30391dr r3) {
        super(2, r3);
        this.this$0 = groupCallPsaBottomSheet;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new GroupCallPsaBottomSheet$onViewCreated$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new GroupCallPsaBottomSheet$onViewCreated$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final GroupCallPsaBottomSheet groupCallPsaBottomSheet = this.this$0;
            C23401Fx r2 = C23401Fx.STARTED;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A01(r2, groupCallPsaBottomSheet, this, r0) == r5) {
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
