package X;

import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import java.util.List;

/* renamed from: X.Axt  reason: case insensitive filesystem */
public final class C22115Axt extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CatalogListActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22115Axt(CatalogListActivity catalogListActivity) {
        super(1);
        this.this$0 = catalogListActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C167938i1 A4d = this.this$0.A4d();
        Boolean valueOf = Boolean.valueOf(C72463Mc.A1Y(obj));
        if (!C18070vi.A18(valueOf, A4d.A01)) {
            A4d.A01 = valueOf;
            List list = A4d.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i) instanceof C168738jb) {
                    A4d.A0G(i);
                }
            }
        }
        CatalogListActivity.A0c(this.this$0);
        return C27621Wu.A00;
    }
}
