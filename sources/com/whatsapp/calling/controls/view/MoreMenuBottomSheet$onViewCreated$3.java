package com.whatsapp.calling.controls.view;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4FR;
import X.AnonymousClass4RC;
import X.AnonymousClass5WL;
import X.C18070vi;
import X.C23401Fx;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C37801q9;
import X.C99384sj;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.controls.view.MoreMenuBottomSheet$onViewCreated$3", f = "MoreMenuBottomSheet.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
public final class MoreMenuBottomSheet$onViewCreated$3 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ MoreMenuBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoreMenuBottomSheet$onViewCreated$3(MoreMenuBottomSheet moreMenuBottomSheet, C30391dr r3) {
        super(2, r3);
        this.this$0 = moreMenuBottomSheet;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MoreMenuBottomSheet$onViewCreated$3(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MoreMenuBottomSheet$onViewCreated$3(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            MoreMenuBottomSheet moreMenuBottomSheet = this.this$0;
            AnonymousClass4RC r0 = moreMenuBottomSheet.A04;
            if (r0 != null) {
                C23421Fz r2 = r0.A06;
                C37801q9 A1G = moreMenuBottomSheet.A1G();
                A1G.A00();
                AnonymousClass5WL A00 = AnonymousClass4FR.A00(C23401Fx.STARTED, A1G.A00, r2);
                C99384sj r02 = new C99384sj(this.this$0, 1);
                this.label = 1;
                if (A00.BFC(this, r02) == r4) {
                    return r4;
                }
            } else {
                C18070vi.A11("moreMenuStateHolder");
                throw null;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
