package com.whatsapp.updates.ui;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4FR;
import X.AnonymousClass4WB;
import X.AnonymousClass5WL;
import X.AnonymousClass5WO;
import X.C108585bw;
import X.C147277Sn;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C37801q9;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.ui.UpdatesFragment$observeSideEffects$1", f = "UpdatesFragment.kt", i = {}, l = {907}, m = "invokeSuspend", n = {}, s = {})
public final class UpdatesFragment$observeSideEffects$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ UpdatesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesFragment$observeSideEffects$1(UpdatesFragment updatesFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = updatesFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new UpdatesFragment$observeSideEffects$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new UpdatesFragment$observeSideEffects$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        UpdatesViewModel updatesViewModel;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            UpdatesFragment updatesFragment = this.this$0;
            if (updatesFragment.A1E && (updatesViewModel = updatesFragment.A0P) != null) {
                AnonymousClass5WO A01 = AnonymousClass4WB.A01((C108585bw) updatesViewModel.A0n.getValue());
                C37801q9 A1G = this.this$0.A1G();
                A1G.A00();
                AnonymousClass5WL A00 = AnonymousClass4FR.A00(C23401Fx.RESUMED, A1G.A00, A01);
                C147277Sn r0 = new C147277Sn(this.this$0, 33);
                this.label = 1;
                if (A00.BFC(this, r0) == r4) {
                    return r4;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
