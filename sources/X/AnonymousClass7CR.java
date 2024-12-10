package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer;

/* renamed from: X.7CR  reason: invalid class name */
public final class AnonymousClass7CR implements B7C {
    public final /* synthetic */ AnonymousClass1FL A00;
    public final /* synthetic */ FlowsWebBottomSheetContainer A01;
    public final /* synthetic */ String A02;

    public void C1u(C187669gB r6, boolean z) {
        if (C18070vi.A18(this.A02, r6.A03)) {
            AnonymousClass00H r0 = this.A01.A0H;
            if (r0 != null) {
                ((CatalogManager) r0.get()).A09.remove(this);
                AnonymousClass1FR r3 = (AnonymousClass1FR) this.A00;
                r3.CEx();
                if (z) {
                    r3.BhU(new Object[0], 2131887991, 2131887989);
                } else {
                    r3.BhQ(2131896261);
                }
            } else {
                C18070vi.A11("catalogManagerLazy");
                throw null;
            }
        }
    }

    public AnonymousClass7CR(AnonymousClass1FL r1, FlowsWebBottomSheetContainer flowsWebBottomSheetContainer, String str) {
        this.A02 = str;
        this.A01 = flowsWebBottomSheetContainer;
        this.A00 = r1;
    }
}
