package com.whatsapp.biz.catalog.view.activity;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C17890vO;
import X.C17900vP;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C19830z4;
import X.C21424Ajr;
import X.C23391Fw;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C72453Mb;
import com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel;
import com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel$shouldShowUpdatePostcodeTooltipOrBottomSheet$2;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.view.activity.CatalogListActivity$setUpdatePostcodeTooltipView$1", f = "CatalogListActivity.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
public final class CatalogListActivity$setUpdatePostcodeTooltipView$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CatalogListActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogListActivity$setUpdatePostcodeTooltipView$1(CatalogListActivity catalogListActivity, C30391dr r3) {
        super(2, r3);
        this.this$0 = catalogListActivity;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CatalogListActivity$setUpdatePostcodeTooltipView$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CatalogListActivity$setUpdatePostcodeTooltipView$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            CatalogListActivity catalogListActivity = this.this$0;
            PostcodeViewModel postcodeViewModel = catalogListActivity.A06;
            if (postcodeViewModel == null) {
                C18070vi.A11("postcodeViewModel");
                throw null;
            }
            UserJid A4f = catalogListActivity.A4f();
            this.label = 1;
            obj = C30451dy.A00(this, postcodeViewModel.A0F, new PostcodeViewModel$shouldShowUpdatePostcodeTooltipOrBottomSheet$2(postcodeViewModel, A4f, (C30391dr) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        if (AnonymousClass000.A1Y(obj) && ((C23391Fw) this.this$0.getLifecycle()).A02.A00(C23401Fx.STARTED)) {
            CatalogListActivity catalogListActivity2 = this.this$0;
            if (C18020vd.A05(C18040vf.A02, catalogListActivity2.A0E, 1534)) {
                CatalogListActivity.A0d(catalogListActivity2, false);
            } else if (C72453Mb.A0M(catalogListActivity2).getInt("product_share_tool_tip_show_count", 0) < 5 && catalogListActivity2.A08 != null) {
                catalogListActivity2.A05.A0K(new C21424Ajr(catalogListActivity2, 42), 1000);
                C19830z4 r1 = catalogListActivity2.A0A;
                int i2 = C17890vO.A0B(r1).getInt("product_share_tool_tip_show_count", 0) + 1;
                if (i2 >= 0) {
                    C17900vP.A0M(r1, "product_share_tool_tip_show_count", i2);
                    catalogListActivity2.A05.A0K(new C21424Ajr(catalogListActivity2, 43), 4500);
                } else {
                    throw AnonymousClass000.A0k("Show count must be greater than or equal to 0");
                }
            }
        }
        return C27621Wu.A00;
    }
}
