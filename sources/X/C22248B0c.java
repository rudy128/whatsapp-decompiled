package X;

import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.B0c  reason: case insensitive filesystem */
public final class C22248B0c extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ CatalogCategoryGroupsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22248B0c(CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel, UserJid userJid) {
        super(1);
        this.this$0 = catalogCategoryGroupsViewModel;
        this.$bizJid = userJid;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object r0;
        AnonymousClass9XA r9 = (AnonymousClass9XA) obj;
        C18070vi.A0d(r9, 0);
        if (r9 instanceof AnonymousClass8lS) {
            List<C195139sr> list = ((AnonymousClass8lS) r9).A01;
            UserJid userJid = this.$bizJid;
            ArrayList A0D = C29351c6.A0D(list);
            for (C195139sr r1 : list) {
                if (r1.A04) {
                    r0 = new AnonymousClass8la(r1, userJid);
                } else {
                    r0 = new AnonymousClass8lb(r1, userJid);
                }
                A0D.add(r0);
            }
            LinkedHashMap A13 = C17880vN.A13();
            for (C195139sr r12 : list) {
                if (!r12.A04) {
                    String str = r12.A01;
                    ArrayList A132 = AnonymousClass000.A13();
                    int i = 0;
                    do {
                        A132.add(new AnonymousClass9XB(4));
                        i++;
                    } while (i < 3);
                    A13.put(str, A132);
                }
            }
            C108945cZ.A0Q(this.this$0.A06).A0E(new AnonymousClass8lp(A0D, A13));
        }
        return C27621Wu.A00;
    }
}
