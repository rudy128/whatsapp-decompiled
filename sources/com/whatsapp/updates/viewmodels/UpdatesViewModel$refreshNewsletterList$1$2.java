package com.whatsapp.updates.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass2DA;
import X.C143617Ec;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C37471pb;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.UpdatesViewModel$refreshNewsletterList$1$2", f = "UpdatesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UpdatesViewModel$refreshNewsletterList$1$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesViewModel$refreshNewsletterList$1$2(UpdatesViewModel updatesViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = updatesViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new UpdatesViewModel$refreshNewsletterList$1$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new UpdatesViewModel$refreshNewsletterList$1$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            UpdatesViewModel updatesViewModel = this.this$0;
            AnonymousClass2DA r3 = (AnonymousClass2DA) updatesViewModel.A0l.get();
            ((C37471pb) updatesViewModel.A0o.getValue()).A00(new C143617Ec(updatesViewModel, 6), r3);
            updatesViewModel.A01 = r3;
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
