package com.whatsapp.updates.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.C127986fG;
import X.C17890vO;
import X.C19830z4;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C72463Mc;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.UpdatesViewModel$refreshNuxSettings$3", f = "UpdatesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UpdatesViewModel$refreshNuxSettings$3 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesViewModel$refreshNuxSettings$3(UpdatesViewModel updatesViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = updatesViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new UpdatesViewModel$refreshNuxSettings$3(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new UpdatesViewModel$refreshNuxSettings$3(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C127986fG r3 = this.this$0.A0Y;
            C19830z4 r2 = r3.A00;
            if (AnonymousClass3MX.A1T(C17890vO.A0B(r2), "show_statuses_education") && r3.A01.A0I()) {
                r2.A16();
            }
            C72463Mc.A1B(this.this$0.A0Q);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
