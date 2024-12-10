package X;

import com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public final class B1I extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ C179299Hk $displayContext;
    public final /* synthetic */ CatalogAllCategoryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1I(C179299Hk r2, CatalogAllCategoryViewModel catalogAllCategoryViewModel, UserJid userJid) {
        super(1);
        this.this$0 = catalogAllCategoryViewModel;
        this.$bizJid = userJid;
        this.$displayContext = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object r0;
        AnonymousClass9XA r8 = (AnonymousClass9XA) obj;
        C18070vi.A0d(r8, 0);
        if (r8 instanceof AnonymousClass8lS) {
            List<C195139sr> list = ((AnonymousClass8lS) r8).A01;
            AnonymousClass3MX.A1K(C108945cZ.A0Q(this.this$0.A09), 1);
            UserJid userJid = this.$bizJid;
            C179299Hk r5 = this.$displayContext;
            ArrayList A0D = C29351c6.A0D(list);
            for (C195139sr r2 : list) {
                int ordinal = r5.ordinal();
                if (ordinal == 1) {
                    r0 = new C169418lc(r2, userJid);
                } else if (ordinal == 0) {
                    r0 = new C169428ld(r2, userJid);
                } else {
                    throw AnonymousClass3MW.A14();
                }
                A0D.add(r0);
            }
            if (this.$displayContext.ordinal() == 1) {
                A0D = C29431cG.A0m(A0D);
                A0D.add(0, new AnonymousClass9XB(7));
            }
            C108945cZ.A0Q(this.this$0.A08).A0E(A0D);
        } else {
            AnonymousClass3MX.A1K(C108945cZ.A0Q(this.this$0.A09), 2);
        }
        return C27621Wu.A00;
    }
}
