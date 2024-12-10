package X;

import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.B0d  reason: case insensitive filesystem */
public final class C22249B0d extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ CatalogCategoryTabsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22249B0d(CatalogCategoryTabsViewModel catalogCategoryTabsViewModel, UserJid userJid) {
        super(1);
        this.this$0 = catalogCategoryTabsViewModel;
        this.$bizJid = userJid;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass9XA r9 = (AnonymousClass9XA) obj;
        C18070vi.A0d(r9, 0);
        if (r9 instanceof AnonymousClass8lS) {
            List<C195139sr> list = ((AnonymousClass8lS) r9).A01;
            AnonymousClass1DS A0Q = C108945cZ.A0Q(this.this$0.A04);
            UserJid userJid = this.$bizJid;
            ArrayList A0D = C29351c6.A0D(list);
            for (C195139sr r0 : list) {
                A0D.add(new C194889sS(userJid, r0.A02, r0.A01, r0.A04));
            }
            A0Q.A0E(A0D);
        }
        return C27621Wu.A00;
    }
}
