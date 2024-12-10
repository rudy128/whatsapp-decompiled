package com.whatsapp.newsletter.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C111285jR;
import X.C1595885c;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.viewmodel.GetDirectoryCategoriesPreviewUseCase$receivedDirectoryCategories$1$1", f = "GetDirectoryCategoriesPreviewUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GetDirectoryCategoriesPreviewUseCase$receivedDirectoryCategories$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C1595885c $listener;
    public final /* synthetic */ List $sortedCategories;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetDirectoryCategoriesPreviewUseCase$receivedDirectoryCategories$1$1(C1595885c r2, List list, C30391dr r4) {
        super(2, r4);
        this.$listener = r2;
        this.$sortedCategories = list;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new GetDirectoryCategoriesPreviewUseCase$receivedDirectoryCategories$1$1(this.$listener, this.$sortedCategories, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C1595885c r2 = this.$listener;
            List list = this.$sortedCategories;
            C111285jR r22 = (C111285jR) r2;
            C18070vi.A0d(list, 0);
            r22.A0C.A0E(list);
            r22.A0B.A0E((Object) null);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetDirectoryCategoriesPreviewUseCase$receivedDirectoryCategories$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
