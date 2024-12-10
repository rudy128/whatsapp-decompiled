package X;

import com.whatsapp.lists.home.ui.main.ListsHomeFragment;
import com.whatsapp.lists.home.ui.main.ListsHomeViewModel;
import com.whatsapp.lists.home.ui.main.ListsHomeViewModel$deleteList$1;

/* renamed from: X.5TD  reason: invalid class name */
public final class AnonymousClass5TD extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ListsHomeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5TD(ListsHomeFragment listsHomeFragment) {
        super(1);
        this.this$0 = listsHomeFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (AnonymousClass3MX.A1a((Boolean) obj)) {
            ListsHomeViewModel A0q = AnonymousClass3MX.A0q(this.this$0.A0A);
            Integer num = this.this$0.A07;
            C41761x1 r3 = A0q.A01;
            if (r3 != null) {
                AnonymousClass3MX.A1Q(new ListsHomeViewModel$deleteList$1(r3, A0q, num, (C30391dr) null), C41561wd.A00(A0q));
            }
        }
        return C27621Wu.A00;
    }
}
