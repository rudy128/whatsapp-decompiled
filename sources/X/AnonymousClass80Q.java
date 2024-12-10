package X;

import com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet;
import java.util.List;

/* renamed from: X.80Q  reason: invalid class name */
public final class AnonymousClass80Q extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CountrySelectorBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass80Q(CountrySelectorBottomSheet countrySelectorBottomSheet) {
        super(1);
        this.this$0 = countrySelectorBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C18070vi.A0d(list, 0);
        C111865kY r2 = this.this$0.A04;
        if (r2 != null && !list.isEmpty()) {
            r2.A02 = list;
            r2.A01 = list;
            ((C128386fu) list.get(0)).A00 = true;
            r2.A00 = (C128386fu) r2.A02.get(0);
            r2.A0W(list);
        }
        return C27621Wu.A00;
    }
}
