package com.whatsapp.biz.catalog.view.activity;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C23391Fw;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.view.activity.CatalogListActivity$onResume$1", f = "CatalogListActivity.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
public final class CatalogListActivity$onResume$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CatalogListActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogListActivity$onResume$1(CatalogListActivity catalogListActivity, C30391dr r3) {
        super(2, r3);
        this.this$0 = catalogListActivity;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CatalogListActivity$onResume$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CatalogListActivity$onResume$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            PostcodeViewModel postcodeViewModel = this.this$0.A06;
            if (postcodeViewModel == null) {
                C18070vi.A11("postcodeViewModel");
                throw null;
            }
            this.label = 1;
            obj = postcodeViewModel.A0T(this);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        if (!AnonymousClass000.A1Y(obj) && ((C23391Fw) this.this$0.getLifecycle()).A02.A00(C23401Fx.RESUMED)) {
            CatalogListActivity.A0Q(this.this$0);
        }
        return C27621Wu.A00;
    }
}
