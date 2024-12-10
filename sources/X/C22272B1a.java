package X;

import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.B1a  reason: case insensitive filesystem */
public final class C22272B1a extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ List $catalogCategoryGroups;
    public final /* synthetic */ Map $categoryParentToChildItemMap;
    public final /* synthetic */ CatalogCategoryGroupsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22272B1a(CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel, UserJid userJid, List list, Map map) {
        super(1);
        this.this$0 = catalogCategoryGroupsViewModel;
        this.$catalogCategoryGroups = list;
        this.$categoryParentToChildItemMap = map;
        this.$bizJid = userJid;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1DS r3;
        Object obj2;
        AnonymousClass9XA r9 = (AnonymousClass9XA) obj;
        C18070vi.A0d(r9, 0);
        if (r9 instanceof AnonymousClass8lT) {
            AnonymousClass3MY.A1M(this.this$0.A03, false);
            Map map = ((AnonymousClass8lT) r9).A01;
            Map map2 = this.$categoryParentToChildItemMap;
            UserJid userJid = this.$bizJid;
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                List<C195139sr> list = (List) A16.getValue();
                Object key = A16.getKey();
                ArrayList A0D = C29351c6.A0D(list);
                for (C195139sr r1 : list) {
                    A0D.add(new AnonymousClass8la(r1, userJid));
                }
                map2.put(key, A0D);
            }
            r3 = C108945cZ.A0Q(this.this$0.A06);
            obj2 = new C169518lo(this.$catalogCategoryGroups, this.$categoryParentToChildItemMap);
        } else {
            if (r9 instanceof AnonymousClass8lQ) {
                r3 = this.this$0.A03;
                obj2 = AnonymousClass000.A0i();
            }
            return C27621Wu.A00;
        }
        r3.A0E(obj2);
        return C27621Wu.A00;
    }
}
