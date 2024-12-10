package com.whatsapp.updates.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass2HK;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.UpdatesViewModel$reportUpdatesTabOpened$3", f = "UpdatesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UpdatesViewModel$reportUpdatesTabOpened$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $items;
    public final /* synthetic */ AnonymousClass2HK $updatesTabOpenEvent;
    public int label;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesViewModel$reportUpdatesTabOpened$3(AnonymousClass2HK r2, UpdatesViewModel updatesViewModel, List list, C30391dr r5) {
        super(2, r5);
        this.this$0 = updatesViewModel;
        this.$updatesTabOpenEvent = r2;
        this.$items = list;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new UpdatesViewModel$reportUpdatesTabOpened$3(this.$updatesTabOpenEvent, this.this$0, this.$items, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            UpdatesViewModel.A07(this.$updatesTabOpenEvent, this.this$0, this.$items);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UpdatesViewModel$reportUpdatesTabOpened$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
